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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.ImportacionesConstantesFunciones;
import com.bydan.erp.importaciones.util.ImportacionesParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.ImportacionesParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.ImportacionesBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
public class ImportacionesBeanSwingJInternalFrame extends ImportacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ImportacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Importaciones> importacionesValidator = new ClassValidator<Importaciones>(Importaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Importaciones importaciones;	
	public Importaciones importacionesAux;
	public Importaciones importacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Importaciones importacionesTotales;
	public Long idImportacionesActual;
	public Long iIdNuevoImportaciones=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoImportaciones;
	public Boolean isPermisoNuevoImportaciones;
	public Boolean isPermisoActualizarImportaciones;
	public Boolean isPermisoActualizarOriginalImportaciones;
	public Boolean isPermisoEliminarImportaciones;
	public Boolean isPermisoGuardarCambiosImportaciones;
	public Boolean isPermisoConsultaImportaciones;
	public Boolean isPermisoBusquedaImportaciones;
	public Boolean isPermisoReporteImportaciones;
	public Boolean isPermisoPaginacionMedioImportaciones;
	public Boolean isPermisoPaginacionAltoImportaciones;
	public Boolean isPermisoPaginacionTodoImportaciones;
	public Boolean isPermisoCopiarImportaciones;
	public Boolean isPermisoVerFormImportaciones;
	public Boolean isPermisoDuplicarImportaciones;
	public Boolean isPermisoOrdenImportaciones;
	
	
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
	
	public ImportacionesParameterReturnGeneral importacionesReturnGeneral;
	public ImportacionesParameterReturnGeneral importacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoImportaciones=false;
	public Boolean esParaAccionDesdeFormularioImportaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ImportacionesSessionBeanAdditional importacionesSessionBeanAdditional=null;
	
	public ImportacionesSessionBeanAdditional getImportacionesSessionBeanAdditional() {
		return this.importacionesSessionBeanAdditional;
	}
	
	public void setImportacionesSessionBeanAdditional(ImportacionesSessionBeanAdditional importacionesSessionBeanAdditional) {
		try {
			this.importacionesSessionBeanAdditional=importacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ImportacionesBeanSwingJInternalFrameAdditional importacionesBeanSwingJInternalFrameAdditional=null;
	//public class ImportacionesBeanSwingJInternalFrame
	
	public ImportacionesBeanSwingJInternalFrameAdditional getImportacionesBeanSwingJInternalFrameAdditional() {
		return this.importacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setImportacionesBeanSwingJInternalFrameAdditional(ImportacionesBeanSwingJInternalFrameAdditional importacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.importacionesBeanSwingJInternalFrameAdditional=importacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ImportacionesLogic importacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Importaciones importacionesBean;
	public ImportacionesConstantesFunciones importacionesConstantesFunciones;
	//public ImportacionesParameterReturnGeneral importacionesReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Importaciones> importacioness;	
	//public List<Importaciones> importacionessEliminados;
	//public List<Importaciones> importacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoImportaciones=false;
	public Boolean isVisibilidadCeldaDuplicarImportaciones=true;
	public Boolean isVisibilidadCeldaCopiarImportaciones=true;
	public Boolean isVisibilidadCeldaVerFormImportaciones=true;
	public Boolean isVisibilidadCeldaOrdenImportaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesImportaciones=false;
	public Boolean isVisibilidadCeldaModificarImportaciones=false;
	public Boolean isVisibilidadCeldaActualizarImportaciones=false;
	public Boolean isVisibilidadCeldaEliminarImportaciones=false;
	public Boolean isVisibilidadCeldaCancelarImportaciones=false;
	public Boolean isVisibilidadCeldaGuardarImportaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosImportaciones=false;	
	
	
	
	public Long getiIdNuevoImportaciones() {
		return this.iIdNuevoImportaciones;
	}

	public void setiIdNuevoImportaciones(Long iIdNuevoImportaciones) {
		this.iIdNuevoImportaciones = iIdNuevoImportaciones;
	}
	
	public Long getidImportacionesActual() {
		return this.idImportacionesActual;
	}

	public void setidImportacionesActual(Long idImportacionesActual) {
		this.idImportacionesActual = idImportacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Importaciones getimportaciones() {
		return this.importaciones;
	}

	public void setimportaciones(Importaciones importaciones) {
		this.importaciones = importaciones;
	}
	
	public Importaciones getimportacionesAux() {
		return this.importacionesAux;
	}

	public void setimportacionesAux(Importaciones importacionesAux) {
		this.importacionesAux = importacionesAux;
	}				
	
	public Importaciones getimportacionesAnterior() {
		return this.importacionesAnterior;
	}

	public void setimportacionesAnterior(Importaciones importacionesAnterior) {
		this.importacionesAnterior = importacionesAnterior;
	}	
	
	public Importaciones getimportacionesTotales() {
		return this.importacionesTotales;
	}

	public void setimportacionesTotales(Importaciones importacionesTotales) {
		this.importacionesTotales = importacionesTotales;
	}	
	
	public Importaciones getimportacionesBean() {
		return this.importacionesBean;
	}

	public void setimportacionesBean(Importaciones importacionesBean) {
		this.importacionesBean = importacionesBean;
	}	
	
	public ImportacionesParameterReturnGeneral getimportacionesReturnGeneral() {
		return this.importacionesReturnGeneral;
	}

	public void setimportacionesReturnGeneral(ImportacionesParameterReturnGeneral importacionesReturnGeneral) {
		this.importacionesReturnGeneral = importacionesReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ImportacionesLogic getImportacionesLogic()	{		
		return importacionesLogic;
	}

	public void setImportacionesLogic(ImportacionesLogic importacionesLogic) {
		this.importacionesLogic = importacionesLogic;
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
	
	public Boolean getIsEsNuevoImportaciones() {
		return isEsNuevoImportaciones;
	}

	public void setIsEsNuevoImportaciones(Boolean isEsNuevoImportaciones) {
		this.isEsNuevoImportaciones = isEsNuevoImportaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioImportaciones() {
		return esParaAccionDesdeFormularioImportaciones;
	}
	
	public void setEsParaAccionDesdeFormularioImportaciones(Boolean esParaAccionDesdeFormularioImportaciones) {
		this.esParaAccionDesdeFormularioImportaciones = esParaAccionDesdeFormularioImportaciones;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesImportaciones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ImportacionesConstantesFunciones.refrescarForeignKeysDescripcionesImportaciones(this.importacionesLogic.getImportacioness());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ImportacionesConstantesFunciones.refrescarForeignKeysDescripcionesImportaciones(this.importacioness);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//importacionesLogic.setImportacioness(this.importacioness);
			importacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ImportacionesParameterReturnGeneral getImportacionesParameterGeneral() {
		return this.importacionesParameterGeneral;
	}
	
	public void setImportacionesParameterGeneral(ImportacionesParameterReturnGeneral importacionesParameterGeneral) {
		this.importacionesParameterGeneral = importacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoImportaciones() {
		return isPermisoTodoImportaciones;
	}

	public void setIsPermisoTodoImportaciones(Boolean isPermisoTodoImportaciones) {
		this.isPermisoTodoImportaciones = isPermisoTodoImportaciones;
	}

	public Boolean getIsPermisoNuevoImportaciones() {
		return isPermisoNuevoImportaciones;
	}

	public void setIsPermisoNuevoImportaciones(Boolean isPermisoNuevoImportaciones) {
		this.isPermisoNuevoImportaciones = isPermisoNuevoImportaciones;
	}

	public Boolean getIsPermisoActualizarImportaciones() {
		return isPermisoActualizarImportaciones;
	}

	public void setIsPermisoActualizarImportaciones(Boolean isPermisoActualizarImportaciones) {
		this.isPermisoActualizarImportaciones = isPermisoActualizarImportaciones;
	}

	public Boolean getIsPermisoEliminarImportaciones() {
		return isPermisoEliminarImportaciones;
	}

	public void setIsPermisoEliminarImportaciones(Boolean isPermisoEliminarImportaciones) {
		this.isPermisoEliminarImportaciones = isPermisoEliminarImportaciones;
	}

	public Boolean getIsPermisoGuardarCambiosImportaciones() {
		return isPermisoGuardarCambiosImportaciones;
	}

	public void setIsPermisoGuardarCambiosImportaciones(Boolean isPermisoGuardarCambiosImportaciones) {
		this.isPermisoGuardarCambiosImportaciones = isPermisoGuardarCambiosImportaciones;
	}
	
	public Boolean getIsPermisoConsultaImportaciones() {
		return isPermisoConsultaImportaciones;
	}

	public void setIsPermisoConsultaImportaciones(Boolean isPermisoConsultaImportaciones) {
		this.isPermisoConsultaImportaciones = isPermisoConsultaImportaciones;
	}

	public Boolean getIsPermisoBusquedaImportaciones() {
		return isPermisoBusquedaImportaciones;
	}

	public void setIsPermisoBusquedaImportaciones(Boolean isPermisoBusquedaImportaciones) {
		this.isPermisoBusquedaImportaciones = isPermisoBusquedaImportaciones;
	}

	public Boolean getIsPermisoReporteImportaciones() {
		return isPermisoReporteImportaciones;
	}

	public void setIsPermisoReporteImportaciones(Boolean isPermisoReporteImportaciones) {
		this.isPermisoReporteImportaciones = isPermisoReporteImportaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioImportaciones() {
		return isPermisoPaginacionMedioImportaciones;
	}

	public void setIsPermisoPaginacionMedioImportaciones(Boolean isPermisoPaginacionMedioImportaciones) {
		this.isPermisoPaginacionMedioImportaciones = isPermisoPaginacionMedioImportaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoImportaciones() {
		return isPermisoPaginacionTodoImportaciones;
	}

	public void setIsPermisoPaginacionTodoImportaciones(Boolean isPermisoPaginacionTodoImportaciones) {
		this.isPermisoPaginacionTodoImportaciones = isPermisoPaginacionTodoImportaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoImportaciones() {
		return isPermisoPaginacionAltoImportaciones;
	}

	public void setIsPermisoPaginacionAltoImportaciones(Boolean isPermisoPaginacionAltoImportaciones) {
		this.isPermisoPaginacionAltoImportaciones = isPermisoPaginacionAltoImportaciones;
	}
	
	public Boolean getIsPermisoCopiarImportaciones() {
		return isPermisoCopiarImportaciones;
	}

	public void setIsPermisoCopiarImportaciones(Boolean isPermisoCopiarImportaciones) {
		this.isPermisoCopiarImportaciones = isPermisoCopiarImportaciones;
	}
	
	public Boolean getIsPermisoVerFormImportaciones() {
		return isPermisoVerFormImportaciones;
	}

	public void setIsPermisoVerFormImportaciones(Boolean isPermisoVerFormImportaciones) {
		this.isPermisoVerFormImportaciones = isPermisoVerFormImportaciones;
	}
	
	public Boolean getIsPermisoDuplicarImportaciones() {
		return isPermisoDuplicarImportaciones;
	}

	public void setIsPermisoDuplicarImportaciones(Boolean isPermisoDuplicarImportaciones) {
		this.isPermisoDuplicarImportaciones = isPermisoDuplicarImportaciones;
	}
	
	public Boolean getIsPermisoOrdenImportaciones() {
		return isPermisoOrdenImportaciones;
	}

	public void setIsPermisoOrdenImportaciones(Boolean isPermisoOrdenImportaciones) {
		this.isPermisoOrdenImportaciones = isPermisoOrdenImportaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoImportaciones() {
		return isVisibilidadCeldaNuevoImportaciones;
	}

	public void setIsVisibilidadCeldaNuevoImportaciones(Boolean isVisibilidadCeldaNuevoImportaciones) {
		this.isVisibilidadCeldaNuevoImportaciones = isVisibilidadCeldaNuevoImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarImportaciones() {
		return isVisibilidadCeldaDuplicarImportaciones;
	}

	public void setIsVisibilidadCeldaDuplicarImportaciones(Boolean isVisibilidadCeldaDuplicarImportaciones) {
		this.isVisibilidadCeldaDuplicarImportaciones = isVisibilidadCeldaDuplicarImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarImportaciones() {
		return isVisibilidadCeldaCopiarImportaciones;
	}

	public void setIsVisibilidadCeldaCopiarImportaciones(Boolean isVisibilidadCeldaCopiarImportaciones) {
		this.isVisibilidadCeldaCopiarImportaciones = isVisibilidadCeldaCopiarImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormImportaciones() {
		return isVisibilidadCeldaVerFormImportaciones;
	}

	public void setIsVisibilidadCeldaVerFormImportaciones(Boolean isVisibilidadCeldaVerFormImportaciones) {
		this.isVisibilidadCeldaVerFormImportaciones = isVisibilidadCeldaVerFormImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenImportaciones() {
		return isVisibilidadCeldaOrdenImportaciones;
	}

	public void setIsVisibilidadCeldaOrdenImportaciones(Boolean isVisibilidadCeldaOrdenImportaciones) {
		this.isVisibilidadCeldaOrdenImportaciones = isVisibilidadCeldaOrdenImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesImportaciones() {
		return isVisibilidadCeldaNuevoRelacionesImportaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesImportaciones(Boolean isVisibilidadCeldaNuevoRelacionesImportaciones) {
		this.isVisibilidadCeldaNuevoRelacionesImportaciones = isVisibilidadCeldaNuevoRelacionesImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarImportaciones() {
		return isVisibilidadCeldaModificarImportaciones;
	}

	public void setIsVisibilidadCeldaModificarImportaciones(Boolean isVisibilidadCeldaModificarImportaciones) {
		this.isVisibilidadCeldaModificarImportaciones = isVisibilidadCeldaModificarImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarImportaciones() {
		return isVisibilidadCeldaActualizarImportaciones;
	}

	public void setIsVisibilidadCeldaActualizarImportaciones(Boolean isVisibilidadCeldaActualizarImportaciones) {
		this.isVisibilidadCeldaActualizarImportaciones = isVisibilidadCeldaActualizarImportaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarImportaciones() {
		return isVisibilidadCeldaEliminarImportaciones;
	}

	public void setIsVisibilidadCeldaEliminarImportaciones(Boolean isVisibilidadCeldaEliminarImportaciones) {
		this.isVisibilidadCeldaEliminarImportaciones = isVisibilidadCeldaEliminarImportaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarImportaciones() {
		return isVisibilidadCeldaCancelarImportaciones;
	}

	public void setIsVisibilidadCeldaCancelarImportaciones(Boolean isVisibilidadCeldaCancelarImportaciones) {
		this.isVisibilidadCeldaCancelarImportaciones = isVisibilidadCeldaCancelarImportaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarImportaciones() {
		return isVisibilidadCeldaGuardarImportaciones;
	}

	public void setIsVisibilidadCeldaGuardarImportaciones(Boolean isVisibilidadCeldaGuardarImportaciones) {
		this.isVisibilidadCeldaGuardarImportaciones = isVisibilidadCeldaGuardarImportaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosImportaciones() {
		return isVisibilidadCeldaGuardarCambiosImportaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosImportaciones(Boolean isVisibilidadCeldaGuardarCambiosImportaciones) {
		this.isVisibilidadCeldaGuardarCambiosImportaciones = isVisibilidadCeldaGuardarCambiosImportaciones;
	}
		
	public ImportacionesSessionBean getimportacionesSessionBean() {
		return this.importacionesSessionBean;
	}
	
	public void setimportacionesSessionBean(ImportacionesSessionBean importacionesSessionBean) {
		this.importacionesSessionBean=importacionesSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysImportaciones(Importaciones importaciones)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Importaciones importaciones,Importaciones importacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalImportaciones(importaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		importacionesAux.setId(importaciones.getId());
		importacionesAux.setVersionRow(importaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessImportaciones();
		
			int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = importacionesValidator.getInvalidValues(this.importaciones);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			importacionesLogic.setDatosCliente(datosCliente);
			importacionesLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				importacionesAux=new  Importaciones();
				
				importacionesAux.setIsNew(true);
				importacionesAux.setIsChanged(true);
				
				importacionesAux.setImportacionesOriginal(this.importaciones);
				
				importacionesAux.setId(this.importaciones.getId());	
				importacionesAux.setVersionRow(this.importaciones.getVersionRow());	
				importacionesAux.setcodigo(this.importaciones.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.importacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(importacionesAux,importacioness);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.importacionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						importacionesLogic.saveImportacioness();//WithConnection
						//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.importacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								importacionesLogic.saveImportacionesRelaciones(importacionesAux);//WithConnection
								//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
									|| this.importacionesSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(importacionesAux,importacioness);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				importacionesAux=new  Importaciones();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.importacionesSessionBean.getEsGuardarRelacionado() 
					|| (this.importacionesSessionBean.getEsGuardarRelacionado() && this.importaciones.getId()>=0)) {
						
					importacionesAux.setIsNew(false);
				}
				
				importacionesAux.setIsDeleted(false);
			
				importacionesAux.setId(this.importaciones.getId());	
				importacionesAux.setVersionRow(this.importaciones.getVersionRow());	
				importacionesAux.setcodigo(this.importaciones.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(importacionesAux,importacioness);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.importacionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						importacionesLogic.saveImportacioness();//WithConnection
						//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.importacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								importacionesLogic.saveImportacionesRelaciones(importacionesAux);//WithConnection
								//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
									|| this.importacionesSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(importacionesAux,importacioness);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.importaciones,importacionesAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				importacionesAux=new  Importaciones();
				
				importacionesAux.setIsNew(false);
				importacionesAux.setIsChanged(false);
				
				importacionesAux.setIsDeleted(true);
				
				importacionesAux.setId(this.importaciones.getId());	
				importacionesAux.setVersionRow(this.importaciones.getVersionRow());	
				importacionesAux.setcodigo(this.importaciones.getcodigo());	
				
				if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.importacionesAux.getId()>=0) {	
						this.importacionessEliminados.add(importacionesAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(importacionesAux,importacioness);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.importacionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						importacionesLogic.saveImportacioness();//WithConnection
						//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.importacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								importacionesLogic.saveImportacionesRelaciones(importacionesAux);//WithConnection
								//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
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
							if(this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
								|| this.importacionesSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(importacionesAux,importacionesLogic.getImportacioness());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(importacionesAux,importacioness);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.getImportacioness().addAll(this.importacionessEliminados);
					
					importacionesLogic.saveImportacioness();//WithConnection
					//importacionesLogic.getSetVersionRowImportacioness();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.importacionessEliminados= new ArrayList<Importaciones>();		
			}
			
			if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Importaciones GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.importaciones=importacionesAux;
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
      		//this.finishProcessImportaciones();
      	}
		
	}	
	
	public void actualizarRelaciones(Importaciones importacionesLocal) throws Exception {
		
		if(this.importacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Importaciones importacionesLocal) throws Exception {	
		if(this.importacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarImportacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = importacionesValidator.getInvalidValues(this.importaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Importaciones importaciones,List<Importaciones> importacioness) throws Exception {
		try	{		
			ImportacionesConstantesFunciones.actualizarLista(importaciones,importacioness,this.importacionesSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Importaciones importaciones,List<Importaciones> importacioness) throws Exception {
		try	{			
			ImportacionesConstantesFunciones.actualizarSelectedLista(importaciones,importacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Importaciones> importacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				importacionessLocal=this.importacionesLogic.getImportacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				importacionessLocal=this.importacioness;
			}
			//ARCHITECTURE
		
			for(Importaciones importacionesLocal:importacionessLocal) {
				if(this.permiteMantenimiento(importacionesLocal) && importacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ImportacionesConstantesFunciones.getImportacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ImportacionesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImportaciones.jLabelcodigoImportaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImportaciones.jLabelcodigoImportaciones,"");
		
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
		this.iIdNuevoImportaciones--;	
		
		
		this.importacionesAux=new Importaciones();
		
		this.importacionesAux.setId(this.iIdNuevoImportaciones);
		this.importacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.importacionesLogic.getImportacioness().add(this.importacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.importacioness.add(this.importacionesAux);
		}
		//ARCHITECTURE
		
		this.importaciones=this.importacionesAux;
		
		if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioImportaciones(this.importaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyImportaciones(this.importaciones);
		}
				
		//this.setDefaultControlesImportaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyImportaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyImportaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyImportaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImportaciones(this.importacionesBean,this.importaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanImportaciones(this.importacionesReturnGeneral,this.importacionesBean,false);
		
		if(this.importacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyImportaciones(this.importacionesReturnGeneral.getImportaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioImportaciones(this.importacionesReturnGeneral.getImportaciones());
		}
		
		if(this.importacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioImportaciones(this.importacionesReturnGeneral.getImportaciones(),classes);//this.importacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyImportaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyImportaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImportacionesBeanSwingJInternalFrameAdditional.RecargarFormImportaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingImportaciones(false);
						
			if(importacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImportaciones();
			}
			
			this.actualizarVisualTableDatosImportaciones();
			
			this.jTableDatosImportaciones.setRowSelectionInterval(this.getIndiceNuevoImportaciones(), this.getIndiceNuevoImportaciones());
			
			this.seleccionarFilaTablaImportacionesActual();
						
			this.actualizarEstadoCeldasBotonesImportaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesImportaciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setEnabled(isHabilitar && this.importacionesConstantesFunciones.activarcodigoImportaciones);	
		
	};
	
	public void setDefaultControlesImportaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoImportaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.importacionesSessionBean.setConGuardarRelaciones(true);			
			this.importacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.setVisible(true);
			
					
		} else {
			//this.importacionesSessionBean.setConGuardarRelaciones(false);			
			this.importacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoImportaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
				if(importacionesAux.getId().equals(this.iIdNuevoImportaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Importaciones importacionesAux:this.importacioness) {
				if(importacionesAux.getId().equals(this.iIdNuevoImportaciones)) {
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
	
	public int getIndiceActualImportaciones(Importaciones importaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
				if(importacionesAux.getId().equals(importaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Importaciones importacionesAux:this.importacioness) {
				if(importacionesAux.getId().equals(importaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalImportaciones(Importaciones importacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
				if(importacionesAux.getImportacionesOriginal().getId().equals(importacionesOriginal.getId())) {
					existe=true;
					importacionesOriginal.setId(importacionesAux.getId());
					importacionesOriginal.setVersionRow(importacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Importaciones importacionesAux:this.importacioness) {
				if(importacionesAux.getImportacionesOriginal().getId().equals(importacionesOriginal.getId())) {
					existe=true;
					importacionesOriginal.setId(importacionesAux.getId());
					importacionesOriginal.setVersionRow(importacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosImportaciones(Boolean esParaCancelar) throws Exception {
		importacionessAux=new ArrayList<Importaciones>();
		importacionesAux=new Importaciones();
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
					if(importacionesAux.getId()<0) {
						importacionessAux.add(importacionesAux);
					}		
				}
				this.iIdNuevoImportaciones=0L;
				this.importacionesLogic.getImportacioness().removeAll(importacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Importaciones importacionesAux:this.importacioness) {
					if(importacionesAux.getId()<0) {
						importacionessAux.add(importacionesAux);
					}		
				}
				this.iIdNuevoImportaciones=0L;
				this.importacioness.removeAll(importacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoImportaciones 
					&& this.importacionesLogic.getImportacioness().size()>0
					) {
					importacionesAux=this.importacionesLogic.getImportacioness().get(this.importacionesLogic.getImportacioness().size() - 1);
				
					if(importacionesAux.getId()<0) {
						this.importacionesLogic.getImportacioness().remove(importacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoImportaciones && this.importacioness.size()>0) {
					importacionesAux=this.importacioness.get(this.importacioness.size() - 1);
				
					if(importacionesAux.getId()<0) {
						this.importacioness.remove(importacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoImportaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(importaciones.getId()<0) {
				this.importacionesLogic.getImportacioness().remove(this.importaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(importaciones.getId()<0) {
				this.importacioness.remove(this.importaciones);
			}
		}			
	}
	
	public void setEstadosInicialesImportaciones(List<Importaciones> importacionessAux) throws Exception {
		ImportacionesConstantesFunciones.setEstadosInicialesImportaciones(importacionessAux);
	}
	
	public void setEstadosInicialesImportaciones(Importaciones importacionesAux) throws Exception {
		ImportacionesConstantesFunciones.setEstadosInicialesImportaciones(importacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarImportacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarImportacionesActual()) {
				if(!this.isEsNuevoImportaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoImportaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarImportacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Importaciones ?", "MANTENIMIENTO DE Importaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Importaciones importaciones) throws Exception {
		ImportacionesConstantesFunciones.seleccionarAsignar(this.importaciones,importaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarImportaciones=this.isPermisoActualizarOriginalImportaciones;
			
			
			this.seleccionarAsignar(importaciones);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImportacionesConstantesFunciones.quitarEspaciosImportaciones(this.importaciones,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesImportaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.importacionesSessionBean.setsFuncionBusquedaRapida(this.importacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoImportaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosImportaciones(esParaCancelar);				
				this.cancelarNuevoImportaciones(esParaCancelar);								
			}
			
			this.importaciones=new Importaciones();
			
			this.inicializarImportaciones();
			
			this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarImportaciones() throws Exception {
		try {
			ImportacionesConstantesFunciones.inicializarImportaciones(this.importaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.importacionesLogic.getImportacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteImportacioness(String sAccionBusqueda,List<Importaciones> importacionessParaReportes) throws Exception {
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
					sPathReporteFinal="Importaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ImportacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ImportacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Importaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Importacioneses");		
		parameters.put("busquedapor", ImportacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceImportaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ImportacionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ImportacionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceImportaciones=new JRBeanArrayDataSource(ImportacionesJInternalFrame.TraerImportacionesBeans(importacionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceImportaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ImportacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ImportacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ImportacionesBean.TraerImportacionesBeans(importacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoImportacionesActionPerformed(null);
					//this.generarExcelReporteImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesImportacioness(sAccionBusqueda,sTipoArchivoReporte,importacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteImportacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Importaciones> importacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Importacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImportaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Importaciones importaciones : importacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ImportacionesConstantesFunciones.generarExcelReporteDataImportaciones("NORMAL",row,workbook,importaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderImportaciones(String sTipo,Row row,Workbook workbook) {
		
		ImportacionesConstantesFunciones.generarExcelReporteHeaderImportaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalImportacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Importaciones> importacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Importacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Importaciones importaciones : importacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ImportacionesConstantesFunciones.getImportacionesDescripcion(importaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImportacionesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImportacionesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(importaciones.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesImportacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Importaciones> importacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Importaciones> importacionessRespaldo=null;
		
		classes=ImportacionesConstantesFunciones.getClassesRelationshipsOfImportaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.importacionesLogic.setDatosCliente(this.datosCliente);
		this.importacionesLogic.setDatosDeep(this.datosDeep);
		this.importacionesLogic.setIsConDeep(true);
		
		importacionessRespaldo=this.importacionesLogic.getImportacioness();
		
		this.importacionesLogic.setImportacioness(importacionessParaReportes);	
		this.importacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		importacionessParaReportes=this.importacionesLogic.getImportacioness();
		this.importacionesLogic.setImportacioness(importacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Importacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImportaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Importaciones importaciones : importacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderImportaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ImportacionesConstantesFunciones.generarExcelReporteDataImportaciones("NORMAL",row,workbook,importaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ImportacionesConstantesFunciones.getImportacionesDescripcion(importaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoImportaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessImportaciones() throws Exception {		
		this.startProcessImportaciones(true);
	}
	
	public void startProcessImportaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesImportaciones, this.jScrollPanelDatosImportaciones,this.jPanelPaginacionImportaciones, this.jScrollPanelDatosEdicionImportaciones, this.jPanelAccionesImportaciones,this.jPanelAccionesFormularioImportaciones,this.jmenuBarImportaciones,this.jmenuBarDetalleImportaciones,this.jTtoolBarImportaciones,this.jTtoolBarDetalleImportaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasImportaciones=null; 
		
		final JPanel jPanelParametrosReportesImportaciones=this.jPanelParametrosReportesImportaciones;
		//final JScrollPane jScrollPanelDatosImportaciones=this.jScrollPanelDatosImportaciones;
		final JTable jTableDatosImportaciones=this.jTableDatosImportaciones;		
		final JPanel jPanelPaginacionImportaciones=this.jPanelPaginacionImportaciones;
		//final JScrollPane jScrollPanelDatosEdicionImportaciones=this.jScrollPanelDatosEdicionImportaciones;
		final JPanel jPanelAccionesImportaciones=this.jPanelAccionesImportaciones;
		
		JPanel jPanelCamposAuxiliarImportaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarImportaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			jPanelCamposAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jPanelCamposImportaciones;
			jPanelAccionesFormularioAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jPanelAccionesFormularioImportaciones;
		}
		
		final JPanel jPanelCamposImportaciones=jPanelCamposAuxiliarImportaciones;
		final JPanel jPanelAccionesFormularioImportaciones=jPanelAccionesFormularioAuxiliarImportaciones;
		
		
		final JMenuBar jmenuBarImportaciones=this.jmenuBarImportaciones;
		final JToolBar jTtoolBarImportaciones=this.jTtoolBarImportaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarImportaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImportaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			jmenuBarDetalleAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jmenuBarDetalleImportaciones;
			jTtoolBarDetalleAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jTtoolBarDetalleImportaciones;
		}
		
		final JMenuBar jmenuBarDetalleImportaciones=jmenuBarDetalleAuxiliarImportaciones;
		final JToolBar jTtoolBarDetalleImportaciones=jTtoolBarDetalleAuxiliarImportaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImportaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImportaciones;
			processRunnable.jTableDatos=jTableDatosImportaciones;
			processRunnable.jPanelCampos=jPanelCamposImportaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionImportaciones;
			processRunnable.jPanelAcciones=jPanelAccionesImportaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImportaciones;
			
			
			processRunnable.jmenuBar=jmenuBarImportaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImportaciones;
			processRunnable.jTtoolBar=jTtoolBarImportaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImportaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasImportaciones ,jPanelParametrosReportesImportaciones,jTableDatosImportaciones, /*jScrollPanelDatosImportaciones,*/jPanelCamposImportaciones,jPanelPaginacionImportaciones, /*jScrollPanelDatosEdicionImportaciones,*/ jPanelAccionesImportaciones,jPanelAccionesFormularioImportaciones,jmenuBarImportaciones,jmenuBarDetalleImportaciones,jTtoolBarImportaciones,jTtoolBarDetalleImportaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesImportaciones, jScrollPanelDatosImportaciones,jPanelPaginacionImportaciones, jScrollPanelDatosEdicionImportaciones, jPanelAccionesImportaciones,jPanelAccionesFormularioImportaciones,jmenuBarImportaciones,jmenuBarDetalleImportaciones,jTtoolBarImportaciones,jTtoolBarDetalleImportaciones);
						
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
	
	public void finishProcessImportaciones() {// throws Exception 
		this.finishProcessImportaciones(true);
	}
	
	public void finishProcessImportaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesImportaciones, this.jScrollPanelDatosImportaciones,this.jPanelPaginacionImportaciones, this.jScrollPanelDatosEdicionImportaciones, this.jPanelAccionesImportaciones,this.jPanelAccionesFormularioImportaciones,this.jmenuBarImportaciones,this.jmenuBarDetalleImportaciones,this.jTtoolBarImportaciones,this.jTtoolBarDetalleImportaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasImportaciones=null; 
		
		final JPanel jPanelParametrosReportesImportaciones=this.jPanelParametrosReportesImportaciones;
		//final JScrollPane jScrollPanelDatosImportaciones=this.jScrollPanelDatosImportaciones;
		final JTable jTableDatosImportaciones=this.jTableDatosImportaciones;		
		final JPanel jPanelPaginacionImportaciones=this.jPanelPaginacionImportaciones;
		//final JScrollPane jScrollPanelDatosEdicionImportaciones=this.jScrollPanelDatosEdicionImportaciones;
		final JPanel jPanelAccionesImportaciones=this.jPanelAccionesImportaciones;
		
		JPanel jPanelCamposAuxiliarImportaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarImportaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			jPanelCamposAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jPanelCamposImportaciones;
			jPanelAccionesFormularioAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jPanelAccionesFormularioImportaciones;
		}
		
		final JPanel jPanelCamposImportaciones=jPanelCamposAuxiliarImportaciones;
		final JPanel jPanelAccionesFormularioImportaciones=jPanelAccionesFormularioAuxiliarImportaciones;
		
		
		final JMenuBar jmenuBarImportaciones=this.jmenuBarImportaciones;		
		final JToolBar jTtoolBarImportaciones=this.jTtoolBarImportaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarImportaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImportaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			jmenuBarDetalleAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jmenuBarDetalleImportaciones;
			jTtoolBarDetalleAuxiliarImportaciones=this.jInternalFrameDetalleFormImportaciones.jTtoolBarDetalleImportaciones;		
		}
		
		final JMenuBar jmenuBarDetalleImportaciones=jmenuBarDetalleAuxiliarImportaciones;
		final JToolBar jTtoolBarDetalleImportaciones=jTtoolBarDetalleAuxiliarImportaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImportaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImportaciones;
			processRunnable.jTableDatos=jTableDatosImportaciones;
			processRunnable.jPanelCampos=jPanelCamposImportaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionImportaciones;
			processRunnable.jPanelAcciones=jPanelAccionesImportaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImportaciones;
			
			
			processRunnable.jmenuBar=jmenuBarImportaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImportaciones;
			processRunnable.jTtoolBar=jTtoolBarImportaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImportaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasImportaciones ,jPanelParametrosReportesImportaciones, jTableDatosImportaciones,/*jScrollPanelDatosImportaciones,*/jPanelCamposImportaciones,jPanelPaginacionImportaciones, /*jScrollPanelDatosEdicionImportaciones,*/ jPanelAccionesImportaciones,jPanelAccionesFormularioImportaciones,jmenuBarImportaciones,jmenuBarDetalleImportaciones,jTtoolBarImportaciones,jTtoolBarDetalleImportaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesImportaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarImportaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuImportaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarImportaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarImportaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleImportaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuImportaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarImportaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleImportaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.importacionesConstantesFunciones.getsFinalQueryImportaciones();
		String  finalQueryPaginacionTodos=this.importacionesConstantesFunciones.getsFinalQueryImportaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ImportacionesConstantesFunciones.getArrayColumnasGlobalesNoImportaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ImportacionesConstantesFunciones.getArrayColumnasGlobalesImportaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ImportacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.importacionessEliminados= new ArrayList<Importaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessImportaciones();
		
				///*ImportacionesSessionBean*/this.importacionesSessionBean=new ImportacionesSessionBean();
			
			if(this.importacionesSessionBean==null) {
				this.importacionesSessionBean=new ImportacionesSessionBean();
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
					this.iNumeroPaginacion=ImportacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ImportacionesConstantesFunciones.getClassesForeignKeysOfImportaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/importaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			importacionessAux= new ArrayList<Importaciones>();
			
				
			importacionesLogic.setDatosCliente(this.datosCliente);
			importacionesLogic.setDatosDeep(this.datosDeep);
			importacionesLogic.setIsConDeep(true);
			
			
			importacionesLogic.getImportacionesDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					importacionesLogic.getTodosImportacioness(finalQueryGlobal,pagination);
					
					//importacionesLogic.getTodosImportacionessWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(importacionesLogic.getImportacioness()==null|| importacionesLogic.getImportacioness().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							importacionessAux= new ArrayList<Importaciones>();
							importacionessAux.addAll(importacionesLogic.getImportacioness());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							importacionessAux= new ArrayList<Importaciones>();
							importacionessAux.addAll(importacioness);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							importacionesLogic.getTodosImportacioness(finalQueryGlobal+"",this.pagination);												
							
							//importacionesLogic.getTodosImportacionessWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteImportacioness("Todos",importacionesLogic.getImportacioness() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							importacionesLogic.setImportacioness(new ArrayList<Importaciones>());					
							importacionesLogic.getImportacioness().addAll(importacionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							importacioness=new ArrayList<Importaciones>();
							importacioness.addAll(importacionessAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idImportaciones=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idImportaciones=this.idActual;
				
				} else if(this.idImportacionesActual!=null && this.idImportacionesActual!=0L) {
					idImportaciones=idImportacionesActual;
				}
				
					
				this.sDetalleReporte=ImportacionesConstantesFunciones.getDetalleIndicePorId(idImportaciones);
				
				this.importacioness=new ArrayList<Importaciones>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					importacionesLogic.getEntity(idImportaciones);
					
					//importacionesLogic.getEntityWithConnection(idImportaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					importacionesLogic.setImportacioness(new ArrayList<Importaciones>());
					importacionesLogic.getImportacioness().add(importacionesLogic.getImportaciones());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.importacioness=new ArrayList<Importaciones>();
					this.importacioness.add(importaciones);
				}
				
				if(importacionesLogic.getImportaciones()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesImportaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessImportaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=importacionesLogic.getImportacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=importacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=importacionesLogic.getImportacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=importacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Importaciones importaciones) {
		Boolean permite=true;
		
		if(this.importaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ImportacionesConstantesFunciones.getOrderByListaImportaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ImportacionesConstantesFunciones.getOrderByListaImportaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Importaciones importaciones:importacionesLogic.getImportacioness()) {
				if(importaciones.getsType().equals(Constantes2.S_TOTALES)) {
					importacionesTotales=importaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Importaciones importaciones:this.importacioness) {
				if(importaciones.getsType().equals(Constantes2.S_TOTALES)) {
					importacionesTotales=importaciones;
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
			this.importacionesAux=new Importaciones();
			this.importacionesAux.setsType(Constantes2.S_TOTALES);
			this.importacionesAux.setIsNew(false);
			this.importacionesAux.setIsChanged(false);
			this.importacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ImportacionesConstantesFunciones.TotalizarValoresFilaImportaciones(this.importacionesLogic.getImportacioness(),this.importacionesAux);
				
				this.importacionesLogic.getImportacioness().add(this.importacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ImportacionesConstantesFunciones.TotalizarValoresFilaImportaciones(this.importacioness,this.importacionesAux);
				
				this.importacioness.add(this.importacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		importacionesTotales=new Importaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.importacionesLogic.getImportacioness().remove(importacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.importacioness.remove(importacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		importacionesTotales=new Importaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Importaciones importaciones:importacionesLogic.getImportacioness()) {
				if(importaciones.getsType().equals(Constantes2.S_TOTALES)) {
					importacionesTotales=importaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImportacionesConstantesFunciones.TotalizarValoresFilaImportaciones(this.importacionesLogic.getImportacioness(),importacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Importaciones importaciones:this.importacioness) {
				if(importaciones.getsType().equals(Constantes2.S_TOTALES)) {
					importacionesTotales=importaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImportacionesConstantesFunciones.TotalizarValoresFilaImportaciones(this.importacioness,importacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosImportaciones() {
		this.isPermisoTodoImportaciones=false;
		this.isPermisoNuevoImportaciones=false;
		this.isPermisoActualizarImportaciones=false;
		this.isPermisoActualizarOriginalImportaciones=false;
		this.isPermisoEliminarImportaciones=false;
		this.isPermisoGuardarCambiosImportaciones=false;
		this.isPermisoConsultaImportaciones=false;
		this.isPermisoBusquedaImportaciones=false;
		this.isPermisoReporteImportaciones=false;		
		this.isPermisoOrdenImportaciones=false;		
		this.isPermisoPaginacionMedioImportaciones=false;		
		this.isPermisoPaginacionAltoImportaciones=false;
		this.isPermisoPaginacionTodoImportaciones=false;
		this.isPermisoCopiarImportaciones=false;		
		this.isPermisoVerFormImportaciones=false;		
		this.isPermisoDuplicarImportaciones=false;		
		this.isPermisoOrdenImportaciones=false;		
	}
	
	public void setPermisosUsuarioImportaciones(Boolean isPermiso) {
		this.isPermisoTodoImportaciones=isPermiso;
		this.isPermisoNuevoImportaciones=isPermiso;
		this.isPermisoActualizarImportaciones=isPermiso;
		this.isPermisoActualizarOriginalImportaciones=isPermiso;
		this.isPermisoEliminarImportaciones=isPermiso;
		this.isPermisoGuardarCambiosImportaciones=isPermiso;
		this.isPermisoConsultaImportaciones=isPermiso;
		this.isPermisoBusquedaImportaciones=isPermiso;
		this.isPermisoReporteImportaciones=isPermiso;
		this.isPermisoOrdenImportaciones=isPermiso;		
		this.isPermisoPaginacionMedioImportaciones=isPermiso;		
		this.isPermisoPaginacionAltoImportaciones=isPermiso;		
		this.isPermisoPaginacionTodoImportaciones=isPermiso;		
		this.isPermisoCopiarImportaciones=isPermiso;		
		this.isPermisoVerFormImportaciones=isPermiso;		
		this.isPermisoDuplicarImportaciones=isPermiso;
		this.isPermisoOrdenImportaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioImportaciones(Boolean isPermiso) {
		//this.isPermisoTodoImportaciones=isPermiso;
		this.isPermisoNuevoImportaciones=isPermiso;
		this.isPermisoActualizarImportaciones=isPermiso;
		this.isPermisoActualizarOriginalImportaciones=isPermiso;
		this.isPermisoEliminarImportaciones=isPermiso;
		this.isPermisoGuardarCambiosImportaciones=isPermiso;
		//this.isPermisoConsultaImportaciones=isPermiso;
		//this.isPermisoBusquedaImportaciones=isPermiso;
		//this.isPermisoReporteImportaciones=isPermiso;
		//this.isPermisoOrdenImportaciones=isPermiso;		
		//this.isPermisoPaginacionMedioImportaciones=isPermiso;		
		//this.isPermisoPaginacionAltoImportaciones=isPermiso;		
		//this.isPermisoPaginacionTodoImportaciones=isPermiso;		
		//this.isPermisoCopiarImportaciones=isPermiso;		
		//this.isPermisoDuplicarImportaciones=isPermiso;
		//this.isPermisoOrdenImportaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioImportacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ImportacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebImportaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioImportacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioImportacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionImportacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioImportacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioImportaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ImportacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ImportacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoImportaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarImportaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalImportaciones=this.isPermisoActualizarImportaciones;
			this.isPermisoEliminarImportaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosImportaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaImportaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaImportaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoImportaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteImportaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImportaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioImportaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoImportaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoImportaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarImportaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormImportaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarImportaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImportaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosImportaciones.setToolTipText(this.jTableDatosImportaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioImportaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioImportaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ImportacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ImportacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioImportaciones() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyImportacionesListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyImportacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ImportacionesJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyImportacionesListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyImportacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyImportaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyImportaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyImportaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyImportaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyImportaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyImportaciones(Importaciones importaciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyImportaciones(Importaciones importaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyImportaciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyImportaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyImportaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyImportaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroImportaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyImportaciones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyImportaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyImportaciones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ImportacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ImportacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ImportacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.importacionesSessionBean=new ImportacionesSessionBean(); 
		this.importacionesConstantesFunciones=new ImportacionesConstantesFunciones(); 
		this.importacionesBean=new Importaciones();//(this.importacionesConstantesFunciones); 		
		this.importacionesReturnGeneral=new ImportacionesParameterReturnGeneral(); 
		
		this.importacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.importacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ImportacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ImportacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ImportacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessImportaciones(true);
			
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
			
			this.importacionesConstantesFunciones=new ImportacionesConstantesFunciones(); 
			this.importacionesBean=new Importaciones();//this.importacionesConstantesFunciones); 			
			this.importacionesReturnGeneral=new ImportacionesParameterReturnGeneral(); 
		
			ImportacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Importaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.importaciones=new Importaciones();
			this.importacioness = new ArrayList<Importaciones>();
			this.importacionessAux = new ArrayList<Importaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic=new ImportacionesLogic();
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.importacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.importacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormImportaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImportaciones);	
					}
					
					if(this.jInternalFrameImportacionImportaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImportaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByImportaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByImportaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormImportaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormImportaciones);
				this.jInternalFrameDetalleFormImportaciones.setVisible(false);
				this.jInternalFrameDetalleFormImportaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImportaciones);
					this.jInternalFrameReporteDinamicoImportaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoImportaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionImportaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionImportaciones);
					this.jInternalFrameImportacionImportaciones.setVisible(false);
					this.jInternalFrameImportacionImportaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByImportaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByImportaciones);
					this.jInternalFrameOrderByImportaciones.setVisible(false);
					this.jInternalFrameOrderByImportaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idImportacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ImportacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.importacionesReturnGeneral=new ImportacionesParameterReturnGeneral();
			
			this.importacionesParameterGeneral=new ImportacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.importacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ImportacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImportacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.importacionesSessionBean.getEsGuardarRelacionado(),this.importacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImportacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.importacionesSessionBean.getEsGuardarRelacionado(),this.importacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaDuplicarImportaciones=true;
			this.isVisibilidadCeldaCopiarImportaciones=true;
			this.isVisibilidadCeldaVerFormImportaciones=true;
			this.isVisibilidadCeldaOrdenImportaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=false;
			this.isVisibilidadCeldaGuardarImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosImportaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioImportaciones(false);
			
			this.setPermisosUsuarioImportaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.importacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.importacionesSessionBean.getEsGuardarRelacionado() && this.importacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioImportacionesClasesRelacionadas();
			}
			
			if(this.importacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioImportacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosImportaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualImportaciones();
			}
			
			if(!this.isPermisoBusquedaImportaciones) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioImportaciones,this.isPermisoPaginacionMedioImportaciones,this.isPermisoPaginacionTodoImportaciones);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ImportacionesConstantesFunciones.getTiposSeleccionarImportaciones());
				
				this.tiposColumnasSelect=ImportacionesConstantesFunciones.getTiposSeleccionarImportaciones(true);
				
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
			//if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioImportaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioImportaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioImportaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesImportaciones() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				importacionesImplementable= (ImportacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImportacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				importacionesImplementableHome= (ImportacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImportacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.importacioness= new ArrayList<Importaciones>();
			this.importacionessEliminados= new ArrayList<Importaciones>();
						
			this.isEsNuevoImportaciones=false;
			this.esParaAccionDesdeFormularioImportaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyImportaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroImportaciones();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ImportacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ImportacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesImportaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingImportaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormImportaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioImportaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioImportaciones();
			}
			
			ImportacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessImportaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Importaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectImportaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesImportaciones")) {
				iIndex=this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessImportaciones();	
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
	
	public void cargarCombosForeignKeyImportaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyImportaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyImportaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyImportacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyImportaciones();
		
		this.cargarCombosFrameForeignKeyImportaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyImportaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyImportaciones();
		}
	}
	
	
	
	public void jButtonNuevoImportacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.importacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			
			if(jTableDatosImportaciones.getRowCount()>=1) {
				jTableDatosImportaciones.removeRowSelectionInterval(0, jTableDatosImportaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoImportaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoImportaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesImportaciones(true);			
			//this.importaciones=new Importaciones();
			//this.importaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImportaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImportaciones() ;
			
			if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImportaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.importaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.importaciones);				
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			if(this.importacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Importaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarImportacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosImportaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosImportaciones.getSelectedRows().length;			
			}
			
			importacionessSeleccionados=this.getImportacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoImportaciones--;			
				//Importaciones importacionesAux= new Importaciones();			
				//importacionesAux.setId(this.iIdNuevoImportaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Importaciones importacionesOrigen=new Importaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Importaciones importacionesOrigen : importacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							importacionesOrigen =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							importacionesOrigen =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaImportaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.importaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosImportaciones(importacionesOrigen,this.importaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.importacionesLogic.getImportacioness().add(this.importacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.importacioness.add(this.importacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaImportaciones(false);
				
				this.jTableDatosImportaciones.setRowSelectionInterval(this.getIndiceNuevoImportaciones(), this.getIndiceNuevoImportaciones());
				
				int iLastRow =  this.jTableDatosImportaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImportaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImportaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImportaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();									
		
			Importaciones importacionesOrigen=new Importaciones();
			Importaciones importacionesDestino=new Importaciones();
				
			importacionessSeleccionados=this.getImportacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosImportaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || importacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosImportaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						importacionesOrigen =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						importacionesOrigen =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						importacionesDestino =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						importacionesDestino =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				importacionesOrigen =importacionessSeleccionados.get(0);
				importacionesDestino =importacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosImportaciones(importacionesOrigen,importacionesDestino,true,false);
				
				importacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(importacionesDestino,importacionesLogic.getImportacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(importacionesDestino,importacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaImportaciones(false);
				
				//this.jTableDatosImportaciones.setRowSelectionInterval(this.getIndiceNuevoImportaciones(), this.getIndiceNuevoImportaciones());
				
				int iLastRow =  this.jTableDatosImportaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImportaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImportaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImportaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormImportaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesImportaciones.isVisible();
			
			
			this.jPanelParametrosReportesImportaciones.setVisible(!isVisible);
			this.jPanelPaginacionImportaciones.setVisible(!isVisible);
			this.jPanelAccionesImportaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameImportaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoImportaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionImportaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByImportaciones();
			
			this.abrirFrameOrderByImportaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByImportaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleImportaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormImportaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormImportaciones.isMaximum()) {
					this.jInternalFrameDetalleFormImportaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormImportaciones.setSize(this.jInternalFrameDetalleFormImportaciones.iWidthFormulario,this.jInternalFrameDetalleFormImportaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormImportaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormImportaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormImportaciones.isMaximum()) {
						this.jInternalFrameDetalleFormImportaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormImportaciones.jContentPaneDetalleImportaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormImportaciones.jContentPaneDetalleImportaciones.getWidth(),ImportacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormImportaciones.jContentPaneDetalleImportaciones.getWidth(),ImportacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormImportaciones.jContentPaneDetalleImportaciones.getWidth(),ImportacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormImportaciones.setVisible(true);
	        this.jInternalFrameDetalleFormImportaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByImportaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByImportaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByImportaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportaciones,false,this);
				} else {
					this.jInternalFrameOrderByImportaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByImportaciones);
				this.jInternalFrameOrderByImportaciones.setVisible(false);
				this.jInternalFrameOrderByImportaciones.setSelected(false);
				
				this.jInternalFrameOrderByImportaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImportaciones"));
				
				this.inicializarActualizarBindingTablaOrderByImportaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionImportaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionImportaciones==null) {
				
				this.jInternalFrameImportacionImportaciones=new ImportacionJInternalFrame(ImportacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImportaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionImportaciones);
				this.jInternalFrameImportacionImportaciones.setVisible(false);
				this.jInternalFrameImportacionImportaciones.setSelected(false);


				this.jInternalFrameImportacionImportaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImportaciones"));
				this.jInternalFrameImportacionImportaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImportaciones"));
				this.jInternalFrameImportacionImportaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImportaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoImportaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoImportaciones==null) {
				this.jInternalFrameReporteDinamicoImportaciones=new ReporteDinamicoJInternalFrame(ImportacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImportaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImportaciones);
				this.jInternalFrameReporteDinamicoImportaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoImportaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImportaciones"));
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImportaciones"));
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImportaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImportaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleImportaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormImportaciones);
			
	       	this.jInternalFrameDetalleFormImportaciones.setVisible(false);
	        this.jInternalFrameDetalleFormImportaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormImportaciones.dispose();
			//this.jInternalFrameDetalleFormImportaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoImportaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoImportaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoImportaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionImportaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionImportaciones.setVisible(true);
	        this.jInternalFrameImportacionImportaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByImportaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByImportaciones.setVisible(true);
	        this.jInternalFrameOrderByImportaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByImportaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByImportaciones.setVisible(false);
	        this.jInternalFrameOrderByImportaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoImportaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoImportaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoImportaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionImportaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionImportaciones.setVisible(false);
	        this.jInternalFrameImportacionImportaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarImportaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarImportaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesImportaciones(true);
			//this.isEsNuevoImportaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesImportaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImportaciones(false) ;
			
			if(importacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImportaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImportaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaImportacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarImportaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesImportaciones(true);
			//this.isEsNuevoImportaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.importaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesImportaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesImportaciones(false) ;
			
			if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImportaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImportaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesImportaciones(false);
			
			//if(!this.isEsNuevoImportaciones) {								
				int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
				
			}
			
			if(this.permiteMantenimiento(this.importaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.importacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoImportaciones=true;
					this.inicializarActualizarBindingTablaImportaciones(false);
					this.isEsNuevoImportaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoImportaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoImportaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImportaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImportaciones(false);
				
				this.habilitarDeshabilitarControlesImportaciones(false);
			
												
				
				if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleImportaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoImportacionesActionPerformed(evt,importacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualImportaciones(this.importaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosImportaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,importacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.importaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarImportacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				this.importaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				this.importaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.importaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.importacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ImportacionesModel) this.jTableDatosImportaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoImportaciones=true;
				this.inicializarActualizarBindingTablaImportaciones(false);
				this.isEsNuevoImportaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImportaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImportaciones(false);
				
				this.habilitarDeshabilitarControlesImportaciones(false);
				
				
				
				if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleImportaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarImportacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosImportaciones.getRowCount()>=1) {
				jTableDatosImportaciones.removeRowSelectionInterval(0, jTableDatosImportaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesImportaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaImportaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImportaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImportaciones(false) ;
			
			this.isEsNuevoImportaciones=false;
			
			if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleImportaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingImportaciones(false);
				
				//SI ES MANUAL
				if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualImportaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoImportaciones--;			
			//Importaciones importacionesAux= new Importaciones();			
			//importacionesAux.setId(this.iIdNuevoImportaciones);
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaImportaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
			
			this.importaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.importacionesLogic.getImportacioness().add(this.importacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.importacioness.add(this.importacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaImportaciones(false);
			
			this.jTableDatosImportaciones.setRowSelectionInterval(this.getIndiceNuevoImportaciones(), this.getIndiceNuevoImportaciones());
			
			int iLastRow =  this.jTableDatosImportaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosImportaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosImportaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaImportaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingImportaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImportaciones(false);
			
			//SI ES MANUAL
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImportaciones();
			}
			
			//this.abrirFrameTreeImportaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionImportacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ImportacionesES ?", "MANTENIMIENTO DE Importaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionImportaciones.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralImportaciones();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.importacionesReturnGeneral=importacionesLogic.procesarImportacionImportacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.importacionesParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarImportacionesReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionImportacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionImportaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionImportaciones.setFileImportacion(this.jInternalFrameImportacionImportaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionImportaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionImportaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionImportaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionImportaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		

		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ImportacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ImportacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteImportacioness("Todos",importacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImportacionesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoImportaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ImportacionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ImportacionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImportacionesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoImportacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Importacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ImportacionesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImportacionesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Importaciones importaciones:importacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(importaciones.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelImportaciones(row);				
			//	iRow++;
			//}				
			
			//for(Importaciones importacionesAux:importacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelImportaciones(importacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImportaciones(false);
			
			//SI ES MANUAL
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImportaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImportaciones(false);
			
			//SI ES MANUAL
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImportaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesImportacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImportaciones(false);
			
			//SI ES MANUAL
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImportaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.importacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaImportaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosImportaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosImportaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosImportaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosImportaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosImportaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosImportaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosImportaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingImportaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingImportaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingImportaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaImportaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesImportaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasImportaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImportaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesImportaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ImportacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualImportaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaImportaciones();
		
		this.inicializarActualizarBindingBotonesManualImportaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualImportaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImportaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualImportaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualImportaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosImportaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosImportaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteImportaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormImportaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionNuevoImportaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionSinCerrarImportaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionSinMensajeImportaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosImportaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosImportaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteImportaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormImportaciones!=null) {
				this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionNuevoImportaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionSinCerrarImportaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormImportaciones.jCheckBoxPostAccionSinMensajeImportaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionImportaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionImportaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesImportaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesImportaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesImportaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarImportaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesImportaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesImportaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralImportaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesImportaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualImportaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesImportaciones() throws Exception {
		try	{
			if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualImportaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImportaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualImportaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesImportaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesImportaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesImportaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionImportaciones.addItem(reporte);
			}
			
			
			if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionImportaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionImportaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesImportaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesImportaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarImportaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarImportaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarImportaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImportaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImportaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
				this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
				this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoImportaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImportaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoImportaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImportaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImportaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualImportaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasImportaciones(Boolean esInicializar) throws Exception {				
		if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualImportaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaImportaciones() throws Exception {
		this.inicializarActualizarBindingTablaImportaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByImportaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosImportacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImportacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaImportaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=importacionesLogic.getImportacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=importacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosImportaciones.setModel(new ImportacionesModel(this.importacionesLogic.getImportacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosImportaciones.setModel(new ImportacionesModel(this.importacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByImportaciones!=null && this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByImportaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosImportaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImportaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ImportacionesConstantesFunciones.SCLASSWEBTITULO,importacionesConstantesFunciones.resaltarSeleccionarImportaciones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ImportacionesConstantesFunciones.SCLASSWEBTITULO,importacionesConstantesFunciones.resaltarSeleccionarImportaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosImportaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImportaciones,ImportacionesConstantesFunciones.LABEL_ID));

		if(this.importacionesConstantesFunciones.mostraridImportaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImportacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.importacionesConstantesFunciones.resaltaridImportaciones,this.importacionesConstantesFunciones.activaridImportaciones,this,true,"idImportaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.importacionesConstantesFunciones.resaltaridImportaciones,this.importacionesConstantesFunciones.activaridImportaciones,this,true,"idImportaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImportaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImportaciones,ImportacionesConstantesFunciones.LABEL_CODIGO));

		if(this.importacionesConstantesFunciones.mostrarcodigoImportaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImportacionesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.importacionesConstantesFunciones.resaltarcodigoImportaciones,this.importacionesConstantesFunciones.activarcodigoImportaciones,this,true,"codigoImportaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.importacionesConstantesFunciones.resaltarcodigoImportaciones,this.importacionesConstantesFunciones.activarcodigoImportaciones,this,true,"codigoImportaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ImportacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.importacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.importacionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImportaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.importacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.importacionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImportaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarImportaciones && this.isPermisoGuardarCambiosImportaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.importacionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.importacionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosImportaciones.addColumn(tableColumn);
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
			
			this.jTableDatosImportaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImportaciones && this.isPermisoGuardarCambiosImportaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImportaciones && this.isPermisoGuardarCambiosImportaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosImportaciones.moveColumn(this.jTableDatosImportaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosImportaciones.moveColumn(this.jTableDatosImportaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosImportaciones.moveColumn(this.jTableDatosImportaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosImportaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosImportaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosImportaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosImportaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosImportaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosImportaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosImportaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosImportaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=importacionesLogic.getImportacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=importacioness.size()-1;
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
		//this.jTableDatosImportaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosImportaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosImportaciones();
			
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
				
				//this.isEsNuevoImportaciones=false;
					
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
				if(this.importacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormImportaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImportaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImportaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.importaciones.getsType().equals("DUPLICADO")
				   || this.importaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoImportaciones=true;
				
				} else {
					this.isEsNuevoImportaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.importaciones.getId()>=0 && !this.importaciones.getIsNew()) {						
						this.isEsNuevoImportaciones=false;
						
					} else {
						this.isEsNuevoImportaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoImportaciones(esRelaciones);						
				
				this.seleccionarImportaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.importaciones.getId()<0) {
					this.isEsNuevoImportaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarImportaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarImportaciones(evt,rowIndex);
				}	
				
				if(this.importacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Importaciones: " + this.dDif); 
					}
				}								
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarImportaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.importaciones)) {
					if(this.importaciones.getId()>0) {
						this.importaciones.setIsDeleted(true);
						
						this.importacionessEliminados.add(this.importaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.importacionesLogic.getImportacioness().remove(this.importaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.importacioness.remove(this.importaciones);				
					}
					
					
					((ImportacionesModel) this.jTableDatosImportaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaImportaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarImportaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoImportaciones) {
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImportaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImportaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioImportaciones(this.importaciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesImportaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesImportaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImportaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoImportaciones(Importaciones importaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoImportaciones(importaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoImportaciones(Importaciones importaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioImportaciones(importaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyImportaciones(importaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyImportaciones(importaciones);
	}
	
	public void setVariablesObjetoActualToFormularioImportaciones(Importaciones importaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setText(importaciones.getId().toString());
			this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setText(importaciones.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Importaciones importacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,importacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Importaciones importacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				importacionesLocal=this.importaciones;
			} else {
				importacionesLocal=this.importacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(importacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoImportaciones(importacionesLocal,true);
					
					if(importacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(importacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(importacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoImportaciones(Importaciones importaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImportaciones(importaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(importaciones);
	}
	
	public void setVariablesFormularioToObjetoActualImportaciones(Importaciones importaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImportaciones(importaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualImportaciones(Importaciones importaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.getText()==null || this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.getText()=="" || this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setText("0");
			}

			if(conColumnasBase) {importaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImportacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImportaciones.jLabelIdImportaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			importaciones.setcodigo(this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImportacionesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImportaciones.jLabelcodigoImportaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImportaciones(Importaciones importacionesBean,Importaciones importaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosImportaciones(Importaciones importacionesOrigen,Importaciones importaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && importacionesOrigen.getId()!=null && !importacionesOrigen.getId().equals(0L))) {importaciones.setId(importacionesOrigen.getId());}}
			if(conDefault || (!conDefault && importacionesOrigen.getcodigo()!=null && !importacionesOrigen.getcodigo().equals(""))) {importaciones.setcodigo(importacionesOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImportaciones(Importaciones importaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setText(importaciones.getId().toString());
			this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setText(importaciones.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImportaciones(ImportacionesBean importacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setText(importacionesBean.getId().toString());
			this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setText(importacionesBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanImportaciones(ImportacionesParameterReturnGeneral importacionesReturnGeneral,ImportacionesBean importacionesBean,Boolean conDefault) throws Exception { 
		try {
			Importaciones importacionesLocal=new Importaciones();
			
			importacionesLocal=importacionesReturnGeneral.getImportaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && importacionesLocal.getId()!=null && !importacionesLocal.getId().equals(0L))) {importacionesBean.setId(importacionesLocal.getId());}}
			if(conDefault || (!conDefault && importacionesLocal.getcodigo()!=null && !importacionesLocal.getcodigo().equals(""))) {importacionesBean.setcodigo(importacionesLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxImportacionesGenerico(Long idImportacionesSeleccionado,JComboBox jComboBoxImportaciones,List<Importaciones> importacionessLocal)throws Exception {
		try {
			Importaciones  importacionesTemp=null;

			for(Importaciones importacionesAux:importacionessLocal) {
				if(importacionesAux.getId()!=null && importacionesAux.getId().equals(idImportacionesSeleccionado)) {
					importacionesTemp=importacionesAux;
					break;
				}
			}

			jComboBoxImportaciones.setSelectedItem(importacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxImportacionesGenerico(JComboBox jComboBoxImportaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxImportaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImportaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxImportaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImportaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImportaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxImportaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImportaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxImportaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxImportaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxImportaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			importaciones=(Importaciones) importacionesLogic.getImportacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			importaciones =(Importaciones) importacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Importaciones importacionesRow=new Importaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			importacionesRow=(Importaciones) importacionesLogic.getImportacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			importacionesRow=(Importaciones) importacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualImportaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones));			
			this.jButtonDuplicarImportaciones.setVisible((this.isVisibilidadCeldaDuplicarImportaciones && this.isPermisoDuplicarImportaciones));			
			this.jButtonCopiarImportaciones.setVisible((this.isVisibilidadCeldaCopiarImportaciones && this.isPermisoCopiarImportaciones));
			this.jButtonVerFormImportaciones.setVisible((this.isVisibilidadCeldaVerFormImportaciones && this.isPermisoVerFormImportaciones));
			
			this.jButtonAbrirOrderByImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));			
			
			this.jButtonNuevoRelacionesImportaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesImportaciones && this.isPermisoNuevoImportaciones));			
			this.jButtonNuevoGuardarCambiosImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones && this.isPermisoGuardarCambiosImportaciones));
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.jInternalFrameDetalleFormImportaciones.jButtonModificarImportaciones.setVisible((this.isVisibilidadCeldaModificarImportaciones && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.setVisible((this.isVisibilidadCeldaActualizarImportaciones && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.setVisible((this.isVisibilidadCeldaEliminarImportaciones && this.isPermisoEliminarImportaciones));
			this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.setVisible(this.isVisibilidadCeldaCancelarImportaciones);							
			this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.setVisible((this.isVisibilidadCeldaGuardarImportaciones && this.isPermisoGuardarCambiosImportaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaImportaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosImportaciones && this.isPermisoGuardarCambiosImportaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones));						
			this.jButtonDuplicarToolBarImportaciones.setVisible((this.isVisibilidadCeldaDuplicarImportaciones && this.isPermisoDuplicarImportaciones));						
			this.jButtonCopiarToolBarImportaciones.setVisible((this.isVisibilidadCeldaCopiarImportaciones && this.isPermisoCopiarImportaciones));			
			this.jButtonVerFormToolBarImportaciones.setVisible((this.isVisibilidadCeldaVerFormImportaciones && this.isPermisoVerFormImportaciones));			
			this.jButtonAbrirOrderByToolBarImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));
			this.jButtonNuevoRelacionesToolBarImportaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesImportaciones && this.isPermisoNuevoImportaciones));			
			this.jButtonNuevoGuardarCambiosToolBarImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones && this.isPermisoGuardarCambiosImportaciones));			
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.jInternalFrameDetalleFormImportaciones.jButtonModificarToolBarImportaciones.setVisible((this.isVisibilidadCeldaModificarImportaciones && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jButtonActualizarToolBarImportaciones.setVisible((this.isVisibilidadCeldaActualizarImportaciones  && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jButtonEliminarToolBarImportaciones.setVisible((this.isVisibilidadCeldaEliminarImportaciones && this.isPermisoEliminarImportaciones));
			this.jInternalFrameDetalleFormImportaciones.jButtonCancelarToolBarImportaciones.setVisible(this.isVisibilidadCeldaCancelarImportaciones);				
			this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosToolBarImportaciones.setVisible((this.isVisibilidadCeldaGuardarImportaciones && this.isPermisoGuardarCambiosImportaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarImportaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosImportaciones && this.isPermisoGuardarCambiosImportaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones));			
			this.jMenuItemDuplicarImportaciones.setVisible((this.isVisibilidadCeldaDuplicarImportaciones && this.isPermisoDuplicarImportaciones));			
			this.jMenuItemCopiarImportaciones.setVisible((this.isVisibilidadCeldaCopiarImportaciones && this.isPermisoCopiarImportaciones));			
			this.jMenuItemVerFormImportaciones.setVisible((this.isVisibilidadCeldaVerFormImportaciones && this.isPermisoVerFormImportaciones));			
			this.jMenuItemAbrirOrderByImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));			
			//this.jMenuItemMostrarOcultarImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));
			this.jMenuItemDetalleAbrirOrderByImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));			
			//this.jMenuItemDetalleMostrarOcultarImportaciones.setVisible((this.isVisibilidadCeldaOrdenImportaciones && this.isPermisoOrdenImportaciones));			
			this.jMenuItemNuevoRelacionesImportaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesImportaciones && this.isPermisoNuevoImportaciones));			
			this.jMenuItemNuevoGuardarCambiosImportaciones.setVisible((this.isVisibilidadCeldaNuevoImportaciones && this.isPermisoNuevoImportaciones && this.isPermisoGuardarCambiosImportaciones));									
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.jInternalFrameDetalleFormImportaciones.jMenuItemModificarImportaciones.setVisible((this.isVisibilidadCeldaModificarImportaciones && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jMenuItemActualizarImportaciones.setVisible((this.isVisibilidadCeldaActualizarImportaciones && this.isPermisoActualizarImportaciones));	
			this.jInternalFrameDetalleFormImportaciones.jMenuItemEliminarImportaciones.setVisible((this.isVisibilidadCeldaEliminarImportaciones && this.isPermisoEliminarImportaciones));
			this.jInternalFrameDetalleFormImportaciones.jMenuItemCancelarImportaciones.setVisible(this.isVisibilidadCeldaCancelarImportaciones);				
			}
			
			this.jMenuItemGuardarCambiosImportaciones.setVisible((this.isVisibilidadCeldaGuardarImportaciones && this.isPermisoGuardarCambiosImportaciones));						
			this.jMenuItemGuardarCambiosTablaImportaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosImportaciones && this.isPermisoGuardarCambiosImportaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoImportaciones=this.jButtonNuevoImportaciones.isVisible();
			this.isVisibilidadCeldaDuplicarImportaciones=this.jButtonDuplicarImportaciones.isVisible();
			this.isVisibilidadCeldaCopiarImportaciones=this.jButtonCopiarImportaciones.isVisible();
			this.isVisibilidadCeldaVerFormImportaciones=this.jButtonVerFormImportaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenImportaciones=this.jButtonAbrirOrderByImportaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=this.jButtonNuevoRelacionesImportaciones.isVisible();
			this.isVisibilidadCeldaModificarImportaciones=this.jButtonModificarImportaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.isVisibilidadCeldaActualizarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.isVisible();
			this.isVisibilidadCeldaEliminarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.isVisible();
			this.isVisibilidadCeldaCancelarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.isVisible();
			this.isVisibilidadCeldaGuardarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosImportaciones=this.jButtonGuardarCambiosTablaImportaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoImportaciones=this.jButtonNuevoToolBarImportaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=this.jButtonNuevoRelacionesToolBarImportaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.isVisibilidadCeldaModificarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonModificarToolBarImportaciones.isVisible();
			this.isVisibilidadCeldaActualizarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonActualizarToolBarImportaciones.isVisible();
			this.isVisibilidadCeldaEliminarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonEliminarToolBarImportaciones.isVisible();
			this.isVisibilidadCeldaCancelarImportaciones=this.jInternalFrameDetalleFormImportaciones.jButtonCancelarToolBarImportaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImportaciones=this.jButtonGuardarCambiosToolBarImportaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImportaciones=this.jButtonGuardarCambiosTablaToolBarImportaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoImportaciones=this.jMenuItemNuevoImportaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=this.jMenuItemNuevoRelacionesImportaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.isVisibilidadCeldaModificarImportaciones=this.jInternalFrameDetalleFormImportaciones.jMenuItemModificarImportaciones.isVisible();
			this.isVisibilidadCeldaActualizarImportaciones=this.jInternalFrameDetalleFormImportaciones.jMenuItemActualizarImportaciones.isVisible();
			this.isVisibilidadCeldaEliminarImportaciones=this.jInternalFrameDetalleFormImportaciones.jMenuItemEliminarImportaciones.isVisible();
			this.isVisibilidadCeldaCancelarImportaciones=this.jInternalFrameDetalleFormImportaciones.jMenuItemCancelarImportaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImportaciones=this.jMenuItemGuardarCambiosImportaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImportaciones=this.jMenuItemGuardarCambiosTablaImportaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesImportaciones(Boolean esInicializar) {
		if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.importacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.importacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesImportaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualImportaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualImportaciones() {
		this.jButtonNuevoImportaciones.setVisible(this.isPermisoNuevoImportaciones);			
		this.jButtonDuplicarImportaciones.setVisible(this.isPermisoDuplicarImportaciones);			
		this.jButtonCopiarImportaciones.setVisible(this.isPermisoCopiarImportaciones);			
		this.jButtonVerFormImportaciones.setVisible(this.isPermisoVerFormImportaciones);			
		
		this.jButtonAbrirOrderByImportaciones.setVisible(this.isPermisoOrdenImportaciones);					
		
		this.jButtonNuevoRelacionesImportaciones.setVisible(this.isPermisoNuevoImportaciones);			
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonModificarImportaciones.setVisible(this.isPermisoActualizarImportaciones);	
			this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.setVisible(this.isPermisoActualizarImportaciones);	
			this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.setVisible(this.isPermisoEliminarImportaciones);
			this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.setVisible(this.isVisibilidadCeldaCancelarImportaciones);						
			this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.setVisible(this.isPermisoGuardarCambiosImportaciones);							
		}
		
		this.jButtonGuardarCambiosTablaImportaciones.setVisible(this.isPermisoActualizarImportaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleImportaciones() {
		this.jInternalFrameDetalleFormImportaciones.jButtonModificarImportaciones.setVisible(this.isPermisoActualizarImportaciones);	
		this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.setVisible(this.isPermisoActualizarImportaciones);	
		this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.setVisible(this.isPermisoEliminarImportaciones);
		this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.setVisible(this.isVisibilidadCeldaCancelarImportaciones);							
		this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.setVisible((this.isVisibilidadCeldaGuardarImportaciones && this.isPermisoGuardarCambiosImportaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosImportaciones() {
		if(ImportacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualImportaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesImportaciones() {
	}
	
	public void jTableDatosImportacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarImportaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidImportacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImportaciones(this.getimportaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.importaciones==null) {
						this.importaciones = new Importaciones();
					}

					this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
				}

				if(this.importaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.importaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImportaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoImportacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImportaciones(this.getimportaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.importaciones==null) {
						this.importaciones = new Importaciones();
					}

					this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);
				}

				if(this.importaciones.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.importaciones.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImportaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameImportaciones() {
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
			this.jInternalFrameDetalleFormImportaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormImportaciones.dispose();
			this.jInternalFrameDetalleFormImportaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
			this.jInternalFrameReporteDinamicoImportaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoImportaciones.dispose();
			this.jInternalFrameReporteDinamicoImportaciones=null;
		}
		
		if(this.jInternalFrameImportacionImportaciones!=null) {
			this.jInternalFrameImportacionImportaciones.setVisible(false);	    			
			this.jInternalFrameImportacionImportaciones.dispose();
			this.jInternalFrameImportacionImportaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessImportaciones();
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarImportaciones")) {
				jButtonDuplicarImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarImportaciones")) {
				jButtonCopiarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormImportaciones")) {
				jButtonVerFormImportacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarImportaciones")) {
				jButtonDuplicarImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarImportaciones")) {
				jButtonDuplicarImportacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarImportaciones")) {
				jButtonModificarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarImportaciones")) {
				jButtonModificarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarImportaciones")) {
				jButtonModificarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarImportaciones")) {
				jButtonActualizarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarImportaciones")) {
				jButtonActualizarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarImportaciones")) {
				jButtonActualizarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarImportaciones")) {
				jButtonEliminarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarImportaciones")) {
				jButtonEliminarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarImportaciones")) {
				jButtonEliminarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarImportaciones")) {
				jButtonCancelarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarImportaciones")) {
				jButtonCancelarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarImportaciones")) {
				jButtonCancelarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarImportaciones")) {
				jButtonCerrarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarImportaciones")) {
				jButtonCerrarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarImportaciones")) {
				jButtonCerrarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarImportaciones")) {
				jButtonMostrarOcultarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarImportaciones")) {
				jButtonCancelarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarImportaciones")) {
				jButtonCopiarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarImportaciones")) {
				jButtonVerFormImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarImportaciones")) {
				jButtonCopiarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormImportaciones")) {
				jButtonVerFormImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionImportaciones")) {
				jButtonRecargarInformacionImportacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarImportaciones")) {
				jButtonRecargarInformacionImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionImportaciones")) {
				jButtonRecargarInformacionImportacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresImportaciones")) {
				jButtonAnterioresImportacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarImportaciones")) {
				jButtonAnterioresImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreImportaciones")) {
				jButtonAnterioresImportacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesImportaciones")) {
				jButtonSiguientesImportacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarImportaciones")) {
				jButtonSiguientesImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesImportaciones")) {
				jButtonSiguientesImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByImportaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByImportaciones")) {
				jButtonAbrirOrderByImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarImportaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarImportaciones")) {
				jButtonMostrarOcultarImportacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosImportaciones")) {
				jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarImportaciones")) {
				jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosImportaciones")) {
				jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoImportaciones")) {
				jButtonCerrarReporteDinamicoImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoImportaciones")) {
				jButtonGenerarReporteDinamicoImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoImportaciones")) {
				
				jButtonGenerarExcelReporteDinamicoImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionImportaciones")) {
				jButtonCerrarImportacionImportacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionImportaciones")) {
				
				jButtonGenerarImportacionImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionImportaciones")) {
				
				jButtonAbrirImportacionImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesImportaciones")) {
				jComboBoxTiposAccionesImportacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesImportaciones")) {
				jComboBoxTiposRelacionesImportacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioImportaciones")) {
				jComboBoxTiposAccionesImportacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarImportaciones")) {
				
				jComboBoxTiposSeleccionarImportacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralImportaciones")) {
				jTextFieldValorCampoGeneralImportacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByImportaciones")) {
				jButtonAbrirOrderByImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarImportaciones")) {
				jButtonAbrirOrderByImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByImportaciones")) {
				jButtonCerrarOrderByImportacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImportacionesBusqueda")) {
				this.jButtonidImportacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoImportacionesBusqueda")) {
				this.jButtoncodigoImportacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessImportaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Importaciones importacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				importacionesLocal=this.importaciones;
			} else {
				importacionesLocal=this.importacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
							
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
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
			
			


			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
								
						
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
								
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
							
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
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
			
			


			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
								
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosImportaciones")) {
					jCheckBoxSeleccionarTodosImportacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosImportaciones")) {
					jCheckBoxSeleccionadosImportacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarImportaciones")) {
					
				}
				
				


				
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
												
				
				


				
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
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
			
			


			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImportacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.importaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.importaciones);
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
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
				
				


				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Importaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Importaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImportacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.importacionesAnterior =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.importacionesAnterior =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarImportaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosImportacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosImportaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.importaciones =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.importaciones =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.importaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarImportaciones")) {
				
				}
				
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarImportaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosImportaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarImportaciones")) {
			
			}
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessImportaciones();
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			if(sTipo.equals("NuevoImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarImportaciones")) {
				jButtonDuplicarImportacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarImportaciones")) {
				jButtonCopiarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormImportaciones")) {
				jButtonVerFormImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesImportaciones")) {
				jButtonNuevoImportacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarImportaciones")) {
				jButtonModificarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarImportaciones")) {
				jButtonActualizarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarImportaciones")) {
				jButtonEliminarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarImportaciones")) {
				jButtonCancelarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportaciones")) {
				jButtonCerrarImportacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosImportaciones")) {
				jButtonGuardarCambiosImportacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosImportaciones")) {
				jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByImportaciones")) {
				jButtonAbrirOrderByImportacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionImportaciones")) {
				jButtonRecargarInformacionImportacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresImportaciones")) {
				jButtonAnterioresImportacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesImportaciones")) {
				jButtonSiguientesImportacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImportacionesBusqueda")) {
				this.jButtonidImportacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoImportacionesBusqueda")) {
				this.jButtoncodigoImportacionesBusquedaActionPerformed(evt);
			}
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessImportaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameImportaciones")) {
				closingInternalFrameImportaciones();
				
			} else if(sTipo.equals("jButtonCancelarImportaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormImportaciones = (JInternalFrameBase)evt.getSource();
	            	
	            ImportacionesBeanSwingJInternalFrame jInternalFrameParent=(ImportacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormImportaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarImportacionesActionPerformed(null);
			}
			
			ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.importaciones,new Object(),this.importacionesParameterGeneral,this.importacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormImportaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormImportaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormImportaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.importaciones)) {
			if(!esControlTabla) {
				if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);			
				}
				
				if(this.importacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualImportaciones(this.importaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanImportaciones(this.importacionesReturnGeneral,this.importacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.importacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanImportaciones(classes,this.importacionesReturnGeneral,this.importacionesBean,false);
					}
						
					if(this.importacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyImportaciones(this.importacionesReturnGeneral.getImportaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioImportaciones(this.importacionesReturnGeneral.getImportaciones());	
					}
						
					if(this.importacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioImportaciones(this.importacionesReturnGeneral.getImportaciones(),classes);//this.importacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioImportaciones(this.importaciones,classes);//this.importacionesBean);									
				}
			
				if(ImportacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualImportaciones(this.importaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImportaciones(this.importaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.importacionesAnterior!=null) {
						this.importaciones=this.importacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.importacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.importacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.importacionesReturnGeneral.getImportaciones(),importacionesLogic.getImportacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.importacionesReturnGeneral.getImportaciones(),this.importacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosImportaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosImportaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosImportaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosImportaciones() throws Exception {
		
		ImportacionesModel importacionesModel=(ImportacionesModel)this.jTableDatosImportaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			importacionesModel.importacioness=this.importacionesLogic.getImportacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			importacionesModel.importacioness=this.importacioness;
		}
		
		
		((ImportacionesModel) this.jTableDatosImportaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaImportaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getimportacionesAnterior(),this.importacionesLogic.getImportacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getimportacionesAnterior(),this.importacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosImportaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioImportaciones(Importaciones importaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
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
										
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.importaciones,new Object(),generalEntityParameterGeneral,this.importacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.importacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ImportacionesConstantesFunciones.getClassesRelationshipsOfImportaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ImportacionesConstantesFunciones.getClassesRelationshipsFromStringsOfImportaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormImportaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ImportacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.importaciones,new Object(),generalEntityParameterGeneral,this.importacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioImportaciones(ImportacionesBean importacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanImportaciones(ArrayList<Classe> classes,ImportacionesReturnGeneral importacionesReturnGeneral,ImportacionesBean importacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualImportaciones(Importaciones importaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.importaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormImportaciones = new ImportacionesDetalleFormJInternalFrame(jDesktopPane,this.importacionesSessionBean.getConGuardarRelaciones(),this.importacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormImportaciones);
		this.jInternalFrameDetalleFormImportaciones.setVisible(false);
		this.jInternalFrameDetalleFormImportaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormImportaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormImportaciones.importacionesLogic=this.importacionesLogic;
		
		this.cargarCombosFrameForeignKeyImportaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleImportaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImportaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyImportaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyImportaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormImportaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImportaciones"));
		
		this.jInternalFrameDetalleFormImportaciones.jButtonModificarImportaciones.addActionListener(new ButtonActionListener(this,"ModificarImportaciones"));

		
		this.jInternalFrameDetalleFormImportaciones.jButtonModificarToolBarImportaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarImportaciones"));
					
		this.jInternalFrameDetalleFormImportaciones.jMenuItemModificarImportaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarImportaciones"));		
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.addActionListener (new ButtonActionListener(this,"ActualizarImportaciones"));
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonActualizarToolBarImportaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImportaciones"));
						
		this.jInternalFrameDetalleFormImportaciones.jMenuItemActualizarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImportaciones"));		
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.addActionListener (new ButtonActionListener(this,"EliminarImportaciones"));
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonEliminarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarImportaciones"));
								
		this.jInternalFrameDetalleFormImportaciones.jMenuItemEliminarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImportaciones"));		
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.addActionListener (new ButtonActionListener(this,"CancelarImportaciones"));
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonCancelarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarImportaciones"));
					
		this.jInternalFrameDetalleFormImportaciones.jMenuItemCancelarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImportaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jMenuItemDetalleCerrarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImportaciones"));		
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosToolBarImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImportaciones"));
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosToolBarImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImportaciones"));
		
		
		
		this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImportaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtonidImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"idImportacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtoncodigoImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoImportacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImportaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameImportaciones"));
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImportaciones"));
		}
		
		this.jTableDatosImportaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarImportaciones"));
		
		this.jTableDatosImportaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarImportaciones"));
		
		this.jButtonNuevoImportaciones.addActionListener(new ButtonActionListener(this,"NuevoImportaciones"));
		
		this.jButtonDuplicarImportaciones.addActionListener(new ButtonActionListener(this,"DuplicarImportaciones"));
		
		this.jButtonCopiarImportaciones.addActionListener(new ButtonActionListener(this,"CopiarImportaciones"));
		
		this.jButtonVerFormImportaciones.addActionListener(new ButtonActionListener(this,"VerFormImportaciones"));
		
		
		this.jButtonNuevoToolBarImportaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarImportaciones"));
			
		this.jButtonDuplicarToolBarImportaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarImportaciones"));
			
		this.jMenuItemNuevoImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoImportaciones"));
			
		this.jMenuItemDuplicarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarImportaciones"));		
		
		
		this.jButtonNuevoRelacionesImportaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesImportaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarImportaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarImportaciones"));
			
		this.jMenuItemNuevoRelacionesImportaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesImportaciones"));		
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonModificarImportaciones.addActionListener(new ButtonActionListener(this,"ModificarImportaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonModificarToolBarImportaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarImportaciones"));
			
			this.jInternalFrameDetalleFormImportaciones.jMenuItemModificarImportaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarImportaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormImportaciones.jButtonActualizarImportaciones.addActionListener (new ButtonActionListener(this,"ActualizarImportaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonActualizarToolBarImportaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImportaciones"));
				
			this.jInternalFrameDetalleFormImportaciones.jMenuItemActualizarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImportaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonEliminarImportaciones.addActionListener (new ButtonActionListener(this,"EliminarImportaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonEliminarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarImportaciones"));
						
			this.jInternalFrameDetalleFormImportaciones.jMenuItemEliminarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImportaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonCancelarImportaciones.addActionListener (new ButtonActionListener(this,"CancelarImportaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonCancelarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarImportaciones"));
			
			this.jInternalFrameDetalleFormImportaciones.jMenuItemCancelarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImportaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarImportaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarImportaciones"));		
		
		
		this.jButtonCerrarImportaciones.addActionListener (new ButtonActionListener(this,"CerrarImportaciones"));
		
		
		this.jButtonCerrarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarImportaciones"));
			
		this.jMenuItemCerrarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarImportaciones"));
			
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jMenuItemDetalleCerrarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImportaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosImportaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosToolBarImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImportaciones"));
		}
		
		this.jButtonCopiarToolBarImportaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarImportaciones"));
			
		this.jButtonVerFormToolBarImportaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarImportaciones"));
		
		this.jMenuItemGuardarCambiosImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosImportaciones"));
			
		this.jMenuItemCopiarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarImportaciones"));		
		
		this.jMenuItemVerFormImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormImportaciones"));		
		
		
		this.jButtonGuardarCambiosTablaImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImportaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarImportaciones"));
			
		this.jMenuItemGuardarCambiosTablaImportaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImportaciones"));		
		
		
		
		this.jButtonRecargarInformacionImportaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionImportaciones"));
					
		this.jButtonRecargarInformacionToolBarImportaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarImportaciones"));
		
		this.jMenuItemRecargarInformacionImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionImportaciones"));		
		
		
		
		this.jButtonAnterioresImportaciones.addActionListener (new ButtonActionListener(this,"AnterioresImportaciones"));
		
		
		this.jButtonAnterioresToolBarImportaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarImportaciones"));
		
		this.jMenuItemAnterioresImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresImportaciones"));		
		
		
		this.jButtonSiguientesImportaciones.addActionListener (new ButtonActionListener(this,"SiguientesImportaciones"));
		
		
		this.jButtonSiguientesToolBarImportaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarImportaciones"));
			
		this.jMenuItemSiguientesImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesImportaciones"));
			
		this.jMenuItemAbrirOrderByImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByImportaciones"));
			
		this.jMenuItemMostrarOcultarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarImportaciones"));
			
		this.jMenuItemDetalleAbrirOrderByImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByImportaciones"));
			
		this.jMenuItemDetalleMostarOcultarImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarImportaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosImportaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosImportaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarImportaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarImportaciones"));
			
		this.jMenuItemNuevoGuardarCambiosImportaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosImportaciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosImportaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosImportaciones"));

		this.jCheckBoxSeleccionadosImportaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosImportaciones"));
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImportaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesImportaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesImportaciones"));
			
		this.jComboBoxTiposAccionesImportaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesImportaciones"));
					
		this.jComboBoxTiposSeleccionarImportaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarImportaciones"));
			
		this.jTextFieldValorCampoGeneralImportaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralImportaciones"));		
		
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtonidImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"idImportacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtoncodigoImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoImportacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoImportaciones!=null) {
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImportaciones"));
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImportaciones"));
				this.jInternalFrameReporteDinamicoImportaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImportaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoImportaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImportaciones"));				
			//this.jButtonGenerarReporteDinamicoImportaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImportaciones"));
			//this.jButtonGenerarExcelReporteDinamicoImportaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImportaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionImportaciones!=null) {
				this.jInternalFrameImportacionImportaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImportaciones"));
				this.jInternalFrameImportacionImportaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImportaciones"));
				this.jInternalFrameImportacionImportaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImportaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByImportaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByImportaciones"));
			
			this.jButtonAbrirOrderByToolBarImportaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarImportaciones"));			
			
			if(this.jInternalFrameOrderByImportaciones!=null) {
				this.jInternalFrameOrderByImportaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImportaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormImportaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImportaciones.jTabbedPaneRelacionesImportaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImportaciones"));
		
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
            		closingInternalFrameImportaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormImportaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormImportaciones = (JInternalFrameBase)event.getSource();
	            	
	            ImportacionesBeanSwingJInternalFrame jInternalFrameParent=(ImportacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormImportaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarImportacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosImportaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosImportacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosImportaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosImportaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoImportaciones";
		inputMap = this.jButtonNuevoImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImportacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImportacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesImportaciones";
		inputMap = this.jButtonNuevoRelacionesImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImportacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarImportaciones";
		inputMap = this.jButtonModificarImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarImportaciones";
		inputMap = this.jButtonActualizarImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarImportaciones";
		inputMap = this.jButtonEliminarImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarImportaciones";
		inputMap = this.jButtonCancelarImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarImportaciones";
		inputMap = this.jButtonCerrarImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosImportaciones";
		inputMap = this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormImportaciones.jButtonGuardarCambiosImportaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosImportacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosImportaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosImportacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesImportaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesImportacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarImportaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarImportacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralImportaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralImportacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtonidImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"idImportacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImportaciones.jButtoncodigoImportacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoImportacionesBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionImportaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionImportacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarImportacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarImportaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosImportaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
					importacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Importaciones importacionesAux:importacioness) {
					importacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosImportacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImportaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
						importacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Importaciones importacionesAux:importacioness) {
						importacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Importaciones importacionesAux:importacioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaImportaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImportaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImportaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImportaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosImportacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImportaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosImportaciones.getSelectedRows();
			
			Importaciones importacionesLocal=new Importaciones();
			
			//this.seleccionarTodosImportaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					importacionesLocal =(Importaciones) this.importacionesLogic.getImportacioness().toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					importacionesLocal =(Importaciones) this.importacioness.toArray()[this.jTableDatosImportaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				importacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
						importacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Importaciones importacionesAux:importacioness) {
						importacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaImportaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImportaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImportaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImportaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualImportacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarImportacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralImportacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingImportaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralImportaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Importaciones importacionesAux:this.importacionesLogic.getImportacioness()) {
				
						if(sTipoSeleccionar.equals(ImportacionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							importacionesAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Importaciones importacionesAux:importacioness) {
					
						if(sTipoSeleccionar.equals(ImportacionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							importacionesAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaImportaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesImportacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingImportaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioImportaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesImportaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteImportaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessImportaciones(conSplash);
				
					this.generarReporteImportacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoImportacionessSeleccionados();
				//this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImportacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImportacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImportaciones();
				
				this.exportarImportacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionImportacioness();
				//this.importarImportacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImportaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelImportacionessSeleccionados();
				//this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Importaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessImportaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoImportaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyImportaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(ImportacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteImportaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessImportaciones(conSplash);
					
						//this.actualizarParametrosGeneralImportaciones();
						
						this.generarReporteProcesoAccionImportacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ImportacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ImportacionesES SELECCIONADOS?", "MANTENIMIENTO DE Importaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessImportaciones();
				
						this.actualizarParametrosGeneralImportaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.importacionesReturnGeneral=importacionesLogic.procesarAccionImportacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.importacionesLogic.getImportacioness(),this.importacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarImportacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralImportaciones();
					
					ImportacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarImportacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImportaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImportaciones.jComboBoxTiposAccionesFormularioImportaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessImportaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesImportacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessImportaciones();
			
			if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
			Importaciones importaciones=new Importaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingImportaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesImportaciones.getSelectedItem();
			
			
			
			
			importacionessSeleccionados=this.getImportacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(importacionessSeleccionados.size()==1) {
				for(Importaciones importacionesAux:importacionessSeleccionados) {
					importaciones=importacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessImportaciones();
			
      		//this.finishProcessImportaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarImportacionesReturnGeneral() throws Exception {
		if(this.importacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.importacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.importacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.importacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.importacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.importacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingImportaciones(false);
		}
		
		if(this.importacionesReturnGeneral.getConRetornoLista() || this.importacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.importacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.importacionesLogic.setImportacioness(this.importacionesReturnGeneral.getImportacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.importacionesReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.importacionesLogic.setImportaciones(this.importacionesReturnGeneral.getImportaciones());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingImportaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralImportaciones() throws Exception {
		
		
	}
	
	public ArrayList<Importaciones> getImportacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioImportaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Importaciones importacionesAux:importacionesLogic.getImportacioness()) {
					if(importacionesAux.getIsSelected()) {
						importacionessSeleccionados.add(importacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Importaciones importacionesAux:this.importacioness) {
					if(importacionesAux.getIsSelected()) {
						importacionessSeleccionados.add(importacionesAux);				
					}
				}
			}
			
			if(importacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						importacionessSeleccionados.addAll(this.importacionesLogic.getImportacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						importacionessSeleccionados.addAll(this.importacioness);				
					}
				}
			}
		} else {
			importacionessSeleccionados.add(this.importaciones);
		}
		
		return importacionessSeleccionados;
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
	
	public void generarReporteImportacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalImportacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoImportacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImportacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImportacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Importaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteImportacioness("Todos",importacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteImportacioness("Todos",importacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionImportacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteImportacioness("Todos",importacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoImportaciones();
		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoImportaciones();
		
		
		//this.generarReporteImportacioness("Todos",importacionessSeleccionados ,importacionesImplementable,importacionesImplementableHome);
	}
	
	public void mostrarImportacionImportacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionImportaciones();
		
		this.abrirFrameImportacionImportaciones();		
		
			
		//this.generarReporteImportacioness("Todos",importacionessSeleccionados ,importacionesImplementable,importacionesImplementableHome);
	}
	
	public void importarImportacioness() throws Exception {		
	
	}
	
	public void exportarImportacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelImportacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoImportacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlImportacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Importaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarImportaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Importaciones importacionesAux:importacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarImportaciones(importacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//importacionesAux.setsDetalleGeneralEntityReporte(importacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarImportaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ImportacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImportacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImportacionesConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarImportaciones(Importaciones importaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=importaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=importaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=importaciones.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Importacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelImportaciones(row);				
				iRow++;
			}				
			
			for(Importaciones importacionesAux:importacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelImportaciones(importacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlImportacionessSeleccionados() throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();		
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"importaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("importacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("importaciones");
			//elementRoot.appendChild(element);
		
			for(Importaciones importacionesAux:importacionessSeleccionados) {
				element = document.createElement("importaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlImportaciones(importacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Importaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelImportaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ImportacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ImportacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ImportacionesConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelImportaciones(Importaciones importaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(importaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(importaciones.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlImportaciones(Importaciones importaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ImportacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(importaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ImportacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(importaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ImportacionesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(importaciones.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoImportacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Importaciones> importacionessSeleccionados=new ArrayList<Importaciones>();
		
		importacionessSeleccionados=this.getImportacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoImportaciones(importacionessSeleccionados);
		
		this.generarReporteImportacioness("Todos",importacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoImportaciones(ArrayList<Importaciones> importacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Importaciones importacionesAux:importacionessSeleccionados) {
				importacionesAux.setsDetalleGeneralEntityReporte(importacionesAux.toString());
			
				if(sTipoSeleccionar.equals(ImportacionesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					importacionesAux.setsDescripcionGeneralEntityReporte1(importacionesAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImportacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesImportaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoImportaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesImportaciones=true;
				this.isVisibilidadCeldaGuardarCambiosImportaciones=true;
			}
			
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=true;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=true;
			this.isVisibilidadCeldaEliminarImportaciones=true;
			this.isVisibilidadCeldaCancelarImportaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=true;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoImportaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=true;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=true;
			this.isVisibilidadCeldaModificarImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
			this.isVisibilidadCeldaModificarImportaciones=true;
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
			this.isVisibilidadCeldaCancelarImportaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarImportaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ImportacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoImportaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=true;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=true;
		} else {
			this.actualizarEstadoPanelsImportaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarImportaciones=false;
			//this.isVisibilidadCeldaVerFormImportaciones=false;
			this.isVisibilidadCeldaDuplicarImportaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!importacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoImportaciones=false;
			this.isVisibilidadCeldaGuardarCambiosImportaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(importacionesSessionBean.getEsGuardarRelacionado()) {
			if(!importacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;												
			}
			
			this.jButtonCerrarImportaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesImportaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.importaciones)) {
			this.isVisibilidadCeldaActualizarImportaciones=false;
			this.isVisibilidadCeldaEliminarImportaciones=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesImportaciones() {
	}
	
	public void actualizarEstadoPanelsImportaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionImportaciones!=null) {
				this.jScrollPanelDatosEdicionImportaciones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosImportaciones!=null) {
				this.jScrollPanelDatosImportaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionImportaciones!=null) {
				this.jPanelPaginacionImportaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImportaciones!=null) {
				this.jPanelParametrosReportesImportaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.importacionesSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.importacionesSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ImportacionesSessionBean importacionesSessionBean=new ImportacionesSessionBean();
		
		if(this.importacionesSessionBean==null) {
			this.importacionesSessionBean=new ImportacionesSessionBean();
		}
		
		this.importacionesSessionBean.setsUltimaBusquedaImportaciones(this.getsAccionBusqueda());
		this.importacionesSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.importacionesSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ImportacionesSessionBean importacionesSessionBean=new ImportacionesSessionBean();
		
		if(this.importacionesSessionBean==null) {
			this.importacionesSessionBean=new ImportacionesSessionBean();
		}
		
		if(this.importacionesSessionBean.getsUltimaBusquedaImportaciones()!=null&&!this.importacionesSessionBean.getsUltimaBusquedaImportaciones().equals("")) {
			this.setsAccionBusqueda(importacionesSessionBean.getsUltimaBusquedaImportaciones());
			this.setiNumeroPaginacion(importacionesSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(importacionesSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.importacionesSessionBean.setsUltimaBusquedaImportaciones("");
		this.importacionesSessionBean.setiNumeroPaginacion(ImportacionesConstantesFunciones.INUMEROPAGINACION);
		this.importacionesSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaImportaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioImportaciones() {
		this.updateBorderResaltarBusquedasFormularioImportaciones();
		this.updateVisibilidadBusquedasFormularioImportaciones();
		this.updateHabilitarBusquedasFormularioImportaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioImportaciones() {					
	}
	
	public void updateVisibilidadBusquedasFormularioImportaciones() {
	}
	
	public void updateHabilitarBusquedasFormularioImportaciones() {
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
	
	public void updateControlesFormularioImportaciones() throws Exception {

		if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioImportaciones();
		this.updateVisibilidadResaltarControlesFormularioImportaciones();
		this.updateHabilitarResaltarControlesFormularioImportaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioImportaciones() throws Exception {
		if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.importacionesConstantesFunciones.resaltaridImportaciones!=null && this.jInternalFrameDetalleFormImportaciones!=null) {this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setBorder(this.importacionesConstantesFunciones.resaltaridImportaciones);}
		if(this.importacionesConstantesFunciones.resaltarcodigoImportaciones!=null && this.jInternalFrameDetalleFormImportaciones!=null) {this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setBorder(this.importacionesConstantesFunciones.resaltarcodigoImportaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioImportaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
	
		//this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setVisible(this.importacionesConstantesFunciones.mostraridImportaciones);
		this.jInternalFrameDetalleFormImportaciones.jPanelidImportaciones.setVisible(this.importacionesConstantesFunciones.mostraridImportaciones);
		//this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setVisible(this.importacionesConstantesFunciones.mostrarcodigoImportaciones);
		this.jInternalFrameDetalleFormImportaciones.jPanelcodigoImportaciones.setVisible(this.importacionesConstantesFunciones.mostrarcodigoImportaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioImportaciones() throws Exception {
		if(this.jInternalFrameDetalleFormImportaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImportaciones!=null) {
	
		this.jInternalFrameDetalleFormImportaciones.jLabelidImportaciones.setEnabled(this.importacionesConstantesFunciones.activaridImportaciones);
		this.jInternalFrameDetalleFormImportaciones.jTextFieldcodigoImportaciones.setEnabled(this.importacionesConstantesFunciones.activarcodigoImportaciones);
		}
	}
	
		
}