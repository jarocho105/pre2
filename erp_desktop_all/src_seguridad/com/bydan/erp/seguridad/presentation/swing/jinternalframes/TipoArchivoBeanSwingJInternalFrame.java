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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.TipoArchivoConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoArchivoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoArchivoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoArchivoBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoArchivoBeanSwingJInternalFrame extends TipoArchivoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoArchivoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoArchivo> tipoarchivoValidator = new ClassValidator<TipoArchivo>(TipoArchivo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoArchivo tipoarchivo;	
	public TipoArchivo tipoarchivoAux;
	public TipoArchivo tipoarchivoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoArchivo tipoarchivoTotales;
	public Long idTipoArchivoActual;
	public Long iIdNuevoTipoArchivo=0L;
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
	
	public Boolean isPermisoTodoTipoArchivo;
	public Boolean isPermisoNuevoTipoArchivo;
	public Boolean isPermisoActualizarTipoArchivo;
	public Boolean isPermisoActualizarOriginalTipoArchivo;
	public Boolean isPermisoEliminarTipoArchivo;
	public Boolean isPermisoGuardarCambiosTipoArchivo;
	public Boolean isPermisoConsultaTipoArchivo;
	public Boolean isPermisoBusquedaTipoArchivo;
	public Boolean isPermisoReporteTipoArchivo;
	public Boolean isPermisoPaginacionMedioTipoArchivo;
	public Boolean isPermisoPaginacionAltoTipoArchivo;
	public Boolean isPermisoPaginacionTodoTipoArchivo;
	public Boolean isPermisoCopiarTipoArchivo;
	public Boolean isPermisoVerFormTipoArchivo;
	public Boolean isPermisoDuplicarTipoArchivo;
	public Boolean isPermisoOrdenTipoArchivo;
	
	
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
	
	public TipoArchivoParameterReturnGeneral tipoarchivoReturnGeneral;
	public TipoArchivoParameterReturnGeneral tipoarchivoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoArchivo=false;
	public Boolean esParaAccionDesdeFormularioTipoArchivo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoArchivoLogic tipoarchivoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoArchivo tipoarchivoBean;
	public TipoArchivoConstantesFunciones tipoarchivoConstantesFunciones;
	//public TipoArchivoParameterReturnGeneral tipoarchivoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoArchivo> tipoarchivos;	
	//public List<TipoArchivo> tipoarchivosEliminados;
	//public List<TipoArchivo> tipoarchivosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoArchivo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoArchivo=true;
	public Boolean isVisibilidadCeldaCopiarTipoArchivo=true;
	public Boolean isVisibilidadCeldaVerFormTipoArchivo=true;
	public Boolean isVisibilidadCeldaOrdenTipoArchivo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
	public Boolean isVisibilidadCeldaModificarTipoArchivo=false;
	public Boolean isVisibilidadCeldaActualizarTipoArchivo=false;
	public Boolean isVisibilidadCeldaEliminarTipoArchivo=false;
	public Boolean isVisibilidadCeldaCancelarTipoArchivo=false;
	public Boolean isVisibilidadCeldaGuardarTipoArchivo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoArchivo=false;	
	
	
	
	public Long getiIdNuevoTipoArchivo() {
		return this.iIdNuevoTipoArchivo;
	}

	public void setiIdNuevoTipoArchivo(Long iIdNuevoTipoArchivo) {
		this.iIdNuevoTipoArchivo = iIdNuevoTipoArchivo;
	}
	
	public Long getidTipoArchivoActual() {
		return this.idTipoArchivoActual;
	}

	public void setidTipoArchivoActual(Long idTipoArchivoActual) {
		this.idTipoArchivoActual = idTipoArchivoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoArchivo gettipoarchivo() {
		return this.tipoarchivo;
	}

	public void settipoarchivo(TipoArchivo tipoarchivo) {
		this.tipoarchivo = tipoarchivo;
	}
	
	public TipoArchivo gettipoarchivoAux() {
		return this.tipoarchivoAux;
	}

	public void settipoarchivoAux(TipoArchivo tipoarchivoAux) {
		this.tipoarchivoAux = tipoarchivoAux;
	}				
	
	public TipoArchivo gettipoarchivoAnterior() {
		return this.tipoarchivoAnterior;
	}

	public void settipoarchivoAnterior(TipoArchivo tipoarchivoAnterior) {
		this.tipoarchivoAnterior = tipoarchivoAnterior;
	}	
	
	public TipoArchivo gettipoarchivoTotales() {
		return this.tipoarchivoTotales;
	}

	public void settipoarchivoTotales(TipoArchivo tipoarchivoTotales) {
		this.tipoarchivoTotales = tipoarchivoTotales;
	}	
	
	public TipoArchivo gettipoarchivoBean() {
		return this.tipoarchivoBean;
	}

	public void settipoarchivoBean(TipoArchivo tipoarchivoBean) {
		this.tipoarchivoBean = tipoarchivoBean;
	}	
	
	public TipoArchivoParameterReturnGeneral gettipoarchivoReturnGeneral() {
		return this.tipoarchivoReturnGeneral;
	}

	public void settipoarchivoReturnGeneral(TipoArchivoParameterReturnGeneral tipoarchivoReturnGeneral) {
		this.tipoarchivoReturnGeneral = tipoarchivoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoArchivoLogic getTipoArchivoLogic()	{		
		return tipoarchivoLogic;
	}

	public void setTipoArchivoLogic(TipoArchivoLogic tipoarchivoLogic) {
		this.tipoarchivoLogic = tipoarchivoLogic;
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
	
	public Boolean getIsEsNuevoTipoArchivo() {
		return isEsNuevoTipoArchivo;
	}

	public void setIsEsNuevoTipoArchivo(Boolean isEsNuevoTipoArchivo) {
		this.isEsNuevoTipoArchivo = isEsNuevoTipoArchivo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoArchivo() {
		return esParaAccionDesdeFormularioTipoArchivo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoArchivo(Boolean esParaAccionDesdeFormularioTipoArchivo) {
		this.esParaAccionDesdeFormularioTipoArchivo = esParaAccionDesdeFormularioTipoArchivo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoArchivo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoArchivoConstantesFunciones.refrescarForeignKeysDescripcionesTipoArchivo(this.tipoarchivoLogic.getTipoArchivos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoArchivoConstantesFunciones.refrescarForeignKeysDescripcionesTipoArchivo(this.tipoarchivos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoarchivoLogic.setTipoArchivos(this.tipoarchivos);
			tipoarchivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoArchivoParameterReturnGeneral getTipoArchivoParameterGeneral() {
		return this.tipoarchivoParameterGeneral;
	}
	
	public void setTipoArchivoParameterGeneral(TipoArchivoParameterReturnGeneral tipoarchivoParameterGeneral) {
		this.tipoarchivoParameterGeneral = tipoarchivoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoArchivo() {
		return isPermisoTodoTipoArchivo;
	}

	public void setIsPermisoTodoTipoArchivo(Boolean isPermisoTodoTipoArchivo) {
		this.isPermisoTodoTipoArchivo = isPermisoTodoTipoArchivo;
	}

	public Boolean getIsPermisoNuevoTipoArchivo() {
		return isPermisoNuevoTipoArchivo;
	}

	public void setIsPermisoNuevoTipoArchivo(Boolean isPermisoNuevoTipoArchivo) {
		this.isPermisoNuevoTipoArchivo = isPermisoNuevoTipoArchivo;
	}

	public Boolean getIsPermisoActualizarTipoArchivo() {
		return isPermisoActualizarTipoArchivo;
	}

	public void setIsPermisoActualizarTipoArchivo(Boolean isPermisoActualizarTipoArchivo) {
		this.isPermisoActualizarTipoArchivo = isPermisoActualizarTipoArchivo;
	}

	public Boolean getIsPermisoEliminarTipoArchivo() {
		return isPermisoEliminarTipoArchivo;
	}

	public void setIsPermisoEliminarTipoArchivo(Boolean isPermisoEliminarTipoArchivo) {
		this.isPermisoEliminarTipoArchivo = isPermisoEliminarTipoArchivo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoArchivo() {
		return isPermisoGuardarCambiosTipoArchivo;
	}

	public void setIsPermisoGuardarCambiosTipoArchivo(Boolean isPermisoGuardarCambiosTipoArchivo) {
		this.isPermisoGuardarCambiosTipoArchivo = isPermisoGuardarCambiosTipoArchivo;
	}
	
	public Boolean getIsPermisoConsultaTipoArchivo() {
		return isPermisoConsultaTipoArchivo;
	}

	public void setIsPermisoConsultaTipoArchivo(Boolean isPermisoConsultaTipoArchivo) {
		this.isPermisoConsultaTipoArchivo = isPermisoConsultaTipoArchivo;
	}

	public Boolean getIsPermisoBusquedaTipoArchivo() {
		return isPermisoBusquedaTipoArchivo;
	}

	public void setIsPermisoBusquedaTipoArchivo(Boolean isPermisoBusquedaTipoArchivo) {
		this.isPermisoBusquedaTipoArchivo = isPermisoBusquedaTipoArchivo;
	}

	public Boolean getIsPermisoReporteTipoArchivo() {
		return isPermisoReporteTipoArchivo;
	}

	public void setIsPermisoReporteTipoArchivo(Boolean isPermisoReporteTipoArchivo) {
		this.isPermisoReporteTipoArchivo = isPermisoReporteTipoArchivo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoArchivo() {
		return isPermisoPaginacionMedioTipoArchivo;
	}

	public void setIsPermisoPaginacionMedioTipoArchivo(Boolean isPermisoPaginacionMedioTipoArchivo) {
		this.isPermisoPaginacionMedioTipoArchivo = isPermisoPaginacionMedioTipoArchivo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoArchivo() {
		return isPermisoPaginacionTodoTipoArchivo;
	}

	public void setIsPermisoPaginacionTodoTipoArchivo(Boolean isPermisoPaginacionTodoTipoArchivo) {
		this.isPermisoPaginacionTodoTipoArchivo = isPermisoPaginacionTodoTipoArchivo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoArchivo() {
		return isPermisoPaginacionAltoTipoArchivo;
	}

	public void setIsPermisoPaginacionAltoTipoArchivo(Boolean isPermisoPaginacionAltoTipoArchivo) {
		this.isPermisoPaginacionAltoTipoArchivo = isPermisoPaginacionAltoTipoArchivo;
	}
	
	public Boolean getIsPermisoCopiarTipoArchivo() {
		return isPermisoCopiarTipoArchivo;
	}

	public void setIsPermisoCopiarTipoArchivo(Boolean isPermisoCopiarTipoArchivo) {
		this.isPermisoCopiarTipoArchivo = isPermisoCopiarTipoArchivo;
	}
	
	public Boolean getIsPermisoVerFormTipoArchivo() {
		return isPermisoVerFormTipoArchivo;
	}

	public void setIsPermisoVerFormTipoArchivo(Boolean isPermisoVerFormTipoArchivo) {
		this.isPermisoVerFormTipoArchivo = isPermisoVerFormTipoArchivo;
	}
	
	public Boolean getIsPermisoDuplicarTipoArchivo() {
		return isPermisoDuplicarTipoArchivo;
	}

	public void setIsPermisoDuplicarTipoArchivo(Boolean isPermisoDuplicarTipoArchivo) {
		this.isPermisoDuplicarTipoArchivo = isPermisoDuplicarTipoArchivo;
	}
	
	public Boolean getIsPermisoOrdenTipoArchivo() {
		return isPermisoOrdenTipoArchivo;
	}

	public void setIsPermisoOrdenTipoArchivo(Boolean isPermisoOrdenTipoArchivo) {
		this.isPermisoOrdenTipoArchivo = isPermisoOrdenTipoArchivo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoArchivo() {
		return isVisibilidadCeldaNuevoTipoArchivo;
	}

	public void setIsVisibilidadCeldaNuevoTipoArchivo(Boolean isVisibilidadCeldaNuevoTipoArchivo) {
		this.isVisibilidadCeldaNuevoTipoArchivo = isVisibilidadCeldaNuevoTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoArchivo() {
		return isVisibilidadCeldaDuplicarTipoArchivo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoArchivo(Boolean isVisibilidadCeldaDuplicarTipoArchivo) {
		this.isVisibilidadCeldaDuplicarTipoArchivo = isVisibilidadCeldaDuplicarTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoArchivo() {
		return isVisibilidadCeldaCopiarTipoArchivo;
	}

	public void setIsVisibilidadCeldaCopiarTipoArchivo(Boolean isVisibilidadCeldaCopiarTipoArchivo) {
		this.isVisibilidadCeldaCopiarTipoArchivo = isVisibilidadCeldaCopiarTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoArchivo() {
		return isVisibilidadCeldaVerFormTipoArchivo;
	}

	public void setIsVisibilidadCeldaVerFormTipoArchivo(Boolean isVisibilidadCeldaVerFormTipoArchivo) {
		this.isVisibilidadCeldaVerFormTipoArchivo = isVisibilidadCeldaVerFormTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoArchivo() {
		return isVisibilidadCeldaOrdenTipoArchivo;
	}

	public void setIsVisibilidadCeldaOrdenTipoArchivo(Boolean isVisibilidadCeldaOrdenTipoArchivo) {
		this.isVisibilidadCeldaOrdenTipoArchivo = isVisibilidadCeldaOrdenTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoArchivo() {
		return isVisibilidadCeldaNuevoRelacionesTipoArchivo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoArchivo(Boolean isVisibilidadCeldaNuevoRelacionesTipoArchivo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoArchivo = isVisibilidadCeldaNuevoRelacionesTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoArchivo() {
		return isVisibilidadCeldaModificarTipoArchivo;
	}

	public void setIsVisibilidadCeldaModificarTipoArchivo(Boolean isVisibilidadCeldaModificarTipoArchivo) {
		this.isVisibilidadCeldaModificarTipoArchivo = isVisibilidadCeldaModificarTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoArchivo() {
		return isVisibilidadCeldaActualizarTipoArchivo;
	}

	public void setIsVisibilidadCeldaActualizarTipoArchivo(Boolean isVisibilidadCeldaActualizarTipoArchivo) {
		this.isVisibilidadCeldaActualizarTipoArchivo = isVisibilidadCeldaActualizarTipoArchivo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoArchivo() {
		return isVisibilidadCeldaEliminarTipoArchivo;
	}

	public void setIsVisibilidadCeldaEliminarTipoArchivo(Boolean isVisibilidadCeldaEliminarTipoArchivo) {
		this.isVisibilidadCeldaEliminarTipoArchivo = isVisibilidadCeldaEliminarTipoArchivo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoArchivo() {
		return isVisibilidadCeldaCancelarTipoArchivo;
	}

	public void setIsVisibilidadCeldaCancelarTipoArchivo(Boolean isVisibilidadCeldaCancelarTipoArchivo) {
		this.isVisibilidadCeldaCancelarTipoArchivo = isVisibilidadCeldaCancelarTipoArchivo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoArchivo() {
		return isVisibilidadCeldaGuardarTipoArchivo;
	}

	public void setIsVisibilidadCeldaGuardarTipoArchivo(Boolean isVisibilidadCeldaGuardarTipoArchivo) {
		this.isVisibilidadCeldaGuardarTipoArchivo = isVisibilidadCeldaGuardarTipoArchivo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoArchivo() {
		return isVisibilidadCeldaGuardarCambiosTipoArchivo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoArchivo(Boolean isVisibilidadCeldaGuardarCambiosTipoArchivo) {
		this.isVisibilidadCeldaGuardarCambiosTipoArchivo = isVisibilidadCeldaGuardarCambiosTipoArchivo;
	}
		
	public TipoArchivoSessionBean gettipoarchivoSessionBean() {
		return this.tipoarchivoSessionBean;
	}
	
	public void settipoarchivoSessionBean(TipoArchivoSessionBean tipoarchivoSessionBean) {
		this.tipoarchivoSessionBean=tipoarchivoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(TipoArchivo tipoarchivo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoArchivo tipoarchivo,TipoArchivo tipoarchivoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoArchivo(tipoarchivo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoarchivoAux.setId(tipoarchivo.getId());
		tipoarchivoAux.setVersionRow(tipoarchivo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoArchivo();
		
			int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoarchivoValidator.getInvalidValues(this.tipoarchivo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoarchivoLogic.setDatosCliente(datosCliente);
			tipoarchivoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoarchivoAux=new  TipoArchivo();
				
				tipoarchivoAux.setIsNew(true);
				tipoarchivoAux.setIsChanged(true);
				
				tipoarchivoAux.setTipoArchivoOriginal(this.tipoarchivo);
				
				tipoarchivoAux.setId(this.tipoarchivo.getId());	
				tipoarchivoAux.setVersionRow(this.tipoarchivo.getVersionRow());	
				tipoarchivoAux.setcodigo(this.tipoarchivo.getcodigo());	
				tipoarchivoAux.setnombre(this.tipoarchivo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoarchivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoarchivoAux,tipoarchivoLogic.getTipoArchivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarchivoAux,tipoarchivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarchivoLogic.saveTipoArchivos();//WithConnection
						//tipoarchivoLogic.getSetVersionRowTipoArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoarchivo,tipoarchivoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoarchivoAux=new  TipoArchivo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoarchivoSessionBean.getEsGuardarRelacionado() && this.tipoarchivo.getId()>=0)) {
						
					tipoarchivoAux.setIsNew(false);
				}
				
				tipoarchivoAux.setIsDeleted(false);
			
				tipoarchivoAux.setId(this.tipoarchivo.getId());	
				tipoarchivoAux.setVersionRow(this.tipoarchivo.getVersionRow());	
				tipoarchivoAux.setcodigo(this.tipoarchivo.getcodigo());	
				tipoarchivoAux.setnombre(this.tipoarchivo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoarchivoAux,tipoarchivoLogic.getTipoArchivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarchivoAux,tipoarchivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarchivoLogic.saveTipoArchivos();//WithConnection
						//tipoarchivoLogic.getSetVersionRowTipoArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoarchivo,tipoarchivoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoarchivoAux=new  TipoArchivo();
				
				tipoarchivoAux.setIsNew(false);
				tipoarchivoAux.setIsChanged(false);
				
				tipoarchivoAux.setIsDeleted(true);
				
				tipoarchivoAux.setId(this.tipoarchivo.getId());	
				tipoarchivoAux.setVersionRow(this.tipoarchivo.getVersionRow());	
				tipoarchivoAux.setcodigo(this.tipoarchivo.getcodigo());	
				tipoarchivoAux.setnombre(this.tipoarchivo.getnombre());	
				
				if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoarchivoAux.getId()>=0) {	
						this.tipoarchivosEliminados.add(tipoarchivoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoarchivoAux,tipoarchivoLogic.getTipoArchivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarchivoAux,tipoarchivos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarchivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarchivoLogic.saveTipoArchivos();//WithConnection
						//tipoarchivoLogic.getSetVersionRowTipoArchivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.getTipoArchivos().addAll(this.tipoarchivosEliminados);
					
					tipoarchivoLogic.saveTipoArchivos();//WithConnection
					//tipoarchivoLogic.getSetVersionRowTipoArchivos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoarchivosEliminados= new ArrayList<TipoArchivo>();		
			}
			
			if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Archivo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoarchivo=tipoarchivoAux;
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
      		//this.finishProcessTipoArchivo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoArchivo tipoarchivoLocal) throws Exception {
		
		if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoArchivo tipoarchivoLocal) throws Exception {	
		if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoArchivoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoarchivoValidator.getInvalidValues(this.tipoarchivo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoArchivo tipoarchivo,List<TipoArchivo> tipoarchivos) throws Exception {
		try	{		
			TipoArchivoConstantesFunciones.actualizarLista(tipoarchivo,tipoarchivos,this.tipoarchivoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoArchivo tipoarchivo,List<TipoArchivo> tipoarchivos) throws Exception {
		try	{			
			TipoArchivoConstantesFunciones.actualizarSelectedLista(tipoarchivo,tipoarchivos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoArchivo> tipoarchivosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoarchivosLocal=this.tipoarchivoLogic.getTipoArchivos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoarchivosLocal=this.tipoarchivos;
			}
			//ARCHITECTURE
		
			for(TipoArchivo tipoarchivoLocal:tipoarchivosLocal) {
				if(this.permiteMantenimiento(tipoarchivoLocal) && tipoarchivoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoArchivoConstantesFunciones.getTipoArchivoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoArchivoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoArchivo.jLabelcodigoTipoArchivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoArchivoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoArchivo.jLabelnombreTipoArchivo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoArchivo.jLabelcodigoTipoArchivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoArchivo.jLabelnombreTipoArchivo,"");
		
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
		this.iIdNuevoTipoArchivo--;	
		
		
		this.tipoarchivoAux=new TipoArchivo();
		
		this.tipoarchivoAux.setId(this.iIdNuevoTipoArchivo);
		this.tipoarchivoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoarchivoLogic.getTipoArchivos().add(this.tipoarchivoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoarchivos.add(this.tipoarchivoAux);
		}
		//ARCHITECTURE
		
		this.tipoarchivo=this.tipoarchivoAux;
		
		if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoArchivo(this.tipoarchivo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoArchivo(this.tipoarchivo);
		}
				
		//this.setDefaultControlesTipoArchivo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoArchivo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoArchivo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoArchivo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoArchivo(this.tipoarchivoBean,this.tipoarchivo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoArchivoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
			classes=TipoArchivoConstantesFunciones.getClassesRelationshipsOfTipoArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoarchivoReturnGeneral=tipoarchivoLogic.procesarEventosTipoArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarchivoLogic.getTipoArchivos(),this.tipoarchivo,this.tipoarchivoParameterGeneral,this.isEsNuevoTipoArchivo,classes);//this.tipoarchivoLogic.getTipoArchivo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoArchivo(this.tipoarchivoReturnGeneral,this.tipoarchivoBean,false);
		
		if(this.tipoarchivoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo());
		}
		
		if(this.tipoarchivoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo(),classes);//this.tipoarchivoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoArchivo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoArchivo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoArchivo(false);
						
			if(tipoarchivoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoArchivo();
			}
			
			this.actualizarVisualTableDatosTipoArchivo();
			
			this.jTableDatosTipoArchivo.setRowSelectionInterval(this.getIndiceNuevoTipoArchivo(), this.getIndiceNuevoTipoArchivo());
			
			this.seleccionarFilaTablaTipoArchivoActual();
						
			this.actualizarEstadoCeldasBotonesTipoArchivo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoArchivo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setEnabled(isHabilitar && this.tipoarchivoConstantesFunciones.activarcodigoTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setEnabled(isHabilitar && this.tipoarchivoConstantesFunciones.activarnombreTipoArchivo);	
		
	};
	
	public void setDefaultControlesTipoArchivo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoArchivo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoarchivoSessionBean.setConGuardarRelaciones(true);			
			this.tipoarchivoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.setVisible(true);
			
					
		} else {
			//this.tipoarchivoSessionBean.setConGuardarRelaciones(false);			
			this.tipoarchivoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoArchivo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
				if(tipoarchivoAux.getId().equals(this.iIdNuevoTipoArchivo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivos) {
				if(tipoarchivoAux.getId().equals(this.iIdNuevoTipoArchivo)) {
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
	
	public int getIndiceActualTipoArchivo(TipoArchivo tipoarchivo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
				if(tipoarchivoAux.getId().equals(tipoarchivo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivos) {
				if(tipoarchivoAux.getId().equals(tipoarchivo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoArchivo(TipoArchivo tipoarchivoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
				if(tipoarchivoAux.getTipoArchivoOriginal().getId().equals(tipoarchivoOriginal.getId())) {
					existe=true;
					tipoarchivoOriginal.setId(tipoarchivoAux.getId());
					tipoarchivoOriginal.setVersionRow(tipoarchivoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoArchivo tipoarchivoAux:this.tipoarchivos) {
				if(tipoarchivoAux.getTipoArchivoOriginal().getId().equals(tipoarchivoOriginal.getId())) {
					existe=true;
					tipoarchivoOriginal.setId(tipoarchivoAux.getId());
					tipoarchivoOriginal.setVersionRow(tipoarchivoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoArchivo(Boolean esParaCancelar) throws Exception {
		tipoarchivosAux=new ArrayList<TipoArchivo>();
		tipoarchivoAux=new TipoArchivo();
		
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
					if(tipoarchivoAux.getId()<0) {
						tipoarchivosAux.add(tipoarchivoAux);
					}		
				}
				this.iIdNuevoTipoArchivo=0L;
				this.tipoarchivoLogic.getTipoArchivos().removeAll(tipoarchivosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoArchivo tipoarchivoAux:this.tipoarchivos) {
					if(tipoarchivoAux.getId()<0) {
						tipoarchivosAux.add(tipoarchivoAux);
					}		
				}
				this.iIdNuevoTipoArchivo=0L;
				this.tipoarchivos.removeAll(tipoarchivosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoArchivo 
					&& this.tipoarchivoLogic.getTipoArchivos().size()>0
					) {
					tipoarchivoAux=this.tipoarchivoLogic.getTipoArchivos().get(this.tipoarchivoLogic.getTipoArchivos().size() - 1);
				
					if(tipoarchivoAux.getId()<0) {
						this.tipoarchivoLogic.getTipoArchivos().remove(tipoarchivoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoArchivo && this.tipoarchivos.size()>0) {
					tipoarchivoAux=this.tipoarchivos.get(this.tipoarchivos.size() - 1);
				
					if(tipoarchivoAux.getId()<0) {
						this.tipoarchivos.remove(tipoarchivoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoArchivo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoarchivo.getId()<0) {
				this.tipoarchivoLogic.getTipoArchivos().remove(this.tipoarchivo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoarchivo.getId()<0) {
				this.tipoarchivos.remove(this.tipoarchivo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoArchivo(List<TipoArchivo> tipoarchivosAux) throws Exception {
		TipoArchivoConstantesFunciones.setEstadosInicialesTipoArchivo(tipoarchivosAux);
	}
	
	public void setEstadosInicialesTipoArchivo(TipoArchivo tipoarchivoAux) throws Exception {
		TipoArchivoConstantesFunciones.setEstadosInicialesTipoArchivo(tipoarchivoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoArchivoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoArchivoActual()) {
				if(!this.isEsNuevoTipoArchivo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoArchivo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoArchivoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Archivo ?", "MANTENIMIENTO DE Tipo Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoArchivo tipoarchivo) throws Exception {
		TipoArchivoConstantesFunciones.seleccionarAsignar(this.tipoarchivo,tipoarchivo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoArchivo=this.isPermisoActualizarOriginalTipoArchivo;
			
			
			this.seleccionarAsignar(tipoarchivo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoArchivoConstantesFunciones.quitarEspaciosTipoArchivo(this.tipoarchivo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoarchivoSessionBean.setsFuncionBusquedaRapida(this.tipoarchivoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoArchivo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoArchivo(esParaCancelar);				
				this.cancelarNuevoTipoArchivo(esParaCancelar);								
			}
			
			this.tipoarchivo=new TipoArchivo();
			
			this.inicializarTipoArchivo();
			
			this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoArchivo() throws Exception {
		try {
			TipoArchivoConstantesFunciones.inicializarTipoArchivo(this.tipoarchivo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoarchivoLogic.getTipoArchivos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoArchivos(String sAccionBusqueda,List<TipoArchivo> tipoarchivosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoArchivo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoArchivoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoArchivoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoArchivo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Archivos");		
		parameters.put("busquedapor", TipoArchivoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoArchivo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoArchivo=new JRBeanArrayDataSource(TipoArchivoJInternalFrame.TraerTipoArchivoBeans(tipoarchivosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoArchivo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoArchivoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoArchivoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoArchivoBean.TraerTipoArchivoBeans(tipoarchivosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoArchivoActionPerformed(null);
					//this.generarExcelReporteTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoArchivos(sAccionBusqueda,sTipoArchivoReporte,tipoarchivosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoArchivo> tipoarchivosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoArchivos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoArchivo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoArchivo tipoarchivo : tipoarchivosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoArchivoConstantesFunciones.generarExcelReporteDataTipoArchivo("NORMAL",row,workbook,tipoarchivo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoArchivo(String sTipo,Row row,Workbook workbook) {
		
		TipoArchivoConstantesFunciones.generarExcelReporteHeaderTipoArchivo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoArchivo> tipoarchivosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoArchivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoArchivo tipoarchivo : tipoarchivosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoArchivoConstantesFunciones.getTipoArchivoDescripcion(tipoarchivo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoArchivoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoarchivo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoArchivoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoarchivo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoArchivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoArchivo> tipoarchivosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoArchivo> tipoarchivosRespaldo=null;
		
		classes=TipoArchivoConstantesFunciones.getClassesRelationshipsOfTipoArchivo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoarchivoLogic.setDatosCliente(this.datosCliente);
		this.tipoarchivoLogic.setDatosDeep(this.datosDeep);
		this.tipoarchivoLogic.setIsConDeep(true);
		
		tipoarchivosRespaldo=this.tipoarchivoLogic.getTipoArchivos();
		
		this.tipoarchivoLogic.setTipoArchivos(tipoarchivosParaReportes);	
		this.tipoarchivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoarchivosParaReportes=this.tipoarchivoLogic.getTipoArchivos();
		this.tipoarchivoLogic.setTipoArchivos(tipoarchivosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoArchivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoArchivo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoArchivo tipoarchivo : tipoarchivosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoArchivo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoArchivoConstantesFunciones.generarExcelReporteDataTipoArchivo("NORMAL",row,workbook,tipoarchivo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoArchivoConstantesFunciones.getTipoArchivoDescripcion(tipoarchivo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoArchivo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoArchivo() throws Exception {		
		this.startProcessTipoArchivo(true);
	}
	
	public void startProcessTipoArchivo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoArchivo, this.jScrollPanelDatosTipoArchivo,this.jPanelPaginacionTipoArchivo, this.jScrollPanelDatosEdicionTipoArchivo, this.jPanelAccionesTipoArchivo,this.jPanelAccionesFormularioTipoArchivo,this.jmenuBarTipoArchivo,this.jmenuBarDetalleTipoArchivo,this.jTtoolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoArchivo=null; 
		
		final JPanel jPanelParametrosReportesTipoArchivo=this.jPanelParametrosReportesTipoArchivo;
		//final JScrollPane jScrollPanelDatosTipoArchivo=this.jScrollPanelDatosTipoArchivo;
		final JTable jTableDatosTipoArchivo=this.jTableDatosTipoArchivo;		
		final JPanel jPanelPaginacionTipoArchivo=this.jPanelPaginacionTipoArchivo;
		//final JScrollPane jScrollPanelDatosEdicionTipoArchivo=this.jScrollPanelDatosEdicionTipoArchivo;
		final JPanel jPanelAccionesTipoArchivo=this.jPanelAccionesTipoArchivo;
		
		JPanel jPanelCamposAuxiliarTipoArchivo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoArchivo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			jPanelCamposAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jPanelCamposTipoArchivo;
			jPanelAccionesFormularioAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jPanelAccionesFormularioTipoArchivo;
		}
		
		final JPanel jPanelCamposTipoArchivo=jPanelCamposAuxiliarTipoArchivo;
		final JPanel jPanelAccionesFormularioTipoArchivo=jPanelAccionesFormularioAuxiliarTipoArchivo;
		
		
		final JMenuBar jmenuBarTipoArchivo=this.jmenuBarTipoArchivo;
		final JToolBar jTtoolBarTipoArchivo=this.jTtoolBarTipoArchivo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoArchivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoArchivo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			jmenuBarDetalleAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jmenuBarDetalleTipoArchivo;
			jTtoolBarDetalleAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jTtoolBarDetalleTipoArchivo;
		}
		
		final JMenuBar jmenuBarDetalleTipoArchivo=jmenuBarDetalleAuxiliarTipoArchivo;
		final JToolBar jTtoolBarDetalleTipoArchivo=jTtoolBarDetalleAuxiliarTipoArchivo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoArchivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoArchivo;
			processRunnable.jTableDatos=jTableDatosTipoArchivo;
			processRunnable.jPanelCampos=jPanelCamposTipoArchivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoArchivo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoArchivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoArchivo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoArchivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoArchivo;
			processRunnable.jTtoolBar=jTtoolBarTipoArchivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoArchivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoArchivo ,jPanelParametrosReportesTipoArchivo,jTableDatosTipoArchivo, /*jScrollPanelDatosTipoArchivo,*/jPanelCamposTipoArchivo,jPanelPaginacionTipoArchivo, /*jScrollPanelDatosEdicionTipoArchivo,*/ jPanelAccionesTipoArchivo,jPanelAccionesFormularioTipoArchivo,jmenuBarTipoArchivo,jmenuBarDetalleTipoArchivo,jTtoolBarTipoArchivo,jTtoolBarDetalleTipoArchivo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoArchivo, jScrollPanelDatosTipoArchivo,jPanelPaginacionTipoArchivo, jScrollPanelDatosEdicionTipoArchivo, jPanelAccionesTipoArchivo,jPanelAccionesFormularioTipoArchivo,jmenuBarTipoArchivo,jmenuBarDetalleTipoArchivo,jTtoolBarTipoArchivo,jTtoolBarDetalleTipoArchivo);
						
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
	
	public void finishProcessTipoArchivo() {// throws Exception 
		this.finishProcessTipoArchivo(true);
	}
	
	public void finishProcessTipoArchivo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoArchivo, this.jScrollPanelDatosTipoArchivo,this.jPanelPaginacionTipoArchivo, this.jScrollPanelDatosEdicionTipoArchivo, this.jPanelAccionesTipoArchivo,this.jPanelAccionesFormularioTipoArchivo,this.jmenuBarTipoArchivo,this.jmenuBarDetalleTipoArchivo,this.jTtoolBarTipoArchivo,this.jTtoolBarDetalleTipoArchivo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoArchivo=null; 
		
		final JPanel jPanelParametrosReportesTipoArchivo=this.jPanelParametrosReportesTipoArchivo;
		//final JScrollPane jScrollPanelDatosTipoArchivo=this.jScrollPanelDatosTipoArchivo;
		final JTable jTableDatosTipoArchivo=this.jTableDatosTipoArchivo;		
		final JPanel jPanelPaginacionTipoArchivo=this.jPanelPaginacionTipoArchivo;
		//final JScrollPane jScrollPanelDatosEdicionTipoArchivo=this.jScrollPanelDatosEdicionTipoArchivo;
		final JPanel jPanelAccionesTipoArchivo=this.jPanelAccionesTipoArchivo;
		
		JPanel jPanelCamposAuxiliarTipoArchivo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoArchivo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			jPanelCamposAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jPanelCamposTipoArchivo;
			jPanelAccionesFormularioAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jPanelAccionesFormularioTipoArchivo;
		}
		
		final JPanel jPanelCamposTipoArchivo=jPanelCamposAuxiliarTipoArchivo;
		final JPanel jPanelAccionesFormularioTipoArchivo=jPanelAccionesFormularioAuxiliarTipoArchivo;
		
		
		final JMenuBar jmenuBarTipoArchivo=this.jmenuBarTipoArchivo;		
		final JToolBar jTtoolBarTipoArchivo=this.jTtoolBarTipoArchivo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoArchivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoArchivo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			jmenuBarDetalleAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jmenuBarDetalleTipoArchivo;
			jTtoolBarDetalleAuxiliarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jTtoolBarDetalleTipoArchivo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoArchivo=jmenuBarDetalleAuxiliarTipoArchivo;
		final JToolBar jTtoolBarDetalleTipoArchivo=jTtoolBarDetalleAuxiliarTipoArchivo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoArchivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoArchivo;
			processRunnable.jTableDatos=jTableDatosTipoArchivo;
			processRunnable.jPanelCampos=jPanelCamposTipoArchivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoArchivo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoArchivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoArchivo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoArchivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoArchivo;
			processRunnable.jTtoolBar=jTtoolBarTipoArchivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoArchivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoArchivo ,jPanelParametrosReportesTipoArchivo, jTableDatosTipoArchivo,/*jScrollPanelDatosTipoArchivo,*/jPanelCamposTipoArchivo,jPanelPaginacionTipoArchivo, /*jScrollPanelDatosEdicionTipoArchivo,*/ jPanelAccionesTipoArchivo,jPanelAccionesFormularioTipoArchivo,jmenuBarTipoArchivo,jmenuBarDetalleTipoArchivo,jTtoolBarTipoArchivo,jTtoolBarDetalleTipoArchivo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoArchivo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoArchivo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoArchivo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoArchivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoArchivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoArchivo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoArchivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoArchivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoArchivo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoarchivoConstantesFunciones.getsFinalQueryTipoArchivo();
		String  finalQueryPaginacionTodos=this.tipoarchivoConstantesFunciones.getsFinalQueryTipoArchivo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoArchivoConstantesFunciones.getArrayColumnasGlobalesNoTipoArchivo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoArchivoConstantesFunciones.getArrayColumnasGlobalesTipoArchivo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoArchivoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoarchivosEliminados= new ArrayList<TipoArchivo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoArchivo();
		
				///*TipoArchivoSessionBean*/this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
			
			if(this.tipoarchivoSessionBean==null) {
				this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
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
					this.iNumeroPaginacion=TipoArchivoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoArchivoConstantesFunciones.getClassesForeignKeysOfTipoArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoarchivo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoarchivosAux= new ArrayList<TipoArchivo>();
			
				
			tipoarchivoLogic.setDatosCliente(this.datosCliente);
			tipoarchivoLogic.setDatosDeep(this.datosDeep);
			tipoarchivoLogic.setIsConDeep(true);
			
			
			tipoarchivoLogic.getTipoArchivoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoarchivoLogic.getTodosTipoArchivos(finalQueryGlobal,pagination);
					
					//tipoarchivoLogic.getTodosTipoArchivosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoarchivoLogic.getTipoArchivos()==null|| tipoarchivoLogic.getTipoArchivos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarchivosAux= new ArrayList<TipoArchivo>();
							tipoarchivosAux.addAll(tipoarchivoLogic.getTipoArchivos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarchivosAux= new ArrayList<TipoArchivo>();
							tipoarchivosAux.addAll(tipoarchivos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarchivoLogic.getTodosTipoArchivos(finalQueryGlobal+"",this.pagination);												
							
							//tipoarchivoLogic.getTodosTipoArchivosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoArchivos("Todos",tipoarchivoLogic.getTipoArchivos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarchivoLogic.setTipoArchivos(new ArrayList<TipoArchivo>());					
							tipoarchivoLogic.getTipoArchivos().addAll(tipoarchivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarchivos=new ArrayList<TipoArchivo>();
							tipoarchivos.addAll(tipoarchivosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoArchivo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoArchivo=this.idActual;
				
				} else if(this.idTipoArchivoActual!=null && this.idTipoArchivoActual!=0L) {
					idTipoArchivo=idTipoArchivoActual;
				}
				
					
				this.sDetalleReporte=TipoArchivoConstantesFunciones.getDetalleIndicePorId(idTipoArchivo);
				
				this.tipoarchivos=new ArrayList<TipoArchivo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoarchivoLogic.getEntity(idTipoArchivo);
					
					//tipoarchivoLogic.getEntityWithConnection(idTipoArchivo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarchivoLogic.setTipoArchivos(new ArrayList<TipoArchivo>());
					tipoarchivoLogic.getTipoArchivos().add(tipoarchivoLogic.getTipoArchivo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoarchivos=new ArrayList<TipoArchivo>();
					this.tipoarchivos.add(tipoarchivo);
				}
				
				if(tipoarchivoLogic.getTipoArchivo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoArchivo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoArchivo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoarchivoLogic.getTipoArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarchivos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoarchivoLogic.getTipoArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarchivos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoArchivo tipoarchivo) {
		Boolean permite=true;
		
		if(this.tipoarchivo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoArchivoConstantesFunciones.getOrderByListaTipoArchivo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoArchivoConstantesFunciones.getOrderByListaTipoArchivo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoArchivo tipoarchivo:tipoarchivoLogic.getTipoArchivos()) {
				if(tipoarchivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarchivoTotales=tipoarchivo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoArchivo tipoarchivo:this.tipoarchivos) {
				if(tipoarchivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarchivoTotales=tipoarchivo;
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
			this.tipoarchivoAux=new TipoArchivo();
			this.tipoarchivoAux.setsType(Constantes2.S_TOTALES);
			this.tipoarchivoAux.setIsNew(false);
			this.tipoarchivoAux.setIsChanged(false);
			this.tipoarchivoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoArchivoConstantesFunciones.TotalizarValoresFilaTipoArchivo(this.tipoarchivoLogic.getTipoArchivos(),this.tipoarchivoAux);
				
				this.tipoarchivoLogic.getTipoArchivos().add(this.tipoarchivoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoArchivoConstantesFunciones.TotalizarValoresFilaTipoArchivo(this.tipoarchivos,this.tipoarchivoAux);
				
				this.tipoarchivos.add(this.tipoarchivoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoarchivoTotales=new TipoArchivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoarchivoLogic.getTipoArchivos().remove(tipoarchivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoarchivos.remove(tipoarchivoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoarchivoTotales=new TipoArchivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoArchivo tipoarchivo:tipoarchivoLogic.getTipoArchivos()) {
				if(tipoarchivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarchivoTotales=tipoarchivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoArchivoConstantesFunciones.TotalizarValoresFilaTipoArchivo(this.tipoarchivoLogic.getTipoArchivos(),tipoarchivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoArchivo tipoarchivo:this.tipoarchivos) {
				if(tipoarchivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarchivoTotales=tipoarchivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoArchivoConstantesFunciones.TotalizarValoresFilaTipoArchivo(this.tipoarchivos,tipoarchivoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoArchivo() {
		this.isPermisoTodoTipoArchivo=false;
		this.isPermisoNuevoTipoArchivo=false;
		this.isPermisoActualizarTipoArchivo=false;
		this.isPermisoActualizarOriginalTipoArchivo=false;
		this.isPermisoEliminarTipoArchivo=false;
		this.isPermisoGuardarCambiosTipoArchivo=false;
		this.isPermisoConsultaTipoArchivo=false;
		this.isPermisoBusquedaTipoArchivo=false;
		this.isPermisoReporteTipoArchivo=false;		
		this.isPermisoOrdenTipoArchivo=false;		
		this.isPermisoPaginacionMedioTipoArchivo=false;		
		this.isPermisoPaginacionAltoTipoArchivo=false;
		this.isPermisoPaginacionTodoTipoArchivo=false;
		this.isPermisoCopiarTipoArchivo=false;		
		this.isPermisoVerFormTipoArchivo=false;		
		this.isPermisoDuplicarTipoArchivo=false;		
		this.isPermisoOrdenTipoArchivo=false;		
	}
	
	public void setPermisosUsuarioTipoArchivo(Boolean isPermiso) {
		this.isPermisoTodoTipoArchivo=isPermiso;
		this.isPermisoNuevoTipoArchivo=isPermiso;
		this.isPermisoActualizarTipoArchivo=isPermiso;
		this.isPermisoActualizarOriginalTipoArchivo=isPermiso;
		this.isPermisoEliminarTipoArchivo=isPermiso;
		this.isPermisoGuardarCambiosTipoArchivo=isPermiso;
		this.isPermisoConsultaTipoArchivo=isPermiso;
		this.isPermisoBusquedaTipoArchivo=isPermiso;
		this.isPermisoReporteTipoArchivo=isPermiso;
		this.isPermisoOrdenTipoArchivo=isPermiso;		
		this.isPermisoPaginacionMedioTipoArchivo=isPermiso;		
		this.isPermisoPaginacionAltoTipoArchivo=isPermiso;		
		this.isPermisoPaginacionTodoTipoArchivo=isPermiso;		
		this.isPermisoCopiarTipoArchivo=isPermiso;		
		this.isPermisoVerFormTipoArchivo=isPermiso;		
		this.isPermisoDuplicarTipoArchivo=isPermiso;
		this.isPermisoOrdenTipoArchivo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoArchivo(Boolean isPermiso) {
		//this.isPermisoTodoTipoArchivo=isPermiso;
		this.isPermisoNuevoTipoArchivo=isPermiso;
		this.isPermisoActualizarTipoArchivo=isPermiso;
		this.isPermisoActualizarOriginalTipoArchivo=isPermiso;
		this.isPermisoEliminarTipoArchivo=isPermiso;
		this.isPermisoGuardarCambiosTipoArchivo=isPermiso;
		//this.isPermisoConsultaTipoArchivo=isPermiso;
		//this.isPermisoBusquedaTipoArchivo=isPermiso;
		//this.isPermisoReporteTipoArchivo=isPermiso;
		//this.isPermisoOrdenTipoArchivo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoArchivo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoArchivo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoArchivo=isPermiso;		
		//this.isPermisoCopiarTipoArchivo=isPermiso;		
		//this.isPermisoDuplicarTipoArchivo=isPermiso;
		//this.isPermisoOrdenTipoArchivo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoArchivoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoArchivo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoArchivoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoArchivoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoArchivoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoArchivoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoArchivo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoArchivoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoArchivo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoArchivo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoArchivo=this.isPermisoActualizarTipoArchivo;
			this.isPermisoEliminarTipoArchivo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoArchivo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoArchivo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoArchivo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoArchivo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoArchivo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoArchivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoArchivo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoArchivo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoArchivo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoArchivo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoArchivo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoArchivo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoArchivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoArchivo.setToolTipText(this.jTableDatosTipoArchivo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoArchivo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoArchivo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoArchivo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoArchivoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoArchivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoArchivoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoArchivoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoArchivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoArchivo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoArchivo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoArchivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoArchivo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoArchivo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoArchivo(TipoArchivo tipoarchivo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoArchivo(TipoArchivo tipoarchivo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoArchivo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoArchivo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoArchivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoArchivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoArchivo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoArchivo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoArchivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoArchivo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoArchivoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoArchivoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoArchivoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoarchivoSessionBean=new TipoArchivoSessionBean(); 
		this.tipoarchivoConstantesFunciones=new TipoArchivoConstantesFunciones(); 
		this.tipoarchivoBean=new TipoArchivo();//(this.tipoarchivoConstantesFunciones); 		
		this.tipoarchivoReturnGeneral=new TipoArchivoParameterReturnGeneral(); 
		
		this.tipoarchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoArchivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoArchivo(true);
			
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
			
			this.tipoarchivoConstantesFunciones=new TipoArchivoConstantesFunciones(); 
			this.tipoarchivoBean=new TipoArchivo();//this.tipoarchivoConstantesFunciones); 			
			this.tipoarchivoReturnGeneral=new TipoArchivoParameterReturnGeneral(); 
		
			TipoArchivoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Archivo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoarchivo=new TipoArchivo();
			this.tipoarchivos = new ArrayList<TipoArchivo>();
			this.tipoarchivosAux = new ArrayList<TipoArchivo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic=new TipoArchivoLogic();
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoarchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoarchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoArchivo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoArchivo);	
					}
					
					if(this.jInternalFrameImportacionTipoArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoArchivo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoArchivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoArchivo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoArchivo);
				this.jInternalFrameDetalleFormTipoArchivo.setVisible(false);
				this.jInternalFrameDetalleFormTipoArchivo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoArchivo);
					this.jInternalFrameReporteDinamicoTipoArchivo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoArchivo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoArchivo);
					this.jInternalFrameImportacionTipoArchivo.setVisible(false);
					this.jInternalFrameImportacionTipoArchivo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoArchivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoArchivo);
					this.jInternalFrameOrderByTipoArchivo.setVisible(false);
					this.jInternalFrameOrderByTipoArchivo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoArchivoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoArchivoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoarchivoReturnGeneral=new TipoArchivoParameterReturnGeneral();
			
			this.tipoarchivoParameterGeneral=new TipoArchivoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoarchivoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoArchivoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoArchivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoarchivoSessionBean.getEsGuardarRelacionado(),this.tipoarchivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoArchivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoarchivoSessionBean.getEsGuardarRelacionado(),this.tipoarchivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaDuplicarTipoArchivo=true;
			this.isVisibilidadCeldaCopiarTipoArchivo=true;
			this.isVisibilidadCeldaVerFormTipoArchivo=true;
			this.isVisibilidadCeldaOrdenTipoArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=false;
			this.isVisibilidadCeldaGuardarTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoArchivo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoArchivo(false);
			
			this.setPermisosUsuarioTipoArchivo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoarchivoSessionBean.getEsGuardarRelacionado() && this.tipoarchivoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoArchivoClasesRelacionadas();
			}
			
			if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoArchivoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoArchivo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoArchivo();
			}
			
			if(!this.isPermisoBusquedaTipoArchivo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoArchivo,this.isPermisoPaginacionMedioTipoArchivo,this.isPermisoPaginacionTodoTipoArchivo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoArchivoConstantesFunciones.getTiposSeleccionarTipoArchivo());
				
				this.tiposColumnasSelect=TipoArchivoConstantesFunciones.getTiposSeleccionarTipoArchivo(true);
				
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
			//if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoArchivo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoArchivo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoArchivo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoArchivo() ;
			
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
				tipoarchivoImplementable= (TipoArchivoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoArchivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoarchivoImplementableHome= (TipoArchivoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoArchivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoarchivos= new ArrayList<TipoArchivo>();
			this.tipoarchivosEliminados= new ArrayList<TipoArchivo>();
						
			this.isEsNuevoTipoArchivo=false;
			this.esParaAccionDesdeFormularioTipoArchivo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoArchivo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoArchivo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoArchivoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoArchivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoArchivo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoArchivo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoArchivo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoArchivo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoArchivo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoArchivo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoArchivo")) {
				iIndex=this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoArchivo();	
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
	
	public void cargarCombosForeignKeyTipoArchivo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoArchivo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoArchivo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoArchivoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoArchivo();
		
		this.cargarCombosFrameForeignKeyTipoArchivo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoArchivo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoArchivo();
		}
	}
	
	
	
	public void jButtonNuevoTipoArchivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			
			if(jTableDatosTipoArchivo.getRowCount()>=1) {
				jTableDatosTipoArchivo.removeRowSelectionInterval(0, jTableDatosTipoArchivo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoArchivo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoArchivo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoArchivo(true);			
			//this.tipoarchivo=new TipoArchivo();
			//this.tipoarchivo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoArchivo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoArchivo() ;
			
			if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoArchivo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoarchivo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);				
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoArchivo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoArchivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoArchivo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoArchivo.getSelectedRows().length;			
			}
			
			tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoArchivo--;			
				//TipoArchivo tipoarchivoAux= new TipoArchivo();			
				//tipoarchivoAux.setId(this.iIdNuevoTipoArchivo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoArchivo tipoarchivoOrigen=new TipoArchivo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoArchivo tipoarchivoOrigen : tipoarchivosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoarchivoOrigen =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarchivoOrigen =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoArchivo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoarchivo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoArchivo(tipoarchivoOrigen,this.tipoarchivo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoarchivoLogic.getTipoArchivos().add(this.tipoarchivoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoarchivos.add(this.tipoarchivoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoArchivo(false);
				
				this.jTableDatosTipoArchivo.setRowSelectionInterval(this.getIndiceNuevoTipoArchivo(), this.getIndiceNuevoTipoArchivo());
				
				int iLastRow =  this.jTableDatosTipoArchivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoArchivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoArchivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoArchivo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();									
		
			TipoArchivo tipoarchivoOrigen=new TipoArchivo();
			TipoArchivo tipoarchivoDestino=new TipoArchivo();
				
			tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoArchivo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoarchivosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoArchivo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarchivoOrigen =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoarchivoOrigen =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarchivoDestino =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoarchivoDestino =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoarchivoOrigen =tipoarchivosSeleccionados.get(0);
				tipoarchivoDestino =tipoarchivosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoArchivo(tipoarchivoOrigen,tipoarchivoDestino,true,false);
				
				tipoarchivoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoarchivoDestino,tipoarchivoLogic.getTipoArchivos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarchivoDestino,tipoarchivos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoArchivo(false);
				
				//this.jTableDatosTipoArchivo.setRowSelectionInterval(this.getIndiceNuevoTipoArchivo(), this.getIndiceNuevoTipoArchivo());
				
				int iLastRow =  this.jTableDatosTipoArchivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoArchivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoArchivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoArchivo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoArchivo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoArchivo.isVisible();
			
			
			this.jPanelParametrosReportesTipoArchivo.setVisible(!isVisible);
			this.jPanelPaginacionTipoArchivo.setVisible(!isVisible);
			this.jPanelAccionesTipoArchivo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoArchivo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoArchivo();
			
			this.abrirFrameOrderByTipoArchivo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoArchivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoArchivo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoArchivo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoArchivo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoArchivo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoArchivo.setSize(this.jInternalFrameDetalleFormTipoArchivo.iWidthFormulario,this.jInternalFrameDetalleFormTipoArchivo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoArchivo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoArchivo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoArchivo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoArchivo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoArchivo.jContentPaneDetalleTipoArchivo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoArchivo.jContentPaneDetalleTipoArchivo.getWidth(),TipoArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoArchivo.jContentPaneDetalleTipoArchivo.getWidth(),TipoArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoArchivo.jContentPaneDetalleTipoArchivo.getWidth(),TipoArchivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoArchivo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoArchivo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoArchivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoArchivo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoArchivo,false,this);
				} else {
					this.jInternalFrameOrderByTipoArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoArchivo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoArchivo);
				this.jInternalFrameOrderByTipoArchivo.setVisible(false);
				this.jInternalFrameOrderByTipoArchivo.setSelected(false);
				
				this.jInternalFrameOrderByTipoArchivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoArchivo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoArchivo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoArchivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoArchivo==null) {
				
				this.jInternalFrameImportacionTipoArchivo=new ImportacionJInternalFrame(TipoArchivoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoArchivo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoArchivo);
				this.jInternalFrameImportacionTipoArchivo.setVisible(false);
				this.jInternalFrameImportacionTipoArchivo.setSelected(false);


				this.jInternalFrameImportacionTipoArchivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoArchivo"));
				this.jInternalFrameImportacionTipoArchivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoArchivo"));
				this.jInternalFrameImportacionTipoArchivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoArchivo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoArchivo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoArchivo==null) {
				this.jInternalFrameReporteDinamicoTipoArchivo=new ReporteDinamicoJInternalFrame(TipoArchivoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoArchivo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoArchivo);
				this.jInternalFrameReporteDinamicoTipoArchivo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoArchivo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoArchivo"));
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoArchivo"));
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoArchivo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoArchivo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoArchivo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoArchivo);
			
	       	this.jInternalFrameDetalleFormTipoArchivo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoArchivo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoArchivo.dispose();
			//this.jInternalFrameDetalleFormTipoArchivo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoArchivo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoArchivo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoArchivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoArchivo.setVisible(true);
	        this.jInternalFrameImportacionTipoArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoArchivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoArchivo.setVisible(true);
	        this.jInternalFrameOrderByTipoArchivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoArchivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoArchivo.setVisible(false);
	        this.jInternalFrameOrderByTipoArchivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoArchivo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoArchivo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoArchivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoArchivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoArchivo.setVisible(false);
	        this.jInternalFrameImportacionTipoArchivo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoArchivo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoArchivo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoArchivo(true);
			//this.isEsNuevoTipoArchivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoArchivo(false) ;
			
			if(tipoarchivoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoArchivo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoArchivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoArchivoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoArchivo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoArchivo(true);
			//this.isEsNuevoTipoArchivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoarchivo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoArchivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoArchivo(false) ;
			
			if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoArchivo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoArchivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoArchivo(false);
			
			//if(!this.isEsNuevoTipoArchivo) {								
				int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoarchivo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoArchivo=true;
					this.inicializarActualizarBindingTablaTipoArchivo(false);
					this.isEsNuevoTipoArchivo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoArchivo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoArchivo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoArchivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoArchivo(false);
				
				this.habilitarDeshabilitarControlesTipoArchivo(false);
			
												
				
				if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoArchivo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoArchivoActionPerformed(evt,tipoarchivoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoArchivo(this.tipoarchivo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoArchivo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoarchivoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoarchivo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				this.tipoarchivo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				this.tipoarchivo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoarchivo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoArchivoModel) this.jTableDatosTipoArchivo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoArchivo=true;
				this.inicializarActualizarBindingTablaTipoArchivo(false);
				this.isEsNuevoTipoArchivo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoArchivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoArchivo(false);
				
				this.habilitarDeshabilitarControlesTipoArchivo(false);
				
				
				
				if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoArchivo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoArchivoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoArchivo.getRowCount()>=1) {
				jTableDatosTipoArchivo.removeRowSelectionInterval(0, jTableDatosTipoArchivo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoArchivo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoArchivo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoArchivo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoArchivo(false) ;
			
			this.isEsNuevoTipoArchivo=false;
			
			if(TipoArchivoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoArchivo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoArchivo(false);
				
				//SI ES MANUAL
				if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoArchivo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoArchivo--;			
			//TipoArchivo tipoarchivoAux= new TipoArchivo();			
			//tipoarchivoAux.setId(this.iIdNuevoTipoArchivo);
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoArchivo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
			
			this.tipoarchivo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoarchivoLogic.getTipoArchivos().add(this.tipoarchivoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoarchivos.add(this.tipoarchivoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoArchivo(false);
			
			this.jTableDatosTipoArchivo.setRowSelectionInterval(this.getIndiceNuevoTipoArchivo(), this.getIndiceNuevoTipoArchivo());
			
			int iLastRow =  this.jTableDatosTipoArchivo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoArchivo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoArchivo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoArchivo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoArchivo(false);
			
			//SI ES MANUAL
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoArchivo();
			}
			
			//this.abrirFrameTreeTipoArchivo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ArchivoS ?", "MANTENIMIENTO DE Tipo Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoArchivo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoArchivo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoarchivoReturnGeneral=tipoarchivoLogic.procesarImportacionTipoArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoarchivoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoArchivoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoArchivo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoArchivo.setFileImportacion(this.jInternalFrameImportacionTipoArchivo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoArchivo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoArchivo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoArchivo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoArchivo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		

		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoArchivoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoArchivoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoArchivoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoArchivoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoArchivo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoArchivoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoArchivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoArchivoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoArchivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoArchivoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoArchivoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoArchivoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoArchivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoArchivoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoArchivo tipoarchivo:tipoarchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoarchivo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoArchivoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoArchivo tipoarchivo:tipoarchivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoarchivo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoArchivo(row);				
			//	iRow++;
			//}				
			
			//for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoArchivo(tipoarchivoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoArchivo(false);
			
			//SI ES MANUAL
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoArchivo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoArchivo(false);
			
			//SI ES MANUAL
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoArchivo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoArchivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoArchivo(false);
			
			//SI ES MANUAL
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoArchivo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarchivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoArchivo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoArchivo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoArchivo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoArchivo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoArchivo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoArchivo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoArchivo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoArchivo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoArchivo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoArchivo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoArchivo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoArchivo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoArchivo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoArchivo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoArchivo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoArchivo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoArchivo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoArchivo();
		
		this.inicializarActualizarBindingBotonesManualTipoArchivo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoArchivo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoArchivo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoArchivo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoArchivo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoArchivo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoArchivo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoArchivo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionNuevoTipoArchivo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionSinCerrarTipoArchivo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionSinMensajeTipoArchivo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoArchivo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoArchivo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoArchivo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
				this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionNuevoTipoArchivo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionSinCerrarTipoArchivo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoArchivo.jCheckBoxPostAccionSinMensajeTipoArchivo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoArchivo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoArchivo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoArchivo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoArchivo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoArchivo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoArchivo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoArchivo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoArchivo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoArchivo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoArchivo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoArchivo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoArchivo() throws Exception {
		try	{
			if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoArchivo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoArchivo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoArchivo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoArchivo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoArchivo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoArchivo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoArchivo.addItem(reporte);
			}
			
			
			if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoArchivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoArchivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoArchivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoArchivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoArchivo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoArchivo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoArchivo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoArchivo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoArchivo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
				this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
				this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoArchivo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoArchivo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoArchivo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoArchivo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoArchivo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoArchivo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoArchivo(Boolean esInicializar) throws Exception {				
		if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoArchivo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoArchivo() throws Exception {
		this.inicializarActualizarBindingTablaTipoArchivo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoArchivo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoArchivoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoArchivo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoarchivoLogic.getTipoArchivos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoarchivos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoArchivo.setModel(new TipoArchivoModel(this.tipoarchivoLogic.getTipoArchivos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoArchivo.setModel(new TipoArchivoModel(this.tipoarchivos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoArchivo!=null && this.jInternalFrameOrderByTipoArchivo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoArchivo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO,tipoarchivoConstantesFunciones.resaltarSeleccionarTipoArchivo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoArchivoConstantesFunciones.SCLASSWEBTITULO,tipoarchivoConstantesFunciones.resaltarSeleccionarTipoArchivo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,TipoArchivoConstantesFunciones.LABEL_ID));

		if(this.tipoarchivoConstantesFunciones.mostraridTipoArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoArchivoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoarchivoConstantesFunciones.resaltaridTipoArchivo,this.tipoarchivoConstantesFunciones.activaridTipoArchivo,this,true,"idTipoArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarchivoConstantesFunciones.resaltaridTipoArchivo,this.tipoarchivoConstantesFunciones.activaridTipoArchivo,this,true,"idTipoArchivo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,TipoArchivoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoarchivoConstantesFunciones.mostrarcodigoTipoArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoArchivoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoarchivoConstantesFunciones.resaltarcodigoTipoArchivo,this.tipoarchivoConstantesFunciones.activarcodigoTipoArchivo,this,true,"codigoTipoArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarchivoConstantesFunciones.resaltarcodigoTipoArchivo,this.tipoarchivoConstantesFunciones.activarcodigoTipoArchivo,this,true,"codigoTipoArchivo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,TipoArchivoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoarchivoConstantesFunciones.mostrarnombreTipoArchivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoArchivoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoarchivoConstantesFunciones.resaltarnombreTipoArchivo,this.tipoarchivoConstantesFunciones.activarnombreTipoArchivo,this,true,"nombreTipoArchivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarchivoConstantesFunciones.resaltarnombreTipoArchivo,this.tipoarchivoConstantesFunciones.activarnombreTipoArchivo,this,true,"nombreTipoArchivo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoArchivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoArchivo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoArchivo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoarchivoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoArchivo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoArchivo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoArchivo.moveColumn(this.jTableDatosTipoArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoArchivo.moveColumn(this.jTableDatosTipoArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoArchivo.moveColumn(this.jTableDatosTipoArchivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoArchivo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoArchivo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoArchivo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoArchivo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoArchivo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoArchivo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoArchivo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoArchivo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoarchivoLogic.getTipoArchivos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoarchivos.size()-1;
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
		//this.jTableDatosTipoArchivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoArchivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoArchivo();
			
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
				
				//this.isEsNuevoTipoArchivo=false;
					
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
				if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoArchivo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoArchivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoArchivo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoarchivo.getsType().equals("DUPLICADO")
				   || this.tipoarchivo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoArchivo=true;
				
				} else {
					this.isEsNuevoTipoArchivo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoarchivo.getId()>=0 && !this.tipoarchivo.getIsNew()) {						
						this.isEsNuevoTipoArchivo=false;
						
					} else {
						this.isEsNuevoTipoArchivo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoArchivo(esRelaciones);						
				
				this.seleccionarTipoArchivo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoarchivo.getId()<0) {
					this.isEsNuevoTipoArchivo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoArchivo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoArchivo(evt,rowIndex);
				}	
				
				if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoArchivo: " + this.dDif); 
					}
				}								
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoArchivo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoarchivo)) {
					if(this.tipoarchivo.getId()>0) {
						this.tipoarchivo.setIsDeleted(true);
						
						this.tipoarchivosEliminados.add(this.tipoarchivo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoarchivoLogic.getTipoArchivos().remove(this.tipoarchivo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoarchivos.remove(this.tipoarchivo);				
					}
					
					
					((TipoArchivoModel) this.jTableDatosTipoArchivo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoArchivo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoArchivo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoArchivo) {
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoArchivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoArchivo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoArchivo(this.tipoarchivo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoArchivo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoArchivo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoArchivo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoArchivo(TipoArchivo tipoarchivo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoArchivo(tipoarchivo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoArchivo(TipoArchivo tipoarchivo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoArchivo(tipoarchivo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoArchivo(tipoarchivo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoArchivo(tipoarchivo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoArchivo(TipoArchivo tipoarchivo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setText(tipoarchivo.getId().toString());
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setText(tipoarchivo.getcodigo());
			this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setText(tipoarchivo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoArchivo tipoarchivoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoarchivoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoArchivo tipoarchivoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoarchivoLocal=this.tipoarchivo;
			} else {
				tipoarchivoLocal=this.tipoarchivoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoarchivoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoArchivo(tipoarchivoLocal,true);
					
					if(tipoarchivoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoarchivoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoarchivoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoArchivo(TipoArchivo tipoarchivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoArchivo(tipoarchivo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(tipoarchivo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoArchivo(TipoArchivo tipoarchivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoArchivo(tipoarchivo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoArchivo(TipoArchivo tipoarchivo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.getText()==null || this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.getText()=="" || this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setText("0");
			}

			if(conColumnasBase) {tipoarchivo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoArchivoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoArchivo.jLabelIdTipoArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoarchivo.setcodigo(this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoArchivoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoArchivo.jLabelcodigoTipoArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoarchivo.setnombre(this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoArchivoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoArchivo.jLabelnombreTipoArchivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoArchivo(TipoArchivo tipoarchivoBean,TipoArchivo tipoarchivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoArchivo(TipoArchivo tipoarchivoOrigen,TipoArchivo tipoarchivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoarchivoOrigen.getId()!=null && !tipoarchivoOrigen.getId().equals(0L))) {tipoarchivo.setId(tipoarchivoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoarchivoOrigen.getcodigo()!=null && !tipoarchivoOrigen.getcodigo().equals(""))) {tipoarchivo.setcodigo(tipoarchivoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoarchivoOrigen.getnombre()!=null && !tipoarchivoOrigen.getnombre().equals(""))) {tipoarchivo.setnombre(tipoarchivoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoArchivo(TipoArchivo tipoarchivo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setText(tipoarchivo.getId().toString());
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setText(tipoarchivo.getcodigo());
			this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setText(tipoarchivo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoArchivo(TipoArchivoBean tipoarchivoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setText(tipoarchivoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setText(tipoarchivoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setText(tipoarchivoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoArchivo(TipoArchivoParameterReturnGeneral tipoarchivoReturnGeneral,TipoArchivoBean tipoarchivoBean,Boolean conDefault) throws Exception { 
		try {
			TipoArchivo tipoarchivoLocal=new TipoArchivo();
			
			tipoarchivoLocal=tipoarchivoReturnGeneral.getTipoArchivo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoarchivoLocal.getId()!=null && !tipoarchivoLocal.getId().equals(0L))) {tipoarchivoBean.setId(tipoarchivoLocal.getId());}}
			if(conDefault || (!conDefault && tipoarchivoLocal.getcodigo()!=null && !tipoarchivoLocal.getcodigo().equals(""))) {tipoarchivoBean.setcodigo(tipoarchivoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoarchivoLocal.getnombre()!=null && !tipoarchivoLocal.getnombre().equals(""))) {tipoarchivoBean.setnombre(tipoarchivoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoArchivoGenerico(Long idTipoArchivoSeleccionado,JComboBox jComboBoxTipoArchivo,List<TipoArchivo> tipoarchivosLocal)throws Exception {
		try {
			TipoArchivo  tipoarchivoTemp=null;

			for(TipoArchivo tipoarchivoAux:tipoarchivosLocal) {
				if(tipoarchivoAux.getId()!=null && tipoarchivoAux.getId().equals(idTipoArchivoSeleccionado)) {
					tipoarchivoTemp=tipoarchivoAux;
					break;
				}
			}

			jComboBoxTipoArchivo.setSelectedItem(tipoarchivoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoArchivoGenerico(JComboBox jComboBoxTipoArchivo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoArchivo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoArchivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoArchivo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoArchivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoArchivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoArchivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarchivo=(TipoArchivo) tipoarchivoLogic.getTipoArchivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoarchivo =(TipoArchivo) tipoarchivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoArchivo tipoarchivoRow=new TipoArchivo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarchivoRow=(TipoArchivo) tipoarchivoLogic.getTipoArchivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoarchivoRow=(TipoArchivo) tipoarchivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoArchivo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo));			
			this.jButtonDuplicarTipoArchivo.setVisible((this.isVisibilidadCeldaDuplicarTipoArchivo && this.isPermisoDuplicarTipoArchivo));			
			this.jButtonCopiarTipoArchivo.setVisible((this.isVisibilidadCeldaCopiarTipoArchivo && this.isPermisoCopiarTipoArchivo));
			this.jButtonVerFormTipoArchivo.setVisible((this.isVisibilidadCeldaVerFormTipoArchivo && this.isPermisoVerFormTipoArchivo));
			
			this.jButtonAbrirOrderByTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));			
			
			this.jButtonNuevoRelacionesTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoArchivo && this.isPermisoNuevoTipoArchivo));			
			this.jButtonNuevoGuardarCambiosTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarTipoArchivo.setVisible((this.isVisibilidadCeldaModificarTipoArchivo && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.setVisible((this.isVisibilidadCeldaActualizarTipoArchivo && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.setVisible((this.isVisibilidadCeldaEliminarTipoArchivo && this.isPermisoEliminarTipoArchivo));
			this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.setVisible(this.isVisibilidadCeldaCancelarTipoArchivo);							
			this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo));						
			this.jButtonDuplicarToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaDuplicarTipoArchivo && this.isPermisoDuplicarTipoArchivo));						
			this.jButtonCopiarToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaCopiarTipoArchivo && this.isPermisoCopiarTipoArchivo));			
			this.jButtonVerFormToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaVerFormTipoArchivo && this.isPermisoVerFormTipoArchivo));			
			this.jButtonAbrirOrderByToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));
			this.jButtonNuevoRelacionesToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoArchivo && this.isPermisoNuevoTipoArchivo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));			
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaModificarTipoArchivo && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaActualizarTipoArchivo  && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaEliminarTipoArchivo && this.isPermisoEliminarTipoArchivo));
			this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarToolBarTipoArchivo.setVisible(this.isVisibilidadCeldaCancelarTipoArchivo);				
			this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo));			
			this.jMenuItemDuplicarTipoArchivo.setVisible((this.isVisibilidadCeldaDuplicarTipoArchivo && this.isPermisoDuplicarTipoArchivo));			
			this.jMenuItemCopiarTipoArchivo.setVisible((this.isVisibilidadCeldaCopiarTipoArchivo && this.isPermisoCopiarTipoArchivo));			
			this.jMenuItemVerFormTipoArchivo.setVisible((this.isVisibilidadCeldaVerFormTipoArchivo && this.isPermisoVerFormTipoArchivo));			
			this.jMenuItemAbrirOrderByTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));			
			//this.jMenuItemMostrarOcultarTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));
			this.jMenuItemDetalleAbrirOrderByTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));			
			//this.jMenuItemDetalleMostrarOcultarTipoArchivo.setVisible((this.isVisibilidadCeldaOrdenTipoArchivo && this.isPermisoOrdenTipoArchivo));			
			this.jMenuItemNuevoRelacionesTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoArchivo && this.isPermisoNuevoTipoArchivo));			
			this.jMenuItemNuevoGuardarCambiosTipoArchivo.setVisible((this.isVisibilidadCeldaNuevoTipoArchivo && this.isPermisoNuevoTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));									
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemModificarTipoArchivo.setVisible((this.isVisibilidadCeldaModificarTipoArchivo && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemActualizarTipoArchivo.setVisible((this.isVisibilidadCeldaActualizarTipoArchivo && this.isPermisoActualizarTipoArchivo));	
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemEliminarTipoArchivo.setVisible((this.isVisibilidadCeldaEliminarTipoArchivo && this.isPermisoEliminarTipoArchivo));
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemCancelarTipoArchivo.setVisible(this.isVisibilidadCeldaCancelarTipoArchivo);				
			}
			
			this.jMenuItemGuardarCambiosTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));						
			this.jMenuItemGuardarCambiosTablaTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoArchivo=this.jButtonNuevoTipoArchivo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoArchivo=this.jButtonDuplicarTipoArchivo.isVisible();
			this.isVisibilidadCeldaCopiarTipoArchivo=this.jButtonCopiarTipoArchivo.isVisible();
			this.isVisibilidadCeldaVerFormTipoArchivo=this.jButtonVerFormTipoArchivo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoArchivo=this.jButtonAbrirOrderByTipoArchivo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=this.jButtonNuevoRelacionesTipoArchivo.isVisible();
			this.isVisibilidadCeldaModificarTipoArchivo=this.jButtonModificarTipoArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.isVisibilidadCeldaActualizarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.isVisible();
			this.isVisibilidadCeldaGuardarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=this.jButtonGuardarCambiosTablaTipoArchivo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoArchivo=this.jButtonNuevoToolBarTipoArchivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=this.jButtonNuevoRelacionesToolBarTipoArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.isVisibilidadCeldaModificarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarToolBarTipoArchivo.isVisible();
			this.isVisibilidadCeldaActualizarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarToolBarTipoArchivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarToolBarTipoArchivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarToolBarTipoArchivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoArchivo=this.jButtonGuardarCambiosToolBarTipoArchivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=this.jButtonGuardarCambiosTablaToolBarTipoArchivo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoArchivo=this.jMenuItemNuevoTipoArchivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=this.jMenuItemNuevoRelacionesTipoArchivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.isVisibilidadCeldaModificarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jMenuItemModificarTipoArchivo.isVisible();
			this.isVisibilidadCeldaActualizarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jMenuItemActualizarTipoArchivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jMenuItemEliminarTipoArchivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoArchivo=this.jInternalFrameDetalleFormTipoArchivo.jMenuItemCancelarTipoArchivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoArchivo=this.jMenuItemGuardarCambiosTipoArchivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=this.jMenuItemGuardarCambiosTablaTipoArchivo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoArchivo(Boolean esInicializar) {
		if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoArchivo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoArchivo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoArchivo() {
		this.jButtonNuevoTipoArchivo.setVisible(this.isPermisoNuevoTipoArchivo);			
		this.jButtonDuplicarTipoArchivo.setVisible(this.isPermisoDuplicarTipoArchivo);			
		this.jButtonCopiarTipoArchivo.setVisible(this.isPermisoCopiarTipoArchivo);			
		this.jButtonVerFormTipoArchivo.setVisible(this.isPermisoVerFormTipoArchivo);			
		
		this.jButtonAbrirOrderByTipoArchivo.setVisible(this.isPermisoOrdenTipoArchivo);					
		
		this.jButtonNuevoRelacionesTipoArchivo.setVisible(this.isPermisoNuevoTipoArchivo);			
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarTipoArchivo.setVisible(this.isPermisoActualizarTipoArchivo);	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.setVisible(this.isPermisoActualizarTipoArchivo);	
			this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.setVisible(this.isPermisoEliminarTipoArchivo);
			this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.setVisible(this.isVisibilidadCeldaCancelarTipoArchivo);						
			this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.setVisible(this.isPermisoGuardarCambiosTipoArchivo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoArchivo.setVisible(this.isPermisoActualizarTipoArchivo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoArchivo() {
		this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarTipoArchivo.setVisible(this.isPermisoActualizarTipoArchivo);	
		this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.setVisible(this.isPermisoActualizarTipoArchivo);	
		this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.setVisible(this.isPermisoEliminarTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.setVisible(this.isVisibilidadCeldaCancelarTipoArchivo);							
		this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.setVisible((this.isVisibilidadCeldaGuardarTipoArchivo && this.isPermisoGuardarCambiosTipoArchivo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoArchivo() {
		if(TipoArchivoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoArchivo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoArchivo() {
	}
	
	public void jTableDatosTipoArchivoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoArchivo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoArchivo(this.gettipoarchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarchivo==null) {
						this.tipoarchivo = new TipoArchivo();
					}

					this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
				}

				if(this.tipoarchivo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoarchivo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoArchivo(this.gettipoarchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarchivo==null) {
						this.tipoarchivo = new TipoArchivo();
					}

					this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
				}

				if(this.tipoarchivo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoarchivo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoArchivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoArchivo(this.gettipoarchivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarchivo==null) {
						this.tipoarchivo = new TipoArchivo();
					}

					this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);
				}

				if(this.tipoarchivo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoarchivo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoArchivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoArchivo() {
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
			this.jInternalFrameDetalleFormTipoArchivo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoArchivo.dispose();
			this.jInternalFrameDetalleFormTipoArchivo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
			this.jInternalFrameReporteDinamicoTipoArchivo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoArchivo.dispose();
			this.jInternalFrameReporteDinamicoTipoArchivo=null;
		}
		
		if(this.jInternalFrameImportacionTipoArchivo!=null) {
			this.jInternalFrameImportacionTipoArchivo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoArchivo.dispose();
			this.jInternalFrameImportacionTipoArchivo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoArchivo();
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoArchivo")) {
				jButtonDuplicarTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoArchivo")) {
				jButtonCopiarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoArchivo")) {
				jButtonVerFormTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoArchivo")) {
				jButtonDuplicarTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoArchivo")) {
				jButtonDuplicarTipoArchivoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoArchivo")) {
				jButtonModificarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoArchivo")) {
				jButtonModificarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoArchivo")) {
				jButtonModificarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoArchivo")) {
				jButtonActualizarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoArchivo")) {
				jButtonActualizarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoArchivo")) {
				jButtonActualizarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoArchivo")) {
				jButtonEliminarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoArchivo")) {
				jButtonEliminarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoArchivo")) {
				jButtonEliminarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoArchivo")) {
				jButtonCancelarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoArchivo")) {
				jButtonCancelarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoArchivo")) {
				jButtonCancelarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoArchivo")) {
				jButtonCerrarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoArchivo")) {
				jButtonCerrarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoArchivo")) {
				jButtonCerrarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoArchivo")) {
				jButtonMostrarOcultarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoArchivo")) {
				jButtonCancelarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoArchivo")) {
				jButtonCopiarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoArchivo")) {
				jButtonVerFormTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoArchivo")) {
				jButtonCopiarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoArchivo")) {
				jButtonVerFormTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoArchivo")) {
				jButtonRecargarInformacionTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoArchivo")) {
				jButtonRecargarInformacionTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoArchivo")) {
				jButtonRecargarInformacionTipoArchivoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoArchivo")) {
				jButtonAnterioresTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoArchivo")) {
				jButtonAnterioresTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoArchivo")) {
				jButtonAnterioresTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoArchivo")) {
				jButtonSiguientesTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoArchivo")) {
				jButtonSiguientesTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoArchivo")) {
				jButtonSiguientesTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoArchivo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoArchivo")) {
				jButtonAbrirOrderByTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoArchivo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoArchivo")) {
				jButtonMostrarOcultarTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoArchivo")) {
				jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoArchivo")) {
				jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoArchivo")) {
				jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoArchivo")) {
				jButtonCerrarReporteDinamicoTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoArchivo")) {
				jButtonGenerarReporteDinamicoTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoArchivo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoArchivo")) {
				jButtonCerrarImportacionTipoArchivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoArchivo")) {
				
				jButtonGenerarImportacionTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoArchivo")) {
				
				jButtonAbrirImportacionTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoArchivo")) {
				jComboBoxTiposAccionesTipoArchivoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoArchivo")) {
				jComboBoxTiposRelacionesTipoArchivoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoArchivo")) {
				jComboBoxTiposAccionesTipoArchivoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoArchivo")) {
				
				jComboBoxTiposSeleccionarTipoArchivoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoArchivo")) {
				jTextFieldValorCampoGeneralTipoArchivoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoArchivo")) {
				jButtonAbrirOrderByTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoArchivo")) {
				jButtonAbrirOrderByTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoArchivo")) {
				jButtonCerrarOrderByTipoArchivoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoArchivoBusqueda")) {
				this.jButtonidTipoArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoArchivoBusqueda")) {
				this.jButtoncodigoTipoArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoArchivoBusqueda")) {
				this.jButtonnombreTipoArchivoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoArchivo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoArchivo tipoarchivoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoarchivoLocal=this.tipoarchivo;
			} else {
				tipoarchivoLocal=this.tipoarchivoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
							
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
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
			
			


			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
								
						
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
								
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
							
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
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
			
			


			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
								
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoArchivo")) {
					jCheckBoxSeleccionarTodosTipoArchivoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoArchivo")) {
					jCheckBoxSeleccionadosTipoArchivoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoArchivo")) {
					
				}
				
				


				
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
												
				
				


				
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
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
			
			


			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoArchivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarchivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarchivo);
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
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
				
				


				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoArchivo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoArchivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoArchivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarchivoAnterior =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoArchivo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoArchivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoArchivo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoarchivo =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoarchivo =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoarchivo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoArchivo")) {
				
				}
				
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoArchivo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoArchivo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoArchivo")) {
			
			}
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoArchivo();
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoArchivo")) {
				jButtonDuplicarTipoArchivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoArchivo")) {
				jButtonCopiarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoArchivo")) {
				jButtonVerFormTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoArchivo")) {
				jButtonNuevoTipoArchivoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoArchivo")) {
				jButtonModificarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoArchivo")) {
				jButtonActualizarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoArchivo")) {
				jButtonEliminarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoArchivo")) {
				jButtonCancelarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoArchivo")) {
				jButtonCerrarTipoArchivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoArchivo")) {
				jButtonGuardarCambiosTipoArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoArchivo")) {
				jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoArchivo")) {
				jButtonAbrirOrderByTipoArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoArchivo")) {
				jButtonRecargarInformacionTipoArchivoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoArchivo")) {
				jButtonAnterioresTipoArchivoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoArchivo")) {
				jButtonSiguientesTipoArchivoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoArchivoBusqueda")) {
				this.jButtonidTipoArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoArchivoBusqueda")) {
				this.jButtoncodigoTipoArchivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoArchivoBusqueda")) {
				this.jButtonnombreTipoArchivoBusquedaActionPerformed(evt);
			}
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoArchivo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoArchivo")) {
				closingInternalFrameTipoArchivo();
				
			} else if(sTipo.equals("jButtonCancelarTipoArchivo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoArchivo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoArchivoBeanSwingJInternalFrame jInternalFrameParent=(TipoArchivoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoArchivo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoArchivoActionPerformed(null);
			}
			
			TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoarchivo,new Object(),this.tipoarchivoParameterGeneral,this.tipoarchivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoArchivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoArchivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoArchivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoarchivo)) {
			if(!esControlTabla) {
				if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);			
				}
				
				if(this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoArchivo(this.tipoarchivo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoarchivoReturnGeneral=tipoarchivoLogic.procesarEventosTipoArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarchivoLogic.getTipoArchivos(),this.tipoarchivo,this.tipoarchivoParameterGeneral,this.isEsNuevoTipoArchivo,classes);//this.tipoarchivoLogic.getTipoArchivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoArchivo(this.tipoarchivoReturnGeneral,this.tipoarchivoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoArchivo(classes,this.tipoarchivoReturnGeneral,this.tipoarchivoBean,false);
					}
						
					if(this.tipoarchivoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo());	
					}
						
					if(this.tipoarchivoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo(),classes);//this.tipoarchivoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoArchivo(this.tipoarchivo,classes);//this.tipoarchivoBean);									
				}
			
				if(TipoArchivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoArchivo(this.tipoarchivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoArchivo(this.tipoarchivo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoarchivoAnterior!=null) {
						this.tipoarchivo=this.tipoarchivoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoarchivoReturnGeneral=tipoarchivoLogic.procesarEventosTipoArchivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarchivoLogic.getTipoArchivos(),this.tipoarchivo,this.tipoarchivoParameterGeneral,this.isEsNuevoTipoArchivo,classes);//this.tipoarchivoLogic.getTipoArchivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoarchivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoarchivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoarchivoReturnGeneral.getTipoArchivo(),tipoarchivoLogic.getTipoArchivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoarchivoReturnGeneral.getTipoArchivo(),this.tipoarchivos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoArchivo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoArchivo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoArchivo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoArchivo() throws Exception {
		
		TipoArchivoModel tipoarchivoModel=(TipoArchivoModel)this.jTableDatosTipoArchivo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarchivoModel.tipoarchivos=this.tipoarchivoLogic.getTipoArchivos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoarchivoModel.tipoarchivos=this.tipoarchivos;
		}
		
		
		((TipoArchivoModel) this.jTableDatosTipoArchivo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoArchivo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoarchivoAnterior(),this.tipoarchivoLogic.getTipoArchivos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoarchivoAnterior(),this.tipoarchivos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoArchivo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoArchivo(TipoArchivo tipoarchivo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
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
										
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarchivo,new Object(),generalEntityParameterGeneral,this.tipoarchivoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoarchivoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoArchivoConstantesFunciones.getClassesRelationshipsOfTipoArchivo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoArchivoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoArchivo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoArchivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoArchivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarchivo,new Object(),generalEntityParameterGeneral,this.tipoarchivoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoArchivo(TipoArchivoBean tipoarchivoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoArchivo(ArrayList<Classe> classes,TipoArchivoReturnGeneral tipoarchivoReturnGeneral,TipoArchivoBean tipoarchivoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoArchivo(TipoArchivo tipoarchivo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoarchivo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoArchivo = new TipoArchivoDetalleFormJInternalFrame(jDesktopPane,this.tipoarchivoSessionBean.getConGuardarRelaciones(),this.tipoarchivoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.setVisible(false);
		this.jInternalFrameDetalleFormTipoArchivo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoArchivo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoArchivo.tipoarchivoLogic=this.tipoarchivoLogic;
		
		this.cargarCombosFrameForeignKeyTipoArchivo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoArchivo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoArchivo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoArchivo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoArchivo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoArchivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoArchivo"));
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarTipoArchivo.addActionListener(new ButtonActionListener(this,"ModificarTipoArchivo"));

		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoArchivo"));
					
		this.jInternalFrameDetalleFormTipoArchivo.jMenuItemModificarTipoArchivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.addActionListener (new ButtonActionListener(this,"ActualizarTipoArchivo"));
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoArchivo"));
						
		this.jInternalFrameDetalleFormTipoArchivo.jMenuItemActualizarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.addActionListener (new ButtonActionListener(this,"EliminarTipoArchivo"));
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoArchivo"));
								
		this.jInternalFrameDetalleFormTipoArchivo.jMenuItemEliminarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.addActionListener (new ButtonActionListener(this,"CancelarTipoArchivo"));
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoArchivo"));
					
		this.jInternalFrameDetalleFormTipoArchivo.jMenuItemCancelarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoArchivo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jMenuItemDetalleCerrarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoArchivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoArchivo"));
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoArchivo"));
		
		
		
		this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoArchivo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonidTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtoncodigoTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonnombreTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoArchivoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoArchivo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoArchivo"));
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoArchivo"));
		}
		
		this.jTableDatosTipoArchivo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoArchivo"));
		
		this.jTableDatosTipoArchivo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoArchivo"));
		
		this.jButtonNuevoTipoArchivo.addActionListener(new ButtonActionListener(this,"NuevoTipoArchivo"));
		
		this.jButtonDuplicarTipoArchivo.addActionListener(new ButtonActionListener(this,"DuplicarTipoArchivo"));
		
		this.jButtonCopiarTipoArchivo.addActionListener(new ButtonActionListener(this,"CopiarTipoArchivo"));
		
		this.jButtonVerFormTipoArchivo.addActionListener(new ButtonActionListener(this,"VerFormTipoArchivo"));
		
		
		this.jButtonNuevoToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoArchivo"));
			
		this.jButtonDuplicarToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoArchivo"));
			
		this.jMenuItemNuevoTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoArchivo"));
			
		this.jMenuItemDuplicarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoArchivo"));		
		
		
		this.jButtonNuevoRelacionesTipoArchivo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoArchivo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoArchivo"));
			
		this.jMenuItemNuevoRelacionesTipoArchivo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoArchivo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarTipoArchivo.addActionListener(new ButtonActionListener(this,"ModificarTipoArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonModificarToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoArchivo"));
			
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemModificarTipoArchivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarTipoArchivo.addActionListener (new ButtonActionListener(this,"ActualizarTipoArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonActualizarToolBarTipoArchivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoArchivo"));
				
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemActualizarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarTipoArchivo.addActionListener (new ButtonActionListener(this,"EliminarTipoArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonEliminarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoArchivo"));
						
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemEliminarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarTipoArchivo.addActionListener (new ButtonActionListener(this,"CancelarTipoArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonCancelarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoArchivo"));
			
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemCancelarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoArchivo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoArchivo"));		
		
		
		this.jButtonCerrarTipoArchivo.addActionListener (new ButtonActionListener(this,"CerrarTipoArchivo"));
		
		
		this.jButtonCerrarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoArchivo"));
			
		this.jMenuItemCerrarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoArchivo"));
			
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jMenuItemDetalleCerrarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoArchivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoArchivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoArchivo"));
		}
		
		this.jButtonCopiarToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoArchivo"));
			
		this.jButtonVerFormToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoArchivo"));
		
		this.jMenuItemGuardarCambiosTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoArchivo"));
			
		this.jMenuItemCopiarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoArchivo"));		
		
		this.jMenuItemVerFormTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoArchivo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoArchivo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoArchivo"));
			
		this.jMenuItemGuardarCambiosTablaTipoArchivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoArchivo"));		
		
		
		
		this.jButtonRecargarInformacionTipoArchivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoArchivo"));
					
		this.jButtonRecargarInformacionToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoArchivo"));
		
		this.jMenuItemRecargarInformacionTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoArchivo"));		
		
		
		
		this.jButtonAnterioresTipoArchivo.addActionListener (new ButtonActionListener(this,"AnterioresTipoArchivo"));
		
		
		this.jButtonAnterioresToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoArchivo"));
		
		this.jMenuItemAnterioresTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoArchivo"));		
		
		
		this.jButtonSiguientesTipoArchivo.addActionListener (new ButtonActionListener(this,"SiguientesTipoArchivo"));
		
		
		this.jButtonSiguientesToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoArchivo"));
			
		this.jMenuItemSiguientesTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoArchivo"));
			
		this.jMenuItemAbrirOrderByTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoArchivo"));
			
		this.jMenuItemMostrarOcultarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoArchivo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoArchivo"));
			
		this.jMenuItemDetalleMostarOcultarTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoArchivo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoArchivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoArchivo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoArchivo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoArchivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoArchivo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoArchivo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoArchivo"));

		this.jCheckBoxSeleccionadosTipoArchivo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoArchivo"));
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoArchivo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoArchivo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoArchivo"));
			
		this.jComboBoxTiposAccionesTipoArchivo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoArchivo"));
					
		this.jComboBoxTiposSeleccionarTipoArchivo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoArchivo"));
			
		this.jTextFieldValorCampoGeneralTipoArchivo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoArchivo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonidTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtoncodigoTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonnombreTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoArchivoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoArchivo!=null) {
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoArchivo"));
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoArchivo"));
				this.jInternalFrameReporteDinamicoTipoArchivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoArchivo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoArchivo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoArchivo"));				
			//this.jButtonGenerarReporteDinamicoTipoArchivo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoArchivo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoArchivo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoArchivo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoArchivo!=null) {
				this.jInternalFrameImportacionTipoArchivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoArchivo"));
				this.jInternalFrameImportacionTipoArchivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoArchivo"));
				this.jInternalFrameImportacionTipoArchivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoArchivo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoArchivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoArchivo"));
			
			this.jButtonAbrirOrderByToolBarTipoArchivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoArchivo"));			
			
			if(this.jInternalFrameOrderByTipoArchivo!=null) {
				this.jInternalFrameOrderByTipoArchivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoArchivo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoArchivo.jTabbedPaneRelacionesTipoArchivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoArchivo"));
		
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
            		closingInternalFrameTipoArchivo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoArchivo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoArchivo = (JInternalFrameBase)event.getSource();
	            	
	            TipoArchivoBeanSwingJInternalFrame jInternalFrameParent=(TipoArchivoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoArchivo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoArchivoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoArchivo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoArchivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoArchivo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoArchivo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoArchivo";
		inputMap = this.jButtonNuevoTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoArchivoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoArchivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoArchivo";
		inputMap = this.jButtonNuevoRelacionesTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoArchivoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoArchivo";
		inputMap = this.jButtonModificarTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoArchivo";
		inputMap = this.jButtonActualizarTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoArchivo";
		inputMap = this.jButtonEliminarTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoArchivo";
		inputMap = this.jButtonCancelarTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoArchivo";
		inputMap = this.jButtonCerrarTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoArchivo";
		inputMap = this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoArchivo.jButtonGuardarCambiosTipoArchivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoArchivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoArchivo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoArchivoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoArchivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoArchivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonidTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtoncodigoTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoArchivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoArchivo.jButtonnombreTipoArchivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoArchivoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoArchivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoArchivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoArchivoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoArchivo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoArchivo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
					tipoarchivoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoArchivo tipoarchivoAux:tipoarchivos) {
					tipoarchivoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoArchivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
						tipoarchivoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoArchivo tipoarchivoAux:tipoarchivos) {
						tipoarchivoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoArchivo tipoarchivoAux:tipoarchivos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoArchivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoArchivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoArchivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoArchivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoArchivo.getSelectedRows();
			
			TipoArchivo tipoarchivoLocal=new TipoArchivo();
			
			//this.seleccionarTodosTipoArchivo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarchivoLocal =(TipoArchivo) this.tipoarchivoLogic.getTipoArchivos().toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoarchivoLocal =(TipoArchivo) this.tipoarchivos.toArray()[this.jTableDatosTipoArchivo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoarchivoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
						tipoarchivoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoArchivo tipoarchivoAux:tipoarchivos) {
						tipoarchivoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoArchivo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoArchivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoArchivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoArchivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoArchivoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoArchivoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoArchivoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoArchivo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoArchivo tipoarchivoAux:this.tipoarchivoLogic.getTipoArchivos()) {
				
						if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoarchivoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoarchivoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoArchivo tipoarchivoAux:tipoarchivos) {
					
						if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoarchivoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoarchivoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoArchivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoArchivoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoArchivo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoArchivo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoArchivo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoArchivo(conSplash);
				
					this.generarReporteTipoArchivosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoArchivosSeleccionados();
				//this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoArchivosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoArchivosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoArchivo();
				
				this.exportarTipoArchivosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoArchivos();
				//this.importarTipoArchivos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoArchivo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoArchivosSeleccionados();
				//this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Archivo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoArchivo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoArchivo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoArchivo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoArchivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoArchivo.jComboBoxTiposAccionesFormularioTipoArchivo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoArchivo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoArchivo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoArchivoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoArchivo();
			
			if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
			TipoArchivo tipoarchivo=new TipoArchivo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoArchivo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoArchivo.getSelectedItem();
			
			
			
			
			tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoarchivosSeleccionados.size()==1) {
				for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
					tipoarchivo=tipoarchivoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoArchivo();
			
      		//this.finishProcessTipoArchivo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoArchivoReturnGeneral() throws Exception {
		if(this.tipoarchivoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoarchivoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoarchivoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoarchivoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoarchivoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoarchivoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoArchivo(false);
		}
		
		if(this.tipoarchivoReturnGeneral.getConRetornoLista() || this.tipoarchivoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoarchivoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoarchivoLogic.setTipoArchivos(this.tipoarchivoReturnGeneral.getTipoArchivos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoarchivoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoarchivoLogic.setTipoArchivo(this.tipoarchivoReturnGeneral.getTipoArchivo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoArchivo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoArchivo() throws Exception {
		
		
	}
	
	public ArrayList<TipoArchivo> getTipoArchivosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoArchivo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoArchivo tipoarchivoAux:tipoarchivoLogic.getTipoArchivos()) {
					if(tipoarchivoAux.getIsSelected()) {
						tipoarchivosSeleccionados.add(tipoarchivoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoArchivo tipoarchivoAux:this.tipoarchivos) {
					if(tipoarchivoAux.getIsSelected()) {
						tipoarchivosSeleccionados.add(tipoarchivoAux);				
					}
				}
			}
			
			if(tipoarchivosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoarchivosSeleccionados.addAll(this.tipoarchivoLogic.getTipoArchivos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoarchivosSeleccionados.addAll(this.tipoarchivos);				
					}
				}
			}
		} else {
			tipoarchivosSeleccionados.add(this.tipoarchivo);
		}
		
		return tipoarchivosSeleccionados;
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
	
	public void generarReporteTipoArchivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoArchivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoArchivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoArchivosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoArchivosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoArchivosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoArchivo();
		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoArchivo();
		
		
		//this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados ,tipoarchivoImplementable,tipoarchivoImplementableHome);
	}
	
	public void mostrarImportacionTipoArchivos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoArchivo();
		
		this.abrirFrameImportacionTipoArchivo();		
		
			
		//this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados ,tipoarchivoImplementable,tipoarchivoImplementableHome);
	}
	
	public void importarTipoArchivos() throws Exception {		
	
	}
	
	public void exportarTipoArchivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoArchivosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoArchivosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoArchivosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoArchivo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoArchivo(tipoarchivoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoarchivoAux.setsDetalleGeneralEntityReporte(tipoarchivoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoArchivo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoArchivoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoArchivoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoArchivoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoArchivoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoArchivo(TipoArchivo tipoarchivo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoarchivo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarchivo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarchivo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarchivo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoArchivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoArchivo(row);				
				iRow++;
			}				
			
			for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoArchivo(tipoarchivoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoArchivosSeleccionados() throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();		
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarchivo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoarchivos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoarchivo");
			//elementRoot.appendChild(element);
		
			for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
				element = document.createElement("tipoarchivo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoArchivo(tipoarchivoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Archivo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoArchivo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoArchivoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoArchivo(TipoArchivo tipoarchivo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarchivo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarchivo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarchivo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoArchivo(TipoArchivo tipoarchivo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoArchivoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoarchivo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoArchivoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoarchivo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoArchivoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoarchivo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoArchivoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoarchivo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoArchivosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoArchivo> tipoarchivosSeleccionados=new ArrayList<TipoArchivo>();
		
		tipoarchivosSeleccionados=this.getTipoArchivosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoArchivo(tipoarchivosSeleccionados);
		
		this.generarReporteTipoArchivos("Todos",tipoarchivosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoArchivo(ArrayList<TipoArchivo> tipoarchivosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoArchivo tipoarchivoAux:tipoarchivosSeleccionados) {
				tipoarchivoAux.setsDetalleGeneralEntityReporte(tipoarchivoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoarchivoAux.setsDescripcionGeneralEntityReporte1(tipoarchivoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoArchivoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoarchivoAux.setsDescripcionGeneralEntityReporte1(tipoarchivoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoArchivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoArchivo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoArchivo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoArchivo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=true;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=true;
			this.isVisibilidadCeldaEliminarTipoArchivo=true;
			this.isVisibilidadCeldaCancelarTipoArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=true;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=true;
			this.isVisibilidadCeldaModificarTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
			this.isVisibilidadCeldaModificarTipoArchivo=true;
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
			this.isVisibilidadCeldaCancelarTipoArchivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoArchivo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoArchivoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoArchivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=true;
		} else {
			this.actualizarEstadoPanelsTipoArchivo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoArchivo=false;
			//this.isVisibilidadCeldaVerFormTipoArchivo=false;
			this.isVisibilidadCeldaDuplicarTipoArchivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoarchivoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoArchivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoArchivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoarchivoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoarchivoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;												
			}
			
			this.jButtonCerrarTipoArchivo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoArchivo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoarchivo)) {
			this.isVisibilidadCeldaActualizarTipoArchivo=false;
			this.isVisibilidadCeldaEliminarTipoArchivo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoArchivo() {
	}
	
	public void actualizarEstadoPanelsTipoArchivo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoArchivo!=null) {
				this.jScrollPanelDatosEdicionTipoArchivo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoArchivo!=null) {
				this.jScrollPanelDatosTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoArchivo!=null) {
				this.jPanelPaginacionTipoArchivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoArchivo!=null) {
				this.jPanelParametrosReportesTipoArchivo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoarchivoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoArchivoSessionBean tipoarchivoSessionBean=new TipoArchivoSessionBean();
		
		if(this.tipoarchivoSessionBean==null) {
			this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
		}
		
		this.tipoarchivoSessionBean.setsUltimaBusquedaTipoArchivo(this.getsAccionBusqueda());
		this.tipoarchivoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoarchivoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoArchivoSessionBean tipoarchivoSessionBean=new TipoArchivoSessionBean();
		
		if(this.tipoarchivoSessionBean==null) {
			this.tipoarchivoSessionBean=new TipoArchivoSessionBean();
		}
		
		if(this.tipoarchivoSessionBean.getsUltimaBusquedaTipoArchivo()!=null&&!this.tipoarchivoSessionBean.getsUltimaBusquedaTipoArchivo().equals("")) {
			this.setsAccionBusqueda(tipoarchivoSessionBean.getsUltimaBusquedaTipoArchivo());
			this.setiNumeroPaginacion(tipoarchivoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoarchivoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoarchivoSessionBean.setsUltimaBusquedaTipoArchivo("");
		this.tipoarchivoSessionBean.setiNumeroPaginacion(TipoArchivoConstantesFunciones.INUMEROPAGINACION);
		this.tipoarchivoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoArchivo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoArchivo() {
		this.updateBorderResaltarBusquedasFormularioTipoArchivo();
		this.updateVisibilidadBusquedasFormularioTipoArchivo();
		this.updateHabilitarBusquedasFormularioTipoArchivo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoArchivo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoArchivo() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoArchivo() {
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
	
	public void updateControlesFormularioTipoArchivo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoArchivo();
		this.updateVisibilidadResaltarControlesFormularioTipoArchivo();
		this.updateHabilitarResaltarControlesFormularioTipoArchivo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoArchivo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoarchivoConstantesFunciones.resaltaridTipoArchivo!=null && this.jInternalFrameDetalleFormTipoArchivo!=null) {this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setBorder(this.tipoarchivoConstantesFunciones.resaltaridTipoArchivo);}
		if(this.tipoarchivoConstantesFunciones.resaltarcodigoTipoArchivo!=null && this.jInternalFrameDetalleFormTipoArchivo!=null) {this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setBorder(this.tipoarchivoConstantesFunciones.resaltarcodigoTipoArchivo);}
		if(this.tipoarchivoConstantesFunciones.resaltarnombreTipoArchivo!=null && this.jInternalFrameDetalleFormTipoArchivo!=null) {this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setBorder(this.tipoarchivoConstantesFunciones.resaltarnombreTipoArchivo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoArchivo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
	
		//this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostraridTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jPanelidTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostraridTipoArchivo);
		//this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostrarcodigoTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jPanelcodigoTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostrarcodigoTipoArchivo);
		//this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostrarnombreTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jPanelnombreTipoArchivo.setVisible(this.tipoarchivoConstantesFunciones.mostrarnombreTipoArchivo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoArchivo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoArchivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoArchivo!=null) {
	
		this.jInternalFrameDetalleFormTipoArchivo.jTextFieldidTipoArchivo.setEnabled(this.tipoarchivoConstantesFunciones.activaridTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jTextFieldcodigoTipoArchivo.setEnabled(this.tipoarchivoConstantesFunciones.activarcodigoTipoArchivo);
		this.jInternalFrameDetalleFormTipoArchivo.jTextAreanombreTipoArchivo.setEnabled(this.tipoarchivoConstantesFunciones.activarnombreTipoArchivo);
		}
	}
	
		
}