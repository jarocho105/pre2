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

import com.bydan.erp.cartera.util.TipoViaTransporteConstantesFunciones;
import com.bydan.erp.cartera.util.TipoViaTransporteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoViaTransporteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoViaTransporteBean;
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

import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoViaTransporteBeanSwingJInternalFrame extends TipoViaTransporteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoViaTransporteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoViaTransporte> tipoviatransporteValidator = new ClassValidator<TipoViaTransporte>(TipoViaTransporte.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoViaTransporte tipoviatransporte;	
	public TipoViaTransporte tipoviatransporteAux;
	public TipoViaTransporte tipoviatransporteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoViaTransporte tipoviatransporteTotales;
	public Long idTipoViaTransporteActual;
	public Long iIdNuevoTipoViaTransporte=0L;
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
	
	public Boolean isPermisoTodoTipoViaTransporte;
	public Boolean isPermisoNuevoTipoViaTransporte;
	public Boolean isPermisoActualizarTipoViaTransporte;
	public Boolean isPermisoActualizarOriginalTipoViaTransporte;
	public Boolean isPermisoEliminarTipoViaTransporte;
	public Boolean isPermisoGuardarCambiosTipoViaTransporte;
	public Boolean isPermisoConsultaTipoViaTransporte;
	public Boolean isPermisoBusquedaTipoViaTransporte;
	public Boolean isPermisoReporteTipoViaTransporte;
	public Boolean isPermisoPaginacionMedioTipoViaTransporte;
	public Boolean isPermisoPaginacionAltoTipoViaTransporte;
	public Boolean isPermisoPaginacionTodoTipoViaTransporte;
	public Boolean isPermisoCopiarTipoViaTransporte;
	public Boolean isPermisoVerFormTipoViaTransporte;
	public Boolean isPermisoDuplicarTipoViaTransporte;
	public Boolean isPermisoOrdenTipoViaTransporte;
	
	
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
	
	public TipoViaTransporteParameterReturnGeneral tipoviatransporteReturnGeneral;
	public TipoViaTransporteParameterReturnGeneral tipoviatransporteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoViaTransporte=false;
	public Boolean esParaAccionDesdeFormularioTipoViaTransporte=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoViaTransporteLogic tipoviatransporteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoViaTransporte tipoviatransporteBean;
	public TipoViaTransporteConstantesFunciones tipoviatransporteConstantesFunciones;
	//public TipoViaTransporteParameterReturnGeneral tipoviatransporteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoViaTransporte> tipoviatransportes;	
	//public List<TipoViaTransporte> tipoviatransportesEliminados;
	//public List<TipoViaTransporte> tipoviatransportesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaDuplicarTipoViaTransporte=true;
	public Boolean isVisibilidadCeldaCopiarTipoViaTransporte=true;
	public Boolean isVisibilidadCeldaVerFormTipoViaTransporte=true;
	public Boolean isVisibilidadCeldaOrdenTipoViaTransporte=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaModificarTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaActualizarTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaEliminarTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaCancelarTipoViaTransporte=false;
	public Boolean isVisibilidadCeldaGuardarTipoViaTransporte=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;	
	
	
	
	public Long getiIdNuevoTipoViaTransporte() {
		return this.iIdNuevoTipoViaTransporte;
	}

	public void setiIdNuevoTipoViaTransporte(Long iIdNuevoTipoViaTransporte) {
		this.iIdNuevoTipoViaTransporte = iIdNuevoTipoViaTransporte;
	}
	
	public Long getidTipoViaTransporteActual() {
		return this.idTipoViaTransporteActual;
	}

	public void setidTipoViaTransporteActual(Long idTipoViaTransporteActual) {
		this.idTipoViaTransporteActual = idTipoViaTransporteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoViaTransporte gettipoviatransporte() {
		return this.tipoviatransporte;
	}

	public void settipoviatransporte(TipoViaTransporte tipoviatransporte) {
		this.tipoviatransporte = tipoviatransporte;
	}
	
	public TipoViaTransporte gettipoviatransporteAux() {
		return this.tipoviatransporteAux;
	}

	public void settipoviatransporteAux(TipoViaTransporte tipoviatransporteAux) {
		this.tipoviatransporteAux = tipoviatransporteAux;
	}				
	
	public TipoViaTransporte gettipoviatransporteAnterior() {
		return this.tipoviatransporteAnterior;
	}

	public void settipoviatransporteAnterior(TipoViaTransporte tipoviatransporteAnterior) {
		this.tipoviatransporteAnterior = tipoviatransporteAnterior;
	}	
	
	public TipoViaTransporte gettipoviatransporteTotales() {
		return this.tipoviatransporteTotales;
	}

	public void settipoviatransporteTotales(TipoViaTransporte tipoviatransporteTotales) {
		this.tipoviatransporteTotales = tipoviatransporteTotales;
	}	
	
	public TipoViaTransporte gettipoviatransporteBean() {
		return this.tipoviatransporteBean;
	}

	public void settipoviatransporteBean(TipoViaTransporte tipoviatransporteBean) {
		this.tipoviatransporteBean = tipoviatransporteBean;
	}	
	
	public TipoViaTransporteParameterReturnGeneral gettipoviatransporteReturnGeneral() {
		return this.tipoviatransporteReturnGeneral;
	}

	public void settipoviatransporteReturnGeneral(TipoViaTransporteParameterReturnGeneral tipoviatransporteReturnGeneral) {
		this.tipoviatransporteReturnGeneral = tipoviatransporteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoViaTransporteLogic getTipoViaTransporteLogic()	{		
		return tipoviatransporteLogic;
	}

	public void setTipoViaTransporteLogic(TipoViaTransporteLogic tipoviatransporteLogic) {
		this.tipoviatransporteLogic = tipoviatransporteLogic;
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
	
	public Boolean getIsEsNuevoTipoViaTransporte() {
		return isEsNuevoTipoViaTransporte;
	}

	public void setIsEsNuevoTipoViaTransporte(Boolean isEsNuevoTipoViaTransporte) {
		this.isEsNuevoTipoViaTransporte = isEsNuevoTipoViaTransporte;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoViaTransporte() {
		return esParaAccionDesdeFormularioTipoViaTransporte;
	}
	
	public void setEsParaAccionDesdeFormularioTipoViaTransporte(Boolean esParaAccionDesdeFormularioTipoViaTransporte) {
		this.esParaAccionDesdeFormularioTipoViaTransporte = esParaAccionDesdeFormularioTipoViaTransporte;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoViaTransporte() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoViaTransporteConstantesFunciones.refrescarForeignKeysDescripcionesTipoViaTransporte(this.tipoviatransporteLogic.getTipoViaTransportes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoViaTransporteConstantesFunciones.refrescarForeignKeysDescripcionesTipoViaTransporte(this.tipoviatransportes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoviatransporteLogic.setTipoViaTransportes(this.tipoviatransportes);
			tipoviatransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoViaTransporteParameterReturnGeneral getTipoViaTransporteParameterGeneral() {
		return this.tipoviatransporteParameterGeneral;
	}
	
	public void setTipoViaTransporteParameterGeneral(TipoViaTransporteParameterReturnGeneral tipoviatransporteParameterGeneral) {
		this.tipoviatransporteParameterGeneral = tipoviatransporteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoViaTransporte() {
		return isPermisoTodoTipoViaTransporte;
	}

	public void setIsPermisoTodoTipoViaTransporte(Boolean isPermisoTodoTipoViaTransporte) {
		this.isPermisoTodoTipoViaTransporte = isPermisoTodoTipoViaTransporte;
	}

	public Boolean getIsPermisoNuevoTipoViaTransporte() {
		return isPermisoNuevoTipoViaTransporte;
	}

	public void setIsPermisoNuevoTipoViaTransporte(Boolean isPermisoNuevoTipoViaTransporte) {
		this.isPermisoNuevoTipoViaTransporte = isPermisoNuevoTipoViaTransporte;
	}

	public Boolean getIsPermisoActualizarTipoViaTransporte() {
		return isPermisoActualizarTipoViaTransporte;
	}

	public void setIsPermisoActualizarTipoViaTransporte(Boolean isPermisoActualizarTipoViaTransporte) {
		this.isPermisoActualizarTipoViaTransporte = isPermisoActualizarTipoViaTransporte;
	}

	public Boolean getIsPermisoEliminarTipoViaTransporte() {
		return isPermisoEliminarTipoViaTransporte;
	}

	public void setIsPermisoEliminarTipoViaTransporte(Boolean isPermisoEliminarTipoViaTransporte) {
		this.isPermisoEliminarTipoViaTransporte = isPermisoEliminarTipoViaTransporte;
	}

	public Boolean getIsPermisoGuardarCambiosTipoViaTransporte() {
		return isPermisoGuardarCambiosTipoViaTransporte;
	}

	public void setIsPermisoGuardarCambiosTipoViaTransporte(Boolean isPermisoGuardarCambiosTipoViaTransporte) {
		this.isPermisoGuardarCambiosTipoViaTransporte = isPermisoGuardarCambiosTipoViaTransporte;
	}
	
	public Boolean getIsPermisoConsultaTipoViaTransporte() {
		return isPermisoConsultaTipoViaTransporte;
	}

	public void setIsPermisoConsultaTipoViaTransporte(Boolean isPermisoConsultaTipoViaTransporte) {
		this.isPermisoConsultaTipoViaTransporte = isPermisoConsultaTipoViaTransporte;
	}

	public Boolean getIsPermisoBusquedaTipoViaTransporte() {
		return isPermisoBusquedaTipoViaTransporte;
	}

	public void setIsPermisoBusquedaTipoViaTransporte(Boolean isPermisoBusquedaTipoViaTransporte) {
		this.isPermisoBusquedaTipoViaTransporte = isPermisoBusquedaTipoViaTransporte;
	}

	public Boolean getIsPermisoReporteTipoViaTransporte() {
		return isPermisoReporteTipoViaTransporte;
	}

	public void setIsPermisoReporteTipoViaTransporte(Boolean isPermisoReporteTipoViaTransporte) {
		this.isPermisoReporteTipoViaTransporte = isPermisoReporteTipoViaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoViaTransporte() {
		return isPermisoPaginacionMedioTipoViaTransporte;
	}

	public void setIsPermisoPaginacionMedioTipoViaTransporte(Boolean isPermisoPaginacionMedioTipoViaTransporte) {
		this.isPermisoPaginacionMedioTipoViaTransporte = isPermisoPaginacionMedioTipoViaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoViaTransporte() {
		return isPermisoPaginacionTodoTipoViaTransporte;
	}

	public void setIsPermisoPaginacionTodoTipoViaTransporte(Boolean isPermisoPaginacionTodoTipoViaTransporte) {
		this.isPermisoPaginacionTodoTipoViaTransporte = isPermisoPaginacionTodoTipoViaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoViaTransporte() {
		return isPermisoPaginacionAltoTipoViaTransporte;
	}

	public void setIsPermisoPaginacionAltoTipoViaTransporte(Boolean isPermisoPaginacionAltoTipoViaTransporte) {
		this.isPermisoPaginacionAltoTipoViaTransporte = isPermisoPaginacionAltoTipoViaTransporte;
	}
	
	public Boolean getIsPermisoCopiarTipoViaTransporte() {
		return isPermisoCopiarTipoViaTransporte;
	}

	public void setIsPermisoCopiarTipoViaTransporte(Boolean isPermisoCopiarTipoViaTransporte) {
		this.isPermisoCopiarTipoViaTransporte = isPermisoCopiarTipoViaTransporte;
	}
	
	public Boolean getIsPermisoVerFormTipoViaTransporte() {
		return isPermisoVerFormTipoViaTransporte;
	}

	public void setIsPermisoVerFormTipoViaTransporte(Boolean isPermisoVerFormTipoViaTransporte) {
		this.isPermisoVerFormTipoViaTransporte = isPermisoVerFormTipoViaTransporte;
	}
	
	public Boolean getIsPermisoDuplicarTipoViaTransporte() {
		return isPermisoDuplicarTipoViaTransporte;
	}

	public void setIsPermisoDuplicarTipoViaTransporte(Boolean isPermisoDuplicarTipoViaTransporte) {
		this.isPermisoDuplicarTipoViaTransporte = isPermisoDuplicarTipoViaTransporte;
	}
	
	public Boolean getIsPermisoOrdenTipoViaTransporte() {
		return isPermisoOrdenTipoViaTransporte;
	}

	public void setIsPermisoOrdenTipoViaTransporte(Boolean isPermisoOrdenTipoViaTransporte) {
		this.isPermisoOrdenTipoViaTransporte = isPermisoOrdenTipoViaTransporte;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoViaTransporte() {
		return isVisibilidadCeldaNuevoTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaNuevoTipoViaTransporte(Boolean isVisibilidadCeldaNuevoTipoViaTransporte) {
		this.isVisibilidadCeldaNuevoTipoViaTransporte = isVisibilidadCeldaNuevoTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoViaTransporte() {
		return isVisibilidadCeldaDuplicarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaDuplicarTipoViaTransporte(Boolean isVisibilidadCeldaDuplicarTipoViaTransporte) {
		this.isVisibilidadCeldaDuplicarTipoViaTransporte = isVisibilidadCeldaDuplicarTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoViaTransporte() {
		return isVisibilidadCeldaCopiarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaCopiarTipoViaTransporte(Boolean isVisibilidadCeldaCopiarTipoViaTransporte) {
		this.isVisibilidadCeldaCopiarTipoViaTransporte = isVisibilidadCeldaCopiarTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoViaTransporte() {
		return isVisibilidadCeldaVerFormTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaVerFormTipoViaTransporte(Boolean isVisibilidadCeldaVerFormTipoViaTransporte) {
		this.isVisibilidadCeldaVerFormTipoViaTransporte = isVisibilidadCeldaVerFormTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoViaTransporte() {
		return isVisibilidadCeldaOrdenTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaOrdenTipoViaTransporte(Boolean isVisibilidadCeldaOrdenTipoViaTransporte) {
		this.isVisibilidadCeldaOrdenTipoViaTransporte = isVisibilidadCeldaOrdenTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoViaTransporte() {
		return isVisibilidadCeldaNuevoRelacionesTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoViaTransporte(Boolean isVisibilidadCeldaNuevoRelacionesTipoViaTransporte) {
		this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte = isVisibilidadCeldaNuevoRelacionesTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoViaTransporte() {
		return isVisibilidadCeldaModificarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaModificarTipoViaTransporte(Boolean isVisibilidadCeldaModificarTipoViaTransporte) {
		this.isVisibilidadCeldaModificarTipoViaTransporte = isVisibilidadCeldaModificarTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoViaTransporte() {
		return isVisibilidadCeldaActualizarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaActualizarTipoViaTransporte(Boolean isVisibilidadCeldaActualizarTipoViaTransporte) {
		this.isVisibilidadCeldaActualizarTipoViaTransporte = isVisibilidadCeldaActualizarTipoViaTransporte;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoViaTransporte() {
		return isVisibilidadCeldaEliminarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaEliminarTipoViaTransporte(Boolean isVisibilidadCeldaEliminarTipoViaTransporte) {
		this.isVisibilidadCeldaEliminarTipoViaTransporte = isVisibilidadCeldaEliminarTipoViaTransporte;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoViaTransporte() {
		return isVisibilidadCeldaCancelarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaCancelarTipoViaTransporte(Boolean isVisibilidadCeldaCancelarTipoViaTransporte) {
		this.isVisibilidadCeldaCancelarTipoViaTransporte = isVisibilidadCeldaCancelarTipoViaTransporte;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoViaTransporte() {
		return isVisibilidadCeldaGuardarTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaGuardarTipoViaTransporte(Boolean isVisibilidadCeldaGuardarTipoViaTransporte) {
		this.isVisibilidadCeldaGuardarTipoViaTransporte = isVisibilidadCeldaGuardarTipoViaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoViaTransporte() {
		return isVisibilidadCeldaGuardarCambiosTipoViaTransporte;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoViaTransporte(Boolean isVisibilidadCeldaGuardarCambiosTipoViaTransporte) {
		this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte = isVisibilidadCeldaGuardarCambiosTipoViaTransporte;
	}
		
	public TipoViaTransporteSessionBean gettipoviatransporteSessionBean() {
		return this.tipoviatransporteSessionBean;
	}
	
	public void settipoviatransporteSessionBean(TipoViaTransporteSessionBean tipoviatransporteSessionBean) {
		this.tipoviatransporteSessionBean=tipoviatransporteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(TipoViaTransporte tipoviatransporte)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoViaTransporte tipoviatransporte,TipoViaTransporte tipoviatransporteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoViaTransporte(tipoviatransporte);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoviatransporteAux.setId(tipoviatransporte.getId());
		tipoviatransporteAux.setVersionRow(tipoviatransporte.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoViaTransporte();
		
			int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoviatransporteValidator.getInvalidValues(this.tipoviatransporte);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoviatransporteLogic.setDatosCliente(datosCliente);
			tipoviatransporteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoviatransporteAux=new  TipoViaTransporte();
				
				tipoviatransporteAux.setIsNew(true);
				tipoviatransporteAux.setIsChanged(true);
				
				tipoviatransporteAux.setTipoViaTransporteOriginal(this.tipoviatransporte);
				
				tipoviatransporteAux.setId(this.tipoviatransporte.getId());	
				tipoviatransporteAux.setVersionRow(this.tipoviatransporte.getVersionRow());	
				tipoviatransporteAux.setnombre(this.tipoviatransporte.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoviatransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoviatransporteAux,tipoviatransporteLogic.getTipoViaTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviatransporteAux,tipoviatransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviatransporteLogic.saveTipoViaTransportes();//WithConnection
						//tipoviatransporteLogic.getSetVersionRowTipoViaTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoviatransporte,tipoviatransporteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoviatransporteAux=new  TipoViaTransporte();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoviatransporteSessionBean.getEsGuardarRelacionado() && this.tipoviatransporte.getId()>=0)) {
						
					tipoviatransporteAux.setIsNew(false);
				}
				
				tipoviatransporteAux.setIsDeleted(false);
			
				tipoviatransporteAux.setId(this.tipoviatransporte.getId());	
				tipoviatransporteAux.setVersionRow(this.tipoviatransporte.getVersionRow());	
				tipoviatransporteAux.setnombre(this.tipoviatransporte.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoviatransporteAux,tipoviatransporteLogic.getTipoViaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviatransporteAux,tipoviatransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviatransporteLogic.saveTipoViaTransportes();//WithConnection
						//tipoviatransporteLogic.getSetVersionRowTipoViaTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoviatransporte,tipoviatransporteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoviatransporteAux=new  TipoViaTransporte();
				
				tipoviatransporteAux.setIsNew(false);
				tipoviatransporteAux.setIsChanged(false);
				
				tipoviatransporteAux.setIsDeleted(true);
				
				tipoviatransporteAux.setId(this.tipoviatransporte.getId());	
				tipoviatransporteAux.setVersionRow(this.tipoviatransporte.getVersionRow());	
				tipoviatransporteAux.setnombre(this.tipoviatransporte.getnombre());	
				
				if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoviatransporteAux.getId()>=0) {	
						this.tipoviatransportesEliminados.add(tipoviatransporteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoviatransporteAux,tipoviatransporteLogic.getTipoViaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviatransporteAux,tipoviatransportes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviatransporteLogic.saveTipoViaTransportes();//WithConnection
						//tipoviatransporteLogic.getSetVersionRowTipoViaTransportes();//WithConnection
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
					this.tipoviatransporteLogic.getTipoViaTransportes().addAll(this.tipoviatransportesEliminados);
					
					tipoviatransporteLogic.saveTipoViaTransportes();//WithConnection
					//tipoviatransporteLogic.getSetVersionRowTipoViaTransportes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoviatransportesEliminados= new ArrayList<TipoViaTransporte>();		
			}
			
			if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Via Transporte GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoviatransporte=tipoviatransporteAux;
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
      		//this.finishProcessTipoViaTransporte();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoViaTransporte tipoviatransporteLocal) throws Exception {
		
		if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoViaTransporte tipoviatransporteLocal) throws Exception {	
		if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoViaTransporteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoviatransporteValidator.getInvalidValues(this.tipoviatransporte);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoViaTransporte tipoviatransporte,List<TipoViaTransporte> tipoviatransportes) throws Exception {
		try	{		
			TipoViaTransporteConstantesFunciones.actualizarLista(tipoviatransporte,tipoviatransportes,this.tipoviatransporteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoViaTransporte tipoviatransporte,List<TipoViaTransporte> tipoviatransportes) throws Exception {
		try	{			
			TipoViaTransporteConstantesFunciones.actualizarSelectedLista(tipoviatransporte,tipoviatransportes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoViaTransporte> tipoviatransportesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoviatransportesLocal=this.tipoviatransporteLogic.getTipoViaTransportes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoviatransportesLocal=this.tipoviatransportes;
			}
			//ARCHITECTURE
		
			for(TipoViaTransporte tipoviatransporteLocal:tipoviatransportesLocal) {
				if(this.permiteMantenimiento(tipoviatransporteLocal) && tipoviatransporteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoViaTransporteConstantesFunciones.getTipoViaTransporteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoViaTransporteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoViaTransporte.jLabelnombreTipoViaTransporte,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoViaTransporte.jLabelnombreTipoViaTransporte,"");
		
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
		this.iIdNuevoTipoViaTransporte--;	
		
		
		this.tipoviatransporteAux=new TipoViaTransporte();
		
		this.tipoviatransporteAux.setId(this.iIdNuevoTipoViaTransporte);
		this.tipoviatransporteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoviatransporteLogic.getTipoViaTransportes().add(this.tipoviatransporteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoviatransportes.add(this.tipoviatransporteAux);
		}
		//ARCHITECTURE
		
		this.tipoviatransporte=this.tipoviatransporteAux;
		
		if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporte);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoViaTransporte(this.tipoviatransporte);
		}
				
		//this.setDefaultControlesTipoViaTransporte();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoViaTransporte();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoViaTransporte();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoViaTransporte();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoViaTransporte(this.tipoviatransporteBean,this.tipoviatransporte,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoViaTransporteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
			classes=TipoViaTransporteConstantesFunciones.getClassesRelationshipsOfTipoViaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoviatransporteReturnGeneral=tipoviatransporteLogic.procesarEventosTipoViaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoviatransporteLogic.getTipoViaTransportes(),this.tipoviatransporte,this.tipoviatransporteParameterGeneral,this.isEsNuevoTipoViaTransporte,classes);//this.tipoviatransporteLogic.getTipoViaTransporte()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoViaTransporte(this.tipoviatransporteReturnGeneral,this.tipoviatransporteBean,false);
		
		if(this.tipoviatransporteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte());
		}
		
		if(this.tipoviatransporteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte(),classes);//this.tipoviatransporteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoViaTransporte();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoViaTransporte();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoViaTransporte(false);
						
			if(tipoviatransporteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoViaTransporte();
			}
			
			this.actualizarVisualTableDatosTipoViaTransporte();
			
			this.jTableDatosTipoViaTransporte.setRowSelectionInterval(this.getIndiceNuevoTipoViaTransporte(), this.getIndiceNuevoTipoViaTransporte());
			
			this.seleccionarFilaTablaTipoViaTransporteActual();
						
			this.actualizarEstadoCeldasBotonesTipoViaTransporte("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoViaTransporte(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setEnabled(isHabilitar && this.tipoviatransporteConstantesFunciones.activarnombreTipoViaTransporte);	
		
	};
	
	public void setDefaultControlesTipoViaTransporte() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoViaTransporte(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoviatransporteSessionBean.setConGuardarRelaciones(true);			
			this.tipoviatransporteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.setVisible(true);
			
					
		} else {
			//this.tipoviatransporteSessionBean.setConGuardarRelaciones(false);			
			this.tipoviatransporteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoViaTransporte() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
				if(tipoviatransporteAux.getId().equals(this.iIdNuevoTipoViaTransporte)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransportes) {
				if(tipoviatransporteAux.getId().equals(this.iIdNuevoTipoViaTransporte)) {
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
	
	public int getIndiceActualTipoViaTransporte(TipoViaTransporte tipoviatransporte,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
				if(tipoviatransporteAux.getId().equals(tipoviatransporte.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransportes) {
				if(tipoviatransporteAux.getId().equals(tipoviatransporte.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoViaTransporte(TipoViaTransporte tipoviatransporteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
				if(tipoviatransporteAux.getTipoViaTransporteOriginal().getId().equals(tipoviatransporteOriginal.getId())) {
					existe=true;
					tipoviatransporteOriginal.setId(tipoviatransporteAux.getId());
					tipoviatransporteOriginal.setVersionRow(tipoviatransporteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransportes) {
				if(tipoviatransporteAux.getTipoViaTransporteOriginal().getId().equals(tipoviatransporteOriginal.getId())) {
					existe=true;
					tipoviatransporteOriginal.setId(tipoviatransporteAux.getId());
					tipoviatransporteOriginal.setVersionRow(tipoviatransporteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoViaTransporte(Boolean esParaCancelar) throws Exception {
		tipoviatransportesAux=new ArrayList<TipoViaTransporte>();
		tipoviatransporteAux=new TipoViaTransporte();
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
					if(tipoviatransporteAux.getId()<0) {
						tipoviatransportesAux.add(tipoviatransporteAux);
					}		
				}
				this.iIdNuevoTipoViaTransporte=0L;
				this.tipoviatransporteLogic.getTipoViaTransportes().removeAll(tipoviatransportesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransportes) {
					if(tipoviatransporteAux.getId()<0) {
						tipoviatransportesAux.add(tipoviatransporteAux);
					}		
				}
				this.iIdNuevoTipoViaTransporte=0L;
				this.tipoviatransportes.removeAll(tipoviatransportesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoViaTransporte 
					&& this.tipoviatransporteLogic.getTipoViaTransportes().size()>0
					) {
					tipoviatransporteAux=this.tipoviatransporteLogic.getTipoViaTransportes().get(this.tipoviatransporteLogic.getTipoViaTransportes().size() - 1);
				
					if(tipoviatransporteAux.getId()<0) {
						this.tipoviatransporteLogic.getTipoViaTransportes().remove(tipoviatransporteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoViaTransporte && this.tipoviatransportes.size()>0) {
					tipoviatransporteAux=this.tipoviatransportes.get(this.tipoviatransportes.size() - 1);
				
					if(tipoviatransporteAux.getId()<0) {
						this.tipoviatransportes.remove(tipoviatransporteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoViaTransporte(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoviatransporte.getId()<0) {
				this.tipoviatransporteLogic.getTipoViaTransportes().remove(this.tipoviatransporte);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoviatransporte.getId()<0) {
				this.tipoviatransportes.remove(this.tipoviatransporte);
			}
		}			
	}
	
	public void setEstadosInicialesTipoViaTransporte(List<TipoViaTransporte> tipoviatransportesAux) throws Exception {
		TipoViaTransporteConstantesFunciones.setEstadosInicialesTipoViaTransporte(tipoviatransportesAux);
	}
	
	public void setEstadosInicialesTipoViaTransporte(TipoViaTransporte tipoviatransporteAux) throws Exception {
		TipoViaTransporteConstantesFunciones.setEstadosInicialesTipoViaTransporte(tipoviatransporteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoViaTransporteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoViaTransporteActual()) {
				if(!this.isEsNuevoTipoViaTransporte) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoViaTransporte=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoViaTransporteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Via Transporte ?", "MANTENIMIENTO DE Tipo Via Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoViaTransporte tipoviatransporte) throws Exception {
		TipoViaTransporteConstantesFunciones.seleccionarAsignar(this.tipoviatransporte,tipoviatransporte);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoViaTransporte=this.isPermisoActualizarOriginalTipoViaTransporte;
			
			
			this.seleccionarAsignar(tipoviatransporte);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoViaTransporteConstantesFunciones.quitarEspaciosTipoViaTransporte(this.tipoviatransporte,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoViaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoviatransporteSessionBean.setsFuncionBusquedaRapida(this.tipoviatransporteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoViaTransporte) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoViaTransporte(esParaCancelar);				
				this.cancelarNuevoTipoViaTransporte(esParaCancelar);								
			}
			
			this.tipoviatransporte=new TipoViaTransporte();
			
			this.inicializarTipoViaTransporte();
			
			this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoViaTransporte() throws Exception {
		try {
			TipoViaTransporteConstantesFunciones.inicializarTipoViaTransporte(this.tipoviatransporte);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoviatransporteLogic.getTipoViaTransportes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoViaTransportes(String sAccionBusqueda,List<TipoViaTransporte> tipoviatransportesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoViaTransporte"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoViaTransporteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoViaTransporteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoViaTransporte"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Via Transportes");		
		parameters.put("busquedapor", TipoViaTransporteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoViaTransporte=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoViaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoViaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoViaTransporte=new JRBeanArrayDataSource(TipoViaTransporteJInternalFrame.TraerTipoViaTransporteBeans(tipoviatransportesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoViaTransporte);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoViaTransporteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoViaTransporteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoViaTransporteBean.TraerTipoViaTransporteBeans(tipoviatransportesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoViaTransporteActionPerformed(null);
					//this.generarExcelReporteTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoViaTransportes(sAccionBusqueda,sTipoArchivoReporte,tipoviatransportesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoViaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoViaTransporte> tipoviatransportesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViaTransportes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoViaTransporte("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoViaTransporte tipoviatransporte : tipoviatransportesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoViaTransporteConstantesFunciones.generarExcelReporteDataTipoViaTransporte("NORMAL",row,workbook,tipoviatransporte,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoViaTransporte(String sTipo,Row row,Workbook workbook) {
		
		TipoViaTransporteConstantesFunciones.generarExcelReporteHeaderTipoViaTransporte(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoViaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoViaTransporte> tipoviatransportesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViaTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoViaTransporte tipoviatransporte : tipoviatransportesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporte));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoviatransporte.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoViaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoViaTransporte> tipoviatransportesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoViaTransporte> tipoviatransportesRespaldo=null;
		
		classes=TipoViaTransporteConstantesFunciones.getClassesRelationshipsOfTipoViaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoviatransporteLogic.setDatosCliente(this.datosCliente);
		this.tipoviatransporteLogic.setDatosDeep(this.datosDeep);
		this.tipoviatransporteLogic.setIsConDeep(true);
		
		tipoviatransportesRespaldo=this.tipoviatransporteLogic.getTipoViaTransportes();
		
		this.tipoviatransporteLogic.setTipoViaTransportes(tipoviatransportesParaReportes);	
		this.tipoviatransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoviatransportesParaReportes=this.tipoviatransporteLogic.getTipoViaTransportes();
		this.tipoviatransporteLogic.setTipoViaTransportes(tipoviatransportesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViaTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoViaTransporte("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoViaTransporte tipoviatransporte : tipoviatransportesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoViaTransporte("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoViaTransporteConstantesFunciones.generarExcelReporteDataTipoViaTransporte("NORMAL",row,workbook,tipoviatransporte,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporte));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoViaTransporte() throws Exception {		
		this.startProcessTipoViaTransporte(true);
	}
	
	public void startProcessTipoViaTransporte(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoViaTransporte, this.jScrollPanelDatosTipoViaTransporte,this.jPanelPaginacionTipoViaTransporte, this.jScrollPanelDatosEdicionTipoViaTransporte, this.jPanelAccionesTipoViaTransporte,this.jPanelAccionesFormularioTipoViaTransporte,this.jmenuBarTipoViaTransporte,this.jmenuBarDetalleTipoViaTransporte,this.jTtoolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoViaTransporte=null; 
		
		final JPanel jPanelParametrosReportesTipoViaTransporte=this.jPanelParametrosReportesTipoViaTransporte;
		//final JScrollPane jScrollPanelDatosTipoViaTransporte=this.jScrollPanelDatosTipoViaTransporte;
		final JTable jTableDatosTipoViaTransporte=this.jTableDatosTipoViaTransporte;		
		final JPanel jPanelPaginacionTipoViaTransporte=this.jPanelPaginacionTipoViaTransporte;
		//final JScrollPane jScrollPanelDatosEdicionTipoViaTransporte=this.jScrollPanelDatosEdicionTipoViaTransporte;
		final JPanel jPanelAccionesTipoViaTransporte=this.jPanelAccionesTipoViaTransporte;
		
		JPanel jPanelCamposAuxiliarTipoViaTransporte=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoViaTransporte=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			jPanelCamposAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jPanelCamposTipoViaTransporte;
			jPanelAccionesFormularioAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jPanelAccionesFormularioTipoViaTransporte;
		}
		
		final JPanel jPanelCamposTipoViaTransporte=jPanelCamposAuxiliarTipoViaTransporte;
		final JPanel jPanelAccionesFormularioTipoViaTransporte=jPanelAccionesFormularioAuxiliarTipoViaTransporte;
		
		
		final JMenuBar jmenuBarTipoViaTransporte=this.jmenuBarTipoViaTransporte;
		final JToolBar jTtoolBarTipoViaTransporte=this.jTtoolBarTipoViaTransporte;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoViaTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoViaTransporte=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			jmenuBarDetalleAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jmenuBarDetalleTipoViaTransporte;
			jTtoolBarDetalleAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jTtoolBarDetalleTipoViaTransporte;
		}
		
		final JMenuBar jmenuBarDetalleTipoViaTransporte=jmenuBarDetalleAuxiliarTipoViaTransporte;
		final JToolBar jTtoolBarDetalleTipoViaTransporte=jTtoolBarDetalleAuxiliarTipoViaTransporte;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoViaTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoViaTransporte;
			processRunnable.jTableDatos=jTableDatosTipoViaTransporte;
			processRunnable.jPanelCampos=jPanelCamposTipoViaTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoViaTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesTipoViaTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoViaTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarTipoViaTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoViaTransporte;
			processRunnable.jTtoolBar=jTtoolBarTipoViaTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoViaTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoViaTransporte ,jPanelParametrosReportesTipoViaTransporte,jTableDatosTipoViaTransporte, /*jScrollPanelDatosTipoViaTransporte,*/jPanelCamposTipoViaTransporte,jPanelPaginacionTipoViaTransporte, /*jScrollPanelDatosEdicionTipoViaTransporte,*/ jPanelAccionesTipoViaTransporte,jPanelAccionesFormularioTipoViaTransporte,jmenuBarTipoViaTransporte,jmenuBarDetalleTipoViaTransporte,jTtoolBarTipoViaTransporte,jTtoolBarDetalleTipoViaTransporte);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoViaTransporte, jScrollPanelDatosTipoViaTransporte,jPanelPaginacionTipoViaTransporte, jScrollPanelDatosEdicionTipoViaTransporte, jPanelAccionesTipoViaTransporte,jPanelAccionesFormularioTipoViaTransporte,jmenuBarTipoViaTransporte,jmenuBarDetalleTipoViaTransporte,jTtoolBarTipoViaTransporte,jTtoolBarDetalleTipoViaTransporte);
						
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
	
	public void finishProcessTipoViaTransporte() {// throws Exception 
		this.finishProcessTipoViaTransporte(true);
	}
	
	public void finishProcessTipoViaTransporte(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoViaTransporte, this.jScrollPanelDatosTipoViaTransporte,this.jPanelPaginacionTipoViaTransporte, this.jScrollPanelDatosEdicionTipoViaTransporte, this.jPanelAccionesTipoViaTransporte,this.jPanelAccionesFormularioTipoViaTransporte,this.jmenuBarTipoViaTransporte,this.jmenuBarDetalleTipoViaTransporte,this.jTtoolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoViaTransporte=null; 
		
		final JPanel jPanelParametrosReportesTipoViaTransporte=this.jPanelParametrosReportesTipoViaTransporte;
		//final JScrollPane jScrollPanelDatosTipoViaTransporte=this.jScrollPanelDatosTipoViaTransporte;
		final JTable jTableDatosTipoViaTransporte=this.jTableDatosTipoViaTransporte;		
		final JPanel jPanelPaginacionTipoViaTransporte=this.jPanelPaginacionTipoViaTransporte;
		//final JScrollPane jScrollPanelDatosEdicionTipoViaTransporte=this.jScrollPanelDatosEdicionTipoViaTransporte;
		final JPanel jPanelAccionesTipoViaTransporte=this.jPanelAccionesTipoViaTransporte;
		
		JPanel jPanelCamposAuxiliarTipoViaTransporte=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoViaTransporte=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			jPanelCamposAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jPanelCamposTipoViaTransporte;
			jPanelAccionesFormularioAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jPanelAccionesFormularioTipoViaTransporte;
		}
		
		final JPanel jPanelCamposTipoViaTransporte=jPanelCamposAuxiliarTipoViaTransporte;
		final JPanel jPanelAccionesFormularioTipoViaTransporte=jPanelAccionesFormularioAuxiliarTipoViaTransporte;
		
		
		final JMenuBar jmenuBarTipoViaTransporte=this.jmenuBarTipoViaTransporte;		
		final JToolBar jTtoolBarTipoViaTransporte=this.jTtoolBarTipoViaTransporte;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoViaTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoViaTransporte=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			jmenuBarDetalleAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jmenuBarDetalleTipoViaTransporte;
			jTtoolBarDetalleAuxiliarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jTtoolBarDetalleTipoViaTransporte;		
		}
		
		final JMenuBar jmenuBarDetalleTipoViaTransporte=jmenuBarDetalleAuxiliarTipoViaTransporte;
		final JToolBar jTtoolBarDetalleTipoViaTransporte=jTtoolBarDetalleAuxiliarTipoViaTransporte;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoViaTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoViaTransporte;
			processRunnable.jTableDatos=jTableDatosTipoViaTransporte;
			processRunnable.jPanelCampos=jPanelCamposTipoViaTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoViaTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesTipoViaTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoViaTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarTipoViaTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoViaTransporte;
			processRunnable.jTtoolBar=jTtoolBarTipoViaTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoViaTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoViaTransporte ,jPanelParametrosReportesTipoViaTransporte, jTableDatosTipoViaTransporte,/*jScrollPanelDatosTipoViaTransporte,*/jPanelCamposTipoViaTransporte,jPanelPaginacionTipoViaTransporte, /*jScrollPanelDatosEdicionTipoViaTransporte,*/ jPanelAccionesTipoViaTransporte,jPanelAccionesFormularioTipoViaTransporte,jmenuBarTipoViaTransporte,jmenuBarDetalleTipoViaTransporte,jTtoolBarTipoViaTransporte,jTtoolBarDetalleTipoViaTransporte));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoViaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoViaTransporte(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoViaTransporte(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoViaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoViaTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoViaTransporte,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoViaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoViaTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoViaTransporte,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoviatransporteConstantesFunciones.getsFinalQueryTipoViaTransporte();
		String  finalQueryPaginacionTodos=this.tipoviatransporteConstantesFunciones.getsFinalQueryTipoViaTransporte();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesNoTipoViaTransporte(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoviatransportesEliminados= new ArrayList<TipoViaTransporte>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoViaTransporte();
		
				///*TipoViaTransporteSessionBean*/this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
			
			if(this.tipoviatransporteSessionBean==null) {
				this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
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
					this.iNumeroPaginacion=TipoViaTransporteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoViaTransporteConstantesFunciones.getClassesForeignKeysOfTipoViaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoviatransporte."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoviatransportesAux= new ArrayList<TipoViaTransporte>();
			
				
			tipoviatransporteLogic.setDatosCliente(this.datosCliente);
			tipoviatransporteLogic.setDatosDeep(this.datosDeep);
			tipoviatransporteLogic.setIsConDeep(true);
			
			
			tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoviatransporteLogic.getTodosTipoViaTransportes(finalQueryGlobal,pagination);
					
					//tipoviatransporteLogic.getTodosTipoViaTransportesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoviatransporteLogic.getTipoViaTransportes()==null|| tipoviatransporteLogic.getTipoViaTransportes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviatransportesAux= new ArrayList<TipoViaTransporte>();
							tipoviatransportesAux.addAll(tipoviatransporteLogic.getTipoViaTransportes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviatransportesAux= new ArrayList<TipoViaTransporte>();
							tipoviatransportesAux.addAll(tipoviatransportes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviatransporteLogic.getTodosTipoViaTransportes(finalQueryGlobal+"",this.pagination);												
							
							//tipoviatransporteLogic.getTodosTipoViaTransportesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoViaTransportes("Todos",tipoviatransporteLogic.getTipoViaTransportes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviatransporteLogic.setTipoViaTransportes(new ArrayList<TipoViaTransporte>());					
							tipoviatransporteLogic.getTipoViaTransportes().addAll(tipoviatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviatransportes=new ArrayList<TipoViaTransporte>();
							tipoviatransportes.addAll(tipoviatransportesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoViaTransporte=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoViaTransporte=this.idActual;
				
				} else if(this.idTipoViaTransporteActual!=null && this.idTipoViaTransporteActual!=0L) {
					idTipoViaTransporte=idTipoViaTransporteActual;
				}
				
					
				this.sDetalleReporte=TipoViaTransporteConstantesFunciones.getDetalleIndicePorId(idTipoViaTransporte);
				
				this.tipoviatransportes=new ArrayList<TipoViaTransporte>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoviatransporteLogic.getEntity(idTipoViaTransporte);
					
					//tipoviatransporteLogic.getEntityWithConnection(idTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLogic.setTipoViaTransportes(new ArrayList<TipoViaTransporte>());
					tipoviatransporteLogic.getTipoViaTransportes().add(tipoviatransporteLogic.getTipoViaTransporte());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoviatransportes=new ArrayList<TipoViaTransporte>();
					this.tipoviatransportes.add(tipoviatransporte);
				}
				
				if(tipoviatransporteLogic.getTipoViaTransporte()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoViaTransporte();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoViaTransporte();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoviatransporteLogic.getTipoViaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviatransportes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoviatransporteLogic.getTipoViaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviatransportes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoViaTransporte tipoviatransporte) {
		Boolean permite=true;
		
		if(this.tipoviatransporte.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoViaTransporteConstantesFunciones.getOrderByListaTipoViaTransporte();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoViaTransporteConstantesFunciones.getOrderByListaTipoViaTransporte();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoViaTransporte tipoviatransporte:tipoviatransporteLogic.getTipoViaTransportes()) {
				if(tipoviatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviatransporteTotales=tipoviatransporte;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoViaTransporte tipoviatransporte:this.tipoviatransportes) {
				if(tipoviatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviatransporteTotales=tipoviatransporte;
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
			this.tipoviatransporteAux=new TipoViaTransporte();
			this.tipoviatransporteAux.setsType(Constantes2.S_TOTALES);
			this.tipoviatransporteAux.setIsNew(false);
			this.tipoviatransporteAux.setIsChanged(false);
			this.tipoviatransporteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoViaTransporteConstantesFunciones.TotalizarValoresFilaTipoViaTransporte(this.tipoviatransporteLogic.getTipoViaTransportes(),this.tipoviatransporteAux);
				
				this.tipoviatransporteLogic.getTipoViaTransportes().add(this.tipoviatransporteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoViaTransporteConstantesFunciones.TotalizarValoresFilaTipoViaTransporte(this.tipoviatransportes,this.tipoviatransporteAux);
				
				this.tipoviatransportes.add(this.tipoviatransporteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoviatransporteTotales=new TipoViaTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoviatransporteLogic.getTipoViaTransportes().remove(tipoviatransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoviatransportes.remove(tipoviatransporteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoviatransporteTotales=new TipoViaTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoViaTransporte tipoviatransporte:tipoviatransporteLogic.getTipoViaTransportes()) {
				if(tipoviatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviatransporteTotales=tipoviatransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoViaTransporteConstantesFunciones.TotalizarValoresFilaTipoViaTransporte(this.tipoviatransporteLogic.getTipoViaTransportes(),tipoviatransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoViaTransporte tipoviatransporte:this.tipoviatransportes) {
				if(tipoviatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviatransporteTotales=tipoviatransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoViaTransporteConstantesFunciones.TotalizarValoresFilaTipoViaTransporte(this.tipoviatransportes,tipoviatransporteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoViaTransportePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoViaTransportePorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLogic.getTipoViaTransportePorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoViaTransporte() {
		this.isPermisoTodoTipoViaTransporte=false;
		this.isPermisoNuevoTipoViaTransporte=false;
		this.isPermisoActualizarTipoViaTransporte=false;
		this.isPermisoActualizarOriginalTipoViaTransporte=false;
		this.isPermisoEliminarTipoViaTransporte=false;
		this.isPermisoGuardarCambiosTipoViaTransporte=false;
		this.isPermisoConsultaTipoViaTransporte=false;
		this.isPermisoBusquedaTipoViaTransporte=false;
		this.isPermisoReporteTipoViaTransporte=false;		
		this.isPermisoOrdenTipoViaTransporte=false;		
		this.isPermisoPaginacionMedioTipoViaTransporte=false;		
		this.isPermisoPaginacionAltoTipoViaTransporte=false;
		this.isPermisoPaginacionTodoTipoViaTransporte=false;
		this.isPermisoCopiarTipoViaTransporte=false;		
		this.isPermisoVerFormTipoViaTransporte=false;		
		this.isPermisoDuplicarTipoViaTransporte=false;		
		this.isPermisoOrdenTipoViaTransporte=false;		
	}
	
	public void setPermisosUsuarioTipoViaTransporte(Boolean isPermiso) {
		this.isPermisoTodoTipoViaTransporte=isPermiso;
		this.isPermisoNuevoTipoViaTransporte=isPermiso;
		this.isPermisoActualizarTipoViaTransporte=isPermiso;
		this.isPermisoActualizarOriginalTipoViaTransporte=isPermiso;
		this.isPermisoEliminarTipoViaTransporte=isPermiso;
		this.isPermisoGuardarCambiosTipoViaTransporte=isPermiso;
		this.isPermisoConsultaTipoViaTransporte=isPermiso;
		this.isPermisoBusquedaTipoViaTransporte=isPermiso;
		this.isPermisoReporteTipoViaTransporte=isPermiso;
		this.isPermisoOrdenTipoViaTransporte=isPermiso;		
		this.isPermisoPaginacionMedioTipoViaTransporte=isPermiso;		
		this.isPermisoPaginacionAltoTipoViaTransporte=isPermiso;		
		this.isPermisoPaginacionTodoTipoViaTransporte=isPermiso;		
		this.isPermisoCopiarTipoViaTransporte=isPermiso;		
		this.isPermisoVerFormTipoViaTransporte=isPermiso;		
		this.isPermisoDuplicarTipoViaTransporte=isPermiso;
		this.isPermisoOrdenTipoViaTransporte=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoViaTransporte(Boolean isPermiso) {
		//this.isPermisoTodoTipoViaTransporte=isPermiso;
		this.isPermisoNuevoTipoViaTransporte=isPermiso;
		this.isPermisoActualizarTipoViaTransporte=isPermiso;
		this.isPermisoActualizarOriginalTipoViaTransporte=isPermiso;
		this.isPermisoEliminarTipoViaTransporte=isPermiso;
		this.isPermisoGuardarCambiosTipoViaTransporte=isPermiso;
		//this.isPermisoConsultaTipoViaTransporte=isPermiso;
		//this.isPermisoBusquedaTipoViaTransporte=isPermiso;
		//this.isPermisoReporteTipoViaTransporte=isPermiso;
		//this.isPermisoOrdenTipoViaTransporte=isPermiso;		
		//this.isPermisoPaginacionMedioTipoViaTransporte=isPermiso;		
		//this.isPermisoPaginacionAltoTipoViaTransporte=isPermiso;		
		//this.isPermisoPaginacionTodoTipoViaTransporte=isPermiso;		
		//this.isPermisoCopiarTipoViaTransporte=isPermiso;		
		//this.isPermisoDuplicarTipoViaTransporte=isPermiso;
		//this.isPermisoOrdenTipoViaTransporte=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoViaTransporteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoViaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoViaTransporte(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoViaTransporteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoViaTransporteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoViaTransporteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoViaTransporteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoViaTransporte() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoViaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoViaTransporteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoViaTransporte=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoViaTransporte=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoViaTransporte=this.isPermisoActualizarTipoViaTransporte;
			this.isPermisoEliminarTipoViaTransporte=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoViaTransporte=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoViaTransporte=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoViaTransporte=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoViaTransporte=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoViaTransporte=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoViaTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoViaTransporte=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoViaTransporte=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoViaTransporte=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoViaTransporte=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoViaTransporte=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoViaTransporte=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoViaTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoViaTransporte.setToolTipText(this.jTableDatosTipoViaTransporte.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoViaTransporte(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoViaTransporte(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoViaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoViaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoViaTransporte() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoViaTransporteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoViaTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoViaTransporteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoViaTransporteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoViaTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoViaTransporte()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoViaTransporte()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoViaTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoViaTransporte()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoViaTransporte();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoViaTransporte(TipoViaTransporte tipoviatransporte)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoViaTransporte(TipoViaTransporte tipoviatransporte,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoViaTransporte()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoViaTransporte()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoViaTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoViaTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoViaTransporte()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoViaTransporte()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoViaTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoViaTransporte()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoViaTransporteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoViaTransporteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoViaTransporteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean(); 
		this.tipoviatransporteConstantesFunciones=new TipoViaTransporteConstantesFunciones(); 
		this.tipoviatransporteBean=new TipoViaTransporte();//(this.tipoviatransporteConstantesFunciones); 		
		this.tipoviatransporteReturnGeneral=new TipoViaTransporteParameterReturnGeneral(); 
		
		this.tipoviatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoViaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoViaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoViaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoViaTransporte(true);
			
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
			
			this.tipoviatransporteConstantesFunciones=new TipoViaTransporteConstantesFunciones(); 
			this.tipoviatransporteBean=new TipoViaTransporte();//this.tipoviatransporteConstantesFunciones); 			
			this.tipoviatransporteReturnGeneral=new TipoViaTransporteParameterReturnGeneral(); 
		
			TipoViaTransporteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Via Transporte Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoviatransporte=new TipoViaTransporte();
			this.tipoviatransportes = new ArrayList<TipoViaTransporte>();
			this.tipoviatransportesAux = new ArrayList<TipoViaTransporte>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic=new TipoViaTransporteLogic();
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoviatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoviatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoViaTransporte);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoViaTransporte);	
					}
					
					if(this.jInternalFrameImportacionTipoViaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoViaTransporte);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoViaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoViaTransporte);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoViaTransporte);
				this.jInternalFrameDetalleFormTipoViaTransporte.setVisible(false);
				this.jInternalFrameDetalleFormTipoViaTransporte.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoViaTransporte);
					this.jInternalFrameReporteDinamicoTipoViaTransporte.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoViaTransporte.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoViaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoViaTransporte);
					this.jInternalFrameImportacionTipoViaTransporte.setVisible(false);
					this.jInternalFrameImportacionTipoViaTransporte.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoViaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoViaTransporte);
					this.jInternalFrameOrderByTipoViaTransporte.setVisible(false);
					this.jInternalFrameOrderByTipoViaTransporte.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoViaTransporteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoViaTransporteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoviatransporteReturnGeneral=new TipoViaTransporteParameterReturnGeneral();
			
			this.tipoviatransporteParameterGeneral=new TipoViaTransporteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoviatransporteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoViaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoViaTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoviatransporteSessionBean.getEsGuardarRelacionado(),this.tipoviatransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoViaTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoviatransporteSessionBean.getEsGuardarRelacionado(),this.tipoviatransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaDuplicarTipoViaTransporte=true;
			this.isVisibilidadCeldaCopiarTipoViaTransporte=true;
			this.isVisibilidadCeldaVerFormTipoViaTransporte=true;
			this.isVisibilidadCeldaOrdenTipoViaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoViaTransporte();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoViaTransporte(false);
			
			this.setPermisosUsuarioTipoViaTransporte();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoviatransporteSessionBean.getEsGuardarRelacionado() && this.tipoviatransporteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoViaTransporteClasesRelacionadas();
			}
			
			if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoViaTransporteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoViaTransporte();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoViaTransporte();
			}
			
			if(!this.isPermisoBusquedaTipoViaTransporte) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoViaTransporte,this.isPermisoPaginacionMedioTipoViaTransporte,this.isPermisoPaginacionTodoTipoViaTransporte);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoViaTransporteConstantesFunciones.getTiposSeleccionarTipoViaTransporte());
				
				this.tiposColumnasSelect=TipoViaTransporteConstantesFunciones.getTiposSeleccionarTipoViaTransporte(true);
				
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
			//if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoViaTransporte();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoViaTransporte(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoViaTransporte(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoViaTransporte() ;
			
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
				tipoviatransporteImplementable= (TipoViaTransporteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoViaTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoviatransporteImplementableHome= (TipoViaTransporteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoViaTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoviatransportes= new ArrayList<TipoViaTransporte>();
			this.tipoviatransportesEliminados= new ArrayList<TipoViaTransporte>();
						
			this.isEsNuevoTipoViaTransporte=false;
			this.esParaAccionDesdeFormularioTipoViaTransporte=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoViaTransporte(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoViaTransporte();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoViaTransporteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoViaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoViaTransporte(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoViaTransporte();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoViaTransporte();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoViaTransporte(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoViaTransporte: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoViaTransporte() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoViaTransporte")) {
				iIndex=this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoViaTransporte();	
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
	
	public void cargarCombosForeignKeyTipoViaTransporte(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoViaTransporte(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoViaTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoViaTransporteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoViaTransporte();
		
		this.cargarCombosFrameForeignKeyTipoViaTransporte();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoViaTransporte();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoViaTransporte();
		}
	}
	
	
	
	public void jButtonNuevoTipoViaTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			
			if(jTableDatosTipoViaTransporte.getRowCount()>=1) {
				jTableDatosTipoViaTransporte.removeRowSelectionInterval(0, jTableDatosTipoViaTransporte.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoViaTransporte=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoViaTransporte(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoViaTransporte(true);			
			//this.tipoviatransporte=new TipoViaTransporte();
			//this.tipoviatransporte.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoViaTransporte(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoViaTransporte() ;
			
			if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoViaTransporte(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoviatransporte);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);				
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoViaTransporte: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoViaTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoViaTransporte.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoViaTransporte.getSelectedRows().length;			
			}
			
			tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoViaTransporte--;			
				//TipoViaTransporte tipoviatransporteAux= new TipoViaTransporte();			
				//tipoviatransporteAux.setId(this.iIdNuevoTipoViaTransporte);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoViaTransporte tipoviatransporteOrigen=new TipoViaTransporte();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoViaTransporte tipoviatransporteOrigen : tipoviatransportesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoviatransporteOrigen =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviatransporteOrigen =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoViaTransporte();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoviatransporte.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoViaTransporte(tipoviatransporteOrigen,this.tipoviatransporte,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoviatransporteLogic.getTipoViaTransportes().add(this.tipoviatransporteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoviatransportes.add(this.tipoviatransporteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
				
				this.jTableDatosTipoViaTransporte.setRowSelectionInterval(this.getIndiceNuevoTipoViaTransporte(), this.getIndiceNuevoTipoViaTransporte());
				
				int iLastRow =  this.jTableDatosTipoViaTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoViaTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoViaTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoViaTransporte(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();									
		
			TipoViaTransporte tipoviatransporteOrigen=new TipoViaTransporte();
			TipoViaTransporte tipoviatransporteDestino=new TipoViaTransporte();
				
			tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoViaTransporte.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoviatransportesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoViaTransporte.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviatransporteOrigen =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoviatransporteOrigen =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviatransporteDestino =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoviatransporteDestino =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoviatransporteOrigen =tipoviatransportesSeleccionados.get(0);
				tipoviatransporteDestino =tipoviatransportesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoViaTransporte(tipoviatransporteOrigen,tipoviatransporteDestino,true,false);
				
				tipoviatransporteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoviatransporteDestino,tipoviatransporteLogic.getTipoViaTransportes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviatransporteDestino,tipoviatransportes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
				
				//this.jTableDatosTipoViaTransporte.setRowSelectionInterval(this.getIndiceNuevoTipoViaTransporte(), this.getIndiceNuevoTipoViaTransporte());
				
				int iLastRow =  this.jTableDatosTipoViaTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoViaTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoViaTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoViaTransporte(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoViaTransporte.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoViaTransporte.isVisible();
			
			
			this.jPanelParametrosReportesTipoViaTransporte.setVisible(!isVisible);
			this.jPanelPaginacionTipoViaTransporte.setVisible(!isVisible);
			this.jPanelAccionesTipoViaTransporte.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoViaTransporte();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoViaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoViaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoViaTransporte();
			
			this.abrirFrameOrderByTipoViaTransporte();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoViaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoViaTransporte(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoViaTransporte);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoViaTransporte.isMaximum()) {
					this.jInternalFrameDetalleFormTipoViaTransporte.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoViaTransporte.setSize(this.jInternalFrameDetalleFormTipoViaTransporte.iWidthFormulario,this.jInternalFrameDetalleFormTipoViaTransporte.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoViaTransporte.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoViaTransporte.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoViaTransporte.isMaximum()) {
						this.jInternalFrameDetalleFormTipoViaTransporte.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoViaTransporte.jContentPaneDetalleTipoViaTransporte.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoViaTransporte.jContentPaneDetalleTipoViaTransporte.getWidth(),TipoViaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoViaTransporte.jContentPaneDetalleTipoViaTransporte.getWidth(),TipoViaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoViaTransporte.jContentPaneDetalleTipoViaTransporte.getWidth(),TipoViaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoViaTransporte.setVisible(true);
	        this.jInternalFrameDetalleFormTipoViaTransporte.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoViaTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoViaTransporte==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoViaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoViaTransporte,false,this);
				} else {
					this.jInternalFrameOrderByTipoViaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoViaTransporte,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoViaTransporte);
				this.jInternalFrameOrderByTipoViaTransporte.setVisible(false);
				this.jInternalFrameOrderByTipoViaTransporte.setSelected(false);
				
				this.jInternalFrameOrderByTipoViaTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoViaTransporte"));
				
				this.inicializarActualizarBindingTablaOrderByTipoViaTransporte();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoViaTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoViaTransporte==null) {
				
				this.jInternalFrameImportacionTipoViaTransporte=new ImportacionJInternalFrame(TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoViaTransporte);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoViaTransporte);
				this.jInternalFrameImportacionTipoViaTransporte.setVisible(false);
				this.jInternalFrameImportacionTipoViaTransporte.setSelected(false);


				this.jInternalFrameImportacionTipoViaTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoViaTransporte"));
				this.jInternalFrameImportacionTipoViaTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoViaTransporte"));
				this.jInternalFrameImportacionTipoViaTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoViaTransporte"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoViaTransporte() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoViaTransporte==null) {
				this.jInternalFrameReporteDinamicoTipoViaTransporte=new ReporteDinamicoJInternalFrame(TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoViaTransporte);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoViaTransporte);
				this.jInternalFrameReporteDinamicoTipoViaTransporte.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoViaTransporte.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoViaTransporte"));
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoViaTransporte"));
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoViaTransporte"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoViaTransporte();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoViaTransporte() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoViaTransporte);
			
	       	this.jInternalFrameDetalleFormTipoViaTransporte.setVisible(false);
	        this.jInternalFrameDetalleFormTipoViaTransporte.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoViaTransporte.dispose();
			//this.jInternalFrameDetalleFormTipoViaTransporte=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoViaTransporte() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoViaTransporte.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoViaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoViaTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoViaTransporte.setVisible(true);
	        this.jInternalFrameImportacionTipoViaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoViaTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoViaTransporte.setVisible(true);
	        this.jInternalFrameOrderByTipoViaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoViaTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoViaTransporte.setVisible(false);
	        this.jInternalFrameOrderByTipoViaTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoViaTransporte() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoViaTransporte.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoViaTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoViaTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoViaTransporte.setVisible(false);
	        this.jInternalFrameImportacionTipoViaTransporte.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoViaTransporte(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoViaTransporte(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoViaTransporte(true);
			//this.isEsNuevoTipoViaTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoViaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoViaTransporte(false) ;
			
			if(tipoviatransporteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoViaTransporte(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoViaTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoViaTransporteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoViaTransporte(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoViaTransporte(true);
			//this.isEsNuevoTipoViaTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoviatransporte.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoViaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoViaTransporte(false) ;
			
			if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoViaTransporte(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoViaTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoViaTransporte(false);
			
			//if(!this.isEsNuevoTipoViaTransporte) {								
				int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
				
			}
			
			if(this.permiteMantenimiento(this.tipoviatransporte)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoViaTransporte=true;
					this.inicializarActualizarBindingTablaTipoViaTransporte(false);
					this.isEsNuevoTipoViaTransporte=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoViaTransporte=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoViaTransporte=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoViaTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoViaTransporte(false);
				
				this.habilitarDeshabilitarControlesTipoViaTransporte(false);
			
												
				
				if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoViaTransporte();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoViaTransporteActionPerformed(evt,tipoviatransporteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoViaTransporte(this.tipoviatransporte,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoViaTransporte.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoviatransporteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoviatransporte.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				this.tipoviatransporte.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				this.tipoviatransporte.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoviatransporte)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoViaTransporteModel) this.jTableDatosTipoViaTransporte.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoViaTransporte=true;
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
				this.isEsNuevoTipoViaTransporte=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoViaTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoViaTransporte(false);
				
				this.habilitarDeshabilitarControlesTipoViaTransporte(false);
				
				
				
				if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoViaTransporte();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoViaTransporte.getRowCount()>=1) {
				jTableDatosTipoViaTransporte.removeRowSelectionInterval(0, jTableDatosTipoViaTransporte.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoViaTransporte(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoViaTransporte(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoViaTransporte(false) ;
			
			this.isEsNuevoTipoViaTransporte=false;
			
			if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoViaTransporte();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoViaTransporte(false);
				
				//SI ES MANUAL
				if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoViaTransporte();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoViaTransporte--;			
			//TipoViaTransporte tipoviatransporteAux= new TipoViaTransporte();			
			//tipoviatransporteAux.setId(this.iIdNuevoTipoViaTransporte);
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoViaTransporte();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
			
			this.tipoviatransporte.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoviatransporteLogic.getTipoViaTransportes().add(this.tipoviatransporteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoviatransportes.add(this.tipoviatransporteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			
			this.jTableDatosTipoViaTransporte.setRowSelectionInterval(this.getIndiceNuevoTipoViaTransporte(), this.getIndiceNuevoTipoViaTransporte());
			
			int iLastRow =  this.jTableDatosTipoViaTransporte.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoViaTransporte.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoViaTransporte.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoViaTransporte(false);
			
			//SI ES MANUAL
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoViaTransporte();
			}
			
			//this.abrirFrameTreeTipoViaTransporte();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Via TransporteS ?", "MANTENIMIENTO DE Tipo Via Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoViaTransporte.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoViaTransporte();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoviatransporteReturnGeneral=tipoviatransporteLogic.procesarImportacionTipoViaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoviatransporteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoViaTransporteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoViaTransporte.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoViaTransporte.setFileImportacion(this.jInternalFrameImportacionTipoViaTransporte.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoViaTransporte.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoViaTransporte.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoViaTransporte.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoViaTransporte.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		

		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoViaTransporteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoViaTransporteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoViaTransporteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoViaTransporte.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoViaTransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoViaTransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoViaTransporteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoViaTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoViaTransporteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoViaTransporte tipoviatransporte:tipoviatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoviatransporte.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoViaTransporte(row);				
			//	iRow++;
			//}				
			
			//for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoViaTransporte(tipoviatransporteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoViaTransporte(false);
			
			//SI ES MANUAL
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoViaTransporte();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoViaTransporte(false);
			
			//SI ES MANUAL
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoViaTransporte();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoViaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoViaTransporte(false);
			
			//SI ES MANUAL
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoViaTransporte();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoViaTransporte() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoViaTransporte.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoViaTransporte.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoViaTransporte.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoViaTransporte.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoViaTransporte.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoViaTransporte.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoViaTransporte.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoViaTransporte(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoViaTransporte(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoViaTransporte(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoViaTransporte(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoViaTransporte(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoViaTransporte(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoViaTransporte(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoViaTransporte(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoViaTransporte() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoViaTransporte();
		
		this.inicializarActualizarBindingBotonesManualTipoViaTransporte(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoViaTransporte();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoViaTransporte() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoViaTransporte(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoViaTransporte(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoViaTransporte.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoViaTransporte.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoViaTransporte.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionNuevoTipoViaTransporte.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionSinCerrarTipoViaTransporte.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionSinMensajeTipoViaTransporte.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoViaTransporte.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoViaTransporte.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoViaTransporte.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
				this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionNuevoTipoViaTransporte.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionSinCerrarTipoViaTransporte.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoViaTransporte.jCheckBoxPostAccionSinMensajeTipoViaTransporte.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoViaTransporte.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoViaTransporte.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoViaTransporte.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoViaTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoViaTransporte.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoViaTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoViaTransporte.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoViaTransporte.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoViaTransporte.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoViaTransporte(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoViaTransporte(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoViaTransporte() throws Exception {
		try	{
			if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoViaTransporte();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoViaTransporte() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoViaTransporte() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoViaTransporte.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoViaTransporte.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoViaTransporte.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoViaTransporte.addItem(reporte);
			}
			
			
			if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoViaTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoViaTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoViaTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoViaTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoViaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoViaTransporte.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoViaTransporte.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoViaTransporte();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoViaTransporte() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoViaTransporte.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoViaTransporte()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoViaTransporte(Boolean esInicializar) throws Exception {				
		if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoViaTransporte();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoViaTransporte() throws Exception {
		this.inicializarActualizarBindingTablaTipoViaTransporte(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoViaTransporte() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoViaTransporteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoViaTransporte(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoviatransporteLogic.getTipoViaTransportes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoviatransportes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoViaTransporte.setModel(new TipoViaTransporteModel(this.tipoviatransporteLogic.getTipoViaTransportes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoViaTransporte.setModel(new TipoViaTransporteModel(this.tipoviatransportes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoViaTransporte!=null && this.jInternalFrameOrderByTipoViaTransporte.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoViaTransporte();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporte,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,tipoviatransporteConstantesFunciones.resaltarSeleccionarTipoViaTransporte,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO,tipoviatransporteConstantesFunciones.resaltarSeleccionarTipoViaTransporte,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporte,TipoViaTransporteConstantesFunciones.LABEL_ID));

		if(this.tipoviatransporteConstantesFunciones.mostraridTipoViaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViaTransporteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoviatransporteConstantesFunciones.resaltaridTipoViaTransporte,this.tipoviatransporteConstantesFunciones.activaridTipoViaTransporte,this,true,"idTipoViaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoviatransporteConstantesFunciones.resaltaridTipoViaTransporte,this.tipoviatransporteConstantesFunciones.activaridTipoViaTransporte,this,true,"idTipoViaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporte,TipoViaTransporteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoviatransporteConstantesFunciones.mostrarnombreTipoViaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViaTransporteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoviatransporteConstantesFunciones.resaltarnombreTipoViaTransporte,this.tipoviatransporteConstantesFunciones.activarnombreTipoViaTransporte,this,true,"nombreTipoViaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoviatransporteConstantesFunciones.resaltarnombreTipoViaTransporte,this.tipoviatransporteConstantesFunciones.activarnombreTipoViaTransporte,this,true,"nombreTipoViaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoViaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoViaTransporte.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoViaTransporte.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoviatransporteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoViaTransporte.addColumn(tableColumn);
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
			
			this.jTableDatosTipoViaTransporte.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoViaTransporte.moveColumn(this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoViaTransporte.moveColumn(this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoViaTransporte.moveColumn(this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoViaTransporte.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoViaTransporte.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoViaTransporte,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoViaTransporte.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoViaTransporte.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoViaTransporte.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoViaTransporte.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoviatransporteLogic.getTipoViaTransportes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoviatransportes.size()-1;
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
		//this.jTableDatosTipoViaTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoViaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoViaTransporte();
			
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
				
				//this.isEsNuevoTipoViaTransporte=false;
					
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
				if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoViaTransporte==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoViaTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoViaTransporte.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoviatransporte.getsType().equals("DUPLICADO")
				   || this.tipoviatransporte.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoViaTransporte=true;
				
				} else {
					this.isEsNuevoTipoViaTransporte=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoviatransporte.getId()>=0 && !this.tipoviatransporte.getIsNew()) {						
						this.isEsNuevoTipoViaTransporte=false;
						
					} else {
						this.isEsNuevoTipoViaTransporte=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoViaTransporte(esRelaciones);						
				
				this.seleccionarTipoViaTransporte(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoviatransporte.getId()<0) {
					this.isEsNuevoTipoViaTransporte=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoViaTransporte(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoViaTransporte(evt,rowIndex);
				}	
				
				if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoViaTransporte: " + this.dDif); 
					}
				}								
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoViaTransporte(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoviatransporte)) {
					if(this.tipoviatransporte.getId()>0) {
						this.tipoviatransporte.setIsDeleted(true);
						
						this.tipoviatransportesEliminados.add(this.tipoviatransporte);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoviatransporteLogic.getTipoViaTransportes().remove(this.tipoviatransporte);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoviatransportes.remove(this.tipoviatransporte);				
					}
					
					
					((TipoViaTransporteModel) this.jTableDatosTipoViaTransporte.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoViaTransporte(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoViaTransporte(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoViaTransporte) {
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoViaTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoViaTransporte.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporte);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoViaTransporte("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoViaTransporte(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoViaTransporte() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoViaTransporte(TipoViaTransporte tipoviatransporte) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoViaTransporte(tipoviatransporte,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoViaTransporte(TipoViaTransporte tipoviatransporte,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoViaTransporte(tipoviatransporte);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoViaTransporte(tipoviatransporte,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoViaTransporte(tipoviatransporte);
	}
	
	public void setVariablesObjetoActualToFormularioTipoViaTransporte(TipoViaTransporte tipoviatransporte) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setText(tipoviatransporte.getId().toString());
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setText(tipoviatransporte.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoViaTransporte tipoviatransporteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoviatransporteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoViaTransporte tipoviatransporteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoviatransporteLocal=this.tipoviatransporte;
			} else {
				tipoviatransporteLocal=this.tipoviatransporteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoviatransporteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoViaTransporte(tipoviatransporteLocal,true);
					
					if(tipoviatransporteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoviatransporteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoviatransporteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoViaTransporte(TipoViaTransporte tipoviatransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoViaTransporte(tipoviatransporte,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(tipoviatransporte);
	}
	
	public void setVariablesFormularioToObjetoActualTipoViaTransporte(TipoViaTransporte tipoviatransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoViaTransporte(tipoviatransporte,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoViaTransporte(TipoViaTransporte tipoviatransporte,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.getText()==null || this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.getText()=="" || this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setText("0");
			}

			if(conColumnasBase) {tipoviatransporte.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoViaTransporteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoViaTransporte.jLabelIdTipoViaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoviatransporte.setnombre(this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoViaTransporteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoViaTransporte.jLabelnombreTipoViaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoViaTransporte(TipoViaTransporte tipoviatransporteBean,TipoViaTransporte tipoviatransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoViaTransporte(TipoViaTransporte tipoviatransporteOrigen,TipoViaTransporte tipoviatransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoviatransporteOrigen.getId()!=null && !tipoviatransporteOrigen.getId().equals(0L))) {tipoviatransporte.setId(tipoviatransporteOrigen.getId());}}
			if(conDefault || (!conDefault && tipoviatransporteOrigen.getnombre()!=null && !tipoviatransporteOrigen.getnombre().equals(""))) {tipoviatransporte.setnombre(tipoviatransporteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoViaTransporte(TipoViaTransporte tipoviatransporte) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setText(tipoviatransporte.getId().toString());
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setText(tipoviatransporte.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoViaTransporte(TipoViaTransporteBean tipoviatransporteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setText(tipoviatransporteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setText(tipoviatransporteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoViaTransporte(TipoViaTransporteParameterReturnGeneral tipoviatransporteReturnGeneral,TipoViaTransporteBean tipoviatransporteBean,Boolean conDefault) throws Exception { 
		try {
			TipoViaTransporte tipoviatransporteLocal=new TipoViaTransporte();
			
			tipoviatransporteLocal=tipoviatransporteReturnGeneral.getTipoViaTransporte();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoviatransporteLocal.getId()!=null && !tipoviatransporteLocal.getId().equals(0L))) {tipoviatransporteBean.setId(tipoviatransporteLocal.getId());}}
			if(conDefault || (!conDefault && tipoviatransporteLocal.getnombre()!=null && !tipoviatransporteLocal.getnombre().equals(""))) {tipoviatransporteBean.setnombre(tipoviatransporteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoViaTransporteGenerico(Long idTipoViaTransporteSeleccionado,JComboBox jComboBoxTipoViaTransporte,List<TipoViaTransporte> tipoviatransportesLocal)throws Exception {
		try {
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesLocal) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			jComboBoxTipoViaTransporte.setSelectedItem(tipoviatransporteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoViaTransporteGenerico(JComboBox jComboBoxTipoViaTransporte,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoViaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoViaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoViaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoViaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoViaTransporte.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoViaTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoViaTransporte.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoViaTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoViaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoViaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoviatransporte=(TipoViaTransporte) tipoviatransporteLogic.getTipoViaTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoviatransporte =(TipoViaTransporte) tipoviatransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoViaTransporte tipoviatransporteRow=new TipoViaTransporte();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoviatransporteRow=(TipoViaTransporte) tipoviatransporteLogic.getTipoViaTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoviatransporteRow=(TipoViaTransporte) tipoviatransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoViaTransporte(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));			
			this.jButtonDuplicarTipoViaTransporte.setVisible((this.isVisibilidadCeldaDuplicarTipoViaTransporte && this.isPermisoDuplicarTipoViaTransporte));			
			this.jButtonCopiarTipoViaTransporte.setVisible((this.isVisibilidadCeldaCopiarTipoViaTransporte && this.isPermisoCopiarTipoViaTransporte));
			this.jButtonVerFormTipoViaTransporte.setVisible((this.isVisibilidadCeldaVerFormTipoViaTransporte && this.isPermisoVerFormTipoViaTransporte));
			
			this.jButtonAbrirOrderByTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));			
			
			this.jButtonNuevoRelacionesTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));			
			this.jButtonNuevoGuardarCambiosTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarTipoViaTransporte.setVisible((this.isVisibilidadCeldaModificarTipoViaTransporte && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.setVisible((this.isVisibilidadCeldaActualizarTipoViaTransporte && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.setVisible((this.isVisibilidadCeldaEliminarTipoViaTransporte && this.isPermisoEliminarTipoViaTransporte));
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.setVisible(this.isVisibilidadCeldaCancelarTipoViaTransporte);							
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));						
			this.jButtonDuplicarToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaDuplicarTipoViaTransporte && this.isPermisoDuplicarTipoViaTransporte));						
			this.jButtonCopiarToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaCopiarTipoViaTransporte && this.isPermisoCopiarTipoViaTransporte));			
			this.jButtonVerFormToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaVerFormTipoViaTransporte && this.isPermisoVerFormTipoViaTransporte));			
			this.jButtonAbrirOrderByToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));
			this.jButtonNuevoRelacionesToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));			
			this.jButtonNuevoGuardarCambiosToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));			
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaModificarTipoViaTransporte && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaActualizarTipoViaTransporte  && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaEliminarTipoViaTransporte && this.isPermisoEliminarTipoViaTransporte));
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarToolBarTipoViaTransporte.setVisible(this.isVisibilidadCeldaCancelarTipoViaTransporte);				
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));			
			this.jMenuItemDuplicarTipoViaTransporte.setVisible((this.isVisibilidadCeldaDuplicarTipoViaTransporte && this.isPermisoDuplicarTipoViaTransporte));			
			this.jMenuItemCopiarTipoViaTransporte.setVisible((this.isVisibilidadCeldaCopiarTipoViaTransporte && this.isPermisoCopiarTipoViaTransporte));			
			this.jMenuItemVerFormTipoViaTransporte.setVisible((this.isVisibilidadCeldaVerFormTipoViaTransporte && this.isPermisoVerFormTipoViaTransporte));			
			this.jMenuItemAbrirOrderByTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));			
			//this.jMenuItemMostrarOcultarTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));
			this.jMenuItemDetalleAbrirOrderByTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));			
			//this.jMenuItemDetalleMostrarOcultarTipoViaTransporte.setVisible((this.isVisibilidadCeldaOrdenTipoViaTransporte && this.isPermisoOrdenTipoViaTransporte));			
			this.jMenuItemNuevoRelacionesTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte));			
			this.jMenuItemNuevoGuardarCambiosTipoViaTransporte.setVisible((this.isVisibilidadCeldaNuevoTipoViaTransporte && this.isPermisoNuevoTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));									
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemModificarTipoViaTransporte.setVisible((this.isVisibilidadCeldaModificarTipoViaTransporte && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemActualizarTipoViaTransporte.setVisible((this.isVisibilidadCeldaActualizarTipoViaTransporte && this.isPermisoActualizarTipoViaTransporte));	
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemEliminarTipoViaTransporte.setVisible((this.isVisibilidadCeldaEliminarTipoViaTransporte && this.isPermisoEliminarTipoViaTransporte));
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemCancelarTipoViaTransporte.setVisible(this.isVisibilidadCeldaCancelarTipoViaTransporte);				
			}
			
			this.jMenuItemGuardarCambiosTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));						
			this.jMenuItemGuardarCambiosTablaTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=this.jButtonNuevoTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaDuplicarTipoViaTransporte=this.jButtonDuplicarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaCopiarTipoViaTransporte=this.jButtonCopiarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaVerFormTipoViaTransporte=this.jButtonVerFormTipoViaTransporte.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoViaTransporte=this.jButtonAbrirOrderByTipoViaTransporte.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=this.jButtonNuevoRelacionesTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaModificarTipoViaTransporte=this.jButtonModificarTipoViaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.isVisibilidadCeldaActualizarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=this.jButtonGuardarCambiosTablaTipoViaTransporte.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoViaTransporte=this.jButtonNuevoToolBarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=this.jButtonNuevoRelacionesToolBarTipoViaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.isVisibilidadCeldaModificarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarToolBarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaActualizarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarToolBarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarToolBarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarToolBarTipoViaTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoViaTransporte=this.jButtonGuardarCambiosToolBarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoViaTransporte=this.jMenuItemNuevoTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=this.jMenuItemNuevoRelacionesTipoViaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.isVisibilidadCeldaModificarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemModificarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaActualizarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemActualizarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemEliminarTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarTipoViaTransporte=this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemCancelarTipoViaTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoViaTransporte=this.jMenuItemGuardarCambiosTipoViaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=this.jMenuItemGuardarCambiosTablaTipoViaTransporte.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoViaTransporte(Boolean esInicializar) {
		if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoViaTransporte();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoViaTransporte(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoViaTransporte() {
		this.jButtonNuevoTipoViaTransporte.setVisible(this.isPermisoNuevoTipoViaTransporte);			
		this.jButtonDuplicarTipoViaTransporte.setVisible(this.isPermisoDuplicarTipoViaTransporte);			
		this.jButtonCopiarTipoViaTransporte.setVisible(this.isPermisoCopiarTipoViaTransporte);			
		this.jButtonVerFormTipoViaTransporte.setVisible(this.isPermisoVerFormTipoViaTransporte);			
		
		this.jButtonAbrirOrderByTipoViaTransporte.setVisible(this.isPermisoOrdenTipoViaTransporte);					
		
		this.jButtonNuevoRelacionesTipoViaTransporte.setVisible(this.isPermisoNuevoTipoViaTransporte);			
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarTipoViaTransporte.setVisible(this.isPermisoActualizarTipoViaTransporte);	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.setVisible(this.isPermisoActualizarTipoViaTransporte);	
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.setVisible(this.isPermisoEliminarTipoViaTransporte);
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.setVisible(this.isVisibilidadCeldaCancelarTipoViaTransporte);						
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.setVisible(this.isPermisoGuardarCambiosTipoViaTransporte);							
		}
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.setVisible(this.isPermisoActualizarTipoViaTransporte);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoViaTransporte() {
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarTipoViaTransporte.setVisible(this.isPermisoActualizarTipoViaTransporte);	
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.setVisible(this.isPermisoActualizarTipoViaTransporte);	
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.setVisible(this.isPermisoEliminarTipoViaTransporte);
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.setVisible(this.isVisibilidadCeldaCancelarTipoViaTransporte);							
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.setVisible((this.isVisibilidadCeldaGuardarTipoViaTransporte && this.isPermisoGuardarCambiosTipoViaTransporte));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoViaTransporte() {
		if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoViaTransporte();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoViaTransporte() {
	}
	
	public void jTableDatosTipoViaTransporteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoViaTransporte(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoViaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.gettipoviatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoviatransporte==null) {
						this.tipoviatransporte = new TipoViaTransporte();
					}

					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
				}

				if(this.tipoviatransporte.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoviatransporte.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoViaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoViaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.gettipoviatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoviatransporte==null) {
						this.tipoviatransporte = new TipoViaTransporte();
					}

					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);
				}

				if(this.tipoviatransporte.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoviatransporte.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoViaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoViaTransporte() {
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
			this.jInternalFrameDetalleFormTipoViaTransporte.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoViaTransporte.dispose();
			this.jInternalFrameDetalleFormTipoViaTransporte=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
			this.jInternalFrameReporteDinamicoTipoViaTransporte.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoViaTransporte.dispose();
			this.jInternalFrameReporteDinamicoTipoViaTransporte=null;
		}
		
		if(this.jInternalFrameImportacionTipoViaTransporte!=null) {
			this.jInternalFrameImportacionTipoViaTransporte.setVisible(false);	    			
			this.jInternalFrameImportacionTipoViaTransporte.dispose();
			this.jInternalFrameImportacionTipoViaTransporte=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoViaTransporte();
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoViaTransporte")) {
				jButtonDuplicarTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoViaTransporte")) {
				jButtonCopiarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoViaTransporte")) {
				jButtonVerFormTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoViaTransporte")) {
				jButtonDuplicarTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoViaTransporte")) {
				jButtonDuplicarTipoViaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoViaTransporte")) {
				jButtonModificarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoViaTransporte")) {
				jButtonModificarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoViaTransporte")) {
				jButtonModificarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoViaTransporte")) {
				jButtonActualizarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoViaTransporte")) {
				jButtonActualizarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoViaTransporte")) {
				jButtonActualizarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoViaTransporte")) {
				jButtonEliminarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoViaTransporte")) {
				jButtonEliminarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoViaTransporte")) {
				jButtonEliminarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoViaTransporte")) {
				jButtonCancelarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoViaTransporte")) {
				jButtonCancelarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoViaTransporte")) {
				jButtonCancelarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoViaTransporte")) {
				jButtonCerrarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoViaTransporte")) {
				jButtonCerrarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoViaTransporte")) {
				jButtonCerrarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoViaTransporte")) {
				jButtonMostrarOcultarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoViaTransporte")) {
				jButtonCancelarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoViaTransporte")) {
				jButtonCopiarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoViaTransporte")) {
				jButtonVerFormTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoViaTransporte")) {
				jButtonCopiarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoViaTransporte")) {
				jButtonVerFormTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoViaTransporte")) {
				jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoViaTransporte")) {
				jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoViaTransporte")) {
				jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoViaTransporte")) {
				jButtonAnterioresTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoViaTransporte")) {
				jButtonAnterioresTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoViaTransporte")) {
				jButtonAnterioresTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoViaTransporte")) {
				jButtonSiguientesTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoViaTransporte")) {
				jButtonSiguientesTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoViaTransporte")) {
				jButtonSiguientesTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoViaTransporte") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoViaTransporte")) {
				jButtonAbrirOrderByTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoViaTransporte") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoViaTransporte")) {
				jButtonMostrarOcultarTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoViaTransporte")) {
				jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoViaTransporte")) {
				jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoViaTransporte")) {
				jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoViaTransporte")) {
				jButtonCerrarReporteDinamicoTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoViaTransporte")) {
				jButtonGenerarReporteDinamicoTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoViaTransporte")) {
				
				jButtonGenerarExcelReporteDinamicoTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoViaTransporte")) {
				jButtonCerrarImportacionTipoViaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoViaTransporte")) {
				
				jButtonGenerarImportacionTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoViaTransporte")) {
				
				jButtonAbrirImportacionTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoViaTransporte")) {
				jComboBoxTiposAccionesTipoViaTransporteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoViaTransporte")) {
				jComboBoxTiposRelacionesTipoViaTransporteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoViaTransporte")) {
				jComboBoxTiposAccionesTipoViaTransporteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoViaTransporte")) {
				
				jComboBoxTiposSeleccionarTipoViaTransporteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoViaTransporte")) {
				jTextFieldValorCampoGeneralTipoViaTransporteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoViaTransporte")) {
				jButtonAbrirOrderByTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoViaTransporte")) {
				jButtonAbrirOrderByTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoViaTransporte")) {
				jButtonCerrarOrderByTipoViaTransporteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoViaTransporteBusqueda")) {
				this.jButtonidTipoViaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoViaTransporteBusqueda")) {
				this.jButtonnombreTipoViaTransporteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoViaTransporte();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoViaTransporte tipoviatransporteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoviatransporteLocal=this.tipoviatransporte;
			} else {
				tipoviatransporteLocal=this.tipoviatransporteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
							
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
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
			
			


			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
								
						
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
								
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
							
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
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
			
			


			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
								
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoViaTransporte")) {
					jCheckBoxSeleccionarTodosTipoViaTransporteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoViaTransporte")) {
					jCheckBoxSeleccionadosTipoViaTransporteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoViaTransporte")) {
					
				}
				
				


				
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
												
				
				


				
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
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
			
			


			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoviatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoviatransporte);
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
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
				
				


				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoViaTransporte.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoViaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviatransporteAnterior =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoViaTransporte")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoViaTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoViaTransporte.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoviatransporte =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoviatransporte);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoViaTransporte")) {
				
				}
				
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoViaTransporte")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoViaTransporte.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoViaTransporte")) {
			
			}
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoViaTransporte();
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoViaTransporte")) {
				jButtonDuplicarTipoViaTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoViaTransporte")) {
				jButtonCopiarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoViaTransporte")) {
				jButtonVerFormTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoViaTransporte")) {
				jButtonNuevoTipoViaTransporteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoViaTransporte")) {
				jButtonModificarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoViaTransporte")) {
				jButtonActualizarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoViaTransporte")) {
				jButtonEliminarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoViaTransporte")) {
				jButtonCancelarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoViaTransporte")) {
				jButtonCerrarTipoViaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoViaTransporte")) {
				jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoViaTransporte")) {
				jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoViaTransporte")) {
				jButtonAbrirOrderByTipoViaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoViaTransporte")) {
				jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoViaTransporte")) {
				jButtonAnterioresTipoViaTransporteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoViaTransporte")) {
				jButtonSiguientesTipoViaTransporteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoViaTransporteBusqueda")) {
				this.jButtonidTipoViaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoViaTransporteBusqueda")) {
				this.jButtonnombreTipoViaTransporteBusquedaActionPerformed(evt);
			}
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoViaTransporte();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoViaTransporte")) {
				closingInternalFrameTipoViaTransporte();
				
			} else if(sTipo.equals("jButtonCancelarTipoViaTransporte")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoViaTransporte = (JInternalFrameBase)evt.getSource();
	            	
	            TipoViaTransporteBeanSwingJInternalFrame jInternalFrameParent=(TipoViaTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoViaTransporte.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoViaTransporteActionPerformed(null);
			}
			
			TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoviatransporte,new Object(),this.tipoviatransporteParameterGeneral,this.tipoviatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoViaTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoViaTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoViaTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoviatransporte)) {
			if(!esControlTabla) {
				if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);			
				}
				
				if(this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoViaTransporte(this.tipoviatransporte,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoviatransporteReturnGeneral=tipoviatransporteLogic.procesarEventosTipoViaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviatransporteLogic.getTipoViaTransportes(),this.tipoviatransporte,this.tipoviatransporteParameterGeneral,this.isEsNuevoTipoViaTransporte,classes);//this.tipoviatransporteLogic.getTipoViaTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoViaTransporte(this.tipoviatransporteReturnGeneral,this.tipoviatransporteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoViaTransporte(classes,this.tipoviatransporteReturnGeneral,this.tipoviatransporteBean,false);
					}
						
					if(this.tipoviatransporteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte());	
					}
						
					if(this.tipoviatransporteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte(),classes);//this.tipoviatransporteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoViaTransporte(this.tipoviatransporte,classes);//this.tipoviatransporteBean);									
				}
			
				if(TipoViaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoViaTransporte(this.tipoviatransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoViaTransporte(this.tipoviatransporte);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoviatransporteAnterior!=null) {
						this.tipoviatransporte=this.tipoviatransporteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoviatransporteReturnGeneral=tipoviatransporteLogic.procesarEventosTipoViaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviatransporteLogic.getTipoViaTransportes(),this.tipoviatransporte,this.tipoviatransporteParameterGeneral,this.isEsNuevoTipoViaTransporte,classes);//this.tipoviatransporteLogic.getTipoViaTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoviatransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoviatransporteReturnGeneral.getTipoViaTransporte(),tipoviatransporteLogic.getTipoViaTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoviatransporteReturnGeneral.getTipoViaTransporte(),this.tipoviatransportes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoViaTransporte.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoViaTransporte.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoViaTransporte();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoViaTransporte() throws Exception {
		
		TipoViaTransporteModel tipoviatransporteModel=(TipoViaTransporteModel)this.jTableDatosTipoViaTransporte.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoviatransporteModel.tipoviatransportes=this.tipoviatransporteLogic.getTipoViaTransportes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoviatransporteModel.tipoviatransportes=this.tipoviatransportes;
		}
		
		
		((TipoViaTransporteModel) this.jTableDatosTipoViaTransporte.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoViaTransporte() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoviatransporteAnterior(),this.tipoviatransporteLogic.getTipoViaTransportes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoviatransporteAnterior(),this.tipoviatransportes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoViaTransporte();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoViaTransporte(TipoViaTransporte tipoviatransporte,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
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
										
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviatransporte,new Object(),generalEntityParameterGeneral,this.tipoviatransporteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoViaTransporteConstantesFunciones.getClassesRelationshipsOfTipoViaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoViaTransporteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoViaTransporte(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoViaTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoViaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviatransporte,new Object(),generalEntityParameterGeneral,this.tipoviatransporteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoViaTransporte(TipoViaTransporteBean tipoviatransporteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoViaTransporte(ArrayList<Classe> classes,TipoViaTransporteReturnGeneral tipoviatransporteReturnGeneral,TipoViaTransporteBean tipoviatransporteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoViaTransporte(TipoViaTransporte tipoviatransporte,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoviatransporte)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoViaTransporte = new TipoViaTransporteDetalleFormJInternalFrame(jDesktopPane,this.tipoviatransporteSessionBean.getConGuardarRelaciones(),this.tipoviatransporteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoViaTransporte);
		this.jInternalFrameDetalleFormTipoViaTransporte.setVisible(false);
		this.jInternalFrameDetalleFormTipoViaTransporte.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoViaTransporte.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoViaTransporte.tipoviatransporteLogic=this.tipoviatransporteLogic;
		
		this.cargarCombosFrameForeignKeyTipoViaTransporte("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoViaTransporte();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoViaTransporte();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoViaTransporte("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoViaTransporte();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoViaTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoViaTransporte"));
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ModificarTipoViaTransporte"));

		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoViaTransporte"));
					
		this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemModificarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoViaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"ActualizarTipoViaTransporte"));
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoViaTransporte"));
						
		this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemActualizarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoViaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"EliminarTipoViaTransporte"));
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoViaTransporte"));
								
		this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemEliminarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoViaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CancelarTipoViaTransporte"));
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoViaTransporte"));
					
		this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemCancelarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoViaTransporte"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemDetalleCerrarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoViaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoViaTransporte"));
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoViaTransporte"));
		
		
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoViaTransporte"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonidTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonnombreTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViaTransporteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoViaTransporte"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoViaTransporte"));
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoViaTransporte"));
		}
		
		this.jTableDatosTipoViaTransporte.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoViaTransporte"));
		
		this.jTableDatosTipoViaTransporte.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoViaTransporte"));
		
		this.jButtonNuevoTipoViaTransporte.addActionListener(new ButtonActionListener(this,"NuevoTipoViaTransporte"));
		
		this.jButtonDuplicarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"DuplicarTipoViaTransporte"));
		
		this.jButtonCopiarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"CopiarTipoViaTransporte"));
		
		this.jButtonVerFormTipoViaTransporte.addActionListener(new ButtonActionListener(this,"VerFormTipoViaTransporte"));
		
		
		this.jButtonNuevoToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoViaTransporte"));
			
		this.jButtonDuplicarToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoViaTransporte"));
			
		this.jMenuItemNuevoTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoViaTransporte"));
			
		this.jMenuItemDuplicarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoViaTransporte"));		
		
		
		this.jButtonNuevoRelacionesTipoViaTransporte.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoViaTransporte"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoViaTransporte"));
			
		this.jMenuItemNuevoRelacionesTipoViaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoViaTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ModificarTipoViaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonModificarToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoViaTransporte"));
			
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemModificarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoViaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"ActualizarTipoViaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonActualizarToolBarTipoViaTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoViaTransporte"));
				
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemActualizarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoViaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"EliminarTipoViaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonEliminarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoViaTransporte"));
						
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemEliminarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoViaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CancelarTipoViaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonCancelarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoViaTransporte"));
			
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemCancelarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoViaTransporte"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoViaTransporte"));		
		
		
		this.jButtonCerrarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CerrarTipoViaTransporte"));
		
		
		this.jButtonCerrarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoViaTransporte"));
			
		this.jMenuItemCerrarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoViaTransporte"));
			
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jMenuItemDetalleCerrarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoViaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoViaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoViaTransporte"));
		}
		
		this.jButtonCopiarToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoViaTransporte"));
			
		this.jButtonVerFormToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoViaTransporte"));
		
		this.jMenuItemGuardarCambiosTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoViaTransporte"));
			
		this.jMenuItemCopiarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoViaTransporte"));		
		
		this.jMenuItemVerFormTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoViaTransporte"));		
		
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoViaTransporte"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoViaTransporte"));
			
		this.jMenuItemGuardarCambiosTablaTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoViaTransporte"));		
		
		
		
		this.jButtonRecargarInformacionTipoViaTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoViaTransporte"));
					
		this.jButtonRecargarInformacionToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoViaTransporte"));
		
		this.jMenuItemRecargarInformacionTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoViaTransporte"));		
		
		
		
		this.jButtonAnterioresTipoViaTransporte.addActionListener (new ButtonActionListener(this,"AnterioresTipoViaTransporte"));
		
		
		this.jButtonAnterioresToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoViaTransporte"));
		
		this.jMenuItemAnterioresTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoViaTransporte"));		
		
		
		this.jButtonSiguientesTipoViaTransporte.addActionListener (new ButtonActionListener(this,"SiguientesTipoViaTransporte"));
		
		
		this.jButtonSiguientesToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoViaTransporte"));
			
		this.jMenuItemSiguientesTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoViaTransporte"));
			
		this.jMenuItemAbrirOrderByTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoViaTransporte"));
			
		this.jMenuItemMostrarOcultarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoViaTransporte"));
			
		this.jMenuItemDetalleAbrirOrderByTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoViaTransporte"));
			
		this.jMenuItemDetalleMostarOcultarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoViaTransporte"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoViaTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoViaTransporte"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoViaTransporte"));
			
		this.jMenuItemNuevoGuardarCambiosTipoViaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoViaTransporte"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoViaTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoViaTransporte"));

		this.jCheckBoxSeleccionadosTipoViaTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoViaTransporte"));
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoViaTransporte"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoViaTransporte.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoViaTransporte"));
			
		this.jComboBoxTiposAccionesTipoViaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoViaTransporte"));
					
		this.jComboBoxTiposSeleccionarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoViaTransporte"));
			
		this.jTextFieldValorCampoGeneralTipoViaTransporte.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoViaTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonidTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonnombreTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViaTransporteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoViaTransporte!=null) {
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoViaTransporte"));
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoViaTransporte"));
				this.jInternalFrameReporteDinamicoTipoViaTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoViaTransporte"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoViaTransporte.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoViaTransporte"));				
			//this.jButtonGenerarReporteDinamicoTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoViaTransporte"));
			//this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoViaTransporte"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoViaTransporte!=null) {
				this.jInternalFrameImportacionTipoViaTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoViaTransporte"));
				this.jInternalFrameImportacionTipoViaTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoViaTransporte"));
				this.jInternalFrameImportacionTipoViaTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoViaTransporte"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoViaTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoViaTransporte"));
			
			this.jButtonAbrirOrderByToolBarTipoViaTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoViaTransporte"));			
			
			if(this.jInternalFrameOrderByTipoViaTransporte!=null) {
				this.jInternalFrameOrderByTipoViaTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoViaTransporte"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoViaTransporte.jTabbedPaneRelacionesTipoViaTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoViaTransporte"));
		
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
            		closingInternalFrameTipoViaTransporte();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoViaTransporte.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoViaTransporte = (JInternalFrameBase)event.getSource();
	            	
	            TipoViaTransporteBeanSwingJInternalFrame jInternalFrameParent=(TipoViaTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoViaTransporte.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoViaTransporteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoViaTransporte.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoViaTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoViaTransporte.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoViaTransporte.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoViaTransporte";
		inputMap = this.jButtonNuevoTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoViaTransporteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoViaTransporte";
		inputMap = this.jButtonNuevoRelacionesTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoViaTransporteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoViaTransporte";
		inputMap = this.jButtonModificarTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoViaTransporte";
		inputMap = this.jButtonActualizarTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoViaTransporte";
		inputMap = this.jButtonEliminarTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoViaTransporte";
		inputMap = this.jButtonCancelarTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoViaTransporte";
		inputMap = this.jButtonCerrarTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoViaTransporte";
		inputMap = this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonGuardarCambiosTipoViaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoViaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoViaTransporte.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoViaTransporteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoViaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoViaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoViaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoViaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoViaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoViaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonidTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoViaTransporte.jButtonnombreTipoViaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViaTransporteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoViaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoViaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoViaTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoViaTransporte.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoViaTransporte(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
					tipoviatransporteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoViaTransporte tipoviatransporteAux:tipoviatransportes) {
					tipoviatransporteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoViaTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
						tipoviatransporteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoViaTransporte tipoviatransporteAux:tipoviatransportes) {
						tipoviatransporteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoViaTransporte tipoviatransporteAux:tipoviatransportes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoViaTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoViaTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoViaTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoViaTransporte.getSelectedRows();
			
			TipoViaTransporte tipoviatransporteLocal=new TipoViaTransporte();
			
			//this.seleccionarTodosTipoViaTransporte(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLocal =(TipoViaTransporte) this.tipoviatransporteLogic.getTipoViaTransportes().toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoviatransporteLocal =(TipoViaTransporte) this.tipoviatransportes.toArray()[this.jTableDatosTipoViaTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoviatransporteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
						tipoviatransporteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoViaTransporte tipoviatransporteAux:tipoviatransportes) {
						tipoviatransporteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoViaTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoViaTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoViaTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoViaTransporteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoViaTransporteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoViaTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoViaTransporte.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransporteLogic.getTipoViaTransportes()) {
				
						if(sTipoSeleccionar.equals(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoviatransporteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoViaTransporte tipoviatransporteAux:tipoviatransportes) {
					
						if(sTipoSeleccionar.equals(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoviatransporteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoViaTransporteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoViaTransporte=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoViaTransporte.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoViaTransporte) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoViaTransporte(conSplash);
				
					this.generarReporteTipoViaTransportesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoViaTransportesSeleccionados();
				//this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoViaTransportesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoViaTransportesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoViaTransporte();
				
				this.exportarTipoViaTransportesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoViaTransportes();
				//this.importarTipoViaTransportes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoViaTransporte();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoViaTransportesSeleccionados();
				//this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Via Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoViaTransporte();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoViaTransporte)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoViaTransporte(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoViaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoViaTransporte.jComboBoxTiposAccionesFormularioTipoViaTransporte.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoViaTransporte();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoViaTransporte(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoViaTransporteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoViaTransporte();
			
			if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
			TipoViaTransporte tipoviatransporte=new TipoViaTransporte();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoViaTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoViaTransporte.getSelectedItem();
			
			
			
			
			tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoviatransportesSeleccionados.size()==1) {
				for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
					tipoviatransporte=tipoviatransporteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoViaTransporte();
			
      		//this.finishProcessTipoViaTransporte(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoViaTransporteReturnGeneral() throws Exception {
		if(this.tipoviatransporteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoviatransporteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoviatransporteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoviatransporteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoviatransporteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoviatransporteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoViaTransporte(false);
		}
		
		if(this.tipoviatransporteReturnGeneral.getConRetornoLista() || this.tipoviatransporteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoviatransporteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoviatransporteLogic.setTipoViaTransportes(this.tipoviatransporteReturnGeneral.getTipoViaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoviatransporteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoviatransporteLogic.setTipoViaTransporte(this.tipoviatransporteReturnGeneral.getTipoViaTransporte());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoViaTransporte(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoViaTransporte() throws Exception {
		
		
	}
	
	public ArrayList<TipoViaTransporte> getTipoViaTransportesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoViaTransporte) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoViaTransporte tipoviatransporteAux:tipoviatransporteLogic.getTipoViaTransportes()) {
					if(tipoviatransporteAux.getIsSelected()) {
						tipoviatransportesSeleccionados.add(tipoviatransporteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoViaTransporte tipoviatransporteAux:this.tipoviatransportes) {
					if(tipoviatransporteAux.getIsSelected()) {
						tipoviatransportesSeleccionados.add(tipoviatransporteAux);				
					}
				}
			}
			
			if(tipoviatransportesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoviatransportesSeleccionados.addAll(this.tipoviatransporteLogic.getTipoViaTransportes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoviatransportesSeleccionados.addAll(this.tipoviatransportes);				
					}
				}
			}
		} else {
			tipoviatransportesSeleccionados.add(this.tipoviatransporte);
		}
		
		return tipoviatransportesSeleccionados;
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
	
	public void generarReporteTipoViaTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoViaTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoViaTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoViaTransportesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoViaTransportesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Via Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoViaTransportesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoViaTransporte();
		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoViaTransporte();
		
		
		//this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados ,tipoviatransporteImplementable,tipoviatransporteImplementableHome);
	}
	
	public void mostrarImportacionTipoViaTransportes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoViaTransporte();
		
		this.abrirFrameImportacionTipoViaTransporte();		
		
			
		//this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados ,tipoviatransporteImplementable,tipoviatransporteImplementableHome);
	}
	
	public void importarTipoViaTransportes() throws Exception {		
	
	}
	
	public void exportarTipoViaTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoViaTransportesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoViaTransportesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoViaTransportesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Via Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoViaTransporte(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoViaTransporte(tipoviatransporteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoviatransporteAux.setsDetalleGeneralEntityReporte(tipoviatransporteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoViaTransporte(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoViaTransporteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViaTransporteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViaTransporteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoViaTransporte(TipoViaTransporte tipoviatransporte,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoviatransporte.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoviatransporte.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoviatransporte.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoViaTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoViaTransporte(row);				
				iRow++;
			}				
			
			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoViaTransporte(tipoviatransporteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoViaTransportesSeleccionados() throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();		
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoviatransporte.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoviatransportes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoviatransporte");
			//elementRoot.appendChild(element);
		
			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
				element = document.createElement("tipoviatransporte");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoViaTransporte(tipoviatransporteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Via Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoViaTransporte(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViaTransporteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViaTransporteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoViaTransporte(TipoViaTransporte tipoviatransporte,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoviatransporte.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoviatransporte.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoViaTransporte(TipoViaTransporte tipoviatransporte,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoViaTransporteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoviatransporte.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoViaTransporteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoviatransporte.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoViaTransporteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoviatransporte.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoViaTransportesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados=new ArrayList<TipoViaTransporte>();
		
		tipoviatransportesSeleccionados=this.getTipoViaTransportesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoViaTransporte(tipoviatransportesSeleccionados);
		
		this.generarReporteTipoViaTransportes("Todos",tipoviatransportesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoViaTransporte(ArrayList<TipoViaTransporte> tipoviatransportesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesSeleccionados) {
				tipoviatransporteAux.setsDetalleGeneralEntityReporte(tipoviatransporteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoviatransporteAux.setsDescripcionGeneralEntityReporte1(tipoviatransporteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoViaTransporte(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoViaTransporte=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=true;
				this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=true;
			}
			
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=true;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=true;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=true;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=true;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=true;
			this.isVisibilidadCeldaModificarTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
			this.isVisibilidadCeldaModificarTipoViaTransporte=true;
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
			this.isVisibilidadCeldaCancelarTipoViaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoViaTransporte=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoViaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=true;
		} else {
			this.actualizarEstadoPanelsTipoViaTransporte(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoViaTransporte=false;
			//this.isVisibilidadCeldaVerFormTipoViaTransporte=false;
			this.isVisibilidadCeldaDuplicarTipoViaTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoviatransporteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoViaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosTipoViaTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			if(!tipoviatransporteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;												
			}
			
			this.jButtonCerrarTipoViaTransporte.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoViaTransporte=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoviatransporte)) {
			this.isVisibilidadCeldaActualizarTipoViaTransporte=false;
			this.isVisibilidadCeldaEliminarTipoViaTransporte=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoViaTransporte() {
	}
	
	public void actualizarEstadoPanelsTipoViaTransporte(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoViaTransporte!=null) {
				this.jScrollPanelDatosEdicionTipoViaTransporte.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoViaTransporte!=null) {
				this.jScrollPanelDatosTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoViaTransporte!=null) {
				this.jPanelPaginacionTipoViaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoViaTransporte!=null) {
				this.jPanelParametrosReportesTipoViaTransporte.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoViaTransporteSessionBean tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		
		if(this.tipoviatransporteSessionBean==null) {
			this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		}
		
		this.tipoviatransporteSessionBean.setsUltimaBusquedaTipoViaTransporte(this.getsAccionBusqueda());
		this.tipoviatransporteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoviatransporteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoViaTransporteSessionBean tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		
		if(this.tipoviatransporteSessionBean==null) {
			this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		}
		
		if(this.tipoviatransporteSessionBean.getsUltimaBusquedaTipoViaTransporte()!=null&&!this.tipoviatransporteSessionBean.getsUltimaBusquedaTipoViaTransporte().equals("")) {
			this.setsAccionBusqueda(tipoviatransporteSessionBean.getsUltimaBusquedaTipoViaTransporte());
			this.setiNumeroPaginacion(tipoviatransporteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoviatransporteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoviatransporteSessionBean.setsUltimaBusquedaTipoViaTransporte("");
		this.tipoviatransporteSessionBean.setiNumeroPaginacion(TipoViaTransporteConstantesFunciones.INUMEROPAGINACION);
		this.tipoviatransporteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoViaTransporte(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoViaTransporte() {
		this.updateBorderResaltarBusquedasFormularioTipoViaTransporte();
		this.updateVisibilidadBusquedasFormularioTipoViaTransporte();
		this.updateHabilitarBusquedasFormularioTipoViaTransporte();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoViaTransporte() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoViaTransporte() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoViaTransporte() {
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
	
	public void updateControlesFormularioTipoViaTransporte() throws Exception {

		if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoViaTransporte();
		this.updateVisibilidadResaltarControlesFormularioTipoViaTransporte();
		this.updateHabilitarResaltarControlesFormularioTipoViaTransporte();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoViaTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoviatransporteConstantesFunciones.resaltaridTipoViaTransporte!=null && this.jInternalFrameDetalleFormTipoViaTransporte!=null) {this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setBorder(this.tipoviatransporteConstantesFunciones.resaltaridTipoViaTransporte);}
		if(this.tipoviatransporteConstantesFunciones.resaltarnombreTipoViaTransporte!=null && this.jInternalFrameDetalleFormTipoViaTransporte!=null) {this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setBorder(this.tipoviatransporteConstantesFunciones.resaltarnombreTipoViaTransporte);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoViaTransporte() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
	
		//this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setVisible(this.tipoviatransporteConstantesFunciones.mostraridTipoViaTransporte);
		this.jInternalFrameDetalleFormTipoViaTransporte.jPanelidTipoViaTransporte.setVisible(this.tipoviatransporteConstantesFunciones.mostraridTipoViaTransporte);
		//this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setVisible(this.tipoviatransporteConstantesFunciones.mostrarnombreTipoViaTransporte);
		this.jInternalFrameDetalleFormTipoViaTransporte.jPanelnombreTipoViaTransporte.setVisible(this.tipoviatransporteConstantesFunciones.mostrarnombreTipoViaTransporte);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoViaTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormTipoViaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoViaTransporte!=null) {
	
		this.jInternalFrameDetalleFormTipoViaTransporte.jTextFieldidTipoViaTransporte.setEnabled(this.tipoviatransporteConstantesFunciones.activaridTipoViaTransporte);
		this.jInternalFrameDetalleFormTipoViaTransporte.jTextAreanombreTipoViaTransporte.setEnabled(this.tipoviatransporteConstantesFunciones.activarnombreTipoViaTransporte);
		}
	}
	
		
}