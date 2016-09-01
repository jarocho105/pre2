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

import com.bydan.erp.nomina.util.DetalleCursoConstantesFunciones;
import com.bydan.erp.nomina.util.DetalleCursoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DetalleCursoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.DetalleCursoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class DetalleCursoBeanSwingJInternalFrame extends DetalleCursoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleCursoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleCurso> detallecursoValidator = new ClassValidator<DetalleCurso>(DetalleCurso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleCurso detallecurso;	
	public DetalleCurso detallecursoAux;
	public DetalleCurso detallecursoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleCurso detallecursoTotales;
	public Long idDetalleCursoActual;
	public Long iIdNuevoDetalleCurso=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCurso="";

	public List<Curso> cursosForeignKey;

	public List<Curso> getcursosForeignKey() {
		return cursosForeignKey;
	}

	public void setcursosForeignKey(List<Curso> cursosForeignKey) {
		this.cursosForeignKey = cursosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Curso cursoForeignKey;

	public Curso getcursoForeignKey() {
		return cursoForeignKey;
	}

	public void setcursoForeignKey(Curso cursoForeignKey) {
		this.cursoForeignKey = cursoForeignKey;
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
	
	public Boolean isPermisoTodoDetalleCurso;
	public Boolean isPermisoNuevoDetalleCurso;
	public Boolean isPermisoActualizarDetalleCurso;
	public Boolean isPermisoActualizarOriginalDetalleCurso;
	public Boolean isPermisoEliminarDetalleCurso;
	public Boolean isPermisoGuardarCambiosDetalleCurso;
	public Boolean isPermisoConsultaDetalleCurso;
	public Boolean isPermisoBusquedaDetalleCurso;
	public Boolean isPermisoReporteDetalleCurso;
	public Boolean isPermisoPaginacionMedioDetalleCurso;
	public Boolean isPermisoPaginacionAltoDetalleCurso;
	public Boolean isPermisoPaginacionTodoDetalleCurso;
	public Boolean isPermisoCopiarDetalleCurso;
	public Boolean isPermisoVerFormDetalleCurso;
	public Boolean isPermisoDuplicarDetalleCurso;
	public Boolean isPermisoOrdenDetalleCurso;
	
	
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
	
	public DetalleCursoParameterReturnGeneral detallecursoReturnGeneral;
	public DetalleCursoParameterReturnGeneral detallecursoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleCurso=false;
	public Boolean esParaAccionDesdeFormularioDetalleCurso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleCursoSessionBeanAdditional detallecursoSessionBeanAdditional=null;
	
	public DetalleCursoSessionBeanAdditional getDetalleCursoSessionBeanAdditional() {
		return this.detallecursoSessionBeanAdditional;
	}
	
	public void setDetalleCursoSessionBeanAdditional(DetalleCursoSessionBeanAdditional detallecursoSessionBeanAdditional) {
		try {
			this.detallecursoSessionBeanAdditional=detallecursoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleCursoBeanSwingJInternalFrameAdditional detallecursoBeanSwingJInternalFrameAdditional=null;
	//public class DetalleCursoBeanSwingJInternalFrame
	
	public DetalleCursoBeanSwingJInternalFrameAdditional getDetalleCursoBeanSwingJInternalFrameAdditional() {
		return this.detallecursoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleCursoBeanSwingJInternalFrameAdditional(DetalleCursoBeanSwingJInternalFrameAdditional detallecursoBeanSwingJInternalFrameAdditional) {
		try {
			this.detallecursoBeanSwingJInternalFrameAdditional=detallecursoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleCursoLogic detallecursoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleCurso detallecursoBean;
	public DetalleCursoConstantesFunciones detallecursoConstantesFunciones;
	//public DetalleCursoParameterReturnGeneral detallecursoReturnGeneral;
	
	//FK
	
	public CursoLogic cursoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleCurso> detallecursos;	
	//public List<DetalleCurso> detallecursosEliminados;
	//public List<DetalleCurso> detallecursosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleCurso=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleCurso=true;
	public Boolean isVisibilidadCeldaCopiarDetalleCurso=true;
	public Boolean isVisibilidadCeldaVerFormDetalleCurso=true;
	public Boolean isVisibilidadCeldaOrdenDetalleCurso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
	public Boolean isVisibilidadCeldaModificarDetalleCurso=false;
	public Boolean isVisibilidadCeldaActualizarDetalleCurso=false;
	public Boolean isVisibilidadCeldaEliminarDetalleCurso=false;
	public Boolean isVisibilidadCeldaCancelarDetalleCurso=false;
	public Boolean isVisibilidadCeldaGuardarDetalleCurso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleCurso=false;	
	
	
	public Boolean isVisibilidadFK_IdCurso=false;
	
	public Long getiIdNuevoDetalleCurso() {
		return this.iIdNuevoDetalleCurso;
	}

	public void setiIdNuevoDetalleCurso(Long iIdNuevoDetalleCurso) {
		this.iIdNuevoDetalleCurso = iIdNuevoDetalleCurso;
	}
	
	public Long getidDetalleCursoActual() {
		return this.idDetalleCursoActual;
	}

	public void setidDetalleCursoActual(Long idDetalleCursoActual) {
		this.idDetalleCursoActual = idDetalleCursoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleCurso getdetallecurso() {
		return this.detallecurso;
	}

	public void setdetallecurso(DetalleCurso detallecurso) {
		this.detallecurso = detallecurso;
	}
	
	public DetalleCurso getdetallecursoAux() {
		return this.detallecursoAux;
	}

	public void setdetallecursoAux(DetalleCurso detallecursoAux) {
		this.detallecursoAux = detallecursoAux;
	}				
	
	public DetalleCurso getdetallecursoAnterior() {
		return this.detallecursoAnterior;
	}

	public void setdetallecursoAnterior(DetalleCurso detallecursoAnterior) {
		this.detallecursoAnterior = detallecursoAnterior;
	}	
	
	public DetalleCurso getdetallecursoTotales() {
		return this.detallecursoTotales;
	}

	public void setdetallecursoTotales(DetalleCurso detallecursoTotales) {
		this.detallecursoTotales = detallecursoTotales;
	}	
	
	public DetalleCurso getdetallecursoBean() {
		return this.detallecursoBean;
	}

	public void setdetallecursoBean(DetalleCurso detallecursoBean) {
		this.detallecursoBean = detallecursoBean;
	}	
	
	public DetalleCursoParameterReturnGeneral getdetallecursoReturnGeneral() {
		return this.detallecursoReturnGeneral;
	}

	public void setdetallecursoReturnGeneral(DetalleCursoParameterReturnGeneral detallecursoReturnGeneral) {
		this.detallecursoReturnGeneral = detallecursoReturnGeneral;
	}	
	
	
	public Long id_cursoFK_IdCurso=-1L;

	public Long getid_cursoFK_IdCurso() {
		return this.id_cursoFK_IdCurso;
	}

	public void setid_cursoFK_IdCurso(Long id_cursoFK_IdCurso) {
		this.id_cursoFK_IdCurso = id_cursoFK_IdCurso;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleCursoLogic getDetalleCursoLogic()	{		
		return detallecursoLogic;
	}

	public void setDetalleCursoLogic(DetalleCursoLogic detallecursoLogic) {
		this.detallecursoLogic = detallecursoLogic;
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
	
	public Boolean getIsEsNuevoDetalleCurso() {
		return isEsNuevoDetalleCurso;
	}

	public void setIsEsNuevoDetalleCurso(Boolean isEsNuevoDetalleCurso) {
		this.isEsNuevoDetalleCurso = isEsNuevoDetalleCurso;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleCurso() {
		return esParaAccionDesdeFormularioDetalleCurso;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleCurso(Boolean esParaAccionDesdeFormularioDetalleCurso) {
		this.esParaAccionDesdeFormularioDetalleCurso = esParaAccionDesdeFormularioDetalleCurso;
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
	
	
	public void cargarCombosCursosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cursosForeignKey=new ArrayList<Curso>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CursoLogic cursoLogic=new CursoLogic();

			cursoLogic.getCursoDataAccess().setIsForForeingKeyData(true);

			if(this.detallecursoSessionBean==null) {
				this.detallecursoSessionBean=new DetalleCursoSessionBean();
			}

			if(!this.detallecursoSessionBean.getisBusquedaDesdeForeignKeySesionCurso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getCursoDataAccess().setIsForForeingKeyData(true);

					cursoLogic.getTodosCursosWithConnection(sFinalQuery,new Pagination());

					this.cursosForeignKey=cursoLogic.getCursos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCurso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getEntityWithConnection(detallecursoSessionBean.getlidCursoActual());
					this.cursosForeignKey.add(cursoLogic.getCurso());
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

	
	
	public void setActualCursoForeignKey(Long idCursoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Curso  cursoTemp=null;

			for(Curso cursoAux:cursosForeignKey) {
				if(cursoAux.getId()!=null && cursoAux.getId().equals(idCursoSeleccionado)) {
					cursoTemp=cursoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cursoTemp!=null) {

					if(this.detallecurso!=null) {
						this.detallecurso.setCurso(cursoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
						this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setSelectedItem(cursoTemp);
					}
				} else {
					//jComboBoxid_cursoDetalleCurso.setSelectedItem(cursoTemp);
					if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
						if(this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCurso") || sFormularioTipoBusqueda.equals("Todos")){
					if(cursoTemp!=null && jComboBoxid_cursoFK_IdCursoDetalleCurso!=null) {
						jComboBoxid_cursoFK_IdCursoDetalleCurso.setSelectedItem(cursoTemp);
					} else {
						if(jComboBoxid_cursoFK_IdCursoDetalleCurso!=null) {
							//jComboBoxid_cursoFK_IdCursoDetalleCurso.setSelectedItem(cursoTemp);
							if(jComboBoxid_cursoFK_IdCursoDetalleCurso.getItemCount()>0) {
								jComboBoxid_cursoFK_IdCursoDetalleCurso.setSelectedIndex(0);
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

	public String getActualCursoForeignKeyDescripcion(Long idCursoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Curso  cursoTemp=null;

			for(Curso cursoAux:cursosForeignKey) {
				if(cursoAux.getId()!=null && cursoAux.getId().equals(idCursoSeleccionado)) {
					cursoTemp=cursoAux;
					break;
				}
			}


			sDescripcion=CursoConstantesFunciones.getCursoDescripcion(cursoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCursoForeignKeyGenerico(Long idCursoSeleccionado,JComboBox jComboBoxid_cursoDetalleCursoGenerico)throws Exception
	{
		try
		{
			Curso  cursoTemp=null;

			for(Curso cursoAux:cursosForeignKey) {
				if(cursoAux.getId()!=null && cursoAux.getId().equals(idCursoSeleccionado)) {
					cursoTemp=cursoAux;
					break;
				}
			}

			if(cursoTemp!=null) {
				jComboBoxid_cursoDetalleCursoGenerico.setSelectedItem(cursoTemp);
			} else {
				if(jComboBoxid_cursoDetalleCursoGenerico!=null && jComboBoxid_cursoDetalleCursoGenerico.getItemCount()>0) {
					jComboBoxid_cursoDetalleCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCursoForeignKey(DetalleCurso detallecurso,JComboBox jComboBoxid_cursoDetalleCursoGenerico)throws Exception
	{
		try
		{
			Curso  cursoAux=new Curso();

			if(jComboBoxid_cursoDetalleCursoGenerico==null) {
				cursoAux=(Curso)this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.getSelectedItem();
			} else {
				cursoAux=(Curso)jComboBoxid_cursoDetalleCursoGenerico.getSelectedItem();
			}

			if(cursoAux!=null && cursoAux.getId()!=null) {
				detallecurso.setid_curso(cursoAux.getId());
				detallecurso.setcurso_descripcion(DetalleCursoConstantesFunciones.getCursoDescripcion(cursoAux));
				detallecurso.setCurso(cursoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCursosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCurso=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleCurso!=null) { 
							this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.removeAllItems();

							for(Curso curso:this.cursosForeignKey) {
								this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.addItem(curso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleCurso!=null) { 
					}

					if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCurso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cursoFK_IdCursoDetalleCurso.removeAllItems();

							for(Curso curso:this.cursosForeignKey) {
								this.jComboBoxid_cursoFK_IdCursoDetalleCurso.addItem(curso);
							}
						}

						if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCursoForeignKey(Curso curso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
							this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setSelectedItem(curso);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
							this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cursoFK_IdCursoDetalleCurso.setSelectedItem(curso);
						} else {
							this.jComboBoxid_cursoFK_IdCursoDetalleCurso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleCurso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleCursoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleCurso(this.detallecursoLogic.getDetalleCursos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleCursoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleCurso(this.detallecursos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Curso.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallecursoLogic.setDetalleCursos(this.detallecursos);
			detallecursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleCursoParameterReturnGeneral getDetalleCursoParameterGeneral() {
		return this.detallecursoParameterGeneral;
	}
	
	public void setDetalleCursoParameterGeneral(DetalleCursoParameterReturnGeneral detallecursoParameterGeneral) {
		this.detallecursoParameterGeneral = detallecursoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleCurso() {
		return isPermisoTodoDetalleCurso;
	}

	public void setIsPermisoTodoDetalleCurso(Boolean isPermisoTodoDetalleCurso) {
		this.isPermisoTodoDetalleCurso = isPermisoTodoDetalleCurso;
	}

	public Boolean getIsPermisoNuevoDetalleCurso() {
		return isPermisoNuevoDetalleCurso;
	}

	public void setIsPermisoNuevoDetalleCurso(Boolean isPermisoNuevoDetalleCurso) {
		this.isPermisoNuevoDetalleCurso = isPermisoNuevoDetalleCurso;
	}

	public Boolean getIsPermisoActualizarDetalleCurso() {
		return isPermisoActualizarDetalleCurso;
	}

	public void setIsPermisoActualizarDetalleCurso(Boolean isPermisoActualizarDetalleCurso) {
		this.isPermisoActualizarDetalleCurso = isPermisoActualizarDetalleCurso;
	}

	public Boolean getIsPermisoEliminarDetalleCurso() {
		return isPermisoEliminarDetalleCurso;
	}

	public void setIsPermisoEliminarDetalleCurso(Boolean isPermisoEliminarDetalleCurso) {
		this.isPermisoEliminarDetalleCurso = isPermisoEliminarDetalleCurso;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleCurso() {
		return isPermisoGuardarCambiosDetalleCurso;
	}

	public void setIsPermisoGuardarCambiosDetalleCurso(Boolean isPermisoGuardarCambiosDetalleCurso) {
		this.isPermisoGuardarCambiosDetalleCurso = isPermisoGuardarCambiosDetalleCurso;
	}
	
	public Boolean getIsPermisoConsultaDetalleCurso() {
		return isPermisoConsultaDetalleCurso;
	}

	public void setIsPermisoConsultaDetalleCurso(Boolean isPermisoConsultaDetalleCurso) {
		this.isPermisoConsultaDetalleCurso = isPermisoConsultaDetalleCurso;
	}

	public Boolean getIsPermisoBusquedaDetalleCurso() {
		return isPermisoBusquedaDetalleCurso;
	}

	public void setIsPermisoBusquedaDetalleCurso(Boolean isPermisoBusquedaDetalleCurso) {
		this.isPermisoBusquedaDetalleCurso = isPermisoBusquedaDetalleCurso;
	}

	public Boolean getIsPermisoReporteDetalleCurso() {
		return isPermisoReporteDetalleCurso;
	}

	public void setIsPermisoReporteDetalleCurso(Boolean isPermisoReporteDetalleCurso) {
		this.isPermisoReporteDetalleCurso = isPermisoReporteDetalleCurso;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleCurso() {
		return isPermisoPaginacionMedioDetalleCurso;
	}

	public void setIsPermisoPaginacionMedioDetalleCurso(Boolean isPermisoPaginacionMedioDetalleCurso) {
		this.isPermisoPaginacionMedioDetalleCurso = isPermisoPaginacionMedioDetalleCurso;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleCurso() {
		return isPermisoPaginacionTodoDetalleCurso;
	}

	public void setIsPermisoPaginacionTodoDetalleCurso(Boolean isPermisoPaginacionTodoDetalleCurso) {
		this.isPermisoPaginacionTodoDetalleCurso = isPermisoPaginacionTodoDetalleCurso;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleCurso() {
		return isPermisoPaginacionAltoDetalleCurso;
	}

	public void setIsPermisoPaginacionAltoDetalleCurso(Boolean isPermisoPaginacionAltoDetalleCurso) {
		this.isPermisoPaginacionAltoDetalleCurso = isPermisoPaginacionAltoDetalleCurso;
	}
	
	public Boolean getIsPermisoCopiarDetalleCurso() {
		return isPermisoCopiarDetalleCurso;
	}

	public void setIsPermisoCopiarDetalleCurso(Boolean isPermisoCopiarDetalleCurso) {
		this.isPermisoCopiarDetalleCurso = isPermisoCopiarDetalleCurso;
	}
	
	public Boolean getIsPermisoVerFormDetalleCurso() {
		return isPermisoVerFormDetalleCurso;
	}

	public void setIsPermisoVerFormDetalleCurso(Boolean isPermisoVerFormDetalleCurso) {
		this.isPermisoVerFormDetalleCurso = isPermisoVerFormDetalleCurso;
	}
	
	public Boolean getIsPermisoDuplicarDetalleCurso() {
		return isPermisoDuplicarDetalleCurso;
	}

	public void setIsPermisoDuplicarDetalleCurso(Boolean isPermisoDuplicarDetalleCurso) {
		this.isPermisoDuplicarDetalleCurso = isPermisoDuplicarDetalleCurso;
	}
	
	public Boolean getIsPermisoOrdenDetalleCurso() {
		return isPermisoOrdenDetalleCurso;
	}

	public void setIsPermisoOrdenDetalleCurso(Boolean isPermisoOrdenDetalleCurso) {
		this.isPermisoOrdenDetalleCurso = isPermisoOrdenDetalleCurso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleCurso() {
		return isVisibilidadCeldaNuevoDetalleCurso;
	}

	public void setIsVisibilidadCeldaNuevoDetalleCurso(Boolean isVisibilidadCeldaNuevoDetalleCurso) {
		this.isVisibilidadCeldaNuevoDetalleCurso = isVisibilidadCeldaNuevoDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleCurso() {
		return isVisibilidadCeldaDuplicarDetalleCurso;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleCurso(Boolean isVisibilidadCeldaDuplicarDetalleCurso) {
		this.isVisibilidadCeldaDuplicarDetalleCurso = isVisibilidadCeldaDuplicarDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleCurso() {
		return isVisibilidadCeldaCopiarDetalleCurso;
	}

	public void setIsVisibilidadCeldaCopiarDetalleCurso(Boolean isVisibilidadCeldaCopiarDetalleCurso) {
		this.isVisibilidadCeldaCopiarDetalleCurso = isVisibilidadCeldaCopiarDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleCurso() {
		return isVisibilidadCeldaVerFormDetalleCurso;
	}

	public void setIsVisibilidadCeldaVerFormDetalleCurso(Boolean isVisibilidadCeldaVerFormDetalleCurso) {
		this.isVisibilidadCeldaVerFormDetalleCurso = isVisibilidadCeldaVerFormDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleCurso() {
		return isVisibilidadCeldaOrdenDetalleCurso;
	}

	public void setIsVisibilidadCeldaOrdenDetalleCurso(Boolean isVisibilidadCeldaOrdenDetalleCurso) {
		this.isVisibilidadCeldaOrdenDetalleCurso = isVisibilidadCeldaOrdenDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleCurso() {
		return isVisibilidadCeldaNuevoRelacionesDetalleCurso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleCurso(Boolean isVisibilidadCeldaNuevoRelacionesDetalleCurso) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleCurso = isVisibilidadCeldaNuevoRelacionesDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleCurso() {
		return isVisibilidadCeldaModificarDetalleCurso;
	}

	public void setIsVisibilidadCeldaModificarDetalleCurso(Boolean isVisibilidadCeldaModificarDetalleCurso) {
		this.isVisibilidadCeldaModificarDetalleCurso = isVisibilidadCeldaModificarDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleCurso() {
		return isVisibilidadCeldaActualizarDetalleCurso;
	}

	public void setIsVisibilidadCeldaActualizarDetalleCurso(Boolean isVisibilidadCeldaActualizarDetalleCurso) {
		this.isVisibilidadCeldaActualizarDetalleCurso = isVisibilidadCeldaActualizarDetalleCurso;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleCurso() {
		return isVisibilidadCeldaEliminarDetalleCurso;
	}

	public void setIsVisibilidadCeldaEliminarDetalleCurso(Boolean isVisibilidadCeldaEliminarDetalleCurso) {
		this.isVisibilidadCeldaEliminarDetalleCurso = isVisibilidadCeldaEliminarDetalleCurso;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleCurso() {
		return isVisibilidadCeldaCancelarDetalleCurso;
	}

	public void setIsVisibilidadCeldaCancelarDetalleCurso(Boolean isVisibilidadCeldaCancelarDetalleCurso) {
		this.isVisibilidadCeldaCancelarDetalleCurso = isVisibilidadCeldaCancelarDetalleCurso;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleCurso() {
		return isVisibilidadCeldaGuardarDetalleCurso;
	}

	public void setIsVisibilidadCeldaGuardarDetalleCurso(Boolean isVisibilidadCeldaGuardarDetalleCurso) {
		this.isVisibilidadCeldaGuardarDetalleCurso = isVisibilidadCeldaGuardarDetalleCurso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleCurso() {
		return isVisibilidadCeldaGuardarCambiosDetalleCurso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleCurso(Boolean isVisibilidadCeldaGuardarCambiosDetalleCurso) {
		this.isVisibilidadCeldaGuardarCambiosDetalleCurso = isVisibilidadCeldaGuardarCambiosDetalleCurso;
	}
		
	public DetalleCursoSessionBean getdetallecursoSessionBean() {
		return this.detallecursoSessionBean;
	}
	
	public void setdetallecursoSessionBean(DetalleCursoSessionBean detallecursoSessionBean) {
		this.detallecursoSessionBean=detallecursoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCurso() {
		return this.isVisibilidadFK_IdCurso;
	}

	public void setisVisibilidadFK_IdCurso(Boolean isVisibilidadFK_IdCurso) {
		this.isVisibilidadFK_IdCurso=isVisibilidadFK_IdCurso;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(DetalleCurso detallecurso)throws Exception {
		try {
			
				this.setActualParaGuardarCursoForeignKey(detallecurso,null);
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
	
	public void bugActualizarReferenciaActual(DetalleCurso detallecurso,DetalleCurso detallecursoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleCurso(detallecurso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallecursoAux.setId(detallecurso.getId());
		detallecursoAux.setVersionRow(detallecurso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleCurso();
		
			int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallecursoValidator.getInvalidValues(this.detallecurso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallecursoLogic.setDatosCliente(datosCliente);
			detallecursoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallecursoAux=new  DetalleCurso();
				
				detallecursoAux.setIsNew(true);
				detallecursoAux.setIsChanged(true);
				
				detallecursoAux.setDetalleCursoOriginal(this.detallecurso);
				
				detallecursoAux.setId(this.detallecurso.getId());	
				detallecursoAux.setVersionRow(this.detallecurso.getVersionRow());	
				detallecursoAux.setid_curso(this.detallecurso.getid_curso());	
				detallecursoAux.setnombre(this.detallecurso.getnombre());	
				detallecursoAux.setdescripcion(this.detallecurso.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallecursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecursoAux,detallecursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoLogic.saveDetalleCursos();//WithConnection
						//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecursoLogic.saveDetalleCursoRelaciones(detallecursoAux);//WithConnection
								//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallecursoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallecursoAux,detallecursos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallecursoAux=new  DetalleCurso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallecursoSessionBean.getEsGuardarRelacionado() 
					|| (this.detallecursoSessionBean.getEsGuardarRelacionado() && this.detallecurso.getId()>=0)) {
						
					detallecursoAux.setIsNew(false);
				}
				
				detallecursoAux.setIsDeleted(false);
			
				detallecursoAux.setId(this.detallecurso.getId());	
				detallecursoAux.setVersionRow(this.detallecurso.getVersionRow());	
				detallecursoAux.setid_curso(this.detallecurso.getid_curso());	
				detallecursoAux.setnombre(this.detallecurso.getnombre());	
				detallecursoAux.setdescripcion(this.detallecurso.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecursoAux,detallecursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoLogic.saveDetalleCursos();//WithConnection
						//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecursoLogic.saveDetalleCursoRelaciones(detallecursoAux);//WithConnection
								//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallecursoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallecursoAux,detallecursos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallecurso,detallecursoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallecursoAux=new  DetalleCurso();
				
				detallecursoAux.setIsNew(false);
				detallecursoAux.setIsChanged(false);
				
				detallecursoAux.setIsDeleted(true);
				
				detallecursoAux.setId(this.detallecurso.getId());	
				detallecursoAux.setVersionRow(this.detallecurso.getVersionRow());	
				detallecursoAux.setid_curso(this.detallecurso.getid_curso());	
				detallecursoAux.setnombre(this.detallecurso.getnombre());	
				detallecursoAux.setdescripcion(this.detallecurso.getdescripcion());	
				
				if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallecursoAux.getId()>=0) {	
						this.detallecursosEliminados.add(detallecursoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecursoAux,detallecursos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoLogic.saveDetalleCursos();//WithConnection
						//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecursoLogic.saveDetalleCursoRelaciones(detallecursoAux);//WithConnection
								//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
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
							if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallecursoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallecursoAux,detallecursoLogic.getDetalleCursos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallecursoAux,detallecursos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.getDetalleCursos().addAll(this.detallecursosEliminados);
					
					detallecursoLogic.saveDetalleCursos();//WithConnection
					//detallecursoLogic.getSetVersionRowDetalleCursos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleCurso();
				
				this.detallecursosEliminados= new ArrayList<DetalleCurso>();		
			}
			
			if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Curso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallecurso=detallecursoAux;
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
      		//this.finishProcessDetalleCurso();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleCurso detallecursoLocal) throws Exception {
		
		if(this.detallecursoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleCurso detallecursoLocal) throws Exception {	
		if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CursoDetalleFormJInternalFrame.class)) {
				CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrameLocal=(CursoBeanSwingJInternalFrame) ((CursoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cursoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCurso(cursoBeanSwingJInternalFrameLocal.getcurso(),true);
				cursoBeanSwingJInternalFrameLocal.actualizarLista(cursoBeanSwingJInternalFrameLocal.curso,this.cursosForeignKey);

				cursoBeanSwingJInternalFrameLocal.actualizarRelaciones(cursoBeanSwingJInternalFrameLocal.curso);

				detallecursoLocal.setCurso(cursoBeanSwingJInternalFrameLocal.curso);

				this.addItemDefectoCombosForeignKeyCurso();
				this.cargarCombosFrameCursosForeignKey("Formulario");
				this.setActualCursoForeignKey(cursoBeanSwingJInternalFrameLocal.curso.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleCursoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallecursoValidator.getInvalidValues(this.detallecurso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleCurso detallecurso,List<DetalleCurso> detallecursos) throws Exception {
		try	{		
			DetalleCursoConstantesFunciones.actualizarLista(detallecurso,detallecursos,this.detallecursoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleCurso detallecurso,List<DetalleCurso> detallecursos) throws Exception {
		try	{			
			DetalleCursoConstantesFunciones.actualizarSelectedLista(detallecurso,detallecursos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleCurso> detallecursosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallecursosLocal=this.detallecursoLogic.getDetalleCursos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallecursosLocal=this.detallecursos;
			}
			//ARCHITECTURE
		
			for(DetalleCurso detallecursoLocal:detallecursosLocal) {
				if(this.permiteMantenimiento(detallecursoLocal) && detallecursoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleCursoConstantesFunciones.getDetalleCursoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleCursoConstantesFunciones.IDCURSO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabelid_cursoDetalleCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleCursoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabelnombreDetalleCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleCursoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabeldescripcionDetalleCurso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCurso.jLabelid_cursoDetalleCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCurso.jLabelnombreDetalleCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCurso.jLabeldescripcionDetalleCurso,"");
		
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
		this.iIdNuevoDetalleCurso--;	
		
		
		this.detallecursoAux=new DetalleCurso();
		
		this.detallecursoAux.setId(this.iIdNuevoDetalleCurso);
		this.detallecursoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallecursoLogic.getDetalleCursos().add(this.detallecursoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallecursos.add(this.detallecursoAux);
		}
		//ARCHITECTURE
		
		this.detallecurso=this.detallecursoAux;
		
		if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleCurso(this.detallecurso);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleCurso(this.detallecurso);
		}
				
		//this.setDefaultControlesDetalleCurso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleCurso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleCurso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCurso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleCurso(this.detallecursoBean,this.detallecurso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleCursoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
			classes=DetalleCursoConstantesFunciones.getClassesRelationshipsOfDetalleCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallecursoReturnGeneral=detallecursoLogic.procesarEventosDetalleCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecursoLogic.getDetalleCursos(),this.detallecurso,this.detallecursoParameterGeneral,this.isEsNuevoDetalleCurso,classes);//this.detallecursoLogic.getDetalleCurso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleCurso(this.detallecursoReturnGeneral,this.detallecursoBean,false);
		
		if(this.detallecursoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso());
		}
		
		if(this.detallecursoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso(),classes);//this.detallecursoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleCurso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleCurso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleCursoBeanSwingJInternalFrameAdditional.RecargarFormDetalleCurso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleCurso(false);
						
			if(detallecursoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCurso();
			}
			
			this.actualizarVisualTableDatosDetalleCurso();
			
			this.jTableDatosDetalleCurso.setRowSelectionInterval(this.getIndiceNuevoDetalleCurso(), this.getIndiceNuevoDetalleCurso());
			
			this.seleccionarFilaTablaDetalleCursoActual();
						
			this.actualizarEstadoCeldasBotonesDetalleCurso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleCurso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setEnabled(isHabilitar && this.detallecursoConstantesFunciones.activarnombreDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setEnabled(isHabilitar && this.detallecursoConstantesFunciones.activardescripcionDetalleCurso);	
		
		this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setEnabled(isHabilitar && this.detallecursoConstantesFunciones.activarid_cursoDetalleCurso);
	};
	
	public void setDefaultControlesDetalleCurso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleCurso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallecursoSessionBean.setConGuardarRelaciones(true);			
			this.detallecursoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.setVisible(true);
			
					
		} else {
			//this.detallecursoSessionBean.setConGuardarRelaciones(false);			
			this.detallecursoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleCurso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
				if(detallecursoAux.getId().equals(this.iIdNuevoDetalleCurso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCurso detallecursoAux:this.detallecursos) {
				if(detallecursoAux.getId().equals(this.iIdNuevoDetalleCurso)) {
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
	
	public int getIndiceActualDetalleCurso(DetalleCurso detallecurso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
				if(detallecursoAux.getId().equals(detallecurso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCurso detallecursoAux:this.detallecursos) {
				if(detallecursoAux.getId().equals(detallecurso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleCurso(DetalleCurso detallecursoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
				if(detallecursoAux.getDetalleCursoOriginal().getId().equals(detallecursoOriginal.getId())) {
					existe=true;
					detallecursoOriginal.setId(detallecursoAux.getId());
					detallecursoOriginal.setVersionRow(detallecursoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCurso detallecursoAux:this.detallecursos) {
				if(detallecursoAux.getDetalleCursoOriginal().getId().equals(detallecursoOriginal.getId())) {
					existe=true;
					detallecursoOriginal.setId(detallecursoAux.getId());
					detallecursoOriginal.setVersionRow(detallecursoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleCurso(Boolean esParaCancelar) throws Exception {
		detallecursosAux=new ArrayList<DetalleCurso>();
		detallecursoAux=new DetalleCurso();
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
					if(detallecursoAux.getId()<0) {
						detallecursosAux.add(detallecursoAux);
					}		
				}
				this.iIdNuevoDetalleCurso=0L;
				this.detallecursoLogic.getDetalleCursos().removeAll(detallecursosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCurso detallecursoAux:this.detallecursos) {
					if(detallecursoAux.getId()<0) {
						detallecursosAux.add(detallecursoAux);
					}		
				}
				this.iIdNuevoDetalleCurso=0L;
				this.detallecursos.removeAll(detallecursosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleCurso 
					&& this.detallecursoLogic.getDetalleCursos().size()>0
					) {
					detallecursoAux=this.detallecursoLogic.getDetalleCursos().get(this.detallecursoLogic.getDetalleCursos().size() - 1);
				
					if(detallecursoAux.getId()<0) {
						this.detallecursoLogic.getDetalleCursos().remove(detallecursoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleCurso && this.detallecursos.size()>0) {
					detallecursoAux=this.detallecursos.get(this.detallecursos.size() - 1);
				
					if(detallecursoAux.getId()<0) {
						this.detallecursos.remove(detallecursoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleCurso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallecurso.getId()<0) {
				this.detallecursoLogic.getDetalleCursos().remove(this.detallecurso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallecurso.getId()<0) {
				this.detallecursos.remove(this.detallecurso);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleCurso(List<DetalleCurso> detallecursosAux) throws Exception {
		DetalleCursoConstantesFunciones.setEstadosInicialesDetalleCurso(detallecursosAux);
	}
	
	public void setEstadosInicialesDetalleCurso(DetalleCurso detallecursoAux) throws Exception {
		DetalleCursoConstantesFunciones.setEstadosInicialesDetalleCurso(detallecursoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleCursoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleCursoActual()) {
				if(!this.isEsNuevoDetalleCurso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleCurso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleCursoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Curso ?", "MANTENIMIENTO DE Detalle Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleCurso detallecurso) throws Exception {
		DetalleCursoConstantesFunciones.seleccionarAsignar(this.detallecurso,detallecurso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleCurso=this.isPermisoActualizarOriginalDetalleCurso;
			
			
			this.seleccionarAsignar(detallecurso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleCursoConstantesFunciones.quitarEspaciosDetalleCurso(this.detallecurso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallecursoSessionBean.setsFuncionBusquedaRapida(this.detallecursoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleCurso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleCurso(esParaCancelar);				
				this.cancelarNuevoDetalleCurso(esParaCancelar);								
			}
			
			this.detallecurso=new DetalleCurso();
			
			this.inicializarDetalleCurso();
			
			this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleCurso() throws Exception {
		try {
			DetalleCursoConstantesFunciones.inicializarDetalleCurso(this.detallecurso);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallecursoLogic.getDetalleCursos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleCursos(String sAccionBusqueda,List<DetalleCurso> detallecursosParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleCurso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleCursoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleCursoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleCurso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Cursos");		
		parameters.put("busquedapor", DetalleCursoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleCurso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleCursoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleCursoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleCurso=new JRBeanArrayDataSource(DetalleCursoJInternalFrame.TraerDetalleCursoBeans(detallecursosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleCurso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleCursoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleCursoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleCursoBean.TraerDetalleCursoBeans(detallecursosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleCursoActionPerformed(null);
					//this.generarExcelReporteDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleCursos(sAccionBusqueda,sTipoArchivoReporte,detallecursosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCurso> detallecursosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCursos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleCurso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleCurso detallecurso : detallecursosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleCursoConstantesFunciones.generarExcelReporteDataDetalleCurso("NORMAL",row,workbook,detallecurso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleCurso(String sTipo,Row row,Workbook workbook) {
		
		DetalleCursoConstantesFunciones.generarExcelReporteHeaderDetalleCurso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCurso> detallecursosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleCurso detallecurso : detallecursosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleCursoConstantesFunciones.getDetalleCursoDescripcion(detallecurso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCursoConstantesFunciones.LABEL_IDCURSO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_IDCURSO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecurso.getcurso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCursoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecurso.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecurso.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCurso> detallecursosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleCurso> detallecursosRespaldo=null;
		
		classes=DetalleCursoConstantesFunciones.getClassesRelationshipsOfDetalleCurso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallecursoLogic.setDatosCliente(this.datosCliente);
		this.detallecursoLogic.setDatosDeep(this.datosDeep);
		this.detallecursoLogic.setIsConDeep(true);
		
		detallecursosRespaldo=this.detallecursoLogic.getDetalleCursos();
		
		this.detallecursoLogic.setDetalleCursos(detallecursosParaReportes);	
		this.detallecursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallecursosParaReportes=this.detallecursoLogic.getDetalleCursos();
		this.detallecursoLogic.setDetalleCursos(detallecursosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleCurso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleCurso detallecurso : detallecursosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleCurso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleCursoConstantesFunciones.generarExcelReporteDataDetalleCurso("NORMAL",row,workbook,detallecurso,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleCursoConstantesFunciones.getDetalleCursoDescripcion(detallecurso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCurso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleCurso() throws Exception {		
		this.startProcessDetalleCurso(true);
	}
	
	public void startProcessDetalleCurso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleCurso ,this.jPanelParametrosReportesDetalleCurso, this.jScrollPanelDatosDetalleCurso,this.jPanelPaginacionDetalleCurso, this.jScrollPanelDatosEdicionDetalleCurso, this.jPanelAccionesDetalleCurso,this.jPanelAccionesFormularioDetalleCurso,this.jmenuBarDetalleCurso,this.jmenuBarDetalleDetalleCurso,this.jTtoolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleCurso=this.jTabbedPaneBusquedasDetalleCurso; 
		
		final JPanel jPanelParametrosReportesDetalleCurso=this.jPanelParametrosReportesDetalleCurso;
		//final JScrollPane jScrollPanelDatosDetalleCurso=this.jScrollPanelDatosDetalleCurso;
		final JTable jTableDatosDetalleCurso=this.jTableDatosDetalleCurso;		
		final JPanel jPanelPaginacionDetalleCurso=this.jPanelPaginacionDetalleCurso;
		//final JScrollPane jScrollPanelDatosEdicionDetalleCurso=this.jScrollPanelDatosEdicionDetalleCurso;
		final JPanel jPanelAccionesDetalleCurso=this.jPanelAccionesDetalleCurso;
		
		JPanel jPanelCamposAuxiliarDetalleCurso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleCurso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			jPanelCamposAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jPanelCamposDetalleCurso;
			jPanelAccionesFormularioAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jPanelAccionesFormularioDetalleCurso;
		}
		
		final JPanel jPanelCamposDetalleCurso=jPanelCamposAuxiliarDetalleCurso;
		final JPanel jPanelAccionesFormularioDetalleCurso=jPanelAccionesFormularioAuxiliarDetalleCurso;
		
		
		final JMenuBar jmenuBarDetalleCurso=this.jmenuBarDetalleCurso;
		final JToolBar jTtoolBarDetalleCurso=this.jTtoolBarDetalleCurso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleCurso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			jmenuBarDetalleAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jmenuBarDetalleDetalleCurso;
			jTtoolBarDetalleAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jTtoolBarDetalleDetalleCurso;
		}
		
		final JMenuBar jmenuBarDetalleDetalleCurso=jmenuBarDetalleAuxiliarDetalleCurso;
		final JToolBar jTtoolBarDetalleDetalleCurso=jTtoolBarDetalleAuxiliarDetalleCurso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleCurso;
			processRunnable.jTableDatos=jTableDatosDetalleCurso;
			processRunnable.jPanelCampos=jPanelCamposDetalleCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleCurso;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleCurso;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleCurso;
			processRunnable.jTtoolBar=jTtoolBarDetalleCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleCurso ,jPanelParametrosReportesDetalleCurso,jTableDatosDetalleCurso, /*jScrollPanelDatosDetalleCurso,*/jPanelCamposDetalleCurso,jPanelPaginacionDetalleCurso, /*jScrollPanelDatosEdicionDetalleCurso,*/ jPanelAccionesDetalleCurso,jPanelAccionesFormularioDetalleCurso,jmenuBarDetalleCurso,jmenuBarDetalleDetalleCurso,jTtoolBarDetalleCurso,jTtoolBarDetalleDetalleCurso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleCurso ,jPanelParametrosReportesDetalleCurso, jScrollPanelDatosDetalleCurso,jPanelPaginacionDetalleCurso, jScrollPanelDatosEdicionDetalleCurso, jPanelAccionesDetalleCurso,jPanelAccionesFormularioDetalleCurso,jmenuBarDetalleCurso,jmenuBarDetalleDetalleCurso,jTtoolBarDetalleCurso,jTtoolBarDetalleDetalleCurso);
						
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
	
	public void finishProcessDetalleCurso() {// throws Exception 
		this.finishProcessDetalleCurso(true);
	}
	
	public void finishProcessDetalleCurso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleCurso ,this.jPanelParametrosReportesDetalleCurso, this.jScrollPanelDatosDetalleCurso,this.jPanelPaginacionDetalleCurso, this.jScrollPanelDatosEdicionDetalleCurso, this.jPanelAccionesDetalleCurso,this.jPanelAccionesFormularioDetalleCurso,this.jmenuBarDetalleCurso,this.jmenuBarDetalleDetalleCurso,this.jTtoolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleCurso=this.jTabbedPaneBusquedasDetalleCurso; 
		
		final JPanel jPanelParametrosReportesDetalleCurso=this.jPanelParametrosReportesDetalleCurso;
		//final JScrollPane jScrollPanelDatosDetalleCurso=this.jScrollPanelDatosDetalleCurso;
		final JTable jTableDatosDetalleCurso=this.jTableDatosDetalleCurso;		
		final JPanel jPanelPaginacionDetalleCurso=this.jPanelPaginacionDetalleCurso;
		//final JScrollPane jScrollPanelDatosEdicionDetalleCurso=this.jScrollPanelDatosEdicionDetalleCurso;
		final JPanel jPanelAccionesDetalleCurso=this.jPanelAccionesDetalleCurso;
		
		JPanel jPanelCamposAuxiliarDetalleCurso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleCurso=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			jPanelCamposAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jPanelCamposDetalleCurso;
			jPanelAccionesFormularioAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jPanelAccionesFormularioDetalleCurso;
		}
		
		final JPanel jPanelCamposDetalleCurso=jPanelCamposAuxiliarDetalleCurso;
		final JPanel jPanelAccionesFormularioDetalleCurso=jPanelAccionesFormularioAuxiliarDetalleCurso;
		
		
		final JMenuBar jmenuBarDetalleCurso=this.jmenuBarDetalleCurso;		
		final JToolBar jTtoolBarDetalleCurso=this.jTtoolBarDetalleCurso;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleCurso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			jmenuBarDetalleAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jmenuBarDetalleDetalleCurso;
			jTtoolBarDetalleAuxiliarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jTtoolBarDetalleDetalleCurso;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleCurso=jmenuBarDetalleAuxiliarDetalleCurso;
		final JToolBar jTtoolBarDetalleDetalleCurso=jTtoolBarDetalleAuxiliarDetalleCurso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleCurso;
			processRunnable.jTableDatos=jTableDatosDetalleCurso;
			processRunnable.jPanelCampos=jPanelCamposDetalleCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleCurso;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleCurso;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleCurso;
			processRunnable.jTtoolBar=jTtoolBarDetalleCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleCurso ,jPanelParametrosReportesDetalleCurso, jTableDatosDetalleCurso,/*jScrollPanelDatosDetalleCurso,*/jPanelCamposDetalleCurso,jPanelPaginacionDetalleCurso, /*jScrollPanelDatosEdicionDetalleCurso,*/ jPanelAccionesDetalleCurso,jPanelAccionesFormularioDetalleCurso,jmenuBarDetalleCurso,jmenuBarDetalleDetalleCurso,jTtoolBarDetalleCurso,jTtoolBarDetalleDetalleCurso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleCurso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleCurso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleCurso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleCurso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleCurso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallecursoConstantesFunciones.getsFinalQueryDetalleCurso();
		String  finalQueryPaginacionTodos=this.detallecursoConstantesFunciones.getsFinalQueryDetalleCurso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleCursoConstantesFunciones.getArrayColumnasGlobalesNoDetalleCurso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleCursoConstantesFunciones.getArrayColumnasGlobalesDetalleCurso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleCursoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallecursosEliminados= new ArrayList<DetalleCurso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleCurso();
		
				///*DetalleCursoSessionBean*/this.detallecursoSessionBean=new DetalleCursoSessionBean();
			
			if(this.detallecursoSessionBean==null) {
				this.detallecursoSessionBean=new DetalleCursoSessionBean();
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
					this.iNumeroPaginacion=DetalleCursoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleCursoConstantesFunciones.getClassesForeignKeysOfDetalleCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallecurso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallecursosAux= new ArrayList<DetalleCurso>();
			
				
			detallecursoLogic.setDatosCliente(this.datosCliente);
			detallecursoLogic.setDatosDeep(this.datosDeep);
			detallecursoLogic.setIsConDeep(true);
			
			
			detallecursoLogic.getDetalleCursoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallecursoLogic.getTodosDetalleCursos(finalQueryGlobal,pagination);
					
					//detallecursoLogic.getTodosDetalleCursosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallecursoLogic.getDetalleCursos()==null|| detallecursoLogic.getDetalleCursos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecursosAux= new ArrayList<DetalleCurso>();
							detallecursosAux.addAll(detallecursoLogic.getDetalleCursos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecursosAux= new ArrayList<DetalleCurso>();
							detallecursosAux.addAll(detallecursos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecursoLogic.getTodosDetalleCursos(finalQueryGlobal+"",this.pagination);												
							
							//detallecursoLogic.getTodosDetalleCursosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleCursos("Todos",detallecursoLogic.getDetalleCursos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());					
							detallecursoLogic.getDetalleCursos().addAll(detallecursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecursos=new ArrayList<DetalleCurso>();
							detallecursos.addAll(detallecursosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleCurso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleCurso=this.idActual;
				
				} else if(this.idDetalleCursoActual!=null && this.idDetalleCursoActual!=0L) {
					idDetalleCurso=idDetalleCursoActual;
				}
				
					
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndicePorId(idDetalleCurso);
				
				this.detallecursos=new ArrayList<DetalleCurso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallecursoLogic.getEntity(idDetalleCurso);
					
					//detallecursoLogic.getEntityWithConnection(idDetalleCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());
					detallecursoLogic.getDetalleCursos().add(detallecursoLogic.getDetalleCurso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecursos=new ArrayList<DetalleCurso>();
					this.detallecursos.add(detallecurso);
				}
				
				if(detallecursoLogic.getDetalleCurso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCurso")) {
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndiceFK_IdCurso(id_cursoFK_IdCurso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallecursoLogic.getDetalleCursosFK_IdCurso(finalQueryGlobal,pagination,id_cursoFK_IdCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndiceFK_IdCurso(id_cursoFK_IdCurso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndiceFK_IdCurso(id_cursoFK_IdCurso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallecursoLogic.getDetalleCursos()==null||detallecursoLogic.getDetalleCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallecursos==null|| detallecursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursosAux=new ArrayList<DetalleCurso>();
						detallecursosAux.addAll(detallecursoLogic.getDetalleCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecursosAux=new ArrayList<DetalleCurso>();
							detallecursosAux.addAll(detallecursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallecursoLogic.getDetalleCursosFK_IdCurso(finalQueryGlobal,pagination,id_cursoFK_IdCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndiceFK_IdCurso(id_cursoFK_IdCurso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCursoConstantesFunciones.getDetalleIndiceFK_IdCurso(id_cursoFK_IdCurso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleCursos("FK_IdCurso",detallecursoLogic.getDetalleCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleCursos("FK_IdCurso",detallecursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());
						detallecursoLogic.getDetalleCursos().addAll(detallecursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecursos=new ArrayList<DetalleCurso>();
							detallecursos.addAll(detallecursosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleCurso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleCurso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallecursoLogic.getDetalleCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecursos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallecursoLogic.getDetalleCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecursos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleCurso detallecurso) {
		Boolean permite=true;
		
		if(this.detallecurso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleCursoConstantesFunciones.getOrderByListaDetalleCurso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleCursoConstantesFunciones.getOrderByListaDetalleCurso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCurso detallecurso:detallecursoLogic.getDetalleCursos()) {
				if(detallecurso.getsType().equals(Constantes2.S_TOTALES)) {
					detallecursoTotales=detallecurso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCurso detallecurso:this.detallecursos) {
				if(detallecurso.getsType().equals(Constantes2.S_TOTALES)) {
					detallecursoTotales=detallecurso;
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
			this.detallecursoAux=new DetalleCurso();
			this.detallecursoAux.setsType(Constantes2.S_TOTALES);
			this.detallecursoAux.setIsNew(false);
			this.detallecursoAux.setIsChanged(false);
			this.detallecursoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleCursoConstantesFunciones.TotalizarValoresFilaDetalleCurso(this.detallecursoLogic.getDetalleCursos(),this.detallecursoAux);
				
				this.detallecursoLogic.getDetalleCursos().add(this.detallecursoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleCursoConstantesFunciones.TotalizarValoresFilaDetalleCurso(this.detallecursos,this.detallecursoAux);
				
				this.detallecursos.add(this.detallecursoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallecursoTotales=new DetalleCurso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallecursoLogic.getDetalleCursos().remove(detallecursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallecursos.remove(detallecursoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallecursoTotales=new DetalleCurso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCurso detallecurso:detallecursoLogic.getDetalleCursos()) {
				if(detallecurso.getsType().equals(Constantes2.S_TOTALES)) {
					detallecursoTotales=detallecurso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleCursoConstantesFunciones.TotalizarValoresFilaDetalleCurso(this.detallecursoLogic.getDetalleCursos(),detallecursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCurso detallecurso:this.detallecursos) {
				if(detallecurso.getsType().equals(Constantes2.S_TOTALES)) {
					detallecursoTotales=detallecurso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleCursoConstantesFunciones.TotalizarValoresFilaDetalleCurso(this.detallecursos,detallecursoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleCursosFK_IdCurso()throws Exception {
		try {
			sAccionBusqueda="FK_IdCurso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleCursosFK_IdCurso(String sFinalQuery,Long id_curso)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecursoLogic.getDetalleCursosFK_IdCurso(sFinalQuery,this.pagination,id_curso);
				
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
	
	public void inicializarPermisosDetalleCurso() {
		this.isPermisoTodoDetalleCurso=false;
		this.isPermisoNuevoDetalleCurso=false;
		this.isPermisoActualizarDetalleCurso=false;
		this.isPermisoActualizarOriginalDetalleCurso=false;
		this.isPermisoEliminarDetalleCurso=false;
		this.isPermisoGuardarCambiosDetalleCurso=false;
		this.isPermisoConsultaDetalleCurso=false;
		this.isPermisoBusquedaDetalleCurso=false;
		this.isPermisoReporteDetalleCurso=false;		
		this.isPermisoOrdenDetalleCurso=false;		
		this.isPermisoPaginacionMedioDetalleCurso=false;		
		this.isPermisoPaginacionAltoDetalleCurso=false;
		this.isPermisoPaginacionTodoDetalleCurso=false;
		this.isPermisoCopiarDetalleCurso=false;		
		this.isPermisoVerFormDetalleCurso=false;		
		this.isPermisoDuplicarDetalleCurso=false;		
		this.isPermisoOrdenDetalleCurso=false;		
	}
	
	public void setPermisosUsuarioDetalleCurso(Boolean isPermiso) {
		this.isPermisoTodoDetalleCurso=isPermiso;
		this.isPermisoNuevoDetalleCurso=isPermiso;
		this.isPermisoActualizarDetalleCurso=isPermiso;
		this.isPermisoActualizarOriginalDetalleCurso=isPermiso;
		this.isPermisoEliminarDetalleCurso=isPermiso;
		this.isPermisoGuardarCambiosDetalleCurso=isPermiso;
		this.isPermisoConsultaDetalleCurso=isPermiso;
		this.isPermisoBusquedaDetalleCurso=isPermiso;
		this.isPermisoReporteDetalleCurso=isPermiso;
		this.isPermisoOrdenDetalleCurso=isPermiso;		
		this.isPermisoPaginacionMedioDetalleCurso=isPermiso;		
		this.isPermisoPaginacionAltoDetalleCurso=isPermiso;		
		this.isPermisoPaginacionTodoDetalleCurso=isPermiso;		
		this.isPermisoCopiarDetalleCurso=isPermiso;		
		this.isPermisoVerFormDetalleCurso=isPermiso;		
		this.isPermisoDuplicarDetalleCurso=isPermiso;
		this.isPermisoOrdenDetalleCurso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleCurso(Boolean isPermiso) {
		//this.isPermisoTodoDetalleCurso=isPermiso;
		this.isPermisoNuevoDetalleCurso=isPermiso;
		this.isPermisoActualizarDetalleCurso=isPermiso;
		this.isPermisoActualizarOriginalDetalleCurso=isPermiso;
		this.isPermisoEliminarDetalleCurso=isPermiso;
		this.isPermisoGuardarCambiosDetalleCurso=isPermiso;
		//this.isPermisoConsultaDetalleCurso=isPermiso;
		//this.isPermisoBusquedaDetalleCurso=isPermiso;
		//this.isPermisoReporteDetalleCurso=isPermiso;
		//this.isPermisoOrdenDetalleCurso=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleCurso=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleCurso=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleCurso=isPermiso;		
		//this.isPermisoCopiarDetalleCurso=isPermiso;		
		//this.isPermisoDuplicarDetalleCurso=isPermiso;
		//this.isPermisoOrdenDetalleCurso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleCursoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleCurso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleCursoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleCursoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleCursoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleCursoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleCurso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleCursoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleCurso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleCurso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleCurso=this.isPermisoActualizarDetalleCurso;
			this.isPermisoEliminarDetalleCurso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleCurso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleCurso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleCurso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleCurso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleCurso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleCurso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleCurso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleCurso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleCurso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleCurso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleCurso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleCurso.setToolTipText(this.jTableDatosDetalleCurso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleCurso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleCurso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleCurso() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleCursoListas()throws Exception {
		try	{						
			
				this.cursosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleCursoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleCursoListas(false);
			} else {
			
				this.cargarCombosForeignKeyCursoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCursoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cursosForeignKey==null||this.cursosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CursoConstantesFunciones.getArrayColumnasGlobalesCurso(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CursoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CursoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCursosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleCursoParameterReturnGeneral detallecursoReturnGeneral=new DetalleCursoParameterReturnGeneral();
						
			


				String finalQueryGlobalCurso="";

				if(((this.cursosForeignKey==null||this.cursosForeignKey.size()<=0) && this.detallecursoConstantesFunciones.cargarid_cursoDetalleCurso)
					 || (this.esRecargarFks && this.detallecursoConstantesFunciones.cargarid_cursoDetalleCurso)) {

					if(!this.detallecursoSessionBean.getisBusquedaDesdeForeignKeySesionCurso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CursoConstantesFunciones.getArrayColumnasGlobalesCurso(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCurso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CursoConstantesFunciones.TABLENAME);

						finalQueryGlobalCurso=Funciones.GetFinalQueryAppend(finalQueryGlobalCurso, "");
						finalQueryGlobalCurso+=CursoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCursosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCurso=" WHERE " + ConstantesSql.ID + "="+detallecursoSessionBean.getlidCursoActual();
					}
				} else {
					finalQueryGlobalCurso="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallecursoReturnGeneral=detallecursoLogic.cargarCombosLoteForeignKeyDetalleCurso(finalQueryGlobalCurso);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCurso.equals("NONE")) {
				this.cursosForeignKey=detallecursoReturnGeneral.getcursosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleCurso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCurso();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCurso()throws Exception {
		try {
			if(this.detallecursoSessionBean==null) {
				this.detallecursoSessionBean=new DetalleCursoSessionBean();
			}

			if(!this.detallecursoSessionBean.getisBusquedaDesdeForeignKeySesionCurso()) {
				Curso curso=new Curso();
				CursoConstantesFunciones.setCursoDescripcion(curso,Constantes.SMENSAJE_ESCOJA_OPCION);
				curso.setId(null);

				if(!CursoConstantesFunciones.ExisteEnLista(this.cursosForeignKey,curso,true)) {

					this.cursosForeignKey.add(0,curso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleCurso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleCurso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCurso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleCurso(DetalleCurso detallecurso)throws Exception {	
		try {
			
			this.setActualCursoForeignKey(detallecurso.getid_curso(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleCurso(DetalleCurso detallecurso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleCurso()throws Exception {	
		try {
			
			this.setActualCursoForeignKey(this.detallecursoConstantesFunciones.getid_curso(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCurso()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleCurso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleCurso()throws Exception {
		try {
			

			this.cargarCombosFrameCursosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCursosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleCurso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso!=null && this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public DetalleCursoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleCursoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleCursoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallecursoSessionBean=new DetalleCursoSessionBean(); 
		this.detallecursoConstantesFunciones=new DetalleCursoConstantesFunciones(); 
		this.detallecursoBean=new DetalleCurso();//(this.detallecursoConstantesFunciones); 		
		this.detallecursoReturnGeneral=new DetalleCursoParameterReturnGeneral(); 
		
		this.detallecursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleCurso(true);
			
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
			
			this.detallecursoConstantesFunciones=new DetalleCursoConstantesFunciones(); 
			this.detallecursoBean=new DetalleCurso();//this.detallecursoConstantesFunciones); 			
			this.detallecursoReturnGeneral=new DetalleCursoParameterReturnGeneral(); 
		
			DetalleCursoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Curso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detallecurso=new DetalleCurso();
			this.detallecursos = new ArrayList<DetalleCurso>();
			this.detallecursosAux = new ArrayList<DetalleCurso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic=new DetalleCursoLogic();
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			//this.detallecursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallecursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleCurso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleCurso);	
					}
					
					if(this.jInternalFrameImportacionDetalleCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleCurso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleCurso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleCurso);
				this.jInternalFrameDetalleFormDetalleCurso.setVisible(false);
				this.jInternalFrameDetalleFormDetalleCurso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleCurso);
					this.jInternalFrameReporteDinamicoDetalleCurso.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleCurso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleCurso);
					this.jInternalFrameImportacionDetalleCurso.setVisible(false);
					this.jInternalFrameImportacionDetalleCurso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleCurso);
					this.jInternalFrameOrderByDetalleCurso.setVisible(false);
					this.jInternalFrameOrderByDetalleCurso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleCursoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleCursoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallecursoReturnGeneral=new DetalleCursoParameterReturnGeneral();
			
			this.detallecursoParameterGeneral=new DetalleCursoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallecursoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleCursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallecursoSessionBean.getEsGuardarRelacionado(),this.detallecursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleCursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallecursoSessionBean.getEsGuardarRelacionado(),this.detallecursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaDuplicarDetalleCurso=true;
			this.isVisibilidadCeldaCopiarDetalleCurso=true;
			this.isVisibilidadCeldaVerFormDetalleCurso=true;
			this.isVisibilidadCeldaOrdenDetalleCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=false;
			this.isVisibilidadCeldaGuardarDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			
			
			this.isVisibilidadFK_IdCurso=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleCurso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleCurso(false);
			
			this.setPermisosUsuarioDetalleCurso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado() 
				|| (this.detallecursoSessionBean.getEsGuardarRelacionado() && this.detallecursoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleCursoClasesRelacionadas();
			}
			
			if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleCursoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleCurso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleCurso();
			}
			
			if(!this.isPermisoBusquedaDetalleCurso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleCurso,this.isPermisoPaginacionMedioDetalleCurso,this.isPermisoPaginacionTodoDetalleCurso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleCursoConstantesFunciones.getTiposSeleccionarDetalleCurso());
				
				this.tiposColumnasSelect=DetalleCursoConstantesFunciones.getTiposSeleccionarDetalleCurso(true);
				
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
			//if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleCurso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleCurso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleCurso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCurso() ;
			
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
			
			this.cursoLogic=new CursoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detallecursoImplementable= (DetalleCursoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleCursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallecursoImplementableHome= (DetalleCursoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleCursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallecursos= new ArrayList<DetalleCurso>();
			this.detallecursosEliminados= new ArrayList<DetalleCurso>();
						
			this.isEsNuevoDetalleCurso=false;
			this.esParaAccionDesdeFormularioDetalleCurso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.cursosForeignKey=new ArrayList<Curso>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleCurso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleCurso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleCursoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleCursoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleCurso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleCurso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleCurso();
			}
			
			DetalleCursoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleCurso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleCurso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleCurso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleCurso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleCurso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleCurso() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleCurso")) {
				iIndex=this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleCurso();	
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
	
	public void cargarCombosForeignKeyDetalleCurso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleCurso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleCurso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleCursoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleCurso();
		
		this.cargarCombosFrameForeignKeyDetalleCurso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleCurso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleCurso();
		}
	}
	
	

	public void cargarCombosForeignKeyCurso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCursoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCurso();
				this.cargarCombosFrameCursosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCurso(this.cursosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			
			if(jTableDatosDetalleCurso.getRowCount()>=1) {
				jTableDatosDetalleCurso.removeRowSelectionInterval(0, jTableDatosDetalleCurso.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleCurso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleCurso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleCurso(true);			
			//this.detallecurso=new DetalleCurso();
			//this.detallecurso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCurso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCurso() ;
			
			if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCurso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallecurso);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);				
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleCurso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleCurso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleCurso.getSelectedRows().length;			
			}
			
			detallecursosSeleccionados=this.getDetalleCursosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleCurso--;			
				//DetalleCurso detallecursoAux= new DetalleCurso();			
				//detallecursoAux.setId(this.iIdNuevoDetalleCurso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleCurso detallecursoOrigen=new DetalleCurso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleCurso detallecursoOrigen : detallecursosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallecursoOrigen =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecursoOrigen =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleCurso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallecurso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleCurso(detallecursoOrigen,this.detallecurso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallecursoLogic.getDetalleCursos().add(this.detallecursoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallecursos.add(this.detallecursoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleCurso(false);
				
				this.jTableDatosDetalleCurso.setRowSelectionInterval(this.getIndiceNuevoDetalleCurso(), this.getIndiceNuevoDetalleCurso());
				
				int iLastRow =  this.jTableDatosDetalleCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCurso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();									
		
			DetalleCurso detallecursoOrigen=new DetalleCurso();
			DetalleCurso detallecursoDestino=new DetalleCurso();
				
			detallecursosSeleccionados=this.getDetalleCursosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleCurso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallecursosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleCurso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoOrigen =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallecursoOrigen =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecursoDestino =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallecursoDestino =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallecursoOrigen =detallecursosSeleccionados.get(0);
				detallecursoDestino =detallecursosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleCurso(detallecursoOrigen,detallecursoDestino,true,false);
				
				detallecursoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallecursoDestino,detallecursoLogic.getDetalleCursos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecursoDestino,detallecursos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleCurso(false);
				
				//this.jTableDatosDetalleCurso.setRowSelectionInterval(this.getIndiceNuevoDetalleCurso(), this.getIndiceNuevoDetalleCurso());
				
				int iLastRow =  this.jTableDatosDetalleCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCurso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleCurso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleCurso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleCurso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleCurso.setVisible(!isVisible);
			this.jPanelPaginacionDetalleCurso.setVisible(!isVisible);
			this.jPanelAccionesDetalleCurso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleCurso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleCurso();
			
			this.abrirFrameOrderByDetalleCurso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleCurso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleCurso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleCurso.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleCurso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleCurso.setSize(this.jInternalFrameDetalleFormDetalleCurso.iWidthFormulario,this.jInternalFrameDetalleFormDetalleCurso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleCurso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleCurso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleCurso.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleCurso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleCurso.jContentPaneDetalleDetalleCurso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleCurso.jContentPaneDetalleDetalleCurso.getWidth(),DetalleCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleCurso.jContentPaneDetalleDetalleCurso.getWidth(),DetalleCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleCurso.jContentPaneDetalleDetalleCurso.getWidth(),DetalleCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleCurso.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleCurso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleCurso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCurso,false,this);
				} else {
					this.jInternalFrameOrderByDetalleCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCurso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleCurso);
				this.jInternalFrameOrderByDetalleCurso.setVisible(false);
				this.jInternalFrameOrderByDetalleCurso.setSelected(false);
				
				this.jInternalFrameOrderByDetalleCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleCurso"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleCurso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleCurso==null) {
				
				this.jInternalFrameImportacionDetalleCurso=new ImportacionJInternalFrame(DetalleCursoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleCurso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleCurso);
				this.jInternalFrameImportacionDetalleCurso.setVisible(false);
				this.jInternalFrameImportacionDetalleCurso.setSelected(false);


				this.jInternalFrameImportacionDetalleCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleCurso"));
				this.jInternalFrameImportacionDetalleCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleCurso"));
				this.jInternalFrameImportacionDetalleCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleCurso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleCurso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleCurso==null) {
				this.jInternalFrameReporteDinamicoDetalleCurso=new ReporteDinamicoJInternalFrame(DetalleCursoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleCurso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleCurso);
				this.jInternalFrameReporteDinamicoDetalleCurso.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleCurso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCurso"));
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCurso"));
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCurso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCurso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleCurso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleCurso);
			
	       	this.jInternalFrameDetalleFormDetalleCurso.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleCurso.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleCurso.dispose();
			//this.jInternalFrameDetalleFormDetalleCurso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleCurso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleCurso.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleCurso.setVisible(true);
	        this.jInternalFrameImportacionDetalleCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleCurso.setVisible(true);
	        this.jInternalFrameOrderByDetalleCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleCurso.setVisible(false);
	        this.jInternalFrameOrderByDetalleCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleCurso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleCurso.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleCurso.setVisible(false);
	        this.jInternalFrameImportacionDetalleCurso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleCurso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleCurso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleCurso(true);
			//this.isEsNuevoDetalleCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCurso(false) ;
			
			if(detallecursoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCurso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleCursoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleCurso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleCurso(true);
			//this.isEsNuevoDetalleCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallecurso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleCurso(false) ;
			
			if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCurso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCurso(List<Curso> cursosForeignKey)throws Exception{
		TableColumn tableColumnCurso=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,DetalleCursoConstantesFunciones.LABEL_IDCURSO));
		TableCellEditor tableCellEditorCurso =tableColumnCurso.getCellEditor();

		CursoTableCell cursoTableCellFk=(CursoTableCell)tableCellEditorCurso;

		if(cursoTableCellFk!=null) {
			cursoTableCellFk.setcursosForeignKey(cursosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleCurso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cursoTableCellFk.setRowActual(intSelectedRow);
			//cursoTableCellFk.setcursosForeignKeyActual(cursosForeignKey);
		//}


		if(cursoTableCellFk!=null) {
			cursoTableCellFk.RecargarCursosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleCurso(false);
			
			//if(!this.isEsNuevoDetalleCurso) {								
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				
			}
			
			if(this.permiteMantenimiento(this.detallecurso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleCurso=true;
					this.inicializarActualizarBindingTablaDetalleCurso(false);
					this.isEsNuevoDetalleCurso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleCurso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleCurso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCurso(false);
				
				this.habilitarDeshabilitarControlesDetalleCurso(false);
			
												
				
				if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleCurso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleCursoActionPerformed(evt,detallecursoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleCurso(this.detallecurso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleCurso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallecursoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallecurso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				this.detallecurso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				this.detallecurso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallecurso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleCursoModel) this.jTableDatosDetalleCurso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleCurso=true;
				this.inicializarActualizarBindingTablaDetalleCurso(false);
				this.isEsNuevoDetalleCurso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCurso(false);
				
				this.habilitarDeshabilitarControlesDetalleCurso(false);
				
				
				
				if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleCurso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleCursoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleCurso.getRowCount()>=1) {
				jTableDatosDetalleCurso.removeRowSelectionInterval(0, jTableDatosDetalleCurso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleCurso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleCurso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCurso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCurso(false) ;
			
			this.isEsNuevoDetalleCurso=false;
			
			if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleCurso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleCurso(false);
				
				//SI ES MANUAL
				if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleCurso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleCurso--;			
			//DetalleCurso detallecursoAux= new DetalleCurso();			
			//detallecursoAux.setId(this.iIdNuevoDetalleCurso);
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleCurso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
			
			this.detallecurso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallecursoLogic.getDetalleCursos().add(this.detallecursoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallecursos.add(this.detallecursoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleCurso(false);
			
			this.jTableDatosDetalleCurso.setRowSelectionInterval(this.getIndiceNuevoDetalleCurso(), this.getIndiceNuevoDetalleCurso());
			
			int iLastRow =  this.jTableDatosDetalleCurso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleCurso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleCurso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleCurso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCurso(false);
			
			//SI ES MANUAL
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCurso();
			}
			
			//this.abrirFrameTreeDetalleCurso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle CursoS ?", "MANTENIMIENTO DE Detalle Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleCurso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleCurso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallecursoReturnGeneral=detallecursoLogic.procesarImportacionDetalleCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallecursoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleCursoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleCurso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleCurso.setFileImportacion(this.jInternalFrameImportacionDetalleCurso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleCurso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleCurso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleCurso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleCurso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		

		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleCursoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleCursoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleCursoConstantesFunciones.LABEL_IDCURSO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Curso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Curso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Curso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Curso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleCursoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleCursoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleCurso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleCursoConstantesFunciones.LABEL_IDCURSO:
					sNombreCampoCategoria="id_curso";
					break;

				case DetalleCursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DetalleCursoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleCursoConstantesFunciones.LABEL_IDCURSO:
					sNombreCampoCategoriaValor="id_curso";
					break;

				case DetalleCursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DetalleCursoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleCursoConstantesFunciones.LABEL_IDCURSO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Curso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_curso");
					break;

				case DetalleCursoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DetalleCursoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleCursoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleCursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleCursoConstantesFunciones.LABEL_IDCURSO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_IDCURSO);
					iRow++;

					for(DetalleCurso detallecurso:detallecursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecurso.getcurso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleCursoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetalleCurso detallecurso:detallecursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecurso.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleCursoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleCurso detallecurso:detallecursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecurso.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleCurso(row);				
			//	iRow++;
			//}				
			
			//for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleCurso(detallecursoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCurso(false);
			
			//SI ES MANUAL
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCurso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCurso(false);
			
			//SI ES MANUAL
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleCurso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCurso(false);
			
			//SI ES MANUAL
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleCurso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleCurso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleCurso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleCurso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleCurso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleCurso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleCurso.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleCurso.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleCurso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleCurso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleCurso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleCurso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleCurso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleCurso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleCurso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCurso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleCurso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleCurso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleCurso();
		
		this.inicializarActualizarBindingBotonesManualDetalleCurso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleCurso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCurso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCurso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCurso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleCurso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleCurso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleCurso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionNuevoDetalleCurso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionSinCerrarDetalleCurso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionSinMensajeDetalleCurso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleCurso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleCurso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleCurso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
				this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionNuevoDetalleCurso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionSinCerrarDetalleCurso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleCurso.jCheckBoxPostAccionSinMensajeDetalleCurso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleCurso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleCurso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleCurso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleCurso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleCurso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleCurso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleCurso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleCurso(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCurso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCurso() throws Exception {
		try	{
			if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleCurso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleCurso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleCurso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleCurso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleCurso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleCurso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleCurso.addItem(reporte);
			}
			
			
			if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleCurso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleCurso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCurso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCurso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
				this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
				this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleCurso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleCurso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleCurso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleCurso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleCurso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleCurso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cursoFK_IdCursoDetalleCurso.getSelectedItem()!=null){this.id_cursoFK_IdCurso=((Curso)this.jComboBoxid_cursoFK_IdCursoDetalleCurso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleCurso(Boolean esInicializar) throws Exception {				
		if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleCurso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleCurso() throws Exception {
		this.inicializarActualizarBindingTablaDetalleCurso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleCurso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleCursoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCursoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleCurso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallecursoLogic.getDetalleCursos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallecursos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleCurso.setModel(new DetalleCursoModel(this.detallecursoLogic.getDetalleCursos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleCurso.setModel(new DetalleCursoModel(this.detallecursos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleCurso!=null && this.jInternalFrameOrderByDetalleCurso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleCurso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO,detallecursoConstantesFunciones.resaltarSeleccionarDetalleCurso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO,detallecursoConstantesFunciones.resaltarSeleccionarDetalleCurso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,DetalleCursoConstantesFunciones.LABEL_ID));

		if(this.detallecursoConstantesFunciones.mostraridDetalleCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCursoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallecursoConstantesFunciones.resaltaridDetalleCurso,this.detallecursoConstantesFunciones.activaridDetalleCurso,this,true,"idDetalleCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallecursoConstantesFunciones.resaltaridDetalleCurso,this.detallecursoConstantesFunciones.activaridDetalleCurso,this,true,"idDetalleCurso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,DetalleCursoConstantesFunciones.LABEL_IDCURSO));

		if(this.detallecursoConstantesFunciones.mostrarid_cursoDetalleCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCursoConstantesFunciones.LABEL_IDCURSO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CursoTableCell(this.cursosForeignKey,this.detallecursoConstantesFunciones.resaltarid_cursoDetalleCurso,this,this.detallecursoConstantesFunciones.activarid_cursoDetalleCurso));
			tableColumn.setCellEditor(new CursoTableCell(this.cursosForeignKey,this.detallecursoConstantesFunciones.resaltarid_cursoDetalleCurso,this,this.detallecursoConstantesFunciones.activarid_cursoDetalleCurso,true,"id_cursoDetalleCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,DetalleCursoConstantesFunciones.LABEL_NOMBRE));

		if(this.detallecursoConstantesFunciones.mostrarnombreDetalleCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCursoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallecursoConstantesFunciones.resaltarnombreDetalleCurso,this.detallecursoConstantesFunciones.activarnombreDetalleCurso,this,true,"nombreDetalleCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallecursoConstantesFunciones.resaltarnombreDetalleCurso,this.detallecursoConstantesFunciones.activarnombreDetalleCurso,this,true,"nombreDetalleCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,DetalleCursoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detallecursoConstantesFunciones.mostrardescripcionDetalleCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCursoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallecursoConstantesFunciones.resaltardescripcionDetalleCurso,this.detallecursoConstantesFunciones.activardescripcionDetalleCurso,this,true,"descripcionDetalleCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallecursoConstantesFunciones.resaltardescripcionDetalleCurso,this.detallecursoConstantesFunciones.activardescripcionDetalleCurso,this,true,"descripcionDetalleCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallecursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallecursoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleCurso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallecursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallecursoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleCurso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallecursoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallecursoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleCurso.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleCurso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleCurso.moveColumn(this.jTableDatosDetalleCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleCurso.moveColumn(this.jTableDatosDetalleCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleCurso.moveColumn(this.jTableDatosDetalleCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleCurso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleCurso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleCurso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleCurso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleCurso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleCurso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleCurso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleCurso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallecursoLogic.getDetalleCursos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallecursos.size()-1;
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
		//this.jTableDatosDetalleCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleCurso();
			
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
				
				//this.isEsNuevoDetalleCurso=false;
					
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
				if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleCurso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleCurso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallecurso.getsType().equals("DUPLICADO")
				   || this.detallecurso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleCurso=true;
				
				} else {
					this.isEsNuevoDetalleCurso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					if(this.detallecurso.getId()>=0 && !this.detallecurso.getIsNew()) {						
						this.isEsNuevoDetalleCurso=false;
						
					} else {
						this.isEsNuevoDetalleCurso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleCurso(esRelaciones);						
				
				this.seleccionarDetalleCurso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallecurso.getId()<0) {
					this.isEsNuevoDetalleCurso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleCurso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleCurso(evt,rowIndex);
				}	
				
				if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleCurso: " + this.dDif); 
					}
				}								
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleCurso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallecurso)) {
					if(this.detallecurso.getId()>0) {
						this.detallecurso.setIsDeleted(true);
						
						this.detallecursosEliminados.add(this.detallecurso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallecursoLogic.getDetalleCursos().remove(this.detallecurso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallecursos.remove(this.detallecurso);				
					}
					
					
					((DetalleCursoModel) this.jTableDatosDetalleCurso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCurso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleCurso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleCurso) {
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleCurso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleCurso(this.detallecurso);
				}
				
				//ARCHITECTURE
				try {
					

					//Curso
					if(!this.detallecursoConstantesFunciones.cargarid_cursoDetalleCurso || this.detallecursoConstantesFunciones.event_dependid_cursoDetalleCurso) {
						//this.cargarCombosCursosForeignKeyLista(" where id="+this.detallecurso.getid_curso());
									//this.inicializarActualizarBindingDetalleCurso(false,false);
						this.cursosForeignKey=new ArrayList<Curso>();

						if(detallecurso.getCurso()!=null) {
							this.cursosForeignKey.add(detallecurso.getCurso());
						}

						this.addItemDefectoCombosForeignKeyCurso();
						this.cargarCombosFrameCursosForeignKey("Todos");
					}
					this.setActualCursoForeignKey(this.detallecurso.getid_curso(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleCurso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleCurso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCurso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleCurso(DetalleCurso detallecurso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleCurso(detallecurso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleCurso(DetalleCurso detallecurso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleCurso(detallecurso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleCurso(detallecurso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleCurso(detallecurso);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleCurso(DetalleCurso detallecurso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setText(detallecurso.getId().toString());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setText(detallecurso.getnombre());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setText(detallecurso.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleCurso detallecursoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallecursoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleCurso detallecursoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallecursoLocal=this.detallecurso;
			} else {
				detallecursoLocal=this.detallecursoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallecursoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleCurso(detallecursoLocal,true);
					
					if(detallecursoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallecursoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallecursoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleCurso(DetalleCurso detallecurso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleCurso(detallecurso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(detallecurso);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleCurso(DetalleCurso detallecurso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleCurso(detallecurso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleCurso(DetalleCurso detallecurso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.getText()==null || this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.getText()=="" || this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setText("0");
			}

			if(conColumnasBase) {detallecurso.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleCursoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabelIdDetalleCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallecurso.setnombre(this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleCursoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabelnombreDetalleCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallecurso.setdescripcion(this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleCursoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCurso.jLabeldescripcionDetalleCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleCurso(DetalleCurso detallecursoBean,DetalleCurso detallecurso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallecursoBean.getid_curso()!=null && !detallecursoBean.getid_curso().equals(-1L))) {detallecurso.setid_curso(detallecursoBean.getid_curso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleCurso(DetalleCurso detallecursoOrigen,DetalleCurso detallecurso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallecursoOrigen.getId()!=null && !detallecursoOrigen.getId().equals(0L))) {detallecurso.setId(detallecursoOrigen.getId());}}
			if(conDefault || (!conDefault && detallecursoOrigen.getid_curso()!=null && !detallecursoOrigen.getid_curso().equals(-1L))) {detallecurso.setid_curso(detallecursoOrigen.getid_curso());}
			if(conDefault || (!conDefault && detallecursoOrigen.getnombre()!=null && !detallecursoOrigen.getnombre().equals(""))) {detallecurso.setnombre(detallecursoOrigen.getnombre());}
			if(conDefault || (!conDefault && detallecursoOrigen.getdescripcion()!=null && !detallecursoOrigen.getdescripcion().equals(""))) {detallecurso.setdescripcion(detallecursoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleCurso(DetalleCurso detallecurso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setText(detallecurso.getId().toString());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setText(detallecurso.getnombre());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setText(detallecurso.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleCurso(DetalleCursoBean detallecursoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setText(detallecursoBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setText(detallecursoBean.getnombre());
			this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setText(detallecursoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleCurso(DetalleCursoParameterReturnGeneral detallecursoReturnGeneral,DetalleCursoBean detallecursoBean,Boolean conDefault) throws Exception { 
		try {
			DetalleCurso detallecursoLocal=new DetalleCurso();
			
			detallecursoLocal=detallecursoReturnGeneral.getDetalleCurso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallecursoLocal.getId()!=null && !detallecursoLocal.getId().equals(0L))) {detallecursoBean.setId(detallecursoLocal.getId());}}
			if(conDefault || (!conDefault && detallecursoLocal.getid_curso()!=null && !detallecursoLocal.getid_curso().equals(-1L))) {detallecursoBean.setid_curso(detallecursoLocal.getid_curso());}
			if(conDefault || (!conDefault && detallecursoLocal.getnombre()!=null && !detallecursoLocal.getnombre().equals(""))) {detallecursoBean.setnombre(detallecursoLocal.getnombre());}
			if(conDefault || (!conDefault && detallecursoLocal.getdescripcion()!=null && !detallecursoLocal.getdescripcion().equals(""))) {detallecursoBean.setdescripcion(detallecursoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleCursoGenerico(Long idDetalleCursoSeleccionado,JComboBox jComboBoxDetalleCurso,List<DetalleCurso> detallecursosLocal)throws Exception {
		try {
			DetalleCurso  detallecursoTemp=null;

			for(DetalleCurso detallecursoAux:detallecursosLocal) {
				if(detallecursoAux.getId()!=null && detallecursoAux.getId().equals(idDetalleCursoSeleccionado)) {
					detallecursoTemp=detallecursoAux;
					break;
				}
			}

			jComboBoxDetalleCurso.setSelectedItem(detallecursoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleCursoGenerico(JComboBox jComboBoxDetalleCurso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleCurso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleCurso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecurso=(DetalleCurso) detallecursoLogic.getDetalleCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallecurso =(DetalleCurso) detallecursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Curso")) {
			//sDescripcion=this.getActualCursoForeignKeyDescripcion((Long)value);
			if(!detallecurso.getIsNew() && !detallecurso.getIsChanged() && !detallecurso.getIsDeleted()) {
				sDescripcion=detallecurso.getcurso_descripcion();
			} else {
				//sDescripcion=this.getActualCursoForeignKeyDescripcion((Long)value);
				sDescripcion=detallecurso.getcurso_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleCurso detallecursoRow=new DetalleCurso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecursoRow=(DetalleCurso) detallecursoLogic.getDetalleCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallecursoRow=(DetalleCurso) detallecursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleCurso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso));			
			this.jButtonDuplicarDetalleCurso.setVisible((this.isVisibilidadCeldaDuplicarDetalleCurso && this.isPermisoDuplicarDetalleCurso));			
			this.jButtonCopiarDetalleCurso.setVisible((this.isVisibilidadCeldaCopiarDetalleCurso && this.isPermisoCopiarDetalleCurso));
			this.jButtonVerFormDetalleCurso.setVisible((this.isVisibilidadCeldaVerFormDetalleCurso && this.isPermisoVerFormDetalleCurso));
			
			this.jButtonAbrirOrderByDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));			
			
			this.jButtonNuevoRelacionesDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCurso && this.isPermisoNuevoDetalleCurso));			
			this.jButtonNuevoGuardarCambiosDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarDetalleCurso.setVisible((this.isVisibilidadCeldaModificarDetalleCurso && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.setVisible((this.isVisibilidadCeldaActualizarDetalleCurso && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.setVisible((this.isVisibilidadCeldaEliminarDetalleCurso && this.isPermisoEliminarDetalleCurso));
			this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.setVisible(this.isVisibilidadCeldaCancelarDetalleCurso);							
			this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso));						
			this.jButtonDuplicarToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaDuplicarDetalleCurso && this.isPermisoDuplicarDetalleCurso));						
			this.jButtonCopiarToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaCopiarDetalleCurso && this.isPermisoCopiarDetalleCurso));			
			this.jButtonVerFormToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaVerFormDetalleCurso && this.isPermisoVerFormDetalleCurso));			
			this.jButtonAbrirOrderByToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));
			this.jButtonNuevoRelacionesToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCurso && this.isPermisoNuevoDetalleCurso));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));			
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaModificarDetalleCurso && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaActualizarDetalleCurso  && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaEliminarDetalleCurso && this.isPermisoEliminarDetalleCurso));
			this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarToolBarDetalleCurso.setVisible(this.isVisibilidadCeldaCancelarDetalleCurso);				
			this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso));			
			this.jMenuItemDuplicarDetalleCurso.setVisible((this.isVisibilidadCeldaDuplicarDetalleCurso && this.isPermisoDuplicarDetalleCurso));			
			this.jMenuItemCopiarDetalleCurso.setVisible((this.isVisibilidadCeldaCopiarDetalleCurso && this.isPermisoCopiarDetalleCurso));			
			this.jMenuItemVerFormDetalleCurso.setVisible((this.isVisibilidadCeldaVerFormDetalleCurso && this.isPermisoVerFormDetalleCurso));			
			this.jMenuItemAbrirOrderByDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));			
			//this.jMenuItemMostrarOcultarDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));
			this.jMenuItemDetalleAbrirOrderByDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));			
			//this.jMenuItemDetalleMostrarOcultarDetalleCurso.setVisible((this.isVisibilidadCeldaOrdenDetalleCurso && this.isPermisoOrdenDetalleCurso));			
			this.jMenuItemNuevoRelacionesDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCurso && this.isPermisoNuevoDetalleCurso));			
			this.jMenuItemNuevoGuardarCambiosDetalleCurso.setVisible((this.isVisibilidadCeldaNuevoDetalleCurso && this.isPermisoNuevoDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));									
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemModificarDetalleCurso.setVisible((this.isVisibilidadCeldaModificarDetalleCurso && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemActualizarDetalleCurso.setVisible((this.isVisibilidadCeldaActualizarDetalleCurso && this.isPermisoActualizarDetalleCurso));	
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemEliminarDetalleCurso.setVisible((this.isVisibilidadCeldaEliminarDetalleCurso && this.isPermisoEliminarDetalleCurso));
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemCancelarDetalleCurso.setVisible(this.isVisibilidadCeldaCancelarDetalleCurso);				
			}
			
			this.jMenuItemGuardarCambiosDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));						
			this.jMenuItemGuardarCambiosTablaDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleCurso=this.jButtonNuevoDetalleCurso.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleCurso=this.jButtonDuplicarDetalleCurso.isVisible();
			this.isVisibilidadCeldaCopiarDetalleCurso=this.jButtonCopiarDetalleCurso.isVisible();
			this.isVisibilidadCeldaVerFormDetalleCurso=this.jButtonVerFormDetalleCurso.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleCurso=this.jButtonAbrirOrderByDetalleCurso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=this.jButtonNuevoRelacionesDetalleCurso.isVisible();
			this.isVisibilidadCeldaModificarDetalleCurso=this.jButtonModificarDetalleCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.isVisibilidadCeldaActualizarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.isVisible();
			this.isVisibilidadCeldaGuardarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=this.jButtonGuardarCambiosTablaDetalleCurso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleCurso=this.jButtonNuevoToolBarDetalleCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=this.jButtonNuevoRelacionesToolBarDetalleCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.isVisibilidadCeldaModificarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarToolBarDetalleCurso.isVisible();
			this.isVisibilidadCeldaActualizarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarToolBarDetalleCurso.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarToolBarDetalleCurso.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarToolBarDetalleCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleCurso=this.jButtonGuardarCambiosToolBarDetalleCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=this.jButtonGuardarCambiosTablaToolBarDetalleCurso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleCurso=this.jMenuItemNuevoDetalleCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=this.jMenuItemNuevoRelacionesDetalleCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.isVisibilidadCeldaModificarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jMenuItemModificarDetalleCurso.isVisible();
			this.isVisibilidadCeldaActualizarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jMenuItemActualizarDetalleCurso.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jMenuItemEliminarDetalleCurso.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCurso=this.jInternalFrameDetalleFormDetalleCurso.jMenuItemCancelarDetalleCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleCurso=this.jMenuItemGuardarCambiosDetalleCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=this.jMenuItemGuardarCambiosTablaDetalleCurso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleCurso(Boolean esInicializar) {
		if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
				//if(this.detallecursoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleCurso();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleCurso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleCurso() {
		this.jButtonNuevoDetalleCurso.setVisible(this.isPermisoNuevoDetalleCurso);			
		this.jButtonDuplicarDetalleCurso.setVisible(this.isPermisoDuplicarDetalleCurso);			
		this.jButtonCopiarDetalleCurso.setVisible(this.isPermisoCopiarDetalleCurso);			
		this.jButtonVerFormDetalleCurso.setVisible(this.isPermisoVerFormDetalleCurso);			
		
		this.jButtonAbrirOrderByDetalleCurso.setVisible(this.isPermisoOrdenDetalleCurso);					
		
		this.jButtonNuevoRelacionesDetalleCurso.setVisible(this.isPermisoNuevoDetalleCurso);			
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarDetalleCurso.setVisible(this.isPermisoActualizarDetalleCurso);	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.setVisible(this.isPermisoActualizarDetalleCurso);	
			this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.setVisible(this.isPermisoEliminarDetalleCurso);
			this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.setVisible(this.isVisibilidadCeldaCancelarDetalleCurso);						
			this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.setVisible(this.isPermisoGuardarCambiosDetalleCurso);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleCurso.setVisible(this.isPermisoActualizarDetalleCurso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleCurso() {
		this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarDetalleCurso.setVisible(this.isPermisoActualizarDetalleCurso);	
		this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.setVisible(this.isPermisoActualizarDetalleCurso);	
		this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.setVisible(this.isPermisoEliminarDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.setVisible(this.isVisibilidadCeldaCancelarDetalleCurso);							
		this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.setVisible((this.isVisibilidadCeldaGuardarDetalleCurso && this.isPermisoGuardarCambiosDetalleCurso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleCurso() {
		if(DetalleCursoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleCurso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleCurso() {
	}
	
	public void jTableDatosDetalleCursoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleCurso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.getdetallecurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecurso==null) {
						this.detallecurso = new DetalleCurso();
					}

					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				}

				if(this.detallecurso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallecurso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cursoDetalleCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocurso=true;

			idTienePermisocurso=this.tienePermisosUsuarioEnPaginaWebDetalleCurso(CursoConstantesFunciones.CLASSNAME);

			if(idTienePermisocurso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleCurso(this.getdetallecurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);

				this.cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cursoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cursoBeanSwingJInternalFrame.getCursoLogic().setConnexion(this.detallecursoLogic.getConnexion());

				if(this.detallecurso.getid_curso()!=null) {
					this.cursoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cursoBeanSwingJInternalFrame.setIdActual(this.detallecurso.getid_curso());
					this.cursoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cursoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso();
				}

				JInternalFrameBase jinternalFrame =this.cursoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleCurso=(TitledBorder)this.jScrollPanelDatosDetalleCurso.getBorder();
				TitledBorder titledBordercurso=(TitledBorder)this.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.getBorder();

				titledBordercurso.setTitle(titledBorderDetalleCurso.getTitle() + " -> Curso");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cursoDetalleCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.getdetallecurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecurso==null) {
						this.detallecurso = new DetalleCurso();
					}

					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				}

				if(this.detallecurso.getid_curso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_curso = "+this.detallecurso.getid_curso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetalleCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.getdetallecurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecurso==null) {
						this.detallecurso = new DetalleCurso();
					}

					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				}

				if(this.detallecurso.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detallecurso.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.getdetallecurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecurso==null) {
						this.detallecurso = new DetalleCurso();
					}

					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);
				}

				if(this.detallecurso.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detallecurso.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCursoDetalleCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleCurso(false,false);

			this.getDetalleCursosFK_IdCurso();

			this.inicializarActualizarBindingDetalleCurso(false);

			//if(DetalleCursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleCurso() {
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
			this.jInternalFrameDetalleFormDetalleCurso.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleCurso.dispose();
			this.jInternalFrameDetalleFormDetalleCurso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
			this.jInternalFrameReporteDinamicoDetalleCurso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleCurso.dispose();
			this.jInternalFrameReporteDinamicoDetalleCurso=null;
		}
		
		if(this.jInternalFrameImportacionDetalleCurso!=null) {
			this.jInternalFrameImportacionDetalleCurso.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleCurso.dispose();
			this.jInternalFrameImportacionDetalleCurso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleCurso();
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleCurso")) {
				jButtonDuplicarDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleCurso")) {
				jButtonCopiarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleCurso")) {
				jButtonVerFormDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleCurso")) {
				jButtonDuplicarDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleCurso")) {
				jButtonDuplicarDetalleCursoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleCurso")) {
				jButtonModificarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleCurso")) {
				jButtonModificarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleCurso")) {
				jButtonModificarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleCurso")) {
				jButtonActualizarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleCurso")) {
				jButtonActualizarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleCurso")) {
				jButtonActualizarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleCurso")) {
				jButtonEliminarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleCurso")) {
				jButtonEliminarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleCurso")) {
				jButtonEliminarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleCurso")) {
				jButtonCancelarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleCurso")) {
				jButtonCancelarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleCurso")) {
				jButtonCancelarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleCurso")) {
				jButtonCerrarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleCurso")) {
				jButtonCerrarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleCurso")) {
				jButtonCerrarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleCurso")) {
				jButtonMostrarOcultarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleCurso")) {
				jButtonCancelarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleCurso")) {
				jButtonCopiarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleCurso")) {
				jButtonVerFormDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleCurso")) {
				jButtonCopiarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleCurso")) {
				jButtonVerFormDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleCurso")) {
				jButtonRecargarInformacionDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleCurso")) {
				jButtonRecargarInformacionDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleCurso")) {
				jButtonRecargarInformacionDetalleCursoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleCurso")) {
				jButtonAnterioresDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleCurso")) {
				jButtonAnterioresDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleCurso")) {
				jButtonAnterioresDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleCurso")) {
				jButtonSiguientesDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleCurso")) {
				jButtonSiguientesDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleCurso")) {
				jButtonSiguientesDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleCurso") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleCurso")) {
				jButtonAbrirOrderByDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleCurso") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleCurso")) {
				jButtonMostrarOcultarDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleCurso")) {
				jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleCurso")) {
				jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleCurso")) {
				jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleCurso")) {
				jButtonCerrarReporteDinamicoDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleCurso")) {
				jButtonGenerarReporteDinamicoDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleCurso")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleCurso")) {
				jButtonCerrarImportacionDetalleCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleCurso")) {
				
				jButtonGenerarImportacionDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleCurso")) {
				
				jButtonAbrirImportacionDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleCurso")) {
				jComboBoxTiposAccionesDetalleCursoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleCurso")) {
				jComboBoxTiposRelacionesDetalleCursoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleCurso")) {
				jComboBoxTiposAccionesDetalleCursoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleCurso")) {
				
				jComboBoxTiposSeleccionarDetalleCursoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleCurso")) {
				jTextFieldValorCampoGeneralDetalleCursoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleCurso")) {
				jButtonAbrirOrderByDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleCurso")) {
				jButtonAbrirOrderByDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleCurso")) {
				jButtonCerrarOrderByDetalleCursoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleCursoBusqueda")) {
				this.jButtonidDetalleCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cursoDetalleCursoUpdate")) {
				this.jButtonid_cursoDetalleCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cursoDetalleCursoBusqueda")) {
				this.jButtonid_cursoDetalleCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleCursoBusqueda")) {
				this.jButtonnombreDetalleCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleCursoBusqueda")) {
				this.jButtondescripcionDetalleCursoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCursoDetalleCurso")) {
				this.jButtonFK_IdCursoDetalleCursoActionPerformed(evt);
			}
			
			;
			
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleCurso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleCurso detallecursoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallecursoLocal=this.detallecurso;
			} else {
				detallecursoLocal=this.detallecursoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
							
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
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
			
			


			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
								
						
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
								
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
							
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
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
			
			


			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
								
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleCurso")) {
					jCheckBoxSeleccionarTodosDetalleCursoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleCurso")) {
					jCheckBoxSeleccionadosDetalleCursoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleCurso")) {
					
				}
				
				


				
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
												
				
				


				
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
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
			
			


			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCursoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecurso);
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
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
				
				


				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCurso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecursoAnterior =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleCurso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleCurso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallecurso =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallecurso =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallecurso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleCurso")) {
				
				}
				
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleCurso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleCurso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleCurso")) {
			
			}
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleCurso();
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleCurso")) {
				jButtonDuplicarDetalleCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleCurso")) {
				jButtonCopiarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleCurso")) {
				jButtonVerFormDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleCurso")) {
				jButtonNuevoDetalleCursoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleCurso")) {
				jButtonModificarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleCurso")) {
				jButtonActualizarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleCurso")) {
				jButtonEliminarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleCurso")) {
				jButtonCancelarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleCurso")) {
				jButtonCerrarDetalleCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleCurso")) {
				jButtonGuardarCambiosDetalleCursoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleCurso")) {
				jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleCurso")) {
				jButtonAbrirOrderByDetalleCursoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleCurso")) {
				jButtonRecargarInformacionDetalleCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleCurso")) {
				jButtonAnterioresDetalleCursoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleCurso")) {
				jButtonSiguientesDetalleCursoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleCursoBusqueda")) {
				this.jButtonidDetalleCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cursoDetalleCursoUpdate")) {
				this.jButtonid_cursoDetalleCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cursoDetalleCursoBusqueda")) {
				this.jButtonid_cursoDetalleCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleCursoBusqueda")) {
				this.jButtonnombreDetalleCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleCursoBusqueda")) {
				this.jButtondescripcionDetalleCursoBusquedaActionPerformed(evt);
			}
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleCurso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleCurso")) {
				closingInternalFrameDetalleCurso();
				
			} else if(sTipo.equals("jButtonCancelarDetalleCurso")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleCurso = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleCursoBeanSwingJInternalFrame jInternalFrameParent=(DetalleCursoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleCurso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleCursoActionPerformed(null);
			}
			
			DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallecurso,new Object(),this.detallecursoParameterGeneral,this.detallecursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallecurso)) {
			if(!esControlTabla) {
				if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);			
				}
				
				if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleCurso(this.detallecurso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallecursoReturnGeneral=detallecursoLogic.procesarEventosDetalleCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecursoLogic.getDetalleCursos(),this.detallecurso,this.detallecursoParameterGeneral,this.isEsNuevoDetalleCurso,classes);//this.detallecursoLogic.getDetalleCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleCurso(this.detallecursoReturnGeneral,this.detallecursoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleCurso(classes,this.detallecursoReturnGeneral,this.detallecursoBean,false);
					}
						
					if(this.detallecursoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso());	
					}
						
					if(this.detallecursoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso(),classes);//this.detallecursoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleCurso(this.detallecurso,classes);//this.detallecursoBean);									
				}
			
				if(DetalleCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleCurso(this.detallecurso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCurso(this.detallecurso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallecursoAnterior!=null) {
						this.detallecurso=this.detallecursoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallecursoReturnGeneral=detallecursoLogic.procesarEventosDetalleCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecursoLogic.getDetalleCursos(),this.detallecurso,this.detallecursoParameterGeneral,this.isEsNuevoDetalleCurso,classes);//this.detallecursoLogic.getDetalleCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallecursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallecursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallecursoReturnGeneral.getDetalleCurso(),detallecursoLogic.getDetalleCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallecursoReturnGeneral.getDetalleCurso(),this.detallecursos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleCurso.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleCurso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleCurso();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleCurso() throws Exception {
		
		DetalleCursoModel detallecursoModel=(DetalleCursoModel)this.jTableDatosDetalleCurso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecursoModel.detallecursos=this.detallecursoLogic.getDetalleCursos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallecursoModel.detallecursos=this.detallecursos;
		}
		
		
		((DetalleCursoModel) this.jTableDatosDetalleCurso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleCurso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallecursoAnterior(),this.detallecursoLogic.getDetalleCursos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallecursoAnterior(),this.detallecursos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleCurso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleCurso(DetalleCurso detallecurso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
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
										
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecurso,new Object(),generalEntityParameterGeneral,this.detallecursoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleCursoConstantesFunciones.getClassesRelationshipsOfDetalleCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleCursoConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleCurso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecurso,new Object(),generalEntityParameterGeneral,this.detallecursoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleCurso(DetalleCursoBean detallecursoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleCurso(ArrayList<Classe> classes,DetalleCursoReturnGeneral detallecursoReturnGeneral,DetalleCursoBean detallecursoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleCurso(DetalleCurso detallecurso,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallecurso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleCurso = new DetalleCursoDetalleFormJInternalFrame(jDesktopPane,this.detallecursoSessionBean.getConGuardarRelaciones(),this.detallecursoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.setVisible(false);
		this.jInternalFrameDetalleFormDetalleCurso.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleCurso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleCurso.detallecursoLogic=this.detallecursoLogic;
		
		this.cargarCombosFrameForeignKeyDetalleCurso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleCurso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleCurso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleCurso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleCurso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleCurso"));
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarDetalleCurso.addActionListener(new ButtonActionListener(this,"ModificarDetalleCurso"));

		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleCurso"));
					
		this.jInternalFrameDetalleFormDetalleCurso.jMenuItemModificarDetalleCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleCurso"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.addActionListener (new ButtonActionListener(this,"ActualizarDetalleCurso"));
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleCurso"));
						
		this.jInternalFrameDetalleFormDetalleCurso.jMenuItemActualizarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleCurso"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.addActionListener (new ButtonActionListener(this,"EliminarDetalleCurso"));
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleCurso"));
								
		this.jInternalFrameDetalleFormDetalleCurso.jMenuItemEliminarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleCurso"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.addActionListener (new ButtonActionListener(this,"CancelarDetalleCurso"));
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleCurso"));
					
		this.jInternalFrameDetalleFormDetalleCurso.jMenuItemCancelarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleCurso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jMenuItemDetalleCerrarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleCurso"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCurso"));
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCurso"));
		
		
		
		this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleCurso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonidDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoUpdate.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonnombreDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtondescripcionDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleCursoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleCurso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleCurso"));
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleCurso"));
		}
		
		this.jTableDatosDetalleCurso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleCurso"));
		
		this.jTableDatosDetalleCurso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleCurso"));
		
		this.jButtonNuevoDetalleCurso.addActionListener(new ButtonActionListener(this,"NuevoDetalleCurso"));
		
		this.jButtonDuplicarDetalleCurso.addActionListener(new ButtonActionListener(this,"DuplicarDetalleCurso"));
		
		this.jButtonCopiarDetalleCurso.addActionListener(new ButtonActionListener(this,"CopiarDetalleCurso"));
		
		this.jButtonVerFormDetalleCurso.addActionListener(new ButtonActionListener(this,"VerFormDetalleCurso"));
		
		
		this.jButtonNuevoToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleCurso"));
			
		this.jButtonDuplicarToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleCurso"));
			
		this.jMenuItemNuevoDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleCurso"));
			
		this.jMenuItemDuplicarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleCurso"));		
		
		
		this.jButtonNuevoRelacionesDetalleCurso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleCurso"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleCurso"));
			
		this.jMenuItemNuevoRelacionesDetalleCurso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleCurso"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarDetalleCurso.addActionListener(new ButtonActionListener(this,"ModificarDetalleCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonModificarToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleCurso"));
			
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemModificarDetalleCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarDetalleCurso.addActionListener (new ButtonActionListener(this,"ActualizarDetalleCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonActualizarToolBarDetalleCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleCurso"));
				
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemActualizarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarDetalleCurso.addActionListener (new ButtonActionListener(this,"EliminarDetalleCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonEliminarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleCurso"));
						
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemEliminarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarDetalleCurso.addActionListener (new ButtonActionListener(this,"CancelarDetalleCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonCancelarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleCurso"));
			
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemCancelarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleCurso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleCurso"));		
		
		
		this.jButtonCerrarDetalleCurso.addActionListener (new ButtonActionListener(this,"CerrarDetalleCurso"));
		
		
		this.jButtonCerrarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleCurso"));
			
		this.jMenuItemCerrarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleCurso"));
			
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jMenuItemDetalleCerrarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCurso"));
		}
		
		this.jButtonCopiarToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleCurso"));
			
		this.jButtonVerFormToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleCurso"));
		
		this.jMenuItemGuardarCambiosDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleCurso"));
			
		this.jMenuItemCopiarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleCurso"));		
		
		this.jMenuItemVerFormDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleCurso"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleCurso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleCurso"));
			
		this.jMenuItemGuardarCambiosTablaDetalleCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleCurso"));		
		
		
		
		this.jButtonRecargarInformacionDetalleCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleCurso"));
					
		this.jButtonRecargarInformacionToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleCurso"));
		
		this.jMenuItemRecargarInformacionDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleCurso"));		
		
		
		
		this.jButtonAnterioresDetalleCurso.addActionListener (new ButtonActionListener(this,"AnterioresDetalleCurso"));
		
		
		this.jButtonAnterioresToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleCurso"));
		
		this.jMenuItemAnterioresDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleCurso"));		
		
		
		this.jButtonSiguientesDetalleCurso.addActionListener (new ButtonActionListener(this,"SiguientesDetalleCurso"));
		
		
		this.jButtonSiguientesToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleCurso"));
			
		this.jMenuItemSiguientesDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleCurso"));
			
		this.jMenuItemAbrirOrderByDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleCurso"));
			
		this.jMenuItemMostrarOcultarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleCurso"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleCurso"));
			
		this.jMenuItemDetalleMostarOcultarDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleCurso"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleCurso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleCurso"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleCurso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleCurso"));

		this.jCheckBoxSeleccionadosDetalleCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleCurso"));
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleCurso"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleCurso.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleCurso"));
			
		this.jComboBoxTiposAccionesDetalleCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleCurso"));
					
		this.jComboBoxTiposSeleccionarDetalleCurso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleCurso"));
			
		this.jTextFieldValorCampoGeneralDetalleCurso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleCurso"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonidDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoUpdate.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonnombreDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtondescripcionDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleCursoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCursoDetalleCurso.addActionListener(new ButtonActionListener(this,"FK_IdCursoDetalleCurso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleCurso!=null) {
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCurso"));
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCurso"));
				this.jInternalFrameReporteDinamicoDetalleCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCurso"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleCurso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCurso"));				
			//this.jButtonGenerarReporteDinamicoDetalleCurso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCurso"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleCurso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCurso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleCurso!=null) {
				this.jInternalFrameImportacionDetalleCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleCurso"));
				this.jInternalFrameImportacionDetalleCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleCurso"));
				this.jInternalFrameImportacionDetalleCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleCurso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleCurso"));
			
			this.jButtonAbrirOrderByToolBarDetalleCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleCurso"));			
			
			if(this.jInternalFrameOrderByDetalleCurso!=null) {
				this.jInternalFrameOrderByDetalleCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleCurso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCurso.jTabbedPaneRelacionesDetalleCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleCurso"));
		
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
            		closingInternalFrameDetalleCurso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleCurso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleCurso = (JInternalFrameBase)event.getSource();
	            	
	            DetalleCursoBeanSwingJInternalFrame jInternalFrameParent=(DetalleCursoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleCurso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleCursoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleCurso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleCurso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleCurso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleCurso";
		inputMap = this.jButtonNuevoDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleCursoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleCurso";
		inputMap = this.jButtonNuevoRelacionesDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleCursoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleCurso";
		inputMap = this.jButtonModificarDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleCurso";
		inputMap = this.jButtonActualizarDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleCurso";
		inputMap = this.jButtonEliminarDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleCurso";
		inputMap = this.jButtonCancelarDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleCurso";
		inputMap = this.jButtonCerrarDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleCurso";
		inputMap = this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleCurso.jButtonGuardarCambiosDetalleCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleCurso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleCursoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonidDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoUpdate.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonid_cursoDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_cursoDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtonnombreDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCurso.jButtondescripcionDetalleCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleCursoBusqueda"));
		
		
		this.jButtonFK_IdCursoDetalleCurso.addActionListener(new ButtonActionListener(this,"FK_IdCursoDetalleCurso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleCursoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleCurso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleCurso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
					detallecursoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCurso detallecursoAux:detallecursos) {
					detallecursoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
						detallecursoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCurso detallecursoAux:detallecursos) {
						detallecursoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCurso detallecursoAux:detallecursos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleCurso.getSelectedRows();
			
			DetalleCurso detallecursoLocal=new DetalleCurso();
			
			//this.seleccionarTodosDetalleCurso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecursoLocal =(DetalleCurso) this.detallecursoLogic.getDetalleCursos().toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallecursoLocal =(DetalleCurso) this.detallecursos.toArray()[this.jTableDatosDetalleCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallecursoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
						detallecursoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCurso detallecursoAux:detallecursos) {
						detallecursoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleCurso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleCursoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleCursoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleCursoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleCurso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleCurso detallecursoAux:this.detallecursoLogic.getDetalleCursos()) {
				
						if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detallecursoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallecursoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCurso detallecursoAux:detallecursos) {
					
						if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detallecursoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallecursoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleCursoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleCurso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleCurso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleCurso) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleCurso(conSplash);
				
					this.generarReporteDetalleCursosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleCursosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleCursosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleCursosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleCurso();
				
				this.exportarDetalleCursosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleCursos();
				//this.importarDetalleCursos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleCurso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleCursosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleCurso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleCurso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleCurso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleCursoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleCurso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleCurso(conSplash);
					
						//this.actualizarParametrosGeneralDetalleCurso();
						
						this.generarReporteProcesoAccionDetalleCursosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleCursoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle CursoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleCurso();
				
						this.actualizarParametrosGeneralDetalleCurso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallecursoReturnGeneral=detallecursoLogic.procesarAccionDetalleCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallecursoLogic.getDetalleCursos(),this.detallecursoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleCursoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleCurso();
					
					DetalleCursoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleCursoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleCurso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleCurso.jComboBoxTiposAccionesFormularioDetalleCurso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleCurso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleCursoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleCurso();
			
			if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
			DetalleCurso detallecurso=new DetalleCurso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleCurso.getSelectedItem();
			
			
			
			
			detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallecursosSeleccionados.size()==1) {
				for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
					detallecurso=detallecursoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleCurso();
			
      		//this.finishProcessDetalleCurso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleCursoReturnGeneral() throws Exception {
		if(this.detallecursoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallecursoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallecursoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallecursoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallecursoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallecursoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleCurso(false);
		}
		
		if(this.detallecursoReturnGeneral.getConRetornoLista() || this.detallecursoReturnGeneral.getConRetornoObjeto()) {
			if(this.detallecursoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallecursoLogic.setDetalleCursos(this.detallecursoReturnGeneral.getDetalleCursos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallecursoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallecursoLogic.setDetalleCurso(this.detallecursoReturnGeneral.getDetalleCurso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleCurso(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleCurso() throws Exception {
		
		
	}
	
	public ArrayList<DetalleCurso> getDetalleCursosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleCurso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleCurso detallecursoAux:detallecursoLogic.getDetalleCursos()) {
					if(detallecursoAux.getIsSelected()) {
						detallecursosSeleccionados.add(detallecursoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCurso detallecursoAux:this.detallecursos) {
					if(detallecursoAux.getIsSelected()) {
						detallecursosSeleccionados.add(detallecursoAux);				
					}
				}
			}
			
			if(detallecursosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallecursosSeleccionados.addAll(this.detallecursoLogic.getDetalleCursos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallecursosSeleccionados.addAll(this.detallecursos);				
					}
				}
			}
		} else {
			detallecursosSeleccionados.add(this.detallecurso);
		}
		
		return detallecursosSeleccionados;
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
	
	public void generarReporteDetalleCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleCursosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleCursosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleCursosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleCurso();
		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleCurso();
		
		
		//this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados ,detallecursoImplementable,detallecursoImplementableHome);
	}
	
	public void mostrarImportacionDetalleCursos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleCurso();
		
		this.abrirFrameImportacionDetalleCurso();		
		
			
		//this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados ,detallecursoImplementable,detallecursoImplementableHome);
	}
	
	public void importarDetalleCursos() throws Exception {		
	
	}
	
	public void exportarDetalleCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleCursosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleCursosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleCursosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleCurso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleCurso(detallecursoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallecursoAux.setsDetalleGeneralEntityReporte(detallecursoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleCurso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleCursoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCursoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCursoConstantesFunciones.LABEL_IDCURSO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCursoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCursoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleCurso(DetalleCurso detallecurso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallecurso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecurso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecurso.getcurso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecurso.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecurso.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleCursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleCurso(row);				
				iRow++;
			}				
			
			for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleCurso(detallecursoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleCursosSeleccionados() throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();		
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecurso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallecursos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallecurso");
			//elementRoot.appendChild(element);
		
			for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
				element = document.createElement("detallecurso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleCurso(detallecursoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleCurso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_IDCURSO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleCurso(DetalleCurso detallecurso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallecurso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecurso.getcurso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecurso.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecurso.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleCurso(DetalleCurso detallecurso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleCursoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallecurso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleCursoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallecurso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcurso_descripcion = document.createElement(DetalleCursoConstantesFunciones.IDCURSO);
		elementcurso_descripcion.appendChild(document.createTextNode(detallecurso.getcurso_descripcion()));
		element.appendChild(elementcurso_descripcion);

		Element elementnombre = document.createElement(DetalleCursoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detallecurso.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(DetalleCursoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detallecurso.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleCursosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleCurso> detallecursosSeleccionados=new ArrayList<DetalleCurso>();
		
		detallecursosSeleccionados=this.getDetalleCursosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleCurso(detallecursosSeleccionados);
		
		this.generarReporteDetalleCursos("Todos",detallecursosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleCurso(ArrayList<DetalleCurso> detallecursosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleCurso detallecursoAux:detallecursosSeleccionados) {
				detallecursoAux.setsDetalleGeneralEntityReporte(detallecursoAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_IDCURSO)) {
					existe=true;
					detallecursoAux.setsDescripcionGeneralEntityReporte1(detallecursoAux.getcurso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detallecursoAux.setsDescripcionGeneralEntityReporte1(detallecursoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detallecursoAux.setsDescripcionGeneralEntityReporte1(detallecursoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleCurso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleCurso=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleCurso=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=true;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=true;
			this.isVisibilidadCeldaEliminarDetalleCurso=true;
			this.isVisibilidadCeldaCancelarDetalleCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=true;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=true;
			this.isVisibilidadCeldaModificarDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
			this.isVisibilidadCeldaModificarDetalleCurso=true;
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
			this.isVisibilidadCeldaCancelarDetalleCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCurso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleCursoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=true;
		} else {
			this.actualizarEstadoPanelsDetalleCurso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleCurso=false;
			//this.isVisibilidadCeldaVerFormDetalleCurso=false;
			this.isVisibilidadCeldaDuplicarDetalleCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallecursoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleCurso=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallecursoSessionBean.getEsGuardarRelacionado()) {
			if(!detallecursoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;												
			}
			
			this.jButtonCerrarDetalleCurso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleCurso=false;
		}
		
		if(!this.permiteMantenimiento(this.detallecurso)) {
			this.isVisibilidadCeldaActualizarDetalleCurso=false;
			this.isVisibilidadCeldaEliminarDetalleCurso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleCurso() {
	}
	
	public void actualizarEstadoPanelsDetalleCurso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleCurso!=null) {
				this.jScrollPanelDatosEdicionDetalleCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCurso!=null) {
				this.jScrollPanelDatosDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCurso!=null) {
				this.jPanelPaginacionDetalleCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
					this.jTabbedPaneBusquedasDetalleCurso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCurso!=null) {
				this.jTabbedPaneBusquedasDetalleCurso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleCurso!=null) {
				this.jPanelParametrosReportesDetalleCurso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCurso(Boolean isParaCurso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCursoNegation=!isParaCurso;

			this.isVisibilidadFK_IdCurso=isParaCurso;
			if(!this.isVisibilidadFK_IdCurso) {this.jTabbedPaneBusquedasDetalleCurso.remove(jPanelFK_IdCursoDetalleCurso);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleCursoSessionBean detallecursoSessionBean=new DetalleCursoSessionBean();
		
		if(this.detallecursoSessionBean==null) {
			this.detallecursoSessionBean=new DetalleCursoSessionBean();
		}
		
		this.detallecursoSessionBean.setsUltimaBusquedaDetalleCurso(this.getsAccionBusqueda());
		this.detallecursoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallecursoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCurso")) {
			detallecursoSessionBean.setid_curso(this.getid_cursoFK_IdCurso());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleCursoSessionBean detallecursoSessionBean=new DetalleCursoSessionBean();
		
		if(this.detallecursoSessionBean==null) {
			this.detallecursoSessionBean=new DetalleCursoSessionBean();
		}
		
		if(this.detallecursoSessionBean.getsUltimaBusquedaDetalleCurso()!=null&&!this.detallecursoSessionBean.getsUltimaBusquedaDetalleCurso().equals("")) {
			this.setsAccionBusqueda(detallecursoSessionBean.getsUltimaBusquedaDetalleCurso());
			this.setiNumeroPaginacion(detallecursoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallecursoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCurso")) {
				this.setid_cursoFK_IdCurso(detallecursoSessionBean.getid_curso());
				detallecursoSessionBean.setid_curso(-1L);
			}
		}
		
		this.detallecursoSessionBean.setsUltimaBusquedaDetalleCurso("");
		this.detallecursoSessionBean.setiNumeroPaginacion(DetalleCursoConstantesFunciones.INUMEROPAGINACION);
		this.detallecursoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleCurso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleCurso() {
		this.updateBorderResaltarBusquedasFormularioDetalleCurso();
		this.updateVisibilidadBusquedasFormularioDetalleCurso();
		this.updateHabilitarBusquedasFormularioDetalleCurso();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleCurso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleCurso.getComponents().length>0) {
	

		if(this.detallecursoConstantesFunciones.resaltarFK_IdCursoDetalleCurso!=null) {
			index= this.jTabbedPaneBusquedasDetalleCurso.indexOfComponent(this.jPanelFK_IdCursoDetalleCurso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCurso.getComponent(index);
				jPanel.setBorder(this.detallecursoConstantesFunciones.resaltarFK_IdCursoDetalleCurso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleCurso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleCurso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleCurso.indexOfComponent(this.jPanelFK_IdCursoDetalleCurso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCurso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallecursoConstantesFunciones.mostrarFK_IdCursoDetalleCurso);
			if(!this.detallecursoConstantesFunciones.mostrarFK_IdCursoDetalleCurso && index>-1) {
				this.jTabbedPaneBusquedasDetalleCurso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleCurso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleCurso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleCurso.indexOfComponent(this.jPanelFK_IdCursoDetalleCurso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCurso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallecursoConstantesFunciones.activarFK_IdCursoDetalleCurso);
				this.jTabbedPaneBusquedasDetalleCurso.setEnabledAt(index,this.detallecursoConstantesFunciones.activarFK_IdCursoDetalleCurso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleCurso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCurso")) {
			index= this.jTabbedPaneBusquedasDetalleCurso.indexOfComponent(this.jPanelFK_IdCursoDetalleCurso);

			this.jTabbedPaneBusquedasDetalleCurso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCurso.getComponent(index);

			this.detallecursoConstantesFunciones.setResaltarFK_IdCursoDetalleCurso(resaltar);

			jPanel.setBorder(this.detallecursoConstantesFunciones.resaltarFK_IdCursoDetalleCurso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleCurso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleCurso() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleCurso();
		this.updateVisibilidadResaltarControlesFormularioDetalleCurso();
		this.updateHabilitarResaltarControlesFormularioDetalleCurso();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleCurso() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallecursoConstantesFunciones.resaltaridDetalleCurso!=null && this.jInternalFrameDetalleFormDetalleCurso!=null) {this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setBorder(this.detallecursoConstantesFunciones.resaltaridDetalleCurso);}
		if(this.detallecursoConstantesFunciones.resaltarid_cursoDetalleCurso!=null && this.jInternalFrameDetalleFormDetalleCurso!=null) {this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setBorder(this.detallecursoConstantesFunciones.resaltarid_cursoDetalleCurso);}
		if(this.detallecursoConstantesFunciones.resaltarnombreDetalleCurso!=null && this.jInternalFrameDetalleFormDetalleCurso!=null) {this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setBorder(this.detallecursoConstantesFunciones.resaltarnombreDetalleCurso);}
		if(this.detallecursoConstantesFunciones.resaltardescripcionDetalleCurso!=null && this.jInternalFrameDetalleFormDetalleCurso!=null) {this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setBorder(this.detallecursoConstantesFunciones.resaltardescripcionDetalleCurso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleCurso() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
	
		//this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostraridDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jPanelidDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostraridDetalleCurso);
		//this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrarid_cursoDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jPanelid_cursoDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrarid_cursoDetalleCurso);
		//this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrarnombreDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jPanelnombreDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrarnombreDetalleCurso);
		//this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrardescripcionDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jPaneldescripcionDetalleCurso.setVisible(this.detallecursoConstantesFunciones.mostrardescripcionDetalleCurso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleCurso() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleCurso!=null) {
	
		this.jInternalFrameDetalleFormDetalleCurso.jLabelidDetalleCurso.setEnabled(this.detallecursoConstantesFunciones.activaridDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jComboBoxid_cursoDetalleCurso.setEnabled(this.detallecursoConstantesFunciones.activarid_cursoDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jTextAreanombreDetalleCurso.setEnabled(this.detallecursoConstantesFunciones.activarnombreDetalleCurso);
		this.jInternalFrameDetalleFormDetalleCurso.jTextAreadescripcionDetalleCurso.setEnabled(this.detallecursoConstantesFunciones.activardescripcionDetalleCurso);
		}
	}
	
		
}