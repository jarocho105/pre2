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

import com.bydan.erp.nomina.util.EstadoNovedadNomiConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoNovedadNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoNovedadNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoNovedadNomiBean;
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
public class EstadoNovedadNomiBeanSwingJInternalFrame extends EstadoNovedadNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoNovedadNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoNovedadNomi> estadonovedadnomiValidator = new ClassValidator<EstadoNovedadNomi>(EstadoNovedadNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoNovedadNomi estadonovedadnomi;	
	public EstadoNovedadNomi estadonovedadnomiAux;
	public EstadoNovedadNomi estadonovedadnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoNovedadNomi estadonovedadnomiTotales;
	public Long idEstadoNovedadNomiActual;
	public Long iIdNuevoEstadoNovedadNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosNovedadNomi=false;

	public Boolean getIsTienePermisosNovedadNomi() {
		return isTienePermisosNovedadNomi;
	}

	public void setIsTienePermisosNovedadNomi(Boolean isTienePermisosNovedadNomi) {
		this.isTienePermisosNovedadNomi= isTienePermisosNovedadNomi;
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
	
	public Boolean isPermisoTodoEstadoNovedadNomi;
	public Boolean isPermisoNuevoEstadoNovedadNomi;
	public Boolean isPermisoActualizarEstadoNovedadNomi;
	public Boolean isPermisoActualizarOriginalEstadoNovedadNomi;
	public Boolean isPermisoEliminarEstadoNovedadNomi;
	public Boolean isPermisoGuardarCambiosEstadoNovedadNomi;
	public Boolean isPermisoConsultaEstadoNovedadNomi;
	public Boolean isPermisoBusquedaEstadoNovedadNomi;
	public Boolean isPermisoReporteEstadoNovedadNomi;
	public Boolean isPermisoPaginacionMedioEstadoNovedadNomi;
	public Boolean isPermisoPaginacionAltoEstadoNovedadNomi;
	public Boolean isPermisoPaginacionTodoEstadoNovedadNomi;
	public Boolean isPermisoCopiarEstadoNovedadNomi;
	public Boolean isPermisoVerFormEstadoNovedadNomi;
	public Boolean isPermisoDuplicarEstadoNovedadNomi;
	public Boolean isPermisoOrdenEstadoNovedadNomi;
	
	
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
	
	public EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiReturnGeneral;
	public EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiParameterGeneral;
	
	

	public NovedadNomiLogic novedadnomiLogic=null;

	public NovedadNomiLogic getNovedadNomiLogic() {
		return novedadnomiLogic;
	}

	public void setNovedadNomiLogic(NovedadNomiLogic novedadnomiLogic) {
		this.novedadnomiLogic = novedadnomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoNovedadNomi=false;
	public Boolean esParaAccionDesdeFormularioEstadoNovedadNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoNovedadNomiSessionBeanAdditional estadonovedadnomiSessionBeanAdditional=null;
	
	public EstadoNovedadNomiSessionBeanAdditional getEstadoNovedadNomiSessionBeanAdditional() {
		return this.estadonovedadnomiSessionBeanAdditional;
	}
	
	public void setEstadoNovedadNomiSessionBeanAdditional(EstadoNovedadNomiSessionBeanAdditional estadonovedadnomiSessionBeanAdditional) {
		try {
			this.estadonovedadnomiSessionBeanAdditional=estadonovedadnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoNovedadNomiBeanSwingJInternalFrameAdditional estadonovedadnomiBeanSwingJInternalFrameAdditional=null;
	//public class EstadoNovedadNomiBeanSwingJInternalFrame
	
	public EstadoNovedadNomiBeanSwingJInternalFrameAdditional getEstadoNovedadNomiBeanSwingJInternalFrameAdditional() {
		return this.estadonovedadnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoNovedadNomiBeanSwingJInternalFrameAdditional(EstadoNovedadNomiBeanSwingJInternalFrameAdditional estadonovedadnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.estadonovedadnomiBeanSwingJInternalFrameAdditional=estadonovedadnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoNovedadNomiLogic estadonovedadnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoNovedadNomi estadonovedadnomiBean;
	public EstadoNovedadNomiConstantesFunciones estadonovedadnomiConstantesFunciones;
	//public EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoNovedadNomi> estadonovedadnomis;	
	//public List<EstadoNovedadNomi> estadonovedadnomisEliminados;
	//public List<EstadoNovedadNomi> estadonovedadnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoNovedadNomi=true;
	public Boolean isVisibilidadCeldaCopiarEstadoNovedadNomi=true;
	public Boolean isVisibilidadCeldaVerFormEstadoNovedadNomi=true;
	public Boolean isVisibilidadCeldaOrdenEstadoNovedadNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaModificarEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaCancelarEstadoNovedadNomi=false;
	public Boolean isVisibilidadCeldaGuardarEstadoNovedadNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;	
	
	
	
	public Long getiIdNuevoEstadoNovedadNomi() {
		return this.iIdNuevoEstadoNovedadNomi;
	}

	public void setiIdNuevoEstadoNovedadNomi(Long iIdNuevoEstadoNovedadNomi) {
		this.iIdNuevoEstadoNovedadNomi = iIdNuevoEstadoNovedadNomi;
	}
	
	public Long getidEstadoNovedadNomiActual() {
		return this.idEstadoNovedadNomiActual;
	}

	public void setidEstadoNovedadNomiActual(Long idEstadoNovedadNomiActual) {
		this.idEstadoNovedadNomiActual = idEstadoNovedadNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoNovedadNomi getestadonovedadnomi() {
		return this.estadonovedadnomi;
	}

	public void setestadonovedadnomi(EstadoNovedadNomi estadonovedadnomi) {
		this.estadonovedadnomi = estadonovedadnomi;
	}
	
	public EstadoNovedadNomi getestadonovedadnomiAux() {
		return this.estadonovedadnomiAux;
	}

	public void setestadonovedadnomiAux(EstadoNovedadNomi estadonovedadnomiAux) {
		this.estadonovedadnomiAux = estadonovedadnomiAux;
	}				
	
	public EstadoNovedadNomi getestadonovedadnomiAnterior() {
		return this.estadonovedadnomiAnterior;
	}

	public void setestadonovedadnomiAnterior(EstadoNovedadNomi estadonovedadnomiAnterior) {
		this.estadonovedadnomiAnterior = estadonovedadnomiAnterior;
	}	
	
	public EstadoNovedadNomi getestadonovedadnomiTotales() {
		return this.estadonovedadnomiTotales;
	}

	public void setestadonovedadnomiTotales(EstadoNovedadNomi estadonovedadnomiTotales) {
		this.estadonovedadnomiTotales = estadonovedadnomiTotales;
	}	
	
	public EstadoNovedadNomi getestadonovedadnomiBean() {
		return this.estadonovedadnomiBean;
	}

	public void setestadonovedadnomiBean(EstadoNovedadNomi estadonovedadnomiBean) {
		this.estadonovedadnomiBean = estadonovedadnomiBean;
	}	
	
	public EstadoNovedadNomiParameterReturnGeneral getestadonovedadnomiReturnGeneral() {
		return this.estadonovedadnomiReturnGeneral;
	}

	public void setestadonovedadnomiReturnGeneral(EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiReturnGeneral) {
		this.estadonovedadnomiReturnGeneral = estadonovedadnomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoNovedadNomiLogic getEstadoNovedadNomiLogic()	{		
		return estadonovedadnomiLogic;
	}

	public void setEstadoNovedadNomiLogic(EstadoNovedadNomiLogic estadonovedadnomiLogic) {
		this.estadonovedadnomiLogic = estadonovedadnomiLogic;
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
	
	public Boolean getIsEsNuevoEstadoNovedadNomi() {
		return isEsNuevoEstadoNovedadNomi;
	}

	public void setIsEsNuevoEstadoNovedadNomi(Boolean isEsNuevoEstadoNovedadNomi) {
		this.isEsNuevoEstadoNovedadNomi = isEsNuevoEstadoNovedadNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoNovedadNomi() {
		return esParaAccionDesdeFormularioEstadoNovedadNomi;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoNovedadNomi(Boolean esParaAccionDesdeFormularioEstadoNovedadNomi) {
		this.esParaAccionDesdeFormularioEstadoNovedadNomi = esParaAccionDesdeFormularioEstadoNovedadNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoNovedadNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoNovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNovedadNomi(this.estadonovedadnomiLogic.getEstadoNovedadNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoNovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNovedadNomi(this.estadonovedadnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadonovedadnomiLogic.setEstadoNovedadNomis(this.estadonovedadnomis);
			estadonovedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoNovedadNomiParameterReturnGeneral getEstadoNovedadNomiParameterGeneral() {
		return this.estadonovedadnomiParameterGeneral;
	}
	
	public void setEstadoNovedadNomiParameterGeneral(EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiParameterGeneral) {
		this.estadonovedadnomiParameterGeneral = estadonovedadnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoNovedadNomi() {
		return isPermisoTodoEstadoNovedadNomi;
	}

	public void setIsPermisoTodoEstadoNovedadNomi(Boolean isPermisoTodoEstadoNovedadNomi) {
		this.isPermisoTodoEstadoNovedadNomi = isPermisoTodoEstadoNovedadNomi;
	}

	public Boolean getIsPermisoNuevoEstadoNovedadNomi() {
		return isPermisoNuevoEstadoNovedadNomi;
	}

	public void setIsPermisoNuevoEstadoNovedadNomi(Boolean isPermisoNuevoEstadoNovedadNomi) {
		this.isPermisoNuevoEstadoNovedadNomi = isPermisoNuevoEstadoNovedadNomi;
	}

	public Boolean getIsPermisoActualizarEstadoNovedadNomi() {
		return isPermisoActualizarEstadoNovedadNomi;
	}

	public void setIsPermisoActualizarEstadoNovedadNomi(Boolean isPermisoActualizarEstadoNovedadNomi) {
		this.isPermisoActualizarEstadoNovedadNomi = isPermisoActualizarEstadoNovedadNomi;
	}

	public Boolean getIsPermisoEliminarEstadoNovedadNomi() {
		return isPermisoEliminarEstadoNovedadNomi;
	}

	public void setIsPermisoEliminarEstadoNovedadNomi(Boolean isPermisoEliminarEstadoNovedadNomi) {
		this.isPermisoEliminarEstadoNovedadNomi = isPermisoEliminarEstadoNovedadNomi;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoNovedadNomi() {
		return isPermisoGuardarCambiosEstadoNovedadNomi;
	}

	public void setIsPermisoGuardarCambiosEstadoNovedadNomi(Boolean isPermisoGuardarCambiosEstadoNovedadNomi) {
		this.isPermisoGuardarCambiosEstadoNovedadNomi = isPermisoGuardarCambiosEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoConsultaEstadoNovedadNomi() {
		return isPermisoConsultaEstadoNovedadNomi;
	}

	public void setIsPermisoConsultaEstadoNovedadNomi(Boolean isPermisoConsultaEstadoNovedadNomi) {
		this.isPermisoConsultaEstadoNovedadNomi = isPermisoConsultaEstadoNovedadNomi;
	}

	public Boolean getIsPermisoBusquedaEstadoNovedadNomi() {
		return isPermisoBusquedaEstadoNovedadNomi;
	}

	public void setIsPermisoBusquedaEstadoNovedadNomi(Boolean isPermisoBusquedaEstadoNovedadNomi) {
		this.isPermisoBusquedaEstadoNovedadNomi = isPermisoBusquedaEstadoNovedadNomi;
	}

	public Boolean getIsPermisoReporteEstadoNovedadNomi() {
		return isPermisoReporteEstadoNovedadNomi;
	}

	public void setIsPermisoReporteEstadoNovedadNomi(Boolean isPermisoReporteEstadoNovedadNomi) {
		this.isPermisoReporteEstadoNovedadNomi = isPermisoReporteEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoNovedadNomi() {
		return isPermisoPaginacionMedioEstadoNovedadNomi;
	}

	public void setIsPermisoPaginacionMedioEstadoNovedadNomi(Boolean isPermisoPaginacionMedioEstadoNovedadNomi) {
		this.isPermisoPaginacionMedioEstadoNovedadNomi = isPermisoPaginacionMedioEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoNovedadNomi() {
		return isPermisoPaginacionTodoEstadoNovedadNomi;
	}

	public void setIsPermisoPaginacionTodoEstadoNovedadNomi(Boolean isPermisoPaginacionTodoEstadoNovedadNomi) {
		this.isPermisoPaginacionTodoEstadoNovedadNomi = isPermisoPaginacionTodoEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoNovedadNomi() {
		return isPermisoPaginacionAltoEstadoNovedadNomi;
	}

	public void setIsPermisoPaginacionAltoEstadoNovedadNomi(Boolean isPermisoPaginacionAltoEstadoNovedadNomi) {
		this.isPermisoPaginacionAltoEstadoNovedadNomi = isPermisoPaginacionAltoEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoCopiarEstadoNovedadNomi() {
		return isPermisoCopiarEstadoNovedadNomi;
	}

	public void setIsPermisoCopiarEstadoNovedadNomi(Boolean isPermisoCopiarEstadoNovedadNomi) {
		this.isPermisoCopiarEstadoNovedadNomi = isPermisoCopiarEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoVerFormEstadoNovedadNomi() {
		return isPermisoVerFormEstadoNovedadNomi;
	}

	public void setIsPermisoVerFormEstadoNovedadNomi(Boolean isPermisoVerFormEstadoNovedadNomi) {
		this.isPermisoVerFormEstadoNovedadNomi = isPermisoVerFormEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoDuplicarEstadoNovedadNomi() {
		return isPermisoDuplicarEstadoNovedadNomi;
	}

	public void setIsPermisoDuplicarEstadoNovedadNomi(Boolean isPermisoDuplicarEstadoNovedadNomi) {
		this.isPermisoDuplicarEstadoNovedadNomi = isPermisoDuplicarEstadoNovedadNomi;
	}
	
	public Boolean getIsPermisoOrdenEstadoNovedadNomi() {
		return isPermisoOrdenEstadoNovedadNomi;
	}

	public void setIsPermisoOrdenEstadoNovedadNomi(Boolean isPermisoOrdenEstadoNovedadNomi) {
		this.isPermisoOrdenEstadoNovedadNomi = isPermisoOrdenEstadoNovedadNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoNovedadNomi() {
		return isVisibilidadCeldaNuevoEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoEstadoNovedadNomi(Boolean isVisibilidadCeldaNuevoEstadoNovedadNomi) {
		this.isVisibilidadCeldaNuevoEstadoNovedadNomi = isVisibilidadCeldaNuevoEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoNovedadNomi() {
		return isVisibilidadCeldaDuplicarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoNovedadNomi(Boolean isVisibilidadCeldaDuplicarEstadoNovedadNomi) {
		this.isVisibilidadCeldaDuplicarEstadoNovedadNomi = isVisibilidadCeldaDuplicarEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoNovedadNomi() {
		return isVisibilidadCeldaCopiarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaCopiarEstadoNovedadNomi(Boolean isVisibilidadCeldaCopiarEstadoNovedadNomi) {
		this.isVisibilidadCeldaCopiarEstadoNovedadNomi = isVisibilidadCeldaCopiarEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoNovedadNomi() {
		return isVisibilidadCeldaVerFormEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaVerFormEstadoNovedadNomi(Boolean isVisibilidadCeldaVerFormEstadoNovedadNomi) {
		this.isVisibilidadCeldaVerFormEstadoNovedadNomi = isVisibilidadCeldaVerFormEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoNovedadNomi() {
		return isVisibilidadCeldaOrdenEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaOrdenEstadoNovedadNomi(Boolean isVisibilidadCeldaOrdenEstadoNovedadNomi) {
		this.isVisibilidadCeldaOrdenEstadoNovedadNomi = isVisibilidadCeldaOrdenEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi() {
		return isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi(Boolean isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi = isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoNovedadNomi() {
		return isVisibilidadCeldaModificarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaModificarEstadoNovedadNomi(Boolean isVisibilidadCeldaModificarEstadoNovedadNomi) {
		this.isVisibilidadCeldaModificarEstadoNovedadNomi = isVisibilidadCeldaModificarEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoNovedadNomi() {
		return isVisibilidadCeldaActualizarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaActualizarEstadoNovedadNomi(Boolean isVisibilidadCeldaActualizarEstadoNovedadNomi) {
		this.isVisibilidadCeldaActualizarEstadoNovedadNomi = isVisibilidadCeldaActualizarEstadoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoNovedadNomi() {
		return isVisibilidadCeldaEliminarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaEliminarEstadoNovedadNomi(Boolean isVisibilidadCeldaEliminarEstadoNovedadNomi) {
		this.isVisibilidadCeldaEliminarEstadoNovedadNomi = isVisibilidadCeldaEliminarEstadoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoNovedadNomi() {
		return isVisibilidadCeldaCancelarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaCancelarEstadoNovedadNomi(Boolean isVisibilidadCeldaCancelarEstadoNovedadNomi) {
		this.isVisibilidadCeldaCancelarEstadoNovedadNomi = isVisibilidadCeldaCancelarEstadoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoNovedadNomi() {
		return isVisibilidadCeldaGuardarEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarEstadoNovedadNomi(Boolean isVisibilidadCeldaGuardarEstadoNovedadNomi) {
		this.isVisibilidadCeldaGuardarEstadoNovedadNomi = isVisibilidadCeldaGuardarEstadoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoNovedadNomi() {
		return isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoNovedadNomi(Boolean isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi) {
		this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi = isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi;
	}
		
	public EstadoNovedadNomiSessionBean getestadonovedadnomiSessionBean() {
		return this.estadonovedadnomiSessionBean;
	}
	
	public void setestadonovedadnomiSessionBean(EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean) {
		this.estadonovedadnomiSessionBean=estadonovedadnomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoNovedadNomi estadonovedadnomi,EstadoNovedadNomi estadonovedadnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoNovedadNomi(estadonovedadnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadonovedadnomiAux.setId(estadonovedadnomi.getId());
		estadonovedadnomiAux.setVersionRow(estadonovedadnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoNovedadNomi();
		
			int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadonovedadnomiValidator.getInvalidValues(this.estadonovedadnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadonovedadnomiLogic.setDatosCliente(datosCliente);
			estadonovedadnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadonovedadnomiAux=new  EstadoNovedadNomi();
				
				estadonovedadnomiAux.setIsNew(true);
				estadonovedadnomiAux.setIsChanged(true);
				
				estadonovedadnomiAux.setEstadoNovedadNomiOriginal(this.estadonovedadnomi);
				
				estadonovedadnomiAux.setId(this.estadonovedadnomi.getId());	
				estadonovedadnomiAux.setVersionRow(this.estadonovedadnomi.getVersionRow());	
				estadonovedadnomiAux.setcodigo(this.estadonovedadnomi.getcodigo());	
				estadonovedadnomiAux.setnombre(this.estadonovedadnomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadnomiLogic.saveEstadoNovedadNomis();//WithConnection
						//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadonovedadnomiLogic.saveEstadoNovedadNomiRelaciones(estadonovedadnomiAux,this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							estadonovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadonovedadnomiAux=new  EstadoNovedadNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() && this.estadonovedadnomi.getId()>=0)) {
						
					estadonovedadnomiAux.setIsNew(false);
				}
				
				estadonovedadnomiAux.setIsDeleted(false);
			
				estadonovedadnomiAux.setId(this.estadonovedadnomi.getId());	
				estadonovedadnomiAux.setVersionRow(this.estadonovedadnomi.getVersionRow());	
				estadonovedadnomiAux.setcodigo(this.estadonovedadnomi.getcodigo());	
				estadonovedadnomiAux.setnombre(this.estadonovedadnomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadnomiLogic.saveEstadoNovedadNomis();//WithConnection
						//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadonovedadnomiLogic.saveEstadoNovedadNomiRelaciones(estadonovedadnomiAux,this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							estadonovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadonovedadnomi,estadonovedadnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadonovedadnomiAux=new  EstadoNovedadNomi();
				
				estadonovedadnomiAux.setIsNew(false);
				estadonovedadnomiAux.setIsChanged(false);
				
				estadonovedadnomiAux.setIsDeleted(true);
				
				estadonovedadnomiAux.setId(this.estadonovedadnomi.getId());	
				estadonovedadnomiAux.setVersionRow(this.estadonovedadnomi.getVersionRow());	
				estadonovedadnomiAux.setcodigo(this.estadonovedadnomi.getcodigo());	
				estadonovedadnomiAux.setnombre(this.estadonovedadnomi.getnombre());	
				
				if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadonovedadnomiAux.getId()>=0) {	
						this.estadonovedadnomisEliminados.add(estadonovedadnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadnomiLogic.saveEstadoNovedadNomis();//WithConnection
						//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadonovedadnomiLogic.saveEstadoNovedadNomiRelaciones(estadonovedadnomiAux,this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							estadonovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadonovedadnomiAux,estadonovedadnomiLogic.getEstadoNovedadNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadonovedadnomiAux,estadonovedadnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.getEstadoNovedadNomis().addAll(this.estadonovedadnomisEliminados);
					
					estadonovedadnomiLogic.saveEstadoNovedadNomis();//WithConnection
					//estadonovedadnomiLogic.getSetVersionRowEstadoNovedadNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadonovedadnomisEliminados= new ArrayList<EstadoNovedadNomi>();		
			}
			
			if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Novedad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadonovedadnomi=estadonovedadnomiAux;
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
      		//this.finishProcessEstadoNovedadNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoNovedadNomi estadonovedadnomiLocal) throws Exception {
		
		if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadonovedadnomiLocal.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
			
			} else {
			
				estadonovedadnomiLocal.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoNovedadNomi estadonovedadnomiLocal) throws Exception {	
		if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoNovedadNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadonovedadnomiValidator.getInvalidValues(this.estadonovedadnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoNovedadNomi estadonovedadnomi,List<EstadoNovedadNomi> estadonovedadnomis) throws Exception {
		try	{		
			EstadoNovedadNomiConstantesFunciones.actualizarLista(estadonovedadnomi,estadonovedadnomis,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoNovedadNomi estadonovedadnomi,List<EstadoNovedadNomi> estadonovedadnomis) throws Exception {
		try	{			
			EstadoNovedadNomiConstantesFunciones.actualizarSelectedLista(estadonovedadnomi,estadonovedadnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoNovedadNomi> estadonovedadnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadonovedadnomisLocal=this.estadonovedadnomiLogic.getEstadoNovedadNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadonovedadnomisLocal=this.estadonovedadnomis;
			}
			//ARCHITECTURE
		
			for(EstadoNovedadNomi estadonovedadnomiLocal:estadonovedadnomisLocal) {
				if(this.permiteMantenimiento(estadonovedadnomiLocal) && estadonovedadnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoNovedadNomiConstantesFunciones.getEstadoNovedadNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoNovedadNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelcodigoEstadoNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoNovedadNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelnombreEstadoNovedadNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelcodigoEstadoNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelnombreEstadoNovedadNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("NovedadNomi")) {
			if(this.estadonovedadnomi==null) {
				this.estadonovedadnomi= new EstadoNovedadNomi();
			}

			if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoNovedadNomi
				this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);

				this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getnovedadnomi().setEstadoNovedadNomi(this.estadonovedadnomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoNovedadNomi--;	
		
		
		this.estadonovedadnomiAux=new EstadoNovedadNomi();
		
		this.estadonovedadnomiAux.setId(this.iIdNuevoEstadoNovedadNomi);
		this.estadonovedadnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonovedadnomiLogic.getEstadoNovedadNomis().add(this.estadonovedadnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadonovedadnomis.add(this.estadonovedadnomiAux);
		}
		//ARCHITECTURE
		
		this.estadonovedadnomi=this.estadonovedadnomiAux;
		
		if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadNomi(this.estadonovedadnomi);
		}
				
		//this.setDefaultControlesEstadoNovedadNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoNovedadNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNovedadNomi(this.estadonovedadnomiBean,this.estadonovedadnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
			classes=EstadoNovedadNomiConstantesFunciones.getClassesRelationshipsOfEstadoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadonovedadnomiReturnGeneral=estadonovedadnomiLogic.procesarEventosEstadoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this.estadonovedadnomi,this.estadonovedadnomiParameterGeneral,this.isEsNuevoEstadoNovedadNomi,classes);//this.estadonovedadnomiLogic.getEstadoNovedadNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral,this.estadonovedadnomiBean,false);
		
		if(this.estadonovedadnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi());
		}
		
		if(this.estadonovedadnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi(),classes);//this.estadonovedadnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoNovedadNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.RecargarFormEstadoNovedadNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
						
			if(estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado() && NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadNomi();
			}
			
			this.actualizarVisualTableDatosEstadoNovedadNomi();
			
			this.jTableDatosEstadoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadNomi(), this.getIndiceNuevoEstadoNovedadNomi());
			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
						
			this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoNovedadNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setEnabled(isHabilitar && this.estadonovedadnomiConstantesFunciones.activarcodigoEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setEnabled(isHabilitar && this.estadonovedadnomiConstantesFunciones.activarnombreEstadoNovedadNomi);	
		
	};
	
	public void setDefaultControlesEstadoNovedadNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoNovedadNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadonovedadnomiSessionBean.setConGuardarRelaciones(true);			
			this.estadonovedadnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadonovedadnomiSessionBean.setConGuardarRelaciones(false);			
			this.estadonovedadnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoNovedadNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				if(estadonovedadnomiAux.getId().equals(this.iIdNuevoEstadoNovedadNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomis) {
				if(estadonovedadnomiAux.getId().equals(this.iIdNuevoEstadoNovedadNomi)) {
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
	
	public int getIndiceActualEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				if(estadonovedadnomiAux.getId().equals(estadonovedadnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomis) {
				if(estadonovedadnomiAux.getId().equals(estadonovedadnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				if(estadonovedadnomiAux.getEstadoNovedadNomiOriginal().getId().equals(estadonovedadnomiOriginal.getId())) {
					existe=true;
					estadonovedadnomiOriginal.setId(estadonovedadnomiAux.getId());
					estadonovedadnomiOriginal.setVersionRow(estadonovedadnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomis) {
				if(estadonovedadnomiAux.getEstadoNovedadNomiOriginal().getId().equals(estadonovedadnomiOriginal.getId())) {
					existe=true;
					estadonovedadnomiOriginal.setId(estadonovedadnomiAux.getId());
					estadonovedadnomiOriginal.setVersionRow(estadonovedadnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoNovedadNomi(Boolean esParaCancelar) throws Exception {
		estadonovedadnomisAux=new ArrayList<EstadoNovedadNomi>();
		estadonovedadnomiAux=new EstadoNovedadNomi();
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
					if(estadonovedadnomiAux.getId()<0) {
						estadonovedadnomisAux.add(estadonovedadnomiAux);
					}		
				}
				this.iIdNuevoEstadoNovedadNomi=0L;
				this.estadonovedadnomiLogic.getEstadoNovedadNomis().removeAll(estadonovedadnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomis) {
					if(estadonovedadnomiAux.getId()<0) {
						estadonovedadnomisAux.add(estadonovedadnomiAux);
					}		
				}
				this.iIdNuevoEstadoNovedadNomi=0L;
				this.estadonovedadnomis.removeAll(estadonovedadnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoNovedadNomi 
					&& this.estadonovedadnomiLogic.getEstadoNovedadNomis().size()>0
					) {
					estadonovedadnomiAux=this.estadonovedadnomiLogic.getEstadoNovedadNomis().get(this.estadonovedadnomiLogic.getEstadoNovedadNomis().size() - 1);
				
					if(estadonovedadnomiAux.getId()<0) {
						this.estadonovedadnomiLogic.getEstadoNovedadNomis().remove(estadonovedadnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoNovedadNomi && this.estadonovedadnomis.size()>0) {
					estadonovedadnomiAux=this.estadonovedadnomis.get(this.estadonovedadnomis.size() - 1);
				
					if(estadonovedadnomiAux.getId()<0) {
						this.estadonovedadnomis.remove(estadonovedadnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoNovedadNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadonovedadnomi.getId()<0) {
				this.estadonovedadnomiLogic.getEstadoNovedadNomis().remove(this.estadonovedadnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadonovedadnomi.getId()<0) {
				this.estadonovedadnomis.remove(this.estadonovedadnomi);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoNovedadNomi(List<EstadoNovedadNomi> estadonovedadnomisAux) throws Exception {
		EstadoNovedadNomiConstantesFunciones.setEstadosInicialesEstadoNovedadNomi(estadonovedadnomisAux);
	}
	
	public void setEstadosInicialesEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomiAux) throws Exception {
		EstadoNovedadNomiConstantesFunciones.setEstadosInicialesEstadoNovedadNomi(estadonovedadnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoNovedadNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoNovedadNomiActual()) {
				if(!this.isEsNuevoEstadoNovedadNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoNovedadNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoNovedadNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Novedad ?", "MANTENIMIENTO DE Estado Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoNovedadNomi estadonovedadnomi) throws Exception {
		EstadoNovedadNomiConstantesFunciones.seleccionarAsignar(this.estadonovedadnomi,estadonovedadnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoNovedadNomi=this.isPermisoActualizarOriginalEstadoNovedadNomi;
			
			
			this.seleccionarAsignar(estadonovedadnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoNovedadNomiConstantesFunciones.quitarEspaciosEstadoNovedadNomi(this.estadonovedadnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadonovedadnomiSessionBean.setsFuncionBusquedaRapida(this.estadonovedadnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoNovedadNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoNovedadNomi(esParaCancelar);				
				this.cancelarNuevoEstadoNovedadNomi(esParaCancelar);								
			}
			
			this.estadonovedadnomi=new EstadoNovedadNomi();
			
			this.inicializarEstadoNovedadNomi();
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoNovedadNomi() throws Exception {
		try {
			EstadoNovedadNomiConstantesFunciones.inicializarEstadoNovedadNomi(this.estadonovedadnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadonovedadnomiLogic.getEstadoNovedadNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoNovedadNomis(String sAccionBusqueda,List<EstadoNovedadNomi> estadonovedadnomisParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoNovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoNovedadNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoNovedadNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoNovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Novedads");		
		parameters.put("busquedapor", EstadoNovedadNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(NovedadNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoNovedadNomiLogic estadonovedadnomiLogicAuxiliar=new EstadoNovedadNomiLogic();
					estadonovedadnomiLogicAuxiliar.setDatosCliente(estadonovedadnomiLogic.getDatosCliente());				
					estadonovedadnomiLogicAuxiliar.setEstadoNovedadNomis(estadonovedadnomisParaReportes);
					
					estadonovedadnomiLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoNovedadNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadonovedadnomisParaReportes=estadonovedadnomiLogicAuxiliar.getEstadoNovedadNomis();
					
					//estadonovedadnomiLogic.getNewConnexionToDeep();
					
					//for (EstadoNovedadNomi estadonovedadnomi:estadonovedadnomisParaReportes) {
					//	estadonovedadnomiLogic.deepLoad(estadonovedadnomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadonovedadnomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadonovedadnomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileNovedadNomi = AuxiliarReportes.class.getResourceAsStream("NovedadNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_novedadnomi", reportFileNovedadNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoNovedadNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoNovedadNomi=new JRBeanArrayDataSource(EstadoNovedadNomiJInternalFrame.TraerEstadoNovedadNomiBeans(estadonovedadnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoNovedadNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoNovedadNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoNovedadNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoNovedadNomiBean.TraerEstadoNovedadNomiBeans(estadonovedadnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomiActionPerformed(null);
					//this.generarExcelReporteEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,estadonovedadnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadNomi> estadonovedadnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNovedadNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoNovedadNomi estadonovedadnomi : estadonovedadnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoNovedadNomiConstantesFunciones.generarExcelReporteDataEstadoNovedadNomi("NORMAL",row,workbook,estadonovedadnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoNovedadNomi(String sTipo,Row row,Workbook workbook) {
		
		EstadoNovedadNomiConstantesFunciones.generarExcelReporteHeaderEstadoNovedadNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadNomi> estadonovedadnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoNovedadNomi estadonovedadnomi : estadonovedadnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoNovedadNomiConstantesFunciones.getEstadoNovedadNomiDescripcion(estadonovedadnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonovedadnomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonovedadnomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadNomi> estadonovedadnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoNovedadNomi> estadonovedadnomisRespaldo=null;
		
		classes=EstadoNovedadNomiConstantesFunciones.getClassesRelationshipsOfEstadoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadonovedadnomiLogic.setDatosCliente(this.datosCliente);
		this.estadonovedadnomiLogic.setDatosDeep(this.datosDeep);
		this.estadonovedadnomiLogic.setIsConDeep(true);
		
		estadonovedadnomisRespaldo=this.estadonovedadnomiLogic.getEstadoNovedadNomis();
		
		this.estadonovedadnomiLogic.setEstadoNovedadNomis(estadonovedadnomisParaReportes);	
		this.estadonovedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadonovedadnomisParaReportes=this.estadonovedadnomiLogic.getEstadoNovedadNomis();
		this.estadonovedadnomiLogic.setEstadoNovedadNomis(estadonovedadnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNovedadNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoNovedadNomi estadonovedadnomi : estadonovedadnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoNovedadNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoNovedadNomiConstantesFunciones.generarExcelReporteDataEstadoNovedadNomi("NORMAL",row,workbook,estadonovedadnomi,cellStyleDataAux);
		
			
			


				//NovedadNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NovedadNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadonovedadnomi.getNovedadNomis()!=null && estadonovedadnomi.getNovedadNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NovedadNomiConstantesFunciones.generarExcelReporteHeaderNovedadNomi("RELACIONADO",row,workbook);
				}

				if(estadonovedadnomi.getNovedadNomis()!=null) {
					i2=0;
					for(NovedadNomi novedadnomi : estadonovedadnomi.getNovedadNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NovedadNomiConstantesFunciones.generarExcelReporteDataNovedadNomi("RELACIONADO",row,workbook,novedadnomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoNovedadNomiConstantesFunciones.getEstadoNovedadNomiDescripcion(estadonovedadnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoNovedadNomi() throws Exception {		
		this.startProcessEstadoNovedadNomi(true);
	}
	
	public void startProcessEstadoNovedadNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoNovedadNomi, this.jScrollPanelDatosEstadoNovedadNomi,this.jPanelPaginacionEstadoNovedadNomi, this.jScrollPanelDatosEdicionEstadoNovedadNomi, this.jPanelAccionesEstadoNovedadNomi,this.jPanelAccionesFormularioEstadoNovedadNomi,this.jmenuBarEstadoNovedadNomi,this.jmenuBarDetalleEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNovedadNomi=null; 
		
		final JPanel jPanelParametrosReportesEstadoNovedadNomi=this.jPanelParametrosReportesEstadoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEstadoNovedadNomi=this.jScrollPanelDatosEstadoNovedadNomi;
		final JTable jTableDatosEstadoNovedadNomi=this.jTableDatosEstadoNovedadNomi;		
		final JPanel jPanelPaginacionEstadoNovedadNomi=this.jPanelPaginacionEstadoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNovedadNomi=this.jScrollPanelDatosEdicionEstadoNovedadNomi;
		final JPanel jPanelAccionesEstadoNovedadNomi=this.jPanelAccionesEstadoNovedadNomi;
		
		JPanel jPanelCamposAuxiliarEstadoNovedadNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNovedadNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			jPanelCamposAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelCamposEstadoNovedadNomi;
			jPanelAccionesFormularioAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelAccionesFormularioEstadoNovedadNomi;
		}
		
		final JPanel jPanelCamposEstadoNovedadNomi=jPanelCamposAuxiliarEstadoNovedadNomi;
		final JPanel jPanelAccionesFormularioEstadoNovedadNomi=jPanelAccionesFormularioAuxiliarEstadoNovedadNomi;
		
		
		final JMenuBar jmenuBarEstadoNovedadNomi=this.jmenuBarEstadoNovedadNomi;
		final JToolBar jTtoolBarEstadoNovedadNomi=this.jTtoolBarEstadoNovedadNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNovedadNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jmenuBarDetalleEstadoNovedadNomi;
			jTtoolBarDetalleAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jTtoolBarDetalleEstadoNovedadNomi;
		}
		
		final JMenuBar jmenuBarDetalleEstadoNovedadNomi=jmenuBarDetalleAuxiliarEstadoNovedadNomi;
		final JToolBar jTtoolBarDetalleEstadoNovedadNomi=jTtoolBarDetalleAuxiliarEstadoNovedadNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNovedadNomi;
			processRunnable.jTableDatos=jTableDatosEstadoNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposEstadoNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarEstadoNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoNovedadNomi ,jPanelParametrosReportesEstadoNovedadNomi,jTableDatosEstadoNovedadNomi, /*jScrollPanelDatosEstadoNovedadNomi,*/jPanelCamposEstadoNovedadNomi,jPanelPaginacionEstadoNovedadNomi, /*jScrollPanelDatosEdicionEstadoNovedadNomi,*/ jPanelAccionesEstadoNovedadNomi,jPanelAccionesFormularioEstadoNovedadNomi,jmenuBarEstadoNovedadNomi,jmenuBarDetalleEstadoNovedadNomi,jTtoolBarEstadoNovedadNomi,jTtoolBarDetalleEstadoNovedadNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoNovedadNomi, jScrollPanelDatosEstadoNovedadNomi,jPanelPaginacionEstadoNovedadNomi, jScrollPanelDatosEdicionEstadoNovedadNomi, jPanelAccionesEstadoNovedadNomi,jPanelAccionesFormularioEstadoNovedadNomi,jmenuBarEstadoNovedadNomi,jmenuBarDetalleEstadoNovedadNomi,jTtoolBarEstadoNovedadNomi,jTtoolBarDetalleEstadoNovedadNomi);
						
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
	
	public void finishProcessEstadoNovedadNomi() {// throws Exception 
		this.finishProcessEstadoNovedadNomi(true);
	}
	
	public void finishProcessEstadoNovedadNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoNovedadNomi, this.jScrollPanelDatosEstadoNovedadNomi,this.jPanelPaginacionEstadoNovedadNomi, this.jScrollPanelDatosEdicionEstadoNovedadNomi, this.jPanelAccionesEstadoNovedadNomi,this.jPanelAccionesFormularioEstadoNovedadNomi,this.jmenuBarEstadoNovedadNomi,this.jmenuBarDetalleEstadoNovedadNomi,this.jTtoolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNovedadNomi=null; 
		
		final JPanel jPanelParametrosReportesEstadoNovedadNomi=this.jPanelParametrosReportesEstadoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEstadoNovedadNomi=this.jScrollPanelDatosEstadoNovedadNomi;
		final JTable jTableDatosEstadoNovedadNomi=this.jTableDatosEstadoNovedadNomi;		
		final JPanel jPanelPaginacionEstadoNovedadNomi=this.jPanelPaginacionEstadoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNovedadNomi=this.jScrollPanelDatosEdicionEstadoNovedadNomi;
		final JPanel jPanelAccionesEstadoNovedadNomi=this.jPanelAccionesEstadoNovedadNomi;
		
		JPanel jPanelCamposAuxiliarEstadoNovedadNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNovedadNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			jPanelCamposAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelCamposEstadoNovedadNomi;
			jPanelAccionesFormularioAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelAccionesFormularioEstadoNovedadNomi;
		}
		
		final JPanel jPanelCamposEstadoNovedadNomi=jPanelCamposAuxiliarEstadoNovedadNomi;
		final JPanel jPanelAccionesFormularioEstadoNovedadNomi=jPanelAccionesFormularioAuxiliarEstadoNovedadNomi;
		
		
		final JMenuBar jmenuBarEstadoNovedadNomi=this.jmenuBarEstadoNovedadNomi;		
		final JToolBar jTtoolBarEstadoNovedadNomi=this.jTtoolBarEstadoNovedadNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNovedadNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jmenuBarDetalleEstadoNovedadNomi;
			jTtoolBarDetalleAuxiliarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jTtoolBarDetalleEstadoNovedadNomi;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoNovedadNomi=jmenuBarDetalleAuxiliarEstadoNovedadNomi;
		final JToolBar jTtoolBarDetalleEstadoNovedadNomi=jTtoolBarDetalleAuxiliarEstadoNovedadNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNovedadNomi;
			processRunnable.jTableDatos=jTableDatosEstadoNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposEstadoNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarEstadoNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoNovedadNomi ,jPanelParametrosReportesEstadoNovedadNomi, jTableDatosEstadoNovedadNomi,/*jScrollPanelDatosEstadoNovedadNomi,*/jPanelCamposEstadoNovedadNomi,jPanelPaginacionEstadoNovedadNomi, /*jScrollPanelDatosEdicionEstadoNovedadNomi,*/ jPanelAccionesEstadoNovedadNomi,jPanelAccionesFormularioEstadoNovedadNomi,jmenuBarEstadoNovedadNomi,jmenuBarDetalleEstadoNovedadNomi,jTtoolBarEstadoNovedadNomi,jTtoolBarDetalleEstadoNovedadNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoNovedadNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoNovedadNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoNovedadNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoNovedadNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadonovedadnomiConstantesFunciones.getsFinalQueryEstadoNovedadNomi();
		String  finalQueryPaginacionTodos=this.estadonovedadnomiConstantesFunciones.getsFinalQueryEstadoNovedadNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesNoEstadoNovedadNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoNovedadNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadonovedadnomisEliminados= new ArrayList<EstadoNovedadNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoNovedadNomi();
		
				///*EstadoNovedadNomiSessionBean*/this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
			
			if(this.estadonovedadnomiSessionBean==null) {
				this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
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
					this.iNumeroPaginacion=EstadoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoNovedadNomiConstantesFunciones.getClassesForeignKeysOfEstadoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadonovedadnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadonovedadnomisAux= new ArrayList<EstadoNovedadNomi>();
			
				
			estadonovedadnomiLogic.setDatosCliente(this.datosCliente);
			estadonovedadnomiLogic.setDatosDeep(this.datosDeep);
			estadonovedadnomiLogic.setIsConDeep(true);
			
			
			estadonovedadnomiLogic.getEstadoNovedadNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadonovedadnomiLogic.getTodosEstadoNovedadNomis(finalQueryGlobal,pagination);
					
					//estadonovedadnomiLogic.getTodosEstadoNovedadNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadonovedadnomiLogic.getEstadoNovedadNomis()==null|| estadonovedadnomiLogic.getEstadoNovedadNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadnomisAux= new ArrayList<EstadoNovedadNomi>();
							estadonovedadnomisAux.addAll(estadonovedadnomiLogic.getEstadoNovedadNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadnomisAux= new ArrayList<EstadoNovedadNomi>();
							estadonovedadnomisAux.addAll(estadonovedadnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadnomiLogic.getTodosEstadoNovedadNomis(finalQueryGlobal+"",this.pagination);												
							
							//estadonovedadnomiLogic.getTodosEstadoNovedadNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomiLogic.getEstadoNovedadNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadnomiLogic.setEstadoNovedadNomis(new ArrayList<EstadoNovedadNomi>());					
							estadonovedadnomiLogic.getEstadoNovedadNomis().addAll(estadonovedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadnomis=new ArrayList<EstadoNovedadNomi>();
							estadonovedadnomis.addAll(estadonovedadnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoNovedadNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoNovedadNomi=this.idActual;
				
				} else if(this.idEstadoNovedadNomiActual!=null && this.idEstadoNovedadNomiActual!=0L) {
					idEstadoNovedadNomi=idEstadoNovedadNomiActual;
				}
				
					
				this.sDetalleReporte=EstadoNovedadNomiConstantesFunciones.getDetalleIndicePorId(idEstadoNovedadNomi);
				
				this.estadonovedadnomis=new ArrayList<EstadoNovedadNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadonovedadnomiLogic.getEntity(idEstadoNovedadNomi);
					
					//estadonovedadnomiLogic.getEntityWithConnection(idEstadoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadnomiLogic.setEstadoNovedadNomis(new ArrayList<EstadoNovedadNomi>());
					estadonovedadnomiLogic.getEstadoNovedadNomis().add(estadonovedadnomiLogic.getEstadoNovedadNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonovedadnomis=new ArrayList<EstadoNovedadNomi>();
					this.estadonovedadnomis.add(estadonovedadnomi);
				}
				
				if(estadonovedadnomiLogic.getEstadoNovedadNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoNovedadNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoNovedadNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonovedadnomiLogic.getEstadoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonovedadnomiLogic.getEstadoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoNovedadNomi estadonovedadnomi) {
		Boolean permite=true;
		
		if(this.estadonovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoNovedadNomiConstantesFunciones.getOrderByListaEstadoNovedadNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoNovedadNomiConstantesFunciones.getOrderByListaEstadoNovedadNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadNomi estadonovedadnomi:estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				if(estadonovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadnomiTotales=estadonovedadnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadNomi estadonovedadnomi:this.estadonovedadnomis) {
				if(estadonovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadnomiTotales=estadonovedadnomi;
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
			this.estadonovedadnomiAux=new EstadoNovedadNomi();
			this.estadonovedadnomiAux.setsType(Constantes2.S_TOTALES);
			this.estadonovedadnomiAux.setIsNew(false);
			this.estadonovedadnomiAux.setIsChanged(false);
			this.estadonovedadnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoNovedadNomiConstantesFunciones.TotalizarValoresFilaEstadoNovedadNomi(this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this.estadonovedadnomiAux);
				
				this.estadonovedadnomiLogic.getEstadoNovedadNomis().add(this.estadonovedadnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoNovedadNomiConstantesFunciones.TotalizarValoresFilaEstadoNovedadNomi(this.estadonovedadnomis,this.estadonovedadnomiAux);
				
				this.estadonovedadnomis.add(this.estadonovedadnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadonovedadnomiTotales=new EstadoNovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonovedadnomiLogic.getEstadoNovedadNomis().remove(estadonovedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonovedadnomis.remove(estadonovedadnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadonovedadnomiTotales=new EstadoNovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadNomi estadonovedadnomi:estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				if(estadonovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadnomiTotales=estadonovedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNovedadNomiConstantesFunciones.TotalizarValoresFilaEstadoNovedadNomi(this.estadonovedadnomiLogic.getEstadoNovedadNomis(),estadonovedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadNomi estadonovedadnomi:this.estadonovedadnomis) {
				if(estadonovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadnomiTotales=estadonovedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNovedadNomiConstantesFunciones.TotalizarValoresFilaEstadoNovedadNomi(this.estadonovedadnomis,estadonovedadnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoNovedadNomi() {
		this.isPermisoTodoEstadoNovedadNomi=false;
		this.isPermisoNuevoEstadoNovedadNomi=false;
		this.isPermisoActualizarEstadoNovedadNomi=false;
		this.isPermisoActualizarOriginalEstadoNovedadNomi=false;
		this.isPermisoEliminarEstadoNovedadNomi=false;
		this.isPermisoGuardarCambiosEstadoNovedadNomi=false;
		this.isPermisoConsultaEstadoNovedadNomi=false;
		this.isPermisoBusquedaEstadoNovedadNomi=false;
		this.isPermisoReporteEstadoNovedadNomi=false;		
		this.isPermisoOrdenEstadoNovedadNomi=false;		
		this.isPermisoPaginacionMedioEstadoNovedadNomi=false;		
		this.isPermisoPaginacionAltoEstadoNovedadNomi=false;
		this.isPermisoPaginacionTodoEstadoNovedadNomi=false;
		this.isPermisoCopiarEstadoNovedadNomi=false;		
		this.isPermisoVerFormEstadoNovedadNomi=false;		
		this.isPermisoDuplicarEstadoNovedadNomi=false;		
		this.isPermisoOrdenEstadoNovedadNomi=false;		
	}
	
	public void setPermisosUsuarioEstadoNovedadNomi(Boolean isPermiso) {
		this.isPermisoTodoEstadoNovedadNomi=isPermiso;
		this.isPermisoNuevoEstadoNovedadNomi=isPermiso;
		this.isPermisoActualizarEstadoNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalEstadoNovedadNomi=isPermiso;
		this.isPermisoEliminarEstadoNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosEstadoNovedadNomi=isPermiso;
		this.isPermisoConsultaEstadoNovedadNomi=isPermiso;
		this.isPermisoBusquedaEstadoNovedadNomi=isPermiso;
		this.isPermisoReporteEstadoNovedadNomi=isPermiso;
		this.isPermisoOrdenEstadoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionMedioEstadoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionAltoEstadoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionTodoEstadoNovedadNomi=isPermiso;		
		this.isPermisoCopiarEstadoNovedadNomi=isPermiso;		
		this.isPermisoVerFormEstadoNovedadNomi=isPermiso;		
		this.isPermisoDuplicarEstadoNovedadNomi=isPermiso;
		this.isPermisoOrdenEstadoNovedadNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoNovedadNomi(Boolean isPermiso) {
		//this.isPermisoTodoEstadoNovedadNomi=isPermiso;
		this.isPermisoNuevoEstadoNovedadNomi=isPermiso;
		this.isPermisoActualizarEstadoNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalEstadoNovedadNomi=isPermiso;
		this.isPermisoEliminarEstadoNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosEstadoNovedadNomi=isPermiso;
		//this.isPermisoConsultaEstadoNovedadNomi=isPermiso;
		//this.isPermisoBusquedaEstadoNovedadNomi=isPermiso;
		//this.isPermisoReporteEstadoNovedadNomi=isPermiso;
		//this.isPermisoOrdenEstadoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoNovedadNomi=isPermiso;		
		//this.isPermisoCopiarEstadoNovedadNomi=isPermiso;		
		//this.isPermisoDuplicarEstadoNovedadNomi=isPermiso;
		//this.isPermisoOrdenEstadoNovedadNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNovedadNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosNovedadNomi=false;
		this.isTienePermisosNovedadNomi=this.verificarGetPermisosUsuarioOpcionEstadoNovedadNomiClaseRelacionada(this.opcionsRelacionadas,NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoNovedadNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNovedadNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosNovedadNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoNovedadNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoNovedadNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoNovedadNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosNovedadNomi && this.jInternalFrameDetalleFormEstadoNovedadNomi!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.remove(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoNovedadNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoNovedadNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoNovedadNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoNovedadNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoNovedadNomi=this.isPermisoActualizarEstadoNovedadNomi;
			this.isPermisoEliminarEstadoNovedadNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoNovedadNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoNovedadNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoNovedadNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoNovedadNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoNovedadNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoNovedadNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoNovedadNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoNovedadNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoNovedadNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoNovedadNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoNovedadNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoNovedadNomi.setToolTipText(this.jTableDatosEstadoNovedadNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoNovedadNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoNovedadNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoNovedadNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosNovedadNomi && this.estadonovedadnomiConstantesFunciones.mostrarNovedadNomiEstadoNovedadNomi && !EstadoNovedadNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Novedad Nomi");
			reporte.setsDescripcion("Novedad Nomi");
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
	
		
	public void inicializarCombosForeignKeyEstadoNovedadNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoNovedadNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoNovedadNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoNovedadNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoNovedadNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoNovedadNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoNovedadNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoNovedadNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoNovedadNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoNovedadNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoNovedadNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoNovedadNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoNovedadNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean(); 
		this.estadonovedadnomiConstantesFunciones=new EstadoNovedadNomiConstantesFunciones(); 
		this.estadonovedadnomiBean=new EstadoNovedadNomi();//(this.estadonovedadnomiConstantesFunciones); 		
		this.estadonovedadnomiReturnGeneral=new EstadoNovedadNomiParameterReturnGeneral(); 
		
		this.estadonovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoNovedadNomi(true);
			
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
			
			this.estadonovedadnomiConstantesFunciones=new EstadoNovedadNomiConstantesFunciones(); 
			this.estadonovedadnomiBean=new EstadoNovedadNomi();//this.estadonovedadnomiConstantesFunciones); 			
			this.estadonovedadnomiReturnGeneral=new EstadoNovedadNomiParameterReturnGeneral(); 
		
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Novedad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadonovedadnomi=new EstadoNovedadNomi();
			this.estadonovedadnomis = new ArrayList<EstadoNovedadNomi>();
			this.estadonovedadnomisAux = new ArrayList<EstadoNovedadNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic=new EstadoNovedadNomiLogic();
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estadonovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadonovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoNovedadNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNovedadNomi);	
					}
					
					if(this.jInternalFrameImportacionEstadoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNovedadNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoNovedadNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNovedadNomi);
				this.jInternalFrameDetalleFormEstadoNovedadNomi.setVisible(false);
				this.jInternalFrameDetalleFormEstadoNovedadNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNovedadNomi);
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNovedadNomi);
					this.jInternalFrameImportacionEstadoNovedadNomi.setVisible(false);
					this.jInternalFrameImportacionEstadoNovedadNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNovedadNomi);
					this.jInternalFrameOrderByEstadoNovedadNomi.setVisible(false);
					this.jInternalFrameOrderByEstadoNovedadNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoNovedadNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadonovedadnomiReturnGeneral=new EstadoNovedadNomiParameterReturnGeneral();
			
			this.estadonovedadnomiParameterGeneral=new EstadoNovedadNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadonovedadnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado(),this.estadonovedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado(),this.estadonovedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaCopiarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaVerFormEstadoNovedadNomi=true;
			this.isVisibilidadCeldaOrdenEstadoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoNovedadNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoNovedadNomi(false);
			
			this.setPermisosUsuarioEstadoNovedadNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() && this.estadonovedadnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoNovedadNomiClasesRelacionadas();
			}
			
			if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoNovedadNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoNovedadNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoNovedadNomi();
			}
			
			if(!this.isPermisoBusquedaEstadoNovedadNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoNovedadNomi,this.isPermisoPaginacionMedioEstadoNovedadNomi,this.isPermisoPaginacionTodoEstadoNovedadNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoNovedadNomiConstantesFunciones.getTiposSeleccionarEstadoNovedadNomi());
				
				this.tiposColumnasSelect=EstadoNovedadNomiConstantesFunciones.getTiposSeleccionarEstadoNovedadNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoNovedadNomi();				
				//this.tiposRelacionesSelect=EstadoNovedadNomiConstantesFunciones.getTiposRelacionesEstadoNovedadNomi(true);
				
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
			//if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoNovedadNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoNovedadNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoNovedadNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadNomi() ;
			
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
			
			
			this.novedadnomiLogic=new NovedadNomiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadonovedadnomiImplementable= (EstadoNovedadNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadonovedadnomiImplementableHome= (EstadoNovedadNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadonovedadnomis= new ArrayList<EstadoNovedadNomi>();
			this.estadonovedadnomisEliminados= new ArrayList<EstadoNovedadNomi>();
						
			this.isEsNuevoEstadoNovedadNomi=false;
			this.esParaAccionDesdeFormularioEstadoNovedadNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoNovedadNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoNovedadNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoNovedadNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoNovedadNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoNovedadNomi();
			}
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoNovedadNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoNovedadNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoNovedadNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoNovedadNomi")) {
				iIndex=this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Novedad Nomis")) {
					if(!NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoNovedadNomi();

						this.cargarParteTabPanelRelacionadaNovedadNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoNovedadNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaNovedadNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoNovedadNomi.cargarSessionConBeanSwingJInternalFrameNovedadNomi(false,true,iIndex);
		this.jButtonNovedadNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNovedadNomi();

		//this.jTabbedPaneRelacionesEstadoNovedadNomi.updateUI();
		//this.jTabbedPaneRelacionesEstadoNovedadNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoNovedadNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("NovedadNomi")) {
				int row=this.jTableDatosEstadoNovedadNomi.getSelectedRow();
				jButtonNovedadNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Novedad Nomi")) {

					if(this.isTienePermisosNovedadNomi && this.estadonovedadnomiConstantesFunciones.mostrarNovedadNomiEstadoNovedadNomi && !EstadoNovedadNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Novedad Nomis"+"("+NovedadNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Novedad Nomis");

						if(estadonovedadnomiConstantesFunciones.resaltarNovedadNomiEstadoNovedadNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadonovedadnomiConstantesFunciones.resaltarNovedadNomiEstadoNovedadNomi);
						}

						jmenuItem.setEnabled(this.estadonovedadnomiConstantesFunciones.activarNovedadNomiEstadoNovedadNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NovedadNomi"));

						

						this.jInternalFrameDetalleFormEstadoNovedadNomi.jmenuDetalleEstadoNovedadNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoNovedadNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoNovedadNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoNovedadNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoNovedadNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoNovedadNomi();
		
		this.cargarCombosFrameForeignKeyEstadoNovedadNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoNovedadNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoNovedadNomi();
		}
	}
	
	
	
	public void jButtonNuevoEstadoNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			
			if(jTableDatosEstadoNovedadNomi.getRowCount()>=1) {
				jTableDatosEstadoNovedadNomi.removeRowSelectionInterval(0, jTableDatosEstadoNovedadNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoNovedadNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoNovedadNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoNovedadNomi(true);			
			//this.estadonovedadnomi=new EstadoNovedadNomi();
			//this.estadonovedadnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi() ;
			
			if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadonovedadnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);				
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoNovedadNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoNovedadNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoNovedadNomi.getSelectedRows().length;			
			}
			
			estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoNovedadNomi--;			
				//EstadoNovedadNomi estadonovedadnomiAux= new EstadoNovedadNomi();			
				//estadonovedadnomiAux.setId(this.iIdNuevoEstadoNovedadNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoNovedadNomi estadonovedadnomiOrigen=new EstadoNovedadNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoNovedadNomi estadonovedadnomiOrigen : estadonovedadnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadonovedadnomiOrigen =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadnomiOrigen =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoNovedadNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadonovedadnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoNovedadNomi(estadonovedadnomiOrigen,this.estadonovedadnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonovedadnomiLogic.getEstadoNovedadNomis().add(this.estadonovedadnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonovedadnomis.add(this.estadonovedadnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
				
				this.jTableDatosEstadoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadNomi(), this.getIndiceNuevoEstadoNovedadNomi());
				
				int iLastRow =  this.jTableDatosEstadoNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();									
		
			EstadoNovedadNomi estadonovedadnomiOrigen=new EstadoNovedadNomi();
			EstadoNovedadNomi estadonovedadnomiDestino=new EstadoNovedadNomi();
				
			estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoNovedadNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadonovedadnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoNovedadNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadnomiOrigen =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonovedadnomiOrigen =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadnomiDestino =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonovedadnomiDestino =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadonovedadnomiOrigen =estadonovedadnomisSeleccionados.get(0);
				estadonovedadnomiDestino =estadonovedadnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoNovedadNomi(estadonovedadnomiOrigen,estadonovedadnomiDestino,true,false);
				
				estadonovedadnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonovedadnomiDestino,estadonovedadnomiLogic.getEstadoNovedadNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadnomiDestino,estadonovedadnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
				
				//this.jTableDatosEstadoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadNomi(), this.getIndiceNuevoEstadoNovedadNomi());
				
				int iLastRow =  this.jTableDatosEstadoNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoNovedadNomi.isVisible();
			
			
			this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(!isVisible);
			this.jPanelPaginacionEstadoNovedadNomi.setVisible(!isVisible);
			this.jPanelAccionesEstadoNovedadNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoNovedadNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoNovedadNomi();
			
			this.abrirFrameOrderByEstadoNovedadNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoNovedadNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNovedadNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoNovedadNomi.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoNovedadNomi.setSize(this.jInternalFrameDetalleFormEstadoNovedadNomi.iWidthFormulario,this.jInternalFrameDetalleFormEstadoNovedadNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoNovedadNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoNovedadNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoNovedadNomi.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoNovedadNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoNovedadNomi.jContentPaneDetalleEstadoNovedadNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadNomi.jContentPaneDetalleEstadoNovedadNomi.getWidth(),EstadoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadNomi.jContentPaneDetalleEstadoNovedadNomi.getWidth(),EstadoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadNomi.jContentPaneDetalleEstadoNovedadNomi.getWidth(),EstadoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNovedadNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoNovedadNomi.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoNovedadNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoNovedadNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadNomi,false,this);
				} else {
					this.jInternalFrameOrderByEstadoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNovedadNomi);
				this.jInternalFrameOrderByEstadoNovedadNomi.setVisible(false);
				this.jInternalFrameOrderByEstadoNovedadNomi.setSelected(false);
				
				this.jInternalFrameOrderByEstadoNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNovedadNomi"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoNovedadNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoNovedadNomi==null) {
				
				this.jInternalFrameImportacionEstadoNovedadNomi=new ImportacionJInternalFrame(EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNovedadNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNovedadNomi);
				this.jInternalFrameImportacionEstadoNovedadNomi.setVisible(false);
				this.jInternalFrameImportacionEstadoNovedadNomi.setSelected(false);


				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNovedadNomi"));
				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNovedadNomi"));
				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNovedadNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoNovedadNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi==null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi=new ReporteDinamicoJInternalFrame(EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNovedadNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNovedadNomi);
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadNomi"));
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadNomi"));
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaNovedadNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoNovedadNomi.jContentPaneDetalleEstadoNovedadNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoNovedadNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNovedadNomi);
			
	       	this.jInternalFrameDetalleFormEstadoNovedadNomi.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoNovedadNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoNovedadNomi.dispose();
			//this.jInternalFrameDetalleFormEstadoNovedadNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoNovedadNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoNovedadNomi.setVisible(true);
	        this.jInternalFrameImportacionEstadoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoNovedadNomi.setVisible(true);
	        this.jInternalFrameOrderByEstadoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoNovedadNomi.setVisible(false);
	        this.jInternalFrameOrderByEstadoNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoNovedadNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoNovedadNomi.setVisible(false);
	        this.jInternalFrameImportacionEstadoNovedadNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoNovedadNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoNovedadNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoNovedadNomi(true);
			//this.isEsNuevoEstadoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false) ;
			
			if(estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado() && NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoNovedadNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoNovedadNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoNovedadNomi(true);
			//this.isEsNuevoEstadoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadonovedadnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false) ;
			
			if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoNovedadNomi(false);
			
			//if(!this.isEsNuevoEstadoNovedadNomi) {								
				int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
				
			}
			
			if(this.permiteMantenimiento(this.estadonovedadnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoNovedadNomi=true;
					this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
					this.isEsNuevoEstadoNovedadNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoNovedadNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoNovedadNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesEstadoNovedadNomi(false);
			
												
				
				if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoNovedadNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoNovedadNomiActionPerformed(evt,estadonovedadnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoNovedadNomi(this.estadonovedadnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoNovedadNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadonovedadnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadonovedadnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.estadonovedadnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.estadonovedadnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadonovedadnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoNovedadNomiModel) this.jTableDatosEstadoNovedadNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoNovedadNomi=true;
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
				this.isEsNuevoEstadoNovedadNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesEstadoNovedadNomi(false);
				
				
				
				if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoNovedadNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoNovedadNomi.getRowCount()>=1) {
				jTableDatosEstadoNovedadNomi.removeRowSelectionInterval(0, jTableDatosEstadoNovedadNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoNovedadNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(false) ;
			
			this.isEsNuevoEstadoNovedadNomi=false;
			
			if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoNovedadNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoNovedadNomi(false);
				
				//SI ES MANUAL
				if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoNovedadNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoNovedadNomi--;			
			//EstadoNovedadNomi estadonovedadnomiAux= new EstadoNovedadNomi();			
			//estadonovedadnomiAux.setId(this.iIdNuevoEstadoNovedadNomi);
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoNovedadNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
			
			this.estadonovedadnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadonovedadnomiLogic.getEstadoNovedadNomis().add(this.estadonovedadnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadonovedadnomis.add(this.estadonovedadnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			
			this.jTableDatosEstadoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadNomi(), this.getIndiceNuevoEstadoNovedadNomi());
			
			int iLastRow =  this.jTableDatosEstadoNovedadNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoNovedadNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoNovedadNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
			
			//SI ES MANUAL
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadNomi();
			}
			
			//this.abrirFrameTreeEstadoNovedadNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado NovedadS ?", "MANTENIMIENTO DE Estado Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoNovedadNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoNovedadNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadonovedadnomiReturnGeneral=estadonovedadnomiLogic.procesarImportacionEstadoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadonovedadnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoNovedadNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoNovedadNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoNovedadNomi.setFileImportacion(this.jInternalFrameImportacionEstadoNovedadNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoNovedadNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoNovedadNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoNovedadNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoNovedadNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		

		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoNovedadNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoNovedadNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoNovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoNovedadNomi estadonovedadnomi:estadonovedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonovedadnomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoNovedadNomi estadonovedadnomi:estadonovedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonovedadnomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoNovedadNomi(row);				
			//	iRow++;
			//}				
			
			//for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoNovedadNomi(estadonovedadnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
			
			//SI ES MANUAL
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
			
			//SI ES MANUAL
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNovedadNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
			
			//SI ES MANUAL
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNovedadNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoNovedadNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoNovedadNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoNovedadNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoNovedadNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoNovedadNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoNovedadNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoNovedadNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoNovedadNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoNovedadNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoNovedadNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoNovedadNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoNovedadNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoNovedadNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoNovedadNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoNovedadNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoNovedadNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoNovedadNomi();
		
		this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNovedadNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoNovedadNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoNovedadNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionNuevoEstadoNovedadNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoNovedadNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoNovedadNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionNuevoEstadoNovedadNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoNovedadNomi.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoNovedadNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoNovedadNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoNovedadNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoNovedadNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoNovedadNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoNovedadNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadNomi() throws Exception {
		try	{
			if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNovedadNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNovedadNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNovedadNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoNovedadNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoNovedadNomi.addItem(reporte);
			}
			
			
			if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoNovedadNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoNovedadNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoNovedadNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoNovedadNomi(Boolean esInicializar) throws Exception {				
		if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNovedadNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoNovedadNomi() throws Exception {
		this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoNovedadNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoNovedadNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoNovedadNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadonovedadnomiLogic.getEstadoNovedadNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadonovedadnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoNovedadNomi.setModel(new EstadoNovedadNomiModel(this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoNovedadNomi.setModel(new EstadoNovedadNomiModel(this.estadonovedadnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoNovedadNomi!=null && this.jInternalFrameOrderByEstadoNovedadNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoNovedadNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,estadonovedadnomiConstantesFunciones.resaltarSeleccionarEstadoNovedadNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,estadonovedadnomiConstantesFunciones.resaltarSeleccionarEstadoNovedadNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,EstadoNovedadNomiConstantesFunciones.LABEL_ID));

		if(this.estadonovedadnomiConstantesFunciones.mostraridEstadoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadonovedadnomiConstantesFunciones.resaltaridEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activaridEstadoNovedadNomi,this,true,"idEstadoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadnomiConstantesFunciones.resaltaridEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activaridEstadoNovedadNomi,this,true,"idEstadoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO));

		if(this.estadonovedadnomiConstantesFunciones.mostrarcodigoEstadoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonovedadnomiConstantesFunciones.resaltarcodigoEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activarcodigoEstadoNovedadNomi,this,true,"codigoEstadoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadnomiConstantesFunciones.resaltarcodigoEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activarcodigoEstadoNovedadNomi,this,true,"codigoEstadoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.estadonovedadnomiConstantesFunciones.mostrarnombreEstadoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonovedadnomiConstantesFunciones.resaltarnombreEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activarnombreEstadoNovedadNomi,this,true,"nombreEstadoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadnomiConstantesFunciones.resaltarnombreEstadoNovedadNomi,this.estadonovedadnomiConstantesFunciones.activarnombreEstadoNovedadNomi,this,true,"nombreEstadoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosNovedadNomi && this.estadonovedadnomiConstantesFunciones.mostrarNovedadNomiEstadoNovedadNomi && !EstadoNovedadNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Novedad Nomis");
				tableColumn.setHeaderValue("Novedad Nomis");
				tableColumn.setCellRenderer(new NovedadNomiTableCell(estadonovedadnomiConstantesFunciones.resaltarNovedadNomiEstadoNovedadNomi,this,this.estadonovedadnomiConstantesFunciones.activarNovedadNomiEstadoNovedadNomi));
				tableColumn.setCellEditor(new NovedadNomiTableCell(estadonovedadnomiConstantesFunciones.resaltarNovedadNomiEstadoNovedadNomi,this,this.estadonovedadnomiConstantesFunciones.activarNovedadNomiEstadoNovedadNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoNovedadNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoNovedadNomi.moveColumn(this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoNovedadNomi.moveColumn(this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoNovedadNomi.moveColumn(this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoNovedadNomi.moveColumn(this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoNovedadNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoNovedadNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoNovedadNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoNovedadNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoNovedadNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoNovedadNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadonovedadnomiLogic.getEstadoNovedadNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadonovedadnomis.size()-1;
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
		//this.jTableDatosEstadoNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoNovedadNomi();
			
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
				
				//this.isEsNuevoEstadoNovedadNomi=false;
					
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
				if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNovedadNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadonovedadnomi.getsType().equals("DUPLICADO")
				   || this.estadonovedadnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoNovedadNomi=true;
				
				} else {
					this.isEsNuevoEstadoNovedadNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.estadonovedadnomi.getId()>=0 && !this.estadonovedadnomi.getIsNew()) {						
						this.isEsNuevoEstadoNovedadNomi=false;
						
					} else {
						this.isEsNuevoEstadoNovedadNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoNovedadNomi(esRelaciones);						
				
				this.seleccionarEstadoNovedadNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadonovedadnomi.getId()<0) {
					this.isEsNuevoEstadoNovedadNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoNovedadNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoNovedadNomi(evt,rowIndex);
				}	
				
				if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoNovedadNomi: " + this.dDif); 
					}
				}								
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoNovedadNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadonovedadnomi)) {
					if(this.estadonovedadnomi.getId()>0) {
						this.estadonovedadnomi.setIsDeleted(true);
						
						this.estadonovedadnomisEliminados.add(this.estadonovedadnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonovedadnomiLogic.getEstadoNovedadNomis().remove(this.estadonovedadnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonovedadnomis.remove(this.estadonovedadnomi);				
					}
					
					
					((EstadoNovedadNomiModel) this.jTableDatosEstadoNovedadNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoNovedadNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoNovedadNomi) {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNovedadNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoNovedadNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoNovedadNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoNovedadNomi(estadonovedadnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoNovedadNomi(estadonovedadnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoNovedadNomi(estadonovedadnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadNomi(estadonovedadnomi);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setText(estadonovedadnomi.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setText(estadonovedadnomi.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setText(estadonovedadnomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoNovedadNomi estadonovedadnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadonovedadnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoNovedadNomi estadonovedadnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadonovedadnomiLocal=this.estadonovedadnomi;
			} else {
				estadonovedadnomiLocal=this.estadonovedadnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadonovedadnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoNovedadNomi(estadonovedadnomiLocal,true);
					
					if(estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadonovedadnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadonovedadnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(estadonovedadnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(estadonovedadnomi);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(estadonovedadnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.getText()==null || this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.getText()=="" || this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setText("0");
			}

			if(conColumnasBase) {estadonovedadnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelIdEstadoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonovedadnomi.setcodigo(this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelcodigoEstadoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonovedadnomi.setnombre(this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadNomi.jLabelnombreEstadoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomiBean,EstadoNovedadNomi estadonovedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomiOrigen,EstadoNovedadNomi estadonovedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonovedadnomiOrigen.getId()!=null && !estadonovedadnomiOrigen.getId().equals(0L))) {estadonovedadnomi.setId(estadonovedadnomiOrigen.getId());}}
			if(conDefault || (!conDefault && estadonovedadnomiOrigen.getcodigo()!=null && !estadonovedadnomiOrigen.getcodigo().equals(""))) {estadonovedadnomi.setcodigo(estadonovedadnomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadonovedadnomiOrigen.getnombre()!=null && !estadonovedadnomiOrigen.getnombre().equals(""))) {estadonovedadnomi.setnombre(estadonovedadnomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setText(estadonovedadnomi.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setText(estadonovedadnomi.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setText(estadonovedadnomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNovedadNomi(EstadoNovedadNomiBean estadonovedadnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setText(estadonovedadnomiBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setText(estadonovedadnomiBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setText(estadonovedadnomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoNovedadNomi(EstadoNovedadNomiParameterReturnGeneral estadonovedadnomiReturnGeneral,EstadoNovedadNomiBean estadonovedadnomiBean,Boolean conDefault) throws Exception { 
		try {
			EstadoNovedadNomi estadonovedadnomiLocal=new EstadoNovedadNomi();
			
			estadonovedadnomiLocal=estadonovedadnomiReturnGeneral.getEstadoNovedadNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonovedadnomiLocal.getId()!=null && !estadonovedadnomiLocal.getId().equals(0L))) {estadonovedadnomiBean.setId(estadonovedadnomiLocal.getId());}}
			if(conDefault || (!conDefault && estadonovedadnomiLocal.getcodigo()!=null && !estadonovedadnomiLocal.getcodigo().equals(""))) {estadonovedadnomiBean.setcodigo(estadonovedadnomiLocal.getcodigo());}
			if(conDefault || (!conDefault && estadonovedadnomiLocal.getnombre()!=null && !estadonovedadnomiLocal.getnombre().equals(""))) {estadonovedadnomiBean.setnombre(estadonovedadnomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoNovedadNomiGenerico(Long idEstadoNovedadNomiSeleccionado,JComboBox jComboBoxEstadoNovedadNomi,List<EstadoNovedadNomi> estadonovedadnomisLocal)throws Exception {
		try {
			EstadoNovedadNomi  estadonovedadnomiTemp=null;

			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisLocal) {
				if(estadonovedadnomiAux.getId()!=null && estadonovedadnomiAux.getId().equals(idEstadoNovedadNomiSeleccionado)) {
					estadonovedadnomiTemp=estadonovedadnomiAux;
					break;
				}
			}

			jComboBoxEstadoNovedadNomi.setSelectedItem(estadonovedadnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoNovedadNomiGenerico(JComboBox jComboBoxEstadoNovedadNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNovedadNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNovedadNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("NovedadNomi")) {
			jButtonNovedadNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadnomi=(EstadoNovedadNomi) estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonovedadnomi =(EstadoNovedadNomi) estadonovedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoNovedadNomi estadonovedadnomiRow=new EstadoNovedadNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadnomiRow=(EstadoNovedadNomi) estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonovedadnomiRow=(EstadoNovedadNomi) estadonovedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonNovedadNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoNovedadNomi estadonovedadnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomi = (EstadoNovedadNomi)this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadonovedadnomi = (EstadoNovedadNomi)this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadonovedadnomi!=null) {
						this.estadonovedadnomi = estadonovedadnomi;
					} else {
						this.estadonovedadnomi = new EstadoNovedadNomi();
					}
				}

				if(this.isTienePermisosNovedadNomi && this.permiteMantenimiento(this.estadonovedadnomi)) {
					NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup=new NovedadNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						novedadnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup;
					} else {
						novedadnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame;
					}

					List<EstadoNovedadNomi> estadonovedadnomis=new ArrayList<EstadoNovedadNomi>();
					estadonovedadnomis.add(this.estadonovedadnomi);
					if(!esRelacionado) {
						//novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setConGuardarRelaciones(false);
						//novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					novedadnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoNovedadNomi.cargarNovedadNomiBeanSwingJInternalFrame(estadonovedadnomis,this.estadonovedadnomi,novedadnomiBeanSwingJInternalFrame,/*conInicializar,*/novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getConGuardarRelaciones(),novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado());
					novedadnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("no_relacionado");

						novedadnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NovedadNomiConstantesFunciones.ITAMANIOFILATABLA + (NovedadNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						novedadnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoNovedadNomi=(TitledBorder)this.jScrollPanelDatosEstadoNovedadNomi.getBorder();
						TitledBorder titledBorderNovedadNomi=(TitledBorder)novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.getBorder();

						titledBorderNovedadNomi.setTitle(titledBorderEstadoNovedadNomi.getTitle() + " -> Novedad Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,novedadnomiBeanSwingJInternalFrame);
						}

						novedadnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(novedadnomiBeanSwingJInternalFrame);

						novedadnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Novedad Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoNovedadNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));			
			this.jButtonDuplicarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadNomi && this.isPermisoDuplicarEstadoNovedadNomi));			
			this.jButtonCopiarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadNomi && this.isPermisoCopiarEstadoNovedadNomi));
			this.jButtonVerFormEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadNomi && this.isPermisoVerFormEstadoNovedadNomi));
			
			this.jButtonAbrirOrderByEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));			
			
			this.jButtonNuevoRelacionesEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadNomi && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadNomi && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadNomi && this.isPermisoEliminarEstadoNovedadNomi));
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadNomi);							
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));						
			this.jButtonDuplicarToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadNomi && this.isPermisoDuplicarEstadoNovedadNomi));						
			this.jButtonCopiarToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadNomi && this.isPermisoCopiarEstadoNovedadNomi));			
			this.jButtonVerFormToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadNomi && this.isPermisoVerFormEstadoNovedadNomi));			
			this.jButtonAbrirOrderByToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));
			this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));			
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadNomi && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadNomi  && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadNomi && this.isPermisoEliminarEstadoNovedadNomi));
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarToolBarEstadoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadNomi);				
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));			
			this.jMenuItemDuplicarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadNomi && this.isPermisoDuplicarEstadoNovedadNomi));			
			this.jMenuItemCopiarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadNomi && this.isPermisoCopiarEstadoNovedadNomi));			
			this.jMenuItemVerFormEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadNomi && this.isPermisoVerFormEstadoNovedadNomi));			
			this.jMenuItemAbrirOrderByEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));			
			//this.jMenuItemMostrarOcultarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));
			this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));			
			//this.jMenuItemDetalleMostrarOcultarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadNomi && this.isPermisoOrdenEstadoNovedadNomi));			
			this.jMenuItemNuevoRelacionesEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi));			
			this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadNomi && this.isPermisoNuevoEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));									
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemModificarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadNomi && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemActualizarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadNomi && this.isPermisoActualizarEstadoNovedadNomi));	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemEliminarEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadNomi && this.isPermisoEliminarEstadoNovedadNomi));
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemCancelarEstadoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadNomi);				
			}
			
			this.jMenuItemGuardarCambiosEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));						
			this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=this.jButtonNuevoEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoNovedadNomi=this.jButtonDuplicarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCopiarEstadoNovedadNomi=this.jButtonCopiarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaVerFormEstadoNovedadNomi=this.jButtonVerFormEstadoNovedadNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoNovedadNomi=this.jButtonAbrirOrderByEstadoNovedadNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=this.jButtonNuevoRelacionesEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=this.jButtonModificarEstadoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=this.jButtonGuardarCambiosTablaEstadoNovedadNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=this.jButtonNuevoToolBarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarToolBarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarToolBarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarToolBarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarToolBarEstadoNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNovedadNomi=this.jButtonGuardarCambiosToolBarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=this.jMenuItemNuevoEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=this.jMenuItemNuevoRelacionesEstadoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemModificarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemActualizarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemEliminarEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemCancelarEstadoNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNovedadNomi=this.jMenuItemGuardarCambiosEstadoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoNovedadNomi(Boolean esInicializar) {
		if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNovedadNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoNovedadNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoNovedadNomi() {
		this.jButtonNuevoEstadoNovedadNomi.setVisible(this.isPermisoNuevoEstadoNovedadNomi);			
		this.jButtonDuplicarEstadoNovedadNomi.setVisible(this.isPermisoDuplicarEstadoNovedadNomi);			
		this.jButtonCopiarEstadoNovedadNomi.setVisible(this.isPermisoCopiarEstadoNovedadNomi);			
		this.jButtonVerFormEstadoNovedadNomi.setVisible(this.isPermisoVerFormEstadoNovedadNomi);			
		
		this.jButtonAbrirOrderByEstadoNovedadNomi.setVisible(this.isPermisoOrdenEstadoNovedadNomi);					
		
		this.jButtonNuevoRelacionesEstadoNovedadNomi.setVisible(this.isPermisoNuevoEstadoNovedadNomi);			
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarEstadoNovedadNomi.setVisible(this.isPermisoActualizarEstadoNovedadNomi);	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.setVisible(this.isPermisoActualizarEstadoNovedadNomi);	
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.setVisible(this.isPermisoEliminarEstadoNovedadNomi);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadNomi);						
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.setVisible(this.isPermisoGuardarCambiosEstadoNovedadNomi);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setVisible(this.isPermisoActualizarEstadoNovedadNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNovedadNomi() {
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarEstadoNovedadNomi.setVisible(this.isPermisoActualizarEstadoNovedadNomi);	
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.setVisible(this.isPermisoActualizarEstadoNovedadNomi);	
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.setVisible(this.isPermisoEliminarEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadNomi);							
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadNomi && this.isPermisoGuardarCambiosEstadoNovedadNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoNovedadNomi() {
		if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoNovedadNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoNovedadNomi() {
	}
	
	public void jTableDatosEstadoNovedadNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoNovedadNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.getestadonovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadnomi==null) {
						this.estadonovedadnomi = new EstadoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
				}

				if(this.estadonovedadnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadonovedadnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.getestadonovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadnomi==null) {
						this.estadonovedadnomi = new EstadoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
				}

				if(this.estadonovedadnomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadonovedadnomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.getestadonovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadnomi==null) {
						this.estadonovedadnomi = new EstadoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);
				}

				if(this.estadonovedadnomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadonovedadnomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoNovedadNomi() {
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.dispose();
			this.jInternalFrameDetalleFormEstadoNovedadNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
			this.jInternalFrameReporteDinamicoEstadoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoNovedadNomi.dispose();
			this.jInternalFrameReporteDinamicoEstadoNovedadNomi=null;
		}
		
		if(this.jInternalFrameImportacionEstadoNovedadNomi!=null) {
			this.jInternalFrameImportacionEstadoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoNovedadNomi.dispose();
			this.jInternalFrameImportacionEstadoNovedadNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoNovedadNomi();
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoNovedadNomi")) {
				jButtonDuplicarEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoNovedadNomi")) {
				jButtonCopiarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoNovedadNomi")) {
				jButtonVerFormEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoNovedadNomi")) {
				jButtonDuplicarEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoNovedadNomi")) {
				jButtonDuplicarEstadoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoNovedadNomi")) {
				jButtonModificarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoNovedadNomi")) {
				jButtonModificarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoNovedadNomi")) {
				jButtonModificarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoNovedadNomi")) {
				jButtonActualizarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoNovedadNomi")) {
				jButtonActualizarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoNovedadNomi")) {
				jButtonActualizarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoNovedadNomi")) {
				jButtonEliminarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoNovedadNomi")) {
				jButtonEliminarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoNovedadNomi")) {
				jButtonEliminarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoNovedadNomi")) {
				jButtonCancelarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoNovedadNomi")) {
				jButtonCancelarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoNovedadNomi")) {
				jButtonCancelarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoNovedadNomi")) {
				jButtonCerrarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoNovedadNomi")) {
				jButtonCerrarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoNovedadNomi")) {
				jButtonCerrarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoNovedadNomi")) {
				jButtonMostrarOcultarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoNovedadNomi")) {
				jButtonCancelarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoNovedadNomi")) {
				jButtonCopiarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoNovedadNomi")) {
				jButtonVerFormEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoNovedadNomi")) {
				jButtonCopiarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoNovedadNomi")) {
				jButtonVerFormEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoNovedadNomi")) {
				jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoNovedadNomi")) {
				jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoNovedadNomi")) {
				jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoNovedadNomi")) {
				jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoNovedadNomi")) {
				jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoNovedadNomi")) {
				jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoNovedadNomi")) {
				jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoNovedadNomi")) {
				jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoNovedadNomi")) {
				jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoNovedadNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoNovedadNomi")) {
				jButtonAbrirOrderByEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoNovedadNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoNovedadNomi")) {
				jButtonMostrarOcultarEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNovedadNomi")) {
				jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoNovedadNomi")) {
				jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoNovedadNomi")) {
				jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoNovedadNomi")) {
				jButtonCerrarReporteDinamicoEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoNovedadNomi")) {
				jButtonGenerarReporteDinamicoEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoNovedadNomi")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoNovedadNomi")) {
				jButtonCerrarImportacionEstadoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoNovedadNomi")) {
				
				jButtonGenerarImportacionEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoNovedadNomi")) {
				
				jButtonAbrirImportacionEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoNovedadNomi")) {
				jComboBoxTiposAccionesEstadoNovedadNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoNovedadNomi")) {
				jComboBoxTiposRelacionesEstadoNovedadNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoNovedadNomi")) {
				jComboBoxTiposAccionesEstadoNovedadNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoNovedadNomi")) {
				
				jComboBoxTiposSeleccionarEstadoNovedadNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoNovedadNomi")) {
				jTextFieldValorCampoGeneralEstadoNovedadNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoNovedadNomi")) {
				jButtonAbrirOrderByEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoNovedadNomi")) {
				jButtonAbrirOrderByEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoNovedadNomi")) {
				jButtonCerrarOrderByEstadoNovedadNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNovedadNomiBusqueda")) {
				this.jButtonidEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNovedadNomiBusqueda")) {
				this.jButtoncodigoEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNovedadNomiBusqueda")) {
				this.jButtonnombreEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoNovedadNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoNovedadNomi estadonovedadnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadonovedadnomiLocal=this.estadonovedadnomi;
			} else {
				estadonovedadnomiLocal=this.estadonovedadnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
							
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
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
			
			


			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
								
						
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
								
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
							
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
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
			
			


			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
								
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoNovedadNomi")) {
					jCheckBoxSeleccionarTodosEstadoNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoNovedadNomi")) {
					jCheckBoxSeleccionadosEstadoNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoNovedadNomi")) {
					
				}
				
				


				
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
												
				
				


				
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
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
			
			


			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadnomi);
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
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
				
				


				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadnomiAnterior =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoNovedadNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoNovedadNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadonovedadnomi =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadonovedadnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoNovedadNomi")) {
				
				}
				
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoNovedadNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoNovedadNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoNovedadNomi")) {
			
			}
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoNovedadNomi();
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoNovedadNomi")) {
				jButtonDuplicarEstadoNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoNovedadNomi")) {
				jButtonCopiarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoNovedadNomi")) {
				jButtonVerFormEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoNovedadNomi")) {
				jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoNovedadNomi")) {
				jButtonModificarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoNovedadNomi")) {
				jButtonActualizarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoNovedadNomi")) {
				jButtonEliminarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoNovedadNomi")) {
				jButtonCancelarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoNovedadNomi")) {
				jButtonCerrarEstadoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoNovedadNomi")) {
				jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNovedadNomi")) {
				jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoNovedadNomi")) {
				jButtonAbrirOrderByEstadoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoNovedadNomi")) {
				jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoNovedadNomi")) {
				jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoNovedadNomi")) {
				jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNovedadNomiBusqueda")) {
				this.jButtonidEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNovedadNomiBusqueda")) {
				this.jButtoncodigoEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNovedadNomiBusqueda")) {
				this.jButtonnombreEstadoNovedadNomiBusquedaActionPerformed(evt);
			}
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoNovedadNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoNovedadNomi")) {
				closingInternalFrameEstadoNovedadNomi();
				
			} else if(sTipo.equals("jButtonCancelarEstadoNovedadNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoNovedadNomi = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoNovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(EstadoNovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNovedadNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoNovedadNomiActionPerformed(null);
			}
			
			EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonovedadnomi,new Object(),this.estadonovedadnomiParameterGeneral,this.estadonovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadonovedadnomi)) {
			if(!esControlTabla) {
				if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);			
				}
				
				if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonovedadnomiReturnGeneral=estadonovedadnomiLogic.procesarEventosEstadoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this.estadonovedadnomi,this.estadonovedadnomiParameterGeneral,this.isEsNuevoEstadoNovedadNomi,classes);//this.estadonovedadnomiLogic.getEstadoNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral,this.estadonovedadnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNovedadNomi(classes,this.estadonovedadnomiReturnGeneral,this.estadonovedadnomiBean,false);
					}
						
					if(this.estadonovedadnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi());	
					}
						
					if(this.estadonovedadnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi(),classes);//this.estadonovedadnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadNomi(this.estadonovedadnomi,classes);//this.estadonovedadnomiBean);									
				}
			
				if(EstadoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadNomi(this.estadonovedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadNomi(this.estadonovedadnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadonovedadnomiAnterior!=null) {
						this.estadonovedadnomi=this.estadonovedadnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonovedadnomiReturnGeneral=estadonovedadnomiLogic.procesarEventosEstadoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this.estadonovedadnomi,this.estadonovedadnomiParameterGeneral,this.isEsNuevoEstadoNovedadNomi,classes);//this.estadonovedadnomiLogic.getEstadoNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonovedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi(),estadonovedadnomiLogic.getEstadoNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi(),this.estadonovedadnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoNovedadNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoNovedadNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoNovedadNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoNovedadNomi() throws Exception {
		
		EstadoNovedadNomiModel estadonovedadnomiModel=(EstadoNovedadNomiModel)this.jTableDatosEstadoNovedadNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadnomiModel.estadonovedadnomis=this.estadonovedadnomiLogic.getEstadoNovedadNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadonovedadnomiModel.estadonovedadnomis=this.estadonovedadnomis;
		}
		
		
		((EstadoNovedadNomiModel) this.jTableDatosEstadoNovedadNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoNovedadNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadonovedadnomiAnterior(),this.estadonovedadnomiLogic.getEstadoNovedadNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadonovedadnomiAnterior(),this.estadonovedadnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoNovedadNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(estadonovedadnomi.getNovedadNomis());
					this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
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
										
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadnomi,new Object(),generalEntityParameterGeneral,this.estadonovedadnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoNovedadNomiConstantesFunciones.getClassesRelationshipsOfEstadoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoNovedadNomiConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoNovedadNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadnomi,new Object(),generalEntityParameterGeneral,this.estadonovedadnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoNovedadNomi(EstadoNovedadNomiBean estadonovedadnomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(estadonovedadnomi.getNovedadNomis());
					this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNovedadNomi(ArrayList<Classe> classes,EstadoNovedadNomiReturnGeneral estadonovedadnomiReturnGeneral,EstadoNovedadNomiBean estadonovedadnomiBean,Boolean conDefault) throws Exception {
		
			this.estadonovedadnomiBean.setNovedadNomis(estadonovedadnomiReturnGeneral.getEstadoNovedadNomi().getNovedadNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					estadonovedadnomi.setNovedadNomis(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadonovedadnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi = new EstadoNovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.estadonovedadnomiSessionBean.getConGuardarRelaciones(),this.estadonovedadnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.setVisible(false);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.estadonovedadnomiLogic=this.estadonovedadnomiLogic;
		
		this.cargarCombosFrameForeignKeyEstadoNovedadNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNovedadNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNovedadNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoNovedadNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoNovedadNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNovedadNomi"));
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarEstadoNovedadNomi"));

		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNovedadNomi"));
					
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemModificarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNovedadNomi"));
						
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemActualizarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarEstadoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNovedadNomi"));
								
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemEliminarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarEstadoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNovedadNomi"));
					
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemCancelarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNovedadNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemDetalleCerrarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNovedadNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonidEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtoncodigoEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonnombreEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNovedadNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNovedadNomi"));
		}
		
		this.jTableDatosEstadoNovedadNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoNovedadNomi"));
		
		this.jTableDatosEstadoNovedadNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoNovedadNomi"));
		
		this.jButtonNuevoEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoEstadoNovedadNomi"));
		
		this.jButtonDuplicarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarEstadoNovedadNomi"));
		
		this.jButtonCopiarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"CopiarEstadoNovedadNomi"));
		
		this.jButtonVerFormEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"VerFormEstadoNovedadNomi"));
		
		
		this.jButtonNuevoToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoNovedadNomi"));
			
		this.jButtonDuplicarToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoNovedadNomi"));
			
		this.jMenuItemNuevoEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoNovedadNomi"));
			
		this.jMenuItemDuplicarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoNovedadNomi"));		
		
		
		this.jButtonNuevoRelacionesEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoNovedadNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoNovedadNomi"));
			
		this.jMenuItemNuevoRelacionesEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarEstadoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonModificarToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNovedadNomi"));
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemModificarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonActualizarToolBarEstadoNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNovedadNomi"));
				
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemActualizarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarEstadoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonEliminarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNovedadNomi"));
						
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemEliminarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarEstadoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonCancelarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNovedadNomi"));
			
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemCancelarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNovedadNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoNovedadNomi"));		
		
		
		this.jButtonCerrarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarEstadoNovedadNomi"));
		
		
		this.jButtonCerrarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoNovedadNomi"));
			
		this.jMenuItemCerrarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoNovedadNomi"));
			
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jMenuItemDetalleCerrarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadNomi"));
		}
		
		this.jButtonCopiarToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoNovedadNomi"));
			
		this.jButtonVerFormToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoNovedadNomi"));
		
		this.jMenuItemGuardarCambiosEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoNovedadNomi"));
			
		this.jMenuItemCopiarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoNovedadNomi"));		
		
		this.jMenuItemVerFormEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoNovedadNomi"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNovedadNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoNovedadNomi"));
			
		this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNovedadNomi"));		
		
		
		
		this.jButtonRecargarInformacionEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoNovedadNomi"));
					
		this.jButtonRecargarInformacionToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoNovedadNomi"));
		
		this.jMenuItemRecargarInformacionEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoNovedadNomi"));		
		
		
		
		this.jButtonAnterioresEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresEstadoNovedadNomi"));
		
		
		this.jButtonAnterioresToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoNovedadNomi"));
		
		this.jMenuItemAnterioresEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoNovedadNomi"));		
		
		
		this.jButtonSiguientesEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesEstadoNovedadNomi"));
		
		
		this.jButtonSiguientesToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoNovedadNomi"));
			
		this.jMenuItemSiguientesEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoNovedadNomi"));
			
		this.jMenuItemAbrirOrderByEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoNovedadNomi"));
			
		this.jMenuItemMostrarOcultarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoNovedadNomi"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoNovedadNomi"));
			
		this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoNovedadNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoNovedadNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoNovedadNomi"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoNovedadNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoNovedadNomi"));

		this.jCheckBoxSeleccionadosEstadoNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNovedadNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoNovedadNomi"));
			
		this.jComboBoxTiposAccionesEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoNovedadNomi"));
					
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoNovedadNomi"));
			
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonidEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtoncodigoEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonnombreEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadNomi"));
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadNomi"));
				this.jInternalFrameReporteDinamicoEstadoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadNomi"));				
			//this.jButtonGenerarReporteDinamicoEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadNomi"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoNovedadNomi!=null) {
				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNovedadNomi"));
				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNovedadNomi"));
				this.jInternalFrameImportacionEstadoNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNovedadNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoNovedadNomi"));
			
			this.jButtonAbrirOrderByToolBarEstadoNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoNovedadNomi"));			
			
			if(this.jInternalFrameOrderByEstadoNovedadNomi!=null) {
				this.jInternalFrameOrderByEstadoNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNovedadNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadNomi.jTabbedPaneRelacionesEstadoNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNovedadNomi"));
		
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
            		closingInternalFrameEstadoNovedadNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoNovedadNomi = (JInternalFrameBase)event.getSource();
	            	
	            EstadoNovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(EstadoNovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNovedadNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoNovedadNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoNovedadNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoNovedadNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoNovedadNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoNovedadNomi";
		inputMap = this.jButtonNuevoEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNovedadNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoNovedadNomi";
		inputMap = this.jButtonModificarEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoNovedadNomi";
		inputMap = this.jButtonActualizarEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoNovedadNomi";
		inputMap = this.jButtonEliminarEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoNovedadNomi";
		inputMap = this.jButtonCancelarEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoNovedadNomi";
		inputMap = this.jButtonCerrarEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoNovedadNomi";
		inputMap = this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonGuardarCambiosEstadoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoNovedadNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoNovedadNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonidEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtoncodigoEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jButtonnombreEstadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoNovedadNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoNovedadNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
					estadonovedadnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomis) {
					estadonovedadnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
						estadonovedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomis) {
						estadonovedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoNovedadNomi.getSelectedRows();
			
			EstadoNovedadNomi estadonovedadnomiLocal=new EstadoNovedadNomi();
			
			//this.seleccionarTodosEstadoNovedadNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadnomiLocal =(EstadoNovedadNomi) this.estadonovedadnomiLogic.getEstadoNovedadNomis().toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadonovedadnomiLocal =(EstadoNovedadNomi) this.estadonovedadnomis.toArray()[this.jTableDatosEstadoNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadonovedadnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
						estadonovedadnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomis) {
						estadonovedadnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoNovedadNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoNovedadNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoNovedadNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomiLogic.getEstadoNovedadNomis()) {
				
						if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonovedadnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonovedadnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomis) {
					
						if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonovedadnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonovedadnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoNovedadNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoNovedadNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoNovedadNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoNovedadNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoNovedadNomi(conSplash);
				
					this.generarReporteEstadoNovedadNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNovedadNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNovedadNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNovedadNomi();
				
				this.exportarEstadoNovedadNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoNovedadNomis();
				//this.importarEstadoNovedadNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNovedadNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoNovedadNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoNovedadNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoNovedadNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoNovedadNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoNovedadNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoNovedadNomi(conSplash);
					
						//this.actualizarParametrosGeneralEstadoNovedadNomi();
						
						this.generarReporteProcesoAccionEstadoNovedadNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoNovedadNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado NovedadS SELECCIONADOS?", "MANTENIMIENTO DE Estado Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoNovedadNomi();
				
						this.actualizarParametrosGeneralEstadoNovedadNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadonovedadnomiReturnGeneral=estadonovedadnomiLogic.procesarAccionEstadoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadonovedadnomiLogic.getEstadoNovedadNomis(),this.estadonovedadnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoNovedadNomi();
					
					EstadoNovedadNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoNovedadNomi.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoNovedadNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoNovedadNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoNovedadNomi();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
			EstadoNovedadNomi estadonovedadnomi=new EstadoNovedadNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoNovedadNomi.getSelectedItem();
			
			
			
			
			estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadonovedadnomisSeleccionados.size()==1) {
				for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
					estadonovedadnomi=estadonovedadnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Novedad Nomi")) {
					jButtonNovedadNomiActionPerformed(null,rowIndex,true,false,estadonovedadnomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoNovedadNomi();
			
      		//this.finishProcessEstadoNovedadNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoNovedadNomiReturnGeneral() throws Exception {
		if(this.estadonovedadnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadonovedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadonovedadnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadonovedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadonovedadnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadonovedadnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
		}
		
		if(this.estadonovedadnomiReturnGeneral.getConRetornoLista() || this.estadonovedadnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.estadonovedadnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonovedadnomiLogic.setEstadoNovedadNomis(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadonovedadnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonovedadnomiLogic.setEstadoNovedadNomi(this.estadonovedadnomiReturnGeneral.getEstadoNovedadNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoNovedadNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoNovedadNomi() throws Exception {
		
		
	}
	
	public ArrayList<EstadoNovedadNomi> getEstadoNovedadNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoNovedadNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomiLogic.getEstadoNovedadNomis()) {
					if(estadonovedadnomiAux.getIsSelected()) {
						estadonovedadnomisSeleccionados.add(estadonovedadnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadNomi estadonovedadnomiAux:this.estadonovedadnomis) {
					if(estadonovedadnomiAux.getIsSelected()) {
						estadonovedadnomisSeleccionados.add(estadonovedadnomiAux);				
					}
				}
			}
			
			if(estadonovedadnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadonovedadnomisSeleccionados.addAll(this.estadonovedadnomiLogic.getEstadoNovedadNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadonovedadnomisSeleccionados.addAll(this.estadonovedadnomis);				
					}
				}
			}
		} else {
			estadonovedadnomisSeleccionados.add(this.estadonovedadnomi);
		}
		
		return estadonovedadnomisSeleccionados;
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
	
	public void generarReporteEstadoNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNovedadNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNovedadNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoNovedadNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoNovedadNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoNovedadNomi();
		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoNovedadNomi();
		
		
		//this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados ,estadonovedadnomiImplementable,estadonovedadnomiImplementableHome);
	}
	
	public void mostrarImportacionEstadoNovedadNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoNovedadNomi();
		
		this.abrirFrameImportacionEstadoNovedadNomi();		
		
			
		//this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados ,estadonovedadnomiImplementable,estadonovedadnomiImplementableHome);
	}
	
	public void importarEstadoNovedadNomis() throws Exception {		
	
	}
	
	public void exportarEstadoNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoNovedadNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoNovedadNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoNovedadNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoNovedadNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoNovedadNomi(estadonovedadnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadonovedadnomiAux.setsDetalleGeneralEntityReporte(estadonovedadnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoNovedadNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoNovedadNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadonovedadnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadnomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadnomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoNovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoNovedadNomi(row);				
				iRow++;
			}				
			
			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoNovedadNomi(estadonovedadnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoNovedadNomisSeleccionados() throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();		
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadonovedadnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadonovedadnomi");
			//elementRoot.appendChild(element);
		
			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
				element = document.createElement("estadonovedadnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoNovedadNomi(estadonovedadnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoNovedadNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadnomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadnomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoNovedadNomi(EstadoNovedadNomi estadonovedadnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoNovedadNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadonovedadnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoNovedadNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadonovedadnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoNovedadNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadonovedadnomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoNovedadNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadonovedadnomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoNovedadNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados=new ArrayList<EstadoNovedadNomi>();
		
		estadonovedadnomisSeleccionados=this.getEstadoNovedadNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoNovedadNomi(estadonovedadnomisSeleccionados);
		
		this.generarReporteEstadoNovedadNomis("Todos",estadonovedadnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoNovedadNomi(ArrayList<EstadoNovedadNomi> estadonovedadnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisSeleccionados) {
				estadonovedadnomiAux.setsDetalleGeneralEntityReporte(estadonovedadnomiAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadonovedadnomiAux.setsDescripcionGeneralEntityReporte1(estadonovedadnomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadonovedadnomiAux.setsDescripcionGeneralEntityReporte1(estadonovedadnomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoNovedadNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoNovedadNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=true;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
			this.isVisibilidadCeldaModificarEstadoNovedadNomi=true;
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=true;
		} else {
			this.actualizarEstadoPanelsEstadoNovedadNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoNovedadNomi=false;
			//this.isVisibilidadCeldaVerFormEstadoNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarEstadoNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(!estadonovedadnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;												
			}
			
			this.jButtonCerrarEstadoNovedadNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.estadonovedadnomi)) {
			this.isVisibilidadCeldaActualizarEstadoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNovedadNomi() {
		this.isVisibilidadCeldaNuevoEstadoNovedadNomi=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoNovedadNomi=false;
	}
	
	public void actualizarEstadoPanelsEstadoNovedadNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadNomi!=null) {
				this.jScrollPanelDatosEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadNomi!=null) {
				this.jPanelPaginacionEstadoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadNomi!=null) {
				this.jPanelParametrosReportesEstadoNovedadNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoNovedadNomiParaNovedadNomis() throws Exception {
		Boolean isPaginaPopupNovedadNomi=false;

		try {

			if(this.estadonovedadnomiSessionBean==null) {
				this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setsPathNavegacionActual(estadonovedadnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNovedadNomi=this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNovedadNomi(true);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadNomi(EstadoNovedadNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNovedadNomi(true);
			this.jInternalFrameDetalleFormEstadoNovedadNomi.novedadnomiSessionBean.setlidEstadoNovedadNomiActual(this.idEstadoNovedadNomiActual);

			estadonovedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoNovedadNomi(true);
			estadonovedadnomiSessionBean.setlIdEstadoNovedadNomiActualForeignKey(this.idEstadoNovedadNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		
		if(this.estadonovedadnomiSessionBean==null) {
			this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		}
		
		this.estadonovedadnomiSessionBean.setsUltimaBusquedaEstadoNovedadNomi(this.getsAccionBusqueda());
		this.estadonovedadnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadonovedadnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		
		if(this.estadonovedadnomiSessionBean==null) {
			this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		}
		
		if(this.estadonovedadnomiSessionBean.getsUltimaBusquedaEstadoNovedadNomi()!=null&&!this.estadonovedadnomiSessionBean.getsUltimaBusquedaEstadoNovedadNomi().equals("")) {
			this.setsAccionBusqueda(estadonovedadnomiSessionBean.getsUltimaBusquedaEstadoNovedadNomi());
			this.setiNumeroPaginacion(estadonovedadnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadonovedadnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadonovedadnomiSessionBean.setsUltimaBusquedaEstadoNovedadNomi("");
		this.estadonovedadnomiSessionBean.setiNumeroPaginacion(EstadoNovedadNomiConstantesFunciones.INUMEROPAGINACION);
		this.estadonovedadnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoNovedadNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoNovedadNomi() {
		this.updateBorderResaltarBusquedasFormularioEstadoNovedadNomi();
		this.updateVisibilidadBusquedasFormularioEstadoNovedadNomi();
		this.updateHabilitarBusquedasFormularioEstadoNovedadNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoNovedadNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoNovedadNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoNovedadNomi() {
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
	
	public void updateControlesFormularioEstadoNovedadNomi() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoNovedadNomi();
		this.updateVisibilidadResaltarControlesFormularioEstadoNovedadNomi();
		this.updateHabilitarResaltarControlesFormularioEstadoNovedadNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadonovedadnomiConstantesFunciones.resaltaridEstadoNovedadNomi!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setBorder(this.estadonovedadnomiConstantesFunciones.resaltaridEstadoNovedadNomi);}
		if(this.estadonovedadnomiConstantesFunciones.resaltarcodigoEstadoNovedadNomi!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setBorder(this.estadonovedadnomiConstantesFunciones.resaltarcodigoEstadoNovedadNomi);}
		if(this.estadonovedadnomiConstantesFunciones.resaltarnombreEstadoNovedadNomi!=null && this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setBorder(this.estadonovedadnomiConstantesFunciones.resaltarnombreEstadoNovedadNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoNovedadNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
	
		//this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostraridEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelidEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostraridEstadoNovedadNomi);
		//this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostrarcodigoEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelcodigoEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostrarcodigoEstadoNovedadNomi);
		//this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostrarnombreEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jPanelnombreEstadoNovedadNomi.setVisible(this.estadonovedadnomiConstantesFunciones.mostrarnombreEstadoNovedadNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadNomi!=null) {
	
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldidEstadoNovedadNomi.setEnabled(this.estadonovedadnomiConstantesFunciones.activaridEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextFieldcodigoEstadoNovedadNomi.setEnabled(this.estadonovedadnomiConstantesFunciones.activarcodigoEstadoNovedadNomi);
		this.jInternalFrameDetalleFormEstadoNovedadNomi.jTextAreanombreEstadoNovedadNomi.setEnabled(this.estadonovedadnomiConstantesFunciones.activarnombreEstadoNovedadNomi);
		}
	}
	
		
}