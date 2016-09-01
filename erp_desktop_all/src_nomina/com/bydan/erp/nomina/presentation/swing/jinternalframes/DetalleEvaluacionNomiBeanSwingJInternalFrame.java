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

import com.bydan.erp.nomina.util.DetalleEvaluacionNomiConstantesFunciones;
import com.bydan.erp.nomina.util.DetalleEvaluacionNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DetalleEvaluacionNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.DetalleEvaluacionNomiBean;
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
public class DetalleEvaluacionNomiBeanSwingJInternalFrame extends DetalleEvaluacionNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleEvaluacionNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleEvaluacionNomi> detalleevaluacionnomiValidator = new ClassValidator<DetalleEvaluacionNomi>(DetalleEvaluacionNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleEvaluacionNomi detalleevaluacionnomi;	
	public DetalleEvaluacionNomi detalleevaluacionnomiAux;
	public DetalleEvaluacionNomi detalleevaluacionnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleEvaluacionNomi detalleevaluacionnomiTotales;
	public Long idDetalleEvaluacionNomiActual;
	public Long iIdNuevoDetalleEvaluacionNomi=0L;
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

	public String sFinalQueryComboEvaluacionNomi="";

	public List<EvaluacionNomi> evaluacionnomisForeignKey;

	public List<EvaluacionNomi> getevaluacionnomisForeignKey() {
		return evaluacionnomisForeignKey;
	}

	public void setevaluacionnomisForeignKey(List<EvaluacionNomi> evaluacionnomisForeignKey) {
		this.evaluacionnomisForeignKey = evaluacionnomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public EvaluacionNomi evaluacionnomiForeignKey;

	public EvaluacionNomi getevaluacionnomiForeignKey() {
		return evaluacionnomiForeignKey;
	}

	public void setevaluacionnomiForeignKey(EvaluacionNomi evaluacionnomiForeignKey) {
		this.evaluacionnomiForeignKey = evaluacionnomiForeignKey;
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
	
	public Boolean isPermisoTodoDetalleEvaluacionNomi;
	public Boolean isPermisoNuevoDetalleEvaluacionNomi;
	public Boolean isPermisoActualizarDetalleEvaluacionNomi;
	public Boolean isPermisoActualizarOriginalDetalleEvaluacionNomi;
	public Boolean isPermisoEliminarDetalleEvaluacionNomi;
	public Boolean isPermisoGuardarCambiosDetalleEvaluacionNomi;
	public Boolean isPermisoConsultaDetalleEvaluacionNomi;
	public Boolean isPermisoBusquedaDetalleEvaluacionNomi;
	public Boolean isPermisoReporteDetalleEvaluacionNomi;
	public Boolean isPermisoPaginacionMedioDetalleEvaluacionNomi;
	public Boolean isPermisoPaginacionAltoDetalleEvaluacionNomi;
	public Boolean isPermisoPaginacionTodoDetalleEvaluacionNomi;
	public Boolean isPermisoCopiarDetalleEvaluacionNomi;
	public Boolean isPermisoVerFormDetalleEvaluacionNomi;
	public Boolean isPermisoDuplicarDetalleEvaluacionNomi;
	public Boolean isPermisoOrdenDetalleEvaluacionNomi;
	
	
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
	
	public DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiReturnGeneral;
	public DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleEvaluacionNomi=false;
	public Boolean esParaAccionDesdeFormularioDetalleEvaluacionNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleEvaluacionNomiSessionBeanAdditional detalleevaluacionnomiSessionBeanAdditional=null;
	
	public DetalleEvaluacionNomiSessionBeanAdditional getDetalleEvaluacionNomiSessionBeanAdditional() {
		return this.detalleevaluacionnomiSessionBeanAdditional;
	}
	
	public void setDetalleEvaluacionNomiSessionBeanAdditional(DetalleEvaluacionNomiSessionBeanAdditional detalleevaluacionnomiSessionBeanAdditional) {
		try {
			this.detalleevaluacionnomiSessionBeanAdditional=detalleevaluacionnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional detalleevaluacionnomiBeanSwingJInternalFrameAdditional=null;
	//public class DetalleEvaluacionNomiBeanSwingJInternalFrame
	
	public DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional getDetalleEvaluacionNomiBeanSwingJInternalFrameAdditional() {
		return this.detalleevaluacionnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleEvaluacionNomiBeanSwingJInternalFrameAdditional(DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional detalleevaluacionnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleevaluacionnomiBeanSwingJInternalFrameAdditional=detalleevaluacionnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleEvaluacionNomi detalleevaluacionnomiBean;
	public DetalleEvaluacionNomiConstantesFunciones detalleevaluacionnomiConstantesFunciones;
	//public DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EvaluacionNomiLogic evaluacionnomiLogic;
	public FormatoNomiLogic formatonomiLogic;
	public PreguntaNomiLogic preguntanomiLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleEvaluacionNomi> detalleevaluacionnomis;	
	//public List<DetalleEvaluacionNomi> detalleevaluacionnomisEliminados;
	//public List<DetalleEvaluacionNomi> detalleevaluacionnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaCopiarDetalleEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaVerFormDetalleEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaOrdenDetalleEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaCancelarDetalleEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEvaluacionNomi=false;
	public Boolean isVisibilidadFK_IdFormatoNomi=false;
	public Boolean isVisibilidadFK_IdPreguntaNomi=false;
	
	public Long getiIdNuevoDetalleEvaluacionNomi() {
		return this.iIdNuevoDetalleEvaluacionNomi;
	}

	public void setiIdNuevoDetalleEvaluacionNomi(Long iIdNuevoDetalleEvaluacionNomi) {
		this.iIdNuevoDetalleEvaluacionNomi = iIdNuevoDetalleEvaluacionNomi;
	}
	
	public Long getidDetalleEvaluacionNomiActual() {
		return this.idDetalleEvaluacionNomiActual;
	}

	public void setidDetalleEvaluacionNomiActual(Long idDetalleEvaluacionNomiActual) {
		this.idDetalleEvaluacionNomiActual = idDetalleEvaluacionNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleEvaluacionNomi getdetalleevaluacionnomi() {
		return this.detalleevaluacionnomi;
	}

	public void setdetalleevaluacionnomi(DetalleEvaluacionNomi detalleevaluacionnomi) {
		this.detalleevaluacionnomi = detalleevaluacionnomi;
	}
	
	public DetalleEvaluacionNomi getdetalleevaluacionnomiAux() {
		return this.detalleevaluacionnomiAux;
	}

	public void setdetalleevaluacionnomiAux(DetalleEvaluacionNomi detalleevaluacionnomiAux) {
		this.detalleevaluacionnomiAux = detalleevaluacionnomiAux;
	}				
	
	public DetalleEvaluacionNomi getdetalleevaluacionnomiAnterior() {
		return this.detalleevaluacionnomiAnterior;
	}

	public void setdetalleevaluacionnomiAnterior(DetalleEvaluacionNomi detalleevaluacionnomiAnterior) {
		this.detalleevaluacionnomiAnterior = detalleevaluacionnomiAnterior;
	}	
	
	public DetalleEvaluacionNomi getdetalleevaluacionnomiTotales() {
		return this.detalleevaluacionnomiTotales;
	}

	public void setdetalleevaluacionnomiTotales(DetalleEvaluacionNomi detalleevaluacionnomiTotales) {
		this.detalleevaluacionnomiTotales = detalleevaluacionnomiTotales;
	}	
	
	public DetalleEvaluacionNomi getdetalleevaluacionnomiBean() {
		return this.detalleevaluacionnomiBean;
	}

	public void setdetalleevaluacionnomiBean(DetalleEvaluacionNomi detalleevaluacionnomiBean) {
		this.detalleevaluacionnomiBean = detalleevaluacionnomiBean;
	}	
	
	public DetalleEvaluacionNomiParameterReturnGeneral getdetalleevaluacionnomiReturnGeneral() {
		return this.detalleevaluacionnomiReturnGeneral;
	}

	public void setdetalleevaluacionnomiReturnGeneral(DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiReturnGeneral) {
		this.detalleevaluacionnomiReturnGeneral = detalleevaluacionnomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_evaluacion_nomiFK_IdEvaluacionNomi=-1L;

	public Long getid_evaluacion_nomiFK_IdEvaluacionNomi() {
		return this.id_evaluacion_nomiFK_IdEvaluacionNomi;
	}

	public void setid_evaluacion_nomiFK_IdEvaluacionNomi(Long id_evaluacion_nomiFK_IdEvaluacionNomi) {
		this.id_evaluacion_nomiFK_IdEvaluacionNomi = id_evaluacion_nomiFK_IdEvaluacionNomi;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleEvaluacionNomiLogic getDetalleEvaluacionNomiLogic()	{		
		return detalleevaluacionnomiLogic;
	}

	public void setDetalleEvaluacionNomiLogic(DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic) {
		this.detalleevaluacionnomiLogic = detalleevaluacionnomiLogic;
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
	
	public Boolean getIsEsNuevoDetalleEvaluacionNomi() {
		return isEsNuevoDetalleEvaluacionNomi;
	}

	public void setIsEsNuevoDetalleEvaluacionNomi(Boolean isEsNuevoDetalleEvaluacionNomi) {
		this.isEsNuevoDetalleEvaluacionNomi = isEsNuevoDetalleEvaluacionNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleEvaluacionNomi() {
		return esParaAccionDesdeFormularioDetalleEvaluacionNomi;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleEvaluacionNomi(Boolean esParaAccionDesdeFormularioDetalleEvaluacionNomi) {
		this.esParaAccionDesdeFormularioDetalleEvaluacionNomi = esParaAccionDesdeFormularioDetalleEvaluacionNomi;
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

			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleevaluacionnomiSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEvaluacionNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.evaluacionnomisForeignKey=new ArrayList<EvaluacionNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EvaluacionNomiLogic evaluacionnomiLogic=new EvaluacionNomiLogic();

			//evaluacionnomiLogic.getEvaluacionNomiDataAccess().setIsForForeingKeyData(true);

			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionnomiLogic.getEvaluacionNomiDataAccess().setIsForForeingKeyData(true);

					evaluacionnomiLogic.getTodosEvaluacionNomisWithConnection(sFinalQuery,new Pagination());

					this.evaluacionnomisForeignKey=evaluacionnomiLogic.getEvaluacionNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEvaluacionNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEntityWithConnection(detalleevaluacionnomiSessionBean.getlidEvaluacionNomiActual());
					this.evaluacionnomisForeignKey.add(evaluacionnomiLogic.getEvaluacionNomi());
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

			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
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
					formatonomiLogic.getEntityWithConnection(detalleevaluacionnomiSessionBean.getlidFormatoNomiActual());
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

			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {
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
					preguntanomiLogic.getEntityWithConnection(detalleevaluacionnomiSessionBean.getlidPreguntaNomiActual());
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

					if(this.detalleevaluacionnomi!=null) {
						this.detalleevaluacionnomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_empresaDetalleEvaluacionNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleEvaluacionNomiGenerico!=null && jComboBoxid_empresaDetalleEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleEvaluacionNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEvaluacionNomiForeignKey(Long idEvaluacionNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EvaluacionNomi  evaluacionnomiTemp=null;

			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisForeignKey) {
				if(evaluacionnomiAux.getId()!=null && evaluacionnomiAux.getId().equals(idEvaluacionNomiSeleccionado)) {
					evaluacionnomiTemp=evaluacionnomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(evaluacionnomiTemp!=null) {

					if(this.detalleevaluacionnomi!=null) {
						this.detalleevaluacionnomi.setEvaluacionNomi(evaluacionnomiTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomiTemp);
					}
				} else {
					//jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomiTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(evaluacionnomiTemp!=null && jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi!=null) {
						jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomiTemp);
					} else {
						if(jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi!=null) {
							//jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomiTemp);
							if(jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setSelectedIndex(0);
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

	public String getActualEvaluacionNomiForeignKeyDescripcion(Long idEvaluacionNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EvaluacionNomi  evaluacionnomiTemp=null;

			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisForeignKey) {
				if(evaluacionnomiAux.getId()!=null && evaluacionnomiAux.getId().equals(idEvaluacionNomiSeleccionado)) {
					evaluacionnomiTemp=evaluacionnomiAux;
					break;
				}
			}


			sDescripcion=EvaluacionNomiConstantesFunciones.getEvaluacionNomiDescripcion(evaluacionnomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEvaluacionNomiForeignKeyGenerico(Long idEvaluacionNomiSeleccionado,JComboBox jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			EvaluacionNomi  evaluacionnomiTemp=null;

			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisForeignKey) {
				if(evaluacionnomiAux.getId()!=null && evaluacionnomiAux.getId().equals(idEvaluacionNomiSeleccionado)) {
					evaluacionnomiTemp=evaluacionnomiAux;
					break;
				}
			}

			if(evaluacionnomiTemp!=null) {
				jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico.setSelectedItem(evaluacionnomiTemp);
			} else {
				if(jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico!=null && jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.detalleevaluacionnomi!=null) {
						this.detalleevaluacionnomi.setFormatoNomi(formatonomiTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedItem(formatonomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedItem(formatonomiTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomiTemp!=null && jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi!=null) {
						jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setSelectedItem(formatonomiTemp);
					} else {
						if(jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi!=null) {
							//jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setSelectedItem(formatonomiTemp);
							if(jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualFormatoNomiForeignKeyGenerico(Long idFormatoNomiSeleccionado,JComboBox jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico.setSelectedItem(formatonomiTemp);
			} else {
				if(jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico!=null && jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.detalleevaluacionnomi!=null) {
						this.detalleevaluacionnomi.setPreguntaNomi(preguntanomiTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedItem(preguntanomiTemp);
					}
				} else {
					//jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedItem(preguntanomiTemp);
					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(preguntanomiTemp!=null && jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi!=null) {
						jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setSelectedItem(preguntanomiTemp);
					} else {
						if(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi!=null) {
							//jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setSelectedItem(preguntanomiTemp);
							if(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualPreguntaNomiForeignKeyGenerico(Long idPreguntaNomiSeleccionado,JComboBox jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico.setSelectedItem(preguntanomiTemp);
			} else {
				if(jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico!=null && jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleEvaluacionNomi detalleevaluacionnomi,JComboBox jComboBoxid_empresaDetalleEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleEvaluacionNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleEvaluacionNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleevaluacionnomi.setid_empresa(empresaAux.getId());
				detalleevaluacionnomi.setempresa_descripcion(DetalleEvaluacionNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleevaluacionnomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEvaluacionNomiForeignKey(DetalleEvaluacionNomi detalleevaluacionnomi,JComboBox jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			EvaluacionNomi  evaluacionnomiAux=new EvaluacionNomi();

			if(jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico==null) {
				evaluacionnomiAux=(EvaluacionNomi)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getSelectedItem();
			} else {
				evaluacionnomiAux=(EvaluacionNomi)jComboBoxid_evaluacion_nomiDetalleEvaluacionNomiGenerico.getSelectedItem();
			}

			if(evaluacionnomiAux!=null && evaluacionnomiAux.getId()!=null) {
				detalleevaluacionnomi.setid_evaluacion_nomi(evaluacionnomiAux.getId());
				detalleevaluacionnomi.setevaluacionnomi_descripcion(DetalleEvaluacionNomiConstantesFunciones.getEvaluacionNomiDescripcion(evaluacionnomiAux));
				detalleevaluacionnomi.setEvaluacionNomi(evaluacionnomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiForeignKey(DetalleEvaluacionNomi detalleevaluacionnomi,JComboBox jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiAux=new FormatoNomi();

			if(jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico==null) {
				formatonomiAux=(FormatoNomi)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.getSelectedItem();
			} else {
				formatonomiAux=(FormatoNomi)jComboBoxid_formato_nomiDetalleEvaluacionNomiGenerico.getSelectedItem();
			}

			if(formatonomiAux!=null && formatonomiAux.getId()!=null) {
				detalleevaluacionnomi.setid_formato_nomi(formatonomiAux.getId());
				detalleevaluacionnomi.setformatonomi_descripcion(DetalleEvaluacionNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiAux));
				detalleevaluacionnomi.setFormatoNomi(formatonomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPreguntaNomiForeignKey(DetalleEvaluacionNomi detalleevaluacionnomi,JComboBox jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			PreguntaNomi  preguntanomiAux=new PreguntaNomi();

			if(jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico==null) {
				preguntanomiAux=(PreguntaNomi)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getSelectedItem();
			} else {
				preguntanomiAux=(PreguntaNomi)jComboBoxid_pregunta_nomiDetalleEvaluacionNomiGenerico.getSelectedItem();
			}

			if(preguntanomiAux!=null && preguntanomiAux.getId()!=null) {
				detalleevaluacionnomi.setid_pregunta_nomi(preguntanomiAux.getId());
				detalleevaluacionnomi.setpreguntanomi_descripcion(DetalleEvaluacionNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomiAux));
				detalleevaluacionnomi.setPreguntaNomi(preguntanomiAux);			}
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

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
					}

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEvaluacionNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEvaluacionNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.removeAllItems();

							for(EvaluacionNomi evaluacionnomi:this.evaluacionnomisForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.addItem(evaluacionnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
					}

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.removeAllItems();

							for(EvaluacionNomi evaluacionnomi:this.evaluacionnomisForeignKey) {
								this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.addItem(evaluacionnomi);
							}
						}

						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.addItem(formatonomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
					}

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.addItem(formatonomi);
							}
						}

						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.removeAllItems();

							for(PreguntaNomi preguntanomi:this.preguntanomisForeignKey) {
								this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.addItem(preguntanomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { 
					}

					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.removeAllItems();

							for(PreguntaNomi preguntanomi:this.preguntanomisForeignKey) {
								this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.addItem(preguntanomi);
							}
						}

						if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEvaluacionNomiForeignKey(EvaluacionNomi evaluacionnomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setSelectedItem(evaluacionnomi);
						} else {
							this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedItem(formatonomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setSelectedItem(formatonomi);
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedItem(preguntanomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setSelectedItem(preguntanomi);
						} else {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleEvaluacionNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleEvaluacionNomiConstantesFunciones.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleEvaluacionNomiConstantesFunciones.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi(this.detalleevaluacionnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(EvaluacionNomi.class));
		classes.add(new Classe(FormatoNomi.class));
		classes.add(new Classe(PreguntaNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(this.detalleevaluacionnomis);
			detalleevaluacionnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleEvaluacionNomiParameterReturnGeneral getDetalleEvaluacionNomiParameterGeneral() {
		return this.detalleevaluacionnomiParameterGeneral;
	}
	
	public void setDetalleEvaluacionNomiParameterGeneral(DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiParameterGeneral) {
		this.detalleevaluacionnomiParameterGeneral = detalleevaluacionnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleEvaluacionNomi() {
		return isPermisoTodoDetalleEvaluacionNomi;
	}

	public void setIsPermisoTodoDetalleEvaluacionNomi(Boolean isPermisoTodoDetalleEvaluacionNomi) {
		this.isPermisoTodoDetalleEvaluacionNomi = isPermisoTodoDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoNuevoDetalleEvaluacionNomi() {
		return isPermisoNuevoDetalleEvaluacionNomi;
	}

	public void setIsPermisoNuevoDetalleEvaluacionNomi(Boolean isPermisoNuevoDetalleEvaluacionNomi) {
		this.isPermisoNuevoDetalleEvaluacionNomi = isPermisoNuevoDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoActualizarDetalleEvaluacionNomi() {
		return isPermisoActualizarDetalleEvaluacionNomi;
	}

	public void setIsPermisoActualizarDetalleEvaluacionNomi(Boolean isPermisoActualizarDetalleEvaluacionNomi) {
		this.isPermisoActualizarDetalleEvaluacionNomi = isPermisoActualizarDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoEliminarDetalleEvaluacionNomi() {
		return isPermisoEliminarDetalleEvaluacionNomi;
	}

	public void setIsPermisoEliminarDetalleEvaluacionNomi(Boolean isPermisoEliminarDetalleEvaluacionNomi) {
		this.isPermisoEliminarDetalleEvaluacionNomi = isPermisoEliminarDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleEvaluacionNomi() {
		return isPermisoGuardarCambiosDetalleEvaluacionNomi;
	}

	public void setIsPermisoGuardarCambiosDetalleEvaluacionNomi(Boolean isPermisoGuardarCambiosDetalleEvaluacionNomi) {
		this.isPermisoGuardarCambiosDetalleEvaluacionNomi = isPermisoGuardarCambiosDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoConsultaDetalleEvaluacionNomi() {
		return isPermisoConsultaDetalleEvaluacionNomi;
	}

	public void setIsPermisoConsultaDetalleEvaluacionNomi(Boolean isPermisoConsultaDetalleEvaluacionNomi) {
		this.isPermisoConsultaDetalleEvaluacionNomi = isPermisoConsultaDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoBusquedaDetalleEvaluacionNomi() {
		return isPermisoBusquedaDetalleEvaluacionNomi;
	}

	public void setIsPermisoBusquedaDetalleEvaluacionNomi(Boolean isPermisoBusquedaDetalleEvaluacionNomi) {
		this.isPermisoBusquedaDetalleEvaluacionNomi = isPermisoBusquedaDetalleEvaluacionNomi;
	}

	public Boolean getIsPermisoReporteDetalleEvaluacionNomi() {
		return isPermisoReporteDetalleEvaluacionNomi;
	}

	public void setIsPermisoReporteDetalleEvaluacionNomi(Boolean isPermisoReporteDetalleEvaluacionNomi) {
		this.isPermisoReporteDetalleEvaluacionNomi = isPermisoReporteDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleEvaluacionNomi() {
		return isPermisoPaginacionMedioDetalleEvaluacionNomi;
	}

	public void setIsPermisoPaginacionMedioDetalleEvaluacionNomi(Boolean isPermisoPaginacionMedioDetalleEvaluacionNomi) {
		this.isPermisoPaginacionMedioDetalleEvaluacionNomi = isPermisoPaginacionMedioDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleEvaluacionNomi() {
		return isPermisoPaginacionTodoDetalleEvaluacionNomi;
	}

	public void setIsPermisoPaginacionTodoDetalleEvaluacionNomi(Boolean isPermisoPaginacionTodoDetalleEvaluacionNomi) {
		this.isPermisoPaginacionTodoDetalleEvaluacionNomi = isPermisoPaginacionTodoDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleEvaluacionNomi() {
		return isPermisoPaginacionAltoDetalleEvaluacionNomi;
	}

	public void setIsPermisoPaginacionAltoDetalleEvaluacionNomi(Boolean isPermisoPaginacionAltoDetalleEvaluacionNomi) {
		this.isPermisoPaginacionAltoDetalleEvaluacionNomi = isPermisoPaginacionAltoDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoCopiarDetalleEvaluacionNomi() {
		return isPermisoCopiarDetalleEvaluacionNomi;
	}

	public void setIsPermisoCopiarDetalleEvaluacionNomi(Boolean isPermisoCopiarDetalleEvaluacionNomi) {
		this.isPermisoCopiarDetalleEvaluacionNomi = isPermisoCopiarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoVerFormDetalleEvaluacionNomi() {
		return isPermisoVerFormDetalleEvaluacionNomi;
	}

	public void setIsPermisoVerFormDetalleEvaluacionNomi(Boolean isPermisoVerFormDetalleEvaluacionNomi) {
		this.isPermisoVerFormDetalleEvaluacionNomi = isPermisoVerFormDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoDuplicarDetalleEvaluacionNomi() {
		return isPermisoDuplicarDetalleEvaluacionNomi;
	}

	public void setIsPermisoDuplicarDetalleEvaluacionNomi(Boolean isPermisoDuplicarDetalleEvaluacionNomi) {
		this.isPermisoDuplicarDetalleEvaluacionNomi = isPermisoDuplicarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsPermisoOrdenDetalleEvaluacionNomi() {
		return isPermisoOrdenDetalleEvaluacionNomi;
	}

	public void setIsPermisoOrdenDetalleEvaluacionNomi(Boolean isPermisoOrdenDetalleEvaluacionNomi) {
		this.isPermisoOrdenDetalleEvaluacionNomi = isPermisoOrdenDetalleEvaluacionNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleEvaluacionNomi() {
		return isVisibilidadCeldaNuevoDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaNuevoDetalleEvaluacionNomi(Boolean isVisibilidadCeldaNuevoDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi = isVisibilidadCeldaNuevoDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaDuplicarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaDuplicarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi = isVisibilidadCeldaDuplicarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaCopiarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaCopiarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaCopiarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi = isVisibilidadCeldaCopiarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleEvaluacionNomi() {
		return isVisibilidadCeldaVerFormDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaVerFormDetalleEvaluacionNomi(Boolean isVisibilidadCeldaVerFormDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi = isVisibilidadCeldaVerFormDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleEvaluacionNomi() {
		return isVisibilidadCeldaOrdenDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaOrdenDetalleEvaluacionNomi(Boolean isVisibilidadCeldaOrdenDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi = isVisibilidadCeldaOrdenDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi() {
		return isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi(Boolean isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi = isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaModificarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaModificarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaModificarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaModificarDetalleEvaluacionNomi = isVisibilidadCeldaModificarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaActualizarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaActualizarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaActualizarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi = isVisibilidadCeldaActualizarDetalleEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaEliminarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaEliminarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaEliminarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi = isVisibilidadCeldaEliminarDetalleEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaCancelarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaCancelarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaCancelarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi = isVisibilidadCeldaCancelarDetalleEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleEvaluacionNomi() {
		return isVisibilidadCeldaGuardarDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaGuardarDetalleEvaluacionNomi(Boolean isVisibilidadCeldaGuardarDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi = isVisibilidadCeldaGuardarDetalleEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi() {
		return isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi(Boolean isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi) {
		this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi = isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi;
	}
		
	public DetalleEvaluacionNomiSessionBean getdetalleevaluacionnomiSessionBean() {
		return this.detalleevaluacionnomiSessionBean;
	}
	
	public void setdetalleevaluacionnomiSessionBean(DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean) {
		this.detalleevaluacionnomiSessionBean=detalleevaluacionnomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEvaluacionNomi() {
		return this.isVisibilidadFK_IdEvaluacionNomi;
	}

	public void setisVisibilidadFK_IdEvaluacionNomi(Boolean isVisibilidadFK_IdEvaluacionNomi) {
		this.isVisibilidadFK_IdEvaluacionNomi=isVisibilidadFK_IdEvaluacionNomi;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleevaluacionnomi,null);
				this.setActualParaGuardarEvaluacionNomiForeignKey(detalleevaluacionnomi,null);
				this.setActualParaGuardarFormatoNomiForeignKey(detalleevaluacionnomi,null);
				this.setActualParaGuardarPreguntaNomiForeignKey(detalleevaluacionnomi,null);
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
	
	public void bugActualizarReferenciaActual(DetalleEvaluacionNomi detalleevaluacionnomi,DetalleEvaluacionNomi detalleevaluacionnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleEvaluacionNomi(detalleevaluacionnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleevaluacionnomiAux.setId(detalleevaluacionnomi.getId());
		detalleevaluacionnomiAux.setVersionRow(detalleevaluacionnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleEvaluacionNomi();
		
			int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleevaluacionnomiValidator.getInvalidValues(this.detalleevaluacionnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleevaluacionnomiLogic.setDatosCliente(datosCliente);
			detalleevaluacionnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleevaluacionnomiAux=new  DetalleEvaluacionNomi();
				
				detalleevaluacionnomiAux.setIsNew(true);
				detalleevaluacionnomiAux.setIsChanged(true);
				
				detalleevaluacionnomiAux.setDetalleEvaluacionNomiOriginal(this.detalleevaluacionnomi);
				
				detalleevaluacionnomiAux.setId(this.detalleevaluacionnomi.getId());	
				detalleevaluacionnomiAux.setVersionRow(this.detalleevaluacionnomi.getVersionRow());	
				detalleevaluacionnomiAux.setid_empresa(this.detalleevaluacionnomi.getid_empresa());	
				detalleevaluacionnomiAux.setid_evaluacion_nomi(this.detalleevaluacionnomi.getid_evaluacion_nomi());	
				detalleevaluacionnomiAux.setid_formato_nomi(this.detalleevaluacionnomi.getid_formato_nomi());	
				detalleevaluacionnomiAux.setid_pregunta_nomi(this.detalleevaluacionnomi.getid_pregunta_nomi());	
				detalleevaluacionnomiAux.setrespuesta(this.detalleevaluacionnomi.getrespuesta());	
				detalleevaluacionnomiAux.setrespuesta_valor(this.detalleevaluacionnomi.getrespuesta_valor());	
				detalleevaluacionnomiAux.setcalifica1(this.detalleevaluacionnomi.getcalifica1());	
				detalleevaluacionnomiAux.setcalifica2(this.detalleevaluacionnomi.getcalifica2());	
				detalleevaluacionnomiAux.setcalifica3(this.detalleevaluacionnomi.getcalifica3());	
				detalleevaluacionnomiAux.setcalifica4(this.detalleevaluacionnomi.getcalifica4());	
				detalleevaluacionnomiAux.setcalifica5(this.detalleevaluacionnomi.getcalifica5());	
				detalleevaluacionnomiAux.setcalifica6(this.detalleevaluacionnomi.getcalifica6());	
				detalleevaluacionnomiAux.setcalifica7(this.detalleevaluacionnomi.getcalifica7());	
				detalleevaluacionnomiAux.setcalifica8(this.detalleevaluacionnomi.getcalifica8());	
				detalleevaluacionnomiAux.setcalifica9(this.detalleevaluacionnomi.getcalifica9());	
				detalleevaluacionnomiAux.setcalifica10(this.detalleevaluacionnomi.getcalifica10());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.saveDetalleEvaluacionNomis();//WithConnection
						//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);
					
					this.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionnomiLogic.saveDetalleEvaluacionNomiRelaciones(detalleevaluacionnomiAux);//WithConnection
								//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleevaluacionnomiAux=new  DetalleEvaluacionNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && this.detalleevaluacionnomi.getId()>=0)) {
						
					detalleevaluacionnomiAux.setIsNew(false);
				}
				
				detalleevaluacionnomiAux.setIsDeleted(false);
			
				detalleevaluacionnomiAux.setId(this.detalleevaluacionnomi.getId());	
				detalleevaluacionnomiAux.setVersionRow(this.detalleevaluacionnomi.getVersionRow());	
				detalleevaluacionnomiAux.setid_empresa(this.detalleevaluacionnomi.getid_empresa());	
				detalleevaluacionnomiAux.setid_evaluacion_nomi(this.detalleevaluacionnomi.getid_evaluacion_nomi());	
				detalleevaluacionnomiAux.setid_formato_nomi(this.detalleevaluacionnomi.getid_formato_nomi());	
				detalleevaluacionnomiAux.setid_pregunta_nomi(this.detalleevaluacionnomi.getid_pregunta_nomi());	
				detalleevaluacionnomiAux.setrespuesta(this.detalleevaluacionnomi.getrespuesta());	
				detalleevaluacionnomiAux.setrespuesta_valor(this.detalleevaluacionnomi.getrespuesta_valor());	
				detalleevaluacionnomiAux.setcalifica1(this.detalleevaluacionnomi.getcalifica1());	
				detalleevaluacionnomiAux.setcalifica2(this.detalleevaluacionnomi.getcalifica2());	
				detalleevaluacionnomiAux.setcalifica3(this.detalleevaluacionnomi.getcalifica3());	
				detalleevaluacionnomiAux.setcalifica4(this.detalleevaluacionnomi.getcalifica4());	
				detalleevaluacionnomiAux.setcalifica5(this.detalleevaluacionnomi.getcalifica5());	
				detalleevaluacionnomiAux.setcalifica6(this.detalleevaluacionnomi.getcalifica6());	
				detalleevaluacionnomiAux.setcalifica7(this.detalleevaluacionnomi.getcalifica7());	
				detalleevaluacionnomiAux.setcalifica8(this.detalleevaluacionnomi.getcalifica8());	
				detalleevaluacionnomiAux.setcalifica9(this.detalleevaluacionnomi.getcalifica9());	
				detalleevaluacionnomiAux.setcalifica10(this.detalleevaluacionnomi.getcalifica10());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.saveDetalleEvaluacionNomis();//WithConnection
						//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);
					
					this.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionnomiLogic.saveDetalleEvaluacionNomiRelaciones(detalleevaluacionnomiAux);//WithConnection
								//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleevaluacionnomi,detalleevaluacionnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleevaluacionnomiAux=new  DetalleEvaluacionNomi();
				
				detalleevaluacionnomiAux.setIsNew(false);
				detalleevaluacionnomiAux.setIsChanged(false);
				
				detalleevaluacionnomiAux.setIsDeleted(true);
				
				detalleevaluacionnomiAux.setId(this.detalleevaluacionnomi.getId());	
				detalleevaluacionnomiAux.setVersionRow(this.detalleevaluacionnomi.getVersionRow());	
				detalleevaluacionnomiAux.setid_empresa(this.detalleevaluacionnomi.getid_empresa());	
				detalleevaluacionnomiAux.setid_evaluacion_nomi(this.detalleevaluacionnomi.getid_evaluacion_nomi());	
				detalleevaluacionnomiAux.setid_formato_nomi(this.detalleevaluacionnomi.getid_formato_nomi());	
				detalleevaluacionnomiAux.setid_pregunta_nomi(this.detalleevaluacionnomi.getid_pregunta_nomi());	
				detalleevaluacionnomiAux.setrespuesta(this.detalleevaluacionnomi.getrespuesta());	
				detalleevaluacionnomiAux.setrespuesta_valor(this.detalleevaluacionnomi.getrespuesta_valor());	
				detalleevaluacionnomiAux.setcalifica1(this.detalleevaluacionnomi.getcalifica1());	
				detalleevaluacionnomiAux.setcalifica2(this.detalleevaluacionnomi.getcalifica2());	
				detalleevaluacionnomiAux.setcalifica3(this.detalleevaluacionnomi.getcalifica3());	
				detalleevaluacionnomiAux.setcalifica4(this.detalleevaluacionnomi.getcalifica4());	
				detalleevaluacionnomiAux.setcalifica5(this.detalleevaluacionnomi.getcalifica5());	
				detalleevaluacionnomiAux.setcalifica6(this.detalleevaluacionnomi.getcalifica6());	
				detalleevaluacionnomiAux.setcalifica7(this.detalleevaluacionnomi.getcalifica7());	
				detalleevaluacionnomiAux.setcalifica8(this.detalleevaluacionnomi.getcalifica8());	
				detalleevaluacionnomiAux.setcalifica9(this.detalleevaluacionnomi.getcalifica9());	
				detalleevaluacionnomiAux.setcalifica10(this.detalleevaluacionnomi.getcalifica10());	
				
				if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleevaluacionnomiAux.getId()>=0) {	
						this.detalleevaluacionnomisEliminados.add(detalleevaluacionnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.saveDetalleEvaluacionNomis();//WithConnection
						//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleevaluacionnomiLogic.saveDetalleEvaluacionNomiRelaciones(detalleevaluacionnomiAux);//WithConnection
								//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
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
							if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleevaluacionnomiAux,detalleevaluacionnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.detalleevaluacionnomisEliminados);
					
					detalleevaluacionnomiLogic.saveDetalleEvaluacionNomis();//WithConnection
					//detalleevaluacionnomiLogic.getSetVersionRowDetalleEvaluacionNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi();
				
				this.detalleevaluacionnomisEliminados= new ArrayList<DetalleEvaluacionNomi>();		
			}
			
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Evaluacion Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleevaluacionnomi=detalleevaluacionnomiAux;
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
      		//this.finishProcessDetalleEvaluacionNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleEvaluacionNomi detalleevaluacionnomiLocal) throws Exception {
		
		if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleEvaluacionNomi detalleevaluacionnomiLocal) throws Exception {	
		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleevaluacionnomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EvaluacionNomiDetalleFormJInternalFrame.class)) {
				EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrameLocal=(EvaluacionNomiBeanSwingJInternalFrame) ((EvaluacionNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				evaluacionnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEvaluacionNomi(evaluacionnomiBeanSwingJInternalFrameLocal.getevaluacionnomi(),true);
				evaluacionnomiBeanSwingJInternalFrameLocal.actualizarLista(evaluacionnomiBeanSwingJInternalFrameLocal.evaluacionnomi,this.evaluacionnomisForeignKey);

				evaluacionnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(evaluacionnomiBeanSwingJInternalFrameLocal.evaluacionnomi);

				detalleevaluacionnomiLocal.setEvaluacionNomi(evaluacionnomiBeanSwingJInternalFrameLocal.evaluacionnomi);

				this.addItemDefectoCombosForeignKeyEvaluacionNomi();
				this.cargarCombosFrameEvaluacionNomisForeignKey("Formulario");
				this.setActualEvaluacionNomiForeignKey(evaluacionnomiBeanSwingJInternalFrameLocal.evaluacionnomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrameLocal=(FormatoNomiBeanSwingJInternalFrame) ((FormatoNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.getformatonomi(),true);
				formatonomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomiBeanSwingJInternalFrameLocal.formatonomi,this.formatonomisForeignKey);

				formatonomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				detalleevaluacionnomiLocal.setFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey("Formulario");
				this.setActualFormatoNomiForeignKey(formatonomiBeanSwingJInternalFrameLocal.formatonomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PreguntaNomiDetalleFormJInternalFrame.class)) {
				PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrameLocal=(PreguntaNomiBeanSwingJInternalFrame) ((PreguntaNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				preguntanomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPreguntaNomi(preguntanomiBeanSwingJInternalFrameLocal.getpreguntanomi(),true);
				preguntanomiBeanSwingJInternalFrameLocal.actualizarLista(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi,this.preguntanomisForeignKey);

				preguntanomiBeanSwingJInternalFrameLocal.actualizarRelaciones(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi);

				detalleevaluacionnomiLocal.setPreguntaNomi(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi);

				this.addItemDefectoCombosForeignKeyPreguntaNomi();
				this.cargarCombosFramePreguntaNomisForeignKey("Formulario");
				this.setActualPreguntaNomiForeignKey(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleEvaluacionNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleevaluacionnomiValidator.getInvalidValues(this.detalleevaluacionnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleEvaluacionNomi detalleevaluacionnomi,List<DetalleEvaluacionNomi> detalleevaluacionnomis) throws Exception {
		try	{		
			DetalleEvaluacionNomiConstantesFunciones.actualizarLista(detalleevaluacionnomi,detalleevaluacionnomis,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleEvaluacionNomi detalleevaluacionnomi,List<DetalleEvaluacionNomi> detalleevaluacionnomis) throws Exception {
		try	{			
			DetalleEvaluacionNomiConstantesFunciones.actualizarSelectedLista(detalleevaluacionnomi,detalleevaluacionnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleEvaluacionNomi> detalleevaluacionnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleevaluacionnomisLocal=this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleevaluacionnomisLocal=this.detalleevaluacionnomis;
			}
			//ARCHITECTURE
		
			for(DetalleEvaluacionNomi detalleevaluacionnomiLocal:detalleevaluacionnomisLocal) {
				if(this.permiteMantenimiento(detalleevaluacionnomiLocal) && detalleevaluacionnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.getDetalleEvaluacionNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_empresaDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.IDEVALUACIONNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_evaluacion_nomiDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.IDFORMATONOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_formato_nomiDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.IDPREGUNTANOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_pregunta_nomiDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.RESPUESTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuestaDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.RESPUESTAVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuesta_valorDetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica1DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica2DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica3DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica4DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica5DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA6)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica6DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA7)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica7DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA8)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica8DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA9)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica9DetalleEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleEvaluacionNomiConstantesFunciones.CALIFICA10)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica10DetalleEvaluacionNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_empresaDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_evaluacion_nomiDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_formato_nomiDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelid_pregunta_nomiDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuestaDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuesta_valorDetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica1DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica2DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica3DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica4DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica5DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica6DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica7DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica8DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica9DetalleEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica10DetalleEvaluacionNomi,"");
		
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
		this.iIdNuevoDetalleEvaluacionNomi--;	
		
		
		this.detalleevaluacionnomiAux=new DetalleEvaluacionNomi();
		
		this.detalleevaluacionnomiAux.setId(this.iIdNuevoDetalleEvaluacionNomi);
		this.detalleevaluacionnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().add(this.detalleevaluacionnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleevaluacionnomis.add(this.detalleevaluacionnomiAux);
		}
		//ARCHITECTURE
		
		this.detalleevaluacionnomi=this.detalleevaluacionnomiAux;
		
		if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionNomi(this.detalleevaluacionnomi);
		}
				
		//this.setDefaultControlesDetalleEvaluacionNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleEvaluacionNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomiBean,this.detalleevaluacionnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
			classes=DetalleEvaluacionNomiConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.procesarEventosDetalleEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this.detalleevaluacionnomi,this.detalleevaluacionnomiParameterGeneral,this.isEsNuevoDetalleEvaluacionNomi,classes);//this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral,this.detalleevaluacionnomiBean,false);
		
		if(this.detalleevaluacionnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi());
		}
		
		if(this.detalleevaluacionnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi(),classes);//this.detalleevaluacionnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleEvaluacionNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleEvaluacionNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.RecargarFormDetalleEvaluacionNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
						
			if(detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();
			}
			
			this.actualizarVisualTableDatosDetalleEvaluacionNomi();
			
			this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionNomi(), this.getIndiceNuevoDetalleEvaluacionNomi());
			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
						
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleEvaluacionNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarrespuestaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarrespuesta_valorDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica1DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica2DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica3DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica4DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica5DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica6DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica7DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica8DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica9DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarcalifica10DetalleEvaluacionNomi);	
		//
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarid_empresaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarid_evaluacion_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarid_formato_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setEnabled(isHabilitar && this.detalleevaluacionnomiConstantesFunciones.activarid_pregunta_nomiDetalleEvaluacionNomi);
	};
	
	public void setDefaultControlesDetalleEvaluacionNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(true);			
			this.detalleevaluacionnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.setVisible(true);
			
					
		} else {
			//this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);			
			this.detalleevaluacionnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleEvaluacionNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				if(detalleevaluacionnomiAux.getId().equals(this.iIdNuevoDetalleEvaluacionNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomis) {
				if(detalleevaluacionnomiAux.getId().equals(this.iIdNuevoDetalleEvaluacionNomi)) {
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
	
	public int getIndiceActualDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				if(detalleevaluacionnomiAux.getId().equals(detalleevaluacionnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomis) {
				if(detalleevaluacionnomiAux.getId().equals(detalleevaluacionnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				if(detalleevaluacionnomiAux.getDetalleEvaluacionNomiOriginal().getId().equals(detalleevaluacionnomiOriginal.getId())) {
					existe=true;
					detalleevaluacionnomiOriginal.setId(detalleevaluacionnomiAux.getId());
					detalleevaluacionnomiOriginal.setVersionRow(detalleevaluacionnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomis) {
				if(detalleevaluacionnomiAux.getDetalleEvaluacionNomiOriginal().getId().equals(detalleevaluacionnomiOriginal.getId())) {
					existe=true;
					detalleevaluacionnomiOriginal.setId(detalleevaluacionnomiAux.getId());
					detalleevaluacionnomiOriginal.setVersionRow(detalleevaluacionnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleEvaluacionNomi(Boolean esParaCancelar) throws Exception {
		detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
		detalleevaluacionnomiAux=new DetalleEvaluacionNomi();
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
					if(detalleevaluacionnomiAux.getId()<0) {
						detalleevaluacionnomisAux.add(detalleevaluacionnomiAux);
					}		
				}
				this.iIdNuevoDetalleEvaluacionNomi=0L;
				this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().removeAll(detalleevaluacionnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomis) {
					if(detalleevaluacionnomiAux.getId()<0) {
						detalleevaluacionnomisAux.add(detalleevaluacionnomiAux);
					}		
				}
				this.iIdNuevoDetalleEvaluacionNomi=0L;
				this.detalleevaluacionnomis.removeAll(detalleevaluacionnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleEvaluacionNomi 
					&& this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()>0
					) {
					detalleevaluacionnomiAux=this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().get(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size() - 1);
				
					if(detalleevaluacionnomiAux.getId()<0) {
						this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().remove(detalleevaluacionnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleEvaluacionNomi && this.detalleevaluacionnomis.size()>0) {
					detalleevaluacionnomiAux=this.detalleevaluacionnomis.get(this.detalleevaluacionnomis.size() - 1);
				
					if(detalleevaluacionnomiAux.getId()<0) {
						this.detalleevaluacionnomis.remove(detalleevaluacionnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleEvaluacionNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleevaluacionnomi.getId()<0) {
				this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().remove(this.detalleevaluacionnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleevaluacionnomi.getId()<0) {
				this.detalleevaluacionnomis.remove(this.detalleevaluacionnomi);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleEvaluacionNomi(List<DetalleEvaluacionNomi> detalleevaluacionnomisAux) throws Exception {
		DetalleEvaluacionNomiConstantesFunciones.setEstadosInicialesDetalleEvaluacionNomi(detalleevaluacionnomisAux);
	}
	
	public void setEstadosInicialesDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomiAux) throws Exception {
		DetalleEvaluacionNomiConstantesFunciones.setEstadosInicialesDetalleEvaluacionNomi(detalleevaluacionnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleEvaluacionNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleEvaluacionNomiActual()) {
				if(!this.isEsNuevoDetalleEvaluacionNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleEvaluacionNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleEvaluacionNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Evaluacion Nomi ?", "MANTENIMIENTO DE Detalle Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleEvaluacionNomi detalleevaluacionnomi) throws Exception {
		DetalleEvaluacionNomiConstantesFunciones.seleccionarAsignar(this.detalleevaluacionnomi,detalleevaluacionnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleEvaluacionNomi=this.isPermisoActualizarOriginalDetalleEvaluacionNomi;
			
			
			this.seleccionarAsignar(detalleevaluacionnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleEvaluacionNomiConstantesFunciones.quitarEspaciosDetalleEvaluacionNomi(this.detalleevaluacionnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleevaluacionnomiSessionBean.setsFuncionBusquedaRapida(this.detalleevaluacionnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleEvaluacionNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleEvaluacionNomi(esParaCancelar);				
				this.cancelarNuevoDetalleEvaluacionNomi(esParaCancelar);								
			}
			
			this.detalleevaluacionnomi=new DetalleEvaluacionNomi();
			
			this.inicializarDetalleEvaluacionNomi();
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleEvaluacionNomi() throws Exception {
		try {
			DetalleEvaluacionNomiConstantesFunciones.inicializarDetalleEvaluacionNomi(this.detalleevaluacionnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleEvaluacionNomis(String sAccionBusqueda,List<DetalleEvaluacionNomi> detalleevaluacionnomisParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleEvaluacionNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleEvaluacionNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleEvaluacionNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleEvaluacionNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Evaluacion Nomis");		
		parameters.put("busquedapor", DetalleEvaluacionNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleEvaluacionNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleEvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleEvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleEvaluacionNomi=new JRBeanArrayDataSource(DetalleEvaluacionNomiJInternalFrame.TraerDetalleEvaluacionNomiBeans(detalleevaluacionnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleEvaluacionNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleEvaluacionNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleEvaluacionNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleEvaluacionNomiBean.TraerDetalleEvaluacionNomiBeans(detalleevaluacionnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomiActionPerformed(null);
					//this.generarExcelReporteDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,detalleevaluacionnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionNomi> detalleevaluacionnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleEvaluacionNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleEvaluacionNomi detalleevaluacionnomi : detalleevaluacionnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteDataDetalleEvaluacionNomi("NORMAL",row,workbook,detalleevaluacionnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleEvaluacionNomi(String sTipo,Row row,Workbook workbook) {
		
		DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionNomi> detalleevaluacionnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleEvaluacionNomi detalleevaluacionnomi : detalleevaluacionnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.getDetalleEvaluacionNomiDescripcion(detalleevaluacionnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getevaluacionnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getformatonomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getpreguntanomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getrespuesta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleevaluacionnomi.getrespuesta_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica1()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica2()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica3()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica4()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica5()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica6()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica7()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica8()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica9()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detalleevaluacionnomi.getcalifica10()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleEvaluacionNomi> detalleevaluacionnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleEvaluacionNomi> detalleevaluacionnomisRespaldo=null;
		
		classes=DetalleEvaluacionNomiConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleevaluacionnomiLogic.setDatosCliente(this.datosCliente);
		this.detalleevaluacionnomiLogic.setDatosDeep(this.datosDeep);
		this.detalleevaluacionnomiLogic.setIsConDeep(true);
		
		detalleevaluacionnomisRespaldo=this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis();
		
		this.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(detalleevaluacionnomisParaReportes);	
		this.detalleevaluacionnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleevaluacionnomisParaReportes=this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis();
		this.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(detalleevaluacionnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleEvaluacionNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleEvaluacionNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleEvaluacionNomi detalleevaluacionnomi : detalleevaluacionnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleEvaluacionNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteDataDetalleEvaluacionNomi("NORMAL",row,workbook,detalleevaluacionnomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.getDetalleEvaluacionNomiDescripcion(detalleevaluacionnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleEvaluacionNomi() throws Exception {		
		this.startProcessDetalleEvaluacionNomi(true);
	}
	
	public void startProcessDetalleEvaluacionNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleEvaluacionNomi ,this.jPanelParametrosReportesDetalleEvaluacionNomi, this.jScrollPanelDatosDetalleEvaluacionNomi,this.jPanelPaginacionDetalleEvaluacionNomi, this.jScrollPanelDatosEdicionDetalleEvaluacionNomi, this.jPanelAccionesDetalleEvaluacionNomi,this.jPanelAccionesFormularioDetalleEvaluacionNomi,this.jmenuBarDetalleEvaluacionNomi,this.jmenuBarDetalleDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionNomi=this.jTabbedPaneBusquedasDetalleEvaluacionNomi; 
		
		final JPanel jPanelParametrosReportesDetalleEvaluacionNomi=this.jPanelParametrosReportesDetalleEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosDetalleEvaluacionNomi=this.jScrollPanelDatosDetalleEvaluacionNomi;
		final JTable jTableDatosDetalleEvaluacionNomi=this.jTableDatosDetalleEvaluacionNomi;		
		final JPanel jPanelPaginacionDetalleEvaluacionNomi=this.jPanelPaginacionDetalleEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionNomi=this.jScrollPanelDatosEdicionDetalleEvaluacionNomi;
		final JPanel jPanelAccionesDetalleEvaluacionNomi=this.jPanelAccionesDetalleEvaluacionNomi;
		
		JPanel jPanelCamposAuxiliarDetalleEvaluacionNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			jPanelCamposAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelCamposDetalleEvaluacionNomi;
			jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelAccionesFormularioDetalleEvaluacionNomi;
		}
		
		final JPanel jPanelCamposDetalleEvaluacionNomi=jPanelCamposAuxiliarDetalleEvaluacionNomi;
		final JPanel jPanelAccionesFormularioDetalleEvaluacionNomi=jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi;
		
		
		final JMenuBar jmenuBarDetalleEvaluacionNomi=this.jmenuBarDetalleEvaluacionNomi;
		final JToolBar jTtoolBarDetalleEvaluacionNomi=this.jTtoolBarDetalleEvaluacionNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleEvaluacionNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			jmenuBarDetalleAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jmenuBarDetalleDetalleEvaluacionNomi;
			jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTtoolBarDetalleDetalleEvaluacionNomi;
		}
		
		final JMenuBar jmenuBarDetalleDetalleEvaluacionNomi=jmenuBarDetalleAuxiliarDetalleEvaluacionNomi;
		final JToolBar jTtoolBarDetalleDetalleEvaluacionNomi=jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleEvaluacionNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleEvaluacionNomi;
			processRunnable.jTableDatos=jTableDatosDetalleEvaluacionNomi;
			processRunnable.jPanelCampos=jPanelCamposDetalleEvaluacionNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleEvaluacionNomi;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleEvaluacionNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleEvaluacionNomi;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleEvaluacionNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleEvaluacionNomi;
			processRunnable.jTtoolBar=jTtoolBarDetalleEvaluacionNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleEvaluacionNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleEvaluacionNomi ,jPanelParametrosReportesDetalleEvaluacionNomi,jTableDatosDetalleEvaluacionNomi, /*jScrollPanelDatosDetalleEvaluacionNomi,*/jPanelCamposDetalleEvaluacionNomi,jPanelPaginacionDetalleEvaluacionNomi, /*jScrollPanelDatosEdicionDetalleEvaluacionNomi,*/ jPanelAccionesDetalleEvaluacionNomi,jPanelAccionesFormularioDetalleEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jmenuBarDetalleDetalleEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi,jTtoolBarDetalleDetalleEvaluacionNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleEvaluacionNomi ,jPanelParametrosReportesDetalleEvaluacionNomi, jScrollPanelDatosDetalleEvaluacionNomi,jPanelPaginacionDetalleEvaluacionNomi, jScrollPanelDatosEdicionDetalleEvaluacionNomi, jPanelAccionesDetalleEvaluacionNomi,jPanelAccionesFormularioDetalleEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jmenuBarDetalleDetalleEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi,jTtoolBarDetalleDetalleEvaluacionNomi);
						
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
	
	public void finishProcessDetalleEvaluacionNomi() {// throws Exception 
		this.finishProcessDetalleEvaluacionNomi(true);
	}
	
	public void finishProcessDetalleEvaluacionNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleEvaluacionNomi ,this.jPanelParametrosReportesDetalleEvaluacionNomi, this.jScrollPanelDatosDetalleEvaluacionNomi,this.jPanelPaginacionDetalleEvaluacionNomi, this.jScrollPanelDatosEdicionDetalleEvaluacionNomi, this.jPanelAccionesDetalleEvaluacionNomi,this.jPanelAccionesFormularioDetalleEvaluacionNomi,this.jmenuBarDetalleEvaluacionNomi,this.jmenuBarDetalleDetalleEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleEvaluacionNomi=this.jTabbedPaneBusquedasDetalleEvaluacionNomi; 
		
		final JPanel jPanelParametrosReportesDetalleEvaluacionNomi=this.jPanelParametrosReportesDetalleEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosDetalleEvaluacionNomi=this.jScrollPanelDatosDetalleEvaluacionNomi;
		final JTable jTableDatosDetalleEvaluacionNomi=this.jTableDatosDetalleEvaluacionNomi;		
		final JPanel jPanelPaginacionDetalleEvaluacionNomi=this.jPanelPaginacionDetalleEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionNomi=this.jScrollPanelDatosEdicionDetalleEvaluacionNomi;
		final JPanel jPanelAccionesDetalleEvaluacionNomi=this.jPanelAccionesDetalleEvaluacionNomi;
		
		JPanel jPanelCamposAuxiliarDetalleEvaluacionNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			jPanelCamposAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelCamposDetalleEvaluacionNomi;
			jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelAccionesFormularioDetalleEvaluacionNomi;
		}
		
		final JPanel jPanelCamposDetalleEvaluacionNomi=jPanelCamposAuxiliarDetalleEvaluacionNomi;
		final JPanel jPanelAccionesFormularioDetalleEvaluacionNomi=jPanelAccionesFormularioAuxiliarDetalleEvaluacionNomi;
		
		
		final JMenuBar jmenuBarDetalleEvaluacionNomi=this.jmenuBarDetalleEvaluacionNomi;		
		final JToolBar jTtoolBarDetalleEvaluacionNomi=this.jTtoolBarDetalleEvaluacionNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleEvaluacionNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			jmenuBarDetalleAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jmenuBarDetalleDetalleEvaluacionNomi;
			jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTtoolBarDetalleDetalleEvaluacionNomi;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleEvaluacionNomi=jmenuBarDetalleAuxiliarDetalleEvaluacionNomi;
		final JToolBar jTtoolBarDetalleDetalleEvaluacionNomi=jTtoolBarDetalleAuxiliarDetalleEvaluacionNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleEvaluacionNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleEvaluacionNomi;
			processRunnable.jTableDatos=jTableDatosDetalleEvaluacionNomi;
			processRunnable.jPanelCampos=jPanelCamposDetalleEvaluacionNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleEvaluacionNomi;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleEvaluacionNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleEvaluacionNomi;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleEvaluacionNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleEvaluacionNomi;
			processRunnable.jTtoolBar=jTtoolBarDetalleEvaluacionNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleEvaluacionNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleEvaluacionNomi ,jPanelParametrosReportesDetalleEvaluacionNomi, jTableDatosDetalleEvaluacionNomi,/*jScrollPanelDatosDetalleEvaluacionNomi,*/jPanelCamposDetalleEvaluacionNomi,jPanelPaginacionDetalleEvaluacionNomi, /*jScrollPanelDatosEdicionDetalleEvaluacionNomi,*/ jPanelAccionesDetalleEvaluacionNomi,jPanelAccionesFormularioDetalleEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jmenuBarDetalleDetalleEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi,jTtoolBarDetalleDetalleEvaluacionNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleEvaluacionNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleEvaluacionNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleEvaluacionNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleEvaluacionNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleevaluacionnomiConstantesFunciones.getsFinalQueryDetalleEvaluacionNomi();
		String  finalQueryPaginacionTodos=this.detalleevaluacionnomiConstantesFunciones.getsFinalQueryDetalleEvaluacionNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleEvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesNoDetalleEvaluacionNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleEvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesDetalleEvaluacionNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleEvaluacionNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleevaluacionnomisEliminados= new ArrayList<DetalleEvaluacionNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleEvaluacionNomi();
		
				///*DetalleEvaluacionNomiSessionBean*/this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			
			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
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
					this.iNumeroPaginacion=DetalleEvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleEvaluacionNomiConstantesFunciones.getClassesForeignKeysOfDetalleEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleevaluacionnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleevaluacionnomisAux= new ArrayList<DetalleEvaluacionNomi>();
			
				
			detalleevaluacionnomiLogic.setDatosCliente(this.datosCliente);
			detalleevaluacionnomiLogic.setDatosDeep(this.datosDeep);
			detalleevaluacionnomiLogic.setIsConDeep(true);
			
			
			detalleevaluacionnomiLogic.getDetalleEvaluacionNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleevaluacionnomiLogic.getTodosDetalleEvaluacionNomis(finalQueryGlobal,pagination);
					
					//detalleevaluacionnomiLogic.getTodosDetalleEvaluacionNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()==null|| detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionnomisAux= new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomisAux= new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionnomiLogic.getTodosDetalleEvaluacionNomis(finalQueryGlobal+"",this.pagination);												
							
							//detalleevaluacionnomiLogic.getTodosDetalleEvaluacionNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomiLogic.getDetalleEvaluacionNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());					
							detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(detalleevaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomis.addAll(detalleevaluacionnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleEvaluacionNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleEvaluacionNomi=this.idActual;
				
				} else if(this.idDetalleEvaluacionNomiActual!=null && this.idDetalleEvaluacionNomiActual!=0L) {
					idDetalleEvaluacionNomi=idDetalleEvaluacionNomiActual;
				}
				
					
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndicePorId(idDetalleEvaluacionNomi);
				
				this.detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleevaluacionnomiLogic.getEntity(idDetalleEvaluacionNomi);
					
					//detalleevaluacionnomiLogic.getEntityWithConnection(idDetalleEvaluacionNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
					detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().add(detalleevaluacionnomiLogic.getDetalleEvaluacionNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
					this.detalleevaluacionnomis.add(detalleevaluacionnomi);
				}
				
				if(detalleevaluacionnomiLogic.getDetalleEvaluacionNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()==null||detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionnomis==null|| detalleevaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
						detalleevaluacionnomisAux.addAll(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionNomis("FK_IdEmpresa",detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionNomis("FK_IdEmpresa",detalleevaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
						detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(detalleevaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomis.addAll(detalleevaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEvaluacionNomi")) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEvaluacionNomi(id_evaluacion_nomiFK_IdEvaluacionNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEvaluacionNomi(finalQueryGlobal,pagination,id_evaluacion_nomiFK_IdEvaluacionNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEvaluacionNomi(id_evaluacion_nomiFK_IdEvaluacionNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEvaluacionNomi(id_evaluacion_nomiFK_IdEvaluacionNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()==null||detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionnomis==null|| detalleevaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
						detalleevaluacionnomisAux.addAll(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEvaluacionNomi(finalQueryGlobal,pagination,id_evaluacion_nomiFK_IdEvaluacionNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEvaluacionNomi(id_evaluacion_nomiFK_IdEvaluacionNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEvaluacionNomi(id_evaluacion_nomiFK_IdEvaluacionNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionNomis("FK_IdEvaluacionNomi",detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionNomis("FK_IdEvaluacionNomi",detalleevaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
						detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(detalleevaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomis.addAll(detalleevaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomi")) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()==null||detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionnomis==null|| detalleevaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
						detalleevaluacionnomisAux.addAll(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionNomis("FK_IdFormatoNomi",detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionNomis("FK_IdFormatoNomi",detalleevaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
						detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(detalleevaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomis.addAll(detalleevaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPreguntaNomi")) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdPreguntaNomi(finalQueryGlobal,pagination,id_pregunta_nomiFK_IdPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()==null||detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleevaluacionnomis==null|| detalleevaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
						detalleevaluacionnomisAux.addAll(detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomisAux=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomisAux.addAll(detalleevaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdPreguntaNomi(finalQueryGlobal,pagination,id_pregunta_nomiFK_IdPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleEvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleEvaluacionNomis("FK_IdPreguntaNomi",detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleEvaluacionNomis("FK_IdPreguntaNomi",detalleevaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
						detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(detalleevaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
							detalleevaluacionnomis.addAll(detalleevaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleEvaluacionNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleEvaluacionNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleevaluacionnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleEvaluacionNomi detalleevaluacionnomi) {
		Boolean permite=true;
		
		if(this.detalleevaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleEvaluacionNomiConstantesFunciones.getOrderByListaDetalleEvaluacionNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleEvaluacionNomiConstantesFunciones.getOrderByListaDetalleEvaluacionNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				if(detalleevaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionnomiTotales=detalleevaluacionnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionNomi detalleevaluacionnomi:this.detalleevaluacionnomis) {
				if(detalleevaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionnomiTotales=detalleevaluacionnomi;
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
			this.detalleevaluacionnomiAux=new DetalleEvaluacionNomi();
			this.detalleevaluacionnomiAux.setsType(Constantes2.S_TOTALES);
			this.detalleevaluacionnomiAux.setIsNew(false);
			this.detalleevaluacionnomiAux.setIsChanged(false);
			this.detalleevaluacionnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleEvaluacionNomiConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionNomi(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this.detalleevaluacionnomiAux);
				
				this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().add(this.detalleevaluacionnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleEvaluacionNomiConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionNomi(this.detalleevaluacionnomis,this.detalleevaluacionnomiAux);
				
				this.detalleevaluacionnomis.add(this.detalleevaluacionnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleevaluacionnomiTotales=new DetalleEvaluacionNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().remove(detalleevaluacionnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleevaluacionnomis.remove(detalleevaluacionnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleevaluacionnomiTotales=new DetalleEvaluacionNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				if(detalleevaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionnomiTotales=detalleevaluacionnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleEvaluacionNomiConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionNomi(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),detalleevaluacionnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleEvaluacionNomi detalleevaluacionnomi:this.detalleevaluacionnomis) {
				if(detalleevaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					detalleevaluacionnomiTotales=detalleevaluacionnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleEvaluacionNomiConstantesFunciones.TotalizarValoresFilaDetalleEvaluacionNomi(this.detalleevaluacionnomis,detalleevaluacionnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleEvaluacionNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionNomisFK_IdEvaluacionNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdEvaluacionNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionNomisFK_IdFormatoNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleEvaluacionNomisFK_IdPreguntaNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdPreguntaNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleEvaluacionNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionNomisFK_IdEvaluacionNomi(String sFinalQuery,Long id_evaluacion_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdEvaluacionNomi(sFinalQuery,this.pagination,id_evaluacion_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionNomisFK_IdFormatoNomi(String sFinalQuery,Long id_formato_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdFormatoNomi(sFinalQuery,this.pagination,id_formato_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleEvaluacionNomisFK_IdPreguntaNomi(String sFinalQuery,Long id_pregunta_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLogic.getDetalleEvaluacionNomisFK_IdPreguntaNomi(sFinalQuery,this.pagination,id_pregunta_nomi);
				
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
	
	public void inicializarPermisosDetalleEvaluacionNomi() {
		this.isPermisoTodoDetalleEvaluacionNomi=false;
		this.isPermisoNuevoDetalleEvaluacionNomi=false;
		this.isPermisoActualizarDetalleEvaluacionNomi=false;
		this.isPermisoActualizarOriginalDetalleEvaluacionNomi=false;
		this.isPermisoEliminarDetalleEvaluacionNomi=false;
		this.isPermisoGuardarCambiosDetalleEvaluacionNomi=false;
		this.isPermisoConsultaDetalleEvaluacionNomi=false;
		this.isPermisoBusquedaDetalleEvaluacionNomi=false;
		this.isPermisoReporteDetalleEvaluacionNomi=false;		
		this.isPermisoOrdenDetalleEvaluacionNomi=false;		
		this.isPermisoPaginacionMedioDetalleEvaluacionNomi=false;		
		this.isPermisoPaginacionAltoDetalleEvaluacionNomi=false;
		this.isPermisoPaginacionTodoDetalleEvaluacionNomi=false;
		this.isPermisoCopiarDetalleEvaluacionNomi=false;		
		this.isPermisoVerFormDetalleEvaluacionNomi=false;		
		this.isPermisoDuplicarDetalleEvaluacionNomi=false;		
		this.isPermisoOrdenDetalleEvaluacionNomi=false;		
	}
	
	public void setPermisosUsuarioDetalleEvaluacionNomi(Boolean isPermiso) {
		this.isPermisoTodoDetalleEvaluacionNomi=isPermiso;
		this.isPermisoNuevoDetalleEvaluacionNomi=isPermiso;
		this.isPermisoActualizarDetalleEvaluacionNomi=isPermiso;
		this.isPermisoActualizarOriginalDetalleEvaluacionNomi=isPermiso;
		this.isPermisoEliminarDetalleEvaluacionNomi=isPermiso;
		this.isPermisoGuardarCambiosDetalleEvaluacionNomi=isPermiso;
		this.isPermisoConsultaDetalleEvaluacionNomi=isPermiso;
		this.isPermisoBusquedaDetalleEvaluacionNomi=isPermiso;
		this.isPermisoReporteDetalleEvaluacionNomi=isPermiso;
		this.isPermisoOrdenDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionMedioDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionAltoDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionTodoDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoCopiarDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoVerFormDetalleEvaluacionNomi=isPermiso;		
		this.isPermisoDuplicarDetalleEvaluacionNomi=isPermiso;
		this.isPermisoOrdenDetalleEvaluacionNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleEvaluacionNomi(Boolean isPermiso) {
		//this.isPermisoTodoDetalleEvaluacionNomi=isPermiso;
		this.isPermisoNuevoDetalleEvaluacionNomi=isPermiso;
		this.isPermisoActualizarDetalleEvaluacionNomi=isPermiso;
		this.isPermisoActualizarOriginalDetalleEvaluacionNomi=isPermiso;
		this.isPermisoEliminarDetalleEvaluacionNomi=isPermiso;
		this.isPermisoGuardarCambiosDetalleEvaluacionNomi=isPermiso;
		//this.isPermisoConsultaDetalleEvaluacionNomi=isPermiso;
		//this.isPermisoBusquedaDetalleEvaluacionNomi=isPermiso;
		//this.isPermisoReporteDetalleEvaluacionNomi=isPermiso;
		//this.isPermisoOrdenDetalleEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleEvaluacionNomi=isPermiso;		
		//this.isPermisoCopiarDetalleEvaluacionNomi=isPermiso;		
		//this.isPermisoDuplicarDetalleEvaluacionNomi=isPermiso;
		//this.isPermisoOrdenDetalleEvaluacionNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleEvaluacionNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleEvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleEvaluacionNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleEvaluacionNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleEvaluacionNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleEvaluacionNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleEvaluacionNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleEvaluacionNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleEvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleEvaluacionNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleEvaluacionNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleEvaluacionNomi=this.isPermisoActualizarDetalleEvaluacionNomi;
			this.isPermisoEliminarDetalleEvaluacionNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleEvaluacionNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleEvaluacionNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleEvaluacionNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleEvaluacionNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleEvaluacionNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleEvaluacionNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleEvaluacionNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleEvaluacionNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleEvaluacionNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleEvaluacionNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleEvaluacionNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleEvaluacionNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleEvaluacionNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleEvaluacionNomi.setToolTipText(this.jTableDatosDetalleEvaluacionNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleEvaluacionNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleEvaluacionNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleEvaluacionNomi() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleEvaluacionNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.evaluacionnomisForeignKey=new ArrayList();
				this.formatonomisForeignKey=new ArrayList();
				this.preguntanomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleEvaluacionNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleEvaluacionNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleEvaluacionNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEvaluacionNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEvaluacionNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.evaluacionnomisForeignKey==null||this.evaluacionnomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesEvaluacionNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EvaluacionNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosEvaluacionNomisForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleEvaluacionNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiReturnGeneral=new DetalleEvaluacionNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleevaluacionnomiConstantesFunciones.cargarid_empresaDetalleEvaluacionNomi)
					 || (this.esRecargarFks && this.detalleevaluacionnomiConstantesFunciones.cargarid_empresaDetalleEvaluacionNomi)) {

					if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionnomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEvaluacionNomi="";

				if(((this.evaluacionnomisForeignKey==null||this.evaluacionnomisForeignKey.size()<=0) && this.detalleevaluacionnomiConstantesFunciones.cargarid_evaluacion_nomiDetalleEvaluacionNomi)
					 || (this.esRecargarFks && this.detalleevaluacionnomiConstantesFunciones.cargarid_evaluacion_nomiDetalleEvaluacionNomi)) {

					if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesEvaluacionNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEvaluacionNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalEvaluacionNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalEvaluacionNomi, "");
						finalQueryGlobalEvaluacionNomi+=EvaluacionNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEvaluacionNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEvaluacionNomi=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionnomiSessionBean.getlidEvaluacionNomiActual();
					}
				} else {
					finalQueryGlobalEvaluacionNomi="NONE";
				}


				String finalQueryGlobalFormatoNomi="";

				if(((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0) && this.detalleevaluacionnomiConstantesFunciones.cargarid_formato_nomiDetalleEvaluacionNomi)
					 || (this.esRecargarFks && this.detalleevaluacionnomiConstantesFunciones.cargarid_formato_nomiDetalleEvaluacionNomi)) {

					if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomi, "");
						finalQueryGlobalFormatoNomi+=FormatoNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomi=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionnomiSessionBean.getlidFormatoNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomi="NONE";
				}


				String finalQueryGlobalPreguntaNomi="";

				if(((this.preguntanomisForeignKey==null||this.preguntanomisForeignKey.size()<=0) && this.detalleevaluacionnomiConstantesFunciones.cargarid_pregunta_nomiDetalleEvaluacionNomi)
					 || (this.esRecargarFks && this.detalleevaluacionnomiConstantesFunciones.cargarid_pregunta_nomiDetalleEvaluacionNomi)) {

					if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PreguntaNomiConstantesFunciones.getArrayColumnasGlobalesPreguntaNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPreguntaNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalPreguntaNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalPreguntaNomi, "");
						finalQueryGlobalPreguntaNomi+=PreguntaNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPreguntaNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPreguntaNomi=" WHERE " + ConstantesSql.ID + "="+detalleevaluacionnomiSessionBean.getlidPreguntaNomiActual();
					}
				} else {
					finalQueryGlobalPreguntaNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.cargarCombosLoteForeignKeyDetalleEvaluacionNomi(finalQueryGlobalEmpresa,finalQueryGlobalEvaluacionNomi,finalQueryGlobalFormatoNomi,finalQueryGlobalPreguntaNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleevaluacionnomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEvaluacionNomi.equals("NONE")) {
				this.evaluacionnomisForeignKey=detalleevaluacionnomiReturnGeneral.getevaluacionnomisForeignKey();
			}

			if(!finalQueryGlobalFormatoNomi.equals("NONE")) {
				this.formatonomisForeignKey=detalleevaluacionnomiReturnGeneral.getformatonomisForeignKey();
			}

			if(!finalQueryGlobalPreguntaNomi.equals("NONE")) {
				this.preguntanomisForeignKey=detalleevaluacionnomiReturnGeneral.getpreguntanomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleEvaluacionNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEvaluacionNomi();
			this.addItemDefectoCombosForeignKeyFormatoNomi();
			this.addItemDefectoCombosForeignKeyPreguntaNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleevaluacionnomiSessionBean==null) {
				this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEvaluacionNomi()throws Exception {
		try {

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionNomi()) {
				EvaluacionNomi evaluacionnomi=new EvaluacionNomi();
				EvaluacionNomiConstantesFunciones.setEvaluacionNomiDescripcion(evaluacionnomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				evaluacionnomi.setId(null);

				if(!EvaluacionNomiConstantesFunciones.ExisteEnLista(this.evaluacionnomisForeignKey,evaluacionnomi,true)) {

					this.evaluacionnomisForeignKey.add(0,evaluacionnomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomi()throws Exception {
		try {

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
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

	public void addItemDefectoCombosForeignKeyPreguntaNomi()throws Exception {
		try {

			if(!this.detalleevaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleEvaluacionNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleEvaluacionNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleEvaluacionNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi)throws Exception {	
		try {
			
			this.setActualEvaluacionNomiForeignKey(detalleevaluacionnomi.getid_evaluacion_nomi(),false,"Formulario");
			this.setActualFormatoNomiForeignKey(detalleevaluacionnomi.getid_formato_nomi(),false,"Formulario");
			this.setActualPreguntaNomiForeignKey(detalleevaluacionnomi.getid_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleEvaluacionNomi()throws Exception {	
		try {
			
			this.setActualEvaluacionNomiForeignKey(this.detalleevaluacionnomiConstantesFunciones.getid_evaluacion_nomi(),false,"Formulario");
			this.setActualFormatoNomiForeignKey(this.detalleevaluacionnomiConstantesFunciones.getid_formato_nomi(),false,"Formulario");
			this.setActualPreguntaNomiForeignKey(this.detalleevaluacionnomiConstantesFunciones.getid_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleEvaluacionNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleEvaluacionNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleEvaluacionNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleEvaluacionNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleEvaluacionNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEvaluacionNomisForeignKey("Todos");
			this.cargarCombosFrameFormatoNomisForeignKey("Todos");
			this.cargarCombosFramePreguntaNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleEvaluacionNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEvaluacionNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePreguntaNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleEvaluacionNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DetalleEvaluacionNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleEvaluacionNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleEvaluacionNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean(); 
		this.detalleevaluacionnomiConstantesFunciones=new DetalleEvaluacionNomiConstantesFunciones(); 
		this.detalleevaluacionnomiBean=new DetalleEvaluacionNomi();//(this.detalleevaluacionnomiConstantesFunciones); 		
		this.detalleevaluacionnomiReturnGeneral=new DetalleEvaluacionNomiParameterReturnGeneral(); 
		
		this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleEvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleEvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleEvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleEvaluacionNomi(true);
			
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
			
			this.detalleevaluacionnomiConstantesFunciones=new DetalleEvaluacionNomiConstantesFunciones(); 
			this.detalleevaluacionnomiBean=new DetalleEvaluacionNomi();//this.detalleevaluacionnomiConstantesFunciones); 			
			this.detalleevaluacionnomiReturnGeneral=new DetalleEvaluacionNomiParameterReturnGeneral(); 
		
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Evaluacion Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleevaluacionnomi=new DetalleEvaluacionNomi();
			this.detalleevaluacionnomis = new ArrayList<DetalleEvaluacionNomi>();
			this.detalleevaluacionnomisAux = new ArrayList<DetalleEvaluacionNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic=new DetalleEvaluacionNomiLogic();
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleEvaluacionNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi);	
					}
					
					if(this.jInternalFrameImportacionDetalleEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleEvaluacionNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleEvaluacionNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleEvaluacionNomi);
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setVisible(false);
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi);
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleEvaluacionNomi);
					this.jInternalFrameImportacionDetalleEvaluacionNomi.setVisible(false);
					this.jInternalFrameImportacionDetalleEvaluacionNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleEvaluacionNomi);
					this.jInternalFrameOrderByDetalleEvaluacionNomi.setVisible(false);
					this.jInternalFrameOrderByDetalleEvaluacionNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleEvaluacionNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleEvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleevaluacionnomiReturnGeneral=new DetalleEvaluacionNomiParameterReturnGeneral();
			
			this.detalleevaluacionnomiParameterGeneral=new DetalleEvaluacionNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleevaluacionnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEvaluacionNomi=true;
			this.isVisibilidadFK_IdFormatoNomi=true;
			this.isVisibilidadFK_IdPreguntaNomi=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleEvaluacionNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleEvaluacionNomi(false);
			
			this.setPermisosUsuarioDetalleEvaluacionNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleEvaluacionNomiClasesRelacionadas();
			}
			
			if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleEvaluacionNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleEvaluacionNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionNomi();
			}
			
			if(!this.isPermisoBusquedaDetalleEvaluacionNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleEvaluacionNomi,this.isPermisoPaginacionMedioDetalleEvaluacionNomi,this.isPermisoPaginacionTodoDetalleEvaluacionNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleEvaluacionNomiConstantesFunciones.getTiposSeleccionarDetalleEvaluacionNomi());
				
				this.tiposColumnasSelect=DetalleEvaluacionNomiConstantesFunciones.getTiposSeleccionarDetalleEvaluacionNomi(true);
				
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
			//if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleEvaluacionNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleEvaluacionNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleEvaluacionNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionNomi() ;
			
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
			this.evaluacionnomiLogic=new EvaluacionNomiLogic();
			this.formatonomiLogic=new FormatoNomiLogic();
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
				detalleevaluacionnomiImplementable= (DetalleEvaluacionNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleEvaluacionNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleevaluacionnomiImplementableHome= (DetalleEvaluacionNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleEvaluacionNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
			this.detalleevaluacionnomisEliminados= new ArrayList<DetalleEvaluacionNomi>();
						
			this.isEsNuevoDetalleEvaluacionNomi=false;
			this.esParaAccionDesdeFormularioDetalleEvaluacionNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.evaluacionnomisForeignKey=new ArrayList<EvaluacionNomi>() ;
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>() ;
			this.preguntanomisForeignKey=new ArrayList<PreguntaNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleEvaluacionNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleEvaluacionNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleEvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleEvaluacionNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleEvaluacionNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleEvaluacionNomi();
			}
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleEvaluacionNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleEvaluacionNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleEvaluacionNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleEvaluacionNomi")) {
				iIndex=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleEvaluacionNomi();	
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
	
	public void cargarCombosForeignKeyDetalleEvaluacionNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleEvaluacionNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleEvaluacionNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleEvaluacionNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleEvaluacionNomi();
		
		this.cargarCombosFrameForeignKeyDetalleEvaluacionNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleEvaluacionNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyEvaluacionNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEvaluacionNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEvaluacionNomi();
				this.cargarCombosFrameEvaluacionNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEvaluacionNomi(this.evaluacionnomisForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoDetalleEvaluacionNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			
			if(jTableDatosDetalleEvaluacionNomi.getRowCount()>=1) {
				jTableDatosDetalleEvaluacionNomi.removeRowSelectionInterval(0, jTableDatosDetalleEvaluacionNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleEvaluacionNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(true);			
			//this.detalleevaluacionnomi=new DetalleEvaluacionNomi();
			//this.detalleevaluacionnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi() ;
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleevaluacionnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);				
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleEvaluacionNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleEvaluacionNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionNomi.getSelectedRows().length;			
			}
			
			detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleEvaluacionNomi--;			
				//DetalleEvaluacionNomi detalleevaluacionnomiAux= new DetalleEvaluacionNomi();			
				//detalleevaluacionnomiAux.setId(this.iIdNuevoDetalleEvaluacionNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleEvaluacionNomi detalleevaluacionnomiOrigen=new DetalleEvaluacionNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleEvaluacionNomi detalleevaluacionnomiOrigen : detalleevaluacionnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleevaluacionnomiOrigen =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleevaluacionnomiOrigen =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleEvaluacionNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleevaluacionnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleEvaluacionNomi(detalleevaluacionnomiOrigen,this.detalleevaluacionnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().add(this.detalleevaluacionnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomis.add(this.detalleevaluacionnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
				
				this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionNomi(), this.getIndiceNuevoDetalleEvaluacionNomi());
				
				int iLastRow =  this.jTableDatosDetalleEvaluacionNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleEvaluacionNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleEvaluacionNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();									
		
			DetalleEvaluacionNomi detalleevaluacionnomiOrigen=new DetalleEvaluacionNomi();
			DetalleEvaluacionNomi detalleevaluacionnomiDestino=new DetalleEvaluacionNomi();
				
			detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleevaluacionnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleEvaluacionNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiOrigen =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleevaluacionnomiOrigen =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleevaluacionnomiDestino =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleevaluacionnomiDestino =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleevaluacionnomiOrigen =detalleevaluacionnomisSeleccionados.get(0);
				detalleevaluacionnomiDestino =detalleevaluacionnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleEvaluacionNomi(detalleevaluacionnomiOrigen,detalleevaluacionnomiDestino,true,false);
				
				detalleevaluacionnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleevaluacionnomiDestino,detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleevaluacionnomiDestino,detalleevaluacionnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
				
				//this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionNomi(), this.getIndiceNuevoDetalleEvaluacionNomi());
				
				int iLastRow =  this.jTableDatosDetalleEvaluacionNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleEvaluacionNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleEvaluacionNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleEvaluacionNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(!isVisible);
			this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(!isVisible);
			this.jPanelAccionesDetalleEvaluacionNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleEvaluacionNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleEvaluacionNomi();
			
			this.abrirFrameOrderByDetalleEvaluacionNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleEvaluacionNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleEvaluacionNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSize(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.iWidthFormulario,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleEvaluacionNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleEvaluacionNomi.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jContentPaneDetalleDetalleEvaluacionNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jContentPaneDetalleDetalleEvaluacionNomi.getWidth(),DetalleEvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jContentPaneDetalleDetalleEvaluacionNomi.getWidth(),DetalleEvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jContentPaneDetalleDetalleEvaluacionNomi.getWidth(),DetalleEvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleEvaluacionNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionNomi,false,this);
				} else {
					this.jInternalFrameOrderByDetalleEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleEvaluacionNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleEvaluacionNomi);
				this.jInternalFrameOrderByDetalleEvaluacionNomi.setVisible(false);
				this.jInternalFrameOrderByDetalleEvaluacionNomi.setSelected(false);
				
				this.jInternalFrameOrderByDetalleEvaluacionNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleEvaluacionNomi"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleEvaluacionNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleEvaluacionNomi==null) {
				
				this.jInternalFrameImportacionDetalleEvaluacionNomi=new ImportacionJInternalFrame(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleEvaluacionNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleEvaluacionNomi);
				this.jInternalFrameImportacionDetalleEvaluacionNomi.setVisible(false);
				this.jInternalFrameImportacionDetalleEvaluacionNomi.setSelected(false);


				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleEvaluacionNomi"));
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleEvaluacionNomi"));
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleEvaluacionNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi==null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi=new ReporteDinamicoJInternalFrame(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi);
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleEvaluacionNomi);
			
	       	this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.dispose();
			//this.jInternalFrameDetalleFormDetalleEvaluacionNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleEvaluacionNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleEvaluacionNomi.setVisible(true);
	        this.jInternalFrameImportacionDetalleEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleEvaluacionNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setVisible(true);
	        this.jInternalFrameOrderByDetalleEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleEvaluacionNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleEvaluacionNomi.setVisible(false);
	        this.jInternalFrameOrderByDetalleEvaluacionNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleEvaluacionNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleEvaluacionNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleEvaluacionNomi.setVisible(false);
	        this.jInternalFrameImportacionDetalleEvaluacionNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleEvaluacionNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleEvaluacionNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(true);
			//this.isEsNuevoDetalleEvaluacionNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false) ;
			
			if(detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleEvaluacionNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleEvaluacionNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(true);
			//this.isEsNuevoDetalleEvaluacionNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleevaluacionnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false) ;
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleEvaluacionNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEvaluacionNomi(List<EvaluacionNomi> evaluacionnomisForeignKey)throws Exception{
		TableColumn tableColumnEvaluacionNomi=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI));
		TableCellEditor tableCellEditorEvaluacionNomi =tableColumnEvaluacionNomi.getCellEditor();

		EvaluacionNomiTableCell evaluacionnomiTableCellFk=(EvaluacionNomiTableCell)tableCellEditorEvaluacionNomi;

		if(evaluacionnomiTableCellFk!=null) {
			evaluacionnomiTableCellFk.setevaluacionnomisForeignKey(evaluacionnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//evaluacionnomiTableCellFk.setRowActual(intSelectedRow);
			//evaluacionnomiTableCellFk.setevaluacionnomisForeignKeyActual(evaluacionnomisForeignKey);
		//}


		if(evaluacionnomiTableCellFk!=null) {
			evaluacionnomiTableCellFk.RecargarEvaluacionNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoNomi(List<FormatoNomi> formatonomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomi=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI));
		TableCellEditor tableCellEditorFormatoNomi =tableColumnFormatoNomi.getCellEditor();

		FormatoNomiTableCell formatonomiTableCellFk=(FormatoNomiTableCell)tableCellEditorFormatoNomi;

		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.setformatonomisForeignKey(formatonomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomiTableCellFk.setformatonomisForeignKeyActual(formatonomisForeignKey);
		//}


		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.RecargarFormatoNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPreguntaNomi(List<PreguntaNomi> preguntanomisForeignKey)throws Exception{
		TableColumn tableColumnPreguntaNomi=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI));
		TableCellEditor tableCellEditorPreguntaNomi =tableColumnPreguntaNomi.getCellEditor();

		PreguntaNomiTableCell preguntanomiTableCellFk=(PreguntaNomiTableCell)tableCellEditorPreguntaNomi;

		if(preguntanomiTableCellFk!=null) {
			preguntanomiTableCellFk.setpreguntanomisForeignKey(preguntanomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//preguntanomiTableCellFk.setRowActual(intSelectedRow);
			//preguntanomiTableCellFk.setpreguntanomisForeignKeyActual(preguntanomisForeignKey);
		//}


		if(preguntanomiTableCellFk!=null) {
			preguntanomiTableCellFk.RecargarPreguntaNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleEvaluacionNomi(false);
			
			//if(!this.isEsNuevoDetalleEvaluacionNomi) {								
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				
			}
			
			if(this.permiteMantenimiento(this.detalleevaluacionnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleEvaluacionNomi=true;
					this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					this.isEsNuevoDetalleEvaluacionNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleEvaluacionNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleEvaluacionNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(false);
				
				this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(false);
			
												
				
				if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleEvaluacionNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,detalleevaluacionnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleevaluacionnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				this.detalleevaluacionnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				this.detalleevaluacionnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleevaluacionnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleEvaluacionNomiModel) this.jTableDatosDetalleEvaluacionNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleEvaluacionNomi=true;
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
				this.isEsNuevoDetalleEvaluacionNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(false);
				
				this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(false);
				
				
				
				if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleEvaluacionNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleEvaluacionNomi.getRowCount()>=1) {
				jTableDatosDetalleEvaluacionNomi.removeRowSelectionInterval(0, jTableDatosDetalleEvaluacionNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleEvaluacionNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(false) ;
			
			this.isEsNuevoDetalleEvaluacionNomi=false;
			
			if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleEvaluacionNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				
				//SI ES MANUAL
				if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleEvaluacionNomi--;			
			//DetalleEvaluacionNomi detalleevaluacionnomiAux= new DetalleEvaluacionNomi();			
			//detalleevaluacionnomiAux.setId(this.iIdNuevoDetalleEvaluacionNomi);
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleEvaluacionNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
			
			this.detalleevaluacionnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().add(this.detalleevaluacionnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleevaluacionnomis.add(this.detalleevaluacionnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			
			this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoDetalleEvaluacionNomi(), this.getIndiceNuevoDetalleEvaluacionNomi());
			
			int iLastRow =  this.jTableDatosDetalleEvaluacionNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleEvaluacionNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleEvaluacionNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();
			}
			
			//this.abrirFrameTreeDetalleEvaluacionNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Evaluacion NomiS ?", "MANTENIMIENTO DE Detalle Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleEvaluacionNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleEvaluacionNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.procesarImportacionDetalleEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleevaluacionnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleEvaluacionNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleEvaluacionNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleEvaluacionNomi.setFileImportacion(this.jInternalFrameImportacionDetalleEvaluacionNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleEvaluacionNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleEvaluacionNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		

		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleEvaluacionNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EvaluacionNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EvaluacionNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EvaluacionNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EvaluacionNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PreguntaNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PreguntaNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PreguntaNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PreguntaNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_spuesta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_spuesta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_spuesta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_spuesta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_spuestaValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_spuestaValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_spuestaValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_spuestaValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica6_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica6_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica6_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica6_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica7_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica7_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica7_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica7_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica8_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica8_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica8_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica8_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica9_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica9_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica9_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica9_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lifica10_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lifica10_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lifica10_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lifica10_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI:
					sNombreCampoCategoria="id_evaluacion_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoria="id_formato_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					sNombreCampoCategoria="id_pregunta_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA:
					sNombreCampoCategoria="respuesta";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR:
					sNombreCampoCategoria="respuesta_valor";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1:
					sNombreCampoCategoria="califica1";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2:
					sNombreCampoCategoria="califica2";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3:
					sNombreCampoCategoria="califica3";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4:
					sNombreCampoCategoria="califica4";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5:
					sNombreCampoCategoria="califica5";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6:
					sNombreCampoCategoria="califica6";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7:
					sNombreCampoCategoria="califica7";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8:
					sNombreCampoCategoria="califica8";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9:
					sNombreCampoCategoria="califica9";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10:
					sNombreCampoCategoria="califica10";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI:
					sNombreCampoCategoriaValor="id_evaluacion_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoriaValor="id_formato_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					sNombreCampoCategoriaValor="id_pregunta_nomi";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA:
					sNombreCampoCategoriaValor="respuesta";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR:
					sNombreCampoCategoriaValor="respuesta_valor";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1:
					sNombreCampoCategoriaValor="califica1";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2:
					sNombreCampoCategoriaValor="califica2";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3:
					sNombreCampoCategoriaValor="califica3";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4:
					sNombreCampoCategoriaValor="califica4";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5:
					sNombreCampoCategoriaValor="califica5";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6:
					sNombreCampoCategoriaValor="califica6";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7:
					sNombreCampoCategoriaValor="califica7";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8:
					sNombreCampoCategoriaValor="califica8";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9:
					sNombreCampoCategoriaValor="califica9";
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10:
					sNombreCampoCategoriaValor="califica10";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Evaluacion Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_evaluacion_nomi");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pregunta_nomi");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Respuesta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"respuesta");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Respuesta Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"respuesta_valor");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica1");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica2");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica3");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica4");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica5");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica6",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica6");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica7",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica7");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica8",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica8");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica9",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica9");
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Califica10",sNombreCampoCategoria,sNombreCampoCategoriaValor,"califica10");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleEvaluacionNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getevaluacionnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getformatonomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getpreguntanomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getrespuesta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getrespuesta_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica6());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica7());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica8());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica9());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10);
					iRow++;

					for(DetalleEvaluacionNomi detalleevaluacionnomi:detalleevaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleevaluacionnomi.getcalifica10());
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
			//	this.getFilaCabeceraExportarExcelDetalleEvaluacionNomi(row);				
			//	iRow++;
			//}				
			
			//for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleEvaluacionNomi(detalleevaluacionnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleEvaluacionNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleEvaluacionNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleEvaluacionNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleEvaluacionNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleEvaluacionNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleEvaluacionNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleEvaluacionNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleEvaluacionNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleEvaluacionNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleEvaluacionNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleEvaluacionNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleEvaluacionNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleEvaluacionNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleEvaluacionNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleEvaluacionNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleEvaluacionNomi();
		
		this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleEvaluacionNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleEvaluacionNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleEvaluacionNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleEvaluacionNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleEvaluacionNomi() throws Exception {
		try	{
			if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleEvaluacionNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleEvaluacionNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleEvaluacionNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleEvaluacionNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleEvaluacionNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleEvaluacionNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.addItem(reporte);
			}
			
			
			if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleEvaluacionNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleEvaluacionNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleEvaluacionNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleEvaluacionNomiConstantesFunciones.getTiposSeleccionarDetalleEvaluacionNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleEvaluacionNomiConstantesFunciones.getTiposSeleccionarDetalleEvaluacionNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleEvaluacionNomiConstantesFunciones.getTiposSeleccionarDetalleEvaluacionNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleEvaluacionNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.getSelectedItem()!=null){this.id_evaluacion_nomiFK_IdEvaluacionNomi=((EvaluacionNomi)this.jComboBoxid_evaluacion_nomiFK_IdEvaluacionNomiDetalleEvaluacionNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.getSelectedItem()!=null){this.id_formato_nomiFK_IdFormatoNomi=((FormatoNomi)this.jComboBoxid_formato_nomiFK_IdFormatoNomiDetalleEvaluacionNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.getSelectedItem()!=null){this.id_pregunta_nomiFK_IdPreguntaNomi=((PreguntaNomi)this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiDetalleEvaluacionNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleEvaluacionNomi(Boolean esInicializar) throws Exception {				
		if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleEvaluacionNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleEvaluacionNomi() throws Exception {
		this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleEvaluacionNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleEvaluacionNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleEvaluacionNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleevaluacionnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleEvaluacionNomi.setModel(new DetalleEvaluacionNomiModel(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleEvaluacionNomi.setModel(new DetalleEvaluacionNomiModel(this.detalleevaluacionnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleEvaluacionNomi!=null && this.jInternalFrameOrderByDetalleEvaluacionNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleEvaluacionNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,detalleevaluacionnomiConstantesFunciones.resaltarSeleccionarDetalleEvaluacionNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,detalleevaluacionnomiConstantesFunciones.resaltarSeleccionarDetalleEvaluacionNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_ID));

		if(this.detalleevaluacionnomiConstantesFunciones.mostraridDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltaridDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activaridDetalleEvaluacionNomi,iSizeTabla,this,true,"idDetalleEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltaridDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activaridDetalleEvaluacionNomi,this,true,"idDetalleEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarid_empresaDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_empresaDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_empresaDetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_empresaDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_empresaDetalleEvaluacionNomi,false,"id_empresaDetalleEvaluacionNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarid_evaluacion_nomiDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EvaluacionNomiTableCell(this.evaluacionnomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_evaluacion_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_evaluacion_nomiDetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new EvaluacionNomiTableCell(this.evaluacionnomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_evaluacion_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_evaluacion_nomiDetalleEvaluacionNomi,true,"id_evaluacion_nomiDetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarid_formato_nomiDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiTableCell(this.formatonomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_formato_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_formato_nomiDetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiTableCell(this.formatonomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_formato_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_formato_nomiDetalleEvaluacionNomi,true,"id_formato_nomiDetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarid_pregunta_nomiDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PreguntaNomiTableCell(this.preguntanomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_pregunta_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_pregunta_nomiDetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new PreguntaNomiTableCell(this.preguntanomisForeignKey,this.detalleevaluacionnomiConstantesFunciones.resaltarid_pregunta_nomiDetalleEvaluacionNomi,this,this.detalleevaluacionnomiConstantesFunciones.activarid_pregunta_nomiDetalleEvaluacionNomi,true,"id_pregunta_nomiDetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuestaDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuestaDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarrespuestaDetalleEvaluacionNomi,iSizeTabla,this,true,"respuestaDetalleEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuestaDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarrespuestaDetalleEvaluacionNomi,this,true,"respuestaDetalleEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuesta_valorDetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuesta_valorDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarrespuesta_valorDetalleEvaluacionNomi,iSizeTabla,this,true,"respuesta_valorDetalleEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuesta_valorDetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarrespuesta_valorDetalleEvaluacionNomi,this,true,"respuesta_valorDetalleEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica1DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica1DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica1DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica1DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica1DetalleEvaluacionNomi,this,true,"califica1DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica2DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica2DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica2DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica2DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica2DetalleEvaluacionNomi,this,true,"califica2DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica3DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica3DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica3DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica3DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica3DetalleEvaluacionNomi,this,true,"califica3DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica4DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica4DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica4DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica4DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica4DetalleEvaluacionNomi,this,true,"califica4DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica5DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica5DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica5DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica5DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica5DetalleEvaluacionNomi,this,true,"califica5DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica6DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica6DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica6DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica6DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica6DetalleEvaluacionNomi,this,true,"califica6DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica7DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica7DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica7DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica7DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica7DetalleEvaluacionNomi,this,true,"califica7DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica8DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica8DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica8DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica8DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica8DetalleEvaluacionNomi,this,true,"califica8DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica9DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica9DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica9DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica9DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica9DetalleEvaluacionNomi,this,true,"califica9DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10));

		if(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica10DetalleEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica10DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica10DetalleEvaluacionNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica10DetalleEvaluacionNomi,this.detalleevaluacionnomiConstantesFunciones.activarcalifica10DetalleEvaluacionNomi,this,true,"califica10DetalleEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleEvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleEvaluacionNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleEvaluacionNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleEvaluacionNomi.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleEvaluacionNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleEvaluacionNomi.moveColumn(this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleEvaluacionNomi.moveColumn(this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleEvaluacionNomi.moveColumn(this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleEvaluacionNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleEvaluacionNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleEvaluacionNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleEvaluacionNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleEvaluacionNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleEvaluacionNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleevaluacionnomis.size()-1;
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
		//this.jTableDatosDetalleEvaluacionNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleEvaluacionNomi();
			
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
				
				//this.isEsNuevoDetalleEvaluacionNomi=false;
					
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
				if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleEvaluacionNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleevaluacionnomi.getsType().equals("DUPLICADO")
				   || this.detalleevaluacionnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleEvaluacionNomi=true;
				
				} else {
					this.isEsNuevoDetalleEvaluacionNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleevaluacionnomi.getId()>=0 && !this.detalleevaluacionnomi.getIsNew()) {						
						this.isEsNuevoDetalleEvaluacionNomi=false;
						
					} else {
						this.isEsNuevoDetalleEvaluacionNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleEvaluacionNomi(esRelaciones);						
				
				this.seleccionarDetalleEvaluacionNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleevaluacionnomi.getId()<0) {
					this.isEsNuevoDetalleEvaluacionNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleEvaluacionNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleEvaluacionNomi(evt,rowIndex);
				}	
				
				if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleEvaluacionNomi: " + this.dDif); 
					}
				}								
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleEvaluacionNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleevaluacionnomi)) {
					if(this.detalleevaluacionnomi.getId()>0) {
						this.detalleevaluacionnomi.setIsDeleted(true);
						
						this.detalleevaluacionnomisEliminados.add(this.detalleevaluacionnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().remove(this.detalleevaluacionnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomis.remove(this.detalleevaluacionnomi);				
					}
					
					
					((DetalleEvaluacionNomiModel) this.jTableDatosDetalleEvaluacionNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleEvaluacionNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleEvaluacionNomi) {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleEvaluacionNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleevaluacionnomiConstantesFunciones.cargarid_empresaDetalleEvaluacionNomi || this.detalleevaluacionnomiConstantesFunciones.event_dependid_empresaDetalleEvaluacionNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleevaluacionnomi.getid_empresa());
									//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleevaluacionnomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleevaluacionnomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleevaluacionnomi.getid_empresa(),false,"Formulario");

					//EvaluacionNomi
					if(!this.detalleevaluacionnomiConstantesFunciones.cargarid_evaluacion_nomiDetalleEvaluacionNomi || this.detalleevaluacionnomiConstantesFunciones.event_dependid_evaluacion_nomiDetalleEvaluacionNomi) {
						//this.cargarCombosEvaluacionNomisForeignKeyLista(" where id="+this.detalleevaluacionnomi.getid_evaluacion_nomi());
									//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
						this.evaluacionnomisForeignKey=new ArrayList<EvaluacionNomi>();

						if(detalleevaluacionnomi.getEvaluacionNomi()!=null) {
							this.evaluacionnomisForeignKey.add(detalleevaluacionnomi.getEvaluacionNomi());
						}

						this.addItemDefectoCombosForeignKeyEvaluacionNomi();
						this.cargarCombosFrameEvaluacionNomisForeignKey("Todos");
					}
					this.setActualEvaluacionNomiForeignKey(this.detalleevaluacionnomi.getid_evaluacion_nomi(),false,"Formulario");

					//FormatoNomi
					if(!this.detalleevaluacionnomiConstantesFunciones.cargarid_formato_nomiDetalleEvaluacionNomi || this.detalleevaluacionnomiConstantesFunciones.event_dependid_formato_nomiDetalleEvaluacionNomi) {
						//this.cargarCombosFormatoNomisForeignKeyLista(" where id="+this.detalleevaluacionnomi.getid_formato_nomi());
									//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
						this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

						if(detalleevaluacionnomi.getFormatoNomi()!=null) {
							this.formatonomisForeignKey.add(detalleevaluacionnomi.getFormatoNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomi();
						this.cargarCombosFrameFormatoNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiForeignKey(this.detalleevaluacionnomi.getid_formato_nomi(),false,"Formulario");

					//PreguntaNomi
					if(!this.detalleevaluacionnomiConstantesFunciones.cargarid_pregunta_nomiDetalleEvaluacionNomi || this.detalleevaluacionnomiConstantesFunciones.event_dependid_pregunta_nomiDetalleEvaluacionNomi) {
						//this.cargarCombosPreguntaNomisForeignKeyLista(" where id="+this.detalleevaluacionnomi.getid_pregunta_nomi());
									//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
						this.preguntanomisForeignKey=new ArrayList<PreguntaNomi>();

						if(detalleevaluacionnomi.getPreguntaNomi()!=null) {
							this.preguntanomisForeignKey.add(detalleevaluacionnomi.getPreguntaNomi());
						}

						this.addItemDefectoCombosForeignKeyPreguntaNomi();
						this.cargarCombosFramePreguntaNomisForeignKey("Todos");
					}
					this.setActualPreguntaNomiForeignKey(this.detalleevaluacionnomi.getid_pregunta_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleEvaluacionNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleEvaluacionNomi(detalleevaluacionnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(detalleevaluacionnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleEvaluacionNomi(detalleevaluacionnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionNomi(detalleevaluacionnomi);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getrespuesta());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getrespuesta_valor().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica1());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica2());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica3());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica4());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica5());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica6());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica7());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica8());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica9());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica10());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleEvaluacionNomi detalleevaluacionnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleevaluacionnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleEvaluacionNomi detalleevaluacionnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleevaluacionnomiLocal=this.detalleevaluacionnomi;
			} else {
				detalleevaluacionnomiLocal=this.detalleevaluacionnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleevaluacionnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleEvaluacionNomi(detalleevaluacionnomiLocal,true);
					
					if(detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleevaluacionnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleevaluacionnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(detalleevaluacionnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(detalleevaluacionnomi);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(detalleevaluacionnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.getText()==null || this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.getText()=="" || this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setText("0");
			}

			if(conColumnasBase) {detalleevaluacionnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelIdDetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setrespuesta(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuestaDetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setrespuesta_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelrespuesta_valorDetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica1(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica1DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica2(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica2DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica3(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica3DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica4(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica4DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica5(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica5DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica6(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica6DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica7(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica7DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica8(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica8DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica9(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica9DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleevaluacionnomi.setcalifica10(this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelcalifica10DetalleEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomiBean,DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleevaluacionnomiBean.getid_evaluacion_nomi()!=null && !detalleevaluacionnomiBean.getid_evaluacion_nomi().equals(-1L))) {detalleevaluacionnomi.setid_evaluacion_nomi(detalleevaluacionnomiBean.getid_evaluacion_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiBean.getid_formato_nomi()!=null && !detalleevaluacionnomiBean.getid_formato_nomi().equals(-1L))) {detalleevaluacionnomi.setid_formato_nomi(detalleevaluacionnomiBean.getid_formato_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiBean.getid_pregunta_nomi()!=null && !detalleevaluacionnomiBean.getid_pregunta_nomi().equals(-1L))) {detalleevaluacionnomi.setid_pregunta_nomi(detalleevaluacionnomiBean.getid_pregunta_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomiOrigen,DetalleEvaluacionNomi detalleevaluacionnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getId()!=null && !detalleevaluacionnomiOrigen.getId().equals(0L))) {detalleevaluacionnomi.setId(detalleevaluacionnomiOrigen.getId());}}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getid_evaluacion_nomi()!=null && !detalleevaluacionnomiOrigen.getid_evaluacion_nomi().equals(-1L))) {detalleevaluacionnomi.setid_evaluacion_nomi(detalleevaluacionnomiOrigen.getid_evaluacion_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getid_formato_nomi()!=null && !detalleevaluacionnomiOrigen.getid_formato_nomi().equals(-1L))) {detalleevaluacionnomi.setid_formato_nomi(detalleevaluacionnomiOrigen.getid_formato_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getid_pregunta_nomi()!=null && !detalleevaluacionnomiOrigen.getid_pregunta_nomi().equals(-1L))) {detalleevaluacionnomi.setid_pregunta_nomi(detalleevaluacionnomiOrigen.getid_pregunta_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getrespuesta()!=null && !detalleevaluacionnomiOrigen.getrespuesta().equals(""))) {detalleevaluacionnomi.setrespuesta(detalleevaluacionnomiOrigen.getrespuesta());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getrespuesta_valor()!=null && !detalleevaluacionnomiOrigen.getrespuesta_valor().equals(0.0))) {detalleevaluacionnomi.setrespuesta_valor(detalleevaluacionnomiOrigen.getrespuesta_valor());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica1()!=null && !detalleevaluacionnomiOrigen.getcalifica1().equals(false))) {detalleevaluacionnomi.setcalifica1(detalleevaluacionnomiOrigen.getcalifica1());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica2()!=null && !detalleevaluacionnomiOrigen.getcalifica2().equals(false))) {detalleevaluacionnomi.setcalifica2(detalleevaluacionnomiOrigen.getcalifica2());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica3()!=null && !detalleevaluacionnomiOrigen.getcalifica3().equals(false))) {detalleevaluacionnomi.setcalifica3(detalleevaluacionnomiOrigen.getcalifica3());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica4()!=null && !detalleevaluacionnomiOrigen.getcalifica4().equals(false))) {detalleevaluacionnomi.setcalifica4(detalleevaluacionnomiOrigen.getcalifica4());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica5()!=null && !detalleevaluacionnomiOrigen.getcalifica5().equals(false))) {detalleevaluacionnomi.setcalifica5(detalleevaluacionnomiOrigen.getcalifica5());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica6()!=null && !detalleevaluacionnomiOrigen.getcalifica6().equals(false))) {detalleevaluacionnomi.setcalifica6(detalleevaluacionnomiOrigen.getcalifica6());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica7()!=null && !detalleevaluacionnomiOrigen.getcalifica7().equals(false))) {detalleevaluacionnomi.setcalifica7(detalleevaluacionnomiOrigen.getcalifica7());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica8()!=null && !detalleevaluacionnomiOrigen.getcalifica8().equals(false))) {detalleevaluacionnomi.setcalifica8(detalleevaluacionnomiOrigen.getcalifica8());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica9()!=null && !detalleevaluacionnomiOrigen.getcalifica9().equals(false))) {detalleevaluacionnomi.setcalifica9(detalleevaluacionnomiOrigen.getcalifica9());}
			if(conDefault || (!conDefault && detalleevaluacionnomiOrigen.getcalifica10()!=null && !detalleevaluacionnomiOrigen.getcalifica10().equals(false))) {detalleevaluacionnomi.setcalifica10(detalleevaluacionnomiOrigen.getcalifica10());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getrespuesta());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setText(detalleevaluacionnomi.getrespuesta_valor().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica1());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica2());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica3());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica4());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica5());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica6());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica7());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica8());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica9());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setSelected(detalleevaluacionnomi.getcalifica10());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleEvaluacionNomi(DetalleEvaluacionNomiBean detalleevaluacionnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setText(detalleevaluacionnomiBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setText(detalleevaluacionnomiBean.getrespuesta());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setText(detalleevaluacionnomiBean.getrespuesta_valor().toString());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica1());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica2());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica3());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica4());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica5());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica6());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica7());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica8());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica9());
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setSelected(detalleevaluacionnomiBean.getcalifica10());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionNomi(DetalleEvaluacionNomiParameterReturnGeneral detalleevaluacionnomiReturnGeneral,DetalleEvaluacionNomiBean detalleevaluacionnomiBean,Boolean conDefault) throws Exception { 
		try {
			DetalleEvaluacionNomi detalleevaluacionnomiLocal=new DetalleEvaluacionNomi();
			
			detalleevaluacionnomiLocal=detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getId()!=null && !detalleevaluacionnomiLocal.getId().equals(0L))) {detalleevaluacionnomiBean.setId(detalleevaluacionnomiLocal.getId());}}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getid_evaluacion_nomi()!=null && !detalleevaluacionnomiLocal.getid_evaluacion_nomi().equals(-1L))) {detalleevaluacionnomiBean.setid_evaluacion_nomi(detalleevaluacionnomiLocal.getid_evaluacion_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getid_formato_nomi()!=null && !detalleevaluacionnomiLocal.getid_formato_nomi().equals(-1L))) {detalleevaluacionnomiBean.setid_formato_nomi(detalleevaluacionnomiLocal.getid_formato_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getid_pregunta_nomi()!=null && !detalleevaluacionnomiLocal.getid_pregunta_nomi().equals(-1L))) {detalleevaluacionnomiBean.setid_pregunta_nomi(detalleevaluacionnomiLocal.getid_pregunta_nomi());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getrespuesta()!=null && !detalleevaluacionnomiLocal.getrespuesta().equals(""))) {detalleevaluacionnomiBean.setrespuesta(detalleevaluacionnomiLocal.getrespuesta());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getrespuesta_valor()!=null && !detalleevaluacionnomiLocal.getrespuesta_valor().equals(0.0))) {detalleevaluacionnomiBean.setrespuesta_valor(detalleevaluacionnomiLocal.getrespuesta_valor());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica1()!=null && !detalleevaluacionnomiLocal.getcalifica1().equals(false))) {detalleevaluacionnomiBean.setcalifica1(detalleevaluacionnomiLocal.getcalifica1());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica2()!=null && !detalleevaluacionnomiLocal.getcalifica2().equals(false))) {detalleevaluacionnomiBean.setcalifica2(detalleevaluacionnomiLocal.getcalifica2());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica3()!=null && !detalleevaluacionnomiLocal.getcalifica3().equals(false))) {detalleevaluacionnomiBean.setcalifica3(detalleevaluacionnomiLocal.getcalifica3());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica4()!=null && !detalleevaluacionnomiLocal.getcalifica4().equals(false))) {detalleevaluacionnomiBean.setcalifica4(detalleevaluacionnomiLocal.getcalifica4());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica5()!=null && !detalleevaluacionnomiLocal.getcalifica5().equals(false))) {detalleevaluacionnomiBean.setcalifica5(detalleevaluacionnomiLocal.getcalifica5());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica6()!=null && !detalleevaluacionnomiLocal.getcalifica6().equals(false))) {detalleevaluacionnomiBean.setcalifica6(detalleevaluacionnomiLocal.getcalifica6());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica7()!=null && !detalleevaluacionnomiLocal.getcalifica7().equals(false))) {detalleevaluacionnomiBean.setcalifica7(detalleevaluacionnomiLocal.getcalifica7());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica8()!=null && !detalleevaluacionnomiLocal.getcalifica8().equals(false))) {detalleevaluacionnomiBean.setcalifica8(detalleevaluacionnomiLocal.getcalifica8());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica9()!=null && !detalleevaluacionnomiLocal.getcalifica9().equals(false))) {detalleevaluacionnomiBean.setcalifica9(detalleevaluacionnomiLocal.getcalifica9());}
			if(conDefault || (!conDefault && detalleevaluacionnomiLocal.getcalifica10()!=null && !detalleevaluacionnomiLocal.getcalifica10().equals(false))) {detalleevaluacionnomiBean.setcalifica10(detalleevaluacionnomiLocal.getcalifica10());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleEvaluacionNomiGenerico(Long idDetalleEvaluacionNomiSeleccionado,JComboBox jComboBoxDetalleEvaluacionNomi,List<DetalleEvaluacionNomi> detalleevaluacionnomisLocal)throws Exception {
		try {
			DetalleEvaluacionNomi  detalleevaluacionnomiTemp=null;

			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisLocal) {
				if(detalleevaluacionnomiAux.getId()!=null && detalleevaluacionnomiAux.getId().equals(idDetalleEvaluacionNomiSeleccionado)) {
					detalleevaluacionnomiTemp=detalleevaluacionnomiAux;
					break;
				}
			}

			jComboBoxDetalleEvaluacionNomi.setSelectedItem(detalleevaluacionnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleEvaluacionNomiGenerico(JComboBox jComboBoxDetalleEvaluacionNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleEvaluacionNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleEvaluacionNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleEvaluacionNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleEvaluacionNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionnomi=(DetalleEvaluacionNomi) detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleevaluacionnomi =(DetalleEvaluacionNomi) detalleevaluacionnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionnomi.getIsNew() && !detalleevaluacionnomi.getIsChanged() && !detalleevaluacionnomi.getIsDeleted()) {
				sDescripcion=detalleevaluacionnomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionnomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("EvaluacionNomi")) {
			//sDescripcion=this.getActualEvaluacionNomiForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionnomi.getIsNew() && !detalleevaluacionnomi.getIsChanged() && !detalleevaluacionnomi.getIsDeleted()) {
				sDescripcion=detalleevaluacionnomi.getevaluacionnomi_descripcion();
			} else {
				//sDescripcion=this.getActualEvaluacionNomiForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionnomi.getevaluacionnomi_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomi")) {
			//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionnomi.getIsNew() && !detalleevaluacionnomi.getIsChanged() && !detalleevaluacionnomi.getIsDeleted()) {
				sDescripcion=detalleevaluacionnomi.getformatonomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionnomi.getformatonomi_descripcion();
			}
		}

		if(sTipo.equals("PreguntaNomi")) {
			//sDescripcion=this.getActualPreguntaNomiForeignKeyDescripcion((Long)value);
			if(!detalleevaluacionnomi.getIsNew() && !detalleevaluacionnomi.getIsChanged() && !detalleevaluacionnomi.getIsDeleted()) {
				sDescripcion=detalleevaluacionnomi.getpreguntanomi_descripcion();
			} else {
				//sDescripcion=this.getActualPreguntaNomiForeignKeyDescripcion((Long)value);
				sDescripcion=detalleevaluacionnomi.getpreguntanomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleEvaluacionNomi detalleevaluacionnomiRow=new DetalleEvaluacionNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionnomiRow=(DetalleEvaluacionNomi) detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleevaluacionnomiRow=(DetalleEvaluacionNomi) detalleevaluacionnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));			
			this.jButtonDuplicarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi && this.isPermisoDuplicarDetalleEvaluacionNomi));			
			this.jButtonCopiarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi && this.isPermisoCopiarDetalleEvaluacionNomi));
			this.jButtonVerFormDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi && this.isPermisoVerFormDetalleEvaluacionNomi));
			
			this.jButtonAbrirOrderByDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));			
			
			this.jButtonNuevoRelacionesDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));			
			this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionNomi && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi && this.isPermisoEliminarDetalleEvaluacionNomi));
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi);							
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));						
			this.jButtonDuplicarToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi && this.isPermisoDuplicarDetalleEvaluacionNomi));						
			this.jButtonCopiarToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi && this.isPermisoCopiarDetalleEvaluacionNomi));			
			this.jButtonVerFormToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi && this.isPermisoVerFormDetalleEvaluacionNomi));			
			this.jButtonAbrirOrderByToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));
			this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));			
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionNomi && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi  && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi && this.isPermisoEliminarDetalleEvaluacionNomi));
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarToolBarDetalleEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi);				
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));			
			this.jMenuItemDuplicarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi && this.isPermisoDuplicarDetalleEvaluacionNomi));			
			this.jMenuItemCopiarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi && this.isPermisoCopiarDetalleEvaluacionNomi));			
			this.jMenuItemVerFormDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi && this.isPermisoVerFormDetalleEvaluacionNomi));			
			this.jMenuItemAbrirOrderByDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));			
			//this.jMenuItemMostrarOcultarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));
			this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));			
			//this.jMenuItemDetalleMostrarOcultarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi && this.isPermisoOrdenDetalleEvaluacionNomi));			
			this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi));			
			this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi && this.isPermisoNuevoDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));									
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemModificarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarDetalleEvaluacionNomi && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemActualizarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi && this.isPermisoActualizarDetalleEvaluacionNomi));	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemEliminarDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi && this.isPermisoEliminarDetalleEvaluacionNomi));
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemCancelarDetalleEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi);				
			}
			
			this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));						
			this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=this.jButtonNuevoDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi=this.jButtonDuplicarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi=this.jButtonCopiarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi=this.jButtonVerFormDetalleEvaluacionNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleEvaluacionNomi=this.jButtonAbrirOrderByDetalleEvaluacionNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=this.jButtonNuevoRelacionesDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=this.jButtonModificarDetalleEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=this.jButtonNuevoToolBarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarToolBarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarToolBarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarToolBarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarToolBarDetalleEvaluacionNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=this.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=this.jMenuItemNuevoDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemModificarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemActualizarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemEliminarDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemCancelarDetalleEvaluacionNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleEvaluacionNomi(Boolean esInicializar) {
		if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleEvaluacionNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleEvaluacionNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionNomi() {
		this.jButtonNuevoDetalleEvaluacionNomi.setVisible(this.isPermisoNuevoDetalleEvaluacionNomi);			
		this.jButtonDuplicarDetalleEvaluacionNomi.setVisible(this.isPermisoDuplicarDetalleEvaluacionNomi);			
		this.jButtonCopiarDetalleEvaluacionNomi.setVisible(this.isPermisoCopiarDetalleEvaluacionNomi);			
		this.jButtonVerFormDetalleEvaluacionNomi.setVisible(this.isPermisoVerFormDetalleEvaluacionNomi);			
		
		this.jButtonAbrirOrderByDetalleEvaluacionNomi.setVisible(this.isPermisoOrdenDetalleEvaluacionNomi);					
		
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.setVisible(this.isPermisoNuevoDetalleEvaluacionNomi);			
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarDetalleEvaluacionNomi.setVisible(this.isPermisoActualizarDetalleEvaluacionNomi);	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.setVisible(this.isPermisoActualizarDetalleEvaluacionNomi);	
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.setVisible(this.isPermisoEliminarDetalleEvaluacionNomi);
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi);						
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.setVisible(this.isPermisoGuardarCambiosDetalleEvaluacionNomi);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setVisible(this.isPermisoActualizarDetalleEvaluacionNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleEvaluacionNomi() {
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarDetalleEvaluacionNomi.setVisible(this.isPermisoActualizarDetalleEvaluacionNomi);	
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.setVisible(this.isPermisoActualizarDetalleEvaluacionNomi);	
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.setVisible(this.isPermisoEliminarDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi);							
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi && this.isPermisoGuardarCambiosDetalleEvaluacionNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleEvaluacionNomi() {
		if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleEvaluacionNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleEvaluacionNomi() {
	}
	
	public void jTableDatosDetalleEvaluacionNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleEvaluacionNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleevaluacionnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleevaluacionnomiLogic.getConnexion());

				if(this.detalleevaluacionnomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionnomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleEvaluacionNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleevaluacionnomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoevaluacionnomi=true;

			idTienePermisoevaluacionnomi=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionNomi(EvaluacionNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoevaluacionnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);

				this.evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.evaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.evaluacionnomiBeanSwingJInternalFrame.getEvaluacionNomiLogic().setConnexion(this.detalleevaluacionnomiLogic.getConnexion());

				if(this.detalleevaluacionnomi.getid_evaluacion_nomi()!=null) {
					this.evaluacionnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.evaluacionnomiBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionnomi.getid_evaluacion_nomi());
					this.evaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.evaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.evaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionNomi();
				}

				JInternalFrameBase jinternalFrame =this.evaluacionnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();
				TitledBorder titledBorderevaluacionnomi=(TitledBorder)this.evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.getBorder();

				titledBorderevaluacionnomi.setTitle(titledBorderDetalleEvaluacionNomi.getTitle() + " -> Evaluacion Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getid_evaluacion_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_evaluacion_nomi = "+this.detalleevaluacionnomi.getid_evaluacion_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomiDetalleEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomi=true;

			idTienePermisoformatonomi=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionNomi(FormatoNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.detalleevaluacionnomiLogic.getConnexion());

				if(this.detalleevaluacionnomi.getid_formato_nomi()!=null) {
					this.formatonomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomiBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionnomi.getid_formato_nomi());
					this.formatonomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();
				TitledBorder titledBorderformatonomi=(TitledBorder)this.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getBorder();

				titledBorderformatonomi.setTitle(titledBorderDetalleEvaluacionNomi.getTitle() + " -> Formato Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomiDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getid_formato_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi = "+this.detalleevaluacionnomi.getid_formato_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopreguntanomi=true;

			idTienePermisopreguntanomi=this.tienePermisosUsuarioEnPaginaWebDetalleEvaluacionNomi(PreguntaNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisopreguntanomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);

				this.preguntanomiBeanSwingJInternalFrame=new PreguntaNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.preguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.preguntanomiBeanSwingJInternalFrame.getPreguntaNomiLogic().setConnexion(this.detalleevaluacionnomiLogic.getConnexion());

				if(this.detalleevaluacionnomi.getid_pregunta_nomi()!=null) {
					this.preguntanomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.preguntanomiBeanSwingJInternalFrame.setIdActual(this.detalleevaluacionnomi.getid_pregunta_nomi());
					this.preguntanomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.preguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.preguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaNomi();
				}

				JInternalFrameBase jinternalFrame =this.preguntanomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();
				TitledBorder titledBorderpreguntanomi=(TitledBorder)this.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.getBorder();

				titledBorderpreguntanomi.setTitle(titledBorderDetalleEvaluacionNomi.getTitle() + " -> Pregunta Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pregunta_nomiDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getid_pregunta_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pregunta_nomi = "+this.detalleevaluacionnomi.getid_pregunta_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrespuestaDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getrespuesta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where respuesta like '%"+this.detalleevaluacionnomi.getrespuesta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrespuesta_valorDetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getrespuesta_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where respuesta_valor = "+this.detalleevaluacionnomi.getrespuesta_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica1DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica1 = "+this.detalleevaluacionnomi.getcalifica1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica2DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica2 = "+this.detalleevaluacionnomi.getcalifica2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica3DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica3 = "+this.detalleevaluacionnomi.getcalifica3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica4DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica4 = "+this.detalleevaluacionnomi.getcalifica4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica5DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica5 = "+this.detalleevaluacionnomi.getcalifica5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica6DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica6()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica6 = "+this.detalleevaluacionnomi.getcalifica6().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica7DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica7()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica7 = "+this.detalleevaluacionnomi.getcalifica7().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica8DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica8()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica8 = "+this.detalleevaluacionnomi.getcalifica8().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica9DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica9()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica9 = "+this.detalleevaluacionnomi.getcalifica9().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalifica10DetalleEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.getdetalleevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleevaluacionnomi==null) {
						this.detalleevaluacionnomi = new DetalleEvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);
				}

				if(this.detalleevaluacionnomi.getcalifica10()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where califica10 = "+this.detalleevaluacionnomi.getcalifica10().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);

			this.getDetalleEvaluacionNomisFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);

			//if(DetalleEvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);

			this.getDetalleEvaluacionNomisFK_IdEvaluacionNomi();

			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);

			//if(DetalleEvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);

			this.getDetalleEvaluacionNomisFK_IdFormatoNomi();

			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);

			//if(DetalleEvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPreguntaNomiDetalleEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);

			this.getDetalleEvaluacionNomisFK_IdPreguntaNomi();

			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);

			//if(DetalleEvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleevaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleEvaluacionNomi() {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.dispose();
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
			this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.dispose();
			this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi=null;
		}
		
		if(this.jInternalFrameImportacionDetalleEvaluacionNomi!=null) {
			this.jInternalFrameImportacionDetalleEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleEvaluacionNomi.dispose();
			this.jInternalFrameImportacionDetalleEvaluacionNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleEvaluacionNomi();
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleEvaluacionNomi")) {
				jButtonDuplicarDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleEvaluacionNomi")) {
				jButtonCopiarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleEvaluacionNomi")) {
				jButtonVerFormDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleEvaluacionNomi")) {
				jButtonDuplicarDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleEvaluacionNomi")) {
				jButtonDuplicarDetalleEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleEvaluacionNomi")) {
				jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleEvaluacionNomi")) {
				jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleEvaluacionNomi")) {
				jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleEvaluacionNomi")) {
				jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleEvaluacionNomi")) {
				jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleEvaluacionNomi")) {
				jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleEvaluacionNomi")) {
				jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleEvaluacionNomi")) {
				jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleEvaluacionNomi")) {
				jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleEvaluacionNomi")) {
				jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleEvaluacionNomi")) {
				jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleEvaluacionNomi")) {
				jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleEvaluacionNomi")) {
				jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleEvaluacionNomi")) {
				jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleEvaluacionNomi")) {
				jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleEvaluacionNomi")) {
				jButtonMostrarOcultarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleEvaluacionNomi")) {
				jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleEvaluacionNomi")) {
				jButtonCopiarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleEvaluacionNomi")) {
				jButtonVerFormDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleEvaluacionNomi")) {
				jButtonCopiarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleEvaluacionNomi")) {
				jButtonVerFormDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleEvaluacionNomi")) {
				jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleEvaluacionNomi")) {
				jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleEvaluacionNomi")) {
				jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleEvaluacionNomi")) {
				jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleEvaluacionNomi")) {
				jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleEvaluacionNomi")) {
				jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleEvaluacionNomi")) {
				jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleEvaluacionNomi")) {
				jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleEvaluacionNomi")) {
				jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleEvaluacionNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleEvaluacionNomi")) {
				jButtonAbrirOrderByDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleEvaluacionNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleEvaluacionNomi")) {
				jButtonMostrarOcultarDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleEvaluacionNomi")) {
				jButtonCerrarReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleEvaluacionNomi")) {
				jButtonGenerarReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleEvaluacionNomi")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleEvaluacionNomi")) {
				jButtonCerrarImportacionDetalleEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleEvaluacionNomi")) {
				
				jButtonGenerarImportacionDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleEvaluacionNomi")) {
				
				jButtonAbrirImportacionDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleEvaluacionNomi")) {
				jComboBoxTiposAccionesDetalleEvaluacionNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleEvaluacionNomi")) {
				jComboBoxTiposRelacionesDetalleEvaluacionNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleEvaluacionNomi")) {
				jComboBoxTiposAccionesDetalleEvaluacionNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleEvaluacionNomi")) {
				
				jComboBoxTiposSeleccionarDetalleEvaluacionNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleEvaluacionNomi")) {
				jTextFieldValorCampoGeneralDetalleEvaluacionNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleEvaluacionNomi")) {
				jButtonAbrirOrderByDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleEvaluacionNomi")) {
				jButtonAbrirOrderByDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleEvaluacionNomi")) {
				jButtonCerrarOrderByDetalleEvaluacionNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleEvaluacionNomiBusqueda")) {
				this.jButtonidDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_empresaDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_empresaDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_formato_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("respuestaDetalleEvaluacionNomiBusqueda")) {
				this.jButtonrespuestaDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("respuesta_valorDetalleEvaluacionNomiBusqueda")) {
				this.jButtonrespuesta_valorDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica1DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica1DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica2DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica2DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica3DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica3DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica4DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica4DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica5DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica5DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica6DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica6DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica7DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica7DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica8DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica8DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica9DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica9DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica10DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica10DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEvaluacionNomiDetalleEvaluacionNomi")) {
				this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiDetalleEvaluacionNomi")) {
				this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPreguntaNomiDetalleEvaluacionNomi")) {
				this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomiActionPerformed(evt);
			}
			
			;
			
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleEvaluacionNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleEvaluacionNomi detalleevaluacionnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleevaluacionnomiLocal=this.detalleevaluacionnomi;
			} else {
				detalleevaluacionnomiLocal=this.detalleevaluacionnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
							
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
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
			
			


			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
								
						
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
								
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
							
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
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
			
			


			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
								
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleEvaluacionNomi")) {
					jCheckBoxSeleccionarTodosDetalleEvaluacionNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleEvaluacionNomi")) {
					jCheckBoxSeleccionadosDetalleEvaluacionNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleEvaluacionNomi")) {
					
				}
				
				


				
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
												
				
				


				
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
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
			
			


			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleevaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleevaluacionnomi);
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
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
				
				


				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleEvaluacionNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleEvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleevaluacionnomiAnterior =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleEvaluacionNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleEvaluacionNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleEvaluacionNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleevaluacionnomi =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleevaluacionnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionNomi")) {
				
				}
				
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleEvaluacionNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleEvaluacionNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionNomi")) {
			
			}
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleEvaluacionNomi();
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleEvaluacionNomi")) {
				jButtonDuplicarDetalleEvaluacionNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleEvaluacionNomi")) {
				jButtonCopiarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleEvaluacionNomi")) {
				jButtonVerFormDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleEvaluacionNomi")) {
				jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleEvaluacionNomi")) {
				jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleEvaluacionNomi")) {
				jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleEvaluacionNomi")) {
				jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleEvaluacionNomi")) {
				jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleEvaluacionNomi")) {
				jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleEvaluacionNomi")) {
				jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleEvaluacionNomi")) {
				jButtonAbrirOrderByDetalleEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleEvaluacionNomi")) {
				jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleEvaluacionNomi")) {
				jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleEvaluacionNomi")) {
				jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleEvaluacionNomiBusqueda")) {
				this.jButtonidDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_empresaDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_empresaDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_formato_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_nomiDetalleEvaluacionNomiUpdate")) {
				this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_nomiDetalleEvaluacionNomiBusqueda")) {
				this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("respuestaDetalleEvaluacionNomiBusqueda")) {
				this.jButtonrespuestaDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("respuesta_valorDetalleEvaluacionNomiBusqueda")) {
				this.jButtonrespuesta_valorDetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica1DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica1DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica2DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica2DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica3DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica3DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica4DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica4DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica5DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica5DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica6DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica6DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica7DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica7DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica8DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica8DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica9DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica9DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("califica10DetalleEvaluacionNomiBusqueda")) {
				this.jButtoncalifica10DetalleEvaluacionNomiBusquedaActionPerformed(evt);
			}
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleEvaluacionNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleEvaluacionNomi")) {
				closingInternalFrameDetalleEvaluacionNomi();
				
			} else if(sTipo.equals("jButtonCancelarDetalleEvaluacionNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleEvaluacionNomi = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleEvaluacionNomiBeanSwingJInternalFrame jInternalFrameParent=(DetalleEvaluacionNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleEvaluacionNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleEvaluacionNomiActionPerformed(null);
			}
			
			DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleevaluacionnomi,new Object(),this.detalleevaluacionnomiParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleEvaluacionNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleEvaluacionNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleEvaluacionNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleevaluacionnomi)) {
			if(!esControlTabla) {
				if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);			
				}
				
				if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.procesarEventosDetalleEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this.detalleevaluacionnomi,this.detalleevaluacionnomiParameterGeneral,this.isEsNuevoDetalleEvaluacionNomi,classes);//this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral,this.detalleevaluacionnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleEvaluacionNomi(classes,this.detalleevaluacionnomiReturnGeneral,this.detalleevaluacionnomiBean,false);
					}
						
					if(this.detalleevaluacionnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi());	
					}
						
					if(this.detalleevaluacionnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi(),classes);//this.detalleevaluacionnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionNomi(this.detalleevaluacionnomi,classes);//this.detalleevaluacionnomiBean);									
				}
			
				if(DetalleEvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleEvaluacionNomi(this.detalleevaluacionnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleEvaluacionNomi(this.detalleevaluacionnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleevaluacionnomiAnterior!=null) {
						this.detalleevaluacionnomi=this.detalleevaluacionnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.procesarEventosDetalleEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this.detalleevaluacionnomi,this.detalleevaluacionnomiParameterGeneral,this.isEsNuevoDetalleEvaluacionNomi,classes);//this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi(),detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi(),this.detalleevaluacionnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleEvaluacionNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleEvaluacionNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleEvaluacionNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleEvaluacionNomi() throws Exception {
		
		DetalleEvaluacionNomiModel detalleevaluacionnomiModel=(DetalleEvaluacionNomiModel)this.jTableDatosDetalleEvaluacionNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleevaluacionnomiModel.detalleevaluacionnomis=this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleevaluacionnomiModel.detalleevaluacionnomis=this.detalleevaluacionnomis;
		}
		
		
		((DetalleEvaluacionNomiModel) this.jTableDatosDetalleEvaluacionNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleEvaluacionNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleevaluacionnomiAnterior(),this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleevaluacionnomiAnterior(),this.detalleevaluacionnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleEvaluacionNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
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
										
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionnomi,new Object(),generalEntityParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleEvaluacionNomiConstantesFunciones.getClassesRelationshipsOfDetalleEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleEvaluacionNomiConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleEvaluacionNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleEvaluacionNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleevaluacionnomi,new Object(),generalEntityParameterGeneral,this.detalleevaluacionnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleEvaluacionNomi(DetalleEvaluacionNomiBean detalleevaluacionnomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleEvaluacionNomi(ArrayList<Classe> classes,DetalleEvaluacionNomiReturnGeneral detalleevaluacionnomiReturnGeneral,DetalleEvaluacionNomiBean detalleevaluacionnomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleevaluacionnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi = new DetalleEvaluacionNomiDetalleFormJInternalFrame(jDesktopPane,this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setVisible(false);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.detalleevaluacionnomiLogic=this.detalleevaluacionnomiLogic;
		
		this.cargarCombosFrameForeignKeyDetalleEvaluacionNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleEvaluacionNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleEvaluacionNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleEvaluacionNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleEvaluacionNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleEvaluacionNomi"));
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarDetalleEvaluacionNomi"));

		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleEvaluacionNomi"));
					
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemModificarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ActualizarDetalleEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleEvaluacionNomi"));
						
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemActualizarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarDetalleEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleEvaluacionNomi"));
								
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemEliminarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarDetalleEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleEvaluacionNomi"));
					
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemCancelarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleEvaluacionNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemDetalleCerrarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionNomi"));
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionNomi"));
		
		
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleEvaluacionNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonidDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuestaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuestaDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuesta_valorDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica1DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica1DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica2DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica2DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica3DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica3DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica4DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica4DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica5DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica5DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica6DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica6DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica7DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica7DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica8DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica8DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica9DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica9DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica10DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica10DetalleEvaluacionNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleEvaluacionNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleEvaluacionNomi"));
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleEvaluacionNomi"));
		}
		
		this.jTableDatosDetalleEvaluacionNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleEvaluacionNomi"));
		
		this.jTableDatosDetalleEvaluacionNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleEvaluacionNomi"));
		
		this.jButtonNuevoDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoDetalleEvaluacionNomi"));
		
		this.jButtonDuplicarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"DuplicarDetalleEvaluacionNomi"));
		
		this.jButtonCopiarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"CopiarDetalleEvaluacionNomi"));
		
		this.jButtonVerFormDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"VerFormDetalleEvaluacionNomi"));
		
		
		this.jButtonNuevoToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleEvaluacionNomi"));
			
		this.jButtonDuplicarToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemNuevoDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleEvaluacionNomi"));
			
		this.jMenuItemDuplicarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleEvaluacionNomi"));		
		
		
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleEvaluacionNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleEvaluacionNomi"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarDetalleEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonModificarToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleEvaluacionNomi"));
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemModificarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ActualizarDetalleEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonActualizarToolBarDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleEvaluacionNomi"));
				
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemActualizarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarDetalleEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonEliminarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleEvaluacionNomi"));
						
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemEliminarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarDetalleEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonCancelarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleEvaluacionNomi"));
			
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemCancelarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleEvaluacionNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleEvaluacionNomi"));		
		
		
		this.jButtonCerrarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarDetalleEvaluacionNomi"));
		
		
		this.jButtonCerrarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemCerrarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleEvaluacionNomi"));
			
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jMenuItemDetalleCerrarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleEvaluacionNomi"));
		}
		
		this.jButtonCopiarToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleEvaluacionNomi"));
			
		this.jButtonVerFormToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleEvaluacionNomi"));
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleEvaluacionNomi"));
			
		this.jMenuItemCopiarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleEvaluacionNomi"));		
		
		this.jMenuItemVerFormDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleEvaluacionNomi"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleEvaluacionNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleEvaluacionNomi"));		
		
		
		
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleEvaluacionNomi"));
					
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleEvaluacionNomi"));
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleEvaluacionNomi"));		
		
		
		
		this.jButtonAnterioresDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AnterioresDetalleEvaluacionNomi"));
		
		
		this.jButtonAnterioresToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleEvaluacionNomi"));
		
		this.jMenuItemAnterioresDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleEvaluacionNomi"));		
		
		
		this.jButtonSiguientesDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"SiguientesDetalleEvaluacionNomi"));
		
		
		this.jButtonSiguientesToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemSiguientesDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleEvaluacionNomi"));
			
		this.jMenuItemAbrirOrderByDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleEvaluacionNomi"));
			
		this.jMenuItemMostrarOcultarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleEvaluacionNomi"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleEvaluacionNomi"));
			
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleEvaluacionNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleEvaluacionNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleEvaluacionNomi"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleEvaluacionNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleEvaluacionNomi"));

		this.jCheckBoxSeleccionadosDetalleEvaluacionNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleEvaluacionNomi"));
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleEvaluacionNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleEvaluacionNomi"));
			
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleEvaluacionNomi"));
					
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleEvaluacionNomi"));
			
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleEvaluacionNomi"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonidDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuestaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuestaDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuesta_valorDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica1DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica1DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica2DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica2DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica3DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica3DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica4DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica4DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica5DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica5DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica6DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica6DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica7DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica7DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica8DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica8DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica9DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica9DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica10DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica10DetalleEvaluacionNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionNomiDetalleEvaluacionNomi"));

			this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiDetalleEvaluacionNomi"));

			this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaNomiDetalleEvaluacionNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoDetalleEvaluacionNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleEvaluacionNomi"));				
			//this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleEvaluacionNomi"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleEvaluacionNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleEvaluacionNomi!=null) {
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleEvaluacionNomi"));
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleEvaluacionNomi"));
				this.jInternalFrameImportacionDetalleEvaluacionNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleEvaluacionNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleEvaluacionNomi"));
			
			this.jButtonAbrirOrderByToolBarDetalleEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleEvaluacionNomi"));			
			
			if(this.jInternalFrameOrderByDetalleEvaluacionNomi!=null) {
				this.jInternalFrameOrderByDetalleEvaluacionNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleEvaluacionNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTabbedPaneRelacionesDetalleEvaluacionNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleEvaluacionNomi"));
		
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
            		closingInternalFrameDetalleEvaluacionNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleEvaluacionNomi = (JInternalFrameBase)event.getSource();
	            	
	            DetalleEvaluacionNomiBeanSwingJInternalFrame jInternalFrameParent=(DetalleEvaluacionNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleEvaluacionNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleEvaluacionNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleEvaluacionNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleEvaluacionNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleEvaluacionNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleEvaluacionNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoRelacionesDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleEvaluacionNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleEvaluacionNomi";
		inputMap = this.jButtonModificarDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleEvaluacionNomi";
		inputMap = this.jButtonActualizarDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleEvaluacionNomi";
		inputMap = this.jButtonEliminarDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleEvaluacionNomi";
		inputMap = this.jButtonCancelarDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleEvaluacionNomi";
		inputMap = this.jButtonCerrarDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleEvaluacionNomi";
		inputMap = this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonGuardarCambiosDetalleEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleEvaluacionNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleEvaluacionNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonidDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_empresaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiDetalleEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuestaDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuestaDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"respuesta_valorDetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica1DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica1DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica2DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica2DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica3DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica3DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica4DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica4DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica5DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica5DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica6DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica6DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica7DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica7DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica8DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica8DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica9DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica9DetalleEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jButtoncalifica10DetalleEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"califica10DetalleEvaluacionNomiBusqueda"));
		
		
		this.jButtonFK_IdEvaluacionNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionNomiDetalleEvaluacionNomi"));

		this.jButtonFK_IdFormatoNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiDetalleEvaluacionNomi"));

		this.jButtonFK_IdPreguntaNomiDetalleEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaNomiDetalleEvaluacionNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleEvaluacionNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleEvaluacionNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
					detalleevaluacionnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomis) {
					detalleevaluacionnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleEvaluacionNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
						detalleevaluacionnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomis) {
						detalleevaluacionnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
					
						if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica1(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica2(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica3(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica4(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica5(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica6(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica7(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica8(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica9(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica10(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomis) {
						
						if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica1(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica2(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica3(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica4(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica5(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica6(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica7(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica8(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica9(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10)) {
							existe=true;
							detalleevaluacionnomiAux.setcalifica10(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleEvaluacionNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleEvaluacionNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleEvaluacionNomi.getSelectedRows();
			
			DetalleEvaluacionNomi detalleevaluacionnomiLocal=new DetalleEvaluacionNomi();
			
			//this.seleccionarTodosDetalleEvaluacionNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleevaluacionnomiLocal =(DetalleEvaluacionNomi) this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleevaluacionnomiLocal =(DetalleEvaluacionNomi) this.detalleevaluacionnomis.toArray()[this.jTableDatosDetalleEvaluacionNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleevaluacionnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
						detalleevaluacionnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomis) {
						detalleevaluacionnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleEvaluacionNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleEvaluacionNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleEvaluacionNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleEvaluacionNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleEvaluacionNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleEvaluacionNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
				
						if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA)) {
							existe=true;
							detalleevaluacionnomiAux.setrespuesta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR)) {
							existe=true;
							detalleevaluacionnomiAux.setrespuesta_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomis) {
					
						if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA)) {
							existe=true;
							detalleevaluacionnomiAux.setrespuesta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR)) {
							existe=true;
							detalleevaluacionnomiAux.setrespuesta_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleEvaluacionNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleEvaluacionNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleEvaluacionNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleEvaluacionNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleEvaluacionNomi(conSplash);
				
					this.generarReporteDetalleEvaluacionNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleEvaluacionNomisSeleccionados();
				//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleEvaluacionNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleEvaluacionNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleEvaluacionNomi();
				
				this.exportarDetalleEvaluacionNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleEvaluacionNomis();
				//this.importarDetalleEvaluacionNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleEvaluacionNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleEvaluacionNomisSeleccionados();
				//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleEvaluacionNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleEvaluacionNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleEvaluacionNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleEvaluacionNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleEvaluacionNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleEvaluacionNomi(conSplash);
					
						//this.actualizarParametrosGeneralDetalleEvaluacionNomi();
						
						this.generarReporteProcesoAccionDetalleEvaluacionNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Evaluacion NomiS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleEvaluacionNomi();
				
						this.actualizarParametrosGeneralDetalleEvaluacionNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleevaluacionnomiReturnGeneral=detalleevaluacionnomiLogic.procesarAccionDetalleEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis(),this.detalleevaluacionnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleEvaluacionNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleEvaluacionNomi();
					
					DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleEvaluacionNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleEvaluacionNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleEvaluacionNomi();
			
			if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
			DetalleEvaluacionNomi detalleevaluacionnomi=new DetalleEvaluacionNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleEvaluacionNomi.getSelectedItem();
			
			
			
			
			detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleevaluacionnomisSeleccionados.size()==1) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
					detalleevaluacionnomi=detalleevaluacionnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleEvaluacionNomi();
			
      		//this.finishProcessDetalleEvaluacionNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleEvaluacionNomiReturnGeneral() throws Exception {
		if(this.detalleevaluacionnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleevaluacionnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleevaluacionnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleevaluacionnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleevaluacionnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleevaluacionnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
		}
		
		if(this.detalleevaluacionnomiReturnGeneral.getConRetornoLista() || this.detalleevaluacionnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleevaluacionnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleevaluacionnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleevaluacionnomiLogic.setDetalleEvaluacionNomi(this.detalleevaluacionnomiReturnGeneral.getDetalleEvaluacionNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleEvaluacionNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleEvaluacionNomi() throws Exception {
		
		
	}
	
	public ArrayList<DetalleEvaluacionNomi> getDetalleEvaluacionNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleEvaluacionNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomiLogic.getDetalleEvaluacionNomis()) {
					if(detalleevaluacionnomiAux.getIsSelected()) {
						detalleevaluacionnomisSeleccionados.add(detalleevaluacionnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleEvaluacionNomi detalleevaluacionnomiAux:this.detalleevaluacionnomis) {
					if(detalleevaluacionnomiAux.getIsSelected()) {
						detalleevaluacionnomisSeleccionados.add(detalleevaluacionnomiAux);				
					}
				}
			}
			
			if(detalleevaluacionnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleevaluacionnomisSeleccionados.addAll(this.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleevaluacionnomisSeleccionados.addAll(this.detalleevaluacionnomis);				
					}
				}
			}
		} else {
			detalleevaluacionnomisSeleccionados.add(this.detalleevaluacionnomi);
		}
		
		return detalleevaluacionnomisSeleccionados;
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
	
	public void generarReporteDetalleEvaluacionNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleEvaluacionNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleEvaluacionNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Evaluacion Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleEvaluacionNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleEvaluacionNomi();
		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleEvaluacionNomi();
		
		
		//this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados ,detalleevaluacionnomiImplementable,detalleevaluacionnomiImplementableHome);
	}
	
	public void mostrarImportacionDetalleEvaluacionNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleEvaluacionNomi();
		
		this.abrirFrameImportacionDetalleEvaluacionNomi();		
		
			
		//this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados ,detalleevaluacionnomiImplementable,detalleevaluacionnomiImplementableHome);
	}
	
	public void importarDetalleEvaluacionNomis() throws Exception {		
	
	}
	
	public void exportarDetalleEvaluacionNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleEvaluacionNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleEvaluacionNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Evaluacion Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleEvaluacionNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleEvaluacionNomi(detalleevaluacionnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleevaluacionnomiAux.setsDetalleGeneralEntityReporte(detalleevaluacionnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleEvaluacionNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleevaluacionnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getevaluacionnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getformatonomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getpreguntanomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getrespuesta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getrespuesta_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica1().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica6().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica7().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica8().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica9().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleevaluacionnomi.getcalifica10().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleEvaluacionNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleEvaluacionNomi(row);				
				iRow++;
			}				
			
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleEvaluacionNomi(detalleevaluacionnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();		
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleevaluacionnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleevaluacionnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleevaluacionnomi");
			//elementRoot.appendChild(element);
		
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
				element = document.createElement("detalleevaluacionnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleEvaluacionNomi(detalleevaluacionnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleEvaluacionNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getevaluacionnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getformatonomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getpreguntanomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getrespuesta());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getrespuesta_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica1());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica2());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica3());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica4());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica5());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica6());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica7());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica8());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica9());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleevaluacionnomi.getcalifica10());				
	}
	
	public void setFilaDatosExportarXmlDetalleEvaluacionNomi(DetalleEvaluacionNomi detalleevaluacionnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleEvaluacionNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleevaluacionnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleEvaluacionNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleevaluacionnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleEvaluacionNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleevaluacionnomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementevaluacionnomi_descripcion = document.createElement(DetalleEvaluacionNomiConstantesFunciones.IDEVALUACIONNOMI);
		elementevaluacionnomi_descripcion.appendChild(document.createTextNode(detalleevaluacionnomi.getevaluacionnomi_descripcion()));
		element.appendChild(elementevaluacionnomi_descripcion);

		Element elementformatonomi_descripcion = document.createElement(DetalleEvaluacionNomiConstantesFunciones.IDFORMATONOMI);
		elementformatonomi_descripcion.appendChild(document.createTextNode(detalleevaluacionnomi.getformatonomi_descripcion()));
		element.appendChild(elementformatonomi_descripcion);

		Element elementpreguntanomi_descripcion = document.createElement(DetalleEvaluacionNomiConstantesFunciones.IDPREGUNTANOMI);
		elementpreguntanomi_descripcion.appendChild(document.createTextNode(detalleevaluacionnomi.getpreguntanomi_descripcion()));
		element.appendChild(elementpreguntanomi_descripcion);

		Element elementrespuesta = document.createElement(DetalleEvaluacionNomiConstantesFunciones.RESPUESTA);
		elementrespuesta.appendChild(document.createTextNode(detalleevaluacionnomi.getrespuesta().trim()));
		element.appendChild(elementrespuesta);

		Element elementrespuesta_valor = document.createElement(DetalleEvaluacionNomiConstantesFunciones.RESPUESTAVALOR);
		elementrespuesta_valor.appendChild(document.createTextNode(detalleevaluacionnomi.getrespuesta_valor().toString().trim()));
		element.appendChild(elementrespuesta_valor);

		Element elementcalifica1 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA1);
		elementcalifica1.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica1().toString().trim()));
		element.appendChild(elementcalifica1);

		Element elementcalifica2 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA2);
		elementcalifica2.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica2().toString().trim()));
		element.appendChild(elementcalifica2);

		Element elementcalifica3 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA3);
		elementcalifica3.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica3().toString().trim()));
		element.appendChild(elementcalifica3);

		Element elementcalifica4 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA4);
		elementcalifica4.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica4().toString().trim()));
		element.appendChild(elementcalifica4);

		Element elementcalifica5 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA5);
		elementcalifica5.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica5().toString().trim()));
		element.appendChild(elementcalifica5);

		Element elementcalifica6 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA6);
		elementcalifica6.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica6().toString().trim()));
		element.appendChild(elementcalifica6);

		Element elementcalifica7 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA7);
		elementcalifica7.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica7().toString().trim()));
		element.appendChild(elementcalifica7);

		Element elementcalifica8 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA8);
		elementcalifica8.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica8().toString().trim()));
		element.appendChild(elementcalifica8);

		Element elementcalifica9 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA9);
		elementcalifica9.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica9().toString().trim()));
		element.appendChild(elementcalifica9);

		Element elementcalifica10 = document.createElement(DetalleEvaluacionNomiConstantesFunciones.CALIFICA10);
		elementcalifica10.appendChild(document.createTextNode(detalleevaluacionnomi.getcalifica10().toString().trim()));
		element.appendChild(elementcalifica10);
	}
	
	public void generarReporteGroupGenericoDetalleEvaluacionNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados=new ArrayList<DetalleEvaluacionNomi>();
		
		detalleevaluacionnomisSeleccionados=this.getDetalleEvaluacionNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleEvaluacionNomi(detalleevaluacionnomisSeleccionados);
		
		this.generarReporteDetalleEvaluacionNomis("Todos",detalleevaluacionnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleEvaluacionNomi(ArrayList<DetalleEvaluacionNomi> detalleevaluacionnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleEvaluacionNomi detalleevaluacionnomiAux:detalleevaluacionnomisSeleccionados) {
				detalleevaluacionnomiAux.setsDetalleGeneralEntityReporte(detalleevaluacionnomiAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionnomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionnomiAux.getevaluacionnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionnomiAux.getformatonomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionnomiAux.getpreguntanomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(detalleevaluacionnomiAux.getrespuesta());
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica1()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica2()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica3()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica4()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica5()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica6()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica7()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica8()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica9()));
				}
				 else if(sTipoSeleccionar.equals(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10)) {
					existe=true;
					detalleevaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detalleevaluacionnomiAux.getcalifica10()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleEvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleEvaluacionNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarDetalleEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleEvaluacionNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=true;
		} else {
			this.actualizarEstadoPanelsDetalleEvaluacionNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleEvaluacionNomi=false;
			//this.isVisibilidadCeldaVerFormDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaDuplicarDetalleEvaluacionNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleEvaluacionNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(!detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;												
			}
			
			this.jButtonCerrarDetalleEvaluacionNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleEvaluacionNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleevaluacionnomi)) {
			this.isVisibilidadCeldaActualizarDetalleEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarDetalleEvaluacionNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleEvaluacionNomi() {
	}
	
	public void actualizarEstadoPanelsDetalleEvaluacionNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleEvaluacionNomi!=null) {
				this.jScrollPanelDatosDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleEvaluacionNomi!=null) {
				this.jPanelPaginacionDetalleEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
					this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleEvaluacionNomi!=null) {
				this.jPanelParametrosReportesDetalleEvaluacionNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEvaluacionNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEvaluacionNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEvaluacionNomi(Boolean isParaEvaluacionNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEvaluacionNomiNegation=!isParaEvaluacionNomi;

			this.isVisibilidadFK_IdEvaluacionNomi=isParaEvaluacionNomi;
			if(!this.isVisibilidadFK_IdEvaluacionNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEvaluacionNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaEvaluacionNomiNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomi(Boolean isParaFormatoNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiNegation=!isParaFormatoNomi;

			this.isVisibilidadFK_IdEvaluacionNomi=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdEvaluacionNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFormatoNomi;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaPreguntaNomi(Boolean isParaPreguntaNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPreguntaNomiNegation=!isParaPreguntaNomi;

			this.isVisibilidadFK_IdEvaluacionNomi=isParaPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdEvaluacionNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaPreguntaNomi;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		
		if(this.detalleevaluacionnomiSessionBean==null) {
			this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		}
		
		this.detalleevaluacionnomiSessionBean.setsUltimaBusquedaDetalleEvaluacionNomi(this.getsAccionBusqueda());
		this.detalleevaluacionnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleevaluacionnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleevaluacionnomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionNomi")) {
			detalleevaluacionnomiSessionBean.setid_evaluacion_nomi(this.getid_evaluacion_nomiFK_IdEvaluacionNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
			detalleevaluacionnomiSessionBean.setid_formato_nomi(this.getid_formato_nomiFK_IdFormatoNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPreguntaNomi")) {
			detalleevaluacionnomiSessionBean.setid_pregunta_nomi(this.getid_pregunta_nomiFK_IdPreguntaNomi());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		
		if(this.detalleevaluacionnomiSessionBean==null) {
			this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		}
		
		if(this.detalleevaluacionnomiSessionBean.getsUltimaBusquedaDetalleEvaluacionNomi()!=null&&!this.detalleevaluacionnomiSessionBean.getsUltimaBusquedaDetalleEvaluacionNomi().equals("")) {
			this.setsAccionBusqueda(detalleevaluacionnomiSessionBean.getsUltimaBusquedaDetalleEvaluacionNomi());
			this.setiNumeroPaginacion(detalleevaluacionnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleevaluacionnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleevaluacionnomiSessionBean.getid_empresa());
				detalleevaluacionnomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionNomi")) {
				this.setid_evaluacion_nomiFK_IdEvaluacionNomi(detalleevaluacionnomiSessionBean.getid_evaluacion_nomi());
				detalleevaluacionnomiSessionBean.setid_evaluacion_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
				this.setid_formato_nomiFK_IdFormatoNomi(detalleevaluacionnomiSessionBean.getid_formato_nomi());
				detalleevaluacionnomiSessionBean.setid_formato_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPreguntaNomi")) {
				this.setid_pregunta_nomiFK_IdPreguntaNomi(detalleevaluacionnomiSessionBean.getid_pregunta_nomi());
				detalleevaluacionnomiSessionBean.setid_pregunta_nomi(-1L);
			}
		}
		
		this.detalleevaluacionnomiSessionBean.setsUltimaBusquedaDetalleEvaluacionNomi("");
		this.detalleevaluacionnomiSessionBean.setiNumeroPaginacion(DetalleEvaluacionNomiConstantesFunciones.INUMEROPAGINACION);
		this.detalleevaluacionnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleEvaluacionNomi() {
		this.updateBorderResaltarBusquedasFormularioDetalleEvaluacionNomi();
		this.updateVisibilidadBusquedasFormularioDetalleEvaluacionNomi();
		this.updateHabilitarBusquedasFormularioDetalleEvaluacionNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleEvaluacionNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponents().length>0) {
	

		if(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdEvaluacionNomiDetalleEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			}
		}

		if(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiDetalleEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiDetalleEvaluacionNomi);
			}
		}

		if(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdPreguntaNomiDetalleEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdPreguntaNomiDetalleEvaluacionNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleEvaluacionNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			if(!this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdEvaluacionNomiDetalleEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdFormatoNomiDetalleEvaluacionNomi);
			if(!this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdFormatoNomiDetalleEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdPreguntaNomiDetalleEvaluacionNomi);
			if(!this.detalleevaluacionnomiConstantesFunciones.mostrarFK_IdPreguntaNomiDetalleEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleEvaluacionNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarFK_IdEvaluacionNomiDetalleEvaluacionNomi);
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setEnabledAt(index,this.detalleevaluacionnomiConstantesFunciones.activarFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarFK_IdFormatoNomiDetalleEvaluacionNomi);
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setEnabledAt(index,this.detalleevaluacionnomiConstantesFunciones.activarFK_IdFormatoNomiDetalleEvaluacionNomi);
			}

			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarFK_IdPreguntaNomiDetalleEvaluacionNomi);
				this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setEnabledAt(index,this.detalleevaluacionnomiConstantesFunciones.activarFK_IdPreguntaNomiDetalleEvaluacionNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleEvaluacionNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEvaluacionNomi")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEvaluacionNomiDetalleEvaluacionNomi);

			this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);

			this.detalleevaluacionnomiConstantesFunciones.setResaltarFK_IdEvaluacionNomiDetalleEvaluacionNomi(resaltar);

			jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdEvaluacionNomiDetalleEvaluacionNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomi")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiDetalleEvaluacionNomi);

			this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);

			this.detalleevaluacionnomiConstantesFunciones.setResaltarFK_IdFormatoNomiDetalleEvaluacionNomi(resaltar);

			jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiDetalleEvaluacionNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPreguntaNomi")) {
			index= this.jTabbedPaneBusquedasDetalleEvaluacionNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiDetalleEvaluacionNomi);

			this.jTabbedPaneBusquedasDetalleEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleEvaluacionNomi.getComponent(index);

			this.detalleevaluacionnomiConstantesFunciones.setResaltarFK_IdPreguntaNomiDetalleEvaluacionNomi(resaltar);

			jPanel.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarFK_IdPreguntaNomiDetalleEvaluacionNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleEvaluacionNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleEvaluacionNomi() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleEvaluacionNomi();
		this.updateVisibilidadResaltarControlesFormularioDetalleEvaluacionNomi();
		this.updateHabilitarResaltarControlesFormularioDetalleEvaluacionNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleEvaluacionNomi() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleevaluacionnomiConstantesFunciones.resaltaridDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltaridDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarid_empresaDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarid_empresaDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarid_evaluacion_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarid_evaluacion_nomiDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarid_formato_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarid_formato_nomiDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarid_pregunta_nomiDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarid_pregunta_nomiDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuestaDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuestaDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuesta_valorDetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarrespuesta_valorDetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica1DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica1DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica2DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica2DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica3DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica3DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica4DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica4DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica5DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica5DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica6DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica6DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica7DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica7DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica8DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica8DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica9DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica9DetalleEvaluacionNomi);}
		if(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica10DetalleEvaluacionNomi!=null && this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setBorder(this.detalleevaluacionnomiConstantesFunciones.resaltarcalifica10DetalleEvaluacionNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleEvaluacionNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
	
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostraridDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelidDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostraridDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_empresaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelid_empresaDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_empresaDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_evaluacion_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_evaluacion_nomiDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_formato_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelid_formato_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_formato_nomiDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_pregunta_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelid_pregunta_nomiDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarid_pregunta_nomiDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuestaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelrespuestaDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuestaDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuesta_valorDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelrespuesta_valorDetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarrespuesta_valorDetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica1DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica1DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica1DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica2DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica2DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica2DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica3DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica3DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica3DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica4DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica4DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica4DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica5DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica5DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica5DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica6DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica6DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica6DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica7DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica7DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica7DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica8DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica8DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica8DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica9DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica9DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica9DetalleEvaluacionNomi);
		//this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica10DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jPanelcalifica10DetalleEvaluacionNomi.setVisible(this.detalleevaluacionnomiConstantesFunciones.mostrarcalifica10DetalleEvaluacionNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleEvaluacionNomi() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleEvaluacionNomi!=null) {
	
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jLabelidDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activaridDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_empresaDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarid_empresaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarid_evaluacion_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_formato_nomiDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarid_formato_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarid_pregunta_nomiDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextArearespuestaDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarrespuestaDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jTextFieldrespuesta_valorDetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarrespuesta_valorDetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica1DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica1DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica2DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica2DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica3DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica3DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica4DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica4DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica5DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica5DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica6DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica6DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica7DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica7DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica8DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica8DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica9DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica9DetalleEvaluacionNomi);
		this.jInternalFrameDetalleFormDetalleEvaluacionNomi.jCheckBoxcalifica10DetalleEvaluacionNomi.setEnabled(this.detalleevaluacionnomiConstantesFunciones.activarcalifica10DetalleEvaluacionNomi);
		}
	}
	
		
}