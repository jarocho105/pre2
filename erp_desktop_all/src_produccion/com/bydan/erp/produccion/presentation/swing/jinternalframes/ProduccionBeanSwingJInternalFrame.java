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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.ProduccionConstantesFunciones;
import com.bydan.erp.produccion.util.ProduccionParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProduccionParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProduccionBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
public class ProduccionBeanSwingJInternalFrame extends ProduccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProduccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Produccion> produccionValidator = new ClassValidator<Produccion>(Produccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Produccion produccion;	
	public Produccion produccionAux;
	public Produccion produccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Produccion produccionTotales;
	public Long idProduccionActual;
	public Long iIdNuevoProduccion=0L;
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
	
	public Boolean isPermisoTodoProduccion;
	public Boolean isPermisoNuevoProduccion;
	public Boolean isPermisoActualizarProduccion;
	public Boolean isPermisoActualizarOriginalProduccion;
	public Boolean isPermisoEliminarProduccion;
	public Boolean isPermisoGuardarCambiosProduccion;
	public Boolean isPermisoConsultaProduccion;
	public Boolean isPermisoBusquedaProduccion;
	public Boolean isPermisoReporteProduccion;
	public Boolean isPermisoPaginacionMedioProduccion;
	public Boolean isPermisoPaginacionAltoProduccion;
	public Boolean isPermisoPaginacionTodoProduccion;
	public Boolean isPermisoCopiarProduccion;
	public Boolean isPermisoVerFormProduccion;
	public Boolean isPermisoDuplicarProduccion;
	public Boolean isPermisoOrdenProduccion;
	
	
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
	
	public ProduccionParameterReturnGeneral produccionReturnGeneral;
	public ProduccionParameterReturnGeneral produccionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProduccion=false;
	public Boolean esParaAccionDesdeFormularioProduccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProduccionSessionBeanAdditional produccionSessionBeanAdditional=null;
	
	public ProduccionSessionBeanAdditional getProduccionSessionBeanAdditional() {
		return this.produccionSessionBeanAdditional;
	}
	
	public void setProduccionSessionBeanAdditional(ProduccionSessionBeanAdditional produccionSessionBeanAdditional) {
		try {
			this.produccionSessionBeanAdditional=produccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProduccionBeanSwingJInternalFrameAdditional produccionBeanSwingJInternalFrameAdditional=null;
	//public class ProduccionBeanSwingJInternalFrame
	
	public ProduccionBeanSwingJInternalFrameAdditional getProduccionBeanSwingJInternalFrameAdditional() {
		return this.produccionBeanSwingJInternalFrameAdditional;
	}
	
	public void setProduccionBeanSwingJInternalFrameAdditional(ProduccionBeanSwingJInternalFrameAdditional produccionBeanSwingJInternalFrameAdditional) {
		try {
			this.produccionBeanSwingJInternalFrameAdditional=produccionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProduccionLogic produccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Produccion produccionBean;
	public ProduccionConstantesFunciones produccionConstantesFunciones;
	//public ProduccionParameterReturnGeneral produccionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Produccion> produccions;	
	//public List<Produccion> produccionsEliminados;
	//public List<Produccion> produccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProduccion=false;
	public Boolean isVisibilidadCeldaDuplicarProduccion=true;
	public Boolean isVisibilidadCeldaCopiarProduccion=true;
	public Boolean isVisibilidadCeldaVerFormProduccion=true;
	public Boolean isVisibilidadCeldaOrdenProduccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProduccion=false;
	public Boolean isVisibilidadCeldaModificarProduccion=false;
	public Boolean isVisibilidadCeldaActualizarProduccion=false;
	public Boolean isVisibilidadCeldaEliminarProduccion=false;
	public Boolean isVisibilidadCeldaCancelarProduccion=false;
	public Boolean isVisibilidadCeldaGuardarProduccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProduccion=false;	
	
	
	
	public Long getiIdNuevoProduccion() {
		return this.iIdNuevoProduccion;
	}

	public void setiIdNuevoProduccion(Long iIdNuevoProduccion) {
		this.iIdNuevoProduccion = iIdNuevoProduccion;
	}
	
	public Long getidProduccionActual() {
		return this.idProduccionActual;
	}

	public void setidProduccionActual(Long idProduccionActual) {
		this.idProduccionActual = idProduccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Produccion getproduccion() {
		return this.produccion;
	}

	public void setproduccion(Produccion produccion) {
		this.produccion = produccion;
	}
	
	public Produccion getproduccionAux() {
		return this.produccionAux;
	}

	public void setproduccionAux(Produccion produccionAux) {
		this.produccionAux = produccionAux;
	}				
	
	public Produccion getproduccionAnterior() {
		return this.produccionAnterior;
	}

	public void setproduccionAnterior(Produccion produccionAnterior) {
		this.produccionAnterior = produccionAnterior;
	}	
	
	public Produccion getproduccionTotales() {
		return this.produccionTotales;
	}

	public void setproduccionTotales(Produccion produccionTotales) {
		this.produccionTotales = produccionTotales;
	}	
	
	public Produccion getproduccionBean() {
		return this.produccionBean;
	}

	public void setproduccionBean(Produccion produccionBean) {
		this.produccionBean = produccionBean;
	}	
	
	public ProduccionParameterReturnGeneral getproduccionReturnGeneral() {
		return this.produccionReturnGeneral;
	}

	public void setproduccionReturnGeneral(ProduccionParameterReturnGeneral produccionReturnGeneral) {
		this.produccionReturnGeneral = produccionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProduccionLogic getProduccionLogic()	{		
		return produccionLogic;
	}

	public void setProduccionLogic(ProduccionLogic produccionLogic) {
		this.produccionLogic = produccionLogic;
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
	
	public Boolean getIsEsNuevoProduccion() {
		return isEsNuevoProduccion;
	}

	public void setIsEsNuevoProduccion(Boolean isEsNuevoProduccion) {
		this.isEsNuevoProduccion = isEsNuevoProduccion;
	}

	public Boolean getEsParaAccionDesdeFormularioProduccion() {
		return esParaAccionDesdeFormularioProduccion;
	}
	
	public void setEsParaAccionDesdeFormularioProduccion(Boolean esParaAccionDesdeFormularioProduccion) {
		this.esParaAccionDesdeFormularioProduccion = esParaAccionDesdeFormularioProduccion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProduccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProduccionConstantesFunciones.refrescarForeignKeysDescripcionesProduccion(this.produccionLogic.getProduccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProduccionConstantesFunciones.refrescarForeignKeysDescripcionesProduccion(this.produccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//produccionLogic.setProduccions(this.produccions);
			produccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProduccionParameterReturnGeneral getProduccionParameterGeneral() {
		return this.produccionParameterGeneral;
	}
	
	public void setProduccionParameterGeneral(ProduccionParameterReturnGeneral produccionParameterGeneral) {
		this.produccionParameterGeneral = produccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProduccion() {
		return isPermisoTodoProduccion;
	}

	public void setIsPermisoTodoProduccion(Boolean isPermisoTodoProduccion) {
		this.isPermisoTodoProduccion = isPermisoTodoProduccion;
	}

	public Boolean getIsPermisoNuevoProduccion() {
		return isPermisoNuevoProduccion;
	}

	public void setIsPermisoNuevoProduccion(Boolean isPermisoNuevoProduccion) {
		this.isPermisoNuevoProduccion = isPermisoNuevoProduccion;
	}

	public Boolean getIsPermisoActualizarProduccion() {
		return isPermisoActualizarProduccion;
	}

	public void setIsPermisoActualizarProduccion(Boolean isPermisoActualizarProduccion) {
		this.isPermisoActualizarProduccion = isPermisoActualizarProduccion;
	}

	public Boolean getIsPermisoEliminarProduccion() {
		return isPermisoEliminarProduccion;
	}

	public void setIsPermisoEliminarProduccion(Boolean isPermisoEliminarProduccion) {
		this.isPermisoEliminarProduccion = isPermisoEliminarProduccion;
	}

	public Boolean getIsPermisoGuardarCambiosProduccion() {
		return isPermisoGuardarCambiosProduccion;
	}

	public void setIsPermisoGuardarCambiosProduccion(Boolean isPermisoGuardarCambiosProduccion) {
		this.isPermisoGuardarCambiosProduccion = isPermisoGuardarCambiosProduccion;
	}
	
	public Boolean getIsPermisoConsultaProduccion() {
		return isPermisoConsultaProduccion;
	}

	public void setIsPermisoConsultaProduccion(Boolean isPermisoConsultaProduccion) {
		this.isPermisoConsultaProduccion = isPermisoConsultaProduccion;
	}

	public Boolean getIsPermisoBusquedaProduccion() {
		return isPermisoBusquedaProduccion;
	}

	public void setIsPermisoBusquedaProduccion(Boolean isPermisoBusquedaProduccion) {
		this.isPermisoBusquedaProduccion = isPermisoBusquedaProduccion;
	}

	public Boolean getIsPermisoReporteProduccion() {
		return isPermisoReporteProduccion;
	}

	public void setIsPermisoReporteProduccion(Boolean isPermisoReporteProduccion) {
		this.isPermisoReporteProduccion = isPermisoReporteProduccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioProduccion() {
		return isPermisoPaginacionMedioProduccion;
	}

	public void setIsPermisoPaginacionMedioProduccion(Boolean isPermisoPaginacionMedioProduccion) {
		this.isPermisoPaginacionMedioProduccion = isPermisoPaginacionMedioProduccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoProduccion() {
		return isPermisoPaginacionTodoProduccion;
	}

	public void setIsPermisoPaginacionTodoProduccion(Boolean isPermisoPaginacionTodoProduccion) {
		this.isPermisoPaginacionTodoProduccion = isPermisoPaginacionTodoProduccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoProduccion() {
		return isPermisoPaginacionAltoProduccion;
	}

	public void setIsPermisoPaginacionAltoProduccion(Boolean isPermisoPaginacionAltoProduccion) {
		this.isPermisoPaginacionAltoProduccion = isPermisoPaginacionAltoProduccion;
	}
	
	public Boolean getIsPermisoCopiarProduccion() {
		return isPermisoCopiarProduccion;
	}

	public void setIsPermisoCopiarProduccion(Boolean isPermisoCopiarProduccion) {
		this.isPermisoCopiarProduccion = isPermisoCopiarProduccion;
	}
	
	public Boolean getIsPermisoVerFormProduccion() {
		return isPermisoVerFormProduccion;
	}

	public void setIsPermisoVerFormProduccion(Boolean isPermisoVerFormProduccion) {
		this.isPermisoVerFormProduccion = isPermisoVerFormProduccion;
	}
	
	public Boolean getIsPermisoDuplicarProduccion() {
		return isPermisoDuplicarProduccion;
	}

	public void setIsPermisoDuplicarProduccion(Boolean isPermisoDuplicarProduccion) {
		this.isPermisoDuplicarProduccion = isPermisoDuplicarProduccion;
	}
	
	public Boolean getIsPermisoOrdenProduccion() {
		return isPermisoOrdenProduccion;
	}

	public void setIsPermisoOrdenProduccion(Boolean isPermisoOrdenProduccion) {
		this.isPermisoOrdenProduccion = isPermisoOrdenProduccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProduccion() {
		return isVisibilidadCeldaNuevoProduccion;
	}

	public void setIsVisibilidadCeldaNuevoProduccion(Boolean isVisibilidadCeldaNuevoProduccion) {
		this.isVisibilidadCeldaNuevoProduccion = isVisibilidadCeldaNuevoProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProduccion() {
		return isVisibilidadCeldaDuplicarProduccion;
	}

	public void setIsVisibilidadCeldaDuplicarProduccion(Boolean isVisibilidadCeldaDuplicarProduccion) {
		this.isVisibilidadCeldaDuplicarProduccion = isVisibilidadCeldaDuplicarProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProduccion() {
		return isVisibilidadCeldaCopiarProduccion;
	}

	public void setIsVisibilidadCeldaCopiarProduccion(Boolean isVisibilidadCeldaCopiarProduccion) {
		this.isVisibilidadCeldaCopiarProduccion = isVisibilidadCeldaCopiarProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProduccion() {
		return isVisibilidadCeldaVerFormProduccion;
	}

	public void setIsVisibilidadCeldaVerFormProduccion(Boolean isVisibilidadCeldaVerFormProduccion) {
		this.isVisibilidadCeldaVerFormProduccion = isVisibilidadCeldaVerFormProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProduccion() {
		return isVisibilidadCeldaOrdenProduccion;
	}

	public void setIsVisibilidadCeldaOrdenProduccion(Boolean isVisibilidadCeldaOrdenProduccion) {
		this.isVisibilidadCeldaOrdenProduccion = isVisibilidadCeldaOrdenProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProduccion() {
		return isVisibilidadCeldaNuevoRelacionesProduccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProduccion(Boolean isVisibilidadCeldaNuevoRelacionesProduccion) {
		this.isVisibilidadCeldaNuevoRelacionesProduccion = isVisibilidadCeldaNuevoRelacionesProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProduccion() {
		return isVisibilidadCeldaModificarProduccion;
	}

	public void setIsVisibilidadCeldaModificarProduccion(Boolean isVisibilidadCeldaModificarProduccion) {
		this.isVisibilidadCeldaModificarProduccion = isVisibilidadCeldaModificarProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProduccion() {
		return isVisibilidadCeldaActualizarProduccion;
	}

	public void setIsVisibilidadCeldaActualizarProduccion(Boolean isVisibilidadCeldaActualizarProduccion) {
		this.isVisibilidadCeldaActualizarProduccion = isVisibilidadCeldaActualizarProduccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarProduccion() {
		return isVisibilidadCeldaEliminarProduccion;
	}

	public void setIsVisibilidadCeldaEliminarProduccion(Boolean isVisibilidadCeldaEliminarProduccion) {
		this.isVisibilidadCeldaEliminarProduccion = isVisibilidadCeldaEliminarProduccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarProduccion() {
		return isVisibilidadCeldaCancelarProduccion;
	}

	public void setIsVisibilidadCeldaCancelarProduccion(Boolean isVisibilidadCeldaCancelarProduccion) {
		this.isVisibilidadCeldaCancelarProduccion = isVisibilidadCeldaCancelarProduccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarProduccion() {
		return isVisibilidadCeldaGuardarProduccion;
	}

	public void setIsVisibilidadCeldaGuardarProduccion(Boolean isVisibilidadCeldaGuardarProduccion) {
		this.isVisibilidadCeldaGuardarProduccion = isVisibilidadCeldaGuardarProduccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProduccion() {
		return isVisibilidadCeldaGuardarCambiosProduccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProduccion(Boolean isVisibilidadCeldaGuardarCambiosProduccion) {
		this.isVisibilidadCeldaGuardarCambiosProduccion = isVisibilidadCeldaGuardarCambiosProduccion;
	}
		
	public ProduccionSessionBean getproduccionSessionBean() {
		return this.produccionSessionBean;
	}
	
	public void setproduccionSessionBean(ProduccionSessionBean produccionSessionBean) {
		this.produccionSessionBean=produccionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProduccion(Produccion produccion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Produccion produccion,Produccion produccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProduccion(produccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		produccionAux.setId(produccion.getId());
		produccionAux.setVersionRow(produccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProduccion();
		
			int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = produccionValidator.getInvalidValues(this.produccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			produccionLogic.setDatosCliente(datosCliente);
			produccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				produccionAux=new  Produccion();
				
				produccionAux.setIsNew(true);
				produccionAux.setIsChanged(true);
				
				produccionAux.setProduccionOriginal(this.produccion);
				
				produccionAux.setId(this.produccion.getId());	
				produccionAux.setVersionRow(this.produccion.getVersionRow());	
				produccionAux.setcodigo(this.produccion.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.produccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.produccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(produccionAux,produccionLogic.getProduccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(produccionAux,produccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.produccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.produccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						produccionLogic.saveProduccions();//WithConnection
						//produccionLogic.getSetVersionRowProduccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.produccion,produccionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.produccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								produccionLogic.saveProduccionRelaciones(produccionAux);//WithConnection
								//produccionLogic.getSetVersionRowProduccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.produccion,produccionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.produccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.produccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(produccionAux,produccionLogic.getProduccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(produccionAux,produccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.produccion,produccionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				produccionAux=new  Produccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.produccionSessionBean.getEsGuardarRelacionado() 
					|| (this.produccionSessionBean.getEsGuardarRelacionado() && this.produccion.getId()>=0)) {
						
					produccionAux.setIsNew(false);
				}
				
				produccionAux.setIsDeleted(false);
			
				produccionAux.setId(this.produccion.getId());	
				produccionAux.setVersionRow(this.produccion.getVersionRow());	
				produccionAux.setcodigo(this.produccion.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(produccionAux,produccionLogic.getProduccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(produccionAux,produccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.produccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.produccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						produccionLogic.saveProduccions();//WithConnection
						//produccionLogic.getSetVersionRowProduccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.produccion,produccionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.produccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								produccionLogic.saveProduccionRelaciones(produccionAux);//WithConnection
								//produccionLogic.getSetVersionRowProduccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.produccion,produccionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.produccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.produccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(produccionAux,produccionLogic.getProduccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(produccionAux,produccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.produccion,produccionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				produccionAux=new  Produccion();
				
				produccionAux.setIsNew(false);
				produccionAux.setIsChanged(false);
				
				produccionAux.setIsDeleted(true);
				
				produccionAux.setId(this.produccion.getId());	
				produccionAux.setVersionRow(this.produccion.getVersionRow());	
				produccionAux.setcodigo(this.produccion.getcodigo());	
				
				if(this.produccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.produccionAux.getId()>=0) {	
						this.produccionsEliminados.add(produccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(produccionAux,produccionLogic.getProduccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(produccionAux,produccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.produccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.produccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						produccionLogic.saveProduccions();//WithConnection
						//produccionLogic.getSetVersionRowProduccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.produccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								produccionLogic.saveProduccionRelaciones(produccionAux);//WithConnection
								//produccionLogic.getSetVersionRowProduccions();//WithConnection
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
							if(this.produccionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.produccionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(produccionAux,produccionLogic.getProduccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(produccionAux,produccions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.getProduccions().addAll(this.produccionsEliminados);
					
					produccionLogic.saveProduccions();//WithConnection
					//produccionLogic.getSetVersionRowProduccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.produccionsEliminados= new ArrayList<Produccion>();		
			}
			
			if(this.produccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.produccion=produccionAux;
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
      		//this.finishProcessProduccion();
      	}
		
	}	
	
	public void actualizarRelaciones(Produccion produccionLocal) throws Exception {
		
		if(this.produccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Produccion produccionLocal) throws Exception {	
		if(this.produccionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProduccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = produccionValidator.getInvalidValues(this.produccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Produccion produccion,List<Produccion> produccions) throws Exception {
		try	{		
			ProduccionConstantesFunciones.actualizarLista(produccion,produccions,this.produccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Produccion produccion,List<Produccion> produccions) throws Exception {
		try	{			
			ProduccionConstantesFunciones.actualizarSelectedLista(produccion,produccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Produccion> produccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				produccionsLocal=this.produccionLogic.getProduccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				produccionsLocal=this.produccions;
			}
			//ARCHITECTURE
		
			for(Produccion produccionLocal:produccionsLocal) {
				if(this.permiteMantenimiento(produccionLocal) && produccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProduccionConstantesFunciones.getProduccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProduccionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProduccion.jLabelcodigoProduccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProduccion.jLabelcodigoProduccion,"");
		
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
		this.iIdNuevoProduccion--;	
		
		
		this.produccionAux=new Produccion();
		
		this.produccionAux.setId(this.iIdNuevoProduccion);
		this.produccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.produccionLogic.getProduccions().add(this.produccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.produccions.add(this.produccionAux);
		}
		//ARCHITECTURE
		
		this.produccion=this.produccionAux;
		
		if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProduccion(this.produccion);
			this.setVariablesObjetoActualToFormularioForeignKeyProduccion(this.produccion);
		}
				
		//this.setDefaultControlesProduccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProduccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProduccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProduccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProduccion(this.produccionBean,this.produccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProduccion(this.produccionReturnGeneral,this.produccionBean,false);
		
		if(this.produccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProduccion(this.produccionReturnGeneral.getProduccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProduccion(this.produccionReturnGeneral.getProduccion());
		}
		
		if(this.produccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProduccion(this.produccionReturnGeneral.getProduccion(),classes);//this.produccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProduccion(this.produccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProduccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProduccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProduccionBeanSwingJInternalFrameAdditional.RecargarFormProduccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProduccion(false);
						
			if(produccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProduccion();
			}
			
			this.actualizarVisualTableDatosProduccion();
			
			this.jTableDatosProduccion.setRowSelectionInterval(this.getIndiceNuevoProduccion(), this.getIndiceNuevoProduccion());
			
			this.seleccionarFilaTablaProduccionActual();
						
			this.actualizarEstadoCeldasBotonesProduccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProduccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setEnabled(isHabilitar && this.produccionConstantesFunciones.activarcodigoProduccion);	
		
	};
	
	public void setDefaultControlesProduccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProduccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.produccionSessionBean.setConGuardarRelaciones(true);			
			this.produccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.setVisible(true);
			
					
		} else {
			//this.produccionSessionBean.setConGuardarRelaciones(false);			
			this.produccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProduccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
				if(produccionAux.getId().equals(this.iIdNuevoProduccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Produccion produccionAux:this.produccions) {
				if(produccionAux.getId().equals(this.iIdNuevoProduccion)) {
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
	
	public int getIndiceActualProduccion(Produccion produccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
				if(produccionAux.getId().equals(produccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Produccion produccionAux:this.produccions) {
				if(produccionAux.getId().equals(produccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProduccion(Produccion produccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
				if(produccionAux.getProduccionOriginal().getId().equals(produccionOriginal.getId())) {
					existe=true;
					produccionOriginal.setId(produccionAux.getId());
					produccionOriginal.setVersionRow(produccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Produccion produccionAux:this.produccions) {
				if(produccionAux.getProduccionOriginal().getId().equals(produccionOriginal.getId())) {
					existe=true;
					produccionOriginal.setId(produccionAux.getId());
					produccionOriginal.setVersionRow(produccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProduccion(Boolean esParaCancelar) throws Exception {
		produccionsAux=new ArrayList<Produccion>();
		produccionAux=new Produccion();
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
					if(produccionAux.getId()<0) {
						produccionsAux.add(produccionAux);
					}		
				}
				this.iIdNuevoProduccion=0L;
				this.produccionLogic.getProduccions().removeAll(produccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Produccion produccionAux:this.produccions) {
					if(produccionAux.getId()<0) {
						produccionsAux.add(produccionAux);
					}		
				}
				this.iIdNuevoProduccion=0L;
				this.produccions.removeAll(produccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProduccion 
					&& this.produccionLogic.getProduccions().size()>0
					) {
					produccionAux=this.produccionLogic.getProduccions().get(this.produccionLogic.getProduccions().size() - 1);
				
					if(produccionAux.getId()<0) {
						this.produccionLogic.getProduccions().remove(produccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProduccion && this.produccions.size()>0) {
					produccionAux=this.produccions.get(this.produccions.size() - 1);
				
					if(produccionAux.getId()<0) {
						this.produccions.remove(produccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProduccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(produccion.getId()<0) {
				this.produccionLogic.getProduccions().remove(this.produccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(produccion.getId()<0) {
				this.produccions.remove(this.produccion);
			}
		}			
	}
	
	public void setEstadosInicialesProduccion(List<Produccion> produccionsAux) throws Exception {
		ProduccionConstantesFunciones.setEstadosInicialesProduccion(produccionsAux);
	}
	
	public void setEstadosInicialesProduccion(Produccion produccionAux) throws Exception {
		ProduccionConstantesFunciones.setEstadosInicialesProduccion(produccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProduccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProduccionActual()) {
				if(!this.isEsNuevoProduccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProduccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProduccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Produccion ?", "MANTENIMIENTO DE Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Produccion produccion) throws Exception {
		ProduccionConstantesFunciones.seleccionarAsignar(this.produccion,produccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProduccion=this.isPermisoActualizarOriginalProduccion;
			
			
			this.seleccionarAsignar(produccion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProduccionConstantesFunciones.quitarEspaciosProduccion(this.produccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProduccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.produccionSessionBean.setsFuncionBusquedaRapida(this.produccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProduccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProduccion(esParaCancelar);				
				this.cancelarNuevoProduccion(esParaCancelar);								
			}
			
			this.produccion=new Produccion();
			
			this.inicializarProduccion();
			
			this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProduccion() throws Exception {
		try {
			ProduccionConstantesFunciones.inicializarProduccion(this.produccion);
			
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
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.produccionLogic.getProduccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProduccions(String sAccionBusqueda,List<Produccion> produccionsParaReportes) throws Exception {
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
					sPathReporteFinal="Produccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProduccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProduccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Produccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producciones");		
		parameters.put("busquedapor", ProduccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProduccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProduccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProduccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProduccion=new JRBeanArrayDataSource(ProduccionJInternalFrame.TraerProduccionBeans(produccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProduccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProduccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProduccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProduccionBean.TraerProduccionBeans(produccionsParaReportes).toArray()));
							
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
				this.generarExcelReporteProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProduccionActionPerformed(null);
					//this.generarExcelReporteProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProduccions(sAccionBusqueda,sTipoArchivoReporte,produccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProduccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Produccion> produccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Produccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProduccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Produccion produccion : produccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProduccionConstantesFunciones.generarExcelReporteDataProduccion("NORMAL",row,workbook,produccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProduccion(String sTipo,Row row,Workbook workbook) {
		
		ProduccionConstantesFunciones.generarExcelReporteHeaderProduccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProduccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Produccion> produccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Produccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Produccion produccion : produccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProduccionConstantesFunciones.getProduccionDescripcion(produccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProduccionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProduccionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(produccion.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProduccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Produccion> produccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Produccion> produccionsRespaldo=null;
		
		classes=ProduccionConstantesFunciones.getClassesRelationshipsOfProduccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.produccionLogic.setDatosCliente(this.datosCliente);
		this.produccionLogic.setDatosDeep(this.datosDeep);
		this.produccionLogic.setIsConDeep(true);
		
		produccionsRespaldo=this.produccionLogic.getProduccions();
		
		this.produccionLogic.setProduccions(produccionsParaReportes);	
		this.produccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		produccionsParaReportes=this.produccionLogic.getProduccions();
		this.produccionLogic.setProduccions(produccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Produccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProduccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Produccion produccion : produccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProduccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProduccionConstantesFunciones.generarExcelReporteDataProduccion("NORMAL",row,workbook,produccion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProduccionConstantesFunciones.getProduccionDescripcion(produccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProduccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProduccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProduccion() throws Exception {		
		this.startProcessProduccion(true);
	}
	
	public void startProcessProduccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesProduccion, this.jScrollPanelDatosProduccion,this.jPanelPaginacionProduccion, this.jScrollPanelDatosEdicionProduccion, this.jPanelAccionesProduccion,this.jPanelAccionesFormularioProduccion,this.jmenuBarProduccion,this.jmenuBarDetalleProduccion,this.jTtoolBarProduccion,this.jTtoolBarDetalleProduccion);		
		
		final JTabbedPane jTabbedPaneBusquedasProduccion=null; 
		
		final JPanel jPanelParametrosReportesProduccion=this.jPanelParametrosReportesProduccion;
		//final JScrollPane jScrollPanelDatosProduccion=this.jScrollPanelDatosProduccion;
		final JTable jTableDatosProduccion=this.jTableDatosProduccion;		
		final JPanel jPanelPaginacionProduccion=this.jPanelPaginacionProduccion;
		//final JScrollPane jScrollPanelDatosEdicionProduccion=this.jScrollPanelDatosEdicionProduccion;
		final JPanel jPanelAccionesProduccion=this.jPanelAccionesProduccion;
		
		JPanel jPanelCamposAuxiliarProduccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProduccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			jPanelCamposAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jPanelCamposProduccion;
			jPanelAccionesFormularioAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jPanelAccionesFormularioProduccion;
		}
		
		final JPanel jPanelCamposProduccion=jPanelCamposAuxiliarProduccion;
		final JPanel jPanelAccionesFormularioProduccion=jPanelAccionesFormularioAuxiliarProduccion;
		
		
		final JMenuBar jmenuBarProduccion=this.jmenuBarProduccion;
		final JToolBar jTtoolBarProduccion=this.jTtoolBarProduccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProduccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProduccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			jmenuBarDetalleAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jmenuBarDetalleProduccion;
			jTtoolBarDetalleAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jTtoolBarDetalleProduccion;
		}
		
		final JMenuBar jmenuBarDetalleProduccion=jmenuBarDetalleAuxiliarProduccion;
		final JToolBar jTtoolBarDetalleProduccion=jTtoolBarDetalleAuxiliarProduccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProduccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProduccion;
			processRunnable.jTableDatos=jTableDatosProduccion;
			processRunnable.jPanelCampos=jPanelCamposProduccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProduccion;
			processRunnable.jPanelAcciones=jPanelAccionesProduccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProduccion;
			
			
			processRunnable.jmenuBar=jmenuBarProduccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProduccion;
			processRunnable.jTtoolBar=jTtoolBarProduccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProduccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProduccion ,jPanelParametrosReportesProduccion,jTableDatosProduccion, /*jScrollPanelDatosProduccion,*/jPanelCamposProduccion,jPanelPaginacionProduccion, /*jScrollPanelDatosEdicionProduccion,*/ jPanelAccionesProduccion,jPanelAccionesFormularioProduccion,jmenuBarProduccion,jmenuBarDetalleProduccion,jTtoolBarProduccion,jTtoolBarDetalleProduccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesProduccion, jScrollPanelDatosProduccion,jPanelPaginacionProduccion, jScrollPanelDatosEdicionProduccion, jPanelAccionesProduccion,jPanelAccionesFormularioProduccion,jmenuBarProduccion,jmenuBarDetalleProduccion,jTtoolBarProduccion,jTtoolBarDetalleProduccion);
						
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
	
	public void finishProcessProduccion() {// throws Exception 
		this.finishProcessProduccion(true);
	}
	
	public void finishProcessProduccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesProduccion, this.jScrollPanelDatosProduccion,this.jPanelPaginacionProduccion, this.jScrollPanelDatosEdicionProduccion, this.jPanelAccionesProduccion,this.jPanelAccionesFormularioProduccion,this.jmenuBarProduccion,this.jmenuBarDetalleProduccion,this.jTtoolBarProduccion,this.jTtoolBarDetalleProduccion);		
		
		final JTabbedPane jTabbedPaneBusquedasProduccion=null; 
		
		final JPanel jPanelParametrosReportesProduccion=this.jPanelParametrosReportesProduccion;
		//final JScrollPane jScrollPanelDatosProduccion=this.jScrollPanelDatosProduccion;
		final JTable jTableDatosProduccion=this.jTableDatosProduccion;		
		final JPanel jPanelPaginacionProduccion=this.jPanelPaginacionProduccion;
		//final JScrollPane jScrollPanelDatosEdicionProduccion=this.jScrollPanelDatosEdicionProduccion;
		final JPanel jPanelAccionesProduccion=this.jPanelAccionesProduccion;
		
		JPanel jPanelCamposAuxiliarProduccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProduccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			jPanelCamposAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jPanelCamposProduccion;
			jPanelAccionesFormularioAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jPanelAccionesFormularioProduccion;
		}
		
		final JPanel jPanelCamposProduccion=jPanelCamposAuxiliarProduccion;
		final JPanel jPanelAccionesFormularioProduccion=jPanelAccionesFormularioAuxiliarProduccion;
		
		
		final JMenuBar jmenuBarProduccion=this.jmenuBarProduccion;		
		final JToolBar jTtoolBarProduccion=this.jTtoolBarProduccion;
				
		JMenuBar jmenuBarDetalleAuxiliarProduccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProduccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			jmenuBarDetalleAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jmenuBarDetalleProduccion;
			jTtoolBarDetalleAuxiliarProduccion=this.jInternalFrameDetalleFormProduccion.jTtoolBarDetalleProduccion;		
		}
		
		final JMenuBar jmenuBarDetalleProduccion=jmenuBarDetalleAuxiliarProduccion;
		final JToolBar jTtoolBarDetalleProduccion=jTtoolBarDetalleAuxiliarProduccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProduccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProduccion;
			processRunnable.jTableDatos=jTableDatosProduccion;
			processRunnable.jPanelCampos=jPanelCamposProduccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProduccion;
			processRunnable.jPanelAcciones=jPanelAccionesProduccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProduccion;
			
			
			processRunnable.jmenuBar=jmenuBarProduccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProduccion;
			processRunnable.jTtoolBar=jTtoolBarProduccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProduccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProduccion ,jPanelParametrosReportesProduccion, jTableDatosProduccion,/*jScrollPanelDatosProduccion,*/jPanelCamposProduccion,jPanelPaginacionProduccion, /*jScrollPanelDatosEdicionProduccion,*/ jPanelAccionesProduccion,jPanelAccionesFormularioProduccion,jmenuBarProduccion,jmenuBarDetalleProduccion,jTtoolBarProduccion,jTtoolBarDetalleProduccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProduccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProduccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProduccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProduccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProduccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProduccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProduccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProduccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProduccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.produccionConstantesFunciones.getsFinalQueryProduccion();
		String  finalQueryPaginacionTodos=this.produccionConstantesFunciones.getsFinalQueryProduccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProduccionConstantesFunciones.getArrayColumnasGlobalesNoProduccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProduccionConstantesFunciones.getArrayColumnasGlobalesProduccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProduccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.produccionsEliminados= new ArrayList<Produccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProduccion();
		
				///*ProduccionSessionBean*/this.produccionSessionBean=new ProduccionSessionBean();
			
			if(this.produccionSessionBean==null) {
				this.produccionSessionBean=new ProduccionSessionBean();
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
					this.iNumeroPaginacion=ProduccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProduccionConstantesFunciones.getClassesForeignKeysOfProduccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/produccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			produccionsAux= new ArrayList<Produccion>();
			
				
			produccionLogic.setDatosCliente(this.datosCliente);
			produccionLogic.setDatosDeep(this.datosDeep);
			produccionLogic.setIsConDeep(true);
			
			
			produccionLogic.getProduccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					produccionLogic.getTodosProduccions(finalQueryGlobal,pagination);
					
					//produccionLogic.getTodosProduccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(produccionLogic.getProduccions()==null|| produccionLogic.getProduccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							produccionsAux= new ArrayList<Produccion>();
							produccionsAux.addAll(produccionLogic.getProduccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							produccionsAux= new ArrayList<Produccion>();
							produccionsAux.addAll(produccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							produccionLogic.getTodosProduccions(finalQueryGlobal+"",this.pagination);												
							
							//produccionLogic.getTodosProduccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProduccions("Todos",produccionLogic.getProduccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							produccionLogic.setProduccions(new ArrayList<Produccion>());					
							produccionLogic.getProduccions().addAll(produccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							produccions=new ArrayList<Produccion>();
							produccions.addAll(produccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProduccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProduccion=this.idActual;
				
				} else if(this.idProduccionActual!=null && this.idProduccionActual!=0L) {
					idProduccion=idProduccionActual;
				}
				
					
				this.sDetalleReporte=ProduccionConstantesFunciones.getDetalleIndicePorId(idProduccion);
				
				this.produccions=new ArrayList<Produccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					produccionLogic.getEntity(idProduccion);
					
					//produccionLogic.getEntityWithConnection(idProduccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					produccionLogic.setProduccions(new ArrayList<Produccion>());
					produccionLogic.getProduccions().add(produccionLogic.getProduccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.produccions=new ArrayList<Produccion>();
					this.produccions.add(produccion);
				}
				
				if(produccionLogic.getProduccion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProduccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProduccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=produccionLogic.getProduccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=produccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=produccionLogic.getProduccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=produccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Produccion produccion) {
		Boolean permite=true;
		
		if(this.produccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProduccionConstantesFunciones.getOrderByListaProduccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProduccionConstantesFunciones.getOrderByListaProduccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Produccion produccion:produccionLogic.getProduccions()) {
				if(produccion.getsType().equals(Constantes2.S_TOTALES)) {
					produccionTotales=produccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Produccion produccion:this.produccions) {
				if(produccion.getsType().equals(Constantes2.S_TOTALES)) {
					produccionTotales=produccion;
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
			this.produccionAux=new Produccion();
			this.produccionAux.setsType(Constantes2.S_TOTALES);
			this.produccionAux.setIsNew(false);
			this.produccionAux.setIsChanged(false);
			this.produccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProduccionConstantesFunciones.TotalizarValoresFilaProduccion(this.produccionLogic.getProduccions(),this.produccionAux);
				
				this.produccionLogic.getProduccions().add(this.produccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProduccionConstantesFunciones.TotalizarValoresFilaProduccion(this.produccions,this.produccionAux);
				
				this.produccions.add(this.produccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		produccionTotales=new Produccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.produccionLogic.getProduccions().remove(produccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.produccions.remove(produccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		produccionTotales=new Produccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Produccion produccion:produccionLogic.getProduccions()) {
				if(produccion.getsType().equals(Constantes2.S_TOTALES)) {
					produccionTotales=produccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProduccionConstantesFunciones.TotalizarValoresFilaProduccion(this.produccionLogic.getProduccions(),produccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Produccion produccion:this.produccions) {
				if(produccion.getsType().equals(Constantes2.S_TOTALES)) {
					produccionTotales=produccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProduccionConstantesFunciones.TotalizarValoresFilaProduccion(this.produccions,produccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosProduccion() {
		this.isPermisoTodoProduccion=false;
		this.isPermisoNuevoProduccion=false;
		this.isPermisoActualizarProduccion=false;
		this.isPermisoActualizarOriginalProduccion=false;
		this.isPermisoEliminarProduccion=false;
		this.isPermisoGuardarCambiosProduccion=false;
		this.isPermisoConsultaProduccion=false;
		this.isPermisoBusquedaProduccion=false;
		this.isPermisoReporteProduccion=false;		
		this.isPermisoOrdenProduccion=false;		
		this.isPermisoPaginacionMedioProduccion=false;		
		this.isPermisoPaginacionAltoProduccion=false;
		this.isPermisoPaginacionTodoProduccion=false;
		this.isPermisoCopiarProduccion=false;		
		this.isPermisoVerFormProduccion=false;		
		this.isPermisoDuplicarProduccion=false;		
		this.isPermisoOrdenProduccion=false;		
	}
	
	public void setPermisosUsuarioProduccion(Boolean isPermiso) {
		this.isPermisoTodoProduccion=isPermiso;
		this.isPermisoNuevoProduccion=isPermiso;
		this.isPermisoActualizarProduccion=isPermiso;
		this.isPermisoActualizarOriginalProduccion=isPermiso;
		this.isPermisoEliminarProduccion=isPermiso;
		this.isPermisoGuardarCambiosProduccion=isPermiso;
		this.isPermisoConsultaProduccion=isPermiso;
		this.isPermisoBusquedaProduccion=isPermiso;
		this.isPermisoReporteProduccion=isPermiso;
		this.isPermisoOrdenProduccion=isPermiso;		
		this.isPermisoPaginacionMedioProduccion=isPermiso;		
		this.isPermisoPaginacionAltoProduccion=isPermiso;		
		this.isPermisoPaginacionTodoProduccion=isPermiso;		
		this.isPermisoCopiarProduccion=isPermiso;		
		this.isPermisoVerFormProduccion=isPermiso;		
		this.isPermisoDuplicarProduccion=isPermiso;
		this.isPermisoOrdenProduccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProduccion(Boolean isPermiso) {
		//this.isPermisoTodoProduccion=isPermiso;
		this.isPermisoNuevoProduccion=isPermiso;
		this.isPermisoActualizarProduccion=isPermiso;
		this.isPermisoActualizarOriginalProduccion=isPermiso;
		this.isPermisoEliminarProduccion=isPermiso;
		this.isPermisoGuardarCambiosProduccion=isPermiso;
		//this.isPermisoConsultaProduccion=isPermiso;
		//this.isPermisoBusquedaProduccion=isPermiso;
		//this.isPermisoReporteProduccion=isPermiso;
		//this.isPermisoOrdenProduccion=isPermiso;		
		//this.isPermisoPaginacionMedioProduccion=isPermiso;		
		//this.isPermisoPaginacionAltoProduccion=isPermiso;		
		//this.isPermisoPaginacionTodoProduccion=isPermiso;		
		//this.isPermisoCopiarProduccion=isPermiso;		
		//this.isPermisoDuplicarProduccion=isPermiso;
		//this.isPermisoOrdenProduccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProduccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProduccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProduccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProduccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProduccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProduccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProduccionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProduccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProduccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.produccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProduccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProduccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProduccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProduccion=this.isPermisoActualizarProduccion;
			this.isPermisoEliminarProduccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProduccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProduccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProduccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProduccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProduccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProduccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProduccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProduccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProduccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProduccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProduccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProduccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProduccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.produccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProduccion.setToolTipText(this.jTableDatosProduccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProduccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProduccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProduccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProduccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProduccion() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyProduccionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProduccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProduccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProduccionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyProduccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProduccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProduccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProduccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProduccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProduccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProduccion(Produccion produccion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProduccion(Produccion produccion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProduccion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProduccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProduccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProduccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProduccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProduccion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProduccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProduccion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProduccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProduccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProduccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.produccionSessionBean=new ProduccionSessionBean(); 
		this.produccionConstantesFunciones=new ProduccionConstantesFunciones(); 
		this.produccionBean=new Produccion();//(this.produccionConstantesFunciones); 		
		this.produccionReturnGeneral=new ProduccionParameterReturnGeneral(); 
		
		this.produccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.produccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProduccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProduccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProduccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProduccion(true);
			
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
			
			this.produccionConstantesFunciones=new ProduccionConstantesFunciones(); 
			this.produccionBean=new Produccion();//this.produccionConstantesFunciones); 			
			this.produccionReturnGeneral=new ProduccionParameterReturnGeneral(); 
		
			ProduccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.produccion=new Produccion();
			this.produccions = new ArrayList<Produccion>();
			this.produccionsAux = new ArrayList<Produccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic=new ProduccionLogic();
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			//this.produccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.produccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProduccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProduccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProduccion);	
					}
					
					if(this.jInternalFrameImportacionProduccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProduccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProduccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProduccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProduccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProduccion);
				this.jInternalFrameDetalleFormProduccion.setVisible(false);
				this.jInternalFrameDetalleFormProduccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProduccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProduccion);
					this.jInternalFrameReporteDinamicoProduccion.setVisible(false);
					this.jInternalFrameReporteDinamicoProduccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProduccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProduccion);
					this.jInternalFrameImportacionProduccion.setVisible(false);
					this.jInternalFrameImportacionProduccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProduccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProduccion);
					this.jInternalFrameOrderByProduccion.setVisible(false);
					this.jInternalFrameOrderByProduccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProduccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProduccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.produccionReturnGeneral=new ProduccionParameterReturnGeneral();
			
			this.produccionParameterGeneral=new ProduccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.produccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProduccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.produccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProduccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.produccionSessionBean.getEsGuardarRelacionado(),this.produccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProduccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.produccionSessionBean.getEsGuardarRelacionado(),this.produccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaDuplicarProduccion=true;
			this.isVisibilidadCeldaCopiarProduccion=true;
			this.isVisibilidadCeldaVerFormProduccion=true;
			this.isVisibilidadCeldaOrdenProduccion=true;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=false;
			this.isVisibilidadCeldaGuardarProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProduccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProduccion(false);
			
			this.setPermisosUsuarioProduccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.produccionSessionBean.getEsGuardarRelacionado() 
				|| (this.produccionSessionBean.getEsGuardarRelacionado() && this.produccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProduccionClasesRelacionadas();
			}
			
			if(this.produccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProduccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProduccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProduccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProduccion();
			}
			
			if(!this.isPermisoBusquedaProduccion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.produccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProduccion,this.isPermisoPaginacionMedioProduccion,this.isPermisoPaginacionTodoProduccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProduccionConstantesFunciones.getTiposSeleccionarProduccion());
				
				this.tiposColumnasSelect=ProduccionConstantesFunciones.getTiposSeleccionarProduccion(true);
				
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
			//if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProduccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProduccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProduccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProduccion() ;
			
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
				produccionImplementable= (ProduccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProduccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				produccionImplementableHome= (ProduccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProduccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.produccions= new ArrayList<Produccion>();
			this.produccionsEliminados= new ArrayList<Produccion>();
						
			this.isEsNuevoProduccion=false;
			this.esParaAccionDesdeFormularioProduccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProduccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProduccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProduccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProduccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProduccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProduccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProduccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProduccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProduccion();
			}
			
			ProduccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProduccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Produccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProduccion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProduccion")) {
				iIndex=this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProduccion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProduccion();	
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
	
	public void cargarCombosForeignKeyProduccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProduccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProduccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProduccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProduccion();
		
		this.cargarCombosFrameForeignKeyProduccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProduccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProduccion();
		}
	}
	
	
	
	public void jButtonNuevoProduccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.produccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			
			if(jTableDatosProduccion.getRowCount()>=1) {
				jTableDatosProduccion.removeRowSelectionInterval(0, jTableDatosProduccion.getRowCount()-1);						
			}
			
			this.isEsNuevoProduccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProduccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProduccion(true);			
			//this.produccion=new Produccion();
			//this.produccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProduccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProduccion() ;
			
			if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProduccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.produccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.produccion);				
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			if(this.produccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Produccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProduccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProduccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProduccion.getSelectedRows().length;			
			}
			
			produccionsSeleccionados=this.getProduccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProduccion--;			
				//Produccion produccionAux= new Produccion();			
				//produccionAux.setId(this.iIdNuevoProduccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Produccion produccionOrigen=new Produccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Produccion produccionOrigen : produccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							produccionOrigen =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							produccionOrigen =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProduccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.produccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProduccion(produccionOrigen,this.produccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.produccionLogic.getProduccions().add(this.produccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.produccions.add(this.produccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProduccion(false);
				
				this.jTableDatosProduccion.setRowSelectionInterval(this.getIndiceNuevoProduccion(), this.getIndiceNuevoProduccion());
				
				int iLastRow =  this.jTableDatosProduccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProduccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProduccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProduccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();									
		
			Produccion produccionOrigen=new Produccion();
			Produccion produccionDestino=new Produccion();
				
			produccionsSeleccionados=this.getProduccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProduccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || produccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProduccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						produccionOrigen =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						produccionOrigen =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						produccionDestino =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						produccionDestino =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				produccionOrigen =produccionsSeleccionados.get(0);
				produccionDestino =produccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProduccion(produccionOrigen,produccionDestino,true,false);
				
				produccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(produccionDestino,produccionLogic.getProduccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(produccionDestino,produccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProduccion(false);
				
				//this.jTableDatosProduccion.setRowSelectionInterval(this.getIndiceNuevoProduccion(), this.getIndiceNuevoProduccion());
				
				int iLastRow =  this.jTableDatosProduccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProduccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProduccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProduccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProduccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProduccion.isVisible();
			
			
			this.jPanelParametrosReportesProduccion.setVisible(!isVisible);
			this.jPanelPaginacionProduccion.setVisible(!isVisible);
			this.jPanelAccionesProduccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProduccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProduccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProduccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProduccion();
			
			this.abrirFrameOrderByProduccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProduccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProduccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProduccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProduccion.isMaximum()) {
					this.jInternalFrameDetalleFormProduccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProduccion.setSize(this.jInternalFrameDetalleFormProduccion.iWidthFormulario,this.jInternalFrameDetalleFormProduccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProduccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProduccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProduccion.isMaximum()) {
						this.jInternalFrameDetalleFormProduccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProduccion.jContentPaneDetalleProduccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProduccion.jContentPaneDetalleProduccion.getWidth(),ProduccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProduccion.jContentPaneDetalleProduccion.getWidth(),ProduccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProduccion.jContentPaneDetalleProduccion.getWidth(),ProduccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProduccion.setVisible(true);
	        this.jInternalFrameDetalleFormProduccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProduccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProduccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProduccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProduccion,false,this);
				} else {
					this.jInternalFrameOrderByProduccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProduccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProduccion);
				this.jInternalFrameOrderByProduccion.setVisible(false);
				this.jInternalFrameOrderByProduccion.setSelected(false);
				
				this.jInternalFrameOrderByProduccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProduccion"));
				
				this.inicializarActualizarBindingTablaOrderByProduccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProduccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProduccion==null) {
				
				this.jInternalFrameImportacionProduccion=new ImportacionJInternalFrame(ProduccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProduccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProduccion);
				this.jInternalFrameImportacionProduccion.setVisible(false);
				this.jInternalFrameImportacionProduccion.setSelected(false);


				this.jInternalFrameImportacionProduccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProduccion"));
				this.jInternalFrameImportacionProduccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProduccion"));
				this.jInternalFrameImportacionProduccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProduccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProduccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProduccion==null) {
				this.jInternalFrameReporteDinamicoProduccion=new ReporteDinamicoJInternalFrame(ProduccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProduccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProduccion);
				this.jInternalFrameReporteDinamicoProduccion.setVisible(false);
				this.jInternalFrameReporteDinamicoProduccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProduccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProduccion"));
				this.jInternalFrameReporteDinamicoProduccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProduccion"));
				this.jInternalFrameReporteDinamicoProduccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProduccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProduccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProduccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProduccion);
			
	       	this.jInternalFrameDetalleFormProduccion.setVisible(false);
	        this.jInternalFrameDetalleFormProduccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormProduccion.dispose();
			//this.jInternalFrameDetalleFormProduccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProduccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProduccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoProduccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProduccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProduccion.setVisible(true);
	        this.jInternalFrameImportacionProduccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProduccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProduccion.setVisible(true);
	        this.jInternalFrameOrderByProduccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProduccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProduccion.setVisible(false);
	        this.jInternalFrameOrderByProduccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProduccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProduccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoProduccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProduccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProduccion.setVisible(false);
	        this.jInternalFrameImportacionProduccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProduccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProduccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProduccion(true);
			//this.isEsNuevoProduccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProduccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProduccion(false) ;
			
			if(produccionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProduccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProduccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProduccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProduccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProduccion(true);
			//this.isEsNuevoProduccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.produccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProduccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProduccion(false) ;
			
			if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProduccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProduccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProduccion(false);
			
			//if(!this.isEsNuevoProduccion) {								
				int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
				
			}
			
			if(this.permiteMantenimiento(this.produccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.produccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProduccion=true;
					this.inicializarActualizarBindingTablaProduccion(false);
					this.isEsNuevoProduccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProduccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProduccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProduccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProduccion(false);
				
				this.habilitarDeshabilitarControlesProduccion(false);
			
												
				
				if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProduccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProduccionActionPerformed(evt,produccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProduccion(this.produccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProduccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,produccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.produccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProduccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				this.produccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				this.produccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.produccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.produccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProduccionModel) this.jTableDatosProduccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProduccion=true;
				this.inicializarActualizarBindingTablaProduccion(false);
				this.isEsNuevoProduccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProduccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProduccion(false);
				
				this.habilitarDeshabilitarControlesProduccion(false);
				
				
				
				if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProduccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProduccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProduccion.getRowCount()>=1) {
				jTableDatosProduccion.removeRowSelectionInterval(0, jTableDatosProduccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProduccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProduccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProduccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProduccion(false) ;
			
			this.isEsNuevoProduccion=false;
			
			if(ProduccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProduccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProduccion(false);
				
				//SI ES MANUAL
				if(ProduccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProduccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProduccion--;			
			//Produccion produccionAux= new Produccion();			
			//produccionAux.setId(this.iIdNuevoProduccion);
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProduccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
			
			this.produccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.produccionLogic.getProduccions().add(this.produccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.produccions.add(this.produccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProduccion(false);
			
			this.jTableDatosProduccion.setRowSelectionInterval(this.getIndiceNuevoProduccion(), this.getIndiceNuevoProduccion());
			
			int iLastRow =  this.jTableDatosProduccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProduccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProduccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProduccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProduccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProduccion(false);
			
			//SI ES MANUAL
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProduccion();
			}
			
			//this.abrirFrameTreeProduccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProduccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ProduccionES ?", "MANTENIMIENTO DE Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProduccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProduccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.produccionReturnGeneral=produccionLogic.procesarImportacionProduccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.produccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProduccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProduccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProduccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProduccion.setFileImportacion(this.jInternalFrameImportacionProduccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProduccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProduccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProduccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProduccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		

		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProduccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProduccionBaseDesign.jrxml";
			
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
			
			this.generarReporteProduccions("Todos",produccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProduccionConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoProduccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProduccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProduccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProduccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProduccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProduccionConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoProduccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Produccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProduccionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProduccionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Produccion produccion:produccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(produccion.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelProduccion(row);				
			//	iRow++;
			//}				
			
			//for(Produccion produccionAux:produccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProduccion(produccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProduccion(false);
			
			//SI ES MANUAL
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProduccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProduccion(false);
			
			//SI ES MANUAL
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProduccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProduccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProduccion(false);
			
			//SI ES MANUAL
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProduccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.produccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProduccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProduccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProduccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProduccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProduccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProduccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosProduccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosProduccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProduccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProduccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProduccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProduccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProduccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProduccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProduccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProduccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProduccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProduccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProduccion();
		
		this.inicializarActualizarBindingBotonesManualProduccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProduccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProduccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProduccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProduccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProduccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProduccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProduccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProduccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionNuevoProduccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionSinCerrarProduccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionSinMensajeProduccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProduccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProduccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProduccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProduccion!=null) {
				this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionNuevoProduccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionSinCerrarProduccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProduccion.jCheckBoxPostAccionSinMensajeProduccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProduccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProduccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProduccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProduccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProduccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProduccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProduccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProduccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProduccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProduccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProduccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProduccion(Boolean esInicializar) throws Exception {
		try	{	
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProduccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProduccion() throws Exception {
		try	{
			if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProduccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProduccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProduccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProduccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProduccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProduccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProduccion.addItem(reporte);
			}
			
			
			if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProduccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProduccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProduccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProduccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProduccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProduccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProduccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProduccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProduccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProduccion!=null) {
				this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProduccion!=null) {
				this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProduccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProduccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProduccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProduccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProduccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProduccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProduccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProduccion(Boolean esInicializar) throws Exception {				
		if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProduccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProduccion() throws Exception {
		this.inicializarActualizarBindingTablaProduccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProduccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProduccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProduccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProduccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=produccionLogic.getProduccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=produccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProduccion.setModel(new ProduccionModel(this.produccionLogic.getProduccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProduccion.setModel(new ProduccionModel(this.produccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProduccion!=null && this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProduccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProduccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProduccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProduccionConstantesFunciones.SCLASSWEBTITULO,produccionConstantesFunciones.resaltarSeleccionarProduccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProduccionConstantesFunciones.SCLASSWEBTITULO,produccionConstantesFunciones.resaltarSeleccionarProduccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProduccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProduccion,ProduccionConstantesFunciones.LABEL_ID));

		if(this.produccionConstantesFunciones.mostraridProduccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProduccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.produccionConstantesFunciones.resaltaridProduccion,this.produccionConstantesFunciones.activaridProduccion,this,true,"idProduccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.produccionConstantesFunciones.resaltaridProduccion,this.produccionConstantesFunciones.activaridProduccion,this,true,"idProduccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProduccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProduccion,ProduccionConstantesFunciones.LABEL_CODIGO));

		if(this.produccionConstantesFunciones.mostrarcodigoProduccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProduccionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.produccionConstantesFunciones.resaltarcodigoProduccion,this.produccionConstantesFunciones.activarcodigoProduccion,this,true,"codigoProduccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.produccionConstantesFunciones.resaltarcodigoProduccion,this.produccionConstantesFunciones.activarcodigoProduccion,this,true,"codigoProduccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProduccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.produccionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.produccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.produccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProduccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.produccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.produccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProduccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProduccion && this.isPermisoGuardarCambiosProduccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.produccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.produccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProduccion.addColumn(tableColumn);
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
			
			this.jTableDatosProduccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProduccion && this.isPermisoGuardarCambiosProduccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProduccion && this.isPermisoGuardarCambiosProduccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProduccion.moveColumn(this.jTableDatosProduccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProduccion.moveColumn(this.jTableDatosProduccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProduccion.moveColumn(this.jTableDatosProduccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProduccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProduccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProduccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProduccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProduccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProduccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProduccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProduccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=produccionLogic.getProduccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=produccions.size()-1;
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
		//this.jTableDatosProduccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProduccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProduccion();
			
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
				
				//this.isEsNuevoProduccion=false;
					
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
				if(this.produccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProduccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProduccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProduccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.produccion.getsType().equals("DUPLICADO")
				   || this.produccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProduccion=true;
				
				} else {
					this.isEsNuevoProduccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
					if(this.produccion.getId()>=0 && !this.produccion.getIsNew()) {						
						this.isEsNuevoProduccion=false;
						
					} else {
						this.isEsNuevoProduccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProduccion(esRelaciones);						
				
				this.seleccionarProduccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.produccion.getId()<0) {
					this.isEsNuevoProduccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProduccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProduccion(evt,rowIndex);
				}	
				
				if(this.produccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Produccion: " + this.dDif); 
					}
				}								
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProduccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.produccion)) {
					if(this.produccion.getId()>0) {
						this.produccion.setIsDeleted(true);
						
						this.produccionsEliminados.add(this.produccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.produccionLogic.getProduccions().remove(this.produccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.produccions.remove(this.produccion);				
					}
					
					
					((ProduccionModel) this.jTableDatosProduccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProduccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProduccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProduccion) {
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProduccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProduccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProduccion(this.produccion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProduccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProduccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProduccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProduccion(Produccion produccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProduccion(produccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProduccion(Produccion produccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProduccion(produccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProduccion(produccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProduccion(produccion);
	}
	
	public void setVariablesObjetoActualToFormularioProduccion(Produccion produccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setText(produccion.getId().toString());
			this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setText(produccion.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Produccion produccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,produccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Produccion produccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				produccionLocal=this.produccion;
			} else {
				produccionLocal=this.produccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(produccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProduccion(produccionLocal,true);
					
					if(produccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(produccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.produccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(produccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProduccion(Produccion produccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProduccion(produccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProduccion(produccion);
	}
	
	public void setVariablesFormularioToObjetoActualProduccion(Produccion produccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProduccion(produccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProduccion(Produccion produccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.getText()==null || this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.getText()=="" || this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.getText()=="Id") {
				this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setText("0");
			}

			if(conColumnasBase) {produccion.setId(Long.parseLong(this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProduccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProduccion.jLabelIdProduccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			produccion.setcodigo(this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProduccionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProduccion.jLabelcodigoProduccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProduccion(Produccion produccionBean,Produccion produccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProduccion(Produccion produccionOrigen,Produccion produccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && produccionOrigen.getId()!=null && !produccionOrigen.getId().equals(0L))) {produccion.setId(produccionOrigen.getId());}}
			if(conDefault || (!conDefault && produccionOrigen.getcodigo()!=null && !produccionOrigen.getcodigo().equals(""))) {produccion.setcodigo(produccionOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProduccion(Produccion produccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setText(produccion.getId().toString());
			this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setText(produccion.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProduccion(ProduccionBean produccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setText(produccionBean.getId().toString());
			this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setText(produccionBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProduccion(ProduccionParameterReturnGeneral produccionReturnGeneral,ProduccionBean produccionBean,Boolean conDefault) throws Exception { 
		try {
			Produccion produccionLocal=new Produccion();
			
			produccionLocal=produccionReturnGeneral.getProduccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && produccionLocal.getId()!=null && !produccionLocal.getId().equals(0L))) {produccionBean.setId(produccionLocal.getId());}}
			if(conDefault || (!conDefault && produccionLocal.getcodigo()!=null && !produccionLocal.getcodigo().equals(""))) {produccionBean.setcodigo(produccionLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProduccionGenerico(Long idProduccionSeleccionado,JComboBox jComboBoxProduccion,List<Produccion> produccionsLocal)throws Exception {
		try {
			Produccion  produccionTemp=null;

			for(Produccion produccionAux:produccionsLocal) {
				if(produccionAux.getId()!=null && produccionAux.getId().equals(idProduccionSeleccionado)) {
					produccionTemp=produccionAux;
					break;
				}
			}

			jComboBoxProduccion.setSelectedItem(produccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProduccionGenerico(JComboBox jComboBoxProduccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProduccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProduccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProduccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProduccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProduccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProduccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProduccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProduccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProduccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProduccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			produccion=(Produccion) produccionLogic.getProduccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			produccion =(Produccion) produccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Produccion produccionRow=new Produccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			produccionRow=(Produccion) produccionLogic.getProduccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			produccionRow=(Produccion) produccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProduccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion));			
			this.jButtonDuplicarProduccion.setVisible((this.isVisibilidadCeldaDuplicarProduccion && this.isPermisoDuplicarProduccion));			
			this.jButtonCopiarProduccion.setVisible((this.isVisibilidadCeldaCopiarProduccion && this.isPermisoCopiarProduccion));
			this.jButtonVerFormProduccion.setVisible((this.isVisibilidadCeldaVerFormProduccion && this.isPermisoVerFormProduccion));
			
			this.jButtonAbrirOrderByProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));			
			
			this.jButtonNuevoRelacionesProduccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProduccion && this.isPermisoNuevoProduccion));			
			this.jButtonNuevoGuardarCambiosProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion && this.isPermisoGuardarCambiosProduccion));
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.jInternalFrameDetalleFormProduccion.jButtonModificarProduccion.setVisible((this.isVisibilidadCeldaModificarProduccion && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.setVisible((this.isVisibilidadCeldaActualizarProduccion && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.setVisible((this.isVisibilidadCeldaEliminarProduccion && this.isPermisoEliminarProduccion));
			this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.setVisible(this.isVisibilidadCeldaCancelarProduccion);							
			this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.setVisible((this.isVisibilidadCeldaGuardarProduccion && this.isPermisoGuardarCambiosProduccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaProduccion.setVisible((this.isVisibilidadCeldaGuardarCambiosProduccion && this.isPermisoGuardarCambiosProduccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion));						
			this.jButtonDuplicarToolBarProduccion.setVisible((this.isVisibilidadCeldaDuplicarProduccion && this.isPermisoDuplicarProduccion));						
			this.jButtonCopiarToolBarProduccion.setVisible((this.isVisibilidadCeldaCopiarProduccion && this.isPermisoCopiarProduccion));			
			this.jButtonVerFormToolBarProduccion.setVisible((this.isVisibilidadCeldaVerFormProduccion && this.isPermisoVerFormProduccion));			
			this.jButtonAbrirOrderByToolBarProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));
			this.jButtonNuevoRelacionesToolBarProduccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProduccion && this.isPermisoNuevoProduccion));			
			this.jButtonNuevoGuardarCambiosToolBarProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion && this.isPermisoGuardarCambiosProduccion));			
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.jInternalFrameDetalleFormProduccion.jButtonModificarToolBarProduccion.setVisible((this.isVisibilidadCeldaModificarProduccion && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jButtonActualizarToolBarProduccion.setVisible((this.isVisibilidadCeldaActualizarProduccion  && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jButtonEliminarToolBarProduccion.setVisible((this.isVisibilidadCeldaEliminarProduccion && this.isPermisoEliminarProduccion));
			this.jInternalFrameDetalleFormProduccion.jButtonCancelarToolBarProduccion.setVisible(this.isVisibilidadCeldaCancelarProduccion);				
			this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosToolBarProduccion.setVisible((this.isVisibilidadCeldaGuardarProduccion && this.isPermisoGuardarCambiosProduccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProduccion.setVisible((this.isVisibilidadCeldaGuardarCambiosProduccion && this.isPermisoGuardarCambiosProduccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion));			
			this.jMenuItemDuplicarProduccion.setVisible((this.isVisibilidadCeldaDuplicarProduccion && this.isPermisoDuplicarProduccion));			
			this.jMenuItemCopiarProduccion.setVisible((this.isVisibilidadCeldaCopiarProduccion && this.isPermisoCopiarProduccion));			
			this.jMenuItemVerFormProduccion.setVisible((this.isVisibilidadCeldaVerFormProduccion && this.isPermisoVerFormProduccion));			
			this.jMenuItemAbrirOrderByProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));			
			//this.jMenuItemMostrarOcultarProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));
			this.jMenuItemDetalleAbrirOrderByProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));			
			//this.jMenuItemDetalleMostrarOcultarProduccion.setVisible((this.isVisibilidadCeldaOrdenProduccion && this.isPermisoOrdenProduccion));			
			this.jMenuItemNuevoRelacionesProduccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProduccion && this.isPermisoNuevoProduccion));			
			this.jMenuItemNuevoGuardarCambiosProduccion.setVisible((this.isVisibilidadCeldaNuevoProduccion && this.isPermisoNuevoProduccion && this.isPermisoGuardarCambiosProduccion));									
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.jInternalFrameDetalleFormProduccion.jMenuItemModificarProduccion.setVisible((this.isVisibilidadCeldaModificarProduccion && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jMenuItemActualizarProduccion.setVisible((this.isVisibilidadCeldaActualizarProduccion && this.isPermisoActualizarProduccion));	
			this.jInternalFrameDetalleFormProduccion.jMenuItemEliminarProduccion.setVisible((this.isVisibilidadCeldaEliminarProduccion && this.isPermisoEliminarProduccion));
			this.jInternalFrameDetalleFormProduccion.jMenuItemCancelarProduccion.setVisible(this.isVisibilidadCeldaCancelarProduccion);				
			}
			
			this.jMenuItemGuardarCambiosProduccion.setVisible((this.isVisibilidadCeldaGuardarProduccion && this.isPermisoGuardarCambiosProduccion));						
			this.jMenuItemGuardarCambiosTablaProduccion.setVisible((this.isVisibilidadCeldaGuardarCambiosProduccion && this.isPermisoGuardarCambiosProduccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProduccion=this.jButtonNuevoProduccion.isVisible();
			this.isVisibilidadCeldaDuplicarProduccion=this.jButtonDuplicarProduccion.isVisible();
			this.isVisibilidadCeldaCopiarProduccion=this.jButtonCopiarProduccion.isVisible();
			this.isVisibilidadCeldaVerFormProduccion=this.jButtonVerFormProduccion.isVisible();
			
			this.isVisibilidadCeldaOrdenProduccion=this.jButtonAbrirOrderByProduccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProduccion=this.jButtonNuevoRelacionesProduccion.isVisible();
			this.isVisibilidadCeldaModificarProduccion=this.jButtonModificarProduccion.isVisible();
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.isVisibilidadCeldaActualizarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.isVisible();
			this.isVisibilidadCeldaEliminarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.isVisible();
			this.isVisibilidadCeldaCancelarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.isVisible();
			this.isVisibilidadCeldaGuardarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProduccion=this.jButtonGuardarCambiosTablaProduccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProduccion=this.jButtonNuevoToolBarProduccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProduccion=this.jButtonNuevoRelacionesToolBarProduccion.isVisible();
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.isVisibilidadCeldaModificarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonModificarToolBarProduccion.isVisible();
			this.isVisibilidadCeldaActualizarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonActualizarToolBarProduccion.isVisible();
			this.isVisibilidadCeldaEliminarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonEliminarToolBarProduccion.isVisible();
			this.isVisibilidadCeldaCancelarProduccion=this.jInternalFrameDetalleFormProduccion.jButtonCancelarToolBarProduccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProduccion=this.jButtonGuardarCambiosToolBarProduccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProduccion=this.jButtonGuardarCambiosTablaToolBarProduccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProduccion=this.jMenuItemNuevoProduccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProduccion=this.jMenuItemNuevoRelacionesProduccion.isVisible();
			
			if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.isVisibilidadCeldaModificarProduccion=this.jInternalFrameDetalleFormProduccion.jMenuItemModificarProduccion.isVisible();
			this.isVisibilidadCeldaActualizarProduccion=this.jInternalFrameDetalleFormProduccion.jMenuItemActualizarProduccion.isVisible();
			this.isVisibilidadCeldaEliminarProduccion=this.jInternalFrameDetalleFormProduccion.jMenuItemEliminarProduccion.isVisible();
			this.isVisibilidadCeldaCancelarProduccion=this.jInternalFrameDetalleFormProduccion.jMenuItemCancelarProduccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProduccion=this.jMenuItemGuardarCambiosProduccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProduccion=this.jMenuItemGuardarCambiosTablaProduccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProduccion(Boolean esInicializar) {
		if(ProduccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.produccionSessionBean.getConGuardarRelaciones()) {
				//if(this.produccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProduccion();
			}
			
			this.inicializarActualizarBindingBotonesManualProduccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProduccion() {
		this.jButtonNuevoProduccion.setVisible(this.isPermisoNuevoProduccion);			
		this.jButtonDuplicarProduccion.setVisible(this.isPermisoDuplicarProduccion);			
		this.jButtonCopiarProduccion.setVisible(this.isPermisoCopiarProduccion);			
		this.jButtonVerFormProduccion.setVisible(this.isPermisoVerFormProduccion);			
		
		this.jButtonAbrirOrderByProduccion.setVisible(this.isPermisoOrdenProduccion);					
		
		this.jButtonNuevoRelacionesProduccion.setVisible(this.isPermisoNuevoProduccion);			
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonModificarProduccion.setVisible(this.isPermisoActualizarProduccion);	
			this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.setVisible(this.isPermisoActualizarProduccion);	
			this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.setVisible(this.isPermisoEliminarProduccion);
			this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.setVisible(this.isVisibilidadCeldaCancelarProduccion);						
			this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.setVisible(this.isPermisoGuardarCambiosProduccion);							
		}
		
		this.jButtonGuardarCambiosTablaProduccion.setVisible(this.isPermisoActualizarProduccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProduccion() {
		this.jInternalFrameDetalleFormProduccion.jButtonModificarProduccion.setVisible(this.isPermisoActualizarProduccion);	
		this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.setVisible(this.isPermisoActualizarProduccion);	
		this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.setVisible(this.isPermisoEliminarProduccion);
		this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.setVisible(this.isVisibilidadCeldaCancelarProduccion);							
		this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.setVisible((this.isVisibilidadCeldaGuardarProduccion && this.isPermisoGuardarCambiosProduccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProduccion() {
		if(ProduccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProduccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProduccion() {
	}
	
	public void jTableDatosProduccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProduccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProduccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProduccion(this.getproduccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.produccion==null) {
						this.produccion = new Produccion();
					}

					this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
				}

				if(this.produccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.produccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProduccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProduccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProduccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProduccion(this.getproduccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.produccion==null) {
						this.produccion = new Produccion();
					}

					this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);
				}

				if(this.produccion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.produccion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProduccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameProduccion() {
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
			this.jInternalFrameDetalleFormProduccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormProduccion.dispose();
			this.jInternalFrameDetalleFormProduccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProduccion!=null) {
			this.jInternalFrameReporteDinamicoProduccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProduccion.dispose();
			this.jInternalFrameReporteDinamicoProduccion=null;
		}
		
		if(this.jInternalFrameImportacionProduccion!=null) {
			this.jInternalFrameImportacionProduccion.setVisible(false);	    			
			this.jInternalFrameImportacionProduccion.dispose();
			this.jInternalFrameImportacionProduccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProduccion();
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProduccion")) {
				jButtonDuplicarProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProduccion")) {
				jButtonCopiarProduccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormProduccion")) {
				jButtonVerFormProduccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProduccion")) {
				jButtonDuplicarProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProduccion")) {
				jButtonDuplicarProduccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProduccion")) {
				jButtonModificarProduccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProduccion")) {
				jButtonModificarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProduccion")) {
				jButtonModificarProduccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProduccion")) {
				jButtonActualizarProduccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProduccion")) {
				jButtonActualizarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProduccion")) {
				jButtonActualizarProduccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarProduccion")) {
				jButtonEliminarProduccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProduccion")) {
				jButtonEliminarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProduccion")) {
				jButtonEliminarProduccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarProduccion")) {
				jButtonCancelarProduccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProduccion")) {
				jButtonCancelarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProduccion")) {
				jButtonCancelarProduccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarProduccion")) {
				jButtonCerrarProduccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProduccion")) {
				jButtonCerrarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProduccion")) {
				jButtonCerrarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProduccion")) {
				jButtonMostrarOcultarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProduccion")) {
				jButtonCancelarProduccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProduccion")) {
				jButtonCopiarProduccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProduccion")) {
				jButtonVerFormProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProduccion")) {
				jButtonCopiarProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProduccion")) {
				jButtonVerFormProduccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProduccion")) {
				jButtonRecargarInformacionProduccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProduccion")) {
				jButtonRecargarInformacionProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProduccion")) {
				jButtonRecargarInformacionProduccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProduccion")) {
				jButtonAnterioresProduccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProduccion")) {
				jButtonAnterioresProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProduccion")) {
				jButtonAnterioresProduccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProduccion")) {
				jButtonSiguientesProduccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProduccion")) {
				jButtonSiguientesProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProduccion")) {
				jButtonSiguientesProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProduccion") || sTipo.equals("MenuItemDetalleAbrirOrderByProduccion")) {
				jButtonAbrirOrderByProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProduccion") || sTipo.equals("MenuItemDetalleMostrarOcultarProduccion")) {
				jButtonMostrarOcultarProduccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProduccion")) {
				jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProduccion")) {
				jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProduccion")) {
				jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProduccion")) {
				jButtonCerrarReporteDinamicoProduccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProduccion")) {
				jButtonGenerarReporteDinamicoProduccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProduccion")) {
				
				jButtonGenerarExcelReporteDinamicoProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProduccion")) {
				jButtonCerrarImportacionProduccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProduccion")) {
				
				jButtonGenerarImportacionProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProduccion")) {
				
				jButtonAbrirImportacionProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProduccion")) {
				jComboBoxTiposAccionesProduccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProduccion")) {
				jComboBoxTiposRelacionesProduccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProduccion")) {
				jComboBoxTiposAccionesProduccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProduccion")) {
				
				jComboBoxTiposSeleccionarProduccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProduccion")) {
				jTextFieldValorCampoGeneralProduccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProduccion")) {
				jButtonAbrirOrderByProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProduccion")) {
				jButtonAbrirOrderByProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProduccion")) {
				jButtonCerrarOrderByProduccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProduccionBusqueda")) {
				this.jButtonidProduccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProduccionBusqueda")) {
				this.jButtoncodigoProduccionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProduccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Produccion produccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				produccionLocal=this.produccion;
			} else {
				produccionLocal=this.produccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
							
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
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
			
			


			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
								
						
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
								
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
							
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
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
			
			


			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
								
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProduccion")) {
					jCheckBoxSeleccionarTodosProduccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProduccion")) {
					jCheckBoxSeleccionadosProduccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProduccion")) {
					
				}
				
				


				
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
												
				
				


				
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
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
			
			


			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProduccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.produccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.produccion);
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
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
				
				


				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Produccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Produccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProduccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.produccionAnterior =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.produccionAnterior =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProduccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProduccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProduccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.produccion =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.produccion =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.produccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProduccion")) {
				
				}
				
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProduccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProduccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProduccion")) {
			
			}
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProduccion();
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			if(sTipo.equals("NuevoProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProduccion")) {
				jButtonDuplicarProduccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProduccion")) {
				jButtonCopiarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProduccion")) {
				jButtonVerFormProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProduccion")) {
				jButtonNuevoProduccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProduccion")) {
				jButtonModificarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProduccion")) {
				jButtonActualizarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProduccion")) {
				jButtonEliminarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProduccion")) {
				jButtonCancelarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProduccion")) {
				jButtonCerrarProduccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProduccion")) {
				jButtonGuardarCambiosProduccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProduccion")) {
				jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProduccion")) {
				jButtonAbrirOrderByProduccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProduccion")) {
				jButtonRecargarInformacionProduccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProduccion")) {
				jButtonAnterioresProduccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProduccion")) {
				jButtonSiguientesProduccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProduccionBusqueda")) {
				this.jButtonidProduccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProduccionBusqueda")) {
				this.jButtoncodigoProduccionBusquedaActionPerformed(evt);
			}
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProduccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProduccion")) {
				closingInternalFrameProduccion();
				
			} else if(sTipo.equals("jButtonCancelarProduccion")) {
				JInternalFrameBase jInternalFrameDetalleFormProduccion = (JInternalFrameBase)evt.getSource();
	            	
	            ProduccionBeanSwingJInternalFrame jInternalFrameParent=(ProduccionBeanSwingJInternalFrame)jInternalFrameDetalleFormProduccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProduccionActionPerformed(null);
			}
			
			ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.produccion,new Object(),this.produccionParameterGeneral,this.produccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProduccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProduccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProduccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.produccion)) {
			if(!esControlTabla) {
				if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);			
				}
				
				if(this.produccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProduccion(this.produccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProduccion(this.produccionReturnGeneral,this.produccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.produccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProduccion(classes,this.produccionReturnGeneral,this.produccionBean,false);
					}
						
					if(this.produccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProduccion(this.produccionReturnGeneral.getProduccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProduccion(this.produccionReturnGeneral.getProduccion());	
					}
						
					if(this.produccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProduccion(this.produccionReturnGeneral.getProduccion(),classes);//this.produccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProduccion(this.produccion,classes);//this.produccionBean);									
				}
			
				if(ProduccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProduccion(this.produccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProduccion(this.produccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.produccionAnterior!=null) {
						this.produccion=this.produccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.produccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.produccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.produccionReturnGeneral.getProduccion(),produccionLogic.getProduccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.produccionReturnGeneral.getProduccion(),this.produccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProduccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosProduccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProduccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosProduccion() throws Exception {
		
		ProduccionModel produccionModel=(ProduccionModel)this.jTableDatosProduccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			produccionModel.produccions=this.produccionLogic.getProduccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			produccionModel.produccions=this.produccions;
		}
		
		
		((ProduccionModel) this.jTableDatosProduccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProduccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproduccionAnterior(),this.produccionLogic.getProduccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproduccionAnterior(),this.produccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProduccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProduccion(Produccion produccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
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
										
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.produccion,new Object(),generalEntityParameterGeneral,this.produccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.produccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProduccionConstantesFunciones.getClassesRelationshipsOfProduccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProduccionConstantesFunciones.getClassesRelationshipsFromStringsOfProduccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProduccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProduccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.produccion,new Object(),generalEntityParameterGeneral,this.produccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProduccion(ProduccionBean produccionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProduccion(ArrayList<Classe> classes,ProduccionReturnGeneral produccionReturnGeneral,ProduccionBean produccionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProduccion(Produccion produccion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.produccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProduccion = new ProduccionDetalleFormJInternalFrame(jDesktopPane,this.produccionSessionBean.getConGuardarRelaciones(),this.produccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProduccion);
		this.jInternalFrameDetalleFormProduccion.setVisible(false);
		this.jInternalFrameDetalleFormProduccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormProduccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProduccion.produccionLogic=this.produccionLogic;
		
		this.cargarCombosFrameForeignKeyProduccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProduccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProduccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProduccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProduccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProduccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProduccion"));
		
		this.jInternalFrameDetalleFormProduccion.jButtonModificarProduccion.addActionListener(new ButtonActionListener(this,"ModificarProduccion"));

		
		this.jInternalFrameDetalleFormProduccion.jButtonModificarToolBarProduccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProduccion"));
					
		this.jInternalFrameDetalleFormProduccion.jMenuItemModificarProduccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProduccion"));		
		
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.addActionListener (new ButtonActionListener(this,"ActualizarProduccion"));
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonActualizarToolBarProduccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProduccion"));
						
		this.jInternalFrameDetalleFormProduccion.jMenuItemActualizarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProduccion"));		
		
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.addActionListener (new ButtonActionListener(this,"EliminarProduccion"));
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonEliminarToolBarProduccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProduccion"));
								
		this.jInternalFrameDetalleFormProduccion.jMenuItemEliminarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProduccion"));		
		
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.addActionListener (new ButtonActionListener(this,"CancelarProduccion"));
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonCancelarToolBarProduccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProduccion"));
					
		this.jInternalFrameDetalleFormProduccion.jMenuItemCancelarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProduccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProduccion.jMenuItemDetalleCerrarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProduccion"));		
		
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosToolBarProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProduccion"));
		
		
		
		this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosToolBarProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProduccion"));
		
		
		
		this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProduccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtonidProduccionBusqueda.addActionListener(new ButtonActionListener(this,"idProduccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtoncodigoProduccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProduccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProduccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProduccion"));
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProduccion"));
		}
		
		this.jTableDatosProduccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProduccion"));
		
		this.jTableDatosProduccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProduccion"));
		
		this.jButtonNuevoProduccion.addActionListener(new ButtonActionListener(this,"NuevoProduccion"));
		
		this.jButtonDuplicarProduccion.addActionListener(new ButtonActionListener(this,"DuplicarProduccion"));
		
		this.jButtonCopiarProduccion.addActionListener(new ButtonActionListener(this,"CopiarProduccion"));
		
		this.jButtonVerFormProduccion.addActionListener(new ButtonActionListener(this,"VerFormProduccion"));
		
		
		this.jButtonNuevoToolBarProduccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarProduccion"));
			
		this.jButtonDuplicarToolBarProduccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProduccion"));
			
		this.jMenuItemNuevoProduccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProduccion"));
			
		this.jMenuItemDuplicarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProduccion"));		
		
		
		this.jButtonNuevoRelacionesProduccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProduccion"));
		
		
		this.jButtonNuevoRelacionesToolBarProduccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProduccion"));
			
		this.jMenuItemNuevoRelacionesProduccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProduccion"));		
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonModificarProduccion.addActionListener(new ButtonActionListener(this,"ModificarProduccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonModificarToolBarProduccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProduccion"));
			
			this.jInternalFrameDetalleFormProduccion.jMenuItemModificarProduccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProduccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProduccion.jButtonActualizarProduccion.addActionListener (new ButtonActionListener(this,"ActualizarProduccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonActualizarToolBarProduccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProduccion"));
				
			this.jInternalFrameDetalleFormProduccion.jMenuItemActualizarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProduccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonEliminarProduccion.addActionListener (new ButtonActionListener(this,"EliminarProduccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonEliminarToolBarProduccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProduccion"));
						
			this.jInternalFrameDetalleFormProduccion.jMenuItemEliminarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProduccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonCancelarProduccion.addActionListener (new ButtonActionListener(this,"CancelarProduccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonCancelarToolBarProduccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProduccion"));
			
			this.jInternalFrameDetalleFormProduccion.jMenuItemCancelarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProduccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProduccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProduccion"));		
		
		
		this.jButtonCerrarProduccion.addActionListener (new ButtonActionListener(this,"CerrarProduccion"));
		
		
		this.jButtonCerrarToolBarProduccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarProduccion"));
			
		this.jMenuItemCerrarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProduccion"));
			
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jMenuItemDetalleCerrarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProduccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosProduccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosToolBarProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProduccion"));
		}
		
		this.jButtonCopiarToolBarProduccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarProduccion"));
			
		this.jButtonVerFormToolBarProduccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarProduccion"));
		
		this.jMenuItemGuardarCambiosProduccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProduccion"));
			
		this.jMenuItemCopiarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProduccion"));		
		
		this.jMenuItemVerFormProduccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProduccion"));		
		
		
		this.jButtonGuardarCambiosTablaProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProduccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProduccion"));
			
		this.jMenuItemGuardarCambiosTablaProduccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProduccion"));		
		
		
		
		this.jButtonRecargarInformacionProduccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionProduccion"));
					
		this.jButtonRecargarInformacionToolBarProduccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProduccion"));
		
		this.jMenuItemRecargarInformacionProduccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProduccion"));		
		
		
		
		this.jButtonAnterioresProduccion.addActionListener (new ButtonActionListener(this,"AnterioresProduccion"));
		
		
		this.jButtonAnterioresToolBarProduccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProduccion"));
		
		this.jMenuItemAnterioresProduccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProduccion"));		
		
		
		this.jButtonSiguientesProduccion.addActionListener (new ButtonActionListener(this,"SiguientesProduccion"));
		
		
		this.jButtonSiguientesToolBarProduccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProduccion"));
			
		this.jMenuItemSiguientesProduccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProduccion"));
			
		this.jMenuItemAbrirOrderByProduccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProduccion"));
			
		this.jMenuItemMostrarOcultarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProduccion"));
			
		this.jMenuItemDetalleAbrirOrderByProduccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProduccion"));
			
		this.jMenuItemDetalleMostarOcultarProduccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProduccion"));		
		
		
		this.jButtonNuevoGuardarCambiosProduccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProduccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProduccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProduccion"));
			
		this.jMenuItemNuevoGuardarCambiosProduccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProduccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProduccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProduccion"));

		this.jCheckBoxSeleccionadosProduccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProduccion"));
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProduccion"));
		}
		
		
		this.jComboBoxTiposRelacionesProduccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesProduccion"));
			
		this.jComboBoxTiposAccionesProduccion.addActionListener (new ButtonActionListener(this,"TiposAccionesProduccion"));
					
		this.jComboBoxTiposSeleccionarProduccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProduccion"));
			
		this.jTextFieldValorCampoGeneralProduccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProduccion"));		
		
		
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtonidProduccionBusqueda.addActionListener(new ButtonActionListener(this,"idProduccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtoncodigoProduccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProduccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProduccion!=null) {
				this.jInternalFrameReporteDinamicoProduccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProduccion"));
				this.jInternalFrameReporteDinamicoProduccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProduccion"));
				this.jInternalFrameReporteDinamicoProduccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProduccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoProduccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProduccion"));				
			//this.jButtonGenerarReporteDinamicoProduccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProduccion"));
			//this.jButtonGenerarExcelReporteDinamicoProduccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProduccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProduccion!=null) {
				this.jInternalFrameImportacionProduccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProduccion"));
				this.jInternalFrameImportacionProduccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProduccion"));
				this.jInternalFrameImportacionProduccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProduccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProduccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByProduccion"));
			
			this.jButtonAbrirOrderByToolBarProduccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProduccion"));			
			
			if(this.jInternalFrameOrderByProduccion!=null) {
				this.jInternalFrameOrderByProduccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProduccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProduccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProduccion.jTabbedPaneRelacionesProduccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProduccion"));
		
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
            		closingInternalFrameProduccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProduccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProduccion = (JInternalFrameBase)event.getSource();
	            	
	            ProduccionBeanSwingJInternalFrame jInternalFrameParent=(ProduccionBeanSwingJInternalFrame)jInternalFrameDetalleFormProduccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProduccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProduccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProduccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProduccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProduccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProduccion";
		inputMap = this.jButtonNuevoProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProduccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProduccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProduccion";
		inputMap = this.jButtonNuevoRelacionesProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProduccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProduccion";
		inputMap = this.jButtonModificarProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProduccion";
		inputMap = this.jButtonActualizarProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProduccion";
		inputMap = this.jButtonEliminarProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProduccion";
		inputMap = this.jButtonCancelarProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProduccion";
		inputMap = this.jButtonCerrarProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProduccion";
		inputMap = this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProduccion.jButtonGuardarCambiosProduccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProduccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProduccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProduccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProduccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProduccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProduccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProduccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProduccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProduccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtonidProduccionBusqueda.addActionListener(new ButtonActionListener(this,"idProduccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProduccion.jButtoncodigoProduccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProduccionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProduccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProduccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProduccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProduccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProduccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
					produccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Produccion produccionAux:produccions) {
					produccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProduccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProduccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
						produccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Produccion produccionAux:produccions) {
						produccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Produccion produccionAux:produccions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProduccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProduccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProduccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProduccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProduccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProduccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProduccion.getSelectedRows();
			
			Produccion produccionLocal=new Produccion();
			
			//this.seleccionarTodosProduccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					produccionLocal =(Produccion) this.produccionLogic.getProduccions().toArray()[this.jTableDatosProduccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					produccionLocal =(Produccion) this.produccions.toArray()[this.jTableDatosProduccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				produccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
						produccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Produccion produccionAux:produccions) {
						produccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProduccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProduccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProduccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProduccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProduccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProduccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProduccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProduccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProduccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Produccion produccionAux:this.produccionLogic.getProduccions()) {
				
						if(sTipoSeleccionar.equals(ProduccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							produccionAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Produccion produccionAux:produccions) {
					
						if(sTipoSeleccionar.equals(ProduccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							produccionAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProduccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProduccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProduccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProduccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProduccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProduccion) {				
					conSplash=true;//false;										
					
					//this.startProcessProduccion(conSplash);
				
					this.generarReporteProduccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProduccionsSeleccionados();
				//this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProduccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProduccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProduccion();
				
				this.exportarProduccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProduccions();
				//this.importarProduccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProduccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProduccionsSeleccionados();
				//this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProduccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProduccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProduccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
				}	
			} 			
			else if(ProduccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProduccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProduccion(conSplash);
					
						//this.actualizarParametrosGeneralProduccion();
						
						this.generarReporteProcesoAccionProduccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProduccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProduccion();
				
						this.actualizarParametrosGeneralProduccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.produccionReturnGeneral=produccionLogic.procesarAccionProduccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.produccionLogic.getProduccions(),this.produccionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProduccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProduccion();
					
					ProduccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProduccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProduccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProduccion.jComboBoxTiposAccionesFormularioProduccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProduccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProduccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProduccion();
			
			if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
			Produccion produccion=new Produccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProduccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProduccion.getSelectedItem();
			
			
			
			
			produccionsSeleccionados=this.getProduccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(produccionsSeleccionados.size()==1) {
				for(Produccion produccionAux:produccionsSeleccionados) {
					produccion=produccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProduccion();
			
      		//this.finishProcessProduccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProduccionReturnGeneral() throws Exception {
		if(this.produccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.produccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.produccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.produccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.produccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.produccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProduccion(false);
		}
		
		if(this.produccionReturnGeneral.getConRetornoLista() || this.produccionReturnGeneral.getConRetornoObjeto()) {
			if(this.produccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.produccionLogic.setProduccions(this.produccionReturnGeneral.getProduccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.produccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.produccionLogic.setProduccion(this.produccionReturnGeneral.getProduccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProduccion(false);
		}
	}
	
	public void actualizarParametrosGeneralProduccion() throws Exception {
		
		
	}
	
	public ArrayList<Produccion> getProduccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProduccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Produccion produccionAux:produccionLogic.getProduccions()) {
					if(produccionAux.getIsSelected()) {
						produccionsSeleccionados.add(produccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Produccion produccionAux:this.produccions) {
					if(produccionAux.getIsSelected()) {
						produccionsSeleccionados.add(produccionAux);				
					}
				}
			}
			
			if(produccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						produccionsSeleccionados.addAll(this.produccionLogic.getProduccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						produccionsSeleccionados.addAll(this.produccions);				
					}
				}
			}
		} else {
			produccionsSeleccionados.add(this.produccion);
		}
		
		return produccionsSeleccionados;
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
	
	public void generarReporteProduccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProduccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProduccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProduccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProduccionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProduccions("Todos",produccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProduccions("Todos",produccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProduccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProduccions("Todos",produccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProduccion();
		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProduccion();
		
		
		//this.generarReporteProduccions("Todos",produccionsSeleccionados ,produccionImplementable,produccionImplementableHome);
	}
	
	public void mostrarImportacionProduccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProduccion();
		
		this.abrirFrameImportacionProduccion();		
		
			
		//this.generarReporteProduccions("Todos",produccionsSeleccionados ,produccionImplementable,produccionImplementableHome);
	}
	
	public void importarProduccions() throws Exception {		
	
	}
	
	public void exportarProduccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProduccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProduccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProduccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProduccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Produccion produccionAux:produccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProduccion(produccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//produccionAux.setsDetalleGeneralEntityReporte(produccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProduccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProduccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProduccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProduccionConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProduccion(Produccion produccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=produccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=produccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=produccion.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Produccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProduccion(row);				
				iRow++;
			}				
			
			for(Produccion produccionAux:produccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProduccion(produccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProduccionsSeleccionados() throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();		
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"produccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("produccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("produccion");
			//elementRoot.appendChild(element);
		
			for(Produccion produccionAux:produccionsSeleccionados) {
				element = document.createElement("produccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProduccion(produccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.produccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProduccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProduccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProduccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProduccionConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProduccion(Produccion produccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(produccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(produccion.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlProduccion(Produccion produccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProduccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(produccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProduccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(produccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ProduccionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(produccion.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoProduccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Produccion> produccionsSeleccionados=new ArrayList<Produccion>();
		
		produccionsSeleccionados=this.getProduccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProduccion(produccionsSeleccionados);
		
		this.generarReporteProduccions("Todos",produccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProduccion(ArrayList<Produccion> produccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Produccion produccionAux:produccionsSeleccionados) {
				produccionAux.setsDetalleGeneralEntityReporte(produccionAux.toString());
			
				if(sTipoSeleccionar.equals(ProduccionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					produccionAux.setsDescripcionGeneralEntityReporte1(produccionAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProduccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProduccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProduccion=true;
				this.isVisibilidadCeldaNuevoRelacionesProduccion=true;
				this.isVisibilidadCeldaGuardarCambiosProduccion=true;
			}
			
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=true;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=true;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=true;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=true;
			this.isVisibilidadCeldaEliminarProduccion=true;
			this.isVisibilidadCeldaCancelarProduccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=true;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=true;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=false;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProduccion=true;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=true;
			this.isVisibilidadCeldaGuardarCambiosProduccion=true;
			this.isVisibilidadCeldaModificarProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=true;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=false;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
			this.isVisibilidadCeldaModificarProduccion=true;
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
			this.isVisibilidadCeldaCancelarProduccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProduccion=false;
				} else {
					this.isVisibilidadCeldaGuardarProduccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProduccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProduccion=true;
			this.isVisibilidadCeldaNuevoRelacionesProduccion=true;
			this.isVisibilidadCeldaGuardarCambiosProduccion=true;
		} else {
			this.actualizarEstadoPanelsProduccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProduccion=false;
			//this.isVisibilidadCeldaVerFormProduccion=false;
			this.isVisibilidadCeldaDuplicarProduccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!produccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
		} else {
			this.isVisibilidadCeldaNuevoProduccion=false;
			this.isVisibilidadCeldaGuardarCambiosProduccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(produccionSessionBean.getEsGuardarRelacionado()) {
			if(!produccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProduccion=false;												
			}
			
			this.jButtonCerrarProduccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProduccion=false;
		}
		
		if(!this.permiteMantenimiento(this.produccion)) {
			this.isVisibilidadCeldaActualizarProduccion=false;
			this.isVisibilidadCeldaEliminarProduccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProduccion() {
	}
	
	public void actualizarEstadoPanelsProduccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProduccion!=null) {
				this.jScrollPanelDatosEdicionProduccion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosProduccion!=null) {
				this.jScrollPanelDatosProduccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProduccion!=null) {
				this.jPanelPaginacionProduccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProduccion!=null) {
				this.jPanelParametrosReportesProduccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.produccionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.produccionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProduccionSessionBean produccionSessionBean=new ProduccionSessionBean();
		
		if(this.produccionSessionBean==null) {
			this.produccionSessionBean=new ProduccionSessionBean();
		}
		
		this.produccionSessionBean.setsUltimaBusquedaProduccion(this.getsAccionBusqueda());
		this.produccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.produccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProduccionSessionBean produccionSessionBean=new ProduccionSessionBean();
		
		if(this.produccionSessionBean==null) {
			this.produccionSessionBean=new ProduccionSessionBean();
		}
		
		if(this.produccionSessionBean.getsUltimaBusquedaProduccion()!=null&&!this.produccionSessionBean.getsUltimaBusquedaProduccion().equals("")) {
			this.setsAccionBusqueda(produccionSessionBean.getsUltimaBusquedaProduccion());
			this.setiNumeroPaginacion(produccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(produccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.produccionSessionBean.setsUltimaBusquedaProduccion("");
		this.produccionSessionBean.setiNumeroPaginacion(ProduccionConstantesFunciones.INUMEROPAGINACION);
		this.produccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProduccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProduccion() {
		this.updateBorderResaltarBusquedasFormularioProduccion();
		this.updateVisibilidadBusquedasFormularioProduccion();
		this.updateHabilitarBusquedasFormularioProduccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioProduccion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioProduccion() {
	}
	
	public void updateHabilitarBusquedasFormularioProduccion() {
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
	
	public void updateControlesFormularioProduccion() throws Exception {

		if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProduccion();
		this.updateVisibilidadResaltarControlesFormularioProduccion();
		this.updateHabilitarResaltarControlesFormularioProduccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioProduccion() throws Exception {
		if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.produccionConstantesFunciones.resaltaridProduccion!=null && this.jInternalFrameDetalleFormProduccion!=null) {this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setBorder(this.produccionConstantesFunciones.resaltaridProduccion);}
		if(this.produccionConstantesFunciones.resaltarcodigoProduccion!=null && this.jInternalFrameDetalleFormProduccion!=null) {this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setBorder(this.produccionConstantesFunciones.resaltarcodigoProduccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProduccion() throws Exception {		
		if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
	
		//this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setVisible(this.produccionConstantesFunciones.mostraridProduccion);
		this.jInternalFrameDetalleFormProduccion.jPanelidProduccion.setVisible(this.produccionConstantesFunciones.mostraridProduccion);
		//this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setVisible(this.produccionConstantesFunciones.mostrarcodigoProduccion);
		this.jInternalFrameDetalleFormProduccion.jPanelcodigoProduccion.setVisible(this.produccionConstantesFunciones.mostrarcodigoProduccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProduccion() throws Exception {
		if(this.jInternalFrameDetalleFormProduccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProduccion!=null) {
	
		this.jInternalFrameDetalleFormProduccion.jLabelidProduccion.setEnabled(this.produccionConstantesFunciones.activaridProduccion);
		this.jInternalFrameDetalleFormProduccion.jTextFieldcodigoProduccion.setEnabled(this.produccionConstantesFunciones.activarcodigoProduccion);
		}
	}
	
		
}