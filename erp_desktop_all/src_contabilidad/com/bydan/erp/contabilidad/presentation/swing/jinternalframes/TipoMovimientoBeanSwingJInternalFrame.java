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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoMovimientoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoMovimientoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoMovimientoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoMovimientoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoMovimientoBeanSwingJInternalFrame extends TipoMovimientoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMovimientoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMovimiento> tipomovimientoValidator = new ClassValidator<TipoMovimiento>(TipoMovimiento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMovimiento tipomovimiento;	
	public TipoMovimiento tipomovimientoAux;
	public TipoMovimiento tipomovimientoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMovimiento tipomovimientoTotales;
	public Long idTipoMovimientoActual;
	public Long iIdNuevoTipoMovimiento=0L;
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
	
	public Boolean isPermisoTodoTipoMovimiento;
	public Boolean isPermisoNuevoTipoMovimiento;
	public Boolean isPermisoActualizarTipoMovimiento;
	public Boolean isPermisoActualizarOriginalTipoMovimiento;
	public Boolean isPermisoEliminarTipoMovimiento;
	public Boolean isPermisoGuardarCambiosTipoMovimiento;
	public Boolean isPermisoConsultaTipoMovimiento;
	public Boolean isPermisoBusquedaTipoMovimiento;
	public Boolean isPermisoReporteTipoMovimiento;
	public Boolean isPermisoPaginacionMedioTipoMovimiento;
	public Boolean isPermisoPaginacionAltoTipoMovimiento;
	public Boolean isPermisoPaginacionTodoTipoMovimiento;
	public Boolean isPermisoCopiarTipoMovimiento;
	public Boolean isPermisoVerFormTipoMovimiento;
	public Boolean isPermisoDuplicarTipoMovimiento;
	public Boolean isPermisoOrdenTipoMovimiento;
	
	
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
	
	public TipoMovimientoParameterReturnGeneral tipomovimientoReturnGeneral;
	public TipoMovimientoParameterReturnGeneral tipomovimientoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMovimiento=false;
	public Boolean esParaAccionDesdeFormularioTipoMovimiento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMovimientoLogic tipomovimientoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMovimiento tipomovimientoBean;
	public TipoMovimientoConstantesFunciones tipomovimientoConstantesFunciones;
	//public TipoMovimientoParameterReturnGeneral tipomovimientoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoMovimiento> tipomovimientos;	
	//public List<TipoMovimiento> tipomovimientosEliminados;
	//public List<TipoMovimiento> tipomovimientosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMovimiento=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMovimiento=true;
	public Boolean isVisibilidadCeldaCopiarTipoMovimiento=true;
	public Boolean isVisibilidadCeldaVerFormTipoMovimiento=true;
	public Boolean isVisibilidadCeldaOrdenTipoMovimiento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
	public Boolean isVisibilidadCeldaModificarTipoMovimiento=false;
	public Boolean isVisibilidadCeldaActualizarTipoMovimiento=false;
	public Boolean isVisibilidadCeldaEliminarTipoMovimiento=false;
	public Boolean isVisibilidadCeldaCancelarTipoMovimiento=false;
	public Boolean isVisibilidadCeldaGuardarTipoMovimiento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;	
	
	
	
	public Long getiIdNuevoTipoMovimiento() {
		return this.iIdNuevoTipoMovimiento;
	}

	public void setiIdNuevoTipoMovimiento(Long iIdNuevoTipoMovimiento) {
		this.iIdNuevoTipoMovimiento = iIdNuevoTipoMovimiento;
	}
	
	public Long getidTipoMovimientoActual() {
		return this.idTipoMovimientoActual;
	}

	public void setidTipoMovimientoActual(Long idTipoMovimientoActual) {
		this.idTipoMovimientoActual = idTipoMovimientoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMovimiento gettipomovimiento() {
		return this.tipomovimiento;
	}

	public void settipomovimiento(TipoMovimiento tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}
	
	public TipoMovimiento gettipomovimientoAux() {
		return this.tipomovimientoAux;
	}

	public void settipomovimientoAux(TipoMovimiento tipomovimientoAux) {
		this.tipomovimientoAux = tipomovimientoAux;
	}				
	
	public TipoMovimiento gettipomovimientoAnterior() {
		return this.tipomovimientoAnterior;
	}

	public void settipomovimientoAnterior(TipoMovimiento tipomovimientoAnterior) {
		this.tipomovimientoAnterior = tipomovimientoAnterior;
	}	
	
	public TipoMovimiento gettipomovimientoTotales() {
		return this.tipomovimientoTotales;
	}

	public void settipomovimientoTotales(TipoMovimiento tipomovimientoTotales) {
		this.tipomovimientoTotales = tipomovimientoTotales;
	}	
	
	public TipoMovimiento gettipomovimientoBean() {
		return this.tipomovimientoBean;
	}

	public void settipomovimientoBean(TipoMovimiento tipomovimientoBean) {
		this.tipomovimientoBean = tipomovimientoBean;
	}	
	
	public TipoMovimientoParameterReturnGeneral gettipomovimientoReturnGeneral() {
		return this.tipomovimientoReturnGeneral;
	}

	public void settipomovimientoReturnGeneral(TipoMovimientoParameterReturnGeneral tipomovimientoReturnGeneral) {
		this.tipomovimientoReturnGeneral = tipomovimientoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMovimientoLogic getTipoMovimientoLogic()	{		
		return tipomovimientoLogic;
	}

	public void setTipoMovimientoLogic(TipoMovimientoLogic tipomovimientoLogic) {
		this.tipomovimientoLogic = tipomovimientoLogic;
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
	
	public Boolean getIsEsNuevoTipoMovimiento() {
		return isEsNuevoTipoMovimiento;
	}

	public void setIsEsNuevoTipoMovimiento(Boolean isEsNuevoTipoMovimiento) {
		this.isEsNuevoTipoMovimiento = isEsNuevoTipoMovimiento;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMovimiento() {
		return esParaAccionDesdeFormularioTipoMovimiento;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMovimiento(Boolean esParaAccionDesdeFormularioTipoMovimiento) {
		this.esParaAccionDesdeFormularioTipoMovimiento = esParaAccionDesdeFormularioTipoMovimiento;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoMovimiento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMovimientoConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimiento(this.tipomovimientoLogic.getTipoMovimientos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMovimientoConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimiento(this.tipomovimientos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomovimientoLogic.setTipoMovimientos(this.tipomovimientos);
			tipomovimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMovimientoParameterReturnGeneral getTipoMovimientoParameterGeneral() {
		return this.tipomovimientoParameterGeneral;
	}
	
	public void setTipoMovimientoParameterGeneral(TipoMovimientoParameterReturnGeneral tipomovimientoParameterGeneral) {
		this.tipomovimientoParameterGeneral = tipomovimientoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMovimiento() {
		return isPermisoTodoTipoMovimiento;
	}

	public void setIsPermisoTodoTipoMovimiento(Boolean isPermisoTodoTipoMovimiento) {
		this.isPermisoTodoTipoMovimiento = isPermisoTodoTipoMovimiento;
	}

	public Boolean getIsPermisoNuevoTipoMovimiento() {
		return isPermisoNuevoTipoMovimiento;
	}

	public void setIsPermisoNuevoTipoMovimiento(Boolean isPermisoNuevoTipoMovimiento) {
		this.isPermisoNuevoTipoMovimiento = isPermisoNuevoTipoMovimiento;
	}

	public Boolean getIsPermisoActualizarTipoMovimiento() {
		return isPermisoActualizarTipoMovimiento;
	}

	public void setIsPermisoActualizarTipoMovimiento(Boolean isPermisoActualizarTipoMovimiento) {
		this.isPermisoActualizarTipoMovimiento = isPermisoActualizarTipoMovimiento;
	}

	public Boolean getIsPermisoEliminarTipoMovimiento() {
		return isPermisoEliminarTipoMovimiento;
	}

	public void setIsPermisoEliminarTipoMovimiento(Boolean isPermisoEliminarTipoMovimiento) {
		this.isPermisoEliminarTipoMovimiento = isPermisoEliminarTipoMovimiento;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMovimiento() {
		return isPermisoGuardarCambiosTipoMovimiento;
	}

	public void setIsPermisoGuardarCambiosTipoMovimiento(Boolean isPermisoGuardarCambiosTipoMovimiento) {
		this.isPermisoGuardarCambiosTipoMovimiento = isPermisoGuardarCambiosTipoMovimiento;
	}
	
	public Boolean getIsPermisoConsultaTipoMovimiento() {
		return isPermisoConsultaTipoMovimiento;
	}

	public void setIsPermisoConsultaTipoMovimiento(Boolean isPermisoConsultaTipoMovimiento) {
		this.isPermisoConsultaTipoMovimiento = isPermisoConsultaTipoMovimiento;
	}

	public Boolean getIsPermisoBusquedaTipoMovimiento() {
		return isPermisoBusquedaTipoMovimiento;
	}

	public void setIsPermisoBusquedaTipoMovimiento(Boolean isPermisoBusquedaTipoMovimiento) {
		this.isPermisoBusquedaTipoMovimiento = isPermisoBusquedaTipoMovimiento;
	}

	public Boolean getIsPermisoReporteTipoMovimiento() {
		return isPermisoReporteTipoMovimiento;
	}

	public void setIsPermisoReporteTipoMovimiento(Boolean isPermisoReporteTipoMovimiento) {
		this.isPermisoReporteTipoMovimiento = isPermisoReporteTipoMovimiento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMovimiento() {
		return isPermisoPaginacionMedioTipoMovimiento;
	}

	public void setIsPermisoPaginacionMedioTipoMovimiento(Boolean isPermisoPaginacionMedioTipoMovimiento) {
		this.isPermisoPaginacionMedioTipoMovimiento = isPermisoPaginacionMedioTipoMovimiento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMovimiento() {
		return isPermisoPaginacionTodoTipoMovimiento;
	}

	public void setIsPermisoPaginacionTodoTipoMovimiento(Boolean isPermisoPaginacionTodoTipoMovimiento) {
		this.isPermisoPaginacionTodoTipoMovimiento = isPermisoPaginacionTodoTipoMovimiento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMovimiento() {
		return isPermisoPaginacionAltoTipoMovimiento;
	}

	public void setIsPermisoPaginacionAltoTipoMovimiento(Boolean isPermisoPaginacionAltoTipoMovimiento) {
		this.isPermisoPaginacionAltoTipoMovimiento = isPermisoPaginacionAltoTipoMovimiento;
	}
	
	public Boolean getIsPermisoCopiarTipoMovimiento() {
		return isPermisoCopiarTipoMovimiento;
	}

	public void setIsPermisoCopiarTipoMovimiento(Boolean isPermisoCopiarTipoMovimiento) {
		this.isPermisoCopiarTipoMovimiento = isPermisoCopiarTipoMovimiento;
	}
	
	public Boolean getIsPermisoVerFormTipoMovimiento() {
		return isPermisoVerFormTipoMovimiento;
	}

	public void setIsPermisoVerFormTipoMovimiento(Boolean isPermisoVerFormTipoMovimiento) {
		this.isPermisoVerFormTipoMovimiento = isPermisoVerFormTipoMovimiento;
	}
	
	public Boolean getIsPermisoDuplicarTipoMovimiento() {
		return isPermisoDuplicarTipoMovimiento;
	}

	public void setIsPermisoDuplicarTipoMovimiento(Boolean isPermisoDuplicarTipoMovimiento) {
		this.isPermisoDuplicarTipoMovimiento = isPermisoDuplicarTipoMovimiento;
	}
	
	public Boolean getIsPermisoOrdenTipoMovimiento() {
		return isPermisoOrdenTipoMovimiento;
	}

	public void setIsPermisoOrdenTipoMovimiento(Boolean isPermisoOrdenTipoMovimiento) {
		this.isPermisoOrdenTipoMovimiento = isPermisoOrdenTipoMovimiento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMovimiento() {
		return isVisibilidadCeldaNuevoTipoMovimiento;
	}

	public void setIsVisibilidadCeldaNuevoTipoMovimiento(Boolean isVisibilidadCeldaNuevoTipoMovimiento) {
		this.isVisibilidadCeldaNuevoTipoMovimiento = isVisibilidadCeldaNuevoTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMovimiento() {
		return isVisibilidadCeldaDuplicarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMovimiento(Boolean isVisibilidadCeldaDuplicarTipoMovimiento) {
		this.isVisibilidadCeldaDuplicarTipoMovimiento = isVisibilidadCeldaDuplicarTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMovimiento() {
		return isVisibilidadCeldaCopiarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaCopiarTipoMovimiento(Boolean isVisibilidadCeldaCopiarTipoMovimiento) {
		this.isVisibilidadCeldaCopiarTipoMovimiento = isVisibilidadCeldaCopiarTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMovimiento() {
		return isVisibilidadCeldaVerFormTipoMovimiento;
	}

	public void setIsVisibilidadCeldaVerFormTipoMovimiento(Boolean isVisibilidadCeldaVerFormTipoMovimiento) {
		this.isVisibilidadCeldaVerFormTipoMovimiento = isVisibilidadCeldaVerFormTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMovimiento() {
		return isVisibilidadCeldaOrdenTipoMovimiento;
	}

	public void setIsVisibilidadCeldaOrdenTipoMovimiento(Boolean isVisibilidadCeldaOrdenTipoMovimiento) {
		this.isVisibilidadCeldaOrdenTipoMovimiento = isVisibilidadCeldaOrdenTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMovimiento() {
		return isVisibilidadCeldaNuevoRelacionesTipoMovimiento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMovimiento(Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimiento) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento = isVisibilidadCeldaNuevoRelacionesTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMovimiento() {
		return isVisibilidadCeldaModificarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaModificarTipoMovimiento(Boolean isVisibilidadCeldaModificarTipoMovimiento) {
		this.isVisibilidadCeldaModificarTipoMovimiento = isVisibilidadCeldaModificarTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMovimiento() {
		return isVisibilidadCeldaActualizarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaActualizarTipoMovimiento(Boolean isVisibilidadCeldaActualizarTipoMovimiento) {
		this.isVisibilidadCeldaActualizarTipoMovimiento = isVisibilidadCeldaActualizarTipoMovimiento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMovimiento() {
		return isVisibilidadCeldaEliminarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaEliminarTipoMovimiento(Boolean isVisibilidadCeldaEliminarTipoMovimiento) {
		this.isVisibilidadCeldaEliminarTipoMovimiento = isVisibilidadCeldaEliminarTipoMovimiento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMovimiento() {
		return isVisibilidadCeldaCancelarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaCancelarTipoMovimiento(Boolean isVisibilidadCeldaCancelarTipoMovimiento) {
		this.isVisibilidadCeldaCancelarTipoMovimiento = isVisibilidadCeldaCancelarTipoMovimiento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMovimiento() {
		return isVisibilidadCeldaGuardarTipoMovimiento;
	}

	public void setIsVisibilidadCeldaGuardarTipoMovimiento(Boolean isVisibilidadCeldaGuardarTipoMovimiento) {
		this.isVisibilidadCeldaGuardarTipoMovimiento = isVisibilidadCeldaGuardarTipoMovimiento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMovimiento() {
		return isVisibilidadCeldaGuardarCambiosTipoMovimiento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMovimiento(Boolean isVisibilidadCeldaGuardarCambiosTipoMovimiento) {
		this.isVisibilidadCeldaGuardarCambiosTipoMovimiento = isVisibilidadCeldaGuardarCambiosTipoMovimiento;
	}
		
	public TipoMovimientoSessionBean gettipomovimientoSessionBean() {
		return this.tipomovimientoSessionBean;
	}
	
	public void settipomovimientoSessionBean(TipoMovimientoSessionBean tipomovimientoSessionBean) {
		this.tipomovimientoSessionBean=tipomovimientoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(TipoMovimiento tipomovimiento)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoMovimiento tipomovimiento,TipoMovimiento tipomovimientoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMovimiento(tipomovimiento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomovimientoAux.setId(tipomovimiento.getId());
		tipomovimientoAux.setVersionRow(tipomovimiento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMovimiento();
		
			int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomovimientoValidator.getInvalidValues(this.tipomovimiento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomovimientoLogic.setDatosCliente(datosCliente);
			tipomovimientoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomovimientoAux=new  TipoMovimiento();
				
				tipomovimientoAux.setIsNew(true);
				tipomovimientoAux.setIsChanged(true);
				
				tipomovimientoAux.setTipoMovimientoOriginal(this.tipomovimiento);
				
				tipomovimientoAux.setId(this.tipomovimiento.getId());	
				tipomovimientoAux.setVersionRow(this.tipomovimiento.getVersionRow());	
				tipomovimientoAux.setcodigo(this.tipomovimiento.getcodigo());	
				tipomovimientoAux.setnombre(this.tipomovimiento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomovimientoAux,tipomovimientoLogic.getTipoMovimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientoAux,tipomovimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientoLogic.saveTipoMovimientos();//WithConnection
						//tipomovimientoLogic.getSetVersionRowTipoMovimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimiento,tipomovimientoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomovimientoAux=new  TipoMovimiento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomovimientoSessionBean.getEsGuardarRelacionado() && this.tipomovimiento.getId()>=0)) {
						
					tipomovimientoAux.setIsNew(false);
				}
				
				tipomovimientoAux.setIsDeleted(false);
			
				tipomovimientoAux.setId(this.tipomovimiento.getId());	
				tipomovimientoAux.setVersionRow(this.tipomovimiento.getVersionRow());	
				tipomovimientoAux.setcodigo(this.tipomovimiento.getcodigo());	
				tipomovimientoAux.setnombre(this.tipomovimiento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimientoAux,tipomovimientoLogic.getTipoMovimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientoAux,tipomovimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientoLogic.saveTipoMovimientos();//WithConnection
						//tipomovimientoLogic.getSetVersionRowTipoMovimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimiento,tipomovimientoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomovimientoAux=new  TipoMovimiento();
				
				tipomovimientoAux.setIsNew(false);
				tipomovimientoAux.setIsChanged(false);
				
				tipomovimientoAux.setIsDeleted(true);
				
				tipomovimientoAux.setId(this.tipomovimiento.getId());	
				tipomovimientoAux.setVersionRow(this.tipomovimiento.getVersionRow());	
				tipomovimientoAux.setcodigo(this.tipomovimiento.getcodigo());	
				tipomovimientoAux.setnombre(this.tipomovimiento.getnombre());	
				
				if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomovimientoAux.getId()>=0) {	
						this.tipomovimientosEliminados.add(tipomovimientoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomovimientoAux,tipomovimientoLogic.getTipoMovimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientoAux,tipomovimientos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientoLogic.saveTipoMovimientos();//WithConnection
						//tipomovimientoLogic.getSetVersionRowTipoMovimientos();//WithConnection
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
					this.tipomovimientoLogic.getTipoMovimientos().addAll(this.tipomovimientosEliminados);
					
					tipomovimientoLogic.saveTipoMovimientos();//WithConnection
					//tipomovimientoLogic.getSetVersionRowTipoMovimientos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipomovimientosEliminados= new ArrayList<TipoMovimiento>();		
			}
			
			if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Movimiento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomovimiento=tipomovimientoAux;
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
      		//this.finishProcessTipoMovimiento();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMovimiento tipomovimientoLocal) throws Exception {
		
		if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMovimiento tipomovimientoLocal) throws Exception {	
		if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoMovimientoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomovimientoValidator.getInvalidValues(this.tipomovimiento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMovimiento tipomovimiento,List<TipoMovimiento> tipomovimientos) throws Exception {
		try	{		
			TipoMovimientoConstantesFunciones.actualizarLista(tipomovimiento,tipomovimientos,this.tipomovimientoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMovimiento tipomovimiento,List<TipoMovimiento> tipomovimientos) throws Exception {
		try	{			
			TipoMovimientoConstantesFunciones.actualizarSelectedLista(tipomovimiento,tipomovimientos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMovimiento> tipomovimientosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomovimientosLocal=this.tipomovimientoLogic.getTipoMovimientos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomovimientosLocal=this.tipomovimientos;
			}
			//ARCHITECTURE
		
			for(TipoMovimiento tipomovimientoLocal:tipomovimientosLocal) {
				if(this.permiteMantenimiento(tipomovimientoLocal) && tipomovimientoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMovimientoConstantesFunciones.getTipoMovimientoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMovimientoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento.jLabelcodigoTipoMovimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMovimientoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento.jLabelnombreTipoMovimiento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimiento.jLabelcodigoTipoMovimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimiento.jLabelnombreTipoMovimiento,"");
		
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
		this.iIdNuevoTipoMovimiento--;	
		
		
		this.tipomovimientoAux=new TipoMovimiento();
		
		this.tipomovimientoAux.setId(this.iIdNuevoTipoMovimiento);
		this.tipomovimientoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimientoLogic.getTipoMovimientos().add(this.tipomovimientoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomovimientos.add(this.tipomovimientoAux);
		}
		//ARCHITECTURE
		
		this.tipomovimiento=this.tipomovimientoAux;
		
		if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMovimiento(this.tipomovimiento);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento(this.tipomovimiento);
		}
				
		//this.setDefaultControlesTipoMovimiento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMovimiento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMovimiento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimiento(this.tipomovimientoBean,this.tipomovimiento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMovimientoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
			classes=TipoMovimientoConstantesFunciones.getClassesRelationshipsOfTipoMovimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomovimientoReturnGeneral=tipomovimientoLogic.procesarEventosTipoMovimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimientoLogic.getTipoMovimientos(),this.tipomovimiento,this.tipomovimientoParameterGeneral,this.isEsNuevoTipoMovimiento,classes);//this.tipomovimientoLogic.getTipoMovimiento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMovimiento(this.tipomovimientoReturnGeneral,this.tipomovimientoBean,false);
		
		if(this.tipomovimientoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento());
		}
		
		if(this.tipomovimientoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento(),classes);//this.tipomovimientoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMovimiento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMovimiento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMovimiento(false);
						
			if(tipomovimientoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento();
			}
			
			this.actualizarVisualTableDatosTipoMovimiento();
			
			this.jTableDatosTipoMovimiento.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento(), this.getIndiceNuevoTipoMovimiento());
			
			this.seleccionarFilaTablaTipoMovimientoActual();
						
			this.actualizarEstadoCeldasBotonesTipoMovimiento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMovimiento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setEnabled(isHabilitar && this.tipomovimientoConstantesFunciones.activarcodigoTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setEnabled(isHabilitar && this.tipomovimientoConstantesFunciones.activarnombreTipoMovimiento);	
		
	};
	
	public void setDefaultControlesTipoMovimiento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMovimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomovimientoSessionBean.setConGuardarRelaciones(true);			
			this.tipomovimientoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.setVisible(true);
			
					
		} else {
			//this.tipomovimientoSessionBean.setConGuardarRelaciones(false);			
			this.tipomovimientoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoMovimiento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
				if(tipomovimientoAux.getId().equals(this.iIdNuevoTipoMovimiento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientos) {
				if(tipomovimientoAux.getId().equals(this.iIdNuevoTipoMovimiento)) {
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
	
	public int getIndiceActualTipoMovimiento(TipoMovimiento tipomovimiento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
				if(tipomovimientoAux.getId().equals(tipomovimiento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientos) {
				if(tipomovimientoAux.getId().equals(tipomovimiento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMovimiento(TipoMovimiento tipomovimientoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
				if(tipomovimientoAux.getTipoMovimientoOriginal().getId().equals(tipomovimientoOriginal.getId())) {
					existe=true;
					tipomovimientoOriginal.setId(tipomovimientoAux.getId());
					tipomovimientoOriginal.setVersionRow(tipomovimientoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento tipomovimientoAux:this.tipomovimientos) {
				if(tipomovimientoAux.getTipoMovimientoOriginal().getId().equals(tipomovimientoOriginal.getId())) {
					existe=true;
					tipomovimientoOriginal.setId(tipomovimientoAux.getId());
					tipomovimientoOriginal.setVersionRow(tipomovimientoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMovimiento(Boolean esParaCancelar) throws Exception {
		tipomovimientosAux=new ArrayList<TipoMovimiento>();
		tipomovimientoAux=new TipoMovimiento();
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
					if(tipomovimientoAux.getId()<0) {
						tipomovimientosAux.add(tipomovimientoAux);
					}		
				}
				this.iIdNuevoTipoMovimiento=0L;
				this.tipomovimientoLogic.getTipoMovimientos().removeAll(tipomovimientosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento tipomovimientoAux:this.tipomovimientos) {
					if(tipomovimientoAux.getId()<0) {
						tipomovimientosAux.add(tipomovimientoAux);
					}		
				}
				this.iIdNuevoTipoMovimiento=0L;
				this.tipomovimientos.removeAll(tipomovimientosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMovimiento 
					&& this.tipomovimientoLogic.getTipoMovimientos().size()>0
					) {
					tipomovimientoAux=this.tipomovimientoLogic.getTipoMovimientos().get(this.tipomovimientoLogic.getTipoMovimientos().size() - 1);
				
					if(tipomovimientoAux.getId()<0) {
						this.tipomovimientoLogic.getTipoMovimientos().remove(tipomovimientoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMovimiento && this.tipomovimientos.size()>0) {
					tipomovimientoAux=this.tipomovimientos.get(this.tipomovimientos.size() - 1);
				
					if(tipomovimientoAux.getId()<0) {
						this.tipomovimientos.remove(tipomovimientoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMovimiento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomovimiento.getId()<0) {
				this.tipomovimientoLogic.getTipoMovimientos().remove(this.tipomovimiento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomovimiento.getId()<0) {
				this.tipomovimientos.remove(this.tipomovimiento);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMovimiento(List<TipoMovimiento> tipomovimientosAux) throws Exception {
		TipoMovimientoConstantesFunciones.setEstadosInicialesTipoMovimiento(tipomovimientosAux);
	}
	
	public void setEstadosInicialesTipoMovimiento(TipoMovimiento tipomovimientoAux) throws Exception {
		TipoMovimientoConstantesFunciones.setEstadosInicialesTipoMovimiento(tipomovimientoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMovimientoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMovimientoActual()) {
				if(!this.isEsNuevoTipoMovimiento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMovimiento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMovimientoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Movimiento ?", "MANTENIMIENTO DE Tipo Movimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMovimiento tipomovimiento) throws Exception {
		TipoMovimientoConstantesFunciones.seleccionarAsignar(this.tipomovimiento,tipomovimiento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMovimiento=this.isPermisoActualizarOriginalTipoMovimiento;
			
			
			this.seleccionarAsignar(tipomovimiento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMovimientoConstantesFunciones.quitarEspaciosTipoMovimiento(this.tipomovimiento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomovimientoSessionBean.setsFuncionBusquedaRapida(this.tipomovimientoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMovimiento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMovimiento(esParaCancelar);				
				this.cancelarNuevoTipoMovimiento(esParaCancelar);								
			}
			
			this.tipomovimiento=new TipoMovimiento();
			
			this.inicializarTipoMovimiento();
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMovimiento() throws Exception {
		try {
			TipoMovimientoConstantesFunciones.inicializarTipoMovimiento(this.tipomovimiento);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomovimientoLogic.getTipoMovimientos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMovimientos(String sAccionBusqueda,List<TipoMovimiento> tipomovimientosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMovimiento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMovimientoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMovimientoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMovimiento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Movimientos");		
		parameters.put("busquedapor", TipoMovimientoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMovimiento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMovimientoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMovimientoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMovimiento=new JRBeanArrayDataSource(TipoMovimientoJInternalFrame.TraerTipoMovimientoBeans(tipomovimientosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMovimiento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMovimientoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMovimientoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMovimientoBean.TraerTipoMovimientoBeans(tipomovimientosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMovimientoActionPerformed(null);
					//this.generarExcelReporteTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMovimientos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMovimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento> tipomovimientosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimiento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMovimiento tipomovimiento : tipomovimientosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMovimientoConstantesFunciones.generarExcelReporteDataTipoMovimiento("NORMAL",row,workbook,tipomovimiento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMovimiento(String sTipo,Row row,Workbook workbook) {
		
		TipoMovimientoConstantesFunciones.generarExcelReporteHeaderTipoMovimiento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMovimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento> tipomovimientosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMovimiento tipomovimiento : tipomovimientosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimiento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimientoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimiento.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimientoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimiento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMovimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento> tipomovimientosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMovimiento> tipomovimientosRespaldo=null;
		
		classes=TipoMovimientoConstantesFunciones.getClassesRelationshipsOfTipoMovimiento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomovimientoLogic.setDatosCliente(this.datosCliente);
		this.tipomovimientoLogic.setDatosDeep(this.datosDeep);
		this.tipomovimientoLogic.setIsConDeep(true);
		
		tipomovimientosRespaldo=this.tipomovimientoLogic.getTipoMovimientos();
		
		this.tipomovimientoLogic.setTipoMovimientos(tipomovimientosParaReportes);	
		this.tipomovimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomovimientosParaReportes=this.tipomovimientoLogic.getTipoMovimientos();
		this.tipomovimientoLogic.setTipoMovimientos(tipomovimientosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimiento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMovimiento tipomovimiento : tipomovimientosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMovimiento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMovimientoConstantesFunciones.generarExcelReporteDataTipoMovimiento("NORMAL",row,workbook,tipomovimiento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimiento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMovimiento() throws Exception {		
		this.startProcessTipoMovimiento(true);
	}
	
	public void startProcessTipoMovimiento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoMovimiento, this.jScrollPanelDatosTipoMovimiento,this.jPanelPaginacionTipoMovimiento, this.jScrollPanelDatosEdicionTipoMovimiento, this.jPanelAccionesTipoMovimiento,this.jPanelAccionesFormularioTipoMovimiento,this.jmenuBarTipoMovimiento,this.jmenuBarDetalleTipoMovimiento,this.jTtoolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimiento=null; 
		
		final JPanel jPanelParametrosReportesTipoMovimiento=this.jPanelParametrosReportesTipoMovimiento;
		//final JScrollPane jScrollPanelDatosTipoMovimiento=this.jScrollPanelDatosTipoMovimiento;
		final JTable jTableDatosTipoMovimiento=this.jTableDatosTipoMovimiento;		
		final JPanel jPanelPaginacionTipoMovimiento=this.jPanelPaginacionTipoMovimiento;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimiento=this.jScrollPanelDatosEdicionTipoMovimiento;
		final JPanel jPanelAccionesTipoMovimiento=this.jPanelAccionesTipoMovimiento;
		
		JPanel jPanelCamposAuxiliarTipoMovimiento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimiento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			jPanelCamposAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jPanelCamposTipoMovimiento;
			jPanelAccionesFormularioAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jPanelAccionesFormularioTipoMovimiento;
		}
		
		final JPanel jPanelCamposTipoMovimiento=jPanelCamposAuxiliarTipoMovimiento;
		final JPanel jPanelAccionesFormularioTipoMovimiento=jPanelAccionesFormularioAuxiliarTipoMovimiento;
		
		
		final JMenuBar jmenuBarTipoMovimiento=this.jmenuBarTipoMovimiento;
		final JToolBar jTtoolBarTipoMovimiento=this.jTtoolBarTipoMovimiento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimiento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			jmenuBarDetalleAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jmenuBarDetalleTipoMovimiento;
			jTtoolBarDetalleAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jTtoolBarDetalleTipoMovimiento;
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimiento=jmenuBarDetalleAuxiliarTipoMovimiento;
		final JToolBar jTtoolBarDetalleTipoMovimiento=jTtoolBarDetalleAuxiliarTipoMovimiento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimiento;
			processRunnable.jTableDatos=jTableDatosTipoMovimiento;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimiento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimiento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimiento;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMovimiento ,jPanelParametrosReportesTipoMovimiento,jTableDatosTipoMovimiento, /*jScrollPanelDatosTipoMovimiento,*/jPanelCamposTipoMovimiento,jPanelPaginacionTipoMovimiento, /*jScrollPanelDatosEdicionTipoMovimiento,*/ jPanelAccionesTipoMovimiento,jPanelAccionesFormularioTipoMovimiento,jmenuBarTipoMovimiento,jmenuBarDetalleTipoMovimiento,jTtoolBarTipoMovimiento,jTtoolBarDetalleTipoMovimiento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoMovimiento, jScrollPanelDatosTipoMovimiento,jPanelPaginacionTipoMovimiento, jScrollPanelDatosEdicionTipoMovimiento, jPanelAccionesTipoMovimiento,jPanelAccionesFormularioTipoMovimiento,jmenuBarTipoMovimiento,jmenuBarDetalleTipoMovimiento,jTtoolBarTipoMovimiento,jTtoolBarDetalleTipoMovimiento);
						
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
	
	public void finishProcessTipoMovimiento() {// throws Exception 
		this.finishProcessTipoMovimiento(true);
	}
	
	public void finishProcessTipoMovimiento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoMovimiento, this.jScrollPanelDatosTipoMovimiento,this.jPanelPaginacionTipoMovimiento, this.jScrollPanelDatosEdicionTipoMovimiento, this.jPanelAccionesTipoMovimiento,this.jPanelAccionesFormularioTipoMovimiento,this.jmenuBarTipoMovimiento,this.jmenuBarDetalleTipoMovimiento,this.jTtoolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimiento=null; 
		
		final JPanel jPanelParametrosReportesTipoMovimiento=this.jPanelParametrosReportesTipoMovimiento;
		//final JScrollPane jScrollPanelDatosTipoMovimiento=this.jScrollPanelDatosTipoMovimiento;
		final JTable jTableDatosTipoMovimiento=this.jTableDatosTipoMovimiento;		
		final JPanel jPanelPaginacionTipoMovimiento=this.jPanelPaginacionTipoMovimiento;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimiento=this.jScrollPanelDatosEdicionTipoMovimiento;
		final JPanel jPanelAccionesTipoMovimiento=this.jPanelAccionesTipoMovimiento;
		
		JPanel jPanelCamposAuxiliarTipoMovimiento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimiento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			jPanelCamposAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jPanelCamposTipoMovimiento;
			jPanelAccionesFormularioAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jPanelAccionesFormularioTipoMovimiento;
		}
		
		final JPanel jPanelCamposTipoMovimiento=jPanelCamposAuxiliarTipoMovimiento;
		final JPanel jPanelAccionesFormularioTipoMovimiento=jPanelAccionesFormularioAuxiliarTipoMovimiento;
		
		
		final JMenuBar jmenuBarTipoMovimiento=this.jmenuBarTipoMovimiento;		
		final JToolBar jTtoolBarTipoMovimiento=this.jTtoolBarTipoMovimiento;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimiento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			jmenuBarDetalleAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jmenuBarDetalleTipoMovimiento;
			jTtoolBarDetalleAuxiliarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jTtoolBarDetalleTipoMovimiento;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimiento=jmenuBarDetalleAuxiliarTipoMovimiento;
		final JToolBar jTtoolBarDetalleTipoMovimiento=jTtoolBarDetalleAuxiliarTipoMovimiento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimiento;
			processRunnable.jTableDatos=jTableDatosTipoMovimiento;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimiento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimiento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimiento;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMovimiento ,jPanelParametrosReportesTipoMovimiento, jTableDatosTipoMovimiento,/*jScrollPanelDatosTipoMovimiento,*/jPanelCamposTipoMovimiento,jPanelPaginacionTipoMovimiento, /*jScrollPanelDatosEdicionTipoMovimiento,*/ jPanelAccionesTipoMovimiento,jPanelAccionesFormularioTipoMovimiento,jmenuBarTipoMovimiento,jmenuBarDetalleTipoMovimiento,jTtoolBarTipoMovimiento,jTtoolBarDetalleTipoMovimiento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMovimiento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMovimiento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMovimiento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMovimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMovimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMovimiento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMovimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMovimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMovimiento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomovimientoConstantesFunciones.getsFinalQueryTipoMovimiento();
		String  finalQueryPaginacionTodos=this.tipomovimientoConstantesFunciones.getsFinalQueryTipoMovimiento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesNoTipoMovimiento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomovimientosEliminados= new ArrayList<TipoMovimiento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMovimiento();
		
				///*TipoMovimientoSessionBean*/this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
			
			if(this.tipomovimientoSessionBean==null) {
				this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
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
					this.iNumeroPaginacion=TipoMovimientoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMovimientoConstantesFunciones.getClassesForeignKeysOfTipoMovimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomovimiento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomovimientosAux= new ArrayList<TipoMovimiento>();
			
				
			tipomovimientoLogic.setDatosCliente(this.datosCliente);
			tipomovimientoLogic.setDatosDeep(this.datosDeep);
			tipomovimientoLogic.setIsConDeep(true);
			
			
			tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomovimientoLogic.getTodosTipoMovimientos(finalQueryGlobal,pagination);
					
					//tipomovimientoLogic.getTodosTipoMovimientosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomovimientoLogic.getTipoMovimientos()==null|| tipomovimientoLogic.getTipoMovimientos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientosAux= new ArrayList<TipoMovimiento>();
							tipomovimientosAux.addAll(tipomovimientoLogic.getTipoMovimientos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientosAux= new ArrayList<TipoMovimiento>();
							tipomovimientosAux.addAll(tipomovimientos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientoLogic.getTodosTipoMovimientos(finalQueryGlobal+"",this.pagination);												
							
							//tipomovimientoLogic.getTodosTipoMovimientosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMovimientos("Todos",tipomovimientoLogic.getTipoMovimientos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientoLogic.setTipoMovimientos(new ArrayList<TipoMovimiento>());					
							tipomovimientoLogic.getTipoMovimientos().addAll(tipomovimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientos=new ArrayList<TipoMovimiento>();
							tipomovimientos.addAll(tipomovimientosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMovimiento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMovimiento=this.idActual;
				
				} else if(this.idTipoMovimientoActual!=null && this.idTipoMovimientoActual!=0L) {
					idTipoMovimiento=idTipoMovimientoActual;
				}
				
					
				this.sDetalleReporte=TipoMovimientoConstantesFunciones.getDetalleIndicePorId(idTipoMovimiento);
				
				this.tipomovimientos=new ArrayList<TipoMovimiento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomovimientoLogic.getEntity(idTipoMovimiento);
					
					//tipomovimientoLogic.getEntityWithConnection(idTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.setTipoMovimientos(new ArrayList<TipoMovimiento>());
					tipomovimientoLogic.getTipoMovimientos().add(tipomovimientoLogic.getTipoMovimiento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimientos=new ArrayList<TipoMovimiento>();
					this.tipomovimientos.add(tipomovimiento);
				}
				
				if(tipomovimientoLogic.getTipoMovimiento()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMovimiento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMovimiento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimientoLogic.getTipoMovimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimientoLogic.getTipoMovimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMovimiento tipomovimiento) {
		Boolean permite=true;
		
		if(this.tipomovimiento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMovimientoConstantesFunciones.getOrderByListaTipoMovimiento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMovimientoConstantesFunciones.getOrderByListaTipoMovimiento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento tipomovimiento:tipomovimientoLogic.getTipoMovimientos()) {
				if(tipomovimiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientoTotales=tipomovimiento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento tipomovimiento:this.tipomovimientos) {
				if(tipomovimiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientoTotales=tipomovimiento;
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
			this.tipomovimientoAux=new TipoMovimiento();
			this.tipomovimientoAux.setsType(Constantes2.S_TOTALES);
			this.tipomovimientoAux.setIsNew(false);
			this.tipomovimientoAux.setIsChanged(false);
			this.tipomovimientoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMovimientoConstantesFunciones.TotalizarValoresFilaTipoMovimiento(this.tipomovimientoLogic.getTipoMovimientos(),this.tipomovimientoAux);
				
				this.tipomovimientoLogic.getTipoMovimientos().add(this.tipomovimientoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMovimientoConstantesFunciones.TotalizarValoresFilaTipoMovimiento(this.tipomovimientos,this.tipomovimientoAux);
				
				this.tipomovimientos.add(this.tipomovimientoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomovimientoTotales=new TipoMovimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimientoLogic.getTipoMovimientos().remove(tipomovimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimientos.remove(tipomovimientoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomovimientoTotales=new TipoMovimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento tipomovimiento:tipomovimientoLogic.getTipoMovimientos()) {
				if(tipomovimiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientoTotales=tipomovimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimientoConstantesFunciones.TotalizarValoresFilaTipoMovimiento(this.tipomovimientoLogic.getTipoMovimientos(),tipomovimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento tipomovimiento:this.tipomovimientos) {
				if(tipomovimiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientoTotales=tipomovimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimientoConstantesFunciones.TotalizarValoresFilaTipoMovimiento(this.tipomovimientos,tipomovimientoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMovimientoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoMovimientoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getTipoMovimientoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosTipoMovimiento() {
		this.isPermisoTodoTipoMovimiento=false;
		this.isPermisoNuevoTipoMovimiento=false;
		this.isPermisoActualizarTipoMovimiento=false;
		this.isPermisoActualizarOriginalTipoMovimiento=false;
		this.isPermisoEliminarTipoMovimiento=false;
		this.isPermisoGuardarCambiosTipoMovimiento=false;
		this.isPermisoConsultaTipoMovimiento=false;
		this.isPermisoBusquedaTipoMovimiento=false;
		this.isPermisoReporteTipoMovimiento=false;		
		this.isPermisoOrdenTipoMovimiento=false;		
		this.isPermisoPaginacionMedioTipoMovimiento=false;		
		this.isPermisoPaginacionAltoTipoMovimiento=false;
		this.isPermisoPaginacionTodoTipoMovimiento=false;
		this.isPermisoCopiarTipoMovimiento=false;		
		this.isPermisoVerFormTipoMovimiento=false;		
		this.isPermisoDuplicarTipoMovimiento=false;		
		this.isPermisoOrdenTipoMovimiento=false;		
	}
	
	public void setPermisosUsuarioTipoMovimiento(Boolean isPermiso) {
		this.isPermisoTodoTipoMovimiento=isPermiso;
		this.isPermisoNuevoTipoMovimiento=isPermiso;
		this.isPermisoActualizarTipoMovimiento=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimiento=isPermiso;
		this.isPermisoEliminarTipoMovimiento=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimiento=isPermiso;
		this.isPermisoConsultaTipoMovimiento=isPermiso;
		this.isPermisoBusquedaTipoMovimiento=isPermiso;
		this.isPermisoReporteTipoMovimiento=isPermiso;
		this.isPermisoOrdenTipoMovimiento=isPermiso;		
		this.isPermisoPaginacionMedioTipoMovimiento=isPermiso;		
		this.isPermisoPaginacionAltoTipoMovimiento=isPermiso;		
		this.isPermisoPaginacionTodoTipoMovimiento=isPermiso;		
		this.isPermisoCopiarTipoMovimiento=isPermiso;		
		this.isPermisoVerFormTipoMovimiento=isPermiso;		
		this.isPermisoDuplicarTipoMovimiento=isPermiso;
		this.isPermisoOrdenTipoMovimiento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMovimiento(Boolean isPermiso) {
		//this.isPermisoTodoTipoMovimiento=isPermiso;
		this.isPermisoNuevoTipoMovimiento=isPermiso;
		this.isPermisoActualizarTipoMovimiento=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimiento=isPermiso;
		this.isPermisoEliminarTipoMovimiento=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimiento=isPermiso;
		//this.isPermisoConsultaTipoMovimiento=isPermiso;
		//this.isPermisoBusquedaTipoMovimiento=isPermiso;
		//this.isPermisoReporteTipoMovimiento=isPermiso;
		//this.isPermisoOrdenTipoMovimiento=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMovimiento=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMovimiento=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMovimiento=isPermiso;		
		//this.isPermisoCopiarTipoMovimiento=isPermiso;		
		//this.isPermisoDuplicarTipoMovimiento=isPermiso;
		//this.isPermisoOrdenTipoMovimiento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimientoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoMovimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMovimiento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimientoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMovimientoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMovimientoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMovimientoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoMovimiento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMovimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMovimientoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMovimiento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMovimiento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMovimiento=this.isPermisoActualizarTipoMovimiento;
			this.isPermisoEliminarTipoMovimiento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMovimiento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMovimiento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMovimiento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMovimiento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMovimiento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMovimiento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMovimiento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMovimiento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMovimiento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMovimiento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMovimiento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMovimiento.setToolTipText(this.jTableDatosTipoMovimiento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMovimiento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMovimiento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMovimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMovimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMovimiento() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoMovimientoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMovimientoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMovimientoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMovimiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoMovimiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMovimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMovimiento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento(TipoMovimiento tipomovimiento)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMovimiento(TipoMovimiento tipomovimiento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMovimiento()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMovimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMovimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMovimiento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMovimiento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMovimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoMovimientoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMovimientoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMovimientoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomovimientoSessionBean=new TipoMovimientoSessionBean(); 
		this.tipomovimientoConstantesFunciones=new TipoMovimientoConstantesFunciones(); 
		this.tipomovimientoBean=new TipoMovimiento();//(this.tipomovimientoConstantesFunciones); 		
		this.tipomovimientoReturnGeneral=new TipoMovimientoParameterReturnGeneral(); 
		
		this.tipomovimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMovimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMovimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMovimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMovimiento(true);
			
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
			
			this.tipomovimientoConstantesFunciones=new TipoMovimientoConstantesFunciones(); 
			this.tipomovimientoBean=new TipoMovimiento();//this.tipomovimientoConstantesFunciones); 			
			this.tipomovimientoReturnGeneral=new TipoMovimientoParameterReturnGeneral(); 
		
			TipoMovimientoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomovimiento=new TipoMovimiento();
			this.tipomovimientos = new ArrayList<TipoMovimiento>();
			this.tipomovimientosAux = new ArrayList<TipoMovimiento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic=new TipoMovimientoLogic();
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomovimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomovimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMovimiento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimiento);	
					}
					
					if(this.jInternalFrameImportacionTipoMovimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimiento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMovimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMovimiento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimiento);
				this.jInternalFrameDetalleFormTipoMovimiento.setVisible(false);
				this.jInternalFrameDetalleFormTipoMovimiento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimiento);
					this.jInternalFrameReporteDinamicoTipoMovimiento.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMovimiento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMovimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimiento);
					this.jInternalFrameImportacionTipoMovimiento.setVisible(false);
					this.jInternalFrameImportacionTipoMovimiento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMovimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimiento);
					this.jInternalFrameOrderByTipoMovimiento.setVisible(false);
					this.jInternalFrameOrderByTipoMovimiento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMovimientoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMovimientoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomovimientoReturnGeneral=new TipoMovimientoParameterReturnGeneral();
			
			this.tipomovimientoParameterGeneral=new TipoMovimientoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomovimientoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMovimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimientoSessionBean.getEsGuardarRelacionado(),this.tipomovimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimientoSessionBean.getEsGuardarRelacionado(),this.tipomovimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaDuplicarTipoMovimiento=true;
			this.isVisibilidadCeldaCopiarTipoMovimiento=true;
			this.isVisibilidadCeldaVerFormTipoMovimiento=true;
			this.isVisibilidadCeldaOrdenTipoMovimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMovimiento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMovimiento(false);
			
			this.setPermisosUsuarioTipoMovimiento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomovimientoSessionBean.getEsGuardarRelacionado() && this.tipomovimientoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMovimientoClasesRelacionadas();
			}
			
			if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMovimientoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMovimiento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMovimiento();
			}
			
			if(!this.isPermisoBusquedaTipoMovimiento) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMovimiento,this.isPermisoPaginacionMedioTipoMovimiento,this.isPermisoPaginacionTodoTipoMovimiento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMovimientoConstantesFunciones.getTiposSeleccionarTipoMovimiento());
				
				this.tiposColumnasSelect=TipoMovimientoConstantesFunciones.getTiposSeleccionarTipoMovimiento(true);
				
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
			//if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMovimiento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoMovimiento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoMovimiento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento() ;
			
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
				tipomovimientoImplementable= (TipoMovimientoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomovimientoImplementableHome= (TipoMovimientoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomovimientos= new ArrayList<TipoMovimiento>();
			this.tipomovimientosEliminados= new ArrayList<TipoMovimiento>();
						
			this.isEsNuevoTipoMovimiento=false;
			this.esParaAccionDesdeFormularioTipoMovimiento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMovimiento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMovimiento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMovimientoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMovimiento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMovimiento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMovimiento();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMovimiento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMovimiento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMovimiento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMovimiento")) {
				iIndex=this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMovimiento();	
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
	
	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMovimiento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMovimientoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMovimiento();
		
		this.cargarCombosFrameForeignKeyTipoMovimiento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMovimiento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMovimiento();
		}
	}
	
	
	
	public void jButtonNuevoTipoMovimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			
			if(jTableDatosTipoMovimiento.getRowCount()>=1) {
				jTableDatosTipoMovimiento.removeRowSelectionInterval(0, jTableDatosTipoMovimiento.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMovimiento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMovimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMovimiento(true);			
			//this.tipomovimiento=new TipoMovimiento();
			//this.tipomovimiento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento() ;
			
			if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomovimiento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);				
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMovimiento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMovimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMovimiento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMovimiento.getSelectedRows().length;			
			}
			
			tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMovimiento--;			
				//TipoMovimiento tipomovimientoAux= new TipoMovimiento();			
				//tipomovimientoAux.setId(this.iIdNuevoTipoMovimiento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMovimiento tipomovimientoOrigen=new TipoMovimiento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMovimiento tipomovimientoOrigen : tipomovimientosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomovimientoOrigen =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientoOrigen =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMovimiento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomovimiento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMovimiento(tipomovimientoOrigen,this.tipomovimiento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimientoLogic.getTipoMovimientos().add(this.tipomovimientoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimientos.add(this.tipomovimientoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
				
				this.jTableDatosTipoMovimiento.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento(), this.getIndiceNuevoTipoMovimiento());
				
				int iLastRow =  this.jTableDatosTipoMovimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();									
		
			TipoMovimiento tipomovimientoOrigen=new TipoMovimiento();
			TipoMovimiento tipomovimientoDestino=new TipoMovimiento();
				
			tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMovimiento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomovimientosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMovimiento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientoOrigen =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimientoOrigen =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientoDestino =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimientoDestino =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomovimientoOrigen =tipomovimientosSeleccionados.get(0);
				tipomovimientoDestino =tipomovimientosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMovimiento(tipomovimientoOrigen,tipomovimientoDestino,true,false);
				
				tipomovimientoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimientoDestino,tipomovimientoLogic.getTipoMovimientos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientoDestino,tipomovimientos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
				
				//this.jTableDatosTipoMovimiento.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento(), this.getIndiceNuevoTipoMovimiento());
				
				int iLastRow =  this.jTableDatosTipoMovimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMovimiento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMovimiento.isVisible();
			
			
			this.jPanelParametrosReportesTipoMovimiento.setVisible(!isVisible);
			this.jPanelPaginacionTipoMovimiento.setVisible(!isVisible);
			this.jPanelAccionesTipoMovimiento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMovimiento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMovimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMovimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMovimiento();
			
			this.abrirFrameOrderByTipoMovimiento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMovimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMovimiento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimiento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMovimiento.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMovimiento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMovimiento.setSize(this.jInternalFrameDetalleFormTipoMovimiento.iWidthFormulario,this.jInternalFrameDetalleFormTipoMovimiento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMovimiento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMovimiento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMovimiento.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMovimiento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimiento.jContentPaneDetalleTipoMovimiento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento.jContentPaneDetalleTipoMovimiento.getWidth(),TipoMovimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento.jContentPaneDetalleTipoMovimiento.getWidth(),TipoMovimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento.jContentPaneDetalleTipoMovimiento.getWidth(),TipoMovimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMovimiento.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMovimiento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMovimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMovimiento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMovimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento,false,this);
				} else {
					this.jInternalFrameOrderByTipoMovimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimiento);
				this.jInternalFrameOrderByTipoMovimiento.setVisible(false);
				this.jInternalFrameOrderByTipoMovimiento.setSelected(false);
				
				this.jInternalFrameOrderByTipoMovimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimiento"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMovimiento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMovimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMovimiento==null) {
				
				this.jInternalFrameImportacionTipoMovimiento=new ImportacionJInternalFrame(TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimiento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimiento);
				this.jInternalFrameImportacionTipoMovimiento.setVisible(false);
				this.jInternalFrameImportacionTipoMovimiento.setSelected(false);


				this.jInternalFrameImportacionTipoMovimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimiento"));
				this.jInternalFrameImportacionTipoMovimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimiento"));
				this.jInternalFrameImportacionTipoMovimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimiento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMovimiento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento==null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento=new ReporteDinamicoJInternalFrame(TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimiento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimiento);
				this.jInternalFrameReporteDinamicoTipoMovimiento.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMovimiento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento"));
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento"));
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoMovimiento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimiento);
			
	       	this.jInternalFrameDetalleFormTipoMovimiento.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMovimiento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMovimiento.dispose();
			//this.jInternalFrameDetalleFormTipoMovimiento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMovimiento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMovimiento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMovimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMovimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMovimiento.setVisible(true);
	        this.jInternalFrameImportacionTipoMovimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMovimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMovimiento.setVisible(true);
	        this.jInternalFrameOrderByTipoMovimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMovimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMovimiento.setVisible(false);
	        this.jInternalFrameOrderByTipoMovimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMovimiento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMovimiento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMovimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMovimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMovimiento.setVisible(false);
	        this.jInternalFrameImportacionTipoMovimiento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMovimiento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMovimiento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMovimiento(true);
			//this.isEsNuevoTipoMovimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento(false) ;
			
			if(tipomovimientoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMovimientoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMovimiento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMovimiento(true);
			//this.isEsNuevoTipoMovimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomovimiento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMovimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMovimiento(false) ;
			
			if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimiento(false);
			
			//if(!this.isEsNuevoTipoMovimiento) {								
				int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
				
			}
			
			if(this.permiteMantenimiento(this.tipomovimiento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMovimiento=true;
					this.inicializarActualizarBindingTablaTipoMovimiento(false);
					this.isEsNuevoTipoMovimiento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMovimiento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMovimiento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento(false);
				
				this.habilitarDeshabilitarControlesTipoMovimiento(false);
			
												
				
				if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMovimiento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMovimientoActionPerformed(evt,tipomovimientoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMovimiento(this.tipomovimiento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMovimiento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomovimientoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomovimiento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimiento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimiento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomovimiento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMovimientoModel) this.jTableDatosTipoMovimiento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMovimiento=true;
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
				this.isEsNuevoTipoMovimiento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento(false);
				
				this.habilitarDeshabilitarControlesTipoMovimiento(false);
				
				
				
				if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMovimiento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMovimiento.getRowCount()>=1) {
				jTableDatosTipoMovimiento.removeRowSelectionInterval(0, jTableDatosTipoMovimiento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMovimiento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMovimiento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento(false) ;
			
			this.isEsNuevoTipoMovimiento=false;
			
			if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMovimiento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMovimiento(false);
				
				//SI ES MANUAL
				if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMovimiento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMovimiento--;			
			//TipoMovimiento tipomovimientoAux= new TipoMovimiento();			
			//tipomovimientoAux.setId(this.iIdNuevoTipoMovimiento);
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMovimiento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
			
			this.tipomovimiento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomovimientoLogic.getTipoMovimientos().add(this.tipomovimientoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomovimientos.add(this.tipomovimientoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMovimiento(false);
			
			this.jTableDatosTipoMovimiento.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento(), this.getIndiceNuevoTipoMovimiento());
			
			int iLastRow =  this.jTableDatosTipoMovimiento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMovimiento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMovimiento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento(false);
			
			//SI ES MANUAL
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento();
			}
			
			//this.abrirFrameTreeTipoMovimiento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo MovimientoS ?", "MANTENIMIENTO DE Tipo Movimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMovimiento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMovimiento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomovimientoReturnGeneral=tipomovimientoLogic.procesarImportacionTipoMovimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomovimientoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMovimientoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMovimiento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMovimiento.setFileImportacion(this.jInternalFrameImportacionTipoMovimiento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMovimiento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMovimiento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMovimiento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMovimiento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		

		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMovimientoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMovimientoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimientoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMovimientoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoMovimiento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMovimientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMovimientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMovimientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMovimientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimientoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMovimientoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMovimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMovimientoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMovimiento tipomovimiento:tipomovimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimiento.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMovimientoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMovimiento tipomovimiento:tipomovimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimiento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoMovimiento(row);				
			//	iRow++;
			//}				
			
			//for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMovimiento(tipomovimientoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento(false);
			
			//SI ES MANUAL
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento(false);
			
			//SI ES MANUAL
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimiento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMovimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento(false);
			
			//SI ES MANUAL
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimiento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMovimiento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMovimiento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMovimiento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMovimiento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMovimiento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMovimiento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMovimiento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMovimiento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMovimiento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMovimiento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMovimiento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMovimiento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMovimiento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMovimiento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimiento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMovimiento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMovimiento();
		
		this.inicializarActualizarBindingBotonesManualTipoMovimiento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimiento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMovimiento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMovimiento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMovimiento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionNuevoTipoMovimiento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionSinCerrarTipoMovimiento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionSinMensajeTipoMovimiento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMovimiento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMovimiento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMovimiento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
				this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionNuevoTipoMovimiento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionSinCerrarTipoMovimiento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMovimiento.jCheckBoxPostAccionSinMensajeTipoMovimiento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMovimiento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMovimiento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMovimiento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMovimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMovimiento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMovimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMovimiento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMovimiento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMovimiento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMovimiento(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento() throws Exception {
		try	{
			if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimiento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimiento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimiento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMovimiento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMovimiento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMovimiento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMovimiento.addItem(reporte);
			}
			
			
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMovimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMovimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMovimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMovimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMovimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMovimiento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMovimiento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMovimiento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimiento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMovimiento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMovimiento(Boolean esInicializar) throws Exception {				
		if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimiento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMovimiento() throws Exception {
		this.inicializarActualizarBindingTablaTipoMovimiento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMovimiento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMovimientoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMovimiento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomovimientoLogic.getTipoMovimientos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomovimientos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMovimiento.setModel(new TipoMovimientoModel(this.tipomovimientoLogic.getTipoMovimientos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMovimiento.setModel(new TipoMovimientoModel(this.tipomovimientos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMovimiento!=null && this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMovimiento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMovimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,tipomovimientoConstantesFunciones.resaltarSeleccionarTipoMovimiento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,tipomovimientoConstantesFunciones.resaltarSeleccionarTipoMovimiento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMovimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,TipoMovimientoConstantesFunciones.LABEL_ID));

		if(this.tipomovimientoConstantesFunciones.mostraridTipoMovimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomovimientoConstantesFunciones.resaltaridTipoMovimiento,this.tipomovimientoConstantesFunciones.activaridTipoMovimiento,this,true,"idTipoMovimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientoConstantesFunciones.resaltaridTipoMovimiento,this.tipomovimientoConstantesFunciones.activaridTipoMovimiento,this,true,"idTipoMovimiento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,TipoMovimientoConstantesFunciones.LABEL_CODIGO));

		if(this.tipomovimientoConstantesFunciones.mostrarcodigoTipoMovimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimientoConstantesFunciones.resaltarcodigoTipoMovimiento,this.tipomovimientoConstantesFunciones.activarcodigoTipoMovimiento,this,true,"codigoTipoMovimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientoConstantesFunciones.resaltarcodigoTipoMovimiento,this.tipomovimientoConstantesFunciones.activarcodigoTipoMovimiento,this,true,"codigoTipoMovimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,TipoMovimientoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomovimientoConstantesFunciones.mostrarnombreTipoMovimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimientoConstantesFunciones.resaltarnombreTipoMovimiento,this.tipomovimientoConstantesFunciones.activarnombreTipoMovimiento,this,true,"nombreTipoMovimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientoConstantesFunciones.resaltarnombreTipoMovimiento,this.tipomovimientoConstantesFunciones.activarnombreTipoMovimiento,this,true,"nombreTipoMovimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMovimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimiento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimiento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomovimientoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMovimiento.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMovimiento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMovimiento.moveColumn(this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMovimiento.moveColumn(this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMovimiento.moveColumn(this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMovimiento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMovimiento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMovimiento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMovimiento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMovimiento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMovimiento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMovimiento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomovimientoLogic.getTipoMovimientos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomovimientos.size()-1;
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
		//this.jTableDatosTipoMovimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMovimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMovimiento();
			
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
				
				//this.isEsNuevoTipoMovimiento=false;
					
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
				if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimiento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimiento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomovimiento.getsType().equals("DUPLICADO")
				   || this.tipomovimiento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMovimiento=true;
				
				} else {
					this.isEsNuevoTipoMovimiento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomovimiento.getId()>=0 && !this.tipomovimiento.getIsNew()) {						
						this.isEsNuevoTipoMovimiento=false;
						
					} else {
						this.isEsNuevoTipoMovimiento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMovimiento(esRelaciones);						
				
				this.seleccionarTipoMovimiento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomovimiento.getId()<0) {
					this.isEsNuevoTipoMovimiento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMovimiento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMovimiento(evt,rowIndex);
				}	
				
				if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMovimiento: " + this.dDif); 
					}
				}								
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMovimiento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomovimiento)) {
					if(this.tipomovimiento.getId()>0) {
						this.tipomovimiento.setIsDeleted(true);
						
						this.tipomovimientosEliminados.add(this.tipomovimiento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimientoLogic.getTipoMovimientos().remove(this.tipomovimiento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimientos.remove(this.tipomovimiento);				
					}
					
					
					((TipoMovimientoModel) this.jTableDatosTipoMovimiento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMovimiento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMovimiento) {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimiento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMovimiento(this.tipomovimiento);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMovimiento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMovimiento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimiento(TipoMovimiento tipomovimiento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMovimiento(tipomovimiento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimiento(TipoMovimiento tipomovimiento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMovimiento(tipomovimiento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMovimiento(tipomovimiento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento(tipomovimiento);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMovimiento(TipoMovimiento tipomovimiento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setText(tipomovimiento.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setText(tipomovimiento.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setText(tipomovimiento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMovimiento tipomovimientoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomovimientoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMovimiento tipomovimientoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomovimientoLocal=this.tipomovimiento;
			} else {
				tipomovimientoLocal=this.tipomovimientoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomovimientoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoLocal,true);
					
					if(tipomovimientoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomovimientoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomovimientoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMovimiento(TipoMovimiento tipomovimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimiento(tipomovimiento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(tipomovimiento);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimiento(TipoMovimiento tipomovimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimiento(tipomovimiento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimiento(TipoMovimiento tipomovimiento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.getText()==null || this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.getText()=="" || this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setText("0");
			}

			if(conColumnasBase) {tipomovimiento.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento.jLabelIdTipoMovimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimiento.setcodigo(this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento.jLabelcodigoTipoMovimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimiento.setnombre(this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento.jLabelnombreTipoMovimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimiento(TipoMovimiento tipomovimientoBean,TipoMovimiento tipomovimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMovimiento(TipoMovimiento tipomovimientoOrigen,TipoMovimiento tipomovimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimientoOrigen.getId()!=null && !tipomovimientoOrigen.getId().equals(0L))) {tipomovimiento.setId(tipomovimientoOrigen.getId());}}
			if(conDefault || (!conDefault && tipomovimientoOrigen.getcodigo()!=null && !tipomovimientoOrigen.getcodigo().equals(""))) {tipomovimiento.setcodigo(tipomovimientoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomovimientoOrigen.getnombre()!=null && !tipomovimientoOrigen.getnombre().equals(""))) {tipomovimiento.setnombre(tipomovimientoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimiento(TipoMovimiento tipomovimiento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setText(tipomovimiento.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setText(tipomovimiento.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setText(tipomovimiento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimiento(TipoMovimientoBean tipomovimientoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setText(tipomovimientoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setText(tipomovimientoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setText(tipomovimientoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMovimiento(TipoMovimientoParameterReturnGeneral tipomovimientoReturnGeneral,TipoMovimientoBean tipomovimientoBean,Boolean conDefault) throws Exception { 
		try {
			TipoMovimiento tipomovimientoLocal=new TipoMovimiento();
			
			tipomovimientoLocal=tipomovimientoReturnGeneral.getTipoMovimiento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimientoLocal.getId()!=null && !tipomovimientoLocal.getId().equals(0L))) {tipomovimientoBean.setId(tipomovimientoLocal.getId());}}
			if(conDefault || (!conDefault && tipomovimientoLocal.getcodigo()!=null && !tipomovimientoLocal.getcodigo().equals(""))) {tipomovimientoBean.setcodigo(tipomovimientoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomovimientoLocal.getnombre()!=null && !tipomovimientoLocal.getnombre().equals(""))) {tipomovimientoBean.setnombre(tipomovimientoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMovimientoGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxTipoMovimiento,List<TipoMovimiento> tipomovimientosLocal)throws Exception {
		try {
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosLocal) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			jComboBoxTipoMovimiento.setSelectedItem(tipomovimientoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMovimientoGenerico(JComboBox jComboBoxTipoMovimiento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMovimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMovimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimiento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMovimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimiento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMovimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMovimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMovimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimiento=(TipoMovimiento) tipomovimientoLogic.getTipoMovimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimiento =(TipoMovimiento) tipomovimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMovimiento tipomovimientoRow=new TipoMovimiento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimientoRow=(TipoMovimiento) tipomovimientoLogic.getTipoMovimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimientoRow=(TipoMovimiento) tipomovimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMovimiento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento));			
			this.jButtonDuplicarTipoMovimiento.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento && this.isPermisoDuplicarTipoMovimiento));			
			this.jButtonCopiarTipoMovimiento.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento && this.isPermisoCopiarTipoMovimiento));
			this.jButtonVerFormTipoMovimiento.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento && this.isPermisoVerFormTipoMovimiento));
			
			this.jButtonAbrirOrderByTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));			
			
			this.jButtonNuevoRelacionesTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento && this.isPermisoNuevoTipoMovimiento));			
			this.jButtonNuevoGuardarCambiosTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarTipoMovimiento.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento && this.isPermisoEliminarTipoMovimiento));
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento);							
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento));						
			this.jButtonDuplicarToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento && this.isPermisoDuplicarTipoMovimiento));						
			this.jButtonCopiarToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento && this.isPermisoCopiarTipoMovimiento));			
			this.jButtonVerFormToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento && this.isPermisoVerFormTipoMovimiento));			
			this.jButtonAbrirOrderByToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));
			this.jButtonNuevoRelacionesToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento && this.isPermisoNuevoTipoMovimiento));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));			
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento  && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento && this.isPermisoEliminarTipoMovimiento));
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarToolBarTipoMovimiento.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento);				
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento));			
			this.jMenuItemDuplicarTipoMovimiento.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento && this.isPermisoDuplicarTipoMovimiento));			
			this.jMenuItemCopiarTipoMovimiento.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento && this.isPermisoCopiarTipoMovimiento));			
			this.jMenuItemVerFormTipoMovimiento.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento && this.isPermisoVerFormTipoMovimiento));			
			this.jMenuItemAbrirOrderByTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));			
			//this.jMenuItemMostrarOcultarTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));
			this.jMenuItemDetalleAbrirOrderByTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));			
			//this.jMenuItemDetalleMostrarOcultarTipoMovimiento.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento && this.isPermisoOrdenTipoMovimiento));			
			this.jMenuItemNuevoRelacionesTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento && this.isPermisoNuevoTipoMovimiento));			
			this.jMenuItemNuevoGuardarCambiosTipoMovimiento.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento && this.isPermisoNuevoTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));									
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemModificarTipoMovimiento.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemActualizarTipoMovimiento.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento && this.isPermisoActualizarTipoMovimiento));	
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemEliminarTipoMovimiento.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento && this.isPermisoEliminarTipoMovimiento));
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemCancelarTipoMovimiento.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento);				
			}
			
			this.jMenuItemGuardarCambiosTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));						
			this.jMenuItemGuardarCambiosTablaTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimiento=this.jButtonNuevoTipoMovimiento.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMovimiento=this.jButtonDuplicarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaCopiarTipoMovimiento=this.jButtonCopiarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaVerFormTipoMovimiento=this.jButtonVerFormTipoMovimiento.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMovimiento=this.jButtonAbrirOrderByTipoMovimiento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=this.jButtonNuevoRelacionesTipoMovimiento.isVisible();
			this.isVisibilidadCeldaModificarTipoMovimiento=this.jButtonModificarTipoMovimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.isVisibilidadCeldaActualizarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaGuardarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=this.jButtonGuardarCambiosTablaTipoMovimiento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMovimiento=this.jButtonNuevoToolBarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=this.jButtonNuevoRelacionesToolBarTipoMovimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.isVisibilidadCeldaModificarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarToolBarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarToolBarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarToolBarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarToolBarTipoMovimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimiento=this.jButtonGuardarCambiosToolBarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=this.jButtonGuardarCambiosTablaToolBarTipoMovimiento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMovimiento=this.jMenuItemNuevoTipoMovimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=this.jMenuItemNuevoRelacionesTipoMovimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.isVisibilidadCeldaModificarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemModificarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemActualizarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemEliminarTipoMovimiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento=this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemCancelarTipoMovimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimiento=this.jMenuItemGuardarCambiosTipoMovimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=this.jMenuItemGuardarCambiosTablaTipoMovimiento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMovimiento(Boolean esInicializar) {
		if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimiento();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMovimiento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMovimiento() {
		this.jButtonNuevoTipoMovimiento.setVisible(this.isPermisoNuevoTipoMovimiento);			
		this.jButtonDuplicarTipoMovimiento.setVisible(this.isPermisoDuplicarTipoMovimiento);			
		this.jButtonCopiarTipoMovimiento.setVisible(this.isPermisoCopiarTipoMovimiento);			
		this.jButtonVerFormTipoMovimiento.setVisible(this.isPermisoVerFormTipoMovimiento);			
		
		this.jButtonAbrirOrderByTipoMovimiento.setVisible(this.isPermisoOrdenTipoMovimiento);					
		
		this.jButtonNuevoRelacionesTipoMovimiento.setVisible(this.isPermisoNuevoTipoMovimiento);			
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarTipoMovimiento.setVisible(this.isPermisoActualizarTipoMovimiento);	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.setVisible(this.isPermisoActualizarTipoMovimiento);	
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.setVisible(this.isPermisoEliminarTipoMovimiento);
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento);						
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.setVisible(this.isPermisoGuardarCambiosTipoMovimiento);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.setVisible(this.isPermisoActualizarTipoMovimiento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimiento() {
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarTipoMovimiento.setVisible(this.isPermisoActualizarTipoMovimiento);	
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.setVisible(this.isPermisoActualizarTipoMovimiento);	
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.setVisible(this.isPermisoEliminarTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento);							
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento && this.isPermisoGuardarCambiosTipoMovimiento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMovimiento() {
		if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMovimiento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMovimiento() {
	}
	
	public void jTableDatosTipoMovimientoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMovimiento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMovimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.gettipomovimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento==null) {
						this.tipomovimiento = new TipoMovimiento();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
				}

				if(this.tipomovimiento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomovimiento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMovimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.gettipomovimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento==null) {
						this.tipomovimiento = new TipoMovimiento();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
				}

				if(this.tipomovimiento.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomovimiento.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMovimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.gettipomovimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento==null) {
						this.tipomovimiento = new TipoMovimiento();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);
				}

				if(this.tipomovimiento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomovimiento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoMovimiento() {
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMovimiento.dispose();
			this.jInternalFrameDetalleFormTipoMovimiento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
			this.jInternalFrameReporteDinamicoTipoMovimiento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMovimiento.dispose();
			this.jInternalFrameReporteDinamicoTipoMovimiento=null;
		}
		
		if(this.jInternalFrameImportacionTipoMovimiento!=null) {
			this.jInternalFrameImportacionTipoMovimiento.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMovimiento.dispose();
			this.jInternalFrameImportacionTipoMovimiento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMovimiento();
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMovimiento")) {
				jButtonDuplicarTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMovimiento")) {
				jButtonCopiarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMovimiento")) {
				jButtonVerFormTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMovimiento")) {
				jButtonDuplicarTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMovimiento")) {
				jButtonDuplicarTipoMovimientoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMovimiento")) {
				jButtonModificarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMovimiento")) {
				jButtonModificarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMovimiento")) {
				jButtonModificarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMovimiento")) {
				jButtonActualizarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMovimiento")) {
				jButtonActualizarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMovimiento")) {
				jButtonActualizarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMovimiento")) {
				jButtonEliminarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMovimiento")) {
				jButtonEliminarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMovimiento")) {
				jButtonEliminarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMovimiento")) {
				jButtonCancelarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMovimiento")) {
				jButtonCancelarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMovimiento")) {
				jButtonCancelarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMovimiento")) {
				jButtonCerrarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMovimiento")) {
				jButtonCerrarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMovimiento")) {
				jButtonCerrarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMovimiento")) {
				jButtonMostrarOcultarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMovimiento")) {
				jButtonCancelarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMovimiento")) {
				jButtonCopiarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMovimiento")) {
				jButtonVerFormTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMovimiento")) {
				jButtonCopiarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMovimiento")) {
				jButtonVerFormTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMovimiento")) {
				jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMovimiento")) {
				jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMovimiento")) {
				jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMovimiento")) {
				jButtonAnterioresTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMovimiento")) {
				jButtonAnterioresTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMovimiento")) {
				jButtonAnterioresTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMovimiento")) {
				jButtonSiguientesTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMovimiento")) {
				jButtonSiguientesTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMovimiento")) {
				jButtonSiguientesTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMovimiento") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMovimiento")) {
				jButtonAbrirOrderByTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMovimiento") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMovimiento")) {
				jButtonMostrarOcultarTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimiento")) {
				jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMovimiento")) {
				jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMovimiento")) {
				jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMovimiento")) {
				jButtonCerrarReporteDinamicoTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMovimiento")) {
				jButtonGenerarReporteDinamicoTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMovimiento")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMovimiento")) {
				jButtonCerrarImportacionTipoMovimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMovimiento")) {
				
				jButtonGenerarImportacionTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMovimiento")) {
				
				jButtonAbrirImportacionTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMovimiento")) {
				jComboBoxTiposAccionesTipoMovimientoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMovimiento")) {
				jComboBoxTiposRelacionesTipoMovimientoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMovimiento")) {
				jComboBoxTiposAccionesTipoMovimientoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMovimiento")) {
				
				jComboBoxTiposSeleccionarTipoMovimientoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMovimiento")) {
				jTextFieldValorCampoGeneralTipoMovimientoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMovimiento")) {
				jButtonAbrirOrderByTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMovimiento")) {
				jButtonAbrirOrderByTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMovimiento")) {
				jButtonCerrarOrderByTipoMovimientoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimientoBusqueda")) {
				this.jButtonidTipoMovimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimientoBusqueda")) {
				this.jButtoncodigoTipoMovimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimientoBusqueda")) {
				this.jButtonnombreTipoMovimientoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMovimiento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMovimiento tipomovimientoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomovimientoLocal=this.tipomovimiento;
			} else {
				tipomovimientoLocal=this.tipomovimientoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
							
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
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
			
			


			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
								
						
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
								
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
							
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
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
			
			


			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
								
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMovimiento")) {
					jCheckBoxSeleccionarTodosTipoMovimientoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMovimiento")) {
					jCheckBoxSeleccionadosTipoMovimientoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMovimiento")) {
					
				}
				
				


				
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
												
				
				


				
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
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
			
			


			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento);
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
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
				
				


				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientoAnterior =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMovimiento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMovimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMovimiento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomovimiento =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomovimiento =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomovimiento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMovimiento")) {
				
				}
				
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMovimiento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMovimiento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMovimiento")) {
			
			}
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMovimiento();
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMovimiento")) {
				jButtonDuplicarTipoMovimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMovimiento")) {
				jButtonCopiarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMovimiento")) {
				jButtonVerFormTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMovimiento")) {
				jButtonNuevoTipoMovimientoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMovimiento")) {
				jButtonModificarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMovimiento")) {
				jButtonActualizarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMovimiento")) {
				jButtonEliminarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMovimiento")) {
				jButtonCancelarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMovimiento")) {
				jButtonCerrarTipoMovimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMovimiento")) {
				jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimiento")) {
				jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMovimiento")) {
				jButtonAbrirOrderByTipoMovimientoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMovimiento")) {
				jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMovimiento")) {
				jButtonAnterioresTipoMovimientoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMovimiento")) {
				jButtonSiguientesTipoMovimientoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimientoBusqueda")) {
				this.jButtonidTipoMovimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimientoBusqueda")) {
				this.jButtoncodigoTipoMovimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimientoBusqueda")) {
				this.jButtonnombreTipoMovimientoBusquedaActionPerformed(evt);
			}
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMovimiento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMovimiento")) {
				closingInternalFrameTipoMovimiento();
				
			} else if(sTipo.equals("jButtonCancelarTipoMovimiento")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMovimiento = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMovimientoBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimiento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMovimientoActionPerformed(null);
			}
			
			TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimiento,new Object(),this.tipomovimientoParameterGeneral,this.tipomovimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMovimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMovimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMovimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomovimiento)) {
			if(!esControlTabla) {
				if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);			
				}
				
				if(this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMovimiento(this.tipomovimiento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimientoReturnGeneral=tipomovimientoLogic.procesarEventosTipoMovimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientoLogic.getTipoMovimientos(),this.tipomovimiento,this.tipomovimientoParameterGeneral,this.isEsNuevoTipoMovimiento,classes);//this.tipomovimientoLogic.getTipoMovimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMovimiento(this.tipomovimientoReturnGeneral,this.tipomovimientoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimiento(classes,this.tipomovimientoReturnGeneral,this.tipomovimientoBean,false);
					}
						
					if(this.tipomovimientoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento());	
					}
						
					if(this.tipomovimientoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento(),classes);//this.tipomovimientoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento(this.tipomovimiento,classes);//this.tipomovimientoBean);									
				}
			
				if(TipoMovimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento(this.tipomovimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento(this.tipomovimiento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomovimientoAnterior!=null) {
						this.tipomovimiento=this.tipomovimientoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimientoReturnGeneral=tipomovimientoLogic.procesarEventosTipoMovimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientoLogic.getTipoMovimientos(),this.tipomovimiento,this.tipomovimientoParameterGeneral,this.isEsNuevoTipoMovimiento,classes);//this.tipomovimientoLogic.getTipoMovimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomovimientoReturnGeneral.getTipoMovimiento(),tipomovimientoLogic.getTipoMovimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomovimientoReturnGeneral.getTipoMovimiento(),this.tipomovimientos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMovimiento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMovimiento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMovimiento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMovimiento() throws Exception {
		
		TipoMovimientoModel tipomovimientoModel=(TipoMovimientoModel)this.jTableDatosTipoMovimiento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimientoModel.tipomovimientos=this.tipomovimientoLogic.getTipoMovimientos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomovimientoModel.tipomovimientos=this.tipomovimientos;
		}
		
		
		((TipoMovimientoModel) this.jTableDatosTipoMovimiento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMovimiento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomovimientoAnterior(),this.tipomovimientoLogic.getTipoMovimientos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomovimientoAnterior(),this.tipomovimientos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMovimiento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMovimiento(TipoMovimiento tipomovimiento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
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
										
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento,new Object(),generalEntityParameterGeneral,this.tipomovimientoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMovimientoConstantesFunciones.getClassesRelationshipsOfTipoMovimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMovimientoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMovimiento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMovimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMovimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento,new Object(),generalEntityParameterGeneral,this.tipomovimientoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMovimiento(TipoMovimientoBean tipomovimientoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimiento(ArrayList<Classe> classes,TipoMovimientoReturnGeneral tipomovimientoReturnGeneral,TipoMovimientoBean tipomovimientoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMovimiento(TipoMovimiento tipomovimiento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomovimiento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimiento = new TipoMovimientoDetalleFormJInternalFrame(jDesktopPane,this.tipomovimientoSessionBean.getConGuardarRelaciones(),this.tipomovimientoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.setVisible(false);
		this.jInternalFrameDetalleFormTipoMovimiento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMovimiento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMovimiento.tipomovimientoLogic=this.tipomovimientoLogic;
		
		this.cargarCombosFrameForeignKeyTipoMovimiento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimiento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimiento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMovimiento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMovimiento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMovimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimiento"));
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimiento"));

		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimiento"));
					
		this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemModificarTipoMovimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimiento"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimiento"));
						
		this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemActualizarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimiento"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimiento"));
								
		this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemEliminarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimiento"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimiento"));
					
		this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemCancelarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimiento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemDetalleCerrarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimiento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonidTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtoncodigoTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonnombreTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimiento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMovimiento"));
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimiento"));
		}
		
		this.jTableDatosTipoMovimiento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMovimiento"));
		
		this.jTableDatosTipoMovimiento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMovimiento"));
		
		this.jButtonNuevoTipoMovimiento.addActionListener(new ButtonActionListener(this,"NuevoTipoMovimiento"));
		
		this.jButtonDuplicarTipoMovimiento.addActionListener(new ButtonActionListener(this,"DuplicarTipoMovimiento"));
		
		this.jButtonCopiarTipoMovimiento.addActionListener(new ButtonActionListener(this,"CopiarTipoMovimiento"));
		
		this.jButtonVerFormTipoMovimiento.addActionListener(new ButtonActionListener(this,"VerFormTipoMovimiento"));
		
		
		this.jButtonNuevoToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMovimiento"));
			
		this.jButtonDuplicarToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMovimiento"));
			
		this.jMenuItemNuevoTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMovimiento"));
			
		this.jMenuItemDuplicarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMovimiento"));		
		
		
		this.jButtonNuevoRelacionesTipoMovimiento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMovimiento"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMovimiento"));
			
		this.jMenuItemNuevoRelacionesTipoMovimiento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMovimiento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonModificarToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimiento"));
			
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemModificarTipoMovimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarTipoMovimiento.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonActualizarToolBarTipoMovimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimiento"));
				
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemActualizarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarTipoMovimiento.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonEliminarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimiento"));
						
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemEliminarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonCancelarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimiento"));
			
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemCancelarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimiento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMovimiento"));		
		
		
		this.jButtonCerrarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CerrarTipoMovimiento"));
		
		
		this.jButtonCerrarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMovimiento"));
			
		this.jMenuItemCerrarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMovimiento"));
			
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jMenuItemDetalleCerrarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMovimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento"));
		}
		
		this.jButtonCopiarToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMovimiento"));
			
		this.jButtonVerFormToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMovimiento"));
		
		this.jMenuItemGuardarCambiosTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMovimiento"));
			
		this.jMenuItemCopiarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMovimiento"));		
		
		this.jMenuItemVerFormTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMovimiento"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimiento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMovimiento"));
			
		this.jMenuItemGuardarCambiosTablaTipoMovimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimiento"));		
		
		
		
		this.jButtonRecargarInformacionTipoMovimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMovimiento"));
					
		this.jButtonRecargarInformacionToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMovimiento"));
		
		this.jMenuItemRecargarInformacionTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMovimiento"));		
		
		
		
		this.jButtonAnterioresTipoMovimiento.addActionListener (new ButtonActionListener(this,"AnterioresTipoMovimiento"));
		
		
		this.jButtonAnterioresToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMovimiento"));
		
		this.jMenuItemAnterioresTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMovimiento"));		
		
		
		this.jButtonSiguientesTipoMovimiento.addActionListener (new ButtonActionListener(this,"SiguientesTipoMovimiento"));
		
		
		this.jButtonSiguientesToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMovimiento"));
			
		this.jMenuItemSiguientesTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMovimiento"));
			
		this.jMenuItemAbrirOrderByTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMovimiento"));
			
		this.jMenuItemMostrarOcultarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMovimiento"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMovimiento"));
			
		this.jMenuItemDetalleMostarOcultarTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMovimiento"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMovimiento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMovimiento"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMovimiento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMovimiento"));

		this.jCheckBoxSeleccionadosTipoMovimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMovimiento"));
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimiento"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMovimiento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMovimiento"));
			
		this.jComboBoxTiposAccionesTipoMovimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMovimiento"));
					
		this.jComboBoxTiposSeleccionarTipoMovimiento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMovimiento"));
			
		this.jTextFieldValorCampoGeneralTipoMovimiento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMovimiento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonidTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtoncodigoTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonnombreTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento"));
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento"));
				this.jInternalFrameReporteDinamicoTipoMovimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMovimiento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento"));				
			//this.jButtonGenerarReporteDinamicoTipoMovimiento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMovimiento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMovimiento!=null) {
				this.jInternalFrameImportacionTipoMovimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimiento"));
				this.jInternalFrameImportacionTipoMovimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimiento"));
				this.jInternalFrameImportacionTipoMovimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimiento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMovimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMovimiento"));
			
			this.jButtonAbrirOrderByToolBarTipoMovimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMovimiento"));			
			
			if(this.jInternalFrameOrderByTipoMovimiento!=null) {
				this.jInternalFrameOrderByTipoMovimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimiento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento.jTabbedPaneRelacionesTipoMovimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimiento"));
		
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
            		closingInternalFrameTipoMovimiento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMovimiento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMovimiento = (JInternalFrameBase)event.getSource();
	            	
	            TipoMovimientoBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimiento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMovimientoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMovimiento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMovimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMovimiento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMovimiento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMovimiento";
		inputMap = this.jButtonNuevoTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimientoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMovimiento";
		inputMap = this.jButtonNuevoRelacionesTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimientoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMovimiento";
		inputMap = this.jButtonModificarTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMovimiento";
		inputMap = this.jButtonActualizarTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMovimiento";
		inputMap = this.jButtonEliminarTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMovimiento";
		inputMap = this.jButtonCancelarTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMovimiento";
		inputMap = this.jButtonCerrarTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMovimiento";
		inputMap = this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonGuardarCambiosTipoMovimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMovimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMovimiento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMovimientoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMovimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMovimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMovimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMovimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMovimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMovimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonidTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtoncodigoTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento.jButtonnombreTipoMovimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMovimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMovimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMovimientoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMovimiento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMovimiento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
					tipomovimientoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento tipomovimientoAux:tipomovimientos) {
					tipomovimientoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMovimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
						tipomovimientoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento tipomovimientoAux:tipomovimientos) {
						tipomovimientoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento tipomovimientoAux:tipomovimientos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMovimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMovimiento.getSelectedRows();
			
			TipoMovimiento tipomovimientoLocal=new TipoMovimiento();
			
			//this.seleccionarTodosTipoMovimiento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLocal =(TipoMovimiento) this.tipomovimientoLogic.getTipoMovimientos().toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomovimientoLocal =(TipoMovimiento) this.tipomovimientos.toArray()[this.jTableDatosTipoMovimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomovimientoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
						tipomovimientoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento tipomovimientoAux:tipomovimientos) {
						tipomovimientoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMovimientoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMovimientoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMovimientoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMovimiento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimiento tipomovimientoAux:this.tipomovimientoLogic.getTipoMovimientos()) {
				
						if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimientoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento tipomovimientoAux:tipomovimientos) {
					
						if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimientoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMovimientoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMovimiento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMovimiento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMovimiento) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMovimiento(conSplash);
				
					this.generarReporteTipoMovimientosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMovimientosSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimientosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimientosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimiento();
				
				this.exportarTipoMovimientosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMovimientos();
				//this.importarTipoMovimientos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimiento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMovimientosSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Movimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMovimiento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMovimiento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMovimiento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento.jComboBoxTiposAccionesFormularioTipoMovimiento.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMovimiento();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMovimiento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMovimientoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMovimiento();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
			TipoMovimiento tipomovimiento=new TipoMovimiento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMovimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMovimiento.getSelectedItem();
			
			
			
			
			tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomovimientosSeleccionados.size()==1) {
				for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
					tipomovimiento=tipomovimientoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMovimiento();
			
      		//this.finishProcessTipoMovimiento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMovimientoReturnGeneral() throws Exception {
		if(this.tipomovimientoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomovimientoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomovimientoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomovimientoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomovimientoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomovimientoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMovimiento(false);
		}
		
		if(this.tipomovimientoReturnGeneral.getConRetornoLista() || this.tipomovimientoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomovimientoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimientoLogic.setTipoMovimientos(this.tipomovimientoReturnGeneral.getTipoMovimientos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomovimientoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimientoLogic.setTipoMovimiento(this.tipomovimientoReturnGeneral.getTipoMovimiento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMovimiento(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMovimiento() throws Exception {
		
		
	}
	
	public ArrayList<TipoMovimiento> getTipoMovimientosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMovimiento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMovimiento tipomovimientoAux:tipomovimientoLogic.getTipoMovimientos()) {
					if(tipomovimientoAux.getIsSelected()) {
						tipomovimientosSeleccionados.add(tipomovimientoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento tipomovimientoAux:this.tipomovimientos) {
					if(tipomovimientoAux.getIsSelected()) {
						tipomovimientosSeleccionados.add(tipomovimientoAux);				
					}
				}
			}
			
			if(tipomovimientosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomovimientosSeleccionados.addAll(this.tipomovimientoLogic.getTipoMovimientos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomovimientosSeleccionados.addAll(this.tipomovimientos);				
					}
				}
			}
		} else {
			tipomovimientosSeleccionados.add(this.tipomovimiento);
		}
		
		return tipomovimientosSeleccionados;
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
	
	public void generarReporteTipoMovimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMovimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMovimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimientosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimientosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Movimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMovimientosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMovimiento();
		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMovimiento();
		
		
		//this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados ,tipomovimientoImplementable,tipomovimientoImplementableHome);
	}
	
	public void mostrarImportacionTipoMovimientos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMovimiento();
		
		this.abrirFrameImportacionTipoMovimiento();		
		
			
		//this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados ,tipomovimientoImplementable,tipomovimientoImplementableHome);
	}
	
	public void importarTipoMovimientos() throws Exception {		
	
	}
	
	public void exportarTipoMovimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMovimientosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMovimientosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMovimientosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Movimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMovimiento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMovimiento(tipomovimientoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomovimientoAux.setsDetalleGeneralEntityReporte(tipomovimientoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMovimiento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMovimientoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMovimiento(TipoMovimiento tipomovimiento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomovimiento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMovimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMovimiento(row);				
				iRow++;
			}				
			
			for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMovimiento(tipomovimientoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMovimientosSeleccionados() throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();		
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomovimientos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomovimiento");
			//elementRoot.appendChild(element);
		
			for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
				element = document.createElement("tipomovimiento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMovimiento(tipomovimientoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMovimiento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMovimiento(TipoMovimiento tipomovimiento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoMovimiento(TipoMovimiento tipomovimiento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMovimientoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomovimiento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMovimientoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomovimiento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoMovimientoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomovimiento.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMovimientoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomovimiento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoMovimientosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMovimiento> tipomovimientosSeleccionados=new ArrayList<TipoMovimiento>();
		
		tipomovimientosSeleccionados=this.getTipoMovimientosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMovimiento(tipomovimientosSeleccionados);
		
		this.generarReporteTipoMovimientos("Todos",tipomovimientosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMovimiento(ArrayList<TipoMovimiento> tipomovimientosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMovimiento tipomovimientoAux:tipomovimientosSeleccionados) {
				tipomovimientoAux.setsDetalleGeneralEntityReporte(tipomovimientoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomovimientoAux.setsDescripcionGeneralEntityReporte1(tipomovimientoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMovimientoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomovimientoAux.setsDescripcionGeneralEntityReporte1(tipomovimientoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMovimiento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMovimiento=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento=true;
			this.isVisibilidadCeldaCancelarTipoMovimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=true;
			this.isVisibilidadCeldaModificarTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
			this.isVisibilidadCeldaModificarTipoMovimiento=true;
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMovimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=true;
		} else {
			this.actualizarEstadoPanelsTipoMovimiento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMovimiento=false;
			//this.isVisibilidadCeldaVerFormTipoMovimiento=false;
			this.isVisibilidadCeldaDuplicarTipoMovimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomovimientoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			if(!tipomovimientoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;												
			}
			
			this.jButtonCerrarTipoMovimiento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomovimiento)) {
			this.isVisibilidadCeldaActualizarTipoMovimiento=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimiento() {
	}
	
	public void actualizarEstadoPanelsTipoMovimiento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMovimiento!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento!=null) {
				this.jScrollPanelDatosTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento!=null) {
				this.jPanelPaginacionTipoMovimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento!=null) {
				this.jPanelParametrosReportesTipoMovimiento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMovimientoSessionBean tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		
		if(this.tipomovimientoSessionBean==null) {
			this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		}
		
		this.tipomovimientoSessionBean.setsUltimaBusquedaTipoMovimiento(this.getsAccionBusqueda());
		this.tipomovimientoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomovimientoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMovimientoSessionBean tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		
		if(this.tipomovimientoSessionBean==null) {
			this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		}
		
		if(this.tipomovimientoSessionBean.getsUltimaBusquedaTipoMovimiento()!=null&&!this.tipomovimientoSessionBean.getsUltimaBusquedaTipoMovimiento().equals("")) {
			this.setsAccionBusqueda(tipomovimientoSessionBean.getsUltimaBusquedaTipoMovimiento());
			this.setiNumeroPaginacion(tipomovimientoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomovimientoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipomovimientoSessionBean.setsUltimaBusquedaTipoMovimiento("");
		this.tipomovimientoSessionBean.setiNumeroPaginacion(TipoMovimientoConstantesFunciones.INUMEROPAGINACION);
		this.tipomovimientoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMovimiento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMovimiento() {
		this.updateBorderResaltarBusquedasFormularioTipoMovimiento();
		this.updateVisibilidadBusquedasFormularioTipoMovimiento();
		this.updateHabilitarBusquedasFormularioTipoMovimiento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMovimiento() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMovimiento() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoMovimiento() {
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
	
	public void updateControlesFormularioTipoMovimiento() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMovimiento();
		this.updateVisibilidadResaltarControlesFormularioTipoMovimiento();
		this.updateHabilitarResaltarControlesFormularioTipoMovimiento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMovimiento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomovimientoConstantesFunciones.resaltaridTipoMovimiento!=null && this.jInternalFrameDetalleFormTipoMovimiento!=null) {this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setBorder(this.tipomovimientoConstantesFunciones.resaltaridTipoMovimiento);}
		if(this.tipomovimientoConstantesFunciones.resaltarcodigoTipoMovimiento!=null && this.jInternalFrameDetalleFormTipoMovimiento!=null) {this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setBorder(this.tipomovimientoConstantesFunciones.resaltarcodigoTipoMovimiento);}
		if(this.tipomovimientoConstantesFunciones.resaltarnombreTipoMovimiento!=null && this.jInternalFrameDetalleFormTipoMovimiento!=null) {this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setBorder(this.tipomovimientoConstantesFunciones.resaltarnombreTipoMovimiento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMovimiento() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
	
		//this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostraridTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jPanelidTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostraridTipoMovimiento);
		//this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostrarcodigoTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jPanelcodigoTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostrarcodigoTipoMovimiento);
		//this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostrarnombreTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jPanelnombreTipoMovimiento.setVisible(this.tipomovimientoConstantesFunciones.mostrarnombreTipoMovimiento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMovimiento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento!=null) {
	
		this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldidTipoMovimiento.setEnabled(this.tipomovimientoConstantesFunciones.activaridTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jTextFieldcodigoTipoMovimiento.setEnabled(this.tipomovimientoConstantesFunciones.activarcodigoTipoMovimiento);
		this.jInternalFrameDetalleFormTipoMovimiento.jTextAreanombreTipoMovimiento.setEnabled(this.tipomovimientoConstantesFunciones.activarnombreTipoMovimiento);
		}
	}
	
		
}