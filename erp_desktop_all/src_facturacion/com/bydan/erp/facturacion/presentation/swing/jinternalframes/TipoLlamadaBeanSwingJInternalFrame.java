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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoLlamadaConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoLlamadaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoLlamadaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoLlamadaBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoLlamadaBeanSwingJInternalFrame extends TipoLlamadaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoLlamadaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoLlamada> tipollamadaValidator = new ClassValidator<TipoLlamada>(TipoLlamada.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoLlamada tipollamada;	
	public TipoLlamada tipollamadaAux;
	public TipoLlamada tipollamadaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoLlamada tipollamadaTotales;
	public Long idTipoLlamadaActual;
	public Long iIdNuevoTipoLlamada=0L;
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
	
	public Boolean isPermisoTodoTipoLlamada;
	public Boolean isPermisoNuevoTipoLlamada;
	public Boolean isPermisoActualizarTipoLlamada;
	public Boolean isPermisoActualizarOriginalTipoLlamada;
	public Boolean isPermisoEliminarTipoLlamada;
	public Boolean isPermisoGuardarCambiosTipoLlamada;
	public Boolean isPermisoConsultaTipoLlamada;
	public Boolean isPermisoBusquedaTipoLlamada;
	public Boolean isPermisoReporteTipoLlamada;
	public Boolean isPermisoPaginacionMedioTipoLlamada;
	public Boolean isPermisoPaginacionAltoTipoLlamada;
	public Boolean isPermisoPaginacionTodoTipoLlamada;
	public Boolean isPermisoCopiarTipoLlamada;
	public Boolean isPermisoVerFormTipoLlamada;
	public Boolean isPermisoDuplicarTipoLlamada;
	public Boolean isPermisoOrdenTipoLlamada;
	
	
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
	
	public TipoLlamadaParameterReturnGeneral tipollamadaReturnGeneral;
	public TipoLlamadaParameterReturnGeneral tipollamadaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoLlamada=false;
	public Boolean esParaAccionDesdeFormularioTipoLlamada=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoLlamadaLogic tipollamadaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoLlamada tipollamadaBean;
	public TipoLlamadaConstantesFunciones tipollamadaConstantesFunciones;
	//public TipoLlamadaParameterReturnGeneral tipollamadaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoLlamada> tipollamadas;	
	//public List<TipoLlamada> tipollamadasEliminados;
	//public List<TipoLlamada> tipollamadasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoLlamada=false;
	public Boolean isVisibilidadCeldaDuplicarTipoLlamada=true;
	public Boolean isVisibilidadCeldaCopiarTipoLlamada=true;
	public Boolean isVisibilidadCeldaVerFormTipoLlamada=true;
	public Boolean isVisibilidadCeldaOrdenTipoLlamada=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
	public Boolean isVisibilidadCeldaModificarTipoLlamada=false;
	public Boolean isVisibilidadCeldaActualizarTipoLlamada=false;
	public Boolean isVisibilidadCeldaEliminarTipoLlamada=false;
	public Boolean isVisibilidadCeldaCancelarTipoLlamada=false;
	public Boolean isVisibilidadCeldaGuardarTipoLlamada=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoLlamada=false;	
	
	
	
	public Long getiIdNuevoTipoLlamada() {
		return this.iIdNuevoTipoLlamada;
	}

	public void setiIdNuevoTipoLlamada(Long iIdNuevoTipoLlamada) {
		this.iIdNuevoTipoLlamada = iIdNuevoTipoLlamada;
	}
	
	public Long getidTipoLlamadaActual() {
		return this.idTipoLlamadaActual;
	}

	public void setidTipoLlamadaActual(Long idTipoLlamadaActual) {
		this.idTipoLlamadaActual = idTipoLlamadaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoLlamada gettipollamada() {
		return this.tipollamada;
	}

	public void settipollamada(TipoLlamada tipollamada) {
		this.tipollamada = tipollamada;
	}
	
	public TipoLlamada gettipollamadaAux() {
		return this.tipollamadaAux;
	}

	public void settipollamadaAux(TipoLlamada tipollamadaAux) {
		this.tipollamadaAux = tipollamadaAux;
	}				
	
	public TipoLlamada gettipollamadaAnterior() {
		return this.tipollamadaAnterior;
	}

	public void settipollamadaAnterior(TipoLlamada tipollamadaAnterior) {
		this.tipollamadaAnterior = tipollamadaAnterior;
	}	
	
	public TipoLlamada gettipollamadaTotales() {
		return this.tipollamadaTotales;
	}

	public void settipollamadaTotales(TipoLlamada tipollamadaTotales) {
		this.tipollamadaTotales = tipollamadaTotales;
	}	
	
	public TipoLlamada gettipollamadaBean() {
		return this.tipollamadaBean;
	}

	public void settipollamadaBean(TipoLlamada tipollamadaBean) {
		this.tipollamadaBean = tipollamadaBean;
	}	
	
	public TipoLlamadaParameterReturnGeneral gettipollamadaReturnGeneral() {
		return this.tipollamadaReturnGeneral;
	}

	public void settipollamadaReturnGeneral(TipoLlamadaParameterReturnGeneral tipollamadaReturnGeneral) {
		this.tipollamadaReturnGeneral = tipollamadaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoLlamadaLogic getTipoLlamadaLogic()	{		
		return tipollamadaLogic;
	}

	public void setTipoLlamadaLogic(TipoLlamadaLogic tipollamadaLogic) {
		this.tipollamadaLogic = tipollamadaLogic;
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
	
	public Boolean getIsEsNuevoTipoLlamada() {
		return isEsNuevoTipoLlamada;
	}

	public void setIsEsNuevoTipoLlamada(Boolean isEsNuevoTipoLlamada) {
		this.isEsNuevoTipoLlamada = isEsNuevoTipoLlamada;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoLlamada() {
		return esParaAccionDesdeFormularioTipoLlamada;
	}
	
	public void setEsParaAccionDesdeFormularioTipoLlamada(Boolean esParaAccionDesdeFormularioTipoLlamada) {
		this.esParaAccionDesdeFormularioTipoLlamada = esParaAccionDesdeFormularioTipoLlamada;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoLlamada() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoLlamadaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLlamada(this.tipollamadaLogic.getTipoLlamadas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoLlamadaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLlamada(this.tipollamadas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipollamadaLogic.setTipoLlamadas(this.tipollamadas);
			tipollamadaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoLlamadaParameterReturnGeneral getTipoLlamadaParameterGeneral() {
		return this.tipollamadaParameterGeneral;
	}
	
	public void setTipoLlamadaParameterGeneral(TipoLlamadaParameterReturnGeneral tipollamadaParameterGeneral) {
		this.tipollamadaParameterGeneral = tipollamadaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoLlamada() {
		return isPermisoTodoTipoLlamada;
	}

	public void setIsPermisoTodoTipoLlamada(Boolean isPermisoTodoTipoLlamada) {
		this.isPermisoTodoTipoLlamada = isPermisoTodoTipoLlamada;
	}

	public Boolean getIsPermisoNuevoTipoLlamada() {
		return isPermisoNuevoTipoLlamada;
	}

	public void setIsPermisoNuevoTipoLlamada(Boolean isPermisoNuevoTipoLlamada) {
		this.isPermisoNuevoTipoLlamada = isPermisoNuevoTipoLlamada;
	}

	public Boolean getIsPermisoActualizarTipoLlamada() {
		return isPermisoActualizarTipoLlamada;
	}

	public void setIsPermisoActualizarTipoLlamada(Boolean isPermisoActualizarTipoLlamada) {
		this.isPermisoActualizarTipoLlamada = isPermisoActualizarTipoLlamada;
	}

	public Boolean getIsPermisoEliminarTipoLlamada() {
		return isPermisoEliminarTipoLlamada;
	}

	public void setIsPermisoEliminarTipoLlamada(Boolean isPermisoEliminarTipoLlamada) {
		this.isPermisoEliminarTipoLlamada = isPermisoEliminarTipoLlamada;
	}

	public Boolean getIsPermisoGuardarCambiosTipoLlamada() {
		return isPermisoGuardarCambiosTipoLlamada;
	}

	public void setIsPermisoGuardarCambiosTipoLlamada(Boolean isPermisoGuardarCambiosTipoLlamada) {
		this.isPermisoGuardarCambiosTipoLlamada = isPermisoGuardarCambiosTipoLlamada;
	}
	
	public Boolean getIsPermisoConsultaTipoLlamada() {
		return isPermisoConsultaTipoLlamada;
	}

	public void setIsPermisoConsultaTipoLlamada(Boolean isPermisoConsultaTipoLlamada) {
		this.isPermisoConsultaTipoLlamada = isPermisoConsultaTipoLlamada;
	}

	public Boolean getIsPermisoBusquedaTipoLlamada() {
		return isPermisoBusquedaTipoLlamada;
	}

	public void setIsPermisoBusquedaTipoLlamada(Boolean isPermisoBusquedaTipoLlamada) {
		this.isPermisoBusquedaTipoLlamada = isPermisoBusquedaTipoLlamada;
	}

	public Boolean getIsPermisoReporteTipoLlamada() {
		return isPermisoReporteTipoLlamada;
	}

	public void setIsPermisoReporteTipoLlamada(Boolean isPermisoReporteTipoLlamada) {
		this.isPermisoReporteTipoLlamada = isPermisoReporteTipoLlamada;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoLlamada() {
		return isPermisoPaginacionMedioTipoLlamada;
	}

	public void setIsPermisoPaginacionMedioTipoLlamada(Boolean isPermisoPaginacionMedioTipoLlamada) {
		this.isPermisoPaginacionMedioTipoLlamada = isPermisoPaginacionMedioTipoLlamada;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoLlamada() {
		return isPermisoPaginacionTodoTipoLlamada;
	}

	public void setIsPermisoPaginacionTodoTipoLlamada(Boolean isPermisoPaginacionTodoTipoLlamada) {
		this.isPermisoPaginacionTodoTipoLlamada = isPermisoPaginacionTodoTipoLlamada;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoLlamada() {
		return isPermisoPaginacionAltoTipoLlamada;
	}

	public void setIsPermisoPaginacionAltoTipoLlamada(Boolean isPermisoPaginacionAltoTipoLlamada) {
		this.isPermisoPaginacionAltoTipoLlamada = isPermisoPaginacionAltoTipoLlamada;
	}
	
	public Boolean getIsPermisoCopiarTipoLlamada() {
		return isPermisoCopiarTipoLlamada;
	}

	public void setIsPermisoCopiarTipoLlamada(Boolean isPermisoCopiarTipoLlamada) {
		this.isPermisoCopiarTipoLlamada = isPermisoCopiarTipoLlamada;
	}
	
	public Boolean getIsPermisoVerFormTipoLlamada() {
		return isPermisoVerFormTipoLlamada;
	}

	public void setIsPermisoVerFormTipoLlamada(Boolean isPermisoVerFormTipoLlamada) {
		this.isPermisoVerFormTipoLlamada = isPermisoVerFormTipoLlamada;
	}
	
	public Boolean getIsPermisoDuplicarTipoLlamada() {
		return isPermisoDuplicarTipoLlamada;
	}

	public void setIsPermisoDuplicarTipoLlamada(Boolean isPermisoDuplicarTipoLlamada) {
		this.isPermisoDuplicarTipoLlamada = isPermisoDuplicarTipoLlamada;
	}
	
	public Boolean getIsPermisoOrdenTipoLlamada() {
		return isPermisoOrdenTipoLlamada;
	}

	public void setIsPermisoOrdenTipoLlamada(Boolean isPermisoOrdenTipoLlamada) {
		this.isPermisoOrdenTipoLlamada = isPermisoOrdenTipoLlamada;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoLlamada() {
		return isVisibilidadCeldaNuevoTipoLlamada;
	}

	public void setIsVisibilidadCeldaNuevoTipoLlamada(Boolean isVisibilidadCeldaNuevoTipoLlamada) {
		this.isVisibilidadCeldaNuevoTipoLlamada = isVisibilidadCeldaNuevoTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoLlamada() {
		return isVisibilidadCeldaDuplicarTipoLlamada;
	}

	public void setIsVisibilidadCeldaDuplicarTipoLlamada(Boolean isVisibilidadCeldaDuplicarTipoLlamada) {
		this.isVisibilidadCeldaDuplicarTipoLlamada = isVisibilidadCeldaDuplicarTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoLlamada() {
		return isVisibilidadCeldaCopiarTipoLlamada;
	}

	public void setIsVisibilidadCeldaCopiarTipoLlamada(Boolean isVisibilidadCeldaCopiarTipoLlamada) {
		this.isVisibilidadCeldaCopiarTipoLlamada = isVisibilidadCeldaCopiarTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoLlamada() {
		return isVisibilidadCeldaVerFormTipoLlamada;
	}

	public void setIsVisibilidadCeldaVerFormTipoLlamada(Boolean isVisibilidadCeldaVerFormTipoLlamada) {
		this.isVisibilidadCeldaVerFormTipoLlamada = isVisibilidadCeldaVerFormTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoLlamada() {
		return isVisibilidadCeldaOrdenTipoLlamada;
	}

	public void setIsVisibilidadCeldaOrdenTipoLlamada(Boolean isVisibilidadCeldaOrdenTipoLlamada) {
		this.isVisibilidadCeldaOrdenTipoLlamada = isVisibilidadCeldaOrdenTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoLlamada() {
		return isVisibilidadCeldaNuevoRelacionesTipoLlamada;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoLlamada(Boolean isVisibilidadCeldaNuevoRelacionesTipoLlamada) {
		this.isVisibilidadCeldaNuevoRelacionesTipoLlamada = isVisibilidadCeldaNuevoRelacionesTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoLlamada() {
		return isVisibilidadCeldaModificarTipoLlamada;
	}

	public void setIsVisibilidadCeldaModificarTipoLlamada(Boolean isVisibilidadCeldaModificarTipoLlamada) {
		this.isVisibilidadCeldaModificarTipoLlamada = isVisibilidadCeldaModificarTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoLlamada() {
		return isVisibilidadCeldaActualizarTipoLlamada;
	}

	public void setIsVisibilidadCeldaActualizarTipoLlamada(Boolean isVisibilidadCeldaActualizarTipoLlamada) {
		this.isVisibilidadCeldaActualizarTipoLlamada = isVisibilidadCeldaActualizarTipoLlamada;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoLlamada() {
		return isVisibilidadCeldaEliminarTipoLlamada;
	}

	public void setIsVisibilidadCeldaEliminarTipoLlamada(Boolean isVisibilidadCeldaEliminarTipoLlamada) {
		this.isVisibilidadCeldaEliminarTipoLlamada = isVisibilidadCeldaEliminarTipoLlamada;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoLlamada() {
		return isVisibilidadCeldaCancelarTipoLlamada;
	}

	public void setIsVisibilidadCeldaCancelarTipoLlamada(Boolean isVisibilidadCeldaCancelarTipoLlamada) {
		this.isVisibilidadCeldaCancelarTipoLlamada = isVisibilidadCeldaCancelarTipoLlamada;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoLlamada() {
		return isVisibilidadCeldaGuardarTipoLlamada;
	}

	public void setIsVisibilidadCeldaGuardarTipoLlamada(Boolean isVisibilidadCeldaGuardarTipoLlamada) {
		this.isVisibilidadCeldaGuardarTipoLlamada = isVisibilidadCeldaGuardarTipoLlamada;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoLlamada() {
		return isVisibilidadCeldaGuardarCambiosTipoLlamada;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoLlamada(Boolean isVisibilidadCeldaGuardarCambiosTipoLlamada) {
		this.isVisibilidadCeldaGuardarCambiosTipoLlamada = isVisibilidadCeldaGuardarCambiosTipoLlamada;
	}
		
	public TipoLlamadaSessionBean gettipollamadaSessionBean() {
		return this.tipollamadaSessionBean;
	}
	
	public void settipollamadaSessionBean(TipoLlamadaSessionBean tipollamadaSessionBean) {
		this.tipollamadaSessionBean=tipollamadaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(TipoLlamada tipollamada)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoLlamada tipollamada,TipoLlamada tipollamadaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoLlamada(tipollamada);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipollamadaAux.setId(tipollamada.getId());
		tipollamadaAux.setVersionRow(tipollamada.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoLlamada();
		
			int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipollamadaValidator.getInvalidValues(this.tipollamada);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipollamadaLogic.setDatosCliente(datosCliente);
			tipollamadaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipollamadaAux=new  TipoLlamada();
				
				tipollamadaAux.setIsNew(true);
				tipollamadaAux.setIsChanged(true);
				
				tipollamadaAux.setTipoLlamadaOriginal(this.tipollamada);
				
				tipollamadaAux.setId(this.tipollamada.getId());	
				tipollamadaAux.setVersionRow(this.tipollamada.getVersionRow());	
				tipollamadaAux.setcodigo(this.tipollamada.getcodigo());	
				tipollamadaAux.setnombre(this.tipollamada.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipollamadaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipollamadaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipollamadaAux,tipollamadaLogic.getTipoLlamadas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipollamadaAux,tipollamadas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipollamadaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipollamadaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipollamadaLogic.saveTipoLlamadas();//WithConnection
						//tipollamadaLogic.getSetVersionRowTipoLlamadas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipollamada,tipollamadaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipollamadaAux=new  TipoLlamada();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipollamadaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipollamadaSessionBean.getEsGuardarRelacionado() && this.tipollamada.getId()>=0)) {
						
					tipollamadaAux.setIsNew(false);
				}
				
				tipollamadaAux.setIsDeleted(false);
			
				tipollamadaAux.setId(this.tipollamada.getId());	
				tipollamadaAux.setVersionRow(this.tipollamada.getVersionRow());	
				tipollamadaAux.setcodigo(this.tipollamada.getcodigo());	
				tipollamadaAux.setnombre(this.tipollamada.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipollamadaAux,tipollamadaLogic.getTipoLlamadas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipollamadaAux,tipollamadas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipollamadaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipollamadaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipollamadaLogic.saveTipoLlamadas();//WithConnection
						//tipollamadaLogic.getSetVersionRowTipoLlamadas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipollamada,tipollamadaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipollamadaAux=new  TipoLlamada();
				
				tipollamadaAux.setIsNew(false);
				tipollamadaAux.setIsChanged(false);
				
				tipollamadaAux.setIsDeleted(true);
				
				tipollamadaAux.setId(this.tipollamada.getId());	
				tipollamadaAux.setVersionRow(this.tipollamada.getVersionRow());	
				tipollamadaAux.setcodigo(this.tipollamada.getcodigo());	
				tipollamadaAux.setnombre(this.tipollamada.getnombre());	
				
				if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipollamadaAux.getId()>=0) {	
						this.tipollamadasEliminados.add(tipollamadaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipollamadaAux,tipollamadaLogic.getTipoLlamadas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipollamadaAux,tipollamadas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipollamadaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipollamadaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipollamadaLogic.saveTipoLlamadas();//WithConnection
						//tipollamadaLogic.getSetVersionRowTipoLlamadas();//WithConnection
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
					this.tipollamadaLogic.getTipoLlamadas().addAll(this.tipollamadasEliminados);
					
					tipollamadaLogic.saveTipoLlamadas();//WithConnection
					//tipollamadaLogic.getSetVersionRowTipoLlamadas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipollamadasEliminados= new ArrayList<TipoLlamada>();		
			}
			
			if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Llamada GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipollamada=tipollamadaAux;
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
      		//this.finishProcessTipoLlamada();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoLlamada tipollamadaLocal) throws Exception {
		
		if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoLlamada tipollamadaLocal) throws Exception {	
		if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoLlamadaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipollamadaValidator.getInvalidValues(this.tipollamada);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoLlamada tipollamada,List<TipoLlamada> tipollamadas) throws Exception {
		try	{		
			TipoLlamadaConstantesFunciones.actualizarLista(tipollamada,tipollamadas,this.tipollamadaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoLlamada tipollamada,List<TipoLlamada> tipollamadas) throws Exception {
		try	{			
			TipoLlamadaConstantesFunciones.actualizarSelectedLista(tipollamada,tipollamadas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoLlamada> tipollamadasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipollamadasLocal=this.tipollamadaLogic.getTipoLlamadas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipollamadasLocal=this.tipollamadas;
			}
			//ARCHITECTURE
		
			for(TipoLlamada tipollamadaLocal:tipollamadasLocal) {
				if(this.permiteMantenimiento(tipollamadaLocal) && tipollamadaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoLlamadaConstantesFunciones.getTipoLlamadaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoLlamadaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLlamada.jLabelcodigoTipoLlamada,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLlamadaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLlamada.jLabelnombreTipoLlamada,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLlamada.jLabelcodigoTipoLlamada,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLlamada.jLabelnombreTipoLlamada,"");
		
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
		this.iIdNuevoTipoLlamada--;	
		
		
		this.tipollamadaAux=new TipoLlamada();
		
		this.tipollamadaAux.setId(this.iIdNuevoTipoLlamada);
		this.tipollamadaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipollamadaLogic.getTipoLlamadas().add(this.tipollamadaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipollamadas.add(this.tipollamadaAux);
		}
		//ARCHITECTURE
		
		this.tipollamada=this.tipollamadaAux;
		
		if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoLlamada(this.tipollamada);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLlamada(this.tipollamada);
		}
				
		//this.setDefaultControlesTipoLlamada();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoLlamada();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoLlamada();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLlamada();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLlamada(this.tipollamadaBean,this.tipollamada,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoLlamadaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
			classes=TipoLlamadaConstantesFunciones.getClassesRelationshipsOfTipoLlamada(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipollamadaReturnGeneral=tipollamadaLogic.procesarEventosTipoLlamadasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipollamadaLogic.getTipoLlamadas(),this.tipollamada,this.tipollamadaParameterGeneral,this.isEsNuevoTipoLlamada,classes);//this.tipollamadaLogic.getTipoLlamada()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoLlamada(this.tipollamadaReturnGeneral,this.tipollamadaBean,false);
		
		if(this.tipollamadaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada());
		}
		
		if(this.tipollamadaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada(),classes);//this.tipollamadaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoLlamada();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoLlamada();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoLlamada(false);
						
			if(tipollamadaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLlamada();
			}
			
			this.actualizarVisualTableDatosTipoLlamada();
			
			this.jTableDatosTipoLlamada.setRowSelectionInterval(this.getIndiceNuevoTipoLlamada(), this.getIndiceNuevoTipoLlamada());
			
			this.seleccionarFilaTablaTipoLlamadaActual();
						
			this.actualizarEstadoCeldasBotonesTipoLlamada("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoLlamada(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setEnabled(isHabilitar && this.tipollamadaConstantesFunciones.activarcodigoTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setEnabled(isHabilitar && this.tipollamadaConstantesFunciones.activarnombreTipoLlamada);	
		
	};
	
	public void setDefaultControlesTipoLlamada() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoLlamada(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipollamadaSessionBean.setConGuardarRelaciones(true);			
			this.tipollamadaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.setVisible(true);
			
					
		} else {
			//this.tipollamadaSessionBean.setConGuardarRelaciones(false);			
			this.tipollamadaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoLlamada() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
				if(tipollamadaAux.getId().equals(this.iIdNuevoTipoLlamada)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLlamada tipollamadaAux:this.tipollamadas) {
				if(tipollamadaAux.getId().equals(this.iIdNuevoTipoLlamada)) {
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
	
	public int getIndiceActualTipoLlamada(TipoLlamada tipollamada,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
				if(tipollamadaAux.getId().equals(tipollamada.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLlamada tipollamadaAux:this.tipollamadas) {
				if(tipollamadaAux.getId().equals(tipollamada.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoLlamada(TipoLlamada tipollamadaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
				if(tipollamadaAux.getTipoLlamadaOriginal().getId().equals(tipollamadaOriginal.getId())) {
					existe=true;
					tipollamadaOriginal.setId(tipollamadaAux.getId());
					tipollamadaOriginal.setVersionRow(tipollamadaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLlamada tipollamadaAux:this.tipollamadas) {
				if(tipollamadaAux.getTipoLlamadaOriginal().getId().equals(tipollamadaOriginal.getId())) {
					existe=true;
					tipollamadaOriginal.setId(tipollamadaAux.getId());
					tipollamadaOriginal.setVersionRow(tipollamadaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoLlamada(Boolean esParaCancelar) throws Exception {
		tipollamadasAux=new ArrayList<TipoLlamada>();
		tipollamadaAux=new TipoLlamada();
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
					if(tipollamadaAux.getId()<0) {
						tipollamadasAux.add(tipollamadaAux);
					}		
				}
				this.iIdNuevoTipoLlamada=0L;
				this.tipollamadaLogic.getTipoLlamadas().removeAll(tipollamadasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLlamada tipollamadaAux:this.tipollamadas) {
					if(tipollamadaAux.getId()<0) {
						tipollamadasAux.add(tipollamadaAux);
					}		
				}
				this.iIdNuevoTipoLlamada=0L;
				this.tipollamadas.removeAll(tipollamadasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoLlamada 
					&& this.tipollamadaLogic.getTipoLlamadas().size()>0
					) {
					tipollamadaAux=this.tipollamadaLogic.getTipoLlamadas().get(this.tipollamadaLogic.getTipoLlamadas().size() - 1);
				
					if(tipollamadaAux.getId()<0) {
						this.tipollamadaLogic.getTipoLlamadas().remove(tipollamadaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoLlamada && this.tipollamadas.size()>0) {
					tipollamadaAux=this.tipollamadas.get(this.tipollamadas.size() - 1);
				
					if(tipollamadaAux.getId()<0) {
						this.tipollamadas.remove(tipollamadaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoLlamada(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipollamada.getId()<0) {
				this.tipollamadaLogic.getTipoLlamadas().remove(this.tipollamada);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipollamada.getId()<0) {
				this.tipollamadas.remove(this.tipollamada);
			}
		}			
	}
	
	public void setEstadosInicialesTipoLlamada(List<TipoLlamada> tipollamadasAux) throws Exception {
		TipoLlamadaConstantesFunciones.setEstadosInicialesTipoLlamada(tipollamadasAux);
	}
	
	public void setEstadosInicialesTipoLlamada(TipoLlamada tipollamadaAux) throws Exception {
		TipoLlamadaConstantesFunciones.setEstadosInicialesTipoLlamada(tipollamadaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoLlamadaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoLlamadaActual()) {
				if(!this.isEsNuevoTipoLlamada) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoLlamada=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoLlamadaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Llamada ?", "MANTENIMIENTO DE Tipo Llamada", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoLlamada tipollamada) throws Exception {
		TipoLlamadaConstantesFunciones.seleccionarAsignar(this.tipollamada,tipollamada);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoLlamada=this.isPermisoActualizarOriginalTipoLlamada;
			
			
			this.seleccionarAsignar(tipollamada);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLlamadaConstantesFunciones.quitarEspaciosTipoLlamada(this.tipollamada,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoLlamada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipollamadaSessionBean.setsFuncionBusquedaRapida(this.tipollamadaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoLlamada) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoLlamada(esParaCancelar);				
				this.cancelarNuevoTipoLlamada(esParaCancelar);								
			}
			
			this.tipollamada=new TipoLlamada();
			
			this.inicializarTipoLlamada();
			
			this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoLlamada() throws Exception {
		try {
			TipoLlamadaConstantesFunciones.inicializarTipoLlamada(this.tipollamada);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipollamadaLogic.getTipoLlamadas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoLlamadas(String sAccionBusqueda,List<TipoLlamada> tipollamadasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoLlamada"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoLlamadaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoLlamadaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoLlamada"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Llamadas");		
		parameters.put("busquedapor", TipoLlamadaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoLlamada=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoLlamadaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoLlamadaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoLlamada=new JRBeanArrayDataSource(TipoLlamadaJInternalFrame.TraerTipoLlamadaBeans(tipollamadasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoLlamada);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoLlamadaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoLlamadaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoLlamadaBean.TraerTipoLlamadaBeans(tipollamadasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoLlamadaActionPerformed(null);
					//this.generarExcelReporteTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoLlamadas(sAccionBusqueda,sTipoArchivoReporte,tipollamadasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoLlamadas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLlamada> tipollamadasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLlamadas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLlamada("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoLlamada tipollamada : tipollamadasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoLlamadaConstantesFunciones.generarExcelReporteDataTipoLlamada("NORMAL",row,workbook,tipollamada,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoLlamada(String sTipo,Row row,Workbook workbook) {
		
		TipoLlamadaConstantesFunciones.generarExcelReporteHeaderTipoLlamada(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoLlamadas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLlamada> tipollamadasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLlamadas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoLlamada tipollamada : tipollamadasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoLlamadaConstantesFunciones.getTipoLlamadaDescripcion(tipollamada));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLlamadaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipollamada.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLlamadaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipollamada.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoLlamadas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLlamada> tipollamadasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoLlamada> tipollamadasRespaldo=null;
		
		classes=TipoLlamadaConstantesFunciones.getClassesRelationshipsOfTipoLlamada(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipollamadaLogic.setDatosCliente(this.datosCliente);
		this.tipollamadaLogic.setDatosDeep(this.datosDeep);
		this.tipollamadaLogic.setIsConDeep(true);
		
		tipollamadasRespaldo=this.tipollamadaLogic.getTipoLlamadas();
		
		this.tipollamadaLogic.setTipoLlamadas(tipollamadasParaReportes);	
		this.tipollamadaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipollamadasParaReportes=this.tipollamadaLogic.getTipoLlamadas();
		this.tipollamadaLogic.setTipoLlamadas(tipollamadasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLlamadas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLlamada("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoLlamada tipollamada : tipollamadasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoLlamada("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoLlamadaConstantesFunciones.generarExcelReporteDataTipoLlamada("NORMAL",row,workbook,tipollamada,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoLlamadaConstantesFunciones.getTipoLlamadaDescripcion(tipollamada));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLlamada.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoLlamada() throws Exception {		
		this.startProcessTipoLlamada(true);
	}
	
	public void startProcessTipoLlamada(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoLlamada, this.jScrollPanelDatosTipoLlamada,this.jPanelPaginacionTipoLlamada, this.jScrollPanelDatosEdicionTipoLlamada, this.jPanelAccionesTipoLlamada,this.jPanelAccionesFormularioTipoLlamada,this.jmenuBarTipoLlamada,this.jmenuBarDetalleTipoLlamada,this.jTtoolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLlamada=null; 
		
		final JPanel jPanelParametrosReportesTipoLlamada=this.jPanelParametrosReportesTipoLlamada;
		//final JScrollPane jScrollPanelDatosTipoLlamada=this.jScrollPanelDatosTipoLlamada;
		final JTable jTableDatosTipoLlamada=this.jTableDatosTipoLlamada;		
		final JPanel jPanelPaginacionTipoLlamada=this.jPanelPaginacionTipoLlamada;
		//final JScrollPane jScrollPanelDatosEdicionTipoLlamada=this.jScrollPanelDatosEdicionTipoLlamada;
		final JPanel jPanelAccionesTipoLlamada=this.jPanelAccionesTipoLlamada;
		
		JPanel jPanelCamposAuxiliarTipoLlamada=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoLlamada=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			jPanelCamposAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jPanelCamposTipoLlamada;
			jPanelAccionesFormularioAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jPanelAccionesFormularioTipoLlamada;
		}
		
		final JPanel jPanelCamposTipoLlamada=jPanelCamposAuxiliarTipoLlamada;
		final JPanel jPanelAccionesFormularioTipoLlamada=jPanelAccionesFormularioAuxiliarTipoLlamada;
		
		
		final JMenuBar jmenuBarTipoLlamada=this.jmenuBarTipoLlamada;
		final JToolBar jTtoolBarTipoLlamada=this.jTtoolBarTipoLlamada;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoLlamada=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLlamada=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			jmenuBarDetalleAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jmenuBarDetalleTipoLlamada;
			jTtoolBarDetalleAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jTtoolBarDetalleTipoLlamada;
		}
		
		final JMenuBar jmenuBarDetalleTipoLlamada=jmenuBarDetalleAuxiliarTipoLlamada;
		final JToolBar jTtoolBarDetalleTipoLlamada=jTtoolBarDetalleAuxiliarTipoLlamada;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLlamada;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLlamada;
			processRunnable.jTableDatos=jTableDatosTipoLlamada;
			processRunnable.jPanelCampos=jPanelCamposTipoLlamada;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLlamada;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLlamada;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLlamada;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLlamada;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLlamada;
			processRunnable.jTtoolBar=jTtoolBarTipoLlamada;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLlamada;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLlamada ,jPanelParametrosReportesTipoLlamada,jTableDatosTipoLlamada, /*jScrollPanelDatosTipoLlamada,*/jPanelCamposTipoLlamada,jPanelPaginacionTipoLlamada, /*jScrollPanelDatosEdicionTipoLlamada,*/ jPanelAccionesTipoLlamada,jPanelAccionesFormularioTipoLlamada,jmenuBarTipoLlamada,jmenuBarDetalleTipoLlamada,jTtoolBarTipoLlamada,jTtoolBarDetalleTipoLlamada);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoLlamada, jScrollPanelDatosTipoLlamada,jPanelPaginacionTipoLlamada, jScrollPanelDatosEdicionTipoLlamada, jPanelAccionesTipoLlamada,jPanelAccionesFormularioTipoLlamada,jmenuBarTipoLlamada,jmenuBarDetalleTipoLlamada,jTtoolBarTipoLlamada,jTtoolBarDetalleTipoLlamada);
						
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
	
	public void finishProcessTipoLlamada() {// throws Exception 
		this.finishProcessTipoLlamada(true);
	}
	
	public void finishProcessTipoLlamada(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoLlamada, this.jScrollPanelDatosTipoLlamada,this.jPanelPaginacionTipoLlamada, this.jScrollPanelDatosEdicionTipoLlamada, this.jPanelAccionesTipoLlamada,this.jPanelAccionesFormularioTipoLlamada,this.jmenuBarTipoLlamada,this.jmenuBarDetalleTipoLlamada,this.jTtoolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLlamada=null; 
		
		final JPanel jPanelParametrosReportesTipoLlamada=this.jPanelParametrosReportesTipoLlamada;
		//final JScrollPane jScrollPanelDatosTipoLlamada=this.jScrollPanelDatosTipoLlamada;
		final JTable jTableDatosTipoLlamada=this.jTableDatosTipoLlamada;		
		final JPanel jPanelPaginacionTipoLlamada=this.jPanelPaginacionTipoLlamada;
		//final JScrollPane jScrollPanelDatosEdicionTipoLlamada=this.jScrollPanelDatosEdicionTipoLlamada;
		final JPanel jPanelAccionesTipoLlamada=this.jPanelAccionesTipoLlamada;
		
		JPanel jPanelCamposAuxiliarTipoLlamada=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoLlamada=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			jPanelCamposAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jPanelCamposTipoLlamada;
			jPanelAccionesFormularioAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jPanelAccionesFormularioTipoLlamada;
		}
		
		final JPanel jPanelCamposTipoLlamada=jPanelCamposAuxiliarTipoLlamada;
		final JPanel jPanelAccionesFormularioTipoLlamada=jPanelAccionesFormularioAuxiliarTipoLlamada;
		
		
		final JMenuBar jmenuBarTipoLlamada=this.jmenuBarTipoLlamada;		
		final JToolBar jTtoolBarTipoLlamada=this.jTtoolBarTipoLlamada;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoLlamada=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLlamada=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			jmenuBarDetalleAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jmenuBarDetalleTipoLlamada;
			jTtoolBarDetalleAuxiliarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jTtoolBarDetalleTipoLlamada;		
		}
		
		final JMenuBar jmenuBarDetalleTipoLlamada=jmenuBarDetalleAuxiliarTipoLlamada;
		final JToolBar jTtoolBarDetalleTipoLlamada=jTtoolBarDetalleAuxiliarTipoLlamada;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLlamada;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLlamada;
			processRunnable.jTableDatos=jTableDatosTipoLlamada;
			processRunnable.jPanelCampos=jPanelCamposTipoLlamada;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLlamada;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLlamada;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLlamada;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLlamada;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLlamada;
			processRunnable.jTtoolBar=jTtoolBarTipoLlamada;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLlamada;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoLlamada ,jPanelParametrosReportesTipoLlamada, jTableDatosTipoLlamada,/*jScrollPanelDatosTipoLlamada,*/jPanelCamposTipoLlamada,jPanelPaginacionTipoLlamada, /*jScrollPanelDatosEdicionTipoLlamada,*/ jPanelAccionesTipoLlamada,jPanelAccionesFormularioTipoLlamada,jmenuBarTipoLlamada,jmenuBarDetalleTipoLlamada,jTtoolBarTipoLlamada,jTtoolBarDetalleTipoLlamada));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoLlamada(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoLlamada(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoLlamada(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoLlamada(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoLlamada,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoLlamada,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoLlamada(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoLlamada,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoLlamada,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipollamadaConstantesFunciones.getsFinalQueryTipoLlamada();
		String  finalQueryPaginacionTodos=this.tipollamadaConstantesFunciones.getsFinalQueryTipoLlamada();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoLlamadaConstantesFunciones.getArrayColumnasGlobalesNoTipoLlamada(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoLlamadaConstantesFunciones.getArrayColumnasGlobalesTipoLlamada(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoLlamadaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipollamadasEliminados= new ArrayList<TipoLlamada>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoLlamada();
		
				///*TipoLlamadaSessionBean*/this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
			
			if(this.tipollamadaSessionBean==null) {
				this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
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
					this.iNumeroPaginacion=TipoLlamadaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoLlamadaConstantesFunciones.getClassesForeignKeysOfTipoLlamada(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipollamada."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipollamadasAux= new ArrayList<TipoLlamada>();
			
				
			tipollamadaLogic.setDatosCliente(this.datosCliente);
			tipollamadaLogic.setDatosDeep(this.datosDeep);
			tipollamadaLogic.setIsConDeep(true);
			
			
			tipollamadaLogic.getTipoLlamadaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipollamadaLogic.getTodosTipoLlamadas(finalQueryGlobal,pagination);
					
					//tipollamadaLogic.getTodosTipoLlamadasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipollamadaLogic.getTipoLlamadas()==null|| tipollamadaLogic.getTipoLlamadas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipollamadasAux= new ArrayList<TipoLlamada>();
							tipollamadasAux.addAll(tipollamadaLogic.getTipoLlamadas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipollamadasAux= new ArrayList<TipoLlamada>();
							tipollamadasAux.addAll(tipollamadas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipollamadaLogic.getTodosTipoLlamadas(finalQueryGlobal+"",this.pagination);												
							
							//tipollamadaLogic.getTodosTipoLlamadasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoLlamadas("Todos",tipollamadaLogic.getTipoLlamadas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipollamadaLogic.setTipoLlamadas(new ArrayList<TipoLlamada>());					
							tipollamadaLogic.getTipoLlamadas().addAll(tipollamadasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipollamadas=new ArrayList<TipoLlamada>();
							tipollamadas.addAll(tipollamadasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoLlamada=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoLlamada=this.idActual;
				
				} else if(this.idTipoLlamadaActual!=null && this.idTipoLlamadaActual!=0L) {
					idTipoLlamada=idTipoLlamadaActual;
				}
				
					
				this.sDetalleReporte=TipoLlamadaConstantesFunciones.getDetalleIndicePorId(idTipoLlamada);
				
				this.tipollamadas=new ArrayList<TipoLlamada>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipollamadaLogic.getEntity(idTipoLlamada);
					
					//tipollamadaLogic.getEntityWithConnection(idTipoLlamada);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipollamadaLogic.setTipoLlamadas(new ArrayList<TipoLlamada>());
					tipollamadaLogic.getTipoLlamadas().add(tipollamadaLogic.getTipoLlamada());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipollamadas=new ArrayList<TipoLlamada>();
					this.tipollamadas.add(tipollamada);
				}
				
				if(tipollamadaLogic.getTipoLlamada()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoLlamada();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoLlamada();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipollamadaLogic.getTipoLlamadas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipollamadas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipollamadaLogic.getTipoLlamadas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipollamadas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoLlamada tipollamada) {
		Boolean permite=true;
		
		if(this.tipollamada.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoLlamadaConstantesFunciones.getOrderByListaTipoLlamada();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoLlamadaConstantesFunciones.getOrderByListaTipoLlamada();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLlamada tipollamada:tipollamadaLogic.getTipoLlamadas()) {
				if(tipollamada.getsType().equals(Constantes2.S_TOTALES)) {
					tipollamadaTotales=tipollamada;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLlamada tipollamada:this.tipollamadas) {
				if(tipollamada.getsType().equals(Constantes2.S_TOTALES)) {
					tipollamadaTotales=tipollamada;
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
			this.tipollamadaAux=new TipoLlamada();
			this.tipollamadaAux.setsType(Constantes2.S_TOTALES);
			this.tipollamadaAux.setIsNew(false);
			this.tipollamadaAux.setIsChanged(false);
			this.tipollamadaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoLlamadaConstantesFunciones.TotalizarValoresFilaTipoLlamada(this.tipollamadaLogic.getTipoLlamadas(),this.tipollamadaAux);
				
				this.tipollamadaLogic.getTipoLlamadas().add(this.tipollamadaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoLlamadaConstantesFunciones.TotalizarValoresFilaTipoLlamada(this.tipollamadas,this.tipollamadaAux);
				
				this.tipollamadas.add(this.tipollamadaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipollamadaTotales=new TipoLlamada();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipollamadaLogic.getTipoLlamadas().remove(tipollamadaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipollamadas.remove(tipollamadaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipollamadaTotales=new TipoLlamada();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLlamada tipollamada:tipollamadaLogic.getTipoLlamadas()) {
				if(tipollamada.getsType().equals(Constantes2.S_TOTALES)) {
					tipollamadaTotales=tipollamada;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLlamadaConstantesFunciones.TotalizarValoresFilaTipoLlamada(this.tipollamadaLogic.getTipoLlamadas(),tipollamadaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLlamada tipollamada:this.tipollamadas) {
				if(tipollamada.getsType().equals(Constantes2.S_TOTALES)) {
					tipollamadaTotales=tipollamada;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLlamadaConstantesFunciones.TotalizarValoresFilaTipoLlamada(this.tipollamadas,tipollamadaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoLlamada() {
		this.isPermisoTodoTipoLlamada=false;
		this.isPermisoNuevoTipoLlamada=false;
		this.isPermisoActualizarTipoLlamada=false;
		this.isPermisoActualizarOriginalTipoLlamada=false;
		this.isPermisoEliminarTipoLlamada=false;
		this.isPermisoGuardarCambiosTipoLlamada=false;
		this.isPermisoConsultaTipoLlamada=false;
		this.isPermisoBusquedaTipoLlamada=false;
		this.isPermisoReporteTipoLlamada=false;		
		this.isPermisoOrdenTipoLlamada=false;		
		this.isPermisoPaginacionMedioTipoLlamada=false;		
		this.isPermisoPaginacionAltoTipoLlamada=false;
		this.isPermisoPaginacionTodoTipoLlamada=false;
		this.isPermisoCopiarTipoLlamada=false;		
		this.isPermisoVerFormTipoLlamada=false;		
		this.isPermisoDuplicarTipoLlamada=false;		
		this.isPermisoOrdenTipoLlamada=false;		
	}
	
	public void setPermisosUsuarioTipoLlamada(Boolean isPermiso) {
		this.isPermisoTodoTipoLlamada=isPermiso;
		this.isPermisoNuevoTipoLlamada=isPermiso;
		this.isPermisoActualizarTipoLlamada=isPermiso;
		this.isPermisoActualizarOriginalTipoLlamada=isPermiso;
		this.isPermisoEliminarTipoLlamada=isPermiso;
		this.isPermisoGuardarCambiosTipoLlamada=isPermiso;
		this.isPermisoConsultaTipoLlamada=isPermiso;
		this.isPermisoBusquedaTipoLlamada=isPermiso;
		this.isPermisoReporteTipoLlamada=isPermiso;
		this.isPermisoOrdenTipoLlamada=isPermiso;		
		this.isPermisoPaginacionMedioTipoLlamada=isPermiso;		
		this.isPermisoPaginacionAltoTipoLlamada=isPermiso;		
		this.isPermisoPaginacionTodoTipoLlamada=isPermiso;		
		this.isPermisoCopiarTipoLlamada=isPermiso;		
		this.isPermisoVerFormTipoLlamada=isPermiso;		
		this.isPermisoDuplicarTipoLlamada=isPermiso;
		this.isPermisoOrdenTipoLlamada=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoLlamada(Boolean isPermiso) {
		//this.isPermisoTodoTipoLlamada=isPermiso;
		this.isPermisoNuevoTipoLlamada=isPermiso;
		this.isPermisoActualizarTipoLlamada=isPermiso;
		this.isPermisoActualizarOriginalTipoLlamada=isPermiso;
		this.isPermisoEliminarTipoLlamada=isPermiso;
		this.isPermisoGuardarCambiosTipoLlamada=isPermiso;
		//this.isPermisoConsultaTipoLlamada=isPermiso;
		//this.isPermisoBusquedaTipoLlamada=isPermiso;
		//this.isPermisoReporteTipoLlamada=isPermiso;
		//this.isPermisoOrdenTipoLlamada=isPermiso;		
		//this.isPermisoPaginacionMedioTipoLlamada=isPermiso;		
		//this.isPermisoPaginacionAltoTipoLlamada=isPermiso;		
		//this.isPermisoPaginacionTodoTipoLlamada=isPermiso;		
		//this.isPermisoCopiarTipoLlamada=isPermiso;		
		//this.isPermisoDuplicarTipoLlamada=isPermiso;
		//this.isPermisoOrdenTipoLlamada=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoLlamadaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoLlamadaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoLlamada(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoLlamadaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoLlamadaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoLlamadaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoLlamadaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoLlamada() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoLlamadaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoLlamadaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoLlamada=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoLlamada=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoLlamada=this.isPermisoActualizarTipoLlamada;
			this.isPermisoEliminarTipoLlamada=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoLlamada=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoLlamada=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoLlamada=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoLlamada=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoLlamada=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLlamada=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoLlamada=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoLlamada=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoLlamada=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoLlamada=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoLlamada=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoLlamada=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLlamada=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoLlamada.setToolTipText(this.jTableDatosTipoLlamada.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoLlamada(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoLlamada(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoLlamadaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoLlamadaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoLlamada() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoLlamadaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoLlamadaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoLlamadaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoLlamadaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoLlamadaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoLlamada()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoLlamada()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoLlamada(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoLlamada()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLlamada();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoLlamada(TipoLlamada tipollamada)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoLlamada(TipoLlamada tipollamada,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoLlamada()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLlamada()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoLlamada()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoLlamada()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoLlamada()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoLlamada()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoLlamada(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoLlamada()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoLlamadaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoLlamadaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoLlamadaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipollamadaSessionBean=new TipoLlamadaSessionBean(); 
		this.tipollamadaConstantesFunciones=new TipoLlamadaConstantesFunciones(); 
		this.tipollamadaBean=new TipoLlamada();//(this.tipollamadaConstantesFunciones); 		
		this.tipollamadaReturnGeneral=new TipoLlamadaParameterReturnGeneral(); 
		
		this.tipollamadaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipollamadaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoLlamadaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoLlamadaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoLlamadaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoLlamada(true);
			
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
			
			this.tipollamadaConstantesFunciones=new TipoLlamadaConstantesFunciones(); 
			this.tipollamadaBean=new TipoLlamada();//this.tipollamadaConstantesFunciones); 			
			this.tipollamadaReturnGeneral=new TipoLlamadaParameterReturnGeneral(); 
		
			TipoLlamadaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Llamada Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipollamada=new TipoLlamada();
			this.tipollamadas = new ArrayList<TipoLlamada>();
			this.tipollamadasAux = new ArrayList<TipoLlamada>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic=new TipoLlamadaLogic();
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipollamadaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipollamadaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoLlamada);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLlamada);	
					}
					
					if(this.jInternalFrameImportacionTipoLlamada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLlamada);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoLlamada!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoLlamada);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLlamada);
				this.jInternalFrameDetalleFormTipoLlamada.setVisible(false);
				this.jInternalFrameDetalleFormTipoLlamada.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLlamada);
					this.jInternalFrameReporteDinamicoTipoLlamada.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoLlamada.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoLlamada!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoLlamada);
					this.jInternalFrameImportacionTipoLlamada.setVisible(false);
					this.jInternalFrameImportacionTipoLlamada.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoLlamada!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoLlamada);
					this.jInternalFrameOrderByTipoLlamada.setVisible(false);
					this.jInternalFrameOrderByTipoLlamada.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoLlamadaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoLlamadaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipollamadaReturnGeneral=new TipoLlamadaParameterReturnGeneral();
			
			this.tipollamadaParameterGeneral=new TipoLlamadaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipollamadaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoLlamadaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLlamadaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipollamadaSessionBean.getEsGuardarRelacionado(),this.tipollamadaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLlamadaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipollamadaSessionBean.getEsGuardarRelacionado(),this.tipollamadaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaDuplicarTipoLlamada=true;
			this.isVisibilidadCeldaCopiarTipoLlamada=true;
			this.isVisibilidadCeldaVerFormTipoLlamada=true;
			this.isVisibilidadCeldaOrdenTipoLlamada=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=false;
			this.isVisibilidadCeldaGuardarTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoLlamada();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoLlamada(false);
			
			this.setPermisosUsuarioTipoLlamada();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipollamadaSessionBean.getEsGuardarRelacionado() && this.tipollamadaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoLlamadaClasesRelacionadas();
			}
			
			if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoLlamadaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoLlamada();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoLlamada();
			}
			
			if(!this.isPermisoBusquedaTipoLlamada) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoLlamada,this.isPermisoPaginacionMedioTipoLlamada,this.isPermisoPaginacionTodoTipoLlamada);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoLlamadaConstantesFunciones.getTiposSeleccionarTipoLlamada());
				
				this.tiposColumnasSelect=TipoLlamadaConstantesFunciones.getTiposSeleccionarTipoLlamada(true);
				
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
			//if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoLlamada();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoLlamada(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoLlamada(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLlamada() ;
			
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
				tipollamadaImplementable= (TipoLlamadaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLlamadaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipollamadaImplementableHome= (TipoLlamadaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLlamadaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipollamadas= new ArrayList<TipoLlamada>();
			this.tipollamadasEliminados= new ArrayList<TipoLlamada>();
						
			this.isEsNuevoTipoLlamada=false;
			this.esParaAccionDesdeFormularioTipoLlamada=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoLlamada(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoLlamada();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoLlamadaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoLlamada("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoLlamada(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoLlamada();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoLlamada();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoLlamada(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoLlamada: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoLlamada() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoLlamada")) {
				iIndex=this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoLlamada();	
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
	
	public void cargarCombosForeignKeyTipoLlamada(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoLlamada(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoLlamada(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoLlamadaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoLlamada();
		
		this.cargarCombosFrameForeignKeyTipoLlamada();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoLlamada();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoLlamada();
		}
	}
	
	
	
	public void jButtonNuevoTipoLlamadaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			
			if(jTableDatosTipoLlamada.getRowCount()>=1) {
				jTableDatosTipoLlamada.removeRowSelectionInterval(0, jTableDatosTipoLlamada.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoLlamada=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoLlamada(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoLlamada(true);			
			//this.tipollamada=new TipoLlamada();
			//this.tipollamada.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLlamada(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLlamada() ;
			
			if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLlamada(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipollamada);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);				
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoLlamada: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoLlamadaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoLlamada.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoLlamada.getSelectedRows().length;			
			}
			
			tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoLlamada--;			
				//TipoLlamada tipollamadaAux= new TipoLlamada();			
				//tipollamadaAux.setId(this.iIdNuevoTipoLlamada);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoLlamada tipollamadaOrigen=new TipoLlamada();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoLlamada tipollamadaOrigen : tipollamadasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipollamadaOrigen =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipollamadaOrigen =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoLlamada();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipollamada.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoLlamada(tipollamadaOrigen,this.tipollamada,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipollamadaLogic.getTipoLlamadas().add(this.tipollamadaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipollamadas.add(this.tipollamadaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoLlamada(false);
				
				this.jTableDatosTipoLlamada.setRowSelectionInterval(this.getIndiceNuevoTipoLlamada(), this.getIndiceNuevoTipoLlamada());
				
				int iLastRow =  this.jTableDatosTipoLlamada.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLlamada.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLlamada.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLlamada(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();									
		
			TipoLlamada tipollamadaOrigen=new TipoLlamada();
			TipoLlamada tipollamadaDestino=new TipoLlamada();
				
			tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoLlamada.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipollamadasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoLlamada.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipollamadaOrigen =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipollamadaOrigen =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipollamadaDestino =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipollamadaDestino =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipollamadaOrigen =tipollamadasSeleccionados.get(0);
				tipollamadaDestino =tipollamadasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoLlamada(tipollamadaOrigen,tipollamadaDestino,true,false);
				
				tipollamadaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipollamadaDestino,tipollamadaLogic.getTipoLlamadas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipollamadaDestino,tipollamadas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoLlamada(false);
				
				//this.jTableDatosTipoLlamada.setRowSelectionInterval(this.getIndiceNuevoTipoLlamada(), this.getIndiceNuevoTipoLlamada());
				
				int iLastRow =  this.jTableDatosTipoLlamada.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLlamada.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLlamada.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLlamada(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoLlamada.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoLlamada.isVisible();
			
			
			this.jPanelParametrosReportesTipoLlamada.setVisible(!isVisible);
			this.jPanelPaginacionTipoLlamada.setVisible(!isVisible);
			this.jPanelAccionesTipoLlamada.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoLlamada();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoLlamada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoLlamada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoLlamada();
			
			this.abrirFrameOrderByTipoLlamada();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoLlamada();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoLlamada(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLlamada);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoLlamada.isMaximum()) {
					this.jInternalFrameDetalleFormTipoLlamada.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoLlamada.setSize(this.jInternalFrameDetalleFormTipoLlamada.iWidthFormulario,this.jInternalFrameDetalleFormTipoLlamada.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoLlamada.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoLlamada.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoLlamada.isMaximum()) {
						this.jInternalFrameDetalleFormTipoLlamada.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoLlamada.jContentPaneDetalleTipoLlamada.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoLlamada.jContentPaneDetalleTipoLlamada.getWidth(),TipoLlamadaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoLlamada.jContentPaneDetalleTipoLlamada.getWidth(),TipoLlamadaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoLlamada.jContentPaneDetalleTipoLlamada.getWidth(),TipoLlamadaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoLlamada.setVisible(true);
	        this.jInternalFrameDetalleFormTipoLlamada.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoLlamada() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoLlamada==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoLlamada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLlamada,false,this);
				} else {
					this.jInternalFrameOrderByTipoLlamada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLlamada,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoLlamada);
				this.jInternalFrameOrderByTipoLlamada.setVisible(false);
				this.jInternalFrameOrderByTipoLlamada.setSelected(false);
				
				this.jInternalFrameOrderByTipoLlamada.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLlamada"));
				
				this.inicializarActualizarBindingTablaOrderByTipoLlamada();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoLlamada() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoLlamada==null) {
				
				this.jInternalFrameImportacionTipoLlamada=new ImportacionJInternalFrame(TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLlamada);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoLlamada);
				this.jInternalFrameImportacionTipoLlamada.setVisible(false);
				this.jInternalFrameImportacionTipoLlamada.setSelected(false);


				this.jInternalFrameImportacionTipoLlamada.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLlamada"));
				this.jInternalFrameImportacionTipoLlamada.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLlamada"));
				this.jInternalFrameImportacionTipoLlamada.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLlamada"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoLlamada() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoLlamada==null) {
				this.jInternalFrameReporteDinamicoTipoLlamada=new ReporteDinamicoJInternalFrame(TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLlamada);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLlamada);
				this.jInternalFrameReporteDinamicoTipoLlamada.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoLlamada.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLlamada"));
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLlamada"));
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLlamada"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLlamada();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoLlamada() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLlamada);
			
	       	this.jInternalFrameDetalleFormTipoLlamada.setVisible(false);
	        this.jInternalFrameDetalleFormTipoLlamada.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoLlamada.dispose();
			//this.jInternalFrameDetalleFormTipoLlamada=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoLlamada() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoLlamada.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoLlamada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoLlamada() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoLlamada.setVisible(true);
	        this.jInternalFrameImportacionTipoLlamada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoLlamada() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoLlamada.setVisible(true);
	        this.jInternalFrameOrderByTipoLlamada.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoLlamada() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoLlamada.setVisible(false);
	        this.jInternalFrameOrderByTipoLlamada.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoLlamada() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoLlamada.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoLlamada.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoLlamada() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoLlamada.setVisible(false);
	        this.jInternalFrameImportacionTipoLlamada.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoLlamada(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoLlamada(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoLlamada(true);
			//this.isEsNuevoTipoLlamada=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoLlamada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLlamada(false) ;
			
			if(tipollamadaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLlamada(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLlamada(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoLlamadaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoLlamada(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoLlamada(true);
			//this.isEsNuevoTipoLlamada=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipollamada.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoLlamada("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoLlamada(false) ;
			
			if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLlamada(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLlamada(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoLlamada(false);
			
			//if(!this.isEsNuevoTipoLlamada) {								
				int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
				
			}
			
			if(this.permiteMantenimiento(this.tipollamada)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoLlamada=true;
					this.inicializarActualizarBindingTablaTipoLlamada(false);
					this.isEsNuevoTipoLlamada=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoLlamada=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoLlamada=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLlamada(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLlamada(false);
				
				this.habilitarDeshabilitarControlesTipoLlamada(false);
			
												
				
				if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoLlamada();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoLlamadaActionPerformed(evt,tipollamadaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoLlamada(this.tipollamada,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoLlamada.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipollamadaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipollamada.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				this.tipollamada.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				this.tipollamada.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipollamada)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoLlamadaModel) this.jTableDatosTipoLlamada.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoLlamada=true;
				this.inicializarActualizarBindingTablaTipoLlamada(false);
				this.isEsNuevoTipoLlamada=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLlamada(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLlamada(false);
				
				this.habilitarDeshabilitarControlesTipoLlamada(false);
				
				
				
				if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoLlamada();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoLlamada.getRowCount()>=1) {
				jTableDatosTipoLlamada.removeRowSelectionInterval(0, jTableDatosTipoLlamada.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoLlamada(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoLlamada(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLlamada(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLlamada(false) ;
			
			this.isEsNuevoTipoLlamada=false;
			
			if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoLlamada();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoLlamada(false);
				
				//SI ES MANUAL
				if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoLlamada();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoLlamada--;			
			//TipoLlamada tipollamadaAux= new TipoLlamada();			
			//tipollamadaAux.setId(this.iIdNuevoTipoLlamada);
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoLlamada();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
			
			this.tipollamada.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipollamadaLogic.getTipoLlamadas().add(this.tipollamadaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipollamadas.add(this.tipollamadaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoLlamada(false);
			
			this.jTableDatosTipoLlamada.setRowSelectionInterval(this.getIndiceNuevoTipoLlamada(), this.getIndiceNuevoTipoLlamada());
			
			int iLastRow =  this.jTableDatosTipoLlamada.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoLlamada.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoLlamada.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoLlamada(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLlamada(false);
			
			//SI ES MANUAL
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLlamada();
			}
			
			//this.abrirFrameTreeTipoLlamada();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo LlamadaS ?", "MANTENIMIENTO DE Tipo Llamada", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoLlamada.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoLlamada();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipollamadaReturnGeneral=tipollamadaLogic.procesarImportacionTipoLlamadasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipollamadaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoLlamadaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoLlamada.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoLlamada.setFileImportacion(this.jInternalFrameImportacionTipoLlamada.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoLlamada.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoLlamada.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoLlamada.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoLlamada.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		

		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoLlamadaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoLlamadaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLlamadaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLlamadaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoLlamada.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoLlamadaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoLlamadaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoLlamadaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoLlamadaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLlamadaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoLlamadaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoLlamadas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoLlamadaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoLlamada tipollamada:tipollamadasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipollamada.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLlamadaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoLlamada tipollamada:tipollamadasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipollamada.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoLlamada(row);				
			//	iRow++;
			//}				
			
			//for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoLlamada(tipollamadaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLlamada(false);
			
			//SI ES MANUAL
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLlamada();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLlamada(false);
			
			//SI ES MANUAL
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLlamada();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoLlamadaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLlamada(false);
			
			//SI ES MANUAL
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLlamada();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipollamadaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoLlamada() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoLlamada.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoLlamada.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoLlamada.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoLlamada.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoLlamada.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoLlamada.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoLlamada.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoLlamada(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoLlamada(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoLlamada(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoLlamada(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoLlamada(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoLlamada(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLlamada(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoLlamada(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoLlamada() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoLlamada();
		
		this.inicializarActualizarBindingBotonesManualTipoLlamada(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLlamada();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLlamada() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLlamada(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLlamada(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoLlamada.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoLlamada.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoLlamada.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionNuevoTipoLlamada.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionSinCerrarTipoLlamada.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionSinMensajeTipoLlamada.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoLlamada.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoLlamada.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoLlamada.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
				this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionNuevoTipoLlamada.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionSinCerrarTipoLlamada.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoLlamada.jCheckBoxPostAccionSinMensajeTipoLlamada.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoLlamada.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoLlamada.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoLlamada.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoLlamada.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoLlamada.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoLlamada.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoLlamada.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoLlamada.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoLlamada.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoLlamada(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLlamada(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoLlamada() throws Exception {
		try	{
			if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLlamada();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLlamada() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLlamada() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoLlamada.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoLlamada.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoLlamada.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoLlamada.addItem(reporte);
			}
			
			
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoLlamada.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoLlamada.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoLlamada.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoLlamada.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoLlamada.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoLlamada.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoLlamada.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLlamada();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLlamada() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
				this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
				this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLlamada.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLlamada.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoLlamada.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLlamada.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLlamada.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoLlamada()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoLlamada(Boolean esInicializar) throws Exception {				
		if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLlamada();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoLlamada() throws Exception {
		this.inicializarActualizarBindingTablaTipoLlamada(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoLlamada() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoLlamadaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamadaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoLlamada(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipollamadaLogic.getTipoLlamadas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipollamadas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoLlamada.setModel(new TipoLlamadaModel(this.tipollamadaLogic.getTipoLlamadas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoLlamada.setModel(new TipoLlamadaModel(this.tipollamadas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoLlamada!=null && this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoLlamada();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoLlamada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,tipollamadaConstantesFunciones.resaltarSeleccionarTipoLlamada,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,tipollamadaConstantesFunciones.resaltarSeleccionarTipoLlamada,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoLlamada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,TipoLlamadaConstantesFunciones.LABEL_ID));

		if(this.tipollamadaConstantesFunciones.mostraridTipoLlamada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLlamadaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipollamadaConstantesFunciones.resaltaridTipoLlamada,this.tipollamadaConstantesFunciones.activaridTipoLlamada,this,true,"idTipoLlamada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipollamadaConstantesFunciones.resaltaridTipoLlamada,this.tipollamadaConstantesFunciones.activaridTipoLlamada,this,true,"idTipoLlamada","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLlamada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,TipoLlamadaConstantesFunciones.LABEL_CODIGO));

		if(this.tipollamadaConstantesFunciones.mostrarcodigoTipoLlamada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLlamadaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipollamadaConstantesFunciones.resaltarcodigoTipoLlamada,this.tipollamadaConstantesFunciones.activarcodigoTipoLlamada,this,true,"codigoTipoLlamada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipollamadaConstantesFunciones.resaltarcodigoTipoLlamada,this.tipollamadaConstantesFunciones.activarcodigoTipoLlamada,this,true,"codigoTipoLlamada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLlamada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,TipoLlamadaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipollamadaConstantesFunciones.mostrarnombreTipoLlamada && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLlamadaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipollamadaConstantesFunciones.resaltarnombreTipoLlamada,this.tipollamadaConstantesFunciones.activarnombreTipoLlamada,this,true,"nombreTipoLlamada","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipollamadaConstantesFunciones.resaltarnombreTipoLlamada,this.tipollamadaConstantesFunciones.activarnombreTipoLlamada,this,true,"nombreTipoLlamada","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLlamadaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLlamada.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLlamada.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipollamadaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoLlamada.addColumn(tableColumn);
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
			
			this.jTableDatosTipoLlamada.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoLlamada.moveColumn(this.jTableDatosTipoLlamada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoLlamada.moveColumn(this.jTableDatosTipoLlamada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoLlamada.moveColumn(this.jTableDatosTipoLlamada.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoLlamada.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoLlamada.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoLlamada,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoLlamada.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoLlamada.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoLlamada.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoLlamada.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoLlamada.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipollamadaLogic.getTipoLlamadas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipollamadas.size()-1;
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
		//this.jTableDatosTipoLlamada.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoLlamada.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoLlamada();
			
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
				
				//this.isEsNuevoTipoLlamada=false;
					
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
				if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoLlamada==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLlamada.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLlamada.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipollamada.getsType().equals("DUPLICADO")
				   || this.tipollamada.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoLlamada=true;
				
				} else {
					this.isEsNuevoTipoLlamada=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipollamada.getId()>=0 && !this.tipollamada.getIsNew()) {						
						this.isEsNuevoTipoLlamada=false;
						
					} else {
						this.isEsNuevoTipoLlamada=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoLlamada(esRelaciones);						
				
				this.seleccionarTipoLlamada(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipollamada.getId()<0) {
					this.isEsNuevoTipoLlamada=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoLlamada(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoLlamada(evt,rowIndex);
				}	
				
				if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoLlamada: " + this.dDif); 
					}
				}								
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoLlamada(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipollamada)) {
					if(this.tipollamada.getId()>0) {
						this.tipollamada.setIsDeleted(true);
						
						this.tipollamadasEliminados.add(this.tipollamada);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipollamadaLogic.getTipoLlamadas().remove(this.tipollamada);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipollamadas.remove(this.tipollamada);				
					}
					
					
					((TipoLlamadaModel) this.jTableDatosTipoLlamada.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLlamada(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoLlamada(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoLlamada) {
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLlamada.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLlamada.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoLlamada(this.tipollamada);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoLlamada("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoLlamada(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLlamada() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLlamada(TipoLlamada tipollamada) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoLlamada(tipollamada,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLlamada(TipoLlamada tipollamada,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoLlamada(tipollamada);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoLlamada(tipollamada,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoLlamada(tipollamada);
	}
	
	public void setVariablesObjetoActualToFormularioTipoLlamada(TipoLlamada tipollamada) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setText(tipollamada.getId().toString());
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setText(tipollamada.getcodigo());
			this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setText(tipollamada.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoLlamada tipollamadaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipollamadaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoLlamada tipollamadaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipollamadaLocal=this.tipollamada;
			} else {
				tipollamadaLocal=this.tipollamadaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipollamadaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoLlamada(tipollamadaLocal,true);
					
					if(tipollamadaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipollamadaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipollamadaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoLlamada(TipoLlamada tipollamada,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLlamada(tipollamada,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(tipollamada);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLlamada(TipoLlamada tipollamada,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLlamada(tipollamada,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLlamada(TipoLlamada tipollamada,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.getText()==null || this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.getText()=="" || this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setText("0");
			}

			if(conColumnasBase) {tipollamada.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLlamadaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLlamada.jLabelIdTipoLlamada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipollamada.setcodigo(this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLlamadaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLlamada.jLabelcodigoTipoLlamada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipollamada.setnombre(this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLlamadaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLlamada.jLabelnombreTipoLlamada,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLlamada(TipoLlamada tipollamadaBean,TipoLlamada tipollamada,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoLlamada(TipoLlamada tipollamadaOrigen,TipoLlamada tipollamada,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipollamadaOrigen.getId()!=null && !tipollamadaOrigen.getId().equals(0L))) {tipollamada.setId(tipollamadaOrigen.getId());}}
			if(conDefault || (!conDefault && tipollamadaOrigen.getcodigo()!=null && !tipollamadaOrigen.getcodigo().equals(""))) {tipollamada.setcodigo(tipollamadaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipollamadaOrigen.getnombre()!=null && !tipollamadaOrigen.getnombre().equals(""))) {tipollamada.setnombre(tipollamadaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLlamada(TipoLlamada tipollamada) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setText(tipollamada.getId().toString());
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setText(tipollamada.getcodigo());
			this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setText(tipollamada.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLlamada(TipoLlamadaBean tipollamadaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setText(tipollamadaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setText(tipollamadaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setText(tipollamadaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoLlamada(TipoLlamadaParameterReturnGeneral tipollamadaReturnGeneral,TipoLlamadaBean tipollamadaBean,Boolean conDefault) throws Exception { 
		try {
			TipoLlamada tipollamadaLocal=new TipoLlamada();
			
			tipollamadaLocal=tipollamadaReturnGeneral.getTipoLlamada();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipollamadaLocal.getId()!=null && !tipollamadaLocal.getId().equals(0L))) {tipollamadaBean.setId(tipollamadaLocal.getId());}}
			if(conDefault || (!conDefault && tipollamadaLocal.getcodigo()!=null && !tipollamadaLocal.getcodigo().equals(""))) {tipollamadaBean.setcodigo(tipollamadaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipollamadaLocal.getnombre()!=null && !tipollamadaLocal.getnombre().equals(""))) {tipollamadaBean.setnombre(tipollamadaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoLlamadaGenerico(Long idTipoLlamadaSeleccionado,JComboBox jComboBoxTipoLlamada,List<TipoLlamada> tipollamadasLocal)throws Exception {
		try {
			TipoLlamada  tipollamadaTemp=null;

			for(TipoLlamada tipollamadaAux:tipollamadasLocal) {
				if(tipollamadaAux.getId()!=null && tipollamadaAux.getId().equals(idTipoLlamadaSeleccionado)) {
					tipollamadaTemp=tipollamadaAux;
					break;
				}
			}

			jComboBoxTipoLlamada.setSelectedItem(tipollamadaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoLlamadaGenerico(JComboBox jComboBoxTipoLlamada,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoLlamada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLlamada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoLlamada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLlamada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLlamada.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoLlamada.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLlamada.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoLlamada.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoLlamada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoLlamada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipollamada=(TipoLlamada) tipollamadaLogic.getTipoLlamadas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipollamada =(TipoLlamada) tipollamadas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoLlamada tipollamadaRow=new TipoLlamada();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipollamadaRow=(TipoLlamada) tipollamadaLogic.getTipoLlamadas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipollamadaRow=(TipoLlamada) tipollamadas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoLlamada(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada));			
			this.jButtonDuplicarTipoLlamada.setVisible((this.isVisibilidadCeldaDuplicarTipoLlamada && this.isPermisoDuplicarTipoLlamada));			
			this.jButtonCopiarTipoLlamada.setVisible((this.isVisibilidadCeldaCopiarTipoLlamada && this.isPermisoCopiarTipoLlamada));
			this.jButtonVerFormTipoLlamada.setVisible((this.isVisibilidadCeldaVerFormTipoLlamada && this.isPermisoVerFormTipoLlamada));
			
			this.jButtonAbrirOrderByTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));			
			
			this.jButtonNuevoRelacionesTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLlamada && this.isPermisoNuevoTipoLlamada));			
			this.jButtonNuevoGuardarCambiosTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarTipoLlamada.setVisible((this.isVisibilidadCeldaModificarTipoLlamada && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.setVisible((this.isVisibilidadCeldaActualizarTipoLlamada && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.setVisible((this.isVisibilidadCeldaEliminarTipoLlamada && this.isPermisoEliminarTipoLlamada));
			this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.setVisible(this.isVisibilidadCeldaCancelarTipoLlamada);							
			this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada));						
			this.jButtonDuplicarToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaDuplicarTipoLlamada && this.isPermisoDuplicarTipoLlamada));						
			this.jButtonCopiarToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaCopiarTipoLlamada && this.isPermisoCopiarTipoLlamada));			
			this.jButtonVerFormToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaVerFormTipoLlamada && this.isPermisoVerFormTipoLlamada));			
			this.jButtonAbrirOrderByToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));
			this.jButtonNuevoRelacionesToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLlamada && this.isPermisoNuevoTipoLlamada));			
			this.jButtonNuevoGuardarCambiosToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));			
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaModificarTipoLlamada && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaActualizarTipoLlamada  && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaEliminarTipoLlamada && this.isPermisoEliminarTipoLlamada));
			this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarToolBarTipoLlamada.setVisible(this.isVisibilidadCeldaCancelarTipoLlamada);				
			this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada));			
			this.jMenuItemDuplicarTipoLlamada.setVisible((this.isVisibilidadCeldaDuplicarTipoLlamada && this.isPermisoDuplicarTipoLlamada));			
			this.jMenuItemCopiarTipoLlamada.setVisible((this.isVisibilidadCeldaCopiarTipoLlamada && this.isPermisoCopiarTipoLlamada));			
			this.jMenuItemVerFormTipoLlamada.setVisible((this.isVisibilidadCeldaVerFormTipoLlamada && this.isPermisoVerFormTipoLlamada));			
			this.jMenuItemAbrirOrderByTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));			
			//this.jMenuItemMostrarOcultarTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));
			this.jMenuItemDetalleAbrirOrderByTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));			
			//this.jMenuItemDetalleMostrarOcultarTipoLlamada.setVisible((this.isVisibilidadCeldaOrdenTipoLlamada && this.isPermisoOrdenTipoLlamada));			
			this.jMenuItemNuevoRelacionesTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLlamada && this.isPermisoNuevoTipoLlamada));			
			this.jMenuItemNuevoGuardarCambiosTipoLlamada.setVisible((this.isVisibilidadCeldaNuevoTipoLlamada && this.isPermisoNuevoTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));									
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemModificarTipoLlamada.setVisible((this.isVisibilidadCeldaModificarTipoLlamada && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemActualizarTipoLlamada.setVisible((this.isVisibilidadCeldaActualizarTipoLlamada && this.isPermisoActualizarTipoLlamada));	
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemEliminarTipoLlamada.setVisible((this.isVisibilidadCeldaEliminarTipoLlamada && this.isPermisoEliminarTipoLlamada));
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemCancelarTipoLlamada.setVisible(this.isVisibilidadCeldaCancelarTipoLlamada);				
			}
			
			this.jMenuItemGuardarCambiosTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));						
			this.jMenuItemGuardarCambiosTablaTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoLlamada=this.jButtonNuevoTipoLlamada.isVisible();
			this.isVisibilidadCeldaDuplicarTipoLlamada=this.jButtonDuplicarTipoLlamada.isVisible();
			this.isVisibilidadCeldaCopiarTipoLlamada=this.jButtonCopiarTipoLlamada.isVisible();
			this.isVisibilidadCeldaVerFormTipoLlamada=this.jButtonVerFormTipoLlamada.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoLlamada=this.jButtonAbrirOrderByTipoLlamada.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=this.jButtonNuevoRelacionesTipoLlamada.isVisible();
			this.isVisibilidadCeldaModificarTipoLlamada=this.jButtonModificarTipoLlamada.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.isVisibilidadCeldaActualizarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.isVisible();
			this.isVisibilidadCeldaEliminarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.isVisible();
			this.isVisibilidadCeldaCancelarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.isVisible();
			this.isVisibilidadCeldaGuardarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=this.jButtonGuardarCambiosTablaTipoLlamada.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoLlamada=this.jButtonNuevoToolBarTipoLlamada.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=this.jButtonNuevoRelacionesToolBarTipoLlamada.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.isVisibilidadCeldaModificarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarToolBarTipoLlamada.isVisible();
			this.isVisibilidadCeldaActualizarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarToolBarTipoLlamada.isVisible();
			this.isVisibilidadCeldaEliminarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarToolBarTipoLlamada.isVisible();
			this.isVisibilidadCeldaCancelarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarToolBarTipoLlamada.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLlamada=this.jButtonGuardarCambiosToolBarTipoLlamada.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=this.jButtonGuardarCambiosTablaToolBarTipoLlamada.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoLlamada=this.jMenuItemNuevoTipoLlamada.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=this.jMenuItemNuevoRelacionesTipoLlamada.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.isVisibilidadCeldaModificarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jMenuItemModificarTipoLlamada.isVisible();
			this.isVisibilidadCeldaActualizarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jMenuItemActualizarTipoLlamada.isVisible();
			this.isVisibilidadCeldaEliminarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jMenuItemEliminarTipoLlamada.isVisible();
			this.isVisibilidadCeldaCancelarTipoLlamada=this.jInternalFrameDetalleFormTipoLlamada.jMenuItemCancelarTipoLlamada.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLlamada=this.jMenuItemGuardarCambiosTipoLlamada.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=this.jMenuItemGuardarCambiosTablaTipoLlamada.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoLlamada(Boolean esInicializar) {
		if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLlamada();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoLlamada(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoLlamada() {
		this.jButtonNuevoTipoLlamada.setVisible(this.isPermisoNuevoTipoLlamada);			
		this.jButtonDuplicarTipoLlamada.setVisible(this.isPermisoDuplicarTipoLlamada);			
		this.jButtonCopiarTipoLlamada.setVisible(this.isPermisoCopiarTipoLlamada);			
		this.jButtonVerFormTipoLlamada.setVisible(this.isPermisoVerFormTipoLlamada);			
		
		this.jButtonAbrirOrderByTipoLlamada.setVisible(this.isPermisoOrdenTipoLlamada);					
		
		this.jButtonNuevoRelacionesTipoLlamada.setVisible(this.isPermisoNuevoTipoLlamada);			
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarTipoLlamada.setVisible(this.isPermisoActualizarTipoLlamada);	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.setVisible(this.isPermisoActualizarTipoLlamada);	
			this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.setVisible(this.isPermisoEliminarTipoLlamada);
			this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.setVisible(this.isVisibilidadCeldaCancelarTipoLlamada);						
			this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.setVisible(this.isPermisoGuardarCambiosTipoLlamada);							
		}
		
		this.jButtonGuardarCambiosTablaTipoLlamada.setVisible(this.isPermisoActualizarTipoLlamada);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLlamada() {
		this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarTipoLlamada.setVisible(this.isPermisoActualizarTipoLlamada);	
		this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.setVisible(this.isPermisoActualizarTipoLlamada);	
		this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.setVisible(this.isPermisoEliminarTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.setVisible(this.isVisibilidadCeldaCancelarTipoLlamada);							
		this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.setVisible((this.isVisibilidadCeldaGuardarTipoLlamada && this.isPermisoGuardarCambiosTipoLlamada));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoLlamada() {
		if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoLlamada();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoLlamada() {
	}
	
	public void jTableDatosTipoLlamadaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoLlamada(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoLlamadaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLlamada(this.gettipollamada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipollamada==null) {
						this.tipollamada = new TipoLlamada();
					}

					this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
				}

				if(this.tipollamada.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipollamada.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLlamada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoLlamadaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLlamada(this.gettipollamada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipollamada==null) {
						this.tipollamada = new TipoLlamada();
					}

					this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
				}

				if(this.tipollamada.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipollamada.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLlamada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoLlamadaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLlamada(this.gettipollamada(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipollamada==null) {
						this.tipollamada = new TipoLlamada();
					}

					this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);
				}

				if(this.tipollamada.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipollamada.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLlamada(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoLlamada() {
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
			this.jInternalFrameDetalleFormTipoLlamada.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoLlamada.dispose();
			this.jInternalFrameDetalleFormTipoLlamada=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
			this.jInternalFrameReporteDinamicoTipoLlamada.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoLlamada.dispose();
			this.jInternalFrameReporteDinamicoTipoLlamada=null;
		}
		
		if(this.jInternalFrameImportacionTipoLlamada!=null) {
			this.jInternalFrameImportacionTipoLlamada.setVisible(false);	    			
			this.jInternalFrameImportacionTipoLlamada.dispose();
			this.jInternalFrameImportacionTipoLlamada=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoLlamada();
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoLlamada")) {
				jButtonDuplicarTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoLlamada")) {
				jButtonCopiarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoLlamada")) {
				jButtonVerFormTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoLlamada")) {
				jButtonDuplicarTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoLlamada")) {
				jButtonDuplicarTipoLlamadaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoLlamada")) {
				jButtonModificarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoLlamada")) {
				jButtonModificarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoLlamada")) {
				jButtonModificarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoLlamada")) {
				jButtonActualizarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoLlamada")) {
				jButtonActualizarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoLlamada")) {
				jButtonActualizarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoLlamada")) {
				jButtonEliminarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoLlamada")) {
				jButtonEliminarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoLlamada")) {
				jButtonEliminarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoLlamada")) {
				jButtonCancelarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoLlamada")) {
				jButtonCancelarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoLlamada")) {
				jButtonCancelarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoLlamada")) {
				jButtonCerrarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoLlamada")) {
				jButtonCerrarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoLlamada")) {
				jButtonCerrarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoLlamada")) {
				jButtonMostrarOcultarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoLlamada")) {
				jButtonCancelarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoLlamada")) {
				jButtonCopiarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoLlamada")) {
				jButtonVerFormTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoLlamada")) {
				jButtonCopiarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoLlamada")) {
				jButtonVerFormTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoLlamada")) {
				jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoLlamada")) {
				jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoLlamada")) {
				jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoLlamada")) {
				jButtonAnterioresTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoLlamada")) {
				jButtonAnterioresTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoLlamada")) {
				jButtonAnterioresTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoLlamada")) {
				jButtonSiguientesTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoLlamada")) {
				jButtonSiguientesTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoLlamada")) {
				jButtonSiguientesTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoLlamada") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoLlamada")) {
				jButtonAbrirOrderByTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoLlamada") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoLlamada")) {
				jButtonMostrarOcultarTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLlamada")) {
				jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoLlamada")) {
				jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoLlamada")) {
				jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoLlamada")) {
				jButtonCerrarReporteDinamicoTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoLlamada")) {
				jButtonGenerarReporteDinamicoTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoLlamada")) {
				
				jButtonGenerarExcelReporteDinamicoTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoLlamada")) {
				jButtonCerrarImportacionTipoLlamadaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoLlamada")) {
				
				jButtonGenerarImportacionTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoLlamada")) {
				
				jButtonAbrirImportacionTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoLlamada")) {
				jComboBoxTiposAccionesTipoLlamadaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoLlamada")) {
				jComboBoxTiposRelacionesTipoLlamadaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoLlamada")) {
				jComboBoxTiposAccionesTipoLlamadaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoLlamada")) {
				
				jComboBoxTiposSeleccionarTipoLlamadaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoLlamada")) {
				jTextFieldValorCampoGeneralTipoLlamadaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoLlamada")) {
				jButtonAbrirOrderByTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoLlamada")) {
				jButtonAbrirOrderByTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoLlamada")) {
				jButtonCerrarOrderByTipoLlamadaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLlamadaBusqueda")) {
				this.jButtonidTipoLlamadaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLlamadaBusqueda")) {
				this.jButtoncodigoTipoLlamadaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLlamadaBusqueda")) {
				this.jButtonnombreTipoLlamadaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoLlamada();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoLlamada tipollamadaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipollamadaLocal=this.tipollamada;
			} else {
				tipollamadaLocal=this.tipollamadaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
							
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
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
			
			


			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
								
						
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
								
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
							
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
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
			
			


			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
								
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoLlamada")) {
					jCheckBoxSeleccionarTodosTipoLlamadaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoLlamada")) {
					jCheckBoxSeleccionadosTipoLlamadaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoLlamada")) {
					
				}
				
				


				
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
												
				
				


				
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
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
			
			


			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLlamadaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipollamada);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipollamada);
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
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
				
				


				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLlamada.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLlamada.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLlamadaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipollamadaAnterior =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoLlamada")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoLlamadaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoLlamada.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipollamada =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipollamada =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipollamada);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoLlamada")) {
				
				}
				
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoLlamada")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoLlamada.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoLlamada")) {
			
			}
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoLlamada();
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoLlamada")) {
				jButtonDuplicarTipoLlamadaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoLlamada")) {
				jButtonCopiarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoLlamada")) {
				jButtonVerFormTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoLlamada")) {
				jButtonNuevoTipoLlamadaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoLlamada")) {
				jButtonModificarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoLlamada")) {
				jButtonActualizarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoLlamada")) {
				jButtonEliminarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoLlamada")) {
				jButtonCancelarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoLlamada")) {
				jButtonCerrarTipoLlamadaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoLlamada")) {
				jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLlamada")) {
				jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoLlamada")) {
				jButtonAbrirOrderByTipoLlamadaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoLlamada")) {
				jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoLlamada")) {
				jButtonAnterioresTipoLlamadaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoLlamada")) {
				jButtonSiguientesTipoLlamadaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLlamadaBusqueda")) {
				this.jButtonidTipoLlamadaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLlamadaBusqueda")) {
				this.jButtoncodigoTipoLlamadaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLlamadaBusqueda")) {
				this.jButtonnombreTipoLlamadaBusquedaActionPerformed(evt);
			}
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoLlamada();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoLlamada")) {
				closingInternalFrameTipoLlamada();
				
			} else if(sTipo.equals("jButtonCancelarTipoLlamada")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoLlamada = (JInternalFrameBase)evt.getSource();
	            	
	            TipoLlamadaBeanSwingJInternalFrame jInternalFrameParent=(TipoLlamadaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLlamada.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoLlamadaActionPerformed(null);
			}
			
			TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipollamada,new Object(),this.tipollamadaParameterGeneral,this.tipollamadaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoLlamada(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoLlamada(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoLlamada(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipollamada)) {
			if(!esControlTabla) {
				if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);			
				}
				
				if(this.tipollamadaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoLlamada(this.tipollamada,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipollamadaReturnGeneral=tipollamadaLogic.procesarEventosTipoLlamadasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipollamadaLogic.getTipoLlamadas(),this.tipollamada,this.tipollamadaParameterGeneral,this.isEsNuevoTipoLlamada,classes);//this.tipollamadaLogic.getTipoLlamada()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoLlamada(this.tipollamadaReturnGeneral,this.tipollamadaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipollamadaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoLlamada(classes,this.tipollamadaReturnGeneral,this.tipollamadaBean,false);
					}
						
					if(this.tipollamadaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada());	
					}
						
					if(this.tipollamadaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada(),classes);//this.tipollamadaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoLlamada(this.tipollamada,classes);//this.tipollamadaBean);									
				}
			
				if(TipoLlamadaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoLlamada(this.tipollamada,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLlamada(this.tipollamada);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipollamadaAnterior!=null) {
						this.tipollamada=this.tipollamadaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipollamadaReturnGeneral=tipollamadaLogic.procesarEventosTipoLlamadasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipollamadaLogic.getTipoLlamadas(),this.tipollamada,this.tipollamadaParameterGeneral,this.isEsNuevoTipoLlamada,classes);//this.tipollamadaLogic.getTipoLlamada()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipollamadaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipollamadaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipollamadaReturnGeneral.getTipoLlamada(),tipollamadaLogic.getTipoLlamadas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipollamadaReturnGeneral.getTipoLlamada(),this.tipollamadas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoLlamada.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoLlamada.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoLlamada();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoLlamada() throws Exception {
		
		TipoLlamadaModel tipollamadaModel=(TipoLlamadaModel)this.jTableDatosTipoLlamada.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipollamadaModel.tipollamadas=this.tipollamadaLogic.getTipoLlamadas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipollamadaModel.tipollamadas=this.tipollamadas;
		}
		
		
		((TipoLlamadaModel) this.jTableDatosTipoLlamada.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoLlamada() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipollamadaAnterior(),this.tipollamadaLogic.getTipoLlamadas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipollamadaAnterior(),this.tipollamadas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoLlamada();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoLlamada(TipoLlamada tipollamada,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
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
										
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipollamada,new Object(),generalEntityParameterGeneral,this.tipollamadaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoLlamadaConstantesFunciones.getClassesRelationshipsOfTipoLlamada(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoLlamadaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoLlamada(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoLlamada(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoLlamadaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipollamada,new Object(),generalEntityParameterGeneral,this.tipollamadaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoLlamada(TipoLlamadaBean tipollamadaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoLlamada(ArrayList<Classe> classes,TipoLlamadaReturnGeneral tipollamadaReturnGeneral,TipoLlamadaBean tipollamadaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoLlamada(TipoLlamada tipollamada,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipollamada)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoLlamada = new TipoLlamadaDetalleFormJInternalFrame(jDesktopPane,this.tipollamadaSessionBean.getConGuardarRelaciones(),this.tipollamadaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.setVisible(false);
		this.jInternalFrameDetalleFormTipoLlamada.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoLlamada.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoLlamada.tipollamadaLogic=this.tipollamadaLogic;
		
		this.cargarCombosFrameForeignKeyTipoLlamada("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLlamada();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLlamada();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoLlamada("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoLlamada();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoLlamada.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLlamada"));
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarTipoLlamada.addActionListener(new ButtonActionListener(this,"ModificarTipoLlamada"));

		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLlamada"));
					
		this.jInternalFrameDetalleFormTipoLlamada.jMenuItemModificarTipoLlamada.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLlamada"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.addActionListener (new ButtonActionListener(this,"ActualizarTipoLlamada"));
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLlamada"));
						
		this.jInternalFrameDetalleFormTipoLlamada.jMenuItemActualizarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLlamada"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.addActionListener (new ButtonActionListener(this,"EliminarTipoLlamada"));
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLlamada"));
								
		this.jInternalFrameDetalleFormTipoLlamada.jMenuItemEliminarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLlamada"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.addActionListener (new ButtonActionListener(this,"CancelarTipoLlamada"));
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLlamada"));
					
		this.jInternalFrameDetalleFormTipoLlamada.jMenuItemCancelarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLlamada"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jMenuItemDetalleCerrarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLlamada"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLlamada"));
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLlamada"));
		
		
		
		this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLlamada"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonidTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtoncodigoTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonnombreTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLlamadaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLlamada"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoLlamada"));
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLlamada"));
		}
		
		this.jTableDatosTipoLlamada.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoLlamada"));
		
		this.jTableDatosTipoLlamada.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoLlamada"));
		
		this.jButtonNuevoTipoLlamada.addActionListener(new ButtonActionListener(this,"NuevoTipoLlamada"));
		
		this.jButtonDuplicarTipoLlamada.addActionListener(new ButtonActionListener(this,"DuplicarTipoLlamada"));
		
		this.jButtonCopiarTipoLlamada.addActionListener(new ButtonActionListener(this,"CopiarTipoLlamada"));
		
		this.jButtonVerFormTipoLlamada.addActionListener(new ButtonActionListener(this,"VerFormTipoLlamada"));
		
		
		this.jButtonNuevoToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoLlamada"));
			
		this.jButtonDuplicarToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoLlamada"));
			
		this.jMenuItemNuevoTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoLlamada"));
			
		this.jMenuItemDuplicarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoLlamada"));		
		
		
		this.jButtonNuevoRelacionesTipoLlamada.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoLlamada"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoLlamada"));
			
		this.jMenuItemNuevoRelacionesTipoLlamada.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoLlamada"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarTipoLlamada.addActionListener(new ButtonActionListener(this,"ModificarTipoLlamada"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonModificarToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLlamada"));
			
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemModificarTipoLlamada.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLlamada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarTipoLlamada.addActionListener (new ButtonActionListener(this,"ActualizarTipoLlamada"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonActualizarToolBarTipoLlamada.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLlamada"));
				
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemActualizarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLlamada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarTipoLlamada.addActionListener (new ButtonActionListener(this,"EliminarTipoLlamada"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonEliminarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLlamada"));
						
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemEliminarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLlamada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarTipoLlamada.addActionListener (new ButtonActionListener(this,"CancelarTipoLlamada"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonCancelarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLlamada"));
			
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemCancelarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLlamada"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoLlamada"));		
		
		
		this.jButtonCerrarTipoLlamada.addActionListener (new ButtonActionListener(this,"CerrarTipoLlamada"));
		
		
		this.jButtonCerrarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoLlamada"));
			
		this.jMenuItemCerrarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoLlamada"));
			
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jMenuItemDetalleCerrarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLlamada"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoLlamada"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLlamada"));
		}
		
		this.jButtonCopiarToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoLlamada"));
			
		this.jButtonVerFormToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoLlamada"));
		
		this.jMenuItemGuardarCambiosTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoLlamada"));
			
		this.jMenuItemCopiarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoLlamada"));		
		
		this.jMenuItemVerFormTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoLlamada"));		
		
		
		this.jButtonGuardarCambiosTablaTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLlamada"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoLlamada"));
			
		this.jMenuItemGuardarCambiosTablaTipoLlamada.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLlamada"));		
		
		
		
		this.jButtonRecargarInformacionTipoLlamada.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoLlamada"));
					
		this.jButtonRecargarInformacionToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoLlamada"));
		
		this.jMenuItemRecargarInformacionTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoLlamada"));		
		
		
		
		this.jButtonAnterioresTipoLlamada.addActionListener (new ButtonActionListener(this,"AnterioresTipoLlamada"));
		
		
		this.jButtonAnterioresToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoLlamada"));
		
		this.jMenuItemAnterioresTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoLlamada"));		
		
		
		this.jButtonSiguientesTipoLlamada.addActionListener (new ButtonActionListener(this,"SiguientesTipoLlamada"));
		
		
		this.jButtonSiguientesToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoLlamada"));
			
		this.jMenuItemSiguientesTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoLlamada"));
			
		this.jMenuItemAbrirOrderByTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoLlamada"));
			
		this.jMenuItemMostrarOcultarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoLlamada"));
			
		this.jMenuItemDetalleAbrirOrderByTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoLlamada"));
			
		this.jMenuItemDetalleMostarOcultarTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoLlamada"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoLlamada.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoLlamada"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoLlamada"));
			
		this.jMenuItemNuevoGuardarCambiosTipoLlamada.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoLlamada"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoLlamada.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoLlamada"));

		this.jCheckBoxSeleccionadosTipoLlamada.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoLlamada"));
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLlamada"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoLlamada.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoLlamada"));
			
		this.jComboBoxTiposAccionesTipoLlamada.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoLlamada"));
					
		this.jComboBoxTiposSeleccionarTipoLlamada.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoLlamada"));
			
		this.jTextFieldValorCampoGeneralTipoLlamada.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoLlamada"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonidTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtoncodigoTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonnombreTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLlamadaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoLlamada!=null) {
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLlamada"));
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLlamada"));
				this.jInternalFrameReporteDinamicoTipoLlamada.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLlamada"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoLlamada.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLlamada"));				
			//this.jButtonGenerarReporteDinamicoTipoLlamada.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLlamada"));
			//this.jButtonGenerarExcelReporteDinamicoTipoLlamada.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLlamada"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoLlamada!=null) {
				this.jInternalFrameImportacionTipoLlamada.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLlamada"));
				this.jInternalFrameImportacionTipoLlamada.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLlamada"));
				this.jInternalFrameImportacionTipoLlamada.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLlamada"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoLlamada.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoLlamada"));
			
			this.jButtonAbrirOrderByToolBarTipoLlamada.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoLlamada"));			
			
			if(this.jInternalFrameOrderByTipoLlamada!=null) {
				this.jInternalFrameOrderByTipoLlamada.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLlamada"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLlamada.jTabbedPaneRelacionesTipoLlamada.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLlamada"));
		
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
            		closingInternalFrameTipoLlamada();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoLlamada.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoLlamada = (JInternalFrameBase)event.getSource();
	            	
	            TipoLlamadaBeanSwingJInternalFrame jInternalFrameParent=(TipoLlamadaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLlamada.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoLlamadaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoLlamada.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoLlamadaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoLlamada.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoLlamada.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoLlamada";
		inputMap = this.jButtonNuevoTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLlamadaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLlamadaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoLlamada";
		inputMap = this.jButtonNuevoRelacionesTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLlamadaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoLlamada";
		inputMap = this.jButtonModificarTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoLlamada";
		inputMap = this.jButtonActualizarTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoLlamada";
		inputMap = this.jButtonEliminarTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoLlamada";
		inputMap = this.jButtonCancelarTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoLlamada";
		inputMap = this.jButtonCerrarTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoLlamada";
		inputMap = this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoLlamada.jButtonGuardarCambiosTipoLlamada.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoLlamadaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoLlamada.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoLlamadaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoLlamada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoLlamadaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoLlamada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoLlamadaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoLlamada.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoLlamadaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonidTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtoncodigoTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLlamadaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLlamada.jButtonnombreTipoLlamadaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLlamadaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoLlamada.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoLlamadaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoLlamadaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoLlamada.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoLlamada(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
					tipollamadaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLlamada tipollamadaAux:tipollamadas) {
					tipollamadaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoLlamadaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
						tipollamadaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLlamada tipollamadaAux:tipollamadas) {
						tipollamadaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLlamada tipollamadaAux:tipollamadas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLlamada(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLlamada.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLlamada.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoLlamadaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoLlamada.getSelectedRows();
			
			TipoLlamada tipollamadaLocal=new TipoLlamada();
			
			//this.seleccionarTodosTipoLlamada(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipollamadaLocal =(TipoLlamada) this.tipollamadaLogic.getTipoLlamadas().toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipollamadaLocal =(TipoLlamada) this.tipollamadas.toArray()[this.jTableDatosTipoLlamada.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipollamadaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
						tipollamadaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLlamada tipollamadaAux:tipollamadas) {
						tipollamadaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoLlamada(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLlamada.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLlamada.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLlamada,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoLlamadaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoLlamadaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoLlamadaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoLlamada.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLlamada tipollamadaAux:this.tipollamadaLogic.getTipoLlamadas()) {
				
						if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipollamadaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipollamadaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLlamada tipollamadaAux:tipollamadas) {
					
						if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipollamadaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipollamadaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLlamada(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoLlamadaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoLlamada=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoLlamada.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoLlamada) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoLlamada(conSplash);
				
					this.generarReporteTipoLlamadasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoLlamadasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLlamadasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLlamadasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLlamada();
				
				this.exportarTipoLlamadasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoLlamadas();
				//this.importarTipoLlamadas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLlamada();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoLlamadasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Llamada", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoLlamada();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoLlamada)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoLlamada(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLlamada.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLlamada.jComboBoxTiposAccionesFormularioTipoLlamada.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoLlamada();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoLlamada(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoLlamadaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoLlamada();
			
			if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
			TipoLlamada tipollamada=new TipoLlamada();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoLlamada(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoLlamada.getSelectedItem();
			
			
			
			
			tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipollamadasSeleccionados.size()==1) {
				for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
					tipollamada=tipollamadaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoLlamada();
			
      		//this.finishProcessTipoLlamada(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoLlamadaReturnGeneral() throws Exception {
		if(this.tipollamadaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipollamadaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipollamadaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipollamadaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipollamadaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipollamadaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoLlamada(false);
		}
		
		if(this.tipollamadaReturnGeneral.getConRetornoLista() || this.tipollamadaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipollamadaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipollamadaLogic.setTipoLlamadas(this.tipollamadaReturnGeneral.getTipoLlamadas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipollamadaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipollamadaLogic.setTipoLlamada(this.tipollamadaReturnGeneral.getTipoLlamada());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoLlamada(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoLlamada() throws Exception {
		
		
	}
	
	public ArrayList<TipoLlamada> getTipoLlamadasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoLlamada) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoLlamada tipollamadaAux:tipollamadaLogic.getTipoLlamadas()) {
					if(tipollamadaAux.getIsSelected()) {
						tipollamadasSeleccionados.add(tipollamadaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLlamada tipollamadaAux:this.tipollamadas) {
					if(tipollamadaAux.getIsSelected()) {
						tipollamadasSeleccionados.add(tipollamadaAux);				
					}
				}
			}
			
			if(tipollamadasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipollamadasSeleccionados.addAll(this.tipollamadaLogic.getTipoLlamadas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipollamadasSeleccionados.addAll(this.tipollamadas);				
					}
				}
			}
		} else {
			tipollamadasSeleccionados.add(this.tipollamada);
		}
		
		return tipollamadasSeleccionados;
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
	
	public void generarReporteTipoLlamadasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoLlamadasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoLlamadasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLlamadasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLlamadasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Llamada",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoLlamadasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoLlamada();
		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoLlamada();
		
		
		//this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados ,tipollamadaImplementable,tipollamadaImplementableHome);
	}
	
	public void mostrarImportacionTipoLlamadas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoLlamada();
		
		this.abrirFrameImportacionTipoLlamada();		
		
			
		//this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados ,tipollamadaImplementable,tipollamadaImplementableHome);
	}
	
	public void importarTipoLlamadas() throws Exception {		
	
	}
	
	public void exportarTipoLlamadasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoLlamadasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoLlamadasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoLlamadasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Llamada",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoLlamada(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoLlamada(tipollamadaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipollamadaAux.setsDetalleGeneralEntityReporte(tipollamadaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoLlamada(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoLlamadaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLlamadaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLlamadaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLlamadaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoLlamada(TipoLlamada tipollamada,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipollamada.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipollamada.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipollamada.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipollamada.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoLlamadas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoLlamada(row);				
				iRow++;
			}				
			
			for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoLlamada(tipollamadaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoLlamadasSeleccionados() throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();		
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipollamada.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipollamadas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipollamada");
			//elementRoot.appendChild(element);
		
			for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
				element = document.createElement("tipollamada");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoLlamada(tipollamadaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Llamada",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoLlamada(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLlamadaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoLlamada(TipoLlamada tipollamada,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipollamada.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipollamada.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipollamada.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoLlamada(TipoLlamada tipollamada,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoLlamadaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipollamada.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoLlamadaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipollamada.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoLlamadaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipollamada.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoLlamadaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipollamada.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoLlamadasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoLlamada> tipollamadasSeleccionados=new ArrayList<TipoLlamada>();
		
		tipollamadasSeleccionados=this.getTipoLlamadasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoLlamada(tipollamadasSeleccionados);
		
		this.generarReporteTipoLlamadas("Todos",tipollamadasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoLlamada(ArrayList<TipoLlamada> tipollamadasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoLlamada tipollamadaAux:tipollamadasSeleccionados) {
				tipollamadaAux.setsDetalleGeneralEntityReporte(tipollamadaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipollamadaAux.setsDescripcionGeneralEntityReporte1(tipollamadaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoLlamadaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipollamadaAux.setsDescripcionGeneralEntityReporte1(tipollamadaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLlamadaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoLlamada(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoLlamada=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=true;
				this.isVisibilidadCeldaGuardarCambiosTipoLlamada=true;
			}
			
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=true;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=true;
			this.isVisibilidadCeldaEliminarTipoLlamada=true;
			this.isVisibilidadCeldaCancelarTipoLlamada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=true;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoLlamada=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=true;
			this.isVisibilidadCeldaModificarTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
			this.isVisibilidadCeldaModificarTipoLlamada=true;
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
			this.isVisibilidadCeldaCancelarTipoLlamada=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLlamada=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoLlamada=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=true;
		} else {
			this.actualizarEstadoPanelsTipoLlamada(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoLlamada=false;
			//this.isVisibilidadCeldaVerFormTipoLlamada=false;
			this.isVisibilidadCeldaDuplicarTipoLlamada=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipollamadaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoLlamada=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLlamada=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipollamadaSessionBean.getEsGuardarRelacionado()) {
			if(!tipollamadaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;												
			}
			
			this.jButtonCerrarTipoLlamada.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLlamada=false;
		}
		
		if(!this.permiteMantenimiento(this.tipollamada)) {
			this.isVisibilidadCeldaActualizarTipoLlamada=false;
			this.isVisibilidadCeldaEliminarTipoLlamada=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLlamada() {
	}
	
	public void actualizarEstadoPanelsTipoLlamada(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoLlamada!=null) {
				this.jScrollPanelDatosEdicionTipoLlamada.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoLlamada!=null) {
				this.jScrollPanelDatosTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLlamada!=null) {
				this.jPanelPaginacionTipoLlamada.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLlamada!=null) {
				this.jPanelParametrosReportesTipoLlamada.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoLlamadaSessionBean tipollamadaSessionBean=new TipoLlamadaSessionBean();
		
		if(this.tipollamadaSessionBean==null) {
			this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
		}
		
		this.tipollamadaSessionBean.setsUltimaBusquedaTipoLlamada(this.getsAccionBusqueda());
		this.tipollamadaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipollamadaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoLlamadaSessionBean tipollamadaSessionBean=new TipoLlamadaSessionBean();
		
		if(this.tipollamadaSessionBean==null) {
			this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
		}
		
		if(this.tipollamadaSessionBean.getsUltimaBusquedaTipoLlamada()!=null&&!this.tipollamadaSessionBean.getsUltimaBusquedaTipoLlamada().equals("")) {
			this.setsAccionBusqueda(tipollamadaSessionBean.getsUltimaBusquedaTipoLlamada());
			this.setiNumeroPaginacion(tipollamadaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipollamadaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipollamadaSessionBean.setsUltimaBusquedaTipoLlamada("");
		this.tipollamadaSessionBean.setiNumeroPaginacion(TipoLlamadaConstantesFunciones.INUMEROPAGINACION);
		this.tipollamadaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoLlamada(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoLlamada() {
		this.updateBorderResaltarBusquedasFormularioTipoLlamada();
		this.updateVisibilidadBusquedasFormularioTipoLlamada();
		this.updateHabilitarBusquedasFormularioTipoLlamada();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoLlamada() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoLlamada() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoLlamada() {
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
	
	public void updateControlesFormularioTipoLlamada() throws Exception {

		if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoLlamada();
		this.updateVisibilidadResaltarControlesFormularioTipoLlamada();
		this.updateHabilitarResaltarControlesFormularioTipoLlamada();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoLlamada() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipollamadaConstantesFunciones.resaltaridTipoLlamada!=null && this.jInternalFrameDetalleFormTipoLlamada!=null) {this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setBorder(this.tipollamadaConstantesFunciones.resaltaridTipoLlamada);}
		if(this.tipollamadaConstantesFunciones.resaltarcodigoTipoLlamada!=null && this.jInternalFrameDetalleFormTipoLlamada!=null) {this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setBorder(this.tipollamadaConstantesFunciones.resaltarcodigoTipoLlamada);}
		if(this.tipollamadaConstantesFunciones.resaltarnombreTipoLlamada!=null && this.jInternalFrameDetalleFormTipoLlamada!=null) {this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setBorder(this.tipollamadaConstantesFunciones.resaltarnombreTipoLlamada);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoLlamada() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
	
		//this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostraridTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jPanelidTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostraridTipoLlamada);
		//this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostrarcodigoTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jPanelcodigoTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostrarcodigoTipoLlamada);
		//this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostrarnombreTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jPanelnombreTipoLlamada.setVisible(this.tipollamadaConstantesFunciones.mostrarnombreTipoLlamada);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoLlamada() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLlamada==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLlamada!=null) {
	
		this.jInternalFrameDetalleFormTipoLlamada.jTextFieldidTipoLlamada.setEnabled(this.tipollamadaConstantesFunciones.activaridTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jTextFieldcodigoTipoLlamada.setEnabled(this.tipollamadaConstantesFunciones.activarcodigoTipoLlamada);
		this.jInternalFrameDetalleFormTipoLlamada.jTextAreanombreTipoLlamada.setEnabled(this.tipollamadaConstantesFunciones.activarnombreTipoLlamada);
		}
	}
	
		
}