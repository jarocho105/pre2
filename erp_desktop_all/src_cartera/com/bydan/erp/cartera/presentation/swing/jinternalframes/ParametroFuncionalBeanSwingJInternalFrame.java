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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.ParametroFuncionalConstantesFunciones;
import com.bydan.erp.cartera.util.ParametroFuncionalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ParametroFuncionalParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ParametroFuncionalBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class ParametroFuncionalBeanSwingJInternalFrame extends ParametroFuncionalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroFuncionalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroFuncional> parametrofuncionalValidator = new ClassValidator<ParametroFuncional>(ParametroFuncional.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroFuncional parametrofuncional;	
	public ParametroFuncional parametrofuncionalAux;
	public ParametroFuncional parametrofuncionalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroFuncional parametrofuncionalTotales;
	public Long idParametroFuncionalActual;
	public Long iIdNuevoParametroFuncional=0L;
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
	
	public Boolean isPermisoTodoParametroFuncional;
	public Boolean isPermisoNuevoParametroFuncional;
	public Boolean isPermisoActualizarParametroFuncional;
	public Boolean isPermisoActualizarOriginalParametroFuncional;
	public Boolean isPermisoEliminarParametroFuncional;
	public Boolean isPermisoGuardarCambiosParametroFuncional;
	public Boolean isPermisoConsultaParametroFuncional;
	public Boolean isPermisoBusquedaParametroFuncional;
	public Boolean isPermisoReporteParametroFuncional;
	public Boolean isPermisoPaginacionMedioParametroFuncional;
	public Boolean isPermisoPaginacionAltoParametroFuncional;
	public Boolean isPermisoPaginacionTodoParametroFuncional;
	public Boolean isPermisoCopiarParametroFuncional;
	public Boolean isPermisoVerFormParametroFuncional;
	public Boolean isPermisoDuplicarParametroFuncional;
	public Boolean isPermisoOrdenParametroFuncional;
	
	
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
	
	public ParametroFuncionalParameterReturnGeneral parametrofuncionalReturnGeneral;
	public ParametroFuncionalParameterReturnGeneral parametrofuncionalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroFuncional=false;
	public Boolean esParaAccionDesdeFormularioParametroFuncional=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroFuncionalSessionBeanAdditional parametrofuncionalSessionBeanAdditional=null;
	
	public ParametroFuncionalSessionBeanAdditional getParametroFuncionalSessionBeanAdditional() {
		return this.parametrofuncionalSessionBeanAdditional;
	}
	
	public void setParametroFuncionalSessionBeanAdditional(ParametroFuncionalSessionBeanAdditional parametrofuncionalSessionBeanAdditional) {
		try {
			this.parametrofuncionalSessionBeanAdditional=parametrofuncionalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroFuncionalBeanSwingJInternalFrameAdditional parametrofuncionalBeanSwingJInternalFrameAdditional=null;
	//public class ParametroFuncionalBeanSwingJInternalFrame
	
	public ParametroFuncionalBeanSwingJInternalFrameAdditional getParametroFuncionalBeanSwingJInternalFrameAdditional() {
		return this.parametrofuncionalBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroFuncionalBeanSwingJInternalFrameAdditional(ParametroFuncionalBeanSwingJInternalFrameAdditional parametrofuncionalBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrofuncionalBeanSwingJInternalFrameAdditional=parametrofuncionalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroFuncionalLogic parametrofuncionalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroFuncional parametrofuncionalBean;
	public ParametroFuncionalConstantesFunciones parametrofuncionalConstantesFunciones;
	//public ParametroFuncionalParameterReturnGeneral parametrofuncionalReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ParametroFuncional> parametrofuncionals;	
	//public List<ParametroFuncional> parametrofuncionalsEliminados;
	//public List<ParametroFuncional> parametrofuncionalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroFuncional=false;
	public Boolean isVisibilidadCeldaDuplicarParametroFuncional=true;
	public Boolean isVisibilidadCeldaCopiarParametroFuncional=true;
	public Boolean isVisibilidadCeldaVerFormParametroFuncional=true;
	public Boolean isVisibilidadCeldaOrdenParametroFuncional=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
	public Boolean isVisibilidadCeldaModificarParametroFuncional=false;
	public Boolean isVisibilidadCeldaActualizarParametroFuncional=false;
	public Boolean isVisibilidadCeldaEliminarParametroFuncional=false;
	public Boolean isVisibilidadCeldaCancelarParametroFuncional=false;
	public Boolean isVisibilidadCeldaGuardarParametroFuncional=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroFuncional=false;	
	
	
	
	public Long getiIdNuevoParametroFuncional() {
		return this.iIdNuevoParametroFuncional;
	}

	public void setiIdNuevoParametroFuncional(Long iIdNuevoParametroFuncional) {
		this.iIdNuevoParametroFuncional = iIdNuevoParametroFuncional;
	}
	
	public Long getidParametroFuncionalActual() {
		return this.idParametroFuncionalActual;
	}

	public void setidParametroFuncionalActual(Long idParametroFuncionalActual) {
		this.idParametroFuncionalActual = idParametroFuncionalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroFuncional getparametrofuncional() {
		return this.parametrofuncional;
	}

	public void setparametrofuncional(ParametroFuncional parametrofuncional) {
		this.parametrofuncional = parametrofuncional;
	}
	
	public ParametroFuncional getparametrofuncionalAux() {
		return this.parametrofuncionalAux;
	}

	public void setparametrofuncionalAux(ParametroFuncional parametrofuncionalAux) {
		this.parametrofuncionalAux = parametrofuncionalAux;
	}				
	
	public ParametroFuncional getparametrofuncionalAnterior() {
		return this.parametrofuncionalAnterior;
	}

	public void setparametrofuncionalAnterior(ParametroFuncional parametrofuncionalAnterior) {
		this.parametrofuncionalAnterior = parametrofuncionalAnterior;
	}	
	
	public ParametroFuncional getparametrofuncionalTotales() {
		return this.parametrofuncionalTotales;
	}

	public void setparametrofuncionalTotales(ParametroFuncional parametrofuncionalTotales) {
		this.parametrofuncionalTotales = parametrofuncionalTotales;
	}	
	
	public ParametroFuncional getparametrofuncionalBean() {
		return this.parametrofuncionalBean;
	}

	public void setparametrofuncionalBean(ParametroFuncional parametrofuncionalBean) {
		this.parametrofuncionalBean = parametrofuncionalBean;
	}	
	
	public ParametroFuncionalParameterReturnGeneral getparametrofuncionalReturnGeneral() {
		return this.parametrofuncionalReturnGeneral;
	}

	public void setparametrofuncionalReturnGeneral(ParametroFuncionalParameterReturnGeneral parametrofuncionalReturnGeneral) {
		this.parametrofuncionalReturnGeneral = parametrofuncionalReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroFuncionalLogic getParametroFuncionalLogic()	{		
		return parametrofuncionalLogic;
	}

	public void setParametroFuncionalLogic(ParametroFuncionalLogic parametrofuncionalLogic) {
		this.parametrofuncionalLogic = parametrofuncionalLogic;
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
	
	public Boolean getIsEsNuevoParametroFuncional() {
		return isEsNuevoParametroFuncional;
	}

	public void setIsEsNuevoParametroFuncional(Boolean isEsNuevoParametroFuncional) {
		this.isEsNuevoParametroFuncional = isEsNuevoParametroFuncional;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroFuncional() {
		return esParaAccionDesdeFormularioParametroFuncional;
	}
	
	public void setEsParaAccionDesdeFormularioParametroFuncional(Boolean esParaAccionDesdeFormularioParametroFuncional) {
		this.esParaAccionDesdeFormularioParametroFuncional = esParaAccionDesdeFormularioParametroFuncional;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesParametroFuncional() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroFuncionalConstantesFunciones.refrescarForeignKeysDescripcionesParametroFuncional(this.parametrofuncionalLogic.getParametroFuncionals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroFuncionalConstantesFunciones.refrescarForeignKeysDescripcionesParametroFuncional(this.parametrofuncionals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrofuncionalLogic.setParametroFuncionals(this.parametrofuncionals);
			parametrofuncionalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroFuncionalParameterReturnGeneral getParametroFuncionalParameterGeneral() {
		return this.parametrofuncionalParameterGeneral;
	}
	
	public void setParametroFuncionalParameterGeneral(ParametroFuncionalParameterReturnGeneral parametrofuncionalParameterGeneral) {
		this.parametrofuncionalParameterGeneral = parametrofuncionalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroFuncional() {
		return isPermisoTodoParametroFuncional;
	}

	public void setIsPermisoTodoParametroFuncional(Boolean isPermisoTodoParametroFuncional) {
		this.isPermisoTodoParametroFuncional = isPermisoTodoParametroFuncional;
	}

	public Boolean getIsPermisoNuevoParametroFuncional() {
		return isPermisoNuevoParametroFuncional;
	}

	public void setIsPermisoNuevoParametroFuncional(Boolean isPermisoNuevoParametroFuncional) {
		this.isPermisoNuevoParametroFuncional = isPermisoNuevoParametroFuncional;
	}

	public Boolean getIsPermisoActualizarParametroFuncional() {
		return isPermisoActualizarParametroFuncional;
	}

	public void setIsPermisoActualizarParametroFuncional(Boolean isPermisoActualizarParametroFuncional) {
		this.isPermisoActualizarParametroFuncional = isPermisoActualizarParametroFuncional;
	}

	public Boolean getIsPermisoEliminarParametroFuncional() {
		return isPermisoEliminarParametroFuncional;
	}

	public void setIsPermisoEliminarParametroFuncional(Boolean isPermisoEliminarParametroFuncional) {
		this.isPermisoEliminarParametroFuncional = isPermisoEliminarParametroFuncional;
	}

	public Boolean getIsPermisoGuardarCambiosParametroFuncional() {
		return isPermisoGuardarCambiosParametroFuncional;
	}

	public void setIsPermisoGuardarCambiosParametroFuncional(Boolean isPermisoGuardarCambiosParametroFuncional) {
		this.isPermisoGuardarCambiosParametroFuncional = isPermisoGuardarCambiosParametroFuncional;
	}
	
	public Boolean getIsPermisoConsultaParametroFuncional() {
		return isPermisoConsultaParametroFuncional;
	}

	public void setIsPermisoConsultaParametroFuncional(Boolean isPermisoConsultaParametroFuncional) {
		this.isPermisoConsultaParametroFuncional = isPermisoConsultaParametroFuncional;
	}

	public Boolean getIsPermisoBusquedaParametroFuncional() {
		return isPermisoBusquedaParametroFuncional;
	}

	public void setIsPermisoBusquedaParametroFuncional(Boolean isPermisoBusquedaParametroFuncional) {
		this.isPermisoBusquedaParametroFuncional = isPermisoBusquedaParametroFuncional;
	}

	public Boolean getIsPermisoReporteParametroFuncional() {
		return isPermisoReporteParametroFuncional;
	}

	public void setIsPermisoReporteParametroFuncional(Boolean isPermisoReporteParametroFuncional) {
		this.isPermisoReporteParametroFuncional = isPermisoReporteParametroFuncional;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroFuncional() {
		return isPermisoPaginacionMedioParametroFuncional;
	}

	public void setIsPermisoPaginacionMedioParametroFuncional(Boolean isPermisoPaginacionMedioParametroFuncional) {
		this.isPermisoPaginacionMedioParametroFuncional = isPermisoPaginacionMedioParametroFuncional;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroFuncional() {
		return isPermisoPaginacionTodoParametroFuncional;
	}

	public void setIsPermisoPaginacionTodoParametroFuncional(Boolean isPermisoPaginacionTodoParametroFuncional) {
		this.isPermisoPaginacionTodoParametroFuncional = isPermisoPaginacionTodoParametroFuncional;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroFuncional() {
		return isPermisoPaginacionAltoParametroFuncional;
	}

	public void setIsPermisoPaginacionAltoParametroFuncional(Boolean isPermisoPaginacionAltoParametroFuncional) {
		this.isPermisoPaginacionAltoParametroFuncional = isPermisoPaginacionAltoParametroFuncional;
	}
	
	public Boolean getIsPermisoCopiarParametroFuncional() {
		return isPermisoCopiarParametroFuncional;
	}

	public void setIsPermisoCopiarParametroFuncional(Boolean isPermisoCopiarParametroFuncional) {
		this.isPermisoCopiarParametroFuncional = isPermisoCopiarParametroFuncional;
	}
	
	public Boolean getIsPermisoVerFormParametroFuncional() {
		return isPermisoVerFormParametroFuncional;
	}

	public void setIsPermisoVerFormParametroFuncional(Boolean isPermisoVerFormParametroFuncional) {
		this.isPermisoVerFormParametroFuncional = isPermisoVerFormParametroFuncional;
	}
	
	public Boolean getIsPermisoDuplicarParametroFuncional() {
		return isPermisoDuplicarParametroFuncional;
	}

	public void setIsPermisoDuplicarParametroFuncional(Boolean isPermisoDuplicarParametroFuncional) {
		this.isPermisoDuplicarParametroFuncional = isPermisoDuplicarParametroFuncional;
	}
	
	public Boolean getIsPermisoOrdenParametroFuncional() {
		return isPermisoOrdenParametroFuncional;
	}

	public void setIsPermisoOrdenParametroFuncional(Boolean isPermisoOrdenParametroFuncional) {
		this.isPermisoOrdenParametroFuncional = isPermisoOrdenParametroFuncional;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroFuncional() {
		return isVisibilidadCeldaNuevoParametroFuncional;
	}

	public void setIsVisibilidadCeldaNuevoParametroFuncional(Boolean isVisibilidadCeldaNuevoParametroFuncional) {
		this.isVisibilidadCeldaNuevoParametroFuncional = isVisibilidadCeldaNuevoParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroFuncional() {
		return isVisibilidadCeldaDuplicarParametroFuncional;
	}

	public void setIsVisibilidadCeldaDuplicarParametroFuncional(Boolean isVisibilidadCeldaDuplicarParametroFuncional) {
		this.isVisibilidadCeldaDuplicarParametroFuncional = isVisibilidadCeldaDuplicarParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroFuncional() {
		return isVisibilidadCeldaCopiarParametroFuncional;
	}

	public void setIsVisibilidadCeldaCopiarParametroFuncional(Boolean isVisibilidadCeldaCopiarParametroFuncional) {
		this.isVisibilidadCeldaCopiarParametroFuncional = isVisibilidadCeldaCopiarParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroFuncional() {
		return isVisibilidadCeldaVerFormParametroFuncional;
	}

	public void setIsVisibilidadCeldaVerFormParametroFuncional(Boolean isVisibilidadCeldaVerFormParametroFuncional) {
		this.isVisibilidadCeldaVerFormParametroFuncional = isVisibilidadCeldaVerFormParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroFuncional() {
		return isVisibilidadCeldaOrdenParametroFuncional;
	}

	public void setIsVisibilidadCeldaOrdenParametroFuncional(Boolean isVisibilidadCeldaOrdenParametroFuncional) {
		this.isVisibilidadCeldaOrdenParametroFuncional = isVisibilidadCeldaOrdenParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroFuncional() {
		return isVisibilidadCeldaNuevoRelacionesParametroFuncional;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroFuncional(Boolean isVisibilidadCeldaNuevoRelacionesParametroFuncional) {
		this.isVisibilidadCeldaNuevoRelacionesParametroFuncional = isVisibilidadCeldaNuevoRelacionesParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroFuncional() {
		return isVisibilidadCeldaModificarParametroFuncional;
	}

	public void setIsVisibilidadCeldaModificarParametroFuncional(Boolean isVisibilidadCeldaModificarParametroFuncional) {
		this.isVisibilidadCeldaModificarParametroFuncional = isVisibilidadCeldaModificarParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroFuncional() {
		return isVisibilidadCeldaActualizarParametroFuncional;
	}

	public void setIsVisibilidadCeldaActualizarParametroFuncional(Boolean isVisibilidadCeldaActualizarParametroFuncional) {
		this.isVisibilidadCeldaActualizarParametroFuncional = isVisibilidadCeldaActualizarParametroFuncional;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroFuncional() {
		return isVisibilidadCeldaEliminarParametroFuncional;
	}

	public void setIsVisibilidadCeldaEliminarParametroFuncional(Boolean isVisibilidadCeldaEliminarParametroFuncional) {
		this.isVisibilidadCeldaEliminarParametroFuncional = isVisibilidadCeldaEliminarParametroFuncional;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroFuncional() {
		return isVisibilidadCeldaCancelarParametroFuncional;
	}

	public void setIsVisibilidadCeldaCancelarParametroFuncional(Boolean isVisibilidadCeldaCancelarParametroFuncional) {
		this.isVisibilidadCeldaCancelarParametroFuncional = isVisibilidadCeldaCancelarParametroFuncional;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroFuncional() {
		return isVisibilidadCeldaGuardarParametroFuncional;
	}

	public void setIsVisibilidadCeldaGuardarParametroFuncional(Boolean isVisibilidadCeldaGuardarParametroFuncional) {
		this.isVisibilidadCeldaGuardarParametroFuncional = isVisibilidadCeldaGuardarParametroFuncional;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroFuncional() {
		return isVisibilidadCeldaGuardarCambiosParametroFuncional;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroFuncional(Boolean isVisibilidadCeldaGuardarCambiosParametroFuncional) {
		this.isVisibilidadCeldaGuardarCambiosParametroFuncional = isVisibilidadCeldaGuardarCambiosParametroFuncional;
	}
		
	public ParametroFuncionalSessionBean getparametrofuncionalSessionBean() {
		return this.parametrofuncionalSessionBean;
	}
	
	public void setparametrofuncionalSessionBean(ParametroFuncionalSessionBean parametrofuncionalSessionBean) {
		this.parametrofuncionalSessionBean=parametrofuncionalSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(ParametroFuncional parametrofuncional)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ParametroFuncional parametrofuncional,ParametroFuncional parametrofuncionalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroFuncional(parametrofuncional);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrofuncionalAux.setId(parametrofuncional.getId());
		parametrofuncionalAux.setVersionRow(parametrofuncional.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroFuncional();
		
			int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrofuncionalValidator.getInvalidValues(this.parametrofuncional);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrofuncionalLogic.setDatosCliente(datosCliente);
			parametrofuncionalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrofuncionalAux=new  ParametroFuncional();
				
				parametrofuncionalAux.setIsNew(true);
				parametrofuncionalAux.setIsChanged(true);
				
				parametrofuncionalAux.setParametroFuncionalOriginal(this.parametrofuncional);
				
				parametrofuncionalAux.setId(this.parametrofuncional.getId());	
				parametrofuncionalAux.setVersionRow(this.parametrofuncional.getVersionRow());	
				parametrofuncionalAux.setcon_copia_clientes(this.parametrofuncional.getcon_copia_clientes());	
				parametrofuncionalAux.setcon_copia_proveedor(this.parametrofuncional.getcon_copia_proveedor());	
				parametrofuncionalAux.setcon_proveedor_cliente(this.parametrofuncional.getcon_proveedor_cliente());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofuncionalAux,parametrofuncionals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofuncionalLogic.saveParametroFuncionals();//WithConnection
						//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofuncionalLogic.saveParametroFuncionalRelaciones(parametrofuncionalAux);//WithConnection
								//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrofuncionalAux,parametrofuncionals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrofuncionalAux=new  ParametroFuncional();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrofuncionalSessionBean.getEsGuardarRelacionado() && this.parametrofuncional.getId()>=0)) {
						
					parametrofuncionalAux.setIsNew(false);
				}
				
				parametrofuncionalAux.setIsDeleted(false);
			
				parametrofuncionalAux.setId(this.parametrofuncional.getId());	
				parametrofuncionalAux.setVersionRow(this.parametrofuncional.getVersionRow());	
				parametrofuncionalAux.setcon_copia_clientes(this.parametrofuncional.getcon_copia_clientes());	
				parametrofuncionalAux.setcon_copia_proveedor(this.parametrofuncional.getcon_copia_proveedor());	
				parametrofuncionalAux.setcon_proveedor_cliente(this.parametrofuncional.getcon_proveedor_cliente());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofuncionalAux,parametrofuncionals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofuncionalLogic.saveParametroFuncionals();//WithConnection
						//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofuncionalLogic.saveParametroFuncionalRelaciones(parametrofuncionalAux);//WithConnection
								//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrofuncionalAux,parametrofuncionals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrofuncional,parametrofuncionalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrofuncionalAux=new  ParametroFuncional();
				
				parametrofuncionalAux.setIsNew(false);
				parametrofuncionalAux.setIsChanged(false);
				
				parametrofuncionalAux.setIsDeleted(true);
				
				parametrofuncionalAux.setId(this.parametrofuncional.getId());	
				parametrofuncionalAux.setVersionRow(this.parametrofuncional.getVersionRow());	
				parametrofuncionalAux.setcon_copia_clientes(this.parametrofuncional.getcon_copia_clientes());	
				parametrofuncionalAux.setcon_copia_proveedor(this.parametrofuncional.getcon_copia_proveedor());	
				parametrofuncionalAux.setcon_proveedor_cliente(this.parametrofuncional.getcon_proveedor_cliente());	
				
				if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrofuncionalAux.getId()>=0) {	
						this.parametrofuncionalsEliminados.add(parametrofuncionalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofuncionalAux,parametrofuncionals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofuncionalLogic.saveParametroFuncionals();//WithConnection
						//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofuncionalLogic.saveParametroFuncionalRelaciones(parametrofuncionalAux);//WithConnection
								//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
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
							if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrofuncionalAux,parametrofuncionalLogic.getParametroFuncionals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrofuncionalAux,parametrofuncionals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.getParametroFuncionals().addAll(this.parametrofuncionalsEliminados);
					
					parametrofuncionalLogic.saveParametroFuncionals();//WithConnection
					//parametrofuncionalLogic.getSetVersionRowParametroFuncionals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.parametrofuncionalsEliminados= new ArrayList<ParametroFuncional>();		
			}
			
			if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Funcional GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrofuncional=parametrofuncionalAux;
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
      		//this.finishProcessParametroFuncional();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroFuncional parametrofuncionalLocal) throws Exception {
		
		if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroFuncional parametrofuncionalLocal) throws Exception {	
		if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarParametroFuncionalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrofuncionalValidator.getInvalidValues(this.parametrofuncional);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroFuncional parametrofuncional,List<ParametroFuncional> parametrofuncionals) throws Exception {
		try	{		
			ParametroFuncionalConstantesFunciones.actualizarLista(parametrofuncional,parametrofuncionals,this.parametrofuncionalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroFuncional parametrofuncional,List<ParametroFuncional> parametrofuncionals) throws Exception {
		try	{			
			ParametroFuncionalConstantesFunciones.actualizarSelectedLista(parametrofuncional,parametrofuncionals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroFuncional> parametrofuncionalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrofuncionalsLocal=this.parametrofuncionalLogic.getParametroFuncionals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrofuncionalsLocal=this.parametrofuncionals;
			}
			//ARCHITECTURE
		
			for(ParametroFuncional parametrofuncionalLocal:parametrofuncionalsLocal) {
				if(this.permiteMantenimiento(parametrofuncionalLocal) && parametrofuncionalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroFuncionalConstantesFunciones.getParametroFuncionalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroFuncionalConstantesFunciones.CONCOPIACLIENTES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_clientesParametroFuncional,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroFuncionalConstantesFunciones.CONCOPIAPROVEEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_proveedorParametroFuncional,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroFuncionalConstantesFunciones.CONPROVEEDORCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_proveedor_clienteParametroFuncional,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_clientesParametroFuncional,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_proveedorParametroFuncional,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_proveedor_clienteParametroFuncional,"");
		
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
		this.iIdNuevoParametroFuncional--;	
		
		
		this.parametrofuncionalAux=new ParametroFuncional();
		
		this.parametrofuncionalAux.setId(this.iIdNuevoParametroFuncional);
		this.parametrofuncionalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrofuncionalLogic.getParametroFuncionals().add(this.parametrofuncionalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrofuncionals.add(this.parametrofuncionalAux);
		}
		//ARCHITECTURE
		
		this.parametrofuncional=this.parametrofuncionalAux;
		
		if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroFuncional(this.parametrofuncional);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroFuncional(this.parametrofuncional);
		}
				
		//this.setDefaultControlesParametroFuncional();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroFuncional();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroFuncional();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFuncional();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroFuncional(this.parametrofuncionalBean,this.parametrofuncional,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroFuncionalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
			classes=ParametroFuncionalConstantesFunciones.getClassesRelationshipsOfParametroFuncional(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrofuncionalReturnGeneral=parametrofuncionalLogic.procesarEventosParametroFuncionalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofuncionalLogic.getParametroFuncionals(),this.parametrofuncional,this.parametrofuncionalParameterGeneral,this.isEsNuevoParametroFuncional,classes);//this.parametrofuncionalLogic.getParametroFuncional()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroFuncional(this.parametrofuncionalReturnGeneral,this.parametrofuncionalBean,false);
		
		if(this.parametrofuncionalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional());
		}
		
		if(this.parametrofuncionalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional(),classes);//this.parametrofuncionalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroFuncional();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroFuncional();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.RecargarFormParametroFuncional(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroFuncional(false);
						
			if(parametrofuncionalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFuncional();
			}
			
			this.actualizarVisualTableDatosParametroFuncional();
			
			this.jTableDatosParametroFuncional.setRowSelectionInterval(this.getIndiceNuevoParametroFuncional(), this.getIndiceNuevoParametroFuncional());
			
			this.seleccionarFilaTablaParametroFuncionalActual();
						
			this.actualizarEstadoCeldasBotonesParametroFuncional("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroFuncional(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setEnabled(isHabilitar && this.parametrofuncionalConstantesFunciones.activarcon_copia_clientesParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setEnabled(isHabilitar && this.parametrofuncionalConstantesFunciones.activarcon_copia_proveedorParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setEnabled(isHabilitar && this.parametrofuncionalConstantesFunciones.activarcon_proveedor_clienteParametroFuncional);	
		
	};
	
	public void setDefaultControlesParametroFuncional() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroFuncional(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrofuncionalSessionBean.setConGuardarRelaciones(true);			
			this.parametrofuncionalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.setVisible(true);
			
					
		} else {
			//this.parametrofuncionalSessionBean.setConGuardarRelaciones(false);			
			this.parametrofuncionalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroFuncional() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
				if(parametrofuncionalAux.getId().equals(this.iIdNuevoParametroFuncional)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionals) {
				if(parametrofuncionalAux.getId().equals(this.iIdNuevoParametroFuncional)) {
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
	
	public int getIndiceActualParametroFuncional(ParametroFuncional parametrofuncional,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
				if(parametrofuncionalAux.getId().equals(parametrofuncional.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionals) {
				if(parametrofuncionalAux.getId().equals(parametrofuncional.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroFuncional(ParametroFuncional parametrofuncionalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
				if(parametrofuncionalAux.getParametroFuncionalOriginal().getId().equals(parametrofuncionalOriginal.getId())) {
					existe=true;
					parametrofuncionalOriginal.setId(parametrofuncionalAux.getId());
					parametrofuncionalOriginal.setVersionRow(parametrofuncionalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionals) {
				if(parametrofuncionalAux.getParametroFuncionalOriginal().getId().equals(parametrofuncionalOriginal.getId())) {
					existe=true;
					parametrofuncionalOriginal.setId(parametrofuncionalAux.getId());
					parametrofuncionalOriginal.setVersionRow(parametrofuncionalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroFuncional(Boolean esParaCancelar) throws Exception {
		parametrofuncionalsAux=new ArrayList<ParametroFuncional>();
		parametrofuncionalAux=new ParametroFuncional();
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
					if(parametrofuncionalAux.getId()<0) {
						parametrofuncionalsAux.add(parametrofuncionalAux);
					}		
				}
				this.iIdNuevoParametroFuncional=0L;
				this.parametrofuncionalLogic.getParametroFuncionals().removeAll(parametrofuncionalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionals) {
					if(parametrofuncionalAux.getId()<0) {
						parametrofuncionalsAux.add(parametrofuncionalAux);
					}		
				}
				this.iIdNuevoParametroFuncional=0L;
				this.parametrofuncionals.removeAll(parametrofuncionalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroFuncional 
					&& this.parametrofuncionalLogic.getParametroFuncionals().size()>0
					) {
					parametrofuncionalAux=this.parametrofuncionalLogic.getParametroFuncionals().get(this.parametrofuncionalLogic.getParametroFuncionals().size() - 1);
				
					if(parametrofuncionalAux.getId()<0) {
						this.parametrofuncionalLogic.getParametroFuncionals().remove(parametrofuncionalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroFuncional && this.parametrofuncionals.size()>0) {
					parametrofuncionalAux=this.parametrofuncionals.get(this.parametrofuncionals.size() - 1);
				
					if(parametrofuncionalAux.getId()<0) {
						this.parametrofuncionals.remove(parametrofuncionalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroFuncional(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrofuncional.getId()<0) {
				this.parametrofuncionalLogic.getParametroFuncionals().remove(this.parametrofuncional);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrofuncional.getId()<0) {
				this.parametrofuncionals.remove(this.parametrofuncional);
			}
		}			
	}
	
	public void setEstadosInicialesParametroFuncional(List<ParametroFuncional> parametrofuncionalsAux) throws Exception {
		ParametroFuncionalConstantesFunciones.setEstadosInicialesParametroFuncional(parametrofuncionalsAux);
	}
	
	public void setEstadosInicialesParametroFuncional(ParametroFuncional parametrofuncionalAux) throws Exception {
		ParametroFuncionalConstantesFunciones.setEstadosInicialesParametroFuncional(parametrofuncionalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroFuncionalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroFuncionalActual()) {
				if(!this.isEsNuevoParametroFuncional) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroFuncional=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroFuncionalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Funcional ?", "MANTENIMIENTO DE Parametro Funcional", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroFuncional parametrofuncional) throws Exception {
		ParametroFuncionalConstantesFunciones.seleccionarAsignar(this.parametrofuncional,parametrofuncional);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroFuncional=this.isPermisoActualizarOriginalParametroFuncional;
			
			
			this.seleccionarAsignar(parametrofuncional);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroFuncionalConstantesFunciones.quitarEspaciosParametroFuncional(this.parametrofuncional,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroFuncional("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrofuncionalSessionBean.setsFuncionBusquedaRapida(this.parametrofuncionalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroFuncional) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroFuncional(esParaCancelar);				
				this.cancelarNuevoParametroFuncional(esParaCancelar);								
			}
			
			this.parametrofuncional=new ParametroFuncional();
			
			this.inicializarParametroFuncional();
			
			this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroFuncional() throws Exception {
		try {
			ParametroFuncionalConstantesFunciones.inicializarParametroFuncional(this.parametrofuncional);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrofuncionalLogic.getParametroFuncionals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroFuncionals(String sAccionBusqueda,List<ParametroFuncional> parametrofuncionalsParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroFuncional"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroFuncionalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroFuncionalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroFuncional"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Funcionales");		
		parameters.put("busquedapor", ParametroFuncionalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroFuncional=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroFuncionalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroFuncionalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroFuncional=new JRBeanArrayDataSource(ParametroFuncionalJInternalFrame.TraerParametroFuncionalBeans(parametrofuncionalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroFuncional);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroFuncionalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroFuncionalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroFuncionalBean.TraerParametroFuncionalBeans(parametrofuncionalsParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroFuncionalActionPerformed(null);
					//this.generarExcelReporteParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroFuncionals(sAccionBusqueda,sTipoArchivoReporte,parametrofuncionalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroFuncionals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFuncional> parametrofuncionalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFuncionals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroFuncional("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroFuncional parametrofuncional : parametrofuncionalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroFuncionalConstantesFunciones.generarExcelReporteDataParametroFuncional("NORMAL",row,workbook,parametrofuncional,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroFuncional(String sTipo,Row row,Workbook workbook) {
		
		ParametroFuncionalConstantesFunciones.generarExcelReporteHeaderParametroFuncional(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroFuncionals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFuncional> parametrofuncionalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFuncionals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroFuncional parametrofuncional : parametrofuncionalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroFuncionalConstantesFunciones.getParametroFuncionalDescripcion(parametrofuncional));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrofuncional.getcon_copia_clientes()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrofuncional.getcon_copia_proveedor()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrofuncional.getcon_proveedor_cliente()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroFuncionals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFuncional> parametrofuncionalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroFuncional> parametrofuncionalsRespaldo=null;
		
		classes=ParametroFuncionalConstantesFunciones.getClassesRelationshipsOfParametroFuncional(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrofuncionalLogic.setDatosCliente(this.datosCliente);
		this.parametrofuncionalLogic.setDatosDeep(this.datosDeep);
		this.parametrofuncionalLogic.setIsConDeep(true);
		
		parametrofuncionalsRespaldo=this.parametrofuncionalLogic.getParametroFuncionals();
		
		this.parametrofuncionalLogic.setParametroFuncionals(parametrofuncionalsParaReportes);	
		this.parametrofuncionalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrofuncionalsParaReportes=this.parametrofuncionalLogic.getParametroFuncionals();
		this.parametrofuncionalLogic.setParametroFuncionals(parametrofuncionalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFuncionals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroFuncional("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroFuncional parametrofuncional : parametrofuncionalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroFuncional("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroFuncionalConstantesFunciones.generarExcelReporteDataParametroFuncional("NORMAL",row,workbook,parametrofuncional,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroFuncionalConstantesFunciones.getParametroFuncionalDescripcion(parametrofuncional));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFuncional.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroFuncional() throws Exception {		
		this.startProcessParametroFuncional(true);
	}
	
	public void startProcessParametroFuncional(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesParametroFuncional, this.jScrollPanelDatosParametroFuncional,this.jPanelPaginacionParametroFuncional, this.jScrollPanelDatosEdicionParametroFuncional, this.jPanelAccionesParametroFuncional,this.jPanelAccionesFormularioParametroFuncional,this.jmenuBarParametroFuncional,this.jmenuBarDetalleParametroFuncional,this.jTtoolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroFuncional=null; 
		
		final JPanel jPanelParametrosReportesParametroFuncional=this.jPanelParametrosReportesParametroFuncional;
		//final JScrollPane jScrollPanelDatosParametroFuncional=this.jScrollPanelDatosParametroFuncional;
		final JTable jTableDatosParametroFuncional=this.jTableDatosParametroFuncional;		
		final JPanel jPanelPaginacionParametroFuncional=this.jPanelPaginacionParametroFuncional;
		//final JScrollPane jScrollPanelDatosEdicionParametroFuncional=this.jScrollPanelDatosEdicionParametroFuncional;
		final JPanel jPanelAccionesParametroFuncional=this.jPanelAccionesParametroFuncional;
		
		JPanel jPanelCamposAuxiliarParametroFuncional=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroFuncional=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			jPanelCamposAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jPanelCamposParametroFuncional;
			jPanelAccionesFormularioAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jPanelAccionesFormularioParametroFuncional;
		}
		
		final JPanel jPanelCamposParametroFuncional=jPanelCamposAuxiliarParametroFuncional;
		final JPanel jPanelAccionesFormularioParametroFuncional=jPanelAccionesFormularioAuxiliarParametroFuncional;
		
		
		final JMenuBar jmenuBarParametroFuncional=this.jmenuBarParametroFuncional;
		final JToolBar jTtoolBarParametroFuncional=this.jTtoolBarParametroFuncional;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroFuncional=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroFuncional=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			jmenuBarDetalleAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jmenuBarDetalleParametroFuncional;
			jTtoolBarDetalleAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jTtoolBarDetalleParametroFuncional;
		}
		
		final JMenuBar jmenuBarDetalleParametroFuncional=jmenuBarDetalleAuxiliarParametroFuncional;
		final JToolBar jTtoolBarDetalleParametroFuncional=jTtoolBarDetalleAuxiliarParametroFuncional;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroFuncional;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroFuncional;
			processRunnable.jTableDatos=jTableDatosParametroFuncional;
			processRunnable.jPanelCampos=jPanelCamposParametroFuncional;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroFuncional;
			processRunnable.jPanelAcciones=jPanelAccionesParametroFuncional;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroFuncional;
			
			
			processRunnable.jmenuBar=jmenuBarParametroFuncional;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroFuncional;
			processRunnable.jTtoolBar=jTtoolBarParametroFuncional;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroFuncional;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroFuncional ,jPanelParametrosReportesParametroFuncional,jTableDatosParametroFuncional, /*jScrollPanelDatosParametroFuncional,*/jPanelCamposParametroFuncional,jPanelPaginacionParametroFuncional, /*jScrollPanelDatosEdicionParametroFuncional,*/ jPanelAccionesParametroFuncional,jPanelAccionesFormularioParametroFuncional,jmenuBarParametroFuncional,jmenuBarDetalleParametroFuncional,jTtoolBarParametroFuncional,jTtoolBarDetalleParametroFuncional);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesParametroFuncional, jScrollPanelDatosParametroFuncional,jPanelPaginacionParametroFuncional, jScrollPanelDatosEdicionParametroFuncional, jPanelAccionesParametroFuncional,jPanelAccionesFormularioParametroFuncional,jmenuBarParametroFuncional,jmenuBarDetalleParametroFuncional,jTtoolBarParametroFuncional,jTtoolBarDetalleParametroFuncional);
						
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
	
	public void finishProcessParametroFuncional() {// throws Exception 
		this.finishProcessParametroFuncional(true);
	}
	
	public void finishProcessParametroFuncional(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesParametroFuncional, this.jScrollPanelDatosParametroFuncional,this.jPanelPaginacionParametroFuncional, this.jScrollPanelDatosEdicionParametroFuncional, this.jPanelAccionesParametroFuncional,this.jPanelAccionesFormularioParametroFuncional,this.jmenuBarParametroFuncional,this.jmenuBarDetalleParametroFuncional,this.jTtoolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroFuncional=null; 
		
		final JPanel jPanelParametrosReportesParametroFuncional=this.jPanelParametrosReportesParametroFuncional;
		//final JScrollPane jScrollPanelDatosParametroFuncional=this.jScrollPanelDatosParametroFuncional;
		final JTable jTableDatosParametroFuncional=this.jTableDatosParametroFuncional;		
		final JPanel jPanelPaginacionParametroFuncional=this.jPanelPaginacionParametroFuncional;
		//final JScrollPane jScrollPanelDatosEdicionParametroFuncional=this.jScrollPanelDatosEdicionParametroFuncional;
		final JPanel jPanelAccionesParametroFuncional=this.jPanelAccionesParametroFuncional;
		
		JPanel jPanelCamposAuxiliarParametroFuncional=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroFuncional=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			jPanelCamposAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jPanelCamposParametroFuncional;
			jPanelAccionesFormularioAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jPanelAccionesFormularioParametroFuncional;
		}
		
		final JPanel jPanelCamposParametroFuncional=jPanelCamposAuxiliarParametroFuncional;
		final JPanel jPanelAccionesFormularioParametroFuncional=jPanelAccionesFormularioAuxiliarParametroFuncional;
		
		
		final JMenuBar jmenuBarParametroFuncional=this.jmenuBarParametroFuncional;		
		final JToolBar jTtoolBarParametroFuncional=this.jTtoolBarParametroFuncional;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroFuncional=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroFuncional=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			jmenuBarDetalleAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jmenuBarDetalleParametroFuncional;
			jTtoolBarDetalleAuxiliarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jTtoolBarDetalleParametroFuncional;		
		}
		
		final JMenuBar jmenuBarDetalleParametroFuncional=jmenuBarDetalleAuxiliarParametroFuncional;
		final JToolBar jTtoolBarDetalleParametroFuncional=jTtoolBarDetalleAuxiliarParametroFuncional;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroFuncional;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroFuncional;
			processRunnable.jTableDatos=jTableDatosParametroFuncional;
			processRunnable.jPanelCampos=jPanelCamposParametroFuncional;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroFuncional;
			processRunnable.jPanelAcciones=jPanelAccionesParametroFuncional;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroFuncional;
			
			
			processRunnable.jmenuBar=jmenuBarParametroFuncional;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroFuncional;
			processRunnable.jTtoolBar=jTtoolBarParametroFuncional;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroFuncional;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroFuncional ,jPanelParametrosReportesParametroFuncional, jTableDatosParametroFuncional,/*jScrollPanelDatosParametroFuncional,*/jPanelCamposParametroFuncional,jPanelPaginacionParametroFuncional, /*jScrollPanelDatosEdicionParametroFuncional,*/ jPanelAccionesParametroFuncional,jPanelAccionesFormularioParametroFuncional,jmenuBarParametroFuncional,jmenuBarDetalleParametroFuncional,jTtoolBarParametroFuncional,jTtoolBarDetalleParametroFuncional));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroFuncional(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroFuncional(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroFuncional(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroFuncional(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroFuncional,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroFuncional,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroFuncional(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroFuncional,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroFuncional,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrofuncionalConstantesFunciones.getsFinalQueryParametroFuncional();
		String  finalQueryPaginacionTodos=this.parametrofuncionalConstantesFunciones.getsFinalQueryParametroFuncional();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroFuncionalConstantesFunciones.getArrayColumnasGlobalesNoParametroFuncional(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroFuncionalConstantesFunciones.getArrayColumnasGlobalesParametroFuncional(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroFuncionalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrofuncionalsEliminados= new ArrayList<ParametroFuncional>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroFuncional();
		
				///*ParametroFuncionalSessionBean*/this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
			
			if(this.parametrofuncionalSessionBean==null) {
				this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
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
					this.iNumeroPaginacion=ParametroFuncionalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroFuncionalConstantesFunciones.getClassesForeignKeysOfParametroFuncional(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrofuncional."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrofuncionalsAux= new ArrayList<ParametroFuncional>();
			
				
			parametrofuncionalLogic.setDatosCliente(this.datosCliente);
			parametrofuncionalLogic.setDatosDeep(this.datosDeep);
			parametrofuncionalLogic.setIsConDeep(true);
			
			
			parametrofuncionalLogic.getParametroFuncionalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrofuncionalLogic.getTodosParametroFuncionals(finalQueryGlobal,pagination);
					
					//parametrofuncionalLogic.getTodosParametroFuncionalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrofuncionalLogic.getParametroFuncionals()==null|| parametrofuncionalLogic.getParametroFuncionals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofuncionalsAux= new ArrayList<ParametroFuncional>();
							parametrofuncionalsAux.addAll(parametrofuncionalLogic.getParametroFuncionals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofuncionalsAux= new ArrayList<ParametroFuncional>();
							parametrofuncionalsAux.addAll(parametrofuncionals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofuncionalLogic.getTodosParametroFuncionals(finalQueryGlobal+"",this.pagination);												
							
							//parametrofuncionalLogic.getTodosParametroFuncionalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroFuncionals("Todos",parametrofuncionalLogic.getParametroFuncionals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofuncionalLogic.setParametroFuncionals(new ArrayList<ParametroFuncional>());					
							parametrofuncionalLogic.getParametroFuncionals().addAll(parametrofuncionalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofuncionals=new ArrayList<ParametroFuncional>();
							parametrofuncionals.addAll(parametrofuncionalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroFuncional=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroFuncional=this.idActual;
				
				} else if(this.idParametroFuncionalActual!=null && this.idParametroFuncionalActual!=0L) {
					idParametroFuncional=idParametroFuncionalActual;
				}
				
					
				this.sDetalleReporte=ParametroFuncionalConstantesFunciones.getDetalleIndicePorId(idParametroFuncional);
				
				this.parametrofuncionals=new ArrayList<ParametroFuncional>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrofuncionalLogic.getEntity(idParametroFuncional);
					
					//parametrofuncionalLogic.getEntityWithConnection(idParametroFuncional);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofuncionalLogic.setParametroFuncionals(new ArrayList<ParametroFuncional>());
					parametrofuncionalLogic.getParametroFuncionals().add(parametrofuncionalLogic.getParametroFuncional());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofuncionals=new ArrayList<ParametroFuncional>();
					this.parametrofuncionals.add(parametrofuncional);
				}
				
				if(parametrofuncionalLogic.getParametroFuncional()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroFuncional();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroFuncional();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrofuncionalLogic.getParametroFuncionals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofuncionals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrofuncionalLogic.getParametroFuncionals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofuncionals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroFuncional parametrofuncional) {
		Boolean permite=true;
		
		if(this.parametrofuncional.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroFuncionalConstantesFunciones.getOrderByListaParametroFuncional();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroFuncionalConstantesFunciones.getOrderByListaParametroFuncional();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFuncional parametrofuncional:parametrofuncionalLogic.getParametroFuncionals()) {
				if(parametrofuncional.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofuncionalTotales=parametrofuncional;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFuncional parametrofuncional:this.parametrofuncionals) {
				if(parametrofuncional.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofuncionalTotales=parametrofuncional;
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
			this.parametrofuncionalAux=new ParametroFuncional();
			this.parametrofuncionalAux.setsType(Constantes2.S_TOTALES);
			this.parametrofuncionalAux.setIsNew(false);
			this.parametrofuncionalAux.setIsChanged(false);
			this.parametrofuncionalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroFuncionalConstantesFunciones.TotalizarValoresFilaParametroFuncional(this.parametrofuncionalLogic.getParametroFuncionals(),this.parametrofuncionalAux);
				
				this.parametrofuncionalLogic.getParametroFuncionals().add(this.parametrofuncionalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroFuncionalConstantesFunciones.TotalizarValoresFilaParametroFuncional(this.parametrofuncionals,this.parametrofuncionalAux);
				
				this.parametrofuncionals.add(this.parametrofuncionalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrofuncionalTotales=new ParametroFuncional();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrofuncionalLogic.getParametroFuncionals().remove(parametrofuncionalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrofuncionals.remove(parametrofuncionalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrofuncionalTotales=new ParametroFuncional();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFuncional parametrofuncional:parametrofuncionalLogic.getParametroFuncionals()) {
				if(parametrofuncional.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofuncionalTotales=parametrofuncional;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroFuncionalConstantesFunciones.TotalizarValoresFilaParametroFuncional(this.parametrofuncionalLogic.getParametroFuncionals(),parametrofuncionalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFuncional parametrofuncional:this.parametrofuncionals) {
				if(parametrofuncional.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofuncionalTotales=parametrofuncional;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroFuncionalConstantesFunciones.TotalizarValoresFilaParametroFuncional(this.parametrofuncionals,parametrofuncionalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosParametroFuncional() {
		this.isPermisoTodoParametroFuncional=false;
		this.isPermisoNuevoParametroFuncional=false;
		this.isPermisoActualizarParametroFuncional=false;
		this.isPermisoActualizarOriginalParametroFuncional=false;
		this.isPermisoEliminarParametroFuncional=false;
		this.isPermisoGuardarCambiosParametroFuncional=false;
		this.isPermisoConsultaParametroFuncional=false;
		this.isPermisoBusquedaParametroFuncional=false;
		this.isPermisoReporteParametroFuncional=false;		
		this.isPermisoOrdenParametroFuncional=false;		
		this.isPermisoPaginacionMedioParametroFuncional=false;		
		this.isPermisoPaginacionAltoParametroFuncional=false;
		this.isPermisoPaginacionTodoParametroFuncional=false;
		this.isPermisoCopiarParametroFuncional=false;		
		this.isPermisoVerFormParametroFuncional=false;		
		this.isPermisoDuplicarParametroFuncional=false;		
		this.isPermisoOrdenParametroFuncional=false;		
	}
	
	public void setPermisosUsuarioParametroFuncional(Boolean isPermiso) {
		this.isPermisoTodoParametroFuncional=isPermiso;
		this.isPermisoNuevoParametroFuncional=isPermiso;
		this.isPermisoActualizarParametroFuncional=isPermiso;
		this.isPermisoActualizarOriginalParametroFuncional=isPermiso;
		this.isPermisoEliminarParametroFuncional=isPermiso;
		this.isPermisoGuardarCambiosParametroFuncional=isPermiso;
		this.isPermisoConsultaParametroFuncional=isPermiso;
		this.isPermisoBusquedaParametroFuncional=isPermiso;
		this.isPermisoReporteParametroFuncional=isPermiso;
		this.isPermisoOrdenParametroFuncional=isPermiso;		
		this.isPermisoPaginacionMedioParametroFuncional=isPermiso;		
		this.isPermisoPaginacionAltoParametroFuncional=isPermiso;		
		this.isPermisoPaginacionTodoParametroFuncional=isPermiso;		
		this.isPermisoCopiarParametroFuncional=isPermiso;		
		this.isPermisoVerFormParametroFuncional=isPermiso;		
		this.isPermisoDuplicarParametroFuncional=isPermiso;
		this.isPermisoOrdenParametroFuncional=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroFuncional(Boolean isPermiso) {
		//this.isPermisoTodoParametroFuncional=isPermiso;
		this.isPermisoNuevoParametroFuncional=isPermiso;
		this.isPermisoActualizarParametroFuncional=isPermiso;
		this.isPermisoActualizarOriginalParametroFuncional=isPermiso;
		this.isPermisoEliminarParametroFuncional=isPermiso;
		this.isPermisoGuardarCambiosParametroFuncional=isPermiso;
		//this.isPermisoConsultaParametroFuncional=isPermiso;
		//this.isPermisoBusquedaParametroFuncional=isPermiso;
		//this.isPermisoReporteParametroFuncional=isPermiso;
		//this.isPermisoOrdenParametroFuncional=isPermiso;		
		//this.isPermisoPaginacionMedioParametroFuncional=isPermiso;		
		//this.isPermisoPaginacionAltoParametroFuncional=isPermiso;		
		//this.isPermisoPaginacionTodoParametroFuncional=isPermiso;		
		//this.isPermisoCopiarParametroFuncional=isPermiso;		
		//this.isPermisoDuplicarParametroFuncional=isPermiso;
		//this.isPermisoOrdenParametroFuncional=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroFuncionalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroFuncionalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroFuncional(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroFuncionalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroFuncionalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroFuncionalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroFuncionalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroFuncional() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroFuncionalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroFuncionalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroFuncional=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroFuncional=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroFuncional=this.isPermisoActualizarParametroFuncional;
			this.isPermisoEliminarParametroFuncional=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroFuncional=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroFuncional=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroFuncional=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroFuncional=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroFuncional=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroFuncional=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroFuncional=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroFuncional=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroFuncional=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroFuncional=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroFuncional=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroFuncional=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroFuncional=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroFuncional.setToolTipText(this.jTableDatosParametroFuncional.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroFuncional(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroFuncional(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroFuncionalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroFuncionalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroFuncional() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyParametroFuncionalListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroFuncionalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroFuncionalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroFuncionalListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyParametroFuncionalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroFuncional()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyParametroFuncional()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroFuncional(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroFuncional()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFuncional();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroFuncional(ParametroFuncional parametrofuncional)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroFuncional(ParametroFuncional parametrofuncional,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroFuncional()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFuncional()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroFuncional()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroFuncional()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroFuncional()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroFuncional()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroFuncional(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroFuncional()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ParametroFuncionalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroFuncionalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroFuncionalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean(); 
		this.parametrofuncionalConstantesFunciones=new ParametroFuncionalConstantesFunciones(); 
		this.parametrofuncionalBean=new ParametroFuncional();//(this.parametrofuncionalConstantesFunciones); 		
		this.parametrofuncionalReturnGeneral=new ParametroFuncionalParameterReturnGeneral(); 
		
		this.parametrofuncionalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofuncionalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroFuncionalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroFuncionalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroFuncionalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroFuncional(true);
			
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
			
			this.parametrofuncionalConstantesFunciones=new ParametroFuncionalConstantesFunciones(); 
			this.parametrofuncionalBean=new ParametroFuncional();//this.parametrofuncionalConstantesFunciones); 			
			this.parametrofuncionalReturnGeneral=new ParametroFuncionalParameterReturnGeneral(); 
		
			ParametroFuncionalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Funcional Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrofuncional=new ParametroFuncional();
			this.parametrofuncionals = new ArrayList<ParametroFuncional>();
			this.parametrofuncionalsAux = new ArrayList<ParametroFuncional>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic=new ParametroFuncionalLogic();
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrofuncionalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrofuncionalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroFuncional);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroFuncional);	
					}
					
					if(this.jInternalFrameImportacionParametroFuncional!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroFuncional);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroFuncional!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroFuncional);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroFuncional);
				this.jInternalFrameDetalleFormParametroFuncional.setVisible(false);
				this.jInternalFrameDetalleFormParametroFuncional.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroFuncional);
					this.jInternalFrameReporteDinamicoParametroFuncional.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroFuncional.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroFuncional!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroFuncional);
					this.jInternalFrameImportacionParametroFuncional.setVisible(false);
					this.jInternalFrameImportacionParametroFuncional.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroFuncional!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroFuncional);
					this.jInternalFrameOrderByParametroFuncional.setVisible(false);
					this.jInternalFrameOrderByParametroFuncional.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroFuncionalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroFuncionalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrofuncionalReturnGeneral=new ParametroFuncionalParameterReturnGeneral();
			
			this.parametrofuncionalParameterGeneral=new ParametroFuncionalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrofuncionalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroFuncionalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroFuncionalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrofuncionalSessionBean.getEsGuardarRelacionado(),this.parametrofuncionalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroFuncionalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrofuncionalSessionBean.getEsGuardarRelacionado(),this.parametrofuncionalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaDuplicarParametroFuncional=true;
			this.isVisibilidadCeldaCopiarParametroFuncional=true;
			this.isVisibilidadCeldaVerFormParametroFuncional=true;
			this.isVisibilidadCeldaOrdenParametroFuncional=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=false;
			this.isVisibilidadCeldaGuardarParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroFuncional();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroFuncional(false);
			
			this.setPermisosUsuarioParametroFuncional();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrofuncionalSessionBean.getEsGuardarRelacionado() && this.parametrofuncionalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroFuncionalClasesRelacionadas();
			}
			
			if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroFuncionalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroFuncional();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroFuncional();
			}
			
			if(!this.isPermisoBusquedaParametroFuncional) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroFuncional,this.isPermisoPaginacionMedioParametroFuncional,this.isPermisoPaginacionTodoParametroFuncional);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroFuncionalConstantesFunciones.getTiposSeleccionarParametroFuncional());
				
				this.tiposColumnasSelect=ParametroFuncionalConstantesFunciones.getTiposSeleccionarParametroFuncional(true);
				
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
			//if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroFuncional();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioParametroFuncional(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioParametroFuncional(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFuncional() ;
			
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
				parametrofuncionalImplementable= (ParametroFuncionalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroFuncionalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrofuncionalImplementableHome= (ParametroFuncionalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroFuncionalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrofuncionals= new ArrayList<ParametroFuncional>();
			this.parametrofuncionalsEliminados= new ArrayList<ParametroFuncional>();
						
			this.isEsNuevoParametroFuncional=false;
			this.esParaAccionDesdeFormularioParametroFuncional=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroFuncional(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroFuncional();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroFuncionalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroFuncionalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroFuncional("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroFuncional(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroFuncional();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroFuncional();
			}
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroFuncional(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroFuncional: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroFuncional() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroFuncional")) {
				iIndex=this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroFuncional();	
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
	
	public void cargarCombosForeignKeyParametroFuncional(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroFuncional(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroFuncional(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroFuncionalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroFuncional();
		
		this.cargarCombosFrameForeignKeyParametroFuncional();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroFuncional();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroFuncional();
		}
	}
	
	
	
	public void jButtonNuevoParametroFuncionalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			
			if(jTableDatosParametroFuncional.getRowCount()>=1) {
				jTableDatosParametroFuncional.removeRowSelectionInterval(0, jTableDatosParametroFuncional.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroFuncional=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroFuncional(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroFuncional(true);			
			//this.parametrofuncional=new ParametroFuncional();
			//this.parametrofuncional.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFuncional(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFuncional() ;
			
			if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFuncional(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrofuncional);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);				
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroFuncional: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroFuncionalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroFuncional.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroFuncional.getSelectedRows().length;			
			}
			
			parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroFuncional--;			
				//ParametroFuncional parametrofuncionalAux= new ParametroFuncional();			
				//parametrofuncionalAux.setId(this.iIdNuevoParametroFuncional);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroFuncional parametrofuncionalOrigen=new ParametroFuncional();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroFuncional parametrofuncionalOrigen : parametrofuncionalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrofuncionalOrigen =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofuncionalOrigen =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroFuncional();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrofuncional.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroFuncional(parametrofuncionalOrigen,this.parametrofuncional,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrofuncionalLogic.getParametroFuncionals().add(this.parametrofuncionalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrofuncionals.add(this.parametrofuncionalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroFuncional(false);
				
				this.jTableDatosParametroFuncional.setRowSelectionInterval(this.getIndiceNuevoParametroFuncional(), this.getIndiceNuevoParametroFuncional());
				
				int iLastRow =  this.jTableDatosParametroFuncional.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroFuncional.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroFuncional.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFuncional(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();									
		
			ParametroFuncional parametrofuncionalOrigen=new ParametroFuncional();
			ParametroFuncional parametrofuncionalDestino=new ParametroFuncional();
				
			parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroFuncional.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrofuncionalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroFuncional.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofuncionalOrigen =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrofuncionalOrigen =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofuncionalDestino =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrofuncionalDestino =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrofuncionalOrigen =parametrofuncionalsSeleccionados.get(0);
				parametrofuncionalDestino =parametrofuncionalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroFuncional(parametrofuncionalOrigen,parametrofuncionalDestino,true,false);
				
				parametrofuncionalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrofuncionalDestino,parametrofuncionalLogic.getParametroFuncionals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofuncionalDestino,parametrofuncionals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroFuncional(false);
				
				//this.jTableDatosParametroFuncional.setRowSelectionInterval(this.getIndiceNuevoParametroFuncional(), this.getIndiceNuevoParametroFuncional());
				
				int iLastRow =  this.jTableDatosParametroFuncional.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroFuncional.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroFuncional.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFuncional(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroFuncional.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroFuncional.isVisible();
			
			
			this.jPanelParametrosReportesParametroFuncional.setVisible(!isVisible);
			this.jPanelPaginacionParametroFuncional.setVisible(!isVisible);
			this.jPanelAccionesParametroFuncional.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroFuncional();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroFuncional();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroFuncional();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroFuncional();
			
			this.abrirFrameOrderByParametroFuncional();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroFuncional();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroFuncional(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroFuncional);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroFuncional.isMaximum()) {
					this.jInternalFrameDetalleFormParametroFuncional.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroFuncional.setSize(this.jInternalFrameDetalleFormParametroFuncional.iWidthFormulario,this.jInternalFrameDetalleFormParametroFuncional.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroFuncional.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroFuncional.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroFuncional.isMaximum()) {
						this.jInternalFrameDetalleFormParametroFuncional.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroFuncional.jContentPaneDetalleParametroFuncional.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroFuncional.jContentPaneDetalleParametroFuncional.getWidth(),ParametroFuncionalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroFuncional.jContentPaneDetalleParametroFuncional.getWidth(),ParametroFuncionalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroFuncional.jContentPaneDetalleParametroFuncional.getWidth(),ParametroFuncionalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroFuncional.setVisible(true);
	        this.jInternalFrameDetalleFormParametroFuncional.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroFuncional() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroFuncional==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroFuncional=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFuncional,false,this);
				} else {
					this.jInternalFrameOrderByParametroFuncional=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFuncional,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroFuncional);
				this.jInternalFrameOrderByParametroFuncional.setVisible(false);
				this.jInternalFrameOrderByParametroFuncional.setSelected(false);
				
				this.jInternalFrameOrderByParametroFuncional.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroFuncional"));
				
				this.inicializarActualizarBindingTablaOrderByParametroFuncional();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroFuncional() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroFuncional==null) {
				
				this.jInternalFrameImportacionParametroFuncional=new ImportacionJInternalFrame(ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroFuncional);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroFuncional);
				this.jInternalFrameImportacionParametroFuncional.setVisible(false);
				this.jInternalFrameImportacionParametroFuncional.setSelected(false);


				this.jInternalFrameImportacionParametroFuncional.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroFuncional"));
				this.jInternalFrameImportacionParametroFuncional.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroFuncional"));
				this.jInternalFrameImportacionParametroFuncional.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroFuncional"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroFuncional() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroFuncional==null) {
				this.jInternalFrameReporteDinamicoParametroFuncional=new ReporteDinamicoJInternalFrame(ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroFuncional);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroFuncional);
				this.jInternalFrameReporteDinamicoParametroFuncional.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroFuncional.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFuncional"));
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFuncional"));
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFuncional"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFuncional();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroFuncional() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroFuncional);
			
	       	this.jInternalFrameDetalleFormParametroFuncional.setVisible(false);
	        this.jInternalFrameDetalleFormParametroFuncional.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroFuncional.dispose();
			//this.jInternalFrameDetalleFormParametroFuncional=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroFuncional() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroFuncional.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroFuncional.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroFuncional() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroFuncional.setVisible(true);
	        this.jInternalFrameImportacionParametroFuncional.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroFuncional() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroFuncional.setVisible(true);
	        this.jInternalFrameOrderByParametroFuncional.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroFuncional() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroFuncional.setVisible(false);
	        this.jInternalFrameOrderByParametroFuncional.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroFuncional() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroFuncional.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroFuncional.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroFuncional() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroFuncional.setVisible(false);
	        this.jInternalFrameImportacionParametroFuncional.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroFuncional(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroFuncional(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroFuncional(true);
			//this.isEsNuevoParametroFuncional=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroFuncional("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFuncional(false) ;
			
			if(parametrofuncionalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFuncional(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFuncional(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroFuncionalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroFuncional(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroFuncional(true);
			//this.isEsNuevoParametroFuncional=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrofuncional.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroFuncional("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroFuncional(false) ;
			
			if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFuncional(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFuncional(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroFuncional(false);
			
			//if(!this.isEsNuevoParametroFuncional) {								
				int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				
			}
			
			if(this.permiteMantenimiento(this.parametrofuncional)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroFuncional=true;
					this.inicializarActualizarBindingTablaParametroFuncional(false);
					this.isEsNuevoParametroFuncional=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroFuncional=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroFuncional=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroFuncional(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFuncional(false);
				
				this.habilitarDeshabilitarControlesParametroFuncional(false);
			
												
				
				if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroFuncional();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroFuncionalActionPerformed(evt,parametrofuncionalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroFuncional(this.parametrofuncional,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroFuncional.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrofuncionalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrofuncional.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				this.parametrofuncional.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				this.parametrofuncional.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrofuncional)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroFuncionalModel) this.jTableDatosParametroFuncional.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroFuncional=true;
				this.inicializarActualizarBindingTablaParametroFuncional(false);
				this.isEsNuevoParametroFuncional=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroFuncional(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFuncional(false);
				
				this.habilitarDeshabilitarControlesParametroFuncional(false);
				
				
				
				if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroFuncional();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroFuncional.getRowCount()>=1) {
				jTableDatosParametroFuncional.removeRowSelectionInterval(0, jTableDatosParametroFuncional.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroFuncional(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroFuncional(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFuncional(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFuncional(false) ;
			
			this.isEsNuevoParametroFuncional=false;
			
			if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroFuncional();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroFuncional(false);
				
				//SI ES MANUAL
				if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroFuncional();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroFuncional--;			
			//ParametroFuncional parametrofuncionalAux= new ParametroFuncional();			
			//parametrofuncionalAux.setId(this.iIdNuevoParametroFuncional);
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroFuncional();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
			
			this.parametrofuncional.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrofuncionalLogic.getParametroFuncionals().add(this.parametrofuncionalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrofuncionals.add(this.parametrofuncionalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroFuncional(false);
			
			this.jTableDatosParametroFuncional.setRowSelectionInterval(this.getIndiceNuevoParametroFuncional(), this.getIndiceNuevoParametroFuncional());
			
			int iLastRow =  this.jTableDatosParametroFuncional.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroFuncional.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroFuncional.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroFuncional(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFuncional(false);
			
			//SI ES MANUAL
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFuncional();
			}
			
			//this.abrirFrameTreeParametroFuncional();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro FuncionalES ?", "MANTENIMIENTO DE Parametro Funcional", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroFuncional.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroFuncional();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrofuncionalReturnGeneral=parametrofuncionalLogic.procesarImportacionParametroFuncionalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrofuncionalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroFuncionalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroFuncional.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroFuncional.setFileImportacion(this.jInternalFrameImportacionParametroFuncional.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroFuncional.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroFuncional.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroFuncional.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroFuncional.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		

		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroFuncionalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroFuncionalBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCopiaClientes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCopiaClientes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCopiaClientes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCopiaClientes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCopiaProveedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCopiaProveedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCopiaProveedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCopiaProveedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nProveedorCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nProveedorCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nProveedorCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nProveedorCliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroFuncional.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES:
					sNombreCampoCategoria="con_copia_clientes";
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR:
					sNombreCampoCategoria="con_copia_proveedor";
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE:
					sNombreCampoCategoria="con_proveedor_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES:
					sNombreCampoCategoriaValor="con_copia_clientes";
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR:
					sNombreCampoCategoriaValor="con_copia_proveedor";
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE:
					sNombreCampoCategoriaValor="con_proveedor_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Concopia Clientes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_copia_clientes");
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Concopia Proveedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_copia_proveedor");
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Conproveedor Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_proveedor_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroFuncionals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES);
					iRow++;

					for(ParametroFuncional parametrofuncional:parametrofuncionalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofuncional.getcon_copia_clientes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR);
					iRow++;

					for(ParametroFuncional parametrofuncional:parametrofuncionalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofuncional.getcon_copia_proveedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE);
					iRow++;

					for(ParametroFuncional parametrofuncional:parametrofuncionalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofuncional.getcon_proveedor_cliente());
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
			//	this.getFilaCabeceraExportarExcelParametroFuncional(row);				
			//	iRow++;
			//}				
			
			//for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroFuncional(parametrofuncionalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFuncional(false);
			
			//SI ES MANUAL
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFuncional();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFuncional(false);
			
			//SI ES MANUAL
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroFuncional();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroFuncionalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFuncional(false);
			
			//SI ES MANUAL
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroFuncional();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofuncionalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroFuncional() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroFuncional.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroFuncional.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroFuncional.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroFuncional.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroFuncional.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroFuncional.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroFuncional.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroFuncional(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroFuncional(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroFuncional(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroFuncional(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroFuncional(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroFuncional(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFuncional(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroFuncional(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroFuncional() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroFuncional();
		
		this.inicializarActualizarBindingBotonesManualParametroFuncional(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroFuncional();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFuncional() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFuncional(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFuncional(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroFuncional.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroFuncional.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroFuncional.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionNuevoParametroFuncional.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionSinCerrarParametroFuncional.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionSinMensajeParametroFuncional.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroFuncional.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroFuncional.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroFuncional.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
				this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionNuevoParametroFuncional.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionSinCerrarParametroFuncional.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxPostAccionSinMensajeParametroFuncional.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroFuncional.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroFuncional.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroFuncional.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroFuncional.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroFuncional.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroFuncional.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroFuncional.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroFuncional.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroFuncional.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroFuncional(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFuncional(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroFuncional() throws Exception {
		try	{
			if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroFuncional();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroFuncional() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroFuncional() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroFuncional.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroFuncional.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroFuncional.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroFuncional.addItem(reporte);
			}
			
			
			if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroFuncional.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroFuncional.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroFuncional.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroFuncional.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroFuncional.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroFuncional.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroFuncional.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFuncional();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFuncional() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
				this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
				this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroFuncional.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroFuncional.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroFuncional.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroFuncional.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroFuncional.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroFuncional()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroFuncional(Boolean esInicializar) throws Exception {				
		if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroFuncional();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroFuncional() throws Exception {
		this.inicializarActualizarBindingTablaParametroFuncional(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroFuncional() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroFuncionalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncionalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroFuncional(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrofuncionalLogic.getParametroFuncionals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrofuncionals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroFuncional.setModel(new ParametroFuncionalModel(this.parametrofuncionalLogic.getParametroFuncionals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroFuncional.setModel(new ParametroFuncionalModel(this.parametrofuncionals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroFuncional!=null && this.jInternalFrameOrderByParametroFuncional.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroFuncional();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,parametrofuncionalConstantesFunciones.resaltarSeleccionarParametroFuncional,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO,parametrofuncionalConstantesFunciones.resaltarSeleccionarParametroFuncional,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,ParametroFuncionalConstantesFunciones.LABEL_ID));

		if(this.parametrofuncionalConstantesFunciones.mostraridParametroFuncional && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFuncionalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrofuncionalConstantesFunciones.resaltaridParametroFuncional,this.parametrofuncionalConstantesFunciones.activaridParametroFuncional,this,true,"idParametroFuncional","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrofuncionalConstantesFunciones.resaltaridParametroFuncional,this.parametrofuncionalConstantesFunciones.activaridParametroFuncional,this,true,"idParametroFuncional","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES));

		if(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_clientesParametroFuncional && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_clientesParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_copia_clientesParametroFuncional));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_clientesParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_copia_clientesParametroFuncional,this,true,"con_copia_clientesParametroFuncional","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR));

		if(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_proveedorParametroFuncional && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_proveedorParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_copia_proveedorParametroFuncional));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_proveedorParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_copia_proveedorParametroFuncional,this,true,"con_copia_proveedorParametroFuncional","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE));

		if(this.parametrofuncionalConstantesFunciones.mostrarcon_proveedor_clienteParametroFuncional && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_proveedor_clienteParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_proveedor_clienteParametroFuncional));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrofuncionalConstantesFunciones.resaltarcon_proveedor_clienteParametroFuncional,this.parametrofuncionalConstantesFunciones.activarcon_proveedor_clienteParametroFuncional,this,true,"con_proveedor_clienteParametroFuncional","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroFuncionalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroFuncional.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroFuncional.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrofuncionalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroFuncional.addColumn(tableColumn);
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
			
			this.jTableDatosParametroFuncional.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroFuncional.moveColumn(this.jTableDatosParametroFuncional.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroFuncional.moveColumn(this.jTableDatosParametroFuncional.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroFuncional.moveColumn(this.jTableDatosParametroFuncional.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroFuncional.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroFuncional.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroFuncional,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroFuncional.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroFuncional.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroFuncional.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroFuncional.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroFuncional.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrofuncionalLogic.getParametroFuncionals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrofuncionals.size()-1;
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
		//this.jTableDatosParametroFuncional.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroFuncional.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroFuncional();
			
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
				
				//this.isEsNuevoParametroFuncional=false;
					
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
				if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroFuncional==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroFuncional.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroFuncional.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrofuncional.getsType().equals("DUPLICADO")
				   || this.parametrofuncional.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroFuncional=true;
				
				} else {
					this.isEsNuevoParametroFuncional=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrofuncional.getId()>=0 && !this.parametrofuncional.getIsNew()) {						
						this.isEsNuevoParametroFuncional=false;
						
					} else {
						this.isEsNuevoParametroFuncional=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroFuncional(esRelaciones);						
				
				this.seleccionarParametroFuncional(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrofuncional.getId()<0) {
					this.isEsNuevoParametroFuncional=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroFuncional(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroFuncional(evt,rowIndex);
				}	
				
				if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroFuncional: " + this.dDif); 
					}
				}								
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroFuncional(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrofuncional)) {
					if(this.parametrofuncional.getId()>0) {
						this.parametrofuncional.setIsDeleted(true);
						
						this.parametrofuncionalsEliminados.add(this.parametrofuncional);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrofuncionalLogic.getParametroFuncionals().remove(this.parametrofuncional);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrofuncionals.remove(this.parametrofuncional);				
					}
					
					
					((ParametroFuncionalModel) this.jTableDatosParametroFuncional.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFuncional(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroFuncional(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroFuncional) {
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroFuncional.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroFuncional.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroFuncional(this.parametrofuncional);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroFuncional("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroFuncional(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFuncional() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroFuncional(ParametroFuncional parametrofuncional) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroFuncional(parametrofuncional,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroFuncional(ParametroFuncional parametrofuncional,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroFuncional(parametrofuncional);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroFuncional(parametrofuncional,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroFuncional(parametrofuncional);
	}
	
	public void setVariablesObjetoActualToFormularioParametroFuncional(ParametroFuncional parametrofuncional) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setText(parametrofuncional.getId().toString());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setSelected(parametrofuncional.getcon_copia_clientes());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setSelected(parametrofuncional.getcon_copia_proveedor());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setSelected(parametrofuncional.getcon_proveedor_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroFuncional parametrofuncionalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrofuncionalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroFuncional parametrofuncionalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrofuncionalLocal=this.parametrofuncional;
			} else {
				parametrofuncionalLocal=this.parametrofuncionalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrofuncionalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroFuncional(parametrofuncionalLocal,true);
					
					if(parametrofuncionalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrofuncionalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrofuncionalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroFuncional(ParametroFuncional parametrofuncional,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroFuncional(parametrofuncional,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(parametrofuncional);
	}
	
	public void setVariablesFormularioToObjetoActualParametroFuncional(ParametroFuncional parametrofuncional,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroFuncional(parametrofuncional,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroFuncional(ParametroFuncional parametrofuncional,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.getText()==null || this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.getText()=="" || this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setText("0");
			}

			if(conColumnasBase) {parametrofuncional.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroFuncionalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelIdParametroFuncional,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrofuncional.setcon_copia_clientes(this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_clientesParametroFuncional,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrofuncional.setcon_copia_proveedor(this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_copia_proveedorParametroFuncional,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrofuncional.setcon_proveedor_cliente(this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFuncional.jLabelcon_proveedor_clienteParametroFuncional,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroFuncional(ParametroFuncional parametrofuncionalBean,ParametroFuncional parametrofuncional,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroFuncional(ParametroFuncional parametrofuncionalOrigen,ParametroFuncional parametrofuncional,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrofuncionalOrigen.getId()!=null && !parametrofuncionalOrigen.getId().equals(0L))) {parametrofuncional.setId(parametrofuncionalOrigen.getId());}}
			if(conDefault || (!conDefault && parametrofuncionalOrigen.getcon_copia_clientes()!=null && !parametrofuncionalOrigen.getcon_copia_clientes().equals(false))) {parametrofuncional.setcon_copia_clientes(parametrofuncionalOrigen.getcon_copia_clientes());}
			if(conDefault || (!conDefault && parametrofuncionalOrigen.getcon_copia_proveedor()!=null && !parametrofuncionalOrigen.getcon_copia_proveedor().equals(false))) {parametrofuncional.setcon_copia_proveedor(parametrofuncionalOrigen.getcon_copia_proveedor());}
			if(conDefault || (!conDefault && parametrofuncionalOrigen.getcon_proveedor_cliente()!=null && !parametrofuncionalOrigen.getcon_proveedor_cliente().equals(false))) {parametrofuncional.setcon_proveedor_cliente(parametrofuncionalOrigen.getcon_proveedor_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroFuncional(ParametroFuncional parametrofuncional) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setText(parametrofuncional.getId().toString());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setSelected(parametrofuncional.getcon_copia_clientes());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setSelected(parametrofuncional.getcon_copia_proveedor());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setSelected(parametrofuncional.getcon_proveedor_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroFuncional(ParametroFuncionalBean parametrofuncionalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setText(parametrofuncionalBean.getId().toString());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setSelected(parametrofuncionalBean.getcon_copia_clientes());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setSelected(parametrofuncionalBean.getcon_copia_proveedor());
			this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setSelected(parametrofuncionalBean.getcon_proveedor_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroFuncional(ParametroFuncionalParameterReturnGeneral parametrofuncionalReturnGeneral,ParametroFuncionalBean parametrofuncionalBean,Boolean conDefault) throws Exception { 
		try {
			ParametroFuncional parametrofuncionalLocal=new ParametroFuncional();
			
			parametrofuncionalLocal=parametrofuncionalReturnGeneral.getParametroFuncional();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrofuncionalLocal.getId()!=null && !parametrofuncionalLocal.getId().equals(0L))) {parametrofuncionalBean.setId(parametrofuncionalLocal.getId());}}
			if(conDefault || (!conDefault && parametrofuncionalLocal.getcon_copia_clientes()!=null && !parametrofuncionalLocal.getcon_copia_clientes().equals(false))) {parametrofuncionalBean.setcon_copia_clientes(parametrofuncionalLocal.getcon_copia_clientes());}
			if(conDefault || (!conDefault && parametrofuncionalLocal.getcon_copia_proveedor()!=null && !parametrofuncionalLocal.getcon_copia_proveedor().equals(false))) {parametrofuncionalBean.setcon_copia_proveedor(parametrofuncionalLocal.getcon_copia_proveedor());}
			if(conDefault || (!conDefault && parametrofuncionalLocal.getcon_proveedor_cliente()!=null && !parametrofuncionalLocal.getcon_proveedor_cliente().equals(false))) {parametrofuncionalBean.setcon_proveedor_cliente(parametrofuncionalLocal.getcon_proveedor_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroFuncionalGenerico(Long idParametroFuncionalSeleccionado,JComboBox jComboBoxParametroFuncional,List<ParametroFuncional> parametrofuncionalsLocal)throws Exception {
		try {
			ParametroFuncional  parametrofuncionalTemp=null;

			for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsLocal) {
				if(parametrofuncionalAux.getId()!=null && parametrofuncionalAux.getId().equals(idParametroFuncionalSeleccionado)) {
					parametrofuncionalTemp=parametrofuncionalAux;
					break;
				}
			}

			jComboBoxParametroFuncional.setSelectedItem(parametrofuncionalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroFuncionalGenerico(JComboBox jComboBoxParametroFuncional,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroFuncional.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroFuncional.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroFuncional.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroFuncional.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofuncional=(ParametroFuncional) parametrofuncionalLogic.getParametroFuncionals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrofuncional =(ParametroFuncional) parametrofuncionals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroFuncional parametrofuncionalRow=new ParametroFuncional();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofuncionalRow=(ParametroFuncional) parametrofuncionalLogic.getParametroFuncionals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrofuncionalRow=(ParametroFuncional) parametrofuncionals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroFuncional(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional));			
			this.jButtonDuplicarParametroFuncional.setVisible((this.isVisibilidadCeldaDuplicarParametroFuncional && this.isPermisoDuplicarParametroFuncional));			
			this.jButtonCopiarParametroFuncional.setVisible((this.isVisibilidadCeldaCopiarParametroFuncional && this.isPermisoCopiarParametroFuncional));
			this.jButtonVerFormParametroFuncional.setVisible((this.isVisibilidadCeldaVerFormParametroFuncional && this.isPermisoVerFormParametroFuncional));
			
			this.jButtonAbrirOrderByParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));			
			
			this.jButtonNuevoRelacionesParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFuncional && this.isPermisoNuevoParametroFuncional));			
			this.jButtonNuevoGuardarCambiosParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarParametroFuncional.setVisible((this.isVisibilidadCeldaModificarParametroFuncional && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.setVisible((this.isVisibilidadCeldaActualizarParametroFuncional && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.setVisible((this.isVisibilidadCeldaEliminarParametroFuncional && this.isPermisoEliminarParametroFuncional));
			this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.setVisible(this.isVisibilidadCeldaCancelarParametroFuncional);							
			this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional));						
			this.jButtonDuplicarToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaDuplicarParametroFuncional && this.isPermisoDuplicarParametroFuncional));						
			this.jButtonCopiarToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaCopiarParametroFuncional && this.isPermisoCopiarParametroFuncional));			
			this.jButtonVerFormToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaVerFormParametroFuncional && this.isPermisoVerFormParametroFuncional));			
			this.jButtonAbrirOrderByToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));
			this.jButtonNuevoRelacionesToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFuncional && this.isPermisoNuevoParametroFuncional));			
			this.jButtonNuevoGuardarCambiosToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));			
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaModificarParametroFuncional && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaActualizarParametroFuncional  && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaEliminarParametroFuncional && this.isPermisoEliminarParametroFuncional));
			this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarToolBarParametroFuncional.setVisible(this.isVisibilidadCeldaCancelarParametroFuncional);				
			this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional));			
			this.jMenuItemDuplicarParametroFuncional.setVisible((this.isVisibilidadCeldaDuplicarParametroFuncional && this.isPermisoDuplicarParametroFuncional));			
			this.jMenuItemCopiarParametroFuncional.setVisible((this.isVisibilidadCeldaCopiarParametroFuncional && this.isPermisoCopiarParametroFuncional));			
			this.jMenuItemVerFormParametroFuncional.setVisible((this.isVisibilidadCeldaVerFormParametroFuncional && this.isPermisoVerFormParametroFuncional));			
			this.jMenuItemAbrirOrderByParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));			
			//this.jMenuItemMostrarOcultarParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));
			this.jMenuItemDetalleAbrirOrderByParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));			
			//this.jMenuItemDetalleMostrarOcultarParametroFuncional.setVisible((this.isVisibilidadCeldaOrdenParametroFuncional && this.isPermisoOrdenParametroFuncional));			
			this.jMenuItemNuevoRelacionesParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFuncional && this.isPermisoNuevoParametroFuncional));			
			this.jMenuItemNuevoGuardarCambiosParametroFuncional.setVisible((this.isVisibilidadCeldaNuevoParametroFuncional && this.isPermisoNuevoParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));									
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemModificarParametroFuncional.setVisible((this.isVisibilidadCeldaModificarParametroFuncional && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemActualizarParametroFuncional.setVisible((this.isVisibilidadCeldaActualizarParametroFuncional && this.isPermisoActualizarParametroFuncional));	
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemEliminarParametroFuncional.setVisible((this.isVisibilidadCeldaEliminarParametroFuncional && this.isPermisoEliminarParametroFuncional));
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemCancelarParametroFuncional.setVisible(this.isVisibilidadCeldaCancelarParametroFuncional);				
			}
			
			this.jMenuItemGuardarCambiosParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));						
			this.jMenuItemGuardarCambiosTablaParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroFuncional=this.jButtonNuevoParametroFuncional.isVisible();
			this.isVisibilidadCeldaDuplicarParametroFuncional=this.jButtonDuplicarParametroFuncional.isVisible();
			this.isVisibilidadCeldaCopiarParametroFuncional=this.jButtonCopiarParametroFuncional.isVisible();
			this.isVisibilidadCeldaVerFormParametroFuncional=this.jButtonVerFormParametroFuncional.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroFuncional=this.jButtonAbrirOrderByParametroFuncional.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=this.jButtonNuevoRelacionesParametroFuncional.isVisible();
			this.isVisibilidadCeldaModificarParametroFuncional=this.jButtonModificarParametroFuncional.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.isVisibilidadCeldaActualizarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.isVisible();
			this.isVisibilidadCeldaEliminarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.isVisible();
			this.isVisibilidadCeldaCancelarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.isVisible();
			this.isVisibilidadCeldaGuardarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=this.jButtonGuardarCambiosTablaParametroFuncional.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroFuncional=this.jButtonNuevoToolBarParametroFuncional.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=this.jButtonNuevoRelacionesToolBarParametroFuncional.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.isVisibilidadCeldaModificarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarToolBarParametroFuncional.isVisible();
			this.isVisibilidadCeldaActualizarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarToolBarParametroFuncional.isVisible();
			this.isVisibilidadCeldaEliminarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarToolBarParametroFuncional.isVisible();
			this.isVisibilidadCeldaCancelarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarToolBarParametroFuncional.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroFuncional=this.jButtonGuardarCambiosToolBarParametroFuncional.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=this.jButtonGuardarCambiosTablaToolBarParametroFuncional.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroFuncional=this.jMenuItemNuevoParametroFuncional.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=this.jMenuItemNuevoRelacionesParametroFuncional.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.isVisibilidadCeldaModificarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jMenuItemModificarParametroFuncional.isVisible();
			this.isVisibilidadCeldaActualizarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jMenuItemActualizarParametroFuncional.isVisible();
			this.isVisibilidadCeldaEliminarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jMenuItemEliminarParametroFuncional.isVisible();
			this.isVisibilidadCeldaCancelarParametroFuncional=this.jInternalFrameDetalleFormParametroFuncional.jMenuItemCancelarParametroFuncional.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroFuncional=this.jMenuItemGuardarCambiosParametroFuncional.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=this.jMenuItemGuardarCambiosTablaParametroFuncional.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroFuncional(Boolean esInicializar) {
		if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroFuncional();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroFuncional(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroFuncional() {
		this.jButtonNuevoParametroFuncional.setVisible(this.isPermisoNuevoParametroFuncional);			
		this.jButtonDuplicarParametroFuncional.setVisible(this.isPermisoDuplicarParametroFuncional);			
		this.jButtonCopiarParametroFuncional.setVisible(this.isPermisoCopiarParametroFuncional);			
		this.jButtonVerFormParametroFuncional.setVisible(this.isPermisoVerFormParametroFuncional);			
		
		this.jButtonAbrirOrderByParametroFuncional.setVisible(this.isPermisoOrdenParametroFuncional);					
		
		this.jButtonNuevoRelacionesParametroFuncional.setVisible(this.isPermisoNuevoParametroFuncional);			
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarParametroFuncional.setVisible(this.isPermisoActualizarParametroFuncional);	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.setVisible(this.isPermisoActualizarParametroFuncional);	
			this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.setVisible(this.isPermisoEliminarParametroFuncional);
			this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.setVisible(this.isVisibilidadCeldaCancelarParametroFuncional);						
			this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.setVisible(this.isPermisoGuardarCambiosParametroFuncional);							
		}
		
		this.jButtonGuardarCambiosTablaParametroFuncional.setVisible(this.isPermisoActualizarParametroFuncional);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroFuncional() {
		this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarParametroFuncional.setVisible(this.isPermisoActualizarParametroFuncional);	
		this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.setVisible(this.isPermisoActualizarParametroFuncional);	
		this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.setVisible(this.isPermisoEliminarParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.setVisible(this.isVisibilidadCeldaCancelarParametroFuncional);							
		this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.setVisible((this.isVisibilidadCeldaGuardarParametroFuncional && this.isPermisoGuardarCambiosParametroFuncional));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroFuncional() {
		if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroFuncional();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroFuncional() {
	}
	
	public void jTableDatosParametroFuncionalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroFuncional(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroFuncionalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.getparametrofuncional(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofuncional==null) {
						this.parametrofuncional = new ParametroFuncional();
					}

					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				}

				if(this.parametrofuncional.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrofuncional.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFuncional(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_copia_clientesParametroFuncionalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.getparametrofuncional(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofuncional==null) {
						this.parametrofuncional = new ParametroFuncional();
					}

					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				}

				if(this.parametrofuncional.getcon_copia_clientes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_copia_clientes = "+this.parametrofuncional.getcon_copia_clientes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFuncional(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_copia_proveedorParametroFuncionalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.getparametrofuncional(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofuncional==null) {
						this.parametrofuncional = new ParametroFuncional();
					}

					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				}

				if(this.parametrofuncional.getcon_copia_proveedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_copia_proveedor = "+this.parametrofuncional.getcon_copia_proveedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFuncional(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_proveedor_clienteParametroFuncionalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.getparametrofuncional(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofuncional==null) {
						this.parametrofuncional = new ParametroFuncional();
					}

					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);
				}

				if(this.parametrofuncional.getcon_proveedor_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_proveedor_cliente = "+this.parametrofuncional.getcon_proveedor_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFuncional(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameParametroFuncional() {
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
			this.jInternalFrameDetalleFormParametroFuncional.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroFuncional.dispose();
			this.jInternalFrameDetalleFormParametroFuncional=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
			this.jInternalFrameReporteDinamicoParametroFuncional.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroFuncional.dispose();
			this.jInternalFrameReporteDinamicoParametroFuncional=null;
		}
		
		if(this.jInternalFrameImportacionParametroFuncional!=null) {
			this.jInternalFrameImportacionParametroFuncional.setVisible(false);	    			
			this.jInternalFrameImportacionParametroFuncional.dispose();
			this.jInternalFrameImportacionParametroFuncional=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroFuncional();
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroFuncional")) {
				jButtonDuplicarParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroFuncional")) {
				jButtonCopiarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroFuncional")) {
				jButtonVerFormParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroFuncional")) {
				jButtonDuplicarParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroFuncional")) {
				jButtonDuplicarParametroFuncionalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroFuncional")) {
				jButtonModificarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroFuncional")) {
				jButtonModificarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroFuncional")) {
				jButtonModificarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroFuncional")) {
				jButtonActualizarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroFuncional")) {
				jButtonActualizarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroFuncional")) {
				jButtonActualizarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroFuncional")) {
				jButtonEliminarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroFuncional")) {
				jButtonEliminarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroFuncional")) {
				jButtonEliminarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroFuncional")) {
				jButtonCancelarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroFuncional")) {
				jButtonCancelarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroFuncional")) {
				jButtonCancelarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroFuncional")) {
				jButtonCerrarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroFuncional")) {
				jButtonCerrarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroFuncional")) {
				jButtonCerrarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroFuncional")) {
				jButtonMostrarOcultarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroFuncional")) {
				jButtonCancelarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroFuncional")) {
				jButtonCopiarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroFuncional")) {
				jButtonVerFormParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroFuncional")) {
				jButtonCopiarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroFuncional")) {
				jButtonVerFormParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroFuncional")) {
				jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroFuncional")) {
				jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroFuncional")) {
				jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroFuncional")) {
				jButtonAnterioresParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroFuncional")) {
				jButtonAnterioresParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroFuncional")) {
				jButtonAnterioresParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroFuncional")) {
				jButtonSiguientesParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroFuncional")) {
				jButtonSiguientesParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroFuncional")) {
				jButtonSiguientesParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroFuncional") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroFuncional")) {
				jButtonAbrirOrderByParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroFuncional") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroFuncional")) {
				jButtonMostrarOcultarParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroFuncional")) {
				jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroFuncional")) {
				jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroFuncional")) {
				jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroFuncional")) {
				jButtonCerrarReporteDinamicoParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroFuncional")) {
				jButtonGenerarReporteDinamicoParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroFuncional")) {
				
				jButtonGenerarExcelReporteDinamicoParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroFuncional")) {
				jButtonCerrarImportacionParametroFuncionalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroFuncional")) {
				
				jButtonGenerarImportacionParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroFuncional")) {
				
				jButtonAbrirImportacionParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroFuncional")) {
				jComboBoxTiposAccionesParametroFuncionalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroFuncional")) {
				jComboBoxTiposRelacionesParametroFuncionalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroFuncional")) {
				jComboBoxTiposAccionesParametroFuncionalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroFuncional")) {
				
				jComboBoxTiposSeleccionarParametroFuncionalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroFuncional")) {
				jTextFieldValorCampoGeneralParametroFuncionalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroFuncional")) {
				jButtonAbrirOrderByParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroFuncional")) {
				jButtonAbrirOrderByParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroFuncional")) {
				jButtonCerrarOrderByParametroFuncionalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroFuncionalBusqueda")) {
				this.jButtonidParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copia_clientesParametroFuncionalBusqueda")) {
				this.jButtoncon_copia_clientesParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copia_proveedorParametroFuncionalBusqueda")) {
				this.jButtoncon_copia_proveedorParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_proveedor_clienteParametroFuncionalBusqueda")) {
				this.jButtoncon_proveedor_clienteParametroFuncionalBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroFuncional();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroFuncional parametrofuncionalLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrofuncionalLocal=this.parametrofuncional;
			} else {
				parametrofuncionalLocal=this.parametrofuncionalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
							
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
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
			
			


			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
								
						
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
								
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
							
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
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
			
			


			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
								
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroFuncional")) {
					jCheckBoxSeleccionarTodosParametroFuncionalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroFuncional")) {
					jCheckBoxSeleccionadosParametroFuncionalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroFuncional")) {
					
				}
				
				


				
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
												
				
				


				
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
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
			
			


			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFuncionalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofuncional);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofuncional);
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
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
				
				


				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFuncional.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFuncional.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFuncionalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofuncionalAnterior =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroFuncional")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroFuncionalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroFuncional.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrofuncional =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrofuncional =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrofuncional);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroFuncional")) {
				
				}
				
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroFuncional")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroFuncional.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroFuncional")) {
			
			}
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroFuncional();
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			if(sTipo.equals("NuevoParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroFuncional")) {
				jButtonDuplicarParametroFuncionalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroFuncional")) {
				jButtonCopiarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroFuncional")) {
				jButtonVerFormParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroFuncional")) {
				jButtonNuevoParametroFuncionalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroFuncional")) {
				jButtonModificarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroFuncional")) {
				jButtonActualizarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroFuncional")) {
				jButtonEliminarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroFuncional")) {
				jButtonCancelarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroFuncional")) {
				jButtonCerrarParametroFuncionalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroFuncional")) {
				jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroFuncional")) {
				jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroFuncional")) {
				jButtonAbrirOrderByParametroFuncionalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroFuncional")) {
				jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroFuncional")) {
				jButtonAnterioresParametroFuncionalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroFuncional")) {
				jButtonSiguientesParametroFuncionalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroFuncionalBusqueda")) {
				this.jButtonidParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copia_clientesParametroFuncionalBusqueda")) {
				this.jButtoncon_copia_clientesParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copia_proveedorParametroFuncionalBusqueda")) {
				this.jButtoncon_copia_proveedorParametroFuncionalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_proveedor_clienteParametroFuncionalBusqueda")) {
				this.jButtoncon_proveedor_clienteParametroFuncionalBusquedaActionPerformed(evt);
			}
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroFuncional();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroFuncional")) {
				closingInternalFrameParametroFuncional();
				
			} else if(sTipo.equals("jButtonCancelarParametroFuncional")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroFuncional = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroFuncionalBeanSwingJInternalFrame jInternalFrameParent=(ParametroFuncionalBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroFuncional.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroFuncionalActionPerformed(null);
			}
			
			ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrofuncional,new Object(),this.parametrofuncionalParameterGeneral,this.parametrofuncionalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroFuncional(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroFuncional(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroFuncional(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrofuncional)) {
			if(!esControlTabla) {
				if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);			
				}
				
				if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroFuncional(this.parametrofuncional,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrofuncionalReturnGeneral=parametrofuncionalLogic.procesarEventosParametroFuncionalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofuncionalLogic.getParametroFuncionals(),this.parametrofuncional,this.parametrofuncionalParameterGeneral,this.isEsNuevoParametroFuncional,classes);//this.parametrofuncionalLogic.getParametroFuncional()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroFuncional(this.parametrofuncionalReturnGeneral,this.parametrofuncionalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroFuncional(classes,this.parametrofuncionalReturnGeneral,this.parametrofuncionalBean,false);
					}
						
					if(this.parametrofuncionalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional());	
					}
						
					if(this.parametrofuncionalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional(),classes);//this.parametrofuncionalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroFuncional(this.parametrofuncional,classes);//this.parametrofuncionalBean);									
				}
			
				if(ParametroFuncionalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroFuncional(this.parametrofuncional,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFuncional(this.parametrofuncional);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrofuncionalAnterior!=null) {
						this.parametrofuncional=this.parametrofuncionalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrofuncionalReturnGeneral=parametrofuncionalLogic.procesarEventosParametroFuncionalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofuncionalLogic.getParametroFuncionals(),this.parametrofuncional,this.parametrofuncionalParameterGeneral,this.isEsNuevoParametroFuncional,classes);//this.parametrofuncionalLogic.getParametroFuncional()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrofuncionalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrofuncionalReturnGeneral.getParametroFuncional(),parametrofuncionalLogic.getParametroFuncionals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrofuncionalReturnGeneral.getParametroFuncional(),this.parametrofuncionals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroFuncional.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroFuncional.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroFuncional();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroFuncional() throws Exception {
		
		ParametroFuncionalModel parametrofuncionalModel=(ParametroFuncionalModel)this.jTableDatosParametroFuncional.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofuncionalModel.parametrofuncionals=this.parametrofuncionalLogic.getParametroFuncionals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrofuncionalModel.parametrofuncionals=this.parametrofuncionals;
		}
		
		
		((ParametroFuncionalModel) this.jTableDatosParametroFuncional.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroFuncional() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrofuncionalAnterior(),this.parametrofuncionalLogic.getParametroFuncionals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrofuncionalAnterior(),this.parametrofuncionals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroFuncional();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroFuncional(ParametroFuncional parametrofuncional,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
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
										
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofuncional,new Object(),generalEntityParameterGeneral,this.parametrofuncionalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroFuncionalConstantesFunciones.getClassesRelationshipsOfParametroFuncional(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroFuncionalConstantesFunciones.getClassesRelationshipsFromStringsOfParametroFuncional(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroFuncional(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroFuncionalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofuncional,new Object(),generalEntityParameterGeneral,this.parametrofuncionalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroFuncional(ParametroFuncionalBean parametrofuncionalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroFuncional(ArrayList<Classe> classes,ParametroFuncionalReturnGeneral parametrofuncionalReturnGeneral,ParametroFuncionalBean parametrofuncionalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroFuncional(ParametroFuncional parametrofuncional,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrofuncional)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroFuncional = new ParametroFuncionalDetalleFormJInternalFrame(jDesktopPane,this.parametrofuncionalSessionBean.getConGuardarRelaciones(),this.parametrofuncionalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.setVisible(false);
		this.jInternalFrameDetalleFormParametroFuncional.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroFuncional.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroFuncional.parametrofuncionalLogic=this.parametrofuncionalLogic;
		
		this.cargarCombosFrameForeignKeyParametroFuncional("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroFuncional();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroFuncional();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroFuncional("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroFuncional();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroFuncional.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroFuncional"));
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarParametroFuncional.addActionListener(new ButtonActionListener(this,"ModificarParametroFuncional"));

		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroFuncional"));
					
		this.jInternalFrameDetalleFormParametroFuncional.jMenuItemModificarParametroFuncional.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroFuncional"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.addActionListener (new ButtonActionListener(this,"ActualizarParametroFuncional"));
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroFuncional"));
						
		this.jInternalFrameDetalleFormParametroFuncional.jMenuItemActualizarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroFuncional"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.addActionListener (new ButtonActionListener(this,"EliminarParametroFuncional"));
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroFuncional"));
								
		this.jInternalFrameDetalleFormParametroFuncional.jMenuItemEliminarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroFuncional"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.addActionListener (new ButtonActionListener(this,"CancelarParametroFuncional"));
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroFuncional"));
					
		this.jInternalFrameDetalleFormParametroFuncional.jMenuItemCancelarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroFuncional"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jMenuItemDetalleCerrarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroFuncional"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFuncional"));
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFuncional"));
		
		
		
		this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroFuncional"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtonidParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_clientesParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_clientesParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_proveedorParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_proveedorParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_proveedor_clienteParametroFuncionalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroFuncional"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroFuncional"));
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroFuncional"));
		}
		
		this.jTableDatosParametroFuncional.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroFuncional"));
		
		this.jTableDatosParametroFuncional.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroFuncional"));
		
		this.jButtonNuevoParametroFuncional.addActionListener(new ButtonActionListener(this,"NuevoParametroFuncional"));
		
		this.jButtonDuplicarParametroFuncional.addActionListener(new ButtonActionListener(this,"DuplicarParametroFuncional"));
		
		this.jButtonCopiarParametroFuncional.addActionListener(new ButtonActionListener(this,"CopiarParametroFuncional"));
		
		this.jButtonVerFormParametroFuncional.addActionListener(new ButtonActionListener(this,"VerFormParametroFuncional"));
		
		
		this.jButtonNuevoToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroFuncional"));
			
		this.jButtonDuplicarToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroFuncional"));
			
		this.jMenuItemNuevoParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroFuncional"));
			
		this.jMenuItemDuplicarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroFuncional"));		
		
		
		this.jButtonNuevoRelacionesParametroFuncional.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroFuncional"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroFuncional"));
			
		this.jMenuItemNuevoRelacionesParametroFuncional.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroFuncional"));		
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarParametroFuncional.addActionListener(new ButtonActionListener(this,"ModificarParametroFuncional"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonModificarToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroFuncional"));
			
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemModificarParametroFuncional.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroFuncional"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarParametroFuncional.addActionListener (new ButtonActionListener(this,"ActualizarParametroFuncional"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonActualizarToolBarParametroFuncional.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroFuncional"));
				
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemActualizarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroFuncional"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarParametroFuncional.addActionListener (new ButtonActionListener(this,"EliminarParametroFuncional"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonEliminarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroFuncional"));
						
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemEliminarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroFuncional"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarParametroFuncional.addActionListener (new ButtonActionListener(this,"CancelarParametroFuncional"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonCancelarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroFuncional"));
			
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemCancelarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroFuncional"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroFuncional"));		
		
		
		this.jButtonCerrarParametroFuncional.addActionListener (new ButtonActionListener(this,"CerrarParametroFuncional"));
		
		
		this.jButtonCerrarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroFuncional"));
			
		this.jMenuItemCerrarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroFuncional"));
			
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jMenuItemDetalleCerrarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroFuncional"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroFuncional"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFuncional"));
		}
		
		this.jButtonCopiarToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroFuncional"));
			
		this.jButtonVerFormToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroFuncional"));
		
		this.jMenuItemGuardarCambiosParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroFuncional"));
			
		this.jMenuItemCopiarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroFuncional"));		
		
		this.jMenuItemVerFormParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroFuncional"));		
		
		
		this.jButtonGuardarCambiosTablaParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroFuncional"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroFuncional"));
			
		this.jMenuItemGuardarCambiosTablaParametroFuncional.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroFuncional"));		
		
		
		
		this.jButtonRecargarInformacionParametroFuncional.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroFuncional"));
					
		this.jButtonRecargarInformacionToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroFuncional"));
		
		this.jMenuItemRecargarInformacionParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroFuncional"));		
		
		
		
		this.jButtonAnterioresParametroFuncional.addActionListener (new ButtonActionListener(this,"AnterioresParametroFuncional"));
		
		
		this.jButtonAnterioresToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroFuncional"));
		
		this.jMenuItemAnterioresParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroFuncional"));		
		
		
		this.jButtonSiguientesParametroFuncional.addActionListener (new ButtonActionListener(this,"SiguientesParametroFuncional"));
		
		
		this.jButtonSiguientesToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroFuncional"));
			
		this.jMenuItemSiguientesParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroFuncional"));
			
		this.jMenuItemAbrirOrderByParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroFuncional"));
			
		this.jMenuItemMostrarOcultarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroFuncional"));
			
		this.jMenuItemDetalleAbrirOrderByParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroFuncional"));
			
		this.jMenuItemDetalleMostarOcultarParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroFuncional"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroFuncional.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroFuncional"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroFuncional"));
			
		this.jMenuItemNuevoGuardarCambiosParametroFuncional.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroFuncional"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroFuncional.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroFuncional"));

		this.jCheckBoxSeleccionadosParametroFuncional.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroFuncional"));
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroFuncional"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroFuncional.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroFuncional"));
			
		this.jComboBoxTiposAccionesParametroFuncional.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroFuncional"));
					
		this.jComboBoxTiposSeleccionarParametroFuncional.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroFuncional"));
			
		this.jTextFieldValorCampoGeneralParametroFuncional.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroFuncional"));		
		
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtonidParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_clientesParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_clientesParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_proveedorParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_proveedorParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_proveedor_clienteParametroFuncionalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroFuncional!=null) {
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFuncional"));
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFuncional"));
				this.jInternalFrameReporteDinamicoParametroFuncional.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFuncional"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroFuncional.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFuncional"));				
			//this.jButtonGenerarReporteDinamicoParametroFuncional.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFuncional"));
			//this.jButtonGenerarExcelReporteDinamicoParametroFuncional.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFuncional"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroFuncional!=null) {
				this.jInternalFrameImportacionParametroFuncional.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroFuncional"));
				this.jInternalFrameImportacionParametroFuncional.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroFuncional"));
				this.jInternalFrameImportacionParametroFuncional.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroFuncional"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroFuncional.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroFuncional"));
			
			this.jButtonAbrirOrderByToolBarParametroFuncional.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroFuncional"));			
			
			if(this.jInternalFrameOrderByParametroFuncional!=null) {
				this.jInternalFrameOrderByParametroFuncional.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroFuncional"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFuncional.jTabbedPaneRelacionesParametroFuncional.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroFuncional"));
		
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
            		closingInternalFrameParametroFuncional();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroFuncional.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroFuncional = (JInternalFrameBase)event.getSource();
	            	
	            ParametroFuncionalBeanSwingJInternalFrame jInternalFrameParent=(ParametroFuncionalBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroFuncional.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroFuncionalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroFuncional.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroFuncionalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroFuncional.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroFuncional.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroFuncional";
		inputMap = this.jButtonNuevoParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroFuncionalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFuncionalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroFuncional";
		inputMap = this.jButtonNuevoRelacionesParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroFuncionalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroFuncional";
		inputMap = this.jButtonModificarParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroFuncional";
		inputMap = this.jButtonActualizarParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroFuncional";
		inputMap = this.jButtonEliminarParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroFuncional";
		inputMap = this.jButtonCancelarParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroFuncional";
		inputMap = this.jButtonCerrarParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroFuncional";
		inputMap = this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroFuncional.jButtonGuardarCambiosParametroFuncional.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroFuncionalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroFuncional.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroFuncionalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroFuncional.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroFuncionalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroFuncional.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroFuncionalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroFuncional.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroFuncionalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtonidParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_clientesParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_clientesParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_copia_proveedorParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_copia_proveedorParametroFuncionalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFuncional.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.addActionListener(new ButtonActionListener(this,"con_proveedor_clienteParametroFuncionalBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroFuncional.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroFuncionalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroFuncionalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroFuncional.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroFuncional(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
					parametrofuncionalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFuncional parametrofuncionalAux:parametrofuncionals) {
					parametrofuncionalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroFuncionalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
						parametrofuncionalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFuncional parametrofuncionalAux:parametrofuncionals) {
						parametrofuncionalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
					
						if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES)) {
							existe=true;
							parametrofuncionalAux.setcon_copia_clientes(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR)) {
							existe=true;
							parametrofuncionalAux.setcon_copia_proveedor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE)) {
							existe=true;
							parametrofuncionalAux.setcon_proveedor_cliente(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFuncional parametrofuncionalAux:parametrofuncionals) {
						
						if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES)) {
							existe=true;
							parametrofuncionalAux.setcon_copia_clientes(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR)) {
							existe=true;
							parametrofuncionalAux.setcon_copia_proveedor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE)) {
							existe=true;
							parametrofuncionalAux.setcon_proveedor_cliente(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroFuncional(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroFuncional.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroFuncional.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroFuncionalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroFuncional.getSelectedRows();
			
			ParametroFuncional parametrofuncionalLocal=new ParametroFuncional();
			
			//this.seleccionarTodosParametroFuncional(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofuncionalLocal =(ParametroFuncional) this.parametrofuncionalLogic.getParametroFuncionals().toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrofuncionalLocal =(ParametroFuncional) this.parametrofuncionals.toArray()[this.jTableDatosParametroFuncional.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrofuncionalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
						parametrofuncionalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFuncional parametrofuncionalAux:parametrofuncionals) {
						parametrofuncionalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroFuncional(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroFuncional.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroFuncional.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroFuncional,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroFuncionalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroFuncionalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroFuncionalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroFuncional.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionalLogic.getParametroFuncionals()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFuncional parametrofuncionalAux:parametrofuncionals) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroFuncional(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroFuncionalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroFuncional=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroFuncional.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroFuncional) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroFuncional(conSplash);
				
					this.generarReporteParametroFuncionalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroFuncionalsSeleccionados();
				//this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroFuncionalsSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroFuncionalsSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroFuncional();
				
				this.exportarParametroFuncionalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroFuncionals();
				//this.importarParametroFuncionals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroFuncional();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroFuncionalsSeleccionados();
				//this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Funcional", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroFuncional();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroFuncional)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroFuncional(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroFuncionalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroFuncional) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroFuncional(conSplash);
					
						//this.actualizarParametrosGeneralParametroFuncional();
						
						this.generarReporteProcesoAccionParametroFuncionalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroFuncionalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro FuncionalES SELECCIONADOS?", "MANTENIMIENTO DE Parametro Funcional", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroFuncional();
				
						this.actualizarParametrosGeneralParametroFuncional();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrofuncionalReturnGeneral=parametrofuncionalLogic.procesarAccionParametroFuncionalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrofuncionalLogic.getParametroFuncionals(),this.parametrofuncionalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroFuncionalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroFuncional();
					
					ParametroFuncionalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroFuncionalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroFuncional.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroFuncional.jComboBoxTiposAccionesFormularioParametroFuncional.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroFuncional(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroFuncionalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroFuncional();
			
			if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
			ParametroFuncional parametrofuncional=new ParametroFuncional();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroFuncional(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroFuncional.getSelectedItem();
			
			
			
			
			parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrofuncionalsSeleccionados.size()==1) {
				for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
					parametrofuncional=parametrofuncionalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroFuncional();
			
      		//this.finishProcessParametroFuncional(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroFuncionalReturnGeneral() throws Exception {
		if(this.parametrofuncionalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrofuncionalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrofuncionalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrofuncionalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrofuncionalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrofuncionalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroFuncional(false);
		}
		
		if(this.parametrofuncionalReturnGeneral.getConRetornoLista() || this.parametrofuncionalReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrofuncionalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrofuncionalLogic.setParametroFuncionals(this.parametrofuncionalReturnGeneral.getParametroFuncionals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrofuncionalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrofuncionalLogic.setParametroFuncional(this.parametrofuncionalReturnGeneral.getParametroFuncional());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroFuncional(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroFuncional() throws Exception {
		
		
	}
	
	public ArrayList<ParametroFuncional> getParametroFuncionalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroFuncional) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroFuncional parametrofuncionalAux:parametrofuncionalLogic.getParametroFuncionals()) {
					if(parametrofuncionalAux.getIsSelected()) {
						parametrofuncionalsSeleccionados.add(parametrofuncionalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFuncional parametrofuncionalAux:this.parametrofuncionals) {
					if(parametrofuncionalAux.getIsSelected()) {
						parametrofuncionalsSeleccionados.add(parametrofuncionalAux);				
					}
				}
			}
			
			if(parametrofuncionalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrofuncionalsSeleccionados.addAll(this.parametrofuncionalLogic.getParametroFuncionals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrofuncionalsSeleccionados.addAll(this.parametrofuncionals);				
					}
				}
			}
		} else {
			parametrofuncionalsSeleccionados.add(this.parametrofuncional);
		}
		
		return parametrofuncionalsSeleccionados;
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
	
	public void generarReporteParametroFuncionalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroFuncionalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroFuncionalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroFuncionalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroFuncionalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Funcional",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroFuncionalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroFuncional();
		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroFuncional();
		
		
		//this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados ,parametrofuncionalImplementable,parametrofuncionalImplementableHome);
	}
	
	public void mostrarImportacionParametroFuncionals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroFuncional();
		
		this.abrirFrameImportacionParametroFuncional();		
		
			
		//this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados ,parametrofuncionalImplementable,parametrofuncionalImplementableHome);
	}
	
	public void importarParametroFuncionals() throws Exception {		
	
	}
	
	public void exportarParametroFuncionalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroFuncionalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroFuncionalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroFuncionalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Funcional",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroFuncional(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroFuncional(parametrofuncionalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrofuncionalAux.setsDetalleGeneralEntityReporte(parametrofuncionalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroFuncional(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroFuncionalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFuncionalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroFuncional(ParametroFuncional parametrofuncional,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrofuncional.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofuncional.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofuncional.getcon_copia_clientes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofuncional.getcon_copia_proveedor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofuncional.getcon_proveedor_cliente().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroFuncionals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroFuncional(row);				
				iRow++;
			}				
			
			for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroFuncional(parametrofuncionalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroFuncionalsSeleccionados() throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();		
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofuncional.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrofuncionals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrofuncional");
			//elementRoot.appendChild(element);
		
			for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
				element = document.createElement("parametrofuncional");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroFuncional(parametrofuncionalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Funcional",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroFuncional(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE);
	}
	
	public void getFilaDatosExportarExcelParametroFuncional(ParametroFuncional parametrofuncional,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofuncional.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofuncional.getcon_copia_clientes());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofuncional.getcon_copia_proveedor());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofuncional.getcon_proveedor_cliente());				
	}
	
	public void setFilaDatosExportarXmlParametroFuncional(ParametroFuncional parametrofuncional,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroFuncionalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrofuncional.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroFuncionalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrofuncional.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcon_copia_clientes = document.createElement(ParametroFuncionalConstantesFunciones.CONCOPIACLIENTES);
		elementcon_copia_clientes.appendChild(document.createTextNode(parametrofuncional.getcon_copia_clientes().toString().trim()));
		element.appendChild(elementcon_copia_clientes);

		Element elementcon_copia_proveedor = document.createElement(ParametroFuncionalConstantesFunciones.CONCOPIAPROVEEDOR);
		elementcon_copia_proveedor.appendChild(document.createTextNode(parametrofuncional.getcon_copia_proveedor().toString().trim()));
		element.appendChild(elementcon_copia_proveedor);

		Element elementcon_proveedor_cliente = document.createElement(ParametroFuncionalConstantesFunciones.CONPROVEEDORCLIENTE);
		elementcon_proveedor_cliente.appendChild(document.createTextNode(parametrofuncional.getcon_proveedor_cliente().toString().trim()));
		element.appendChild(elementcon_proveedor_cliente);
	}
	
	public void generarReporteGroupGenericoParametroFuncionalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados=new ArrayList<ParametroFuncional>();
		
		parametrofuncionalsSeleccionados=this.getParametroFuncionalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroFuncional(parametrofuncionalsSeleccionados);
		
		this.generarReporteParametroFuncionals("Todos",parametrofuncionalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroFuncional(ArrayList<ParametroFuncional> parametrofuncionalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroFuncional parametrofuncionalAux:parametrofuncionalsSeleccionados) {
				parametrofuncionalAux.setsDetalleGeneralEntityReporte(parametrofuncionalAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES)) {
					existe=true;
					parametrofuncionalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrofuncionalAux.getcon_copia_clientes()));
				}
				 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR)) {
					existe=true;
					parametrofuncionalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrofuncionalAux.getcon_copia_proveedor()));
				}
				 else if(sTipoSeleccionar.equals(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE)) {
					existe=true;
					parametrofuncionalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrofuncionalAux.getcon_proveedor_cliente()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFuncionalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroFuncional(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroFuncional=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=true;
				this.isVisibilidadCeldaGuardarCambiosParametroFuncional=true;
			}
			
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=true;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=true;
			this.isVisibilidadCeldaEliminarParametroFuncional=true;
			this.isVisibilidadCeldaCancelarParametroFuncional=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=true;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroFuncional=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=true;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=true;
			this.isVisibilidadCeldaModificarParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
			this.isVisibilidadCeldaModificarParametroFuncional=true;
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
			this.isVisibilidadCeldaCancelarParametroFuncional=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFuncional=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroFuncional=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=true;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=true;
		} else {
			this.actualizarEstadoPanelsParametroFuncional(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroFuncional=false;
			//this.isVisibilidadCeldaVerFormParametroFuncional=false;
			this.isVisibilidadCeldaDuplicarParametroFuncional=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrofuncionalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroFuncional=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFuncional=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			if(!parametrofuncionalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;												
			}
			
			this.jButtonCerrarParametroFuncional.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroFuncional=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrofuncional)) {
			this.isVisibilidadCeldaActualizarParametroFuncional=false;
			this.isVisibilidadCeldaEliminarParametroFuncional=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroFuncional() {
	}
	
	public void actualizarEstadoPanelsParametroFuncional(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroFuncional!=null) {
				this.jScrollPanelDatosEdicionParametroFuncional.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParametroFuncional!=null) {
				this.jScrollPanelDatosParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFuncional!=null) {
				this.jPanelPaginacionParametroFuncional.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFuncional!=null) {
				this.jPanelParametrosReportesParametroFuncional.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroFuncionalSessionBean parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		
		if(this.parametrofuncionalSessionBean==null) {
			this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		}
		
		this.parametrofuncionalSessionBean.setsUltimaBusquedaParametroFuncional(this.getsAccionBusqueda());
		this.parametrofuncionalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrofuncionalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroFuncionalSessionBean parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		
		if(this.parametrofuncionalSessionBean==null) {
			this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		}
		
		if(this.parametrofuncionalSessionBean.getsUltimaBusquedaParametroFuncional()!=null&&!this.parametrofuncionalSessionBean.getsUltimaBusquedaParametroFuncional().equals("")) {
			this.setsAccionBusqueda(parametrofuncionalSessionBean.getsUltimaBusquedaParametroFuncional());
			this.setiNumeroPaginacion(parametrofuncionalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrofuncionalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.parametrofuncionalSessionBean.setsUltimaBusquedaParametroFuncional("");
		this.parametrofuncionalSessionBean.setiNumeroPaginacion(ParametroFuncionalConstantesFunciones.INUMEROPAGINACION);
		this.parametrofuncionalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroFuncional(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroFuncional() {
		this.updateBorderResaltarBusquedasFormularioParametroFuncional();
		this.updateVisibilidadBusquedasFormularioParametroFuncional();
		this.updateHabilitarBusquedasFormularioParametroFuncional();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroFuncional() {					
	}
	
	public void updateVisibilidadBusquedasFormularioParametroFuncional() {
	}
	
	public void updateHabilitarBusquedasFormularioParametroFuncional() {
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
	
	public void updateControlesFormularioParametroFuncional() throws Exception {

		if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroFuncional();
		this.updateVisibilidadResaltarControlesFormularioParametroFuncional();
		this.updateHabilitarResaltarControlesFormularioParametroFuncional();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroFuncional() throws Exception {
		if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrofuncionalConstantesFunciones.resaltaridParametroFuncional!=null && this.jInternalFrameDetalleFormParametroFuncional!=null) {this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setBorder(this.parametrofuncionalConstantesFunciones.resaltaridParametroFuncional);}
		if(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_clientesParametroFuncional!=null && this.jInternalFrameDetalleFormParametroFuncional!=null) {this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setBorderPainted(true);this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setBorder(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_clientesParametroFuncional);}
		if(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_proveedorParametroFuncional!=null && this.jInternalFrameDetalleFormParametroFuncional!=null) {this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setBorderPainted(true);this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setBorder(this.parametrofuncionalConstantesFunciones.resaltarcon_copia_proveedorParametroFuncional);}
		if(this.parametrofuncionalConstantesFunciones.resaltarcon_proveedor_clienteParametroFuncional!=null && this.jInternalFrameDetalleFormParametroFuncional!=null) {this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setBorderPainted(true);this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setBorder(this.parametrofuncionalConstantesFunciones.resaltarcon_proveedor_clienteParametroFuncional);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroFuncional() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
	
		//this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostraridParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jPanelidParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostraridParametroFuncional);
		//this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_clientesParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jPanelcon_copia_clientesParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_clientesParametroFuncional);
		//this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_proveedorParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jPanelcon_copia_proveedorParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_copia_proveedorParametroFuncional);
		//this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_proveedor_clienteParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jPanelcon_proveedor_clienteParametroFuncional.setVisible(this.parametrofuncionalConstantesFunciones.mostrarcon_proveedor_clienteParametroFuncional);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroFuncional() throws Exception {
		if(this.jInternalFrameDetalleFormParametroFuncional==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroFuncional!=null) {
	
		this.jInternalFrameDetalleFormParametroFuncional.jLabelidParametroFuncional.setEnabled(this.parametrofuncionalConstantesFunciones.activaridParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_clientesParametroFuncional.setEnabled(this.parametrofuncionalConstantesFunciones.activarcon_copia_clientesParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_copia_proveedorParametroFuncional.setEnabled(this.parametrofuncionalConstantesFunciones.activarcon_copia_proveedorParametroFuncional);
		this.jInternalFrameDetalleFormParametroFuncional.jCheckBoxcon_proveedor_clienteParametroFuncional.setEnabled(this.parametrofuncionalConstantesFunciones.activarcon_proveedor_clienteParametroFuncional);
		}
	}
	
		
}