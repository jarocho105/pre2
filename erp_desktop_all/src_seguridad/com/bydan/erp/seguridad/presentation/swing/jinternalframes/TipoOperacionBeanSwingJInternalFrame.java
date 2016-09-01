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

import com.bydan.erp.seguridad.util.TipoOperacionConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoOperacionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoOperacionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoOperacionBean;
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

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoOperacionBeanSwingJInternalFrame extends TipoOperacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoOperacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoOperacion> tipooperacionValidator = new ClassValidator<TipoOperacion>(TipoOperacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoOperacion tipooperacion;	
	public TipoOperacion tipooperacionAux;
	public TipoOperacion tipooperacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoOperacion tipooperacionTotales;
	public Long idTipoOperacionActual;
	public Long iIdNuevoTipoOperacion=0L;
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
	
	public Boolean isPermisoTodoTipoOperacion;
	public Boolean isPermisoNuevoTipoOperacion;
	public Boolean isPermisoActualizarTipoOperacion;
	public Boolean isPermisoActualizarOriginalTipoOperacion;
	public Boolean isPermisoEliminarTipoOperacion;
	public Boolean isPermisoGuardarCambiosTipoOperacion;
	public Boolean isPermisoConsultaTipoOperacion;
	public Boolean isPermisoBusquedaTipoOperacion;
	public Boolean isPermisoReporteTipoOperacion;
	public Boolean isPermisoPaginacionMedioTipoOperacion;
	public Boolean isPermisoPaginacionAltoTipoOperacion;
	public Boolean isPermisoPaginacionTodoTipoOperacion;
	public Boolean isPermisoCopiarTipoOperacion;
	public Boolean isPermisoVerFormTipoOperacion;
	public Boolean isPermisoDuplicarTipoOperacion;
	public Boolean isPermisoOrdenTipoOperacion;
	
	
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
	
	public TipoOperacionParameterReturnGeneral tipooperacionReturnGeneral;
	public TipoOperacionParameterReturnGeneral tipooperacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoOperacion=false;
	public Boolean esParaAccionDesdeFormularioTipoOperacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoOperacionLogic tipooperacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoOperacion tipooperacionBean;
	public TipoOperacionConstantesFunciones tipooperacionConstantesFunciones;
	//public TipoOperacionParameterReturnGeneral tipooperacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoOperacion> tipooperacions;	
	//public List<TipoOperacion> tipooperacionsEliminados;
	//public List<TipoOperacion> tipooperacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoOperacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoOperacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoOperacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoOperacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoOperacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
	public Boolean isVisibilidadCeldaModificarTipoOperacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoOperacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoOperacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoOperacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoOperacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoOperacion=false;	
	
	
	
	public Long getiIdNuevoTipoOperacion() {
		return this.iIdNuevoTipoOperacion;
	}

	public void setiIdNuevoTipoOperacion(Long iIdNuevoTipoOperacion) {
		this.iIdNuevoTipoOperacion = iIdNuevoTipoOperacion;
	}
	
	public Long getidTipoOperacionActual() {
		return this.idTipoOperacionActual;
	}

	public void setidTipoOperacionActual(Long idTipoOperacionActual) {
		this.idTipoOperacionActual = idTipoOperacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoOperacion gettipooperacion() {
		return this.tipooperacion;
	}

	public void settipooperacion(TipoOperacion tipooperacion) {
		this.tipooperacion = tipooperacion;
	}
	
	public TipoOperacion gettipooperacionAux() {
		return this.tipooperacionAux;
	}

	public void settipooperacionAux(TipoOperacion tipooperacionAux) {
		this.tipooperacionAux = tipooperacionAux;
	}				
	
	public TipoOperacion gettipooperacionAnterior() {
		return this.tipooperacionAnterior;
	}

	public void settipooperacionAnterior(TipoOperacion tipooperacionAnterior) {
		this.tipooperacionAnterior = tipooperacionAnterior;
	}	
	
	public TipoOperacion gettipooperacionTotales() {
		return this.tipooperacionTotales;
	}

	public void settipooperacionTotales(TipoOperacion tipooperacionTotales) {
		this.tipooperacionTotales = tipooperacionTotales;
	}	
	
	public TipoOperacion gettipooperacionBean() {
		return this.tipooperacionBean;
	}

	public void settipooperacionBean(TipoOperacion tipooperacionBean) {
		this.tipooperacionBean = tipooperacionBean;
	}	
	
	public TipoOperacionParameterReturnGeneral gettipooperacionReturnGeneral() {
		return this.tipooperacionReturnGeneral;
	}

	public void settipooperacionReturnGeneral(TipoOperacionParameterReturnGeneral tipooperacionReturnGeneral) {
		this.tipooperacionReturnGeneral = tipooperacionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoOperacionLogic getTipoOperacionLogic()	{		
		return tipooperacionLogic;
	}

	public void setTipoOperacionLogic(TipoOperacionLogic tipooperacionLogic) {
		this.tipooperacionLogic = tipooperacionLogic;
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
	
	public Boolean getIsEsNuevoTipoOperacion() {
		return isEsNuevoTipoOperacion;
	}

	public void setIsEsNuevoTipoOperacion(Boolean isEsNuevoTipoOperacion) {
		this.isEsNuevoTipoOperacion = isEsNuevoTipoOperacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoOperacion() {
		return esParaAccionDesdeFormularioTipoOperacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoOperacion(Boolean esParaAccionDesdeFormularioTipoOperacion) {
		this.esParaAccionDesdeFormularioTipoOperacion = esParaAccionDesdeFormularioTipoOperacion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoOperacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoOperacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoOperacion(this.tipooperacionLogic.getTipoOperacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoOperacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoOperacion(this.tipooperacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipooperacionLogic.setTipoOperacions(this.tipooperacions);
			tipooperacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoOperacionParameterReturnGeneral getTipoOperacionParameterGeneral() {
		return this.tipooperacionParameterGeneral;
	}
	
	public void setTipoOperacionParameterGeneral(TipoOperacionParameterReturnGeneral tipooperacionParameterGeneral) {
		this.tipooperacionParameterGeneral = tipooperacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoOperacion() {
		return isPermisoTodoTipoOperacion;
	}

	public void setIsPermisoTodoTipoOperacion(Boolean isPermisoTodoTipoOperacion) {
		this.isPermisoTodoTipoOperacion = isPermisoTodoTipoOperacion;
	}

	public Boolean getIsPermisoNuevoTipoOperacion() {
		return isPermisoNuevoTipoOperacion;
	}

	public void setIsPermisoNuevoTipoOperacion(Boolean isPermisoNuevoTipoOperacion) {
		this.isPermisoNuevoTipoOperacion = isPermisoNuevoTipoOperacion;
	}

	public Boolean getIsPermisoActualizarTipoOperacion() {
		return isPermisoActualizarTipoOperacion;
	}

	public void setIsPermisoActualizarTipoOperacion(Boolean isPermisoActualizarTipoOperacion) {
		this.isPermisoActualizarTipoOperacion = isPermisoActualizarTipoOperacion;
	}

	public Boolean getIsPermisoEliminarTipoOperacion() {
		return isPermisoEliminarTipoOperacion;
	}

	public void setIsPermisoEliminarTipoOperacion(Boolean isPermisoEliminarTipoOperacion) {
		this.isPermisoEliminarTipoOperacion = isPermisoEliminarTipoOperacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoOperacion() {
		return isPermisoGuardarCambiosTipoOperacion;
	}

	public void setIsPermisoGuardarCambiosTipoOperacion(Boolean isPermisoGuardarCambiosTipoOperacion) {
		this.isPermisoGuardarCambiosTipoOperacion = isPermisoGuardarCambiosTipoOperacion;
	}
	
	public Boolean getIsPermisoConsultaTipoOperacion() {
		return isPermisoConsultaTipoOperacion;
	}

	public void setIsPermisoConsultaTipoOperacion(Boolean isPermisoConsultaTipoOperacion) {
		this.isPermisoConsultaTipoOperacion = isPermisoConsultaTipoOperacion;
	}

	public Boolean getIsPermisoBusquedaTipoOperacion() {
		return isPermisoBusquedaTipoOperacion;
	}

	public void setIsPermisoBusquedaTipoOperacion(Boolean isPermisoBusquedaTipoOperacion) {
		this.isPermisoBusquedaTipoOperacion = isPermisoBusquedaTipoOperacion;
	}

	public Boolean getIsPermisoReporteTipoOperacion() {
		return isPermisoReporteTipoOperacion;
	}

	public void setIsPermisoReporteTipoOperacion(Boolean isPermisoReporteTipoOperacion) {
		this.isPermisoReporteTipoOperacion = isPermisoReporteTipoOperacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoOperacion() {
		return isPermisoPaginacionMedioTipoOperacion;
	}

	public void setIsPermisoPaginacionMedioTipoOperacion(Boolean isPermisoPaginacionMedioTipoOperacion) {
		this.isPermisoPaginacionMedioTipoOperacion = isPermisoPaginacionMedioTipoOperacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoOperacion() {
		return isPermisoPaginacionTodoTipoOperacion;
	}

	public void setIsPermisoPaginacionTodoTipoOperacion(Boolean isPermisoPaginacionTodoTipoOperacion) {
		this.isPermisoPaginacionTodoTipoOperacion = isPermisoPaginacionTodoTipoOperacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoOperacion() {
		return isPermisoPaginacionAltoTipoOperacion;
	}

	public void setIsPermisoPaginacionAltoTipoOperacion(Boolean isPermisoPaginacionAltoTipoOperacion) {
		this.isPermisoPaginacionAltoTipoOperacion = isPermisoPaginacionAltoTipoOperacion;
	}
	
	public Boolean getIsPermisoCopiarTipoOperacion() {
		return isPermisoCopiarTipoOperacion;
	}

	public void setIsPermisoCopiarTipoOperacion(Boolean isPermisoCopiarTipoOperacion) {
		this.isPermisoCopiarTipoOperacion = isPermisoCopiarTipoOperacion;
	}
	
	public Boolean getIsPermisoVerFormTipoOperacion() {
		return isPermisoVerFormTipoOperacion;
	}

	public void setIsPermisoVerFormTipoOperacion(Boolean isPermisoVerFormTipoOperacion) {
		this.isPermisoVerFormTipoOperacion = isPermisoVerFormTipoOperacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoOperacion() {
		return isPermisoDuplicarTipoOperacion;
	}

	public void setIsPermisoDuplicarTipoOperacion(Boolean isPermisoDuplicarTipoOperacion) {
		this.isPermisoDuplicarTipoOperacion = isPermisoDuplicarTipoOperacion;
	}
	
	public Boolean getIsPermisoOrdenTipoOperacion() {
		return isPermisoOrdenTipoOperacion;
	}

	public void setIsPermisoOrdenTipoOperacion(Boolean isPermisoOrdenTipoOperacion) {
		this.isPermisoOrdenTipoOperacion = isPermisoOrdenTipoOperacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoOperacion() {
		return isVisibilidadCeldaNuevoTipoOperacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoOperacion(Boolean isVisibilidadCeldaNuevoTipoOperacion) {
		this.isVisibilidadCeldaNuevoTipoOperacion = isVisibilidadCeldaNuevoTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoOperacion() {
		return isVisibilidadCeldaDuplicarTipoOperacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoOperacion(Boolean isVisibilidadCeldaDuplicarTipoOperacion) {
		this.isVisibilidadCeldaDuplicarTipoOperacion = isVisibilidadCeldaDuplicarTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoOperacion() {
		return isVisibilidadCeldaCopiarTipoOperacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoOperacion(Boolean isVisibilidadCeldaCopiarTipoOperacion) {
		this.isVisibilidadCeldaCopiarTipoOperacion = isVisibilidadCeldaCopiarTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoOperacion() {
		return isVisibilidadCeldaVerFormTipoOperacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoOperacion(Boolean isVisibilidadCeldaVerFormTipoOperacion) {
		this.isVisibilidadCeldaVerFormTipoOperacion = isVisibilidadCeldaVerFormTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoOperacion() {
		return isVisibilidadCeldaOrdenTipoOperacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoOperacion(Boolean isVisibilidadCeldaOrdenTipoOperacion) {
		this.isVisibilidadCeldaOrdenTipoOperacion = isVisibilidadCeldaOrdenTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoOperacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoOperacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoOperacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoOperacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoOperacion = isVisibilidadCeldaNuevoRelacionesTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoOperacion() {
		return isVisibilidadCeldaModificarTipoOperacion;
	}

	public void setIsVisibilidadCeldaModificarTipoOperacion(Boolean isVisibilidadCeldaModificarTipoOperacion) {
		this.isVisibilidadCeldaModificarTipoOperacion = isVisibilidadCeldaModificarTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoOperacion() {
		return isVisibilidadCeldaActualizarTipoOperacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoOperacion(Boolean isVisibilidadCeldaActualizarTipoOperacion) {
		this.isVisibilidadCeldaActualizarTipoOperacion = isVisibilidadCeldaActualizarTipoOperacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoOperacion() {
		return isVisibilidadCeldaEliminarTipoOperacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoOperacion(Boolean isVisibilidadCeldaEliminarTipoOperacion) {
		this.isVisibilidadCeldaEliminarTipoOperacion = isVisibilidadCeldaEliminarTipoOperacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoOperacion() {
		return isVisibilidadCeldaCancelarTipoOperacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoOperacion(Boolean isVisibilidadCeldaCancelarTipoOperacion) {
		this.isVisibilidadCeldaCancelarTipoOperacion = isVisibilidadCeldaCancelarTipoOperacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoOperacion() {
		return isVisibilidadCeldaGuardarTipoOperacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoOperacion(Boolean isVisibilidadCeldaGuardarTipoOperacion) {
		this.isVisibilidadCeldaGuardarTipoOperacion = isVisibilidadCeldaGuardarTipoOperacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoOperacion() {
		return isVisibilidadCeldaGuardarCambiosTipoOperacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoOperacion(Boolean isVisibilidadCeldaGuardarCambiosTipoOperacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoOperacion = isVisibilidadCeldaGuardarCambiosTipoOperacion;
	}
		
	public TipoOperacionSessionBean gettipooperacionSessionBean() {
		return this.tipooperacionSessionBean;
	}
	
	public void settipooperacionSessionBean(TipoOperacionSessionBean tipooperacionSessionBean) {
		this.tipooperacionSessionBean=tipooperacionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(TipoOperacion tipooperacion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoOperacion tipooperacion,TipoOperacion tipooperacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoOperacion(tipooperacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipooperacionAux.setId(tipooperacion.getId());
		tipooperacionAux.setVersionRow(tipooperacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoOperacion();
		
			int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipooperacionValidator.getInvalidValues(this.tipooperacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipooperacionLogic.setDatosCliente(datosCliente);
			tipooperacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipooperacionAux=new  TipoOperacion();
				
				tipooperacionAux.setIsNew(true);
				tipooperacionAux.setIsChanged(true);
				
				tipooperacionAux.setTipoOperacionOriginal(this.tipooperacion);
				
				tipooperacionAux.setId(this.tipooperacion.getId());	
				tipooperacionAux.setVersionRow(this.tipooperacion.getVersionRow());	
				tipooperacionAux.setcodigo(this.tipooperacion.getcodigo());	
				tipooperacionAux.setnombre(this.tipooperacion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipooperacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipooperacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipooperacionAux,tipooperacionLogic.getTipoOperacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipooperacionAux,tipooperacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipooperacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipooperacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipooperacionLogic.saveTipoOperacions();//WithConnection
						//tipooperacionLogic.getSetVersionRowTipoOperacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipooperacion,tipooperacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipooperacionAux=new  TipoOperacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipooperacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipooperacionSessionBean.getEsGuardarRelacionado() && this.tipooperacion.getId()>=0)) {
						
					tipooperacionAux.setIsNew(false);
				}
				
				tipooperacionAux.setIsDeleted(false);
			
				tipooperacionAux.setId(this.tipooperacion.getId());	
				tipooperacionAux.setVersionRow(this.tipooperacion.getVersionRow());	
				tipooperacionAux.setcodigo(this.tipooperacion.getcodigo());	
				tipooperacionAux.setnombre(this.tipooperacion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipooperacionAux,tipooperacionLogic.getTipoOperacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipooperacionAux,tipooperacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipooperacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipooperacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipooperacionLogic.saveTipoOperacions();//WithConnection
						//tipooperacionLogic.getSetVersionRowTipoOperacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipooperacion,tipooperacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipooperacionAux=new  TipoOperacion();
				
				tipooperacionAux.setIsNew(false);
				tipooperacionAux.setIsChanged(false);
				
				tipooperacionAux.setIsDeleted(true);
				
				tipooperacionAux.setId(this.tipooperacion.getId());	
				tipooperacionAux.setVersionRow(this.tipooperacion.getVersionRow());	
				tipooperacionAux.setcodigo(this.tipooperacion.getcodigo());	
				tipooperacionAux.setnombre(this.tipooperacion.getnombre());	
				
				if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipooperacionAux.getId()>=0) {	
						this.tipooperacionsEliminados.add(tipooperacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipooperacionAux,tipooperacionLogic.getTipoOperacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipooperacionAux,tipooperacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipooperacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipooperacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipooperacionLogic.saveTipoOperacions();//WithConnection
						//tipooperacionLogic.getSetVersionRowTipoOperacions();//WithConnection
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
					this.tipooperacionLogic.getTipoOperacions().addAll(this.tipooperacionsEliminados);
					
					tipooperacionLogic.saveTipoOperacions();//WithConnection
					//tipooperacionLogic.getSetVersionRowTipoOperacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipooperacionsEliminados= new ArrayList<TipoOperacion>();		
			}
			
			if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Operacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipooperacion=tipooperacionAux;
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
      		//this.finishProcessTipoOperacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoOperacion tipooperacionLocal) throws Exception {
		
		if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoOperacion tipooperacionLocal) throws Exception {	
		if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoOperacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipooperacionValidator.getInvalidValues(this.tipooperacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoOperacion tipooperacion,List<TipoOperacion> tipooperacions) throws Exception {
		try	{		
			TipoOperacionConstantesFunciones.actualizarLista(tipooperacion,tipooperacions,this.tipooperacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoOperacion tipooperacion,List<TipoOperacion> tipooperacions) throws Exception {
		try	{			
			TipoOperacionConstantesFunciones.actualizarSelectedLista(tipooperacion,tipooperacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoOperacion> tipooperacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipooperacionsLocal=this.tipooperacionLogic.getTipoOperacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipooperacionsLocal=this.tipooperacions;
			}
			//ARCHITECTURE
		
			for(TipoOperacion tipooperacionLocal:tipooperacionsLocal) {
				if(this.permiteMantenimiento(tipooperacionLocal) && tipooperacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoOperacionConstantesFunciones.getTipoOperacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoOperacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoOperacion.jLabelcodigoTipoOperacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoOperacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoOperacion.jLabelnombreTipoOperacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoOperacion.jLabelcodigoTipoOperacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoOperacion.jLabelnombreTipoOperacion,"");
		
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
		this.iIdNuevoTipoOperacion--;	
		
		
		this.tipooperacionAux=new TipoOperacion();
		
		this.tipooperacionAux.setId(this.iIdNuevoTipoOperacion);
		this.tipooperacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipooperacionLogic.getTipoOperacions().add(this.tipooperacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipooperacions.add(this.tipooperacionAux);
		}
		//ARCHITECTURE
		
		this.tipooperacion=this.tipooperacionAux;
		
		if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoOperacion(this.tipooperacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoOperacion(this.tipooperacion);
		}
				
		//this.setDefaultControlesTipoOperacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoOperacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoOperacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoOperacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoOperacion(this.tipooperacionBean,this.tipooperacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoOperacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoOperacionConstantesFunciones.getClassesRelationshipsOfTipoOperacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipooperacionReturnGeneral=tipooperacionLogic.procesarEventosTipoOperacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipooperacionLogic.getTipoOperacions(),this.tipooperacion,this.tipooperacionParameterGeneral,this.isEsNuevoTipoOperacion,classes);//this.tipooperacionLogic.getTipoOperacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoOperacion(this.tipooperacionReturnGeneral,this.tipooperacionBean,false);
		
		if(this.tipooperacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion());
		}
		
		if(this.tipooperacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion(),classes);//this.tipooperacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoOperacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoOperacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoOperacion(false);
						
			if(tipooperacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoOperacion();
			}
			
			this.actualizarVisualTableDatosTipoOperacion();
			
			this.jTableDatosTipoOperacion.setRowSelectionInterval(this.getIndiceNuevoTipoOperacion(), this.getIndiceNuevoTipoOperacion());
			
			this.seleccionarFilaTablaTipoOperacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoOperacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoOperacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setEnabled(isHabilitar && this.tipooperacionConstantesFunciones.activarcodigoTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setEnabled(isHabilitar && this.tipooperacionConstantesFunciones.activarnombreTipoOperacion);	
		
	};
	
	public void setDefaultControlesTipoOperacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoOperacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipooperacionSessionBean.setConGuardarRelaciones(true);			
			this.tipooperacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.setVisible(true);
			
					
		} else {
			//this.tipooperacionSessionBean.setConGuardarRelaciones(false);			
			this.tipooperacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoOperacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
				if(tipooperacionAux.getId().equals(this.iIdNuevoTipoOperacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoOperacion tipooperacionAux:this.tipooperacions) {
				if(tipooperacionAux.getId().equals(this.iIdNuevoTipoOperacion)) {
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
	
	public int getIndiceActualTipoOperacion(TipoOperacion tipooperacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
				if(tipooperacionAux.getId().equals(tipooperacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoOperacion tipooperacionAux:this.tipooperacions) {
				if(tipooperacionAux.getId().equals(tipooperacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoOperacion(TipoOperacion tipooperacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
				if(tipooperacionAux.getTipoOperacionOriginal().getId().equals(tipooperacionOriginal.getId())) {
					existe=true;
					tipooperacionOriginal.setId(tipooperacionAux.getId());
					tipooperacionOriginal.setVersionRow(tipooperacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoOperacion tipooperacionAux:this.tipooperacions) {
				if(tipooperacionAux.getTipoOperacionOriginal().getId().equals(tipooperacionOriginal.getId())) {
					existe=true;
					tipooperacionOriginal.setId(tipooperacionAux.getId());
					tipooperacionOriginal.setVersionRow(tipooperacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoOperacion(Boolean esParaCancelar) throws Exception {
		tipooperacionsAux=new ArrayList<TipoOperacion>();
		tipooperacionAux=new TipoOperacion();
		
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
					if(tipooperacionAux.getId()<0) {
						tipooperacionsAux.add(tipooperacionAux);
					}		
				}
				this.iIdNuevoTipoOperacion=0L;
				this.tipooperacionLogic.getTipoOperacions().removeAll(tipooperacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoOperacion tipooperacionAux:this.tipooperacions) {
					if(tipooperacionAux.getId()<0) {
						tipooperacionsAux.add(tipooperacionAux);
					}		
				}
				this.iIdNuevoTipoOperacion=0L;
				this.tipooperacions.removeAll(tipooperacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoOperacion 
					&& this.tipooperacionLogic.getTipoOperacions().size()>0
					) {
					tipooperacionAux=this.tipooperacionLogic.getTipoOperacions().get(this.tipooperacionLogic.getTipoOperacions().size() - 1);
				
					if(tipooperacionAux.getId()<0) {
						this.tipooperacionLogic.getTipoOperacions().remove(tipooperacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoOperacion && this.tipooperacions.size()>0) {
					tipooperacionAux=this.tipooperacions.get(this.tipooperacions.size() - 1);
				
					if(tipooperacionAux.getId()<0) {
						this.tipooperacions.remove(tipooperacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoOperacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipooperacion.getId()<0) {
				this.tipooperacionLogic.getTipoOperacions().remove(this.tipooperacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipooperacion.getId()<0) {
				this.tipooperacions.remove(this.tipooperacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoOperacion(List<TipoOperacion> tipooperacionsAux) throws Exception {
		TipoOperacionConstantesFunciones.setEstadosInicialesTipoOperacion(tipooperacionsAux);
	}
	
	public void setEstadosInicialesTipoOperacion(TipoOperacion tipooperacionAux) throws Exception {
		TipoOperacionConstantesFunciones.setEstadosInicialesTipoOperacion(tipooperacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoOperacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoOperacionActual()) {
				if(!this.isEsNuevoTipoOperacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoOperacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoOperacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Operacion ?", "MANTENIMIENTO DE Tipo Operacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoOperacion tipooperacion) throws Exception {
		TipoOperacionConstantesFunciones.seleccionarAsignar(this.tipooperacion,tipooperacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoOperacion=this.isPermisoActualizarOriginalTipoOperacion;
			
			
			this.seleccionarAsignar(tipooperacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoOperacionConstantesFunciones.quitarEspaciosTipoOperacion(this.tipooperacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoOperacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipooperacionSessionBean.setsFuncionBusquedaRapida(this.tipooperacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoOperacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoOperacion(esParaCancelar);				
				this.cancelarNuevoTipoOperacion(esParaCancelar);								
			}
			
			this.tipooperacion=new TipoOperacion();
			
			this.inicializarTipoOperacion();
			
			this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoOperacion() throws Exception {
		try {
			TipoOperacionConstantesFunciones.inicializarTipoOperacion(this.tipooperacion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipooperacionLogic.getTipoOperacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoOperacions(String sAccionBusqueda,List<TipoOperacion> tipooperacionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoOperacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoOperacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoOperacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoOperacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Operacions");		
		parameters.put("busquedapor", TipoOperacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoOperacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoOperacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoOperacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoOperacion=new JRBeanArrayDataSource(TipoOperacionJInternalFrame.TraerTipoOperacionBeans(tipooperacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoOperacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoOperacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoOperacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoOperacionBean.TraerTipoOperacionBeans(tipooperacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoOperacionActionPerformed(null);
					//this.generarExcelReporteTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoOperacions(sAccionBusqueda,sTipoArchivoReporte,tipooperacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoOperacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoOperacion> tipooperacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoOperacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoOperacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoOperacion tipooperacion : tipooperacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoOperacionConstantesFunciones.generarExcelReporteDataTipoOperacion("NORMAL",row,workbook,tipooperacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoOperacion(String sTipo,Row row,Workbook workbook) {
		
		TipoOperacionConstantesFunciones.generarExcelReporteHeaderTipoOperacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoOperacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoOperacion> tipooperacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoOperacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoOperacion tipooperacion : tipooperacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoOperacionConstantesFunciones.getTipoOperacionDescripcion(tipooperacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoOperacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipooperacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoOperacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipooperacion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoOperacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoOperacion> tipooperacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoOperacion> tipooperacionsRespaldo=null;
		
		classes=TipoOperacionConstantesFunciones.getClassesRelationshipsOfTipoOperacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipooperacionLogic.setDatosCliente(this.datosCliente);
		this.tipooperacionLogic.setDatosDeep(this.datosDeep);
		this.tipooperacionLogic.setIsConDeep(true);
		
		tipooperacionsRespaldo=this.tipooperacionLogic.getTipoOperacions();
		
		this.tipooperacionLogic.setTipoOperacions(tipooperacionsParaReportes);	
		this.tipooperacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipooperacionsParaReportes=this.tipooperacionLogic.getTipoOperacions();
		this.tipooperacionLogic.setTipoOperacions(tipooperacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoOperacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoOperacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoOperacion tipooperacion : tipooperacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoOperacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoOperacionConstantesFunciones.generarExcelReporteDataTipoOperacion("NORMAL",row,workbook,tipooperacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoOperacionConstantesFunciones.getTipoOperacionDescripcion(tipooperacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoOperacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoOperacion() throws Exception {		
		this.startProcessTipoOperacion(true);
	}
	
	public void startProcessTipoOperacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoOperacion, this.jScrollPanelDatosTipoOperacion,this.jPanelPaginacionTipoOperacion, this.jScrollPanelDatosEdicionTipoOperacion, this.jPanelAccionesTipoOperacion,this.jPanelAccionesFormularioTipoOperacion,this.jmenuBarTipoOperacion,this.jmenuBarDetalleTipoOperacion,this.jTtoolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoOperacion=null; 
		
		final JPanel jPanelParametrosReportesTipoOperacion=this.jPanelParametrosReportesTipoOperacion;
		//final JScrollPane jScrollPanelDatosTipoOperacion=this.jScrollPanelDatosTipoOperacion;
		final JTable jTableDatosTipoOperacion=this.jTableDatosTipoOperacion;		
		final JPanel jPanelPaginacionTipoOperacion=this.jPanelPaginacionTipoOperacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoOperacion=this.jScrollPanelDatosEdicionTipoOperacion;
		final JPanel jPanelAccionesTipoOperacion=this.jPanelAccionesTipoOperacion;
		
		JPanel jPanelCamposAuxiliarTipoOperacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoOperacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			jPanelCamposAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jPanelCamposTipoOperacion;
			jPanelAccionesFormularioAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jPanelAccionesFormularioTipoOperacion;
		}
		
		final JPanel jPanelCamposTipoOperacion=jPanelCamposAuxiliarTipoOperacion;
		final JPanel jPanelAccionesFormularioTipoOperacion=jPanelAccionesFormularioAuxiliarTipoOperacion;
		
		
		final JMenuBar jmenuBarTipoOperacion=this.jmenuBarTipoOperacion;
		final JToolBar jTtoolBarTipoOperacion=this.jTtoolBarTipoOperacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoOperacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoOperacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			jmenuBarDetalleAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jmenuBarDetalleTipoOperacion;
			jTtoolBarDetalleAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jTtoolBarDetalleTipoOperacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoOperacion=jmenuBarDetalleAuxiliarTipoOperacion;
		final JToolBar jTtoolBarDetalleTipoOperacion=jTtoolBarDetalleAuxiliarTipoOperacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoOperacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoOperacion;
			processRunnable.jTableDatos=jTableDatosTipoOperacion;
			processRunnable.jPanelCampos=jPanelCamposTipoOperacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoOperacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoOperacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoOperacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoOperacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoOperacion;
			processRunnable.jTtoolBar=jTtoolBarTipoOperacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoOperacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoOperacion ,jPanelParametrosReportesTipoOperacion,jTableDatosTipoOperacion, /*jScrollPanelDatosTipoOperacion,*/jPanelCamposTipoOperacion,jPanelPaginacionTipoOperacion, /*jScrollPanelDatosEdicionTipoOperacion,*/ jPanelAccionesTipoOperacion,jPanelAccionesFormularioTipoOperacion,jmenuBarTipoOperacion,jmenuBarDetalleTipoOperacion,jTtoolBarTipoOperacion,jTtoolBarDetalleTipoOperacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoOperacion, jScrollPanelDatosTipoOperacion,jPanelPaginacionTipoOperacion, jScrollPanelDatosEdicionTipoOperacion, jPanelAccionesTipoOperacion,jPanelAccionesFormularioTipoOperacion,jmenuBarTipoOperacion,jmenuBarDetalleTipoOperacion,jTtoolBarTipoOperacion,jTtoolBarDetalleTipoOperacion);
						
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
	
	public void finishProcessTipoOperacion() {// throws Exception 
		this.finishProcessTipoOperacion(true);
	}
	
	public void finishProcessTipoOperacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoOperacion, this.jScrollPanelDatosTipoOperacion,this.jPanelPaginacionTipoOperacion, this.jScrollPanelDatosEdicionTipoOperacion, this.jPanelAccionesTipoOperacion,this.jPanelAccionesFormularioTipoOperacion,this.jmenuBarTipoOperacion,this.jmenuBarDetalleTipoOperacion,this.jTtoolBarTipoOperacion,this.jTtoolBarDetalleTipoOperacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoOperacion=null; 
		
		final JPanel jPanelParametrosReportesTipoOperacion=this.jPanelParametrosReportesTipoOperacion;
		//final JScrollPane jScrollPanelDatosTipoOperacion=this.jScrollPanelDatosTipoOperacion;
		final JTable jTableDatosTipoOperacion=this.jTableDatosTipoOperacion;		
		final JPanel jPanelPaginacionTipoOperacion=this.jPanelPaginacionTipoOperacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoOperacion=this.jScrollPanelDatosEdicionTipoOperacion;
		final JPanel jPanelAccionesTipoOperacion=this.jPanelAccionesTipoOperacion;
		
		JPanel jPanelCamposAuxiliarTipoOperacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoOperacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			jPanelCamposAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jPanelCamposTipoOperacion;
			jPanelAccionesFormularioAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jPanelAccionesFormularioTipoOperacion;
		}
		
		final JPanel jPanelCamposTipoOperacion=jPanelCamposAuxiliarTipoOperacion;
		final JPanel jPanelAccionesFormularioTipoOperacion=jPanelAccionesFormularioAuxiliarTipoOperacion;
		
		
		final JMenuBar jmenuBarTipoOperacion=this.jmenuBarTipoOperacion;		
		final JToolBar jTtoolBarTipoOperacion=this.jTtoolBarTipoOperacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoOperacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoOperacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			jmenuBarDetalleAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jmenuBarDetalleTipoOperacion;
			jTtoolBarDetalleAuxiliarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jTtoolBarDetalleTipoOperacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoOperacion=jmenuBarDetalleAuxiliarTipoOperacion;
		final JToolBar jTtoolBarDetalleTipoOperacion=jTtoolBarDetalleAuxiliarTipoOperacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoOperacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoOperacion;
			processRunnable.jTableDatos=jTableDatosTipoOperacion;
			processRunnable.jPanelCampos=jPanelCamposTipoOperacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoOperacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoOperacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoOperacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoOperacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoOperacion;
			processRunnable.jTtoolBar=jTtoolBarTipoOperacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoOperacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoOperacion ,jPanelParametrosReportesTipoOperacion, jTableDatosTipoOperacion,/*jScrollPanelDatosTipoOperacion,*/jPanelCamposTipoOperacion,jPanelPaginacionTipoOperacion, /*jScrollPanelDatosEdicionTipoOperacion,*/ jPanelAccionesTipoOperacion,jPanelAccionesFormularioTipoOperacion,jmenuBarTipoOperacion,jmenuBarDetalleTipoOperacion,jTtoolBarTipoOperacion,jTtoolBarDetalleTipoOperacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoOperacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoOperacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoOperacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoOperacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoOperacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoOperacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoOperacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoOperacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoOperacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipooperacionConstantesFunciones.getsFinalQueryTipoOperacion();
		String  finalQueryPaginacionTodos=this.tipooperacionConstantesFunciones.getsFinalQueryTipoOperacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoOperacionConstantesFunciones.getArrayColumnasGlobalesNoTipoOperacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoOperacionConstantesFunciones.getArrayColumnasGlobalesTipoOperacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoOperacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipooperacionsEliminados= new ArrayList<TipoOperacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoOperacion();
		
				///*TipoOperacionSessionBean*/this.tipooperacionSessionBean=new TipoOperacionSessionBean();
			
			if(this.tipooperacionSessionBean==null) {
				this.tipooperacionSessionBean=new TipoOperacionSessionBean();
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
					this.iNumeroPaginacion=TipoOperacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoOperacionConstantesFunciones.getClassesForeignKeysOfTipoOperacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipooperacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipooperacionsAux= new ArrayList<TipoOperacion>();
			
				
			tipooperacionLogic.setDatosCliente(this.datosCliente);
			tipooperacionLogic.setDatosDeep(this.datosDeep);
			tipooperacionLogic.setIsConDeep(true);
			
			
			tipooperacionLogic.getTipoOperacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipooperacionLogic.getTodosTipoOperacions(finalQueryGlobal,pagination);
					
					//tipooperacionLogic.getTodosTipoOperacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipooperacionLogic.getTipoOperacions()==null|| tipooperacionLogic.getTipoOperacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipooperacionsAux= new ArrayList<TipoOperacion>();
							tipooperacionsAux.addAll(tipooperacionLogic.getTipoOperacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipooperacionsAux= new ArrayList<TipoOperacion>();
							tipooperacionsAux.addAll(tipooperacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipooperacionLogic.getTodosTipoOperacions(finalQueryGlobal+"",this.pagination);												
							
							//tipooperacionLogic.getTodosTipoOperacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoOperacions("Todos",tipooperacionLogic.getTipoOperacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipooperacionLogic.setTipoOperacions(new ArrayList<TipoOperacion>());					
							tipooperacionLogic.getTipoOperacions().addAll(tipooperacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipooperacions=new ArrayList<TipoOperacion>();
							tipooperacions.addAll(tipooperacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoOperacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoOperacion=this.idActual;
				
				} else if(this.idTipoOperacionActual!=null && this.idTipoOperacionActual!=0L) {
					idTipoOperacion=idTipoOperacionActual;
				}
				
					
				this.sDetalleReporte=TipoOperacionConstantesFunciones.getDetalleIndicePorId(idTipoOperacion);
				
				this.tipooperacions=new ArrayList<TipoOperacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipooperacionLogic.getEntity(idTipoOperacion);
					
					//tipooperacionLogic.getEntityWithConnection(idTipoOperacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipooperacionLogic.setTipoOperacions(new ArrayList<TipoOperacion>());
					tipooperacionLogic.getTipoOperacions().add(tipooperacionLogic.getTipoOperacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipooperacions=new ArrayList<TipoOperacion>();
					this.tipooperacions.add(tipooperacion);
				}
				
				if(tipooperacionLogic.getTipoOperacion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoOperacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoOperacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipooperacionLogic.getTipoOperacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipooperacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipooperacionLogic.getTipoOperacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipooperacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoOperacion tipooperacion) {
		Boolean permite=true;
		
		if(this.tipooperacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoOperacionConstantesFunciones.getOrderByListaTipoOperacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoOperacionConstantesFunciones.getOrderByListaTipoOperacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoOperacion tipooperacion:tipooperacionLogic.getTipoOperacions()) {
				if(tipooperacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipooperacionTotales=tipooperacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoOperacion tipooperacion:this.tipooperacions) {
				if(tipooperacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipooperacionTotales=tipooperacion;
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
			this.tipooperacionAux=new TipoOperacion();
			this.tipooperacionAux.setsType(Constantes2.S_TOTALES);
			this.tipooperacionAux.setIsNew(false);
			this.tipooperacionAux.setIsChanged(false);
			this.tipooperacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoOperacionConstantesFunciones.TotalizarValoresFilaTipoOperacion(this.tipooperacionLogic.getTipoOperacions(),this.tipooperacionAux);
				
				this.tipooperacionLogic.getTipoOperacions().add(this.tipooperacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoOperacionConstantesFunciones.TotalizarValoresFilaTipoOperacion(this.tipooperacions,this.tipooperacionAux);
				
				this.tipooperacions.add(this.tipooperacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipooperacionTotales=new TipoOperacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipooperacionLogic.getTipoOperacions().remove(tipooperacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipooperacions.remove(tipooperacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipooperacionTotales=new TipoOperacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoOperacion tipooperacion:tipooperacionLogic.getTipoOperacions()) {
				if(tipooperacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipooperacionTotales=tipooperacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoOperacionConstantesFunciones.TotalizarValoresFilaTipoOperacion(this.tipooperacionLogic.getTipoOperacions(),tipooperacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoOperacion tipooperacion:this.tipooperacions) {
				if(tipooperacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipooperacionTotales=tipooperacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoOperacionConstantesFunciones.TotalizarValoresFilaTipoOperacion(this.tipooperacions,tipooperacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoOperacion() {
		this.isPermisoTodoTipoOperacion=false;
		this.isPermisoNuevoTipoOperacion=false;
		this.isPermisoActualizarTipoOperacion=false;
		this.isPermisoActualizarOriginalTipoOperacion=false;
		this.isPermisoEliminarTipoOperacion=false;
		this.isPermisoGuardarCambiosTipoOperacion=false;
		this.isPermisoConsultaTipoOperacion=false;
		this.isPermisoBusquedaTipoOperacion=false;
		this.isPermisoReporteTipoOperacion=false;		
		this.isPermisoOrdenTipoOperacion=false;		
		this.isPermisoPaginacionMedioTipoOperacion=false;		
		this.isPermisoPaginacionAltoTipoOperacion=false;
		this.isPermisoPaginacionTodoTipoOperacion=false;
		this.isPermisoCopiarTipoOperacion=false;		
		this.isPermisoVerFormTipoOperacion=false;		
		this.isPermisoDuplicarTipoOperacion=false;		
		this.isPermisoOrdenTipoOperacion=false;		
	}
	
	public void setPermisosUsuarioTipoOperacion(Boolean isPermiso) {
		this.isPermisoTodoTipoOperacion=isPermiso;
		this.isPermisoNuevoTipoOperacion=isPermiso;
		this.isPermisoActualizarTipoOperacion=isPermiso;
		this.isPermisoActualizarOriginalTipoOperacion=isPermiso;
		this.isPermisoEliminarTipoOperacion=isPermiso;
		this.isPermisoGuardarCambiosTipoOperacion=isPermiso;
		this.isPermisoConsultaTipoOperacion=isPermiso;
		this.isPermisoBusquedaTipoOperacion=isPermiso;
		this.isPermisoReporteTipoOperacion=isPermiso;
		this.isPermisoOrdenTipoOperacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoOperacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoOperacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoOperacion=isPermiso;		
		this.isPermisoCopiarTipoOperacion=isPermiso;		
		this.isPermisoVerFormTipoOperacion=isPermiso;		
		this.isPermisoDuplicarTipoOperacion=isPermiso;
		this.isPermisoOrdenTipoOperacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoOperacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoOperacion=isPermiso;
		this.isPermisoNuevoTipoOperacion=isPermiso;
		this.isPermisoActualizarTipoOperacion=isPermiso;
		this.isPermisoActualizarOriginalTipoOperacion=isPermiso;
		this.isPermisoEliminarTipoOperacion=isPermiso;
		this.isPermisoGuardarCambiosTipoOperacion=isPermiso;
		//this.isPermisoConsultaTipoOperacion=isPermiso;
		//this.isPermisoBusquedaTipoOperacion=isPermiso;
		//this.isPermisoReporteTipoOperacion=isPermiso;
		//this.isPermisoOrdenTipoOperacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoOperacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoOperacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoOperacion=isPermiso;		
		//this.isPermisoCopiarTipoOperacion=isPermiso;		
		//this.isPermisoDuplicarTipoOperacion=isPermiso;
		//this.isPermisoOrdenTipoOperacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoOperacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoOperacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoOperacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoOperacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoOperacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoOperacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoOperacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoOperacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoOperacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoOperacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoOperacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoOperacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoOperacion=this.isPermisoActualizarTipoOperacion;
			this.isPermisoEliminarTipoOperacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoOperacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoOperacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoOperacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoOperacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoOperacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoOperacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoOperacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoOperacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoOperacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoOperacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoOperacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoOperacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoOperacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoOperacion.setToolTipText(this.jTableDatosTipoOperacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoOperacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoOperacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoOperacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoOperacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoOperacion() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoOperacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoOperacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoOperacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoOperacionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoOperacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoOperacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoOperacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoOperacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoOperacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoOperacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoOperacion(TipoOperacion tipooperacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoOperacion(TipoOperacion tipooperacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoOperacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoOperacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoOperacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoOperacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoOperacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoOperacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoOperacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoOperacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoOperacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoOperacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoOperacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipooperacionSessionBean=new TipoOperacionSessionBean(); 
		this.tipooperacionConstantesFunciones=new TipoOperacionConstantesFunciones(); 
		this.tipooperacionBean=new TipoOperacion();//(this.tipooperacionConstantesFunciones); 		
		this.tipooperacionReturnGeneral=new TipoOperacionParameterReturnGeneral(); 
		
		this.tipooperacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipooperacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoOperacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoOperacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoOperacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoOperacion(true);
			
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
			
			this.tipooperacionConstantesFunciones=new TipoOperacionConstantesFunciones(); 
			this.tipooperacionBean=new TipoOperacion();//this.tipooperacionConstantesFunciones); 			
			this.tipooperacionReturnGeneral=new TipoOperacionParameterReturnGeneral(); 
		
			TipoOperacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Operacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipooperacion=new TipoOperacion();
			this.tipooperacions = new ArrayList<TipoOperacion>();
			this.tipooperacionsAux = new ArrayList<TipoOperacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic=new TipoOperacionLogic();
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipooperacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipooperacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoOperacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoOperacion);	
					}
					
					if(this.jInternalFrameImportacionTipoOperacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoOperacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoOperacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoOperacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoOperacion);
				this.jInternalFrameDetalleFormTipoOperacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoOperacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoOperacion);
					this.jInternalFrameReporteDinamicoTipoOperacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoOperacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoOperacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoOperacion);
					this.jInternalFrameImportacionTipoOperacion.setVisible(false);
					this.jInternalFrameImportacionTipoOperacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoOperacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoOperacion);
					this.jInternalFrameOrderByTipoOperacion.setVisible(false);
					this.jInternalFrameOrderByTipoOperacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoOperacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoOperacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipooperacionReturnGeneral=new TipoOperacionParameterReturnGeneral();
			
			this.tipooperacionParameterGeneral=new TipoOperacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipooperacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoOperacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoOperacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipooperacionSessionBean.getEsGuardarRelacionado(),this.tipooperacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoOperacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipooperacionSessionBean.getEsGuardarRelacionado(),this.tipooperacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaDuplicarTipoOperacion=true;
			this.isVisibilidadCeldaCopiarTipoOperacion=true;
			this.isVisibilidadCeldaVerFormTipoOperacion=true;
			this.isVisibilidadCeldaOrdenTipoOperacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=false;
			this.isVisibilidadCeldaGuardarTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoOperacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoOperacion(false);
			
			this.setPermisosUsuarioTipoOperacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipooperacionSessionBean.getEsGuardarRelacionado() && this.tipooperacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoOperacionClasesRelacionadas();
			}
			
			if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoOperacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoOperacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoOperacion();
			}
			
			if(!this.isPermisoBusquedaTipoOperacion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoOperacion,this.isPermisoPaginacionMedioTipoOperacion,this.isPermisoPaginacionTodoTipoOperacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoOperacionConstantesFunciones.getTiposSeleccionarTipoOperacion());
				
				this.tiposColumnasSelect=TipoOperacionConstantesFunciones.getTiposSeleccionarTipoOperacion(true);
				
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
			//if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoOperacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoOperacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoOperacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoOperacion() ;
			
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
				tipooperacionImplementable= (TipoOperacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoOperacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipooperacionImplementableHome= (TipoOperacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoOperacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipooperacions= new ArrayList<TipoOperacion>();
			this.tipooperacionsEliminados= new ArrayList<TipoOperacion>();
						
			this.isEsNuevoTipoOperacion=false;
			this.esParaAccionDesdeFormularioTipoOperacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoOperacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoOperacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoOperacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoOperacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoOperacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoOperacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoOperacion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoOperacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoOperacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoOperacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoOperacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoOperacion();	
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
	
	public void cargarCombosForeignKeyTipoOperacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoOperacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoOperacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoOperacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoOperacion();
		
		this.cargarCombosFrameForeignKeyTipoOperacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoOperacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoOperacion();
		}
	}
	
	
	
	public void jButtonNuevoTipoOperacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			
			if(jTableDatosTipoOperacion.getRowCount()>=1) {
				jTableDatosTipoOperacion.removeRowSelectionInterval(0, jTableDatosTipoOperacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoOperacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoOperacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoOperacion(true);			
			//this.tipooperacion=new TipoOperacion();
			//this.tipooperacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoOperacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoOperacion() ;
			
			if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoOperacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipooperacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);				
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoOperacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoOperacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoOperacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoOperacion.getSelectedRows().length;			
			}
			
			tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoOperacion--;			
				//TipoOperacion tipooperacionAux= new TipoOperacion();			
				//tipooperacionAux.setId(this.iIdNuevoTipoOperacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoOperacion tipooperacionOrigen=new TipoOperacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoOperacion tipooperacionOrigen : tipooperacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipooperacionOrigen =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipooperacionOrigen =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoOperacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipooperacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoOperacion(tipooperacionOrigen,this.tipooperacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipooperacionLogic.getTipoOperacions().add(this.tipooperacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipooperacions.add(this.tipooperacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoOperacion(false);
				
				this.jTableDatosTipoOperacion.setRowSelectionInterval(this.getIndiceNuevoTipoOperacion(), this.getIndiceNuevoTipoOperacion());
				
				int iLastRow =  this.jTableDatosTipoOperacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoOperacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoOperacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoOperacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();									
		
			TipoOperacion tipooperacionOrigen=new TipoOperacion();
			TipoOperacion tipooperacionDestino=new TipoOperacion();
				
			tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoOperacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipooperacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoOperacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipooperacionOrigen =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipooperacionOrigen =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipooperacionDestino =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipooperacionDestino =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipooperacionOrigen =tipooperacionsSeleccionados.get(0);
				tipooperacionDestino =tipooperacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoOperacion(tipooperacionOrigen,tipooperacionDestino,true,false);
				
				tipooperacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipooperacionDestino,tipooperacionLogic.getTipoOperacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipooperacionDestino,tipooperacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoOperacion(false);
				
				//this.jTableDatosTipoOperacion.setRowSelectionInterval(this.getIndiceNuevoTipoOperacion(), this.getIndiceNuevoTipoOperacion());
				
				int iLastRow =  this.jTableDatosTipoOperacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoOperacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoOperacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoOperacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoOperacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoOperacion.isVisible();
			
			
			this.jPanelParametrosReportesTipoOperacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoOperacion.setVisible(!isVisible);
			this.jPanelAccionesTipoOperacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoOperacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoOperacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoOperacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoOperacion();
			
			this.abrirFrameOrderByTipoOperacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoOperacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoOperacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoOperacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoOperacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoOperacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoOperacion.setSize(this.jInternalFrameDetalleFormTipoOperacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoOperacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoOperacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoOperacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoOperacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoOperacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoOperacion.jContentPaneDetalleTipoOperacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoOperacion.jContentPaneDetalleTipoOperacion.getWidth(),TipoOperacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoOperacion.jContentPaneDetalleTipoOperacion.getWidth(),TipoOperacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoOperacion.jContentPaneDetalleTipoOperacion.getWidth(),TipoOperacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoOperacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoOperacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoOperacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoOperacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoOperacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoOperacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoOperacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoOperacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoOperacion);
				this.jInternalFrameOrderByTipoOperacion.setVisible(false);
				this.jInternalFrameOrderByTipoOperacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoOperacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoOperacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoOperacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoOperacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoOperacion==null) {
				
				this.jInternalFrameImportacionTipoOperacion=new ImportacionJInternalFrame(TipoOperacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoOperacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoOperacion);
				this.jInternalFrameImportacionTipoOperacion.setVisible(false);
				this.jInternalFrameImportacionTipoOperacion.setSelected(false);


				this.jInternalFrameImportacionTipoOperacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoOperacion"));
				this.jInternalFrameImportacionTipoOperacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoOperacion"));
				this.jInternalFrameImportacionTipoOperacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoOperacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoOperacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoOperacion==null) {
				this.jInternalFrameReporteDinamicoTipoOperacion=new ReporteDinamicoJInternalFrame(TipoOperacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoOperacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoOperacion);
				this.jInternalFrameReporteDinamicoTipoOperacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoOperacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoOperacion"));
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoOperacion"));
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoOperacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoOperacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoOperacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoOperacion);
			
	       	this.jInternalFrameDetalleFormTipoOperacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoOperacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoOperacion.dispose();
			//this.jInternalFrameDetalleFormTipoOperacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoOperacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoOperacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoOperacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoOperacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoOperacion.setVisible(true);
	        this.jInternalFrameImportacionTipoOperacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoOperacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoOperacion.setVisible(true);
	        this.jInternalFrameOrderByTipoOperacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoOperacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoOperacion.setVisible(false);
	        this.jInternalFrameOrderByTipoOperacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoOperacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoOperacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoOperacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoOperacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoOperacion.setVisible(false);
	        this.jInternalFrameImportacionTipoOperacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoOperacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoOperacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoOperacion(true);
			//this.isEsNuevoTipoOperacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoOperacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoOperacion(false) ;
			
			if(tipooperacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoOperacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoOperacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoOperacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoOperacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoOperacion(true);
			//this.isEsNuevoTipoOperacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipooperacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoOperacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoOperacion(false) ;
			
			if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoOperacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoOperacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoOperacion(false);
			
			//if(!this.isEsNuevoTipoOperacion) {								
				int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipooperacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoOperacion=true;
					this.inicializarActualizarBindingTablaTipoOperacion(false);
					this.isEsNuevoTipoOperacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoOperacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoOperacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoOperacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoOperacion(false);
				
				this.habilitarDeshabilitarControlesTipoOperacion(false);
			
												
				
				if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoOperacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoOperacionActionPerformed(evt,tipooperacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoOperacion(this.tipooperacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoOperacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipooperacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipooperacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				this.tipooperacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				this.tipooperacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipooperacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoOperacionModel) this.jTableDatosTipoOperacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoOperacion=true;
				this.inicializarActualizarBindingTablaTipoOperacion(false);
				this.isEsNuevoTipoOperacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoOperacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoOperacion(false);
				
				this.habilitarDeshabilitarControlesTipoOperacion(false);
				
				
				
				if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoOperacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoOperacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoOperacion.getRowCount()>=1) {
				jTableDatosTipoOperacion.removeRowSelectionInterval(0, jTableDatosTipoOperacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoOperacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoOperacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoOperacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoOperacion(false) ;
			
			this.isEsNuevoTipoOperacion=false;
			
			if(TipoOperacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoOperacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoOperacion(false);
				
				//SI ES MANUAL
				if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoOperacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoOperacion--;			
			//TipoOperacion tipooperacionAux= new TipoOperacion();			
			//tipooperacionAux.setId(this.iIdNuevoTipoOperacion);
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoOperacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
			
			this.tipooperacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipooperacionLogic.getTipoOperacions().add(this.tipooperacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipooperacions.add(this.tipooperacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoOperacion(false);
			
			this.jTableDatosTipoOperacion.setRowSelectionInterval(this.getIndiceNuevoTipoOperacion(), this.getIndiceNuevoTipoOperacion());
			
			int iLastRow =  this.jTableDatosTipoOperacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoOperacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoOperacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoOperacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoOperacion(false);
			
			//SI ES MANUAL
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoOperacion();
			}
			
			//this.abrirFrameTreeTipoOperacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo OperacionS ?", "MANTENIMIENTO DE Tipo Operacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoOperacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoOperacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipooperacionReturnGeneral=tipooperacionLogic.procesarImportacionTipoOperacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipooperacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoOperacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoOperacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoOperacion.setFileImportacion(this.jInternalFrameImportacionTipoOperacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoOperacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoOperacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoOperacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoOperacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		

		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoOperacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoOperacionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoOperacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoOperacionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoOperacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoOperacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoOperacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoOperacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoOperacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoOperacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoOperacionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoOperacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoOperacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoOperacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoOperacion tipooperacion:tipooperacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipooperacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoOperacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoOperacion tipooperacion:tipooperacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipooperacion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoOperacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoOperacion(tipooperacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoOperacion(false);
			
			//SI ES MANUAL
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoOperacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoOperacion(false);
			
			//SI ES MANUAL
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoOperacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoOperacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoOperacion(false);
			
			//SI ES MANUAL
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoOperacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipooperacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoOperacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoOperacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoOperacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoOperacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoOperacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoOperacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoOperacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoOperacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoOperacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoOperacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoOperacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoOperacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoOperacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoOperacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoOperacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoOperacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoOperacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoOperacion();
		
		this.inicializarActualizarBindingBotonesManualTipoOperacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoOperacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoOperacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoOperacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoOperacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoOperacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoOperacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoOperacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionNuevoTipoOperacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionSinCerrarTipoOperacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionSinMensajeTipoOperacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoOperacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoOperacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoOperacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
				this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionNuevoTipoOperacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionSinCerrarTipoOperacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoOperacion.jCheckBoxPostAccionSinMensajeTipoOperacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoOperacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoOperacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoOperacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoOperacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoOperacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoOperacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoOperacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoOperacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoOperacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoOperacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoOperacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoOperacion() throws Exception {
		try	{
			if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoOperacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoOperacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoOperacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoOperacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoOperacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoOperacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoOperacion.addItem(reporte);
			}
			
			
			if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoOperacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoOperacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoOperacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoOperacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoOperacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoOperacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoOperacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoOperacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoOperacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
				this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
				this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoOperacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoOperacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoOperacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoOperacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoOperacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoOperacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoOperacion(Boolean esInicializar) throws Exception {				
		if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoOperacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoOperacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoOperacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoOperacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoOperacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoOperacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipooperacionLogic.getTipoOperacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipooperacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoOperacion.setModel(new TipoOperacionModel(this.tipooperacionLogic.getTipoOperacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoOperacion.setModel(new TipoOperacionModel(this.tipooperacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoOperacion!=null && this.jInternalFrameOrderByTipoOperacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoOperacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoOperacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO,tipooperacionConstantesFunciones.resaltarSeleccionarTipoOperacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoOperacionConstantesFunciones.SCLASSWEBTITULO,tipooperacionConstantesFunciones.resaltarSeleccionarTipoOperacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoOperacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,TipoOperacionConstantesFunciones.LABEL_ID));

		if(this.tipooperacionConstantesFunciones.mostraridTipoOperacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoOperacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipooperacionConstantesFunciones.resaltaridTipoOperacion,this.tipooperacionConstantesFunciones.activaridTipoOperacion,this,true,"idTipoOperacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipooperacionConstantesFunciones.resaltaridTipoOperacion,this.tipooperacionConstantesFunciones.activaridTipoOperacion,this,true,"idTipoOperacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoOperacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,TipoOperacionConstantesFunciones.LABEL_CODIGO));

		if(this.tipooperacionConstantesFunciones.mostrarcodigoTipoOperacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoOperacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipooperacionConstantesFunciones.resaltarcodigoTipoOperacion,this.tipooperacionConstantesFunciones.activarcodigoTipoOperacion,this,true,"codigoTipoOperacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipooperacionConstantesFunciones.resaltarcodigoTipoOperacion,this.tipooperacionConstantesFunciones.activarcodigoTipoOperacion,this,true,"codigoTipoOperacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoOperacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,TipoOperacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipooperacionConstantesFunciones.mostrarnombreTipoOperacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoOperacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipooperacionConstantesFunciones.resaltarnombreTipoOperacion,this.tipooperacionConstantesFunciones.activarnombreTipoOperacion,this,true,"nombreTipoOperacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipooperacionConstantesFunciones.resaltarnombreTipoOperacion,this.tipooperacionConstantesFunciones.activarnombreTipoOperacion,this,true,"nombreTipoOperacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoOperacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoOperacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoOperacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipooperacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoOperacion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoOperacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoOperacion.moveColumn(this.jTableDatosTipoOperacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoOperacion.moveColumn(this.jTableDatosTipoOperacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoOperacion.moveColumn(this.jTableDatosTipoOperacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoOperacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoOperacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoOperacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoOperacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoOperacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoOperacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoOperacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoOperacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipooperacionLogic.getTipoOperacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipooperacions.size()-1;
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
		//this.jTableDatosTipoOperacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoOperacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoOperacion();
			
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
				
				//this.isEsNuevoTipoOperacion=false;
					
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
				if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoOperacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoOperacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoOperacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipooperacion.getsType().equals("DUPLICADO")
				   || this.tipooperacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoOperacion=true;
				
				} else {
					this.isEsNuevoTipoOperacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipooperacion.getId()>=0 && !this.tipooperacion.getIsNew()) {						
						this.isEsNuevoTipoOperacion=false;
						
					} else {
						this.isEsNuevoTipoOperacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoOperacion(esRelaciones);						
				
				this.seleccionarTipoOperacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipooperacion.getId()<0) {
					this.isEsNuevoTipoOperacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoOperacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoOperacion(evt,rowIndex);
				}	
				
				if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoOperacion: " + this.dDif); 
					}
				}								
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoOperacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipooperacion)) {
					if(this.tipooperacion.getId()>0) {
						this.tipooperacion.setIsDeleted(true);
						
						this.tipooperacionsEliminados.add(this.tipooperacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipooperacionLogic.getTipoOperacions().remove(this.tipooperacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipooperacions.remove(this.tipooperacion);				
					}
					
					
					((TipoOperacionModel) this.jTableDatosTipoOperacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoOperacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoOperacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoOperacion) {
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoOperacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoOperacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoOperacion(this.tipooperacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoOperacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoOperacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoOperacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoOperacion(TipoOperacion tipooperacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoOperacion(tipooperacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoOperacion(TipoOperacion tipooperacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoOperacion(tipooperacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoOperacion(tipooperacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoOperacion(tipooperacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoOperacion(TipoOperacion tipooperacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setText(tipooperacion.getId().toString());
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setText(tipooperacion.getcodigo());
			this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setText(tipooperacion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoOperacion tipooperacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipooperacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoOperacion tipooperacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipooperacionLocal=this.tipooperacion;
			} else {
				tipooperacionLocal=this.tipooperacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipooperacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoOperacion(tipooperacionLocal,true);
					
					if(tipooperacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipooperacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipooperacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoOperacion(TipoOperacion tipooperacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoOperacion(tipooperacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(tipooperacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoOperacion(TipoOperacion tipooperacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoOperacion(tipooperacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoOperacion(TipoOperacion tipooperacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.getText()==null || this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.getText()=="" || this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setText("0");
			}

			if(conColumnasBase) {tipooperacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoOperacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoOperacion.jLabelIdTipoOperacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipooperacion.setcodigo(this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoOperacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoOperacion.jLabelcodigoTipoOperacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipooperacion.setnombre(this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoOperacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoOperacion.jLabelnombreTipoOperacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoOperacion(TipoOperacion tipooperacionBean,TipoOperacion tipooperacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoOperacion(TipoOperacion tipooperacionOrigen,TipoOperacion tipooperacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipooperacionOrigen.getId()!=null && !tipooperacionOrigen.getId().equals(0L))) {tipooperacion.setId(tipooperacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipooperacionOrigen.getcodigo()!=null && !tipooperacionOrigen.getcodigo().equals(""))) {tipooperacion.setcodigo(tipooperacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipooperacionOrigen.getnombre()!=null && !tipooperacionOrigen.getnombre().equals(""))) {tipooperacion.setnombre(tipooperacionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoOperacion(TipoOperacion tipooperacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setText(tipooperacion.getId().toString());
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setText(tipooperacion.getcodigo());
			this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setText(tipooperacion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoOperacion(TipoOperacionBean tipooperacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setText(tipooperacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setText(tipooperacionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setText(tipooperacionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoOperacion(TipoOperacionParameterReturnGeneral tipooperacionReturnGeneral,TipoOperacionBean tipooperacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoOperacion tipooperacionLocal=new TipoOperacion();
			
			tipooperacionLocal=tipooperacionReturnGeneral.getTipoOperacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipooperacionLocal.getId()!=null && !tipooperacionLocal.getId().equals(0L))) {tipooperacionBean.setId(tipooperacionLocal.getId());}}
			if(conDefault || (!conDefault && tipooperacionLocal.getcodigo()!=null && !tipooperacionLocal.getcodigo().equals(""))) {tipooperacionBean.setcodigo(tipooperacionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipooperacionLocal.getnombre()!=null && !tipooperacionLocal.getnombre().equals(""))) {tipooperacionBean.setnombre(tipooperacionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoOperacionGenerico(Long idTipoOperacionSeleccionado,JComboBox jComboBoxTipoOperacion,List<TipoOperacion> tipooperacionsLocal)throws Exception {
		try {
			TipoOperacion  tipooperacionTemp=null;

			for(TipoOperacion tipooperacionAux:tipooperacionsLocal) {
				if(tipooperacionAux.getId()!=null && tipooperacionAux.getId().equals(idTipoOperacionSeleccionado)) {
					tipooperacionTemp=tipooperacionAux;
					break;
				}
			}

			jComboBoxTipoOperacion.setSelectedItem(tipooperacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoOperacionGenerico(JComboBox jComboBoxTipoOperacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoOperacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoOperacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoOperacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoOperacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoOperacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoOperacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoOperacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoOperacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoOperacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoOperacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipooperacion=(TipoOperacion) tipooperacionLogic.getTipoOperacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipooperacion =(TipoOperacion) tipooperacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoOperacion tipooperacionRow=new TipoOperacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipooperacionRow=(TipoOperacion) tipooperacionLogic.getTipoOperacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipooperacionRow=(TipoOperacion) tipooperacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoOperacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion));			
			this.jButtonDuplicarTipoOperacion.setVisible((this.isVisibilidadCeldaDuplicarTipoOperacion && this.isPermisoDuplicarTipoOperacion));			
			this.jButtonCopiarTipoOperacion.setVisible((this.isVisibilidadCeldaCopiarTipoOperacion && this.isPermisoCopiarTipoOperacion));
			this.jButtonVerFormTipoOperacion.setVisible((this.isVisibilidadCeldaVerFormTipoOperacion && this.isPermisoVerFormTipoOperacion));
			
			this.jButtonAbrirOrderByTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));			
			
			this.jButtonNuevoRelacionesTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoOperacion && this.isPermisoNuevoTipoOperacion));			
			this.jButtonNuevoGuardarCambiosTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarTipoOperacion.setVisible((this.isVisibilidadCeldaModificarTipoOperacion && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.setVisible((this.isVisibilidadCeldaActualizarTipoOperacion && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.setVisible((this.isVisibilidadCeldaEliminarTipoOperacion && this.isPermisoEliminarTipoOperacion));
			this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.setVisible(this.isVisibilidadCeldaCancelarTipoOperacion);							
			this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion));						
			this.jButtonDuplicarToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaDuplicarTipoOperacion && this.isPermisoDuplicarTipoOperacion));						
			this.jButtonCopiarToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaCopiarTipoOperacion && this.isPermisoCopiarTipoOperacion));			
			this.jButtonVerFormToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaVerFormTipoOperacion && this.isPermisoVerFormTipoOperacion));			
			this.jButtonAbrirOrderByToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));
			this.jButtonNuevoRelacionesToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoOperacion && this.isPermisoNuevoTipoOperacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));			
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaModificarTipoOperacion && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaActualizarTipoOperacion  && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaEliminarTipoOperacion && this.isPermisoEliminarTipoOperacion));
			this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarToolBarTipoOperacion.setVisible(this.isVisibilidadCeldaCancelarTipoOperacion);				
			this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion));			
			this.jMenuItemDuplicarTipoOperacion.setVisible((this.isVisibilidadCeldaDuplicarTipoOperacion && this.isPermisoDuplicarTipoOperacion));			
			this.jMenuItemCopiarTipoOperacion.setVisible((this.isVisibilidadCeldaCopiarTipoOperacion && this.isPermisoCopiarTipoOperacion));			
			this.jMenuItemVerFormTipoOperacion.setVisible((this.isVisibilidadCeldaVerFormTipoOperacion && this.isPermisoVerFormTipoOperacion));			
			this.jMenuItemAbrirOrderByTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));			
			//this.jMenuItemMostrarOcultarTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));
			this.jMenuItemDetalleAbrirOrderByTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoOperacion.setVisible((this.isVisibilidadCeldaOrdenTipoOperacion && this.isPermisoOrdenTipoOperacion));			
			this.jMenuItemNuevoRelacionesTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoOperacion && this.isPermisoNuevoTipoOperacion));			
			this.jMenuItemNuevoGuardarCambiosTipoOperacion.setVisible((this.isVisibilidadCeldaNuevoTipoOperacion && this.isPermisoNuevoTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));									
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemModificarTipoOperacion.setVisible((this.isVisibilidadCeldaModificarTipoOperacion && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemActualizarTipoOperacion.setVisible((this.isVisibilidadCeldaActualizarTipoOperacion && this.isPermisoActualizarTipoOperacion));	
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemEliminarTipoOperacion.setVisible((this.isVisibilidadCeldaEliminarTipoOperacion && this.isPermisoEliminarTipoOperacion));
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemCancelarTipoOperacion.setVisible(this.isVisibilidadCeldaCancelarTipoOperacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));						
			this.jMenuItemGuardarCambiosTablaTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoOperacion=this.jButtonNuevoTipoOperacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoOperacion=this.jButtonDuplicarTipoOperacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoOperacion=this.jButtonCopiarTipoOperacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoOperacion=this.jButtonVerFormTipoOperacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoOperacion=this.jButtonAbrirOrderByTipoOperacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=this.jButtonNuevoRelacionesTipoOperacion.isVisible();
			this.isVisibilidadCeldaModificarTipoOperacion=this.jButtonModificarTipoOperacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.isVisibilidadCeldaActualizarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=this.jButtonGuardarCambiosTablaTipoOperacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoOperacion=this.jButtonNuevoToolBarTipoOperacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=this.jButtonNuevoRelacionesToolBarTipoOperacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.isVisibilidadCeldaModificarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarToolBarTipoOperacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarToolBarTipoOperacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarToolBarTipoOperacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarToolBarTipoOperacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoOperacion=this.jButtonGuardarCambiosToolBarTipoOperacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=this.jButtonGuardarCambiosTablaToolBarTipoOperacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoOperacion=this.jMenuItemNuevoTipoOperacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=this.jMenuItemNuevoRelacionesTipoOperacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.isVisibilidadCeldaModificarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jMenuItemModificarTipoOperacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jMenuItemActualizarTipoOperacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jMenuItemEliminarTipoOperacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoOperacion=this.jInternalFrameDetalleFormTipoOperacion.jMenuItemCancelarTipoOperacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoOperacion=this.jMenuItemGuardarCambiosTipoOperacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=this.jMenuItemGuardarCambiosTablaTipoOperacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoOperacion(Boolean esInicializar) {
		if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoOperacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoOperacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoOperacion() {
		this.jButtonNuevoTipoOperacion.setVisible(this.isPermisoNuevoTipoOperacion);			
		this.jButtonDuplicarTipoOperacion.setVisible(this.isPermisoDuplicarTipoOperacion);			
		this.jButtonCopiarTipoOperacion.setVisible(this.isPermisoCopiarTipoOperacion);			
		this.jButtonVerFormTipoOperacion.setVisible(this.isPermisoVerFormTipoOperacion);			
		
		this.jButtonAbrirOrderByTipoOperacion.setVisible(this.isPermisoOrdenTipoOperacion);					
		
		this.jButtonNuevoRelacionesTipoOperacion.setVisible(this.isPermisoNuevoTipoOperacion);			
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarTipoOperacion.setVisible(this.isPermisoActualizarTipoOperacion);	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.setVisible(this.isPermisoActualizarTipoOperacion);	
			this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.setVisible(this.isPermisoEliminarTipoOperacion);
			this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.setVisible(this.isVisibilidadCeldaCancelarTipoOperacion);						
			this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.setVisible(this.isPermisoGuardarCambiosTipoOperacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoOperacion.setVisible(this.isPermisoActualizarTipoOperacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoOperacion() {
		this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarTipoOperacion.setVisible(this.isPermisoActualizarTipoOperacion);	
		this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.setVisible(this.isPermisoActualizarTipoOperacion);	
		this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.setVisible(this.isPermisoEliminarTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.setVisible(this.isVisibilidadCeldaCancelarTipoOperacion);							
		this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.setVisible((this.isVisibilidadCeldaGuardarTipoOperacion && this.isPermisoGuardarCambiosTipoOperacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoOperacion() {
		if(TipoOperacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoOperacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoOperacion() {
	}
	
	public void jTableDatosTipoOperacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoOperacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoOperacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoOperacion(this.gettipooperacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipooperacion==null) {
						this.tipooperacion = new TipoOperacion();
					}

					this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
				}

				if(this.tipooperacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipooperacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoOperacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoOperacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoOperacion(this.gettipooperacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipooperacion==null) {
						this.tipooperacion = new TipoOperacion();
					}

					this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
				}

				if(this.tipooperacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipooperacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoOperacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoOperacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoOperacion(this.gettipooperacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipooperacion==null) {
						this.tipooperacion = new TipoOperacion();
					}

					this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);
				}

				if(this.tipooperacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipooperacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoOperacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoOperacion() {
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
			this.jInternalFrameDetalleFormTipoOperacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoOperacion.dispose();
			this.jInternalFrameDetalleFormTipoOperacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
			this.jInternalFrameReporteDinamicoTipoOperacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoOperacion.dispose();
			this.jInternalFrameReporteDinamicoTipoOperacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoOperacion!=null) {
			this.jInternalFrameImportacionTipoOperacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoOperacion.dispose();
			this.jInternalFrameImportacionTipoOperacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoOperacion();
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoOperacion")) {
				jButtonDuplicarTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoOperacion")) {
				jButtonCopiarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoOperacion")) {
				jButtonVerFormTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoOperacion")) {
				jButtonDuplicarTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoOperacion")) {
				jButtonDuplicarTipoOperacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoOperacion")) {
				jButtonModificarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoOperacion")) {
				jButtonModificarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoOperacion")) {
				jButtonModificarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoOperacion")) {
				jButtonActualizarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoOperacion")) {
				jButtonActualizarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoOperacion")) {
				jButtonActualizarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoOperacion")) {
				jButtonEliminarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoOperacion")) {
				jButtonEliminarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoOperacion")) {
				jButtonEliminarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoOperacion")) {
				jButtonCancelarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoOperacion")) {
				jButtonCancelarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoOperacion")) {
				jButtonCancelarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoOperacion")) {
				jButtonCerrarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoOperacion")) {
				jButtonCerrarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoOperacion")) {
				jButtonCerrarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoOperacion")) {
				jButtonMostrarOcultarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoOperacion")) {
				jButtonCancelarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoOperacion")) {
				jButtonCopiarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoOperacion")) {
				jButtonVerFormTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoOperacion")) {
				jButtonCopiarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoOperacion")) {
				jButtonVerFormTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoOperacion")) {
				jButtonRecargarInformacionTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoOperacion")) {
				jButtonRecargarInformacionTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoOperacion")) {
				jButtonRecargarInformacionTipoOperacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoOperacion")) {
				jButtonAnterioresTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoOperacion")) {
				jButtonAnterioresTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoOperacion")) {
				jButtonAnterioresTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoOperacion")) {
				jButtonSiguientesTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoOperacion")) {
				jButtonSiguientesTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoOperacion")) {
				jButtonSiguientesTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoOperacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoOperacion")) {
				jButtonAbrirOrderByTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoOperacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoOperacion")) {
				jButtonMostrarOcultarTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoOperacion")) {
				jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoOperacion")) {
				jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoOperacion")) {
				jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoOperacion")) {
				jButtonCerrarReporteDinamicoTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoOperacion")) {
				jButtonGenerarReporteDinamicoTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoOperacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoOperacion")) {
				jButtonCerrarImportacionTipoOperacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoOperacion")) {
				
				jButtonGenerarImportacionTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoOperacion")) {
				
				jButtonAbrirImportacionTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoOperacion")) {
				jComboBoxTiposAccionesTipoOperacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoOperacion")) {
				jComboBoxTiposRelacionesTipoOperacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoOperacion")) {
				jComboBoxTiposAccionesTipoOperacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoOperacion")) {
				
				jComboBoxTiposSeleccionarTipoOperacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoOperacion")) {
				jTextFieldValorCampoGeneralTipoOperacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoOperacion")) {
				jButtonAbrirOrderByTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoOperacion")) {
				jButtonAbrirOrderByTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoOperacion")) {
				jButtonCerrarOrderByTipoOperacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoOperacionBusqueda")) {
				this.jButtonidTipoOperacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoOperacionBusqueda")) {
				this.jButtoncodigoTipoOperacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoOperacionBusqueda")) {
				this.jButtonnombreTipoOperacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoOperacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoOperacion tipooperacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipooperacionLocal=this.tipooperacion;
			} else {
				tipooperacionLocal=this.tipooperacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
							
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
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
			
			


			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
								
						
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
								
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
							
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
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
			
			


			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
								
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoOperacion")) {
					jCheckBoxSeleccionarTodosTipoOperacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoOperacion")) {
					jCheckBoxSeleccionadosTipoOperacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoOperacion")) {
					
				}
				
				


				
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
												
				
				


				
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
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
			
			


			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoOperacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipooperacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipooperacion);
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
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
				
				


				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoOperacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoOperacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoOperacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipooperacionAnterior =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoOperacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoOperacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoOperacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipooperacion =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipooperacion =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipooperacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoOperacion")) {
				
				}
				
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoOperacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoOperacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoOperacion")) {
			
			}
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoOperacion();
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoOperacion")) {
				jButtonDuplicarTipoOperacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoOperacion")) {
				jButtonCopiarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoOperacion")) {
				jButtonVerFormTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoOperacion")) {
				jButtonNuevoTipoOperacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoOperacion")) {
				jButtonModificarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoOperacion")) {
				jButtonActualizarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoOperacion")) {
				jButtonEliminarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoOperacion")) {
				jButtonCancelarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoOperacion")) {
				jButtonCerrarTipoOperacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoOperacion")) {
				jButtonGuardarCambiosTipoOperacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoOperacion")) {
				jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoOperacion")) {
				jButtonAbrirOrderByTipoOperacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoOperacion")) {
				jButtonRecargarInformacionTipoOperacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoOperacion")) {
				jButtonAnterioresTipoOperacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoOperacion")) {
				jButtonSiguientesTipoOperacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoOperacionBusqueda")) {
				this.jButtonidTipoOperacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoOperacionBusqueda")) {
				this.jButtoncodigoTipoOperacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoOperacionBusqueda")) {
				this.jButtonnombreTipoOperacionBusquedaActionPerformed(evt);
			}
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoOperacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoOperacion")) {
				closingInternalFrameTipoOperacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoOperacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoOperacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoOperacionBeanSwingJInternalFrame jInternalFrameParent=(TipoOperacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoOperacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoOperacionActionPerformed(null);
			}
			
			TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipooperacion,new Object(),this.tipooperacionParameterGeneral,this.tipooperacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoOperacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoOperacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoOperacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipooperacion)) {
			if(!esControlTabla) {
				if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);			
				}
				
				if(this.tipooperacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoOperacion(this.tipooperacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipooperacionReturnGeneral=tipooperacionLogic.procesarEventosTipoOperacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipooperacionLogic.getTipoOperacions(),this.tipooperacion,this.tipooperacionParameterGeneral,this.isEsNuevoTipoOperacion,classes);//this.tipooperacionLogic.getTipoOperacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoOperacion(this.tipooperacionReturnGeneral,this.tipooperacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipooperacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoOperacion(classes,this.tipooperacionReturnGeneral,this.tipooperacionBean,false);
					}
						
					if(this.tipooperacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion());	
					}
						
					if(this.tipooperacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion(),classes);//this.tipooperacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoOperacion(this.tipooperacion,classes);//this.tipooperacionBean);									
				}
			
				if(TipoOperacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoOperacion(this.tipooperacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoOperacion(this.tipooperacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipooperacionAnterior!=null) {
						this.tipooperacion=this.tipooperacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipooperacionReturnGeneral=tipooperacionLogic.procesarEventosTipoOperacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipooperacionLogic.getTipoOperacions(),this.tipooperacion,this.tipooperacionParameterGeneral,this.isEsNuevoTipoOperacion,classes);//this.tipooperacionLogic.getTipoOperacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipooperacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipooperacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipooperacionReturnGeneral.getTipoOperacion(),tipooperacionLogic.getTipoOperacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipooperacionReturnGeneral.getTipoOperacion(),this.tipooperacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoOperacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoOperacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoOperacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoOperacion() throws Exception {
		
		TipoOperacionModel tipooperacionModel=(TipoOperacionModel)this.jTableDatosTipoOperacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipooperacionModel.tipooperacions=this.tipooperacionLogic.getTipoOperacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipooperacionModel.tipooperacions=this.tipooperacions;
		}
		
		
		((TipoOperacionModel) this.jTableDatosTipoOperacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoOperacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipooperacionAnterior(),this.tipooperacionLogic.getTipoOperacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipooperacionAnterior(),this.tipooperacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoOperacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoOperacion(TipoOperacion tipooperacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
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
										
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipooperacion,new Object(),generalEntityParameterGeneral,this.tipooperacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipooperacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoOperacionConstantesFunciones.getClassesRelationshipsOfTipoOperacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoOperacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoOperacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoOperacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoOperacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipooperacion,new Object(),generalEntityParameterGeneral,this.tipooperacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoOperacion(TipoOperacionBean tipooperacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoOperacion(ArrayList<Classe> classes,TipoOperacionReturnGeneral tipooperacionReturnGeneral,TipoOperacionBean tipooperacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoOperacion(TipoOperacion tipooperacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipooperacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoOperacion = new TipoOperacionDetalleFormJInternalFrame(jDesktopPane,this.tipooperacionSessionBean.getConGuardarRelaciones(),this.tipooperacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoOperacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoOperacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoOperacion.tipooperacionLogic=this.tipooperacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoOperacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoOperacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoOperacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoOperacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoOperacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoOperacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoOperacion"));
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarTipoOperacion.addActionListener(new ButtonActionListener(this,"ModificarTipoOperacion"));

		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoOperacion"));
					
		this.jInternalFrameDetalleFormTipoOperacion.jMenuItemModificarTipoOperacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoOperacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoOperacion"));
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoOperacion"));
						
		this.jInternalFrameDetalleFormTipoOperacion.jMenuItemActualizarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoOperacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.addActionListener (new ButtonActionListener(this,"EliminarTipoOperacion"));
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoOperacion"));
								
		this.jInternalFrameDetalleFormTipoOperacion.jMenuItemEliminarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoOperacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.addActionListener (new ButtonActionListener(this,"CancelarTipoOperacion"));
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoOperacion"));
					
		this.jInternalFrameDetalleFormTipoOperacion.jMenuItemCancelarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoOperacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jMenuItemDetalleCerrarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoOperacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoOperacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoOperacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoOperacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonidTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtoncodigoTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonnombreTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoOperacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoOperacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoOperacion"));
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoOperacion"));
		}
		
		this.jTableDatosTipoOperacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoOperacion"));
		
		this.jTableDatosTipoOperacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoOperacion"));
		
		this.jButtonNuevoTipoOperacion.addActionListener(new ButtonActionListener(this,"NuevoTipoOperacion"));
		
		this.jButtonDuplicarTipoOperacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoOperacion"));
		
		this.jButtonCopiarTipoOperacion.addActionListener(new ButtonActionListener(this,"CopiarTipoOperacion"));
		
		this.jButtonVerFormTipoOperacion.addActionListener(new ButtonActionListener(this,"VerFormTipoOperacion"));
		
		
		this.jButtonNuevoToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoOperacion"));
			
		this.jButtonDuplicarToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoOperacion"));
			
		this.jMenuItemNuevoTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoOperacion"));
			
		this.jMenuItemDuplicarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoOperacion"));		
		
		
		this.jButtonNuevoRelacionesTipoOperacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoOperacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoOperacion"));
			
		this.jMenuItemNuevoRelacionesTipoOperacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoOperacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarTipoOperacion.addActionListener(new ButtonActionListener(this,"ModificarTipoOperacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonModificarToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoOperacion"));
			
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemModificarTipoOperacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoOperacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarTipoOperacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoOperacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonActualizarToolBarTipoOperacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoOperacion"));
				
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemActualizarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoOperacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarTipoOperacion.addActionListener (new ButtonActionListener(this,"EliminarTipoOperacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonEliminarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoOperacion"));
						
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemEliminarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoOperacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarTipoOperacion.addActionListener (new ButtonActionListener(this,"CancelarTipoOperacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonCancelarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoOperacion"));
			
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemCancelarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoOperacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoOperacion"));		
		
		
		this.jButtonCerrarTipoOperacion.addActionListener (new ButtonActionListener(this,"CerrarTipoOperacion"));
		
		
		this.jButtonCerrarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoOperacion"));
			
		this.jMenuItemCerrarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoOperacion"));
			
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jMenuItemDetalleCerrarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoOperacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoOperacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoOperacion"));
		}
		
		this.jButtonCopiarToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoOperacion"));
			
		this.jButtonVerFormToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoOperacion"));
		
		this.jMenuItemGuardarCambiosTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoOperacion"));
			
		this.jMenuItemCopiarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoOperacion"));		
		
		this.jMenuItemVerFormTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoOperacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoOperacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoOperacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoOperacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoOperacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoOperacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoOperacion"));
					
		this.jButtonRecargarInformacionToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoOperacion"));
		
		this.jMenuItemRecargarInformacionTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoOperacion"));		
		
		
		
		this.jButtonAnterioresTipoOperacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoOperacion"));
		
		
		this.jButtonAnterioresToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoOperacion"));
		
		this.jMenuItemAnterioresTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoOperacion"));		
		
		
		this.jButtonSiguientesTipoOperacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoOperacion"));
		
		
		this.jButtonSiguientesToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoOperacion"));
			
		this.jMenuItemSiguientesTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoOperacion"));
			
		this.jMenuItemAbrirOrderByTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoOperacion"));
			
		this.jMenuItemMostrarOcultarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoOperacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoOperacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoOperacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoOperacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoOperacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoOperacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoOperacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoOperacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoOperacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoOperacion"));

		this.jCheckBoxSeleccionadosTipoOperacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoOperacion"));
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoOperacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoOperacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoOperacion"));
			
		this.jComboBoxTiposAccionesTipoOperacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoOperacion"));
					
		this.jComboBoxTiposSeleccionarTipoOperacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoOperacion"));
			
		this.jTextFieldValorCampoGeneralTipoOperacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoOperacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonidTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtoncodigoTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonnombreTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoOperacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoOperacion!=null) {
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoOperacion"));
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoOperacion"));
				this.jInternalFrameReporteDinamicoTipoOperacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoOperacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoOperacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoOperacion"));				
			//this.jButtonGenerarReporteDinamicoTipoOperacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoOperacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoOperacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoOperacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoOperacion!=null) {
				this.jInternalFrameImportacionTipoOperacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoOperacion"));
				this.jInternalFrameImportacionTipoOperacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoOperacion"));
				this.jInternalFrameImportacionTipoOperacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoOperacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoOperacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoOperacion"));
			
			this.jButtonAbrirOrderByToolBarTipoOperacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoOperacion"));			
			
			if(this.jInternalFrameOrderByTipoOperacion!=null) {
				this.jInternalFrameOrderByTipoOperacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoOperacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoOperacion.jTabbedPaneRelacionesTipoOperacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoOperacion"));
		
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
            		closingInternalFrameTipoOperacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoOperacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoOperacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoOperacionBeanSwingJInternalFrame jInternalFrameParent=(TipoOperacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoOperacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoOperacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoOperacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoOperacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoOperacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoOperacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoOperacion";
		inputMap = this.jButtonNuevoTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoOperacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoOperacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoOperacion";
		inputMap = this.jButtonNuevoRelacionesTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoOperacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoOperacion";
		inputMap = this.jButtonModificarTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoOperacion";
		inputMap = this.jButtonActualizarTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoOperacion";
		inputMap = this.jButtonEliminarTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoOperacion";
		inputMap = this.jButtonCancelarTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoOperacion";
		inputMap = this.jButtonCerrarTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoOperacion";
		inputMap = this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoOperacion.jButtonGuardarCambiosTipoOperacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoOperacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoOperacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoOperacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoOperacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoOperacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoOperacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoOperacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoOperacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoOperacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonidTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtoncodigoTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoOperacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoOperacion.jButtonnombreTipoOperacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoOperacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoOperacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoOperacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoOperacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoOperacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoOperacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
					tipooperacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoOperacion tipooperacionAux:tipooperacions) {
					tipooperacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoOperacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
						tipooperacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoOperacion tipooperacionAux:tipooperacions) {
						tipooperacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoOperacion tipooperacionAux:tipooperacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoOperacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoOperacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoOperacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoOperacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoOperacion.getSelectedRows();
			
			TipoOperacion tipooperacionLocal=new TipoOperacion();
			
			//this.seleccionarTodosTipoOperacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipooperacionLocal =(TipoOperacion) this.tipooperacionLogic.getTipoOperacions().toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipooperacionLocal =(TipoOperacion) this.tipooperacions.toArray()[this.jTableDatosTipoOperacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipooperacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
						tipooperacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoOperacion tipooperacionAux:tipooperacions) {
						tipooperacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoOperacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoOperacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoOperacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoOperacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoOperacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoOperacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoOperacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoOperacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoOperacion tipooperacionAux:this.tipooperacionLogic.getTipoOperacions()) {
				
						if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipooperacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipooperacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoOperacion tipooperacionAux:tipooperacions) {
					
						if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipooperacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipooperacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoOperacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoOperacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoOperacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoOperacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoOperacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoOperacion(conSplash);
				
					this.generarReporteTipoOperacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoOperacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoOperacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoOperacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoOperacion();
				
				this.exportarTipoOperacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoOperacions();
				//this.importarTipoOperacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoOperacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoOperacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Operacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoOperacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoOperacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoOperacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoOperacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoOperacion.jComboBoxTiposAccionesFormularioTipoOperacion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoOperacion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoOperacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoOperacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoOperacion();
			
			if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
			TipoOperacion tipooperacion=new TipoOperacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoOperacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoOperacion.getSelectedItem();
			
			
			
			
			tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipooperacionsSeleccionados.size()==1) {
				for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
					tipooperacion=tipooperacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoOperacion();
			
      		//this.finishProcessTipoOperacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoOperacionReturnGeneral() throws Exception {
		if(this.tipooperacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipooperacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipooperacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipooperacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipooperacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipooperacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoOperacion(false);
		}
		
		if(this.tipooperacionReturnGeneral.getConRetornoLista() || this.tipooperacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipooperacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipooperacionLogic.setTipoOperacions(this.tipooperacionReturnGeneral.getTipoOperacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipooperacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipooperacionLogic.setTipoOperacion(this.tipooperacionReturnGeneral.getTipoOperacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoOperacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoOperacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoOperacion> getTipoOperacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoOperacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoOperacion tipooperacionAux:tipooperacionLogic.getTipoOperacions()) {
					if(tipooperacionAux.getIsSelected()) {
						tipooperacionsSeleccionados.add(tipooperacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoOperacion tipooperacionAux:this.tipooperacions) {
					if(tipooperacionAux.getIsSelected()) {
						tipooperacionsSeleccionados.add(tipooperacionAux);				
					}
				}
			}
			
			if(tipooperacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipooperacionsSeleccionados.addAll(this.tipooperacionLogic.getTipoOperacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipooperacionsSeleccionados.addAll(this.tipooperacions);				
					}
				}
			}
		} else {
			tipooperacionsSeleccionados.add(this.tipooperacion);
		}
		
		return tipooperacionsSeleccionados;
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
	
	public void generarReporteTipoOperacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoOperacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoOperacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoOperacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoOperacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Operacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoOperacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoOperacion();
		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoOperacion();
		
		
		//this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados ,tipooperacionImplementable,tipooperacionImplementableHome);
	}
	
	public void mostrarImportacionTipoOperacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoOperacion();
		
		this.abrirFrameImportacionTipoOperacion();		
		
			
		//this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados ,tipooperacionImplementable,tipooperacionImplementableHome);
	}
	
	public void importarTipoOperacions() throws Exception {		
	
	}
	
	public void exportarTipoOperacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoOperacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoOperacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoOperacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Operacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoOperacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoOperacion(tipooperacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipooperacionAux.setsDetalleGeneralEntityReporte(tipooperacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoOperacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoOperacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoOperacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoOperacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoOperacionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoOperacion(TipoOperacion tipooperacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipooperacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipooperacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipooperacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipooperacion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoOperacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoOperacion(row);				
				iRow++;
			}				
			
			for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoOperacion(tipooperacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoOperacionsSeleccionados() throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();		
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipooperacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipooperacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipooperacion");
			//elementRoot.appendChild(element);
		
			for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
				element = document.createElement("tipooperacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoOperacion(tipooperacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Operacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoOperacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoOperacionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoOperacion(TipoOperacion tipooperacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipooperacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipooperacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipooperacion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoOperacion(TipoOperacion tipooperacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoOperacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipooperacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoOperacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipooperacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoOperacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipooperacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoOperacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipooperacion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoOperacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoOperacion> tipooperacionsSeleccionados=new ArrayList<TipoOperacion>();
		
		tipooperacionsSeleccionados=this.getTipoOperacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoOperacion(tipooperacionsSeleccionados);
		
		this.generarReporteTipoOperacions("Todos",tipooperacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoOperacion(ArrayList<TipoOperacion> tipooperacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoOperacion tipooperacionAux:tipooperacionsSeleccionados) {
				tipooperacionAux.setsDetalleGeneralEntityReporte(tipooperacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipooperacionAux.setsDescripcionGeneralEntityReporte1(tipooperacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoOperacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipooperacionAux.setsDescripcionGeneralEntityReporte1(tipooperacionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoOperacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoOperacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoOperacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoOperacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=true;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=true;
			this.isVisibilidadCeldaEliminarTipoOperacion=true;
			this.isVisibilidadCeldaCancelarTipoOperacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=true;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoOperacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=true;
			this.isVisibilidadCeldaModificarTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
			this.isVisibilidadCeldaModificarTipoOperacion=true;
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
			this.isVisibilidadCeldaCancelarTipoOperacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoOperacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoOperacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoOperacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=true;
		} else {
			this.actualizarEstadoPanelsTipoOperacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoOperacion=false;
			//this.isVisibilidadCeldaVerFormTipoOperacion=false;
			this.isVisibilidadCeldaDuplicarTipoOperacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipooperacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoOperacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoOperacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipooperacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipooperacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;												
			}
			
			this.jButtonCerrarTipoOperacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoOperacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipooperacion)) {
			this.isVisibilidadCeldaActualizarTipoOperacion=false;
			this.isVisibilidadCeldaEliminarTipoOperacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoOperacion() {
	}
	
	public void actualizarEstadoPanelsTipoOperacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoOperacion!=null) {
				this.jScrollPanelDatosEdicionTipoOperacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoOperacion!=null) {
				this.jScrollPanelDatosTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoOperacion!=null) {
				this.jPanelPaginacionTipoOperacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoOperacion!=null) {
				this.jPanelParametrosReportesTipoOperacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipooperacionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoOperacionSessionBean tipooperacionSessionBean=new TipoOperacionSessionBean();
		
		if(this.tipooperacionSessionBean==null) {
			this.tipooperacionSessionBean=new TipoOperacionSessionBean();
		}
		
		this.tipooperacionSessionBean.setsUltimaBusquedaTipoOperacion(this.getsAccionBusqueda());
		this.tipooperacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipooperacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoOperacionSessionBean tipooperacionSessionBean=new TipoOperacionSessionBean();
		
		if(this.tipooperacionSessionBean==null) {
			this.tipooperacionSessionBean=new TipoOperacionSessionBean();
		}
		
		if(this.tipooperacionSessionBean.getsUltimaBusquedaTipoOperacion()!=null&&!this.tipooperacionSessionBean.getsUltimaBusquedaTipoOperacion().equals("")) {
			this.setsAccionBusqueda(tipooperacionSessionBean.getsUltimaBusquedaTipoOperacion());
			this.setiNumeroPaginacion(tipooperacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipooperacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipooperacionSessionBean.setsUltimaBusquedaTipoOperacion("");
		this.tipooperacionSessionBean.setiNumeroPaginacion(TipoOperacionConstantesFunciones.INUMEROPAGINACION);
		this.tipooperacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoOperacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoOperacion() {
		this.updateBorderResaltarBusquedasFormularioTipoOperacion();
		this.updateVisibilidadBusquedasFormularioTipoOperacion();
		this.updateHabilitarBusquedasFormularioTipoOperacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoOperacion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoOperacion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoOperacion() {
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
	
	public void updateControlesFormularioTipoOperacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoOperacion();
		this.updateVisibilidadResaltarControlesFormularioTipoOperacion();
		this.updateHabilitarResaltarControlesFormularioTipoOperacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoOperacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipooperacionConstantesFunciones.resaltaridTipoOperacion!=null && this.jInternalFrameDetalleFormTipoOperacion!=null) {this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setBorder(this.tipooperacionConstantesFunciones.resaltaridTipoOperacion);}
		if(this.tipooperacionConstantesFunciones.resaltarcodigoTipoOperacion!=null && this.jInternalFrameDetalleFormTipoOperacion!=null) {this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setBorder(this.tipooperacionConstantesFunciones.resaltarcodigoTipoOperacion);}
		if(this.tipooperacionConstantesFunciones.resaltarnombreTipoOperacion!=null && this.jInternalFrameDetalleFormTipoOperacion!=null) {this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setBorder(this.tipooperacionConstantesFunciones.resaltarnombreTipoOperacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoOperacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostraridTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jPanelidTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostraridTipoOperacion);
		//this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostrarcodigoTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jPanelcodigoTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostrarcodigoTipoOperacion);
		//this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostrarnombreTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jPanelnombreTipoOperacion.setVisible(this.tipooperacionConstantesFunciones.mostrarnombreTipoOperacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoOperacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoOperacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoOperacion!=null) {
	
		this.jInternalFrameDetalleFormTipoOperacion.jTextFieldidTipoOperacion.setEnabled(this.tipooperacionConstantesFunciones.activaridTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jTextFieldcodigoTipoOperacion.setEnabled(this.tipooperacionConstantesFunciones.activarcodigoTipoOperacion);
		this.jInternalFrameDetalleFormTipoOperacion.jTextAreanombreTipoOperacion.setEnabled(this.tipooperacionConstantesFunciones.activarnombreTipoOperacion);
		}
	}
	
		
}