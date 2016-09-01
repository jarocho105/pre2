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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoUnidadConstantesFunciones;
import com.bydan.erp.inventario.util.TipoUnidadParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoUnidadParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoUnidadBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoUnidadBeanSwingJInternalFrame extends TipoUnidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoUnidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoUnidad> tipounidadValidator = new ClassValidator<TipoUnidad>(TipoUnidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoUnidad tipounidad;	
	public TipoUnidad tipounidadAux;
	public TipoUnidad tipounidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoUnidad tipounidadTotales;
	public Long idTipoUnidadActual;
	public Long iIdNuevoTipoUnidad=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosUnidad=false;

	public Boolean getIsTienePermisosUnidad() {
		return isTienePermisosUnidad;
	}

	public void setIsTienePermisosUnidad(Boolean isTienePermisosUnidad) {
		this.isTienePermisosUnidad= isTienePermisosUnidad;
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
	
	public Boolean isPermisoTodoTipoUnidad;
	public Boolean isPermisoNuevoTipoUnidad;
	public Boolean isPermisoActualizarTipoUnidad;
	public Boolean isPermisoActualizarOriginalTipoUnidad;
	public Boolean isPermisoEliminarTipoUnidad;
	public Boolean isPermisoGuardarCambiosTipoUnidad;
	public Boolean isPermisoConsultaTipoUnidad;
	public Boolean isPermisoBusquedaTipoUnidad;
	public Boolean isPermisoReporteTipoUnidad;
	public Boolean isPermisoPaginacionMedioTipoUnidad;
	public Boolean isPermisoPaginacionAltoTipoUnidad;
	public Boolean isPermisoPaginacionTodoTipoUnidad;
	public Boolean isPermisoCopiarTipoUnidad;
	public Boolean isPermisoVerFormTipoUnidad;
	public Boolean isPermisoDuplicarTipoUnidad;
	public Boolean isPermisoOrdenTipoUnidad;
	
	
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
	
	public TipoUnidadParameterReturnGeneral tipounidadReturnGeneral;
	public TipoUnidadParameterReturnGeneral tipounidadParameterGeneral;
	
	

	public UnidadLogic unidadLogic=null;

	public UnidadLogic getUnidadLogic() {
		return unidadLogic;
	}

	public void setUnidadLogic(UnidadLogic unidadLogic) {
		this.unidadLogic = unidadLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoUnidad=false;
	public Boolean esParaAccionDesdeFormularioTipoUnidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoUnidadSessionBeanAdditional tipounidadSessionBeanAdditional=null;
	
	public TipoUnidadSessionBeanAdditional getTipoUnidadSessionBeanAdditional() {
		return this.tipounidadSessionBeanAdditional;
	}
	
	public void setTipoUnidadSessionBeanAdditional(TipoUnidadSessionBeanAdditional tipounidadSessionBeanAdditional) {
		try {
			this.tipounidadSessionBeanAdditional=tipounidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoUnidadBeanSwingJInternalFrameAdditional tipounidadBeanSwingJInternalFrameAdditional=null;
	//public class TipoUnidadBeanSwingJInternalFrame
	
	public TipoUnidadBeanSwingJInternalFrameAdditional getTipoUnidadBeanSwingJInternalFrameAdditional() {
		return this.tipounidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoUnidadBeanSwingJInternalFrameAdditional(TipoUnidadBeanSwingJInternalFrameAdditional tipounidadBeanSwingJInternalFrameAdditional) {
		try {
			this.tipounidadBeanSwingJInternalFrameAdditional=tipounidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoUnidadLogic tipounidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoUnidad tipounidadBean;
	public TipoUnidadConstantesFunciones tipounidadConstantesFunciones;
	//public TipoUnidadParameterReturnGeneral tipounidadReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoUnidad> tipounidads;	
	//public List<TipoUnidad> tipounidadsEliminados;
	//public List<TipoUnidad> tipounidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoUnidad=false;
	public Boolean isVisibilidadCeldaDuplicarTipoUnidad=true;
	public Boolean isVisibilidadCeldaCopiarTipoUnidad=true;
	public Boolean isVisibilidadCeldaVerFormTipoUnidad=true;
	public Boolean isVisibilidadCeldaOrdenTipoUnidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
	public Boolean isVisibilidadCeldaModificarTipoUnidad=false;
	public Boolean isVisibilidadCeldaActualizarTipoUnidad=false;
	public Boolean isVisibilidadCeldaEliminarTipoUnidad=false;
	public Boolean isVisibilidadCeldaCancelarTipoUnidad=false;
	public Boolean isVisibilidadCeldaGuardarTipoUnidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoUnidad=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSiglas=false;
	
	public Long getiIdNuevoTipoUnidad() {
		return this.iIdNuevoTipoUnidad;
	}

	public void setiIdNuevoTipoUnidad(Long iIdNuevoTipoUnidad) {
		this.iIdNuevoTipoUnidad = iIdNuevoTipoUnidad;
	}
	
	public Long getidTipoUnidadActual() {
		return this.idTipoUnidadActual;
	}

	public void setidTipoUnidadActual(Long idTipoUnidadActual) {
		this.idTipoUnidadActual = idTipoUnidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoUnidad gettipounidad() {
		return this.tipounidad;
	}

	public void settipounidad(TipoUnidad tipounidad) {
		this.tipounidad = tipounidad;
	}
	
	public TipoUnidad gettipounidadAux() {
		return this.tipounidadAux;
	}

	public void settipounidadAux(TipoUnidad tipounidadAux) {
		this.tipounidadAux = tipounidadAux;
	}				
	
	public TipoUnidad gettipounidadAnterior() {
		return this.tipounidadAnterior;
	}

	public void settipounidadAnterior(TipoUnidad tipounidadAnterior) {
		this.tipounidadAnterior = tipounidadAnterior;
	}	
	
	public TipoUnidad gettipounidadTotales() {
		return this.tipounidadTotales;
	}

	public void settipounidadTotales(TipoUnidad tipounidadTotales) {
		this.tipounidadTotales = tipounidadTotales;
	}	
	
	public TipoUnidad gettipounidadBean() {
		return this.tipounidadBean;
	}

	public void settipounidadBean(TipoUnidad tipounidadBean) {
		this.tipounidadBean = tipounidadBean;
	}	
	
	public TipoUnidadParameterReturnGeneral gettipounidadReturnGeneral() {
		return this.tipounidadReturnGeneral;
	}

	public void settipounidadReturnGeneral(TipoUnidadParameterReturnGeneral tipounidadReturnGeneral) {
		this.tipounidadReturnGeneral = tipounidadReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String siglasBusquedaPorSiglas="";

	public String getsiglasBusquedaPorSiglas() {
		return this.siglasBusquedaPorSiglas;
	}

	public void setsiglasBusquedaPorSiglas(String siglasBusquedaPorSiglas) {
		this.siglasBusquedaPorSiglas = siglasBusquedaPorSiglas;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoUnidadLogic getTipoUnidadLogic()	{		
		return tipounidadLogic;
	}

	public void setTipoUnidadLogic(TipoUnidadLogic tipounidadLogic) {
		this.tipounidadLogic = tipounidadLogic;
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
	
	public Boolean getIsEsNuevoTipoUnidad() {
		return isEsNuevoTipoUnidad;
	}

	public void setIsEsNuevoTipoUnidad(Boolean isEsNuevoTipoUnidad) {
		this.isEsNuevoTipoUnidad = isEsNuevoTipoUnidad;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoUnidad() {
		return esParaAccionDesdeFormularioTipoUnidad;
	}
	
	public void setEsParaAccionDesdeFormularioTipoUnidad(Boolean esParaAccionDesdeFormularioTipoUnidad) {
		this.esParaAccionDesdeFormularioTipoUnidad = esParaAccionDesdeFormularioTipoUnidad;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoUnidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoUnidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoUnidad(this.tipounidadLogic.getTipoUnidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoUnidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoUnidad(this.tipounidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipounidadLogic.setTipoUnidads(this.tipounidads);
			tipounidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoUnidadParameterReturnGeneral getTipoUnidadParameterGeneral() {
		return this.tipounidadParameterGeneral;
	}
	
	public void setTipoUnidadParameterGeneral(TipoUnidadParameterReturnGeneral tipounidadParameterGeneral) {
		this.tipounidadParameterGeneral = tipounidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoUnidad() {
		return isPermisoTodoTipoUnidad;
	}

	public void setIsPermisoTodoTipoUnidad(Boolean isPermisoTodoTipoUnidad) {
		this.isPermisoTodoTipoUnidad = isPermisoTodoTipoUnidad;
	}

	public Boolean getIsPermisoNuevoTipoUnidad() {
		return isPermisoNuevoTipoUnidad;
	}

	public void setIsPermisoNuevoTipoUnidad(Boolean isPermisoNuevoTipoUnidad) {
		this.isPermisoNuevoTipoUnidad = isPermisoNuevoTipoUnidad;
	}

	public Boolean getIsPermisoActualizarTipoUnidad() {
		return isPermisoActualizarTipoUnidad;
	}

	public void setIsPermisoActualizarTipoUnidad(Boolean isPermisoActualizarTipoUnidad) {
		this.isPermisoActualizarTipoUnidad = isPermisoActualizarTipoUnidad;
	}

	public Boolean getIsPermisoEliminarTipoUnidad() {
		return isPermisoEliminarTipoUnidad;
	}

	public void setIsPermisoEliminarTipoUnidad(Boolean isPermisoEliminarTipoUnidad) {
		this.isPermisoEliminarTipoUnidad = isPermisoEliminarTipoUnidad;
	}

	public Boolean getIsPermisoGuardarCambiosTipoUnidad() {
		return isPermisoGuardarCambiosTipoUnidad;
	}

	public void setIsPermisoGuardarCambiosTipoUnidad(Boolean isPermisoGuardarCambiosTipoUnidad) {
		this.isPermisoGuardarCambiosTipoUnidad = isPermisoGuardarCambiosTipoUnidad;
	}
	
	public Boolean getIsPermisoConsultaTipoUnidad() {
		return isPermisoConsultaTipoUnidad;
	}

	public void setIsPermisoConsultaTipoUnidad(Boolean isPermisoConsultaTipoUnidad) {
		this.isPermisoConsultaTipoUnidad = isPermisoConsultaTipoUnidad;
	}

	public Boolean getIsPermisoBusquedaTipoUnidad() {
		return isPermisoBusquedaTipoUnidad;
	}

	public void setIsPermisoBusquedaTipoUnidad(Boolean isPermisoBusquedaTipoUnidad) {
		this.isPermisoBusquedaTipoUnidad = isPermisoBusquedaTipoUnidad;
	}

	public Boolean getIsPermisoReporteTipoUnidad() {
		return isPermisoReporteTipoUnidad;
	}

	public void setIsPermisoReporteTipoUnidad(Boolean isPermisoReporteTipoUnidad) {
		this.isPermisoReporteTipoUnidad = isPermisoReporteTipoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoUnidad() {
		return isPermisoPaginacionMedioTipoUnidad;
	}

	public void setIsPermisoPaginacionMedioTipoUnidad(Boolean isPermisoPaginacionMedioTipoUnidad) {
		this.isPermisoPaginacionMedioTipoUnidad = isPermisoPaginacionMedioTipoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoUnidad() {
		return isPermisoPaginacionTodoTipoUnidad;
	}

	public void setIsPermisoPaginacionTodoTipoUnidad(Boolean isPermisoPaginacionTodoTipoUnidad) {
		this.isPermisoPaginacionTodoTipoUnidad = isPermisoPaginacionTodoTipoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoUnidad() {
		return isPermisoPaginacionAltoTipoUnidad;
	}

	public void setIsPermisoPaginacionAltoTipoUnidad(Boolean isPermisoPaginacionAltoTipoUnidad) {
		this.isPermisoPaginacionAltoTipoUnidad = isPermisoPaginacionAltoTipoUnidad;
	}
	
	public Boolean getIsPermisoCopiarTipoUnidad() {
		return isPermisoCopiarTipoUnidad;
	}

	public void setIsPermisoCopiarTipoUnidad(Boolean isPermisoCopiarTipoUnidad) {
		this.isPermisoCopiarTipoUnidad = isPermisoCopiarTipoUnidad;
	}
	
	public Boolean getIsPermisoVerFormTipoUnidad() {
		return isPermisoVerFormTipoUnidad;
	}

	public void setIsPermisoVerFormTipoUnidad(Boolean isPermisoVerFormTipoUnidad) {
		this.isPermisoVerFormTipoUnidad = isPermisoVerFormTipoUnidad;
	}
	
	public Boolean getIsPermisoDuplicarTipoUnidad() {
		return isPermisoDuplicarTipoUnidad;
	}

	public void setIsPermisoDuplicarTipoUnidad(Boolean isPermisoDuplicarTipoUnidad) {
		this.isPermisoDuplicarTipoUnidad = isPermisoDuplicarTipoUnidad;
	}
	
	public Boolean getIsPermisoOrdenTipoUnidad() {
		return isPermisoOrdenTipoUnidad;
	}

	public void setIsPermisoOrdenTipoUnidad(Boolean isPermisoOrdenTipoUnidad) {
		this.isPermisoOrdenTipoUnidad = isPermisoOrdenTipoUnidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoUnidad() {
		return isVisibilidadCeldaNuevoTipoUnidad;
	}

	public void setIsVisibilidadCeldaNuevoTipoUnidad(Boolean isVisibilidadCeldaNuevoTipoUnidad) {
		this.isVisibilidadCeldaNuevoTipoUnidad = isVisibilidadCeldaNuevoTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoUnidad() {
		return isVisibilidadCeldaDuplicarTipoUnidad;
	}

	public void setIsVisibilidadCeldaDuplicarTipoUnidad(Boolean isVisibilidadCeldaDuplicarTipoUnidad) {
		this.isVisibilidadCeldaDuplicarTipoUnidad = isVisibilidadCeldaDuplicarTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoUnidad() {
		return isVisibilidadCeldaCopiarTipoUnidad;
	}

	public void setIsVisibilidadCeldaCopiarTipoUnidad(Boolean isVisibilidadCeldaCopiarTipoUnidad) {
		this.isVisibilidadCeldaCopiarTipoUnidad = isVisibilidadCeldaCopiarTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoUnidad() {
		return isVisibilidadCeldaVerFormTipoUnidad;
	}

	public void setIsVisibilidadCeldaVerFormTipoUnidad(Boolean isVisibilidadCeldaVerFormTipoUnidad) {
		this.isVisibilidadCeldaVerFormTipoUnidad = isVisibilidadCeldaVerFormTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoUnidad() {
		return isVisibilidadCeldaOrdenTipoUnidad;
	}

	public void setIsVisibilidadCeldaOrdenTipoUnidad(Boolean isVisibilidadCeldaOrdenTipoUnidad) {
		this.isVisibilidadCeldaOrdenTipoUnidad = isVisibilidadCeldaOrdenTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoUnidad() {
		return isVisibilidadCeldaNuevoRelacionesTipoUnidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoUnidad(Boolean isVisibilidadCeldaNuevoRelacionesTipoUnidad) {
		this.isVisibilidadCeldaNuevoRelacionesTipoUnidad = isVisibilidadCeldaNuevoRelacionesTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoUnidad() {
		return isVisibilidadCeldaModificarTipoUnidad;
	}

	public void setIsVisibilidadCeldaModificarTipoUnidad(Boolean isVisibilidadCeldaModificarTipoUnidad) {
		this.isVisibilidadCeldaModificarTipoUnidad = isVisibilidadCeldaModificarTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoUnidad() {
		return isVisibilidadCeldaActualizarTipoUnidad;
	}

	public void setIsVisibilidadCeldaActualizarTipoUnidad(Boolean isVisibilidadCeldaActualizarTipoUnidad) {
		this.isVisibilidadCeldaActualizarTipoUnidad = isVisibilidadCeldaActualizarTipoUnidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoUnidad() {
		return isVisibilidadCeldaEliminarTipoUnidad;
	}

	public void setIsVisibilidadCeldaEliminarTipoUnidad(Boolean isVisibilidadCeldaEliminarTipoUnidad) {
		this.isVisibilidadCeldaEliminarTipoUnidad = isVisibilidadCeldaEliminarTipoUnidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoUnidad() {
		return isVisibilidadCeldaCancelarTipoUnidad;
	}

	public void setIsVisibilidadCeldaCancelarTipoUnidad(Boolean isVisibilidadCeldaCancelarTipoUnidad) {
		this.isVisibilidadCeldaCancelarTipoUnidad = isVisibilidadCeldaCancelarTipoUnidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoUnidad() {
		return isVisibilidadCeldaGuardarTipoUnidad;
	}

	public void setIsVisibilidadCeldaGuardarTipoUnidad(Boolean isVisibilidadCeldaGuardarTipoUnidad) {
		this.isVisibilidadCeldaGuardarTipoUnidad = isVisibilidadCeldaGuardarTipoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoUnidad() {
		return isVisibilidadCeldaGuardarCambiosTipoUnidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoUnidad(Boolean isVisibilidadCeldaGuardarCambiosTipoUnidad) {
		this.isVisibilidadCeldaGuardarCambiosTipoUnidad = isVisibilidadCeldaGuardarCambiosTipoUnidad;
	}
		
	public TipoUnidadSessionBean gettipounidadSessionBean() {
		return this.tipounidadSessionBean;
	}
	
	public void settipounidadSessionBean(TipoUnidadSessionBean tipounidadSessionBean) {
		this.tipounidadSessionBean=tipounidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorSiglas() {
		return this.isVisibilidadBusquedaPorSiglas;
	}

	public void setisVisibilidadBusquedaPorSiglas(Boolean isVisibilidadBusquedaPorSiglas) {
		this.isVisibilidadBusquedaPorSiglas=isVisibilidadBusquedaPorSiglas;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(TipoUnidad tipounidad)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoUnidad tipounidad,TipoUnidad tipounidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoUnidad(tipounidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipounidadAux.setId(tipounidad.getId());
		tipounidadAux.setVersionRow(tipounidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoUnidad();
		
			int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipounidadValidator.getInvalidValues(this.tipounidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipounidadLogic.setDatosCliente(datosCliente);
			tipounidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipounidadAux=new  TipoUnidad();
				
				tipounidadAux.setIsNew(true);
				tipounidadAux.setIsChanged(true);
				
				tipounidadAux.setTipoUnidadOriginal(this.tipounidad);
				
				tipounidadAux.setId(this.tipounidad.getId());	
				tipounidadAux.setVersionRow(this.tipounidad.getVersionRow());	
				tipounidadAux.setnombre(this.tipounidad.getnombre());	
				tipounidadAux.setsiglas(this.tipounidad.getsiglas());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipounidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipounidadAux,tipounidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadLogic.saveTipoUnidads();//WithConnection
						//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads().addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads.addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipounidadLogic.saveTipoUnidadRelaciones(tipounidadAux,this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());//WithConnection
								//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.setUnidads(new ArrayList<Unidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads= new ArrayList<Unidad>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipounidadAux.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipounidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipounidadAux,tipounidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipounidadAux=new  TipoUnidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipounidadSessionBean.getEsGuardarRelacionado() 
					|| (this.tipounidadSessionBean.getEsGuardarRelacionado() && this.tipounidad.getId()>=0)) {
						
					tipounidadAux.setIsNew(false);
				}
				
				tipounidadAux.setIsDeleted(false);
			
				tipounidadAux.setId(this.tipounidad.getId());	
				tipounidadAux.setVersionRow(this.tipounidad.getVersionRow());	
				tipounidadAux.setnombre(this.tipounidad.getnombre());	
				tipounidadAux.setsiglas(this.tipounidad.getsiglas());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipounidadAux,tipounidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadLogic.saveTipoUnidads();//WithConnection
						//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads().addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads.addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipounidadLogic.saveTipoUnidadRelaciones(tipounidadAux,this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());//WithConnection
								//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.setUnidads(new ArrayList<Unidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads= new ArrayList<Unidad>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipounidadAux.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipounidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipounidadAux,tipounidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipounidad,tipounidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipounidadAux=new  TipoUnidad();
				
				tipounidadAux.setIsNew(false);
				tipounidadAux.setIsChanged(false);
				
				tipounidadAux.setIsDeleted(true);
				
				tipounidadAux.setId(this.tipounidad.getId());	
				tipounidadAux.setVersionRow(this.tipounidad.getVersionRow());	
				tipounidadAux.setnombre(this.tipounidad.getnombre());	
				tipounidadAux.setsiglas(this.tipounidad.getsiglas());	
				
				if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipounidadAux.getId()>=0) {	
						this.tipounidadsEliminados.add(tipounidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipounidadAux,tipounidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadLogic.saveTipoUnidads();//WithConnection
						//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads().addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads.addAll(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipounidadLogic.saveTipoUnidadRelaciones(tipounidadAux,this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());//WithConnection
								//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.setUnidads(new ArrayList<Unidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads= new ArrayList<Unidad>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipounidadAux.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipounidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipounidadAux,tipounidadLogic.getTipoUnidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipounidadAux,tipounidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.getTipoUnidads().addAll(this.tipounidadsEliminados);
					
					tipounidadLogic.saveTipoUnidads();//WithConnection
					//tipounidadLogic.getSetVersionRowTipoUnidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipounidadsEliminados= new ArrayList<TipoUnidad>();		
			}
			
			if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Unidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipounidad=tipounidadAux;
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
      		//this.finishProcessTipoUnidad();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoUnidad tipounidadLocal) throws Exception {
		
		if(this.tipounidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipounidadLocal.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());
			
			} else {
			
				tipounidadLocal.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidads);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoUnidad tipounidadLocal) throws Exception {	
		if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoUnidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipounidadValidator.getInvalidValues(this.tipounidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoUnidad tipounidad,List<TipoUnidad> tipounidads) throws Exception {
		try	{		
			TipoUnidadConstantesFunciones.actualizarLista(tipounidad,tipounidads,this.tipounidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoUnidad tipounidad,List<TipoUnidad> tipounidads) throws Exception {
		try	{			
			TipoUnidadConstantesFunciones.actualizarSelectedLista(tipounidad,tipounidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoUnidad> tipounidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipounidadsLocal=this.tipounidadLogic.getTipoUnidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipounidadsLocal=this.tipounidads;
			}
			//ARCHITECTURE
		
			for(TipoUnidad tipounidadLocal:tipounidadsLocal) {
				if(this.permiteMantenimiento(tipounidadLocal) && tipounidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoUnidadConstantesFunciones.getTipoUnidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoUnidadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUnidad.jLabelnombreTipoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoUnidadConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUnidad.jLabelsiglasTipoUnidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoUnidad.jLabelnombreTipoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoUnidad.jLabelsiglasTipoUnidad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Unidad")) {
			if(this.tipounidad==null) {
				this.tipounidad= new TipoUnidad();
			}

			if(this.tipounidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoUnidad
				this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);

				this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.getunidad().setTipoUnidad(this.tipounidad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoUnidad--;	
		
		
		this.tipounidadAux=new TipoUnidad();
		
		this.tipounidadAux.setId(this.iIdNuevoTipoUnidad);
		this.tipounidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipounidadLogic.getTipoUnidads().add(this.tipounidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipounidads.add(this.tipounidadAux);
		}
		//ARCHITECTURE
		
		this.tipounidad=this.tipounidadAux;
		
		if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoUnidad(this.tipounidad);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoUnidad(this.tipounidad);
		}
				
		//this.setDefaultControlesTipoUnidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoUnidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoUnidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUnidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoUnidad(this.tipounidadBean,this.tipounidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoUnidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
			classes=TipoUnidadConstantesFunciones.getClassesRelationshipsOfTipoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipounidadReturnGeneral=tipounidadLogic.procesarEventosTipoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipounidadLogic.getTipoUnidads(),this.tipounidad,this.tipounidadParameterGeneral,this.isEsNuevoTipoUnidad,classes);//this.tipounidadLogic.getTipoUnidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoUnidad(this.tipounidadReturnGeneral,this.tipounidadBean,false);
		
		if(this.tipounidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad());
		}
		
		if(this.tipounidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad(),classes);//this.tipounidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoUnidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoUnidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoUnidadBeanSwingJInternalFrameAdditional.RecargarFormTipoUnidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoUnidad(false);
						
			if(tipounidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadSessionBean.getEsGuardarRelacionado() && UnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUnidadActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUnidad();
			}
			
			this.actualizarVisualTableDatosTipoUnidad();
			
			this.jTableDatosTipoUnidad.setRowSelectionInterval(this.getIndiceNuevoTipoUnidad(), this.getIndiceNuevoTipoUnidad());
			
			this.seleccionarFilaTablaTipoUnidadActual();
						
			this.actualizarEstadoCeldasBotonesTipoUnidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoUnidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setEnabled(isHabilitar && this.tipounidadConstantesFunciones.activarnombreTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setEnabled(isHabilitar && this.tipounidadConstantesFunciones.activarsiglasTipoUnidad);	
		
	};
	
	public void setDefaultControlesTipoUnidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoUnidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipounidadSessionBean.setConGuardarRelaciones(true);			
			this.tipounidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipounidadSessionBean.setConGuardarRelaciones(false);			
			this.tipounidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoUnidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
				if(tipounidadAux.getId().equals(this.iIdNuevoTipoUnidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUnidad tipounidadAux:this.tipounidads) {
				if(tipounidadAux.getId().equals(this.iIdNuevoTipoUnidad)) {
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
	
	public int getIndiceActualTipoUnidad(TipoUnidad tipounidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
				if(tipounidadAux.getId().equals(tipounidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUnidad tipounidadAux:this.tipounidads) {
				if(tipounidadAux.getId().equals(tipounidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoUnidad(TipoUnidad tipounidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
				if(tipounidadAux.getTipoUnidadOriginal().getId().equals(tipounidadOriginal.getId())) {
					existe=true;
					tipounidadOriginal.setId(tipounidadAux.getId());
					tipounidadOriginal.setVersionRow(tipounidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUnidad tipounidadAux:this.tipounidads) {
				if(tipounidadAux.getTipoUnidadOriginal().getId().equals(tipounidadOriginal.getId())) {
					existe=true;
					tipounidadOriginal.setId(tipounidadAux.getId());
					tipounidadOriginal.setVersionRow(tipounidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoUnidad(Boolean esParaCancelar) throws Exception {
		tipounidadsAux=new ArrayList<TipoUnidad>();
		tipounidadAux=new TipoUnidad();
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
					if(tipounidadAux.getId()<0) {
						tipounidadsAux.add(tipounidadAux);
					}		
				}
				this.iIdNuevoTipoUnidad=0L;
				this.tipounidadLogic.getTipoUnidads().removeAll(tipounidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUnidad tipounidadAux:this.tipounidads) {
					if(tipounidadAux.getId()<0) {
						tipounidadsAux.add(tipounidadAux);
					}		
				}
				this.iIdNuevoTipoUnidad=0L;
				this.tipounidads.removeAll(tipounidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoUnidad 
					&& this.tipounidadLogic.getTipoUnidads().size()>0
					) {
					tipounidadAux=this.tipounidadLogic.getTipoUnidads().get(this.tipounidadLogic.getTipoUnidads().size() - 1);
				
					if(tipounidadAux.getId()<0) {
						this.tipounidadLogic.getTipoUnidads().remove(tipounidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoUnidad && this.tipounidads.size()>0) {
					tipounidadAux=this.tipounidads.get(this.tipounidads.size() - 1);
				
					if(tipounidadAux.getId()<0) {
						this.tipounidads.remove(tipounidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoUnidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipounidad.getId()<0) {
				this.tipounidadLogic.getTipoUnidads().remove(this.tipounidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipounidad.getId()<0) {
				this.tipounidads.remove(this.tipounidad);
			}
		}			
	}
	
	public void setEstadosInicialesTipoUnidad(List<TipoUnidad> tipounidadsAux) throws Exception {
		TipoUnidadConstantesFunciones.setEstadosInicialesTipoUnidad(tipounidadsAux);
	}
	
	public void setEstadosInicialesTipoUnidad(TipoUnidad tipounidadAux) throws Exception {
		TipoUnidadConstantesFunciones.setEstadosInicialesTipoUnidad(tipounidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoUnidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoUnidadActual()) {
				if(!this.isEsNuevoTipoUnidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoUnidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoUnidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Unidad ?", "MANTENIMIENTO DE Tipo Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoUnidad tipounidad) throws Exception {
		TipoUnidadConstantesFunciones.seleccionarAsignar(this.tipounidad,tipounidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoUnidad=this.isPermisoActualizarOriginalTipoUnidad;
			
			
			this.seleccionarAsignar(tipounidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoUnidadConstantesFunciones.quitarEspaciosTipoUnidad(this.tipounidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipounidadSessionBean.setsFuncionBusquedaRapida(this.tipounidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoUnidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoUnidad(esParaCancelar);				
				this.cancelarNuevoTipoUnidad(esParaCancelar);								
			}
			
			this.tipounidad=new TipoUnidad();
			
			this.inicializarTipoUnidad();
			
			this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoUnidad() throws Exception {
		try {
			TipoUnidadConstantesFunciones.inicializarTipoUnidad(this.tipounidad);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipounidadLogic.getTipoUnidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoUnidads(String sAccionBusqueda,List<TipoUnidad> tipounidadsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoUnidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoUnidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoUnidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoUnidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Unidades");		
		parameters.put("busquedapor", TipoUnidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Unidad.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoUnidadLogic tipounidadLogicAuxiliar=new TipoUnidadLogic();
					tipounidadLogicAuxiliar.setDatosCliente(tipounidadLogic.getDatosCliente());				
					tipounidadLogicAuxiliar.setTipoUnidads(tipounidadsParaReportes);
					
					tipounidadLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoUnidadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipounidadsParaReportes=tipounidadLogicAuxiliar.getTipoUnidads();
					
					//tipounidadLogic.getNewConnexionToDeep();
					
					//for (TipoUnidad tipounidad:tipounidadsParaReportes) {
					//	tipounidadLogic.deepLoad(tipounidad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipounidadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipounidadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileUnidad = AuxiliarReportes.class.getResourceAsStream("UnidadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_unidad", reportFileUnidad);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoUnidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoUnidad=new JRBeanArrayDataSource(TipoUnidadJInternalFrame.TraerTipoUnidadBeans(tipounidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoUnidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoUnidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoUnidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoUnidadBean.TraerTipoUnidadBeans(tipounidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoUnidadActionPerformed(null);
					//this.generarExcelReporteTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoUnidads(sAccionBusqueda,sTipoArchivoReporte,tipounidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUnidad> tipounidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUnidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoUnidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoUnidad tipounidad : tipounidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoUnidadConstantesFunciones.generarExcelReporteDataTipoUnidad("NORMAL",row,workbook,tipounidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoUnidad(String sTipo,Row row,Workbook workbook) {
		
		TipoUnidadConstantesFunciones.generarExcelReporteHeaderTipoUnidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUnidad> tipounidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoUnidad tipounidad : tipounidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoUnidadConstantesFunciones.getTipoUnidadDescripcion(tipounidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoUnidadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipounidad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoUnidadConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipounidad.getsiglas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUnidad> tipounidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoUnidad> tipounidadsRespaldo=null;
		
		classes=TipoUnidadConstantesFunciones.getClassesRelationshipsOfTipoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipounidadLogic.setDatosCliente(this.datosCliente);
		this.tipounidadLogic.setDatosDeep(this.datosDeep);
		this.tipounidadLogic.setIsConDeep(true);
		
		tipounidadsRespaldo=this.tipounidadLogic.getTipoUnidads();
		
		this.tipounidadLogic.setTipoUnidads(tipounidadsParaReportes);	
		this.tipounidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipounidadsParaReportes=this.tipounidadLogic.getTipoUnidads();
		this.tipounidadLogic.setTipoUnidads(tipounidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoUnidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoUnidad tipounidad : tipounidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoUnidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoUnidadConstantesFunciones.generarExcelReporteDataTipoUnidad("NORMAL",row,workbook,tipounidad,cellStyleDataAux);
		
			
			


				//Unidad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UnidadConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipounidad.getUnidads()!=null && tipounidad.getUnidads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UnidadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UnidadConstantesFunciones.generarExcelReporteHeaderUnidad("RELACIONADO",row,workbook);
				}

				if(tipounidad.getUnidads()!=null) {
					i2=0;
					for(Unidad unidad : tipounidad.getUnidads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UnidadConstantesFunciones.generarExcelReporteDataUnidad("RELACIONADO",row,workbook,unidad,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoUnidadConstantesFunciones.getTipoUnidadDescripcion(tipounidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUnidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoUnidad() throws Exception {		
		this.startProcessTipoUnidad(true);
	}
	
	public void startProcessTipoUnidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoUnidad ,this.jPanelParametrosReportesTipoUnidad, this.jScrollPanelDatosTipoUnidad,this.jPanelPaginacionTipoUnidad, this.jScrollPanelDatosEdicionTipoUnidad, this.jPanelAccionesTipoUnidad,this.jPanelAccionesFormularioTipoUnidad,this.jmenuBarTipoUnidad,this.jmenuBarDetalleTipoUnidad,this.jTtoolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoUnidad=this.jTabbedPaneBusquedasTipoUnidad; 
		
		final JPanel jPanelParametrosReportesTipoUnidad=this.jPanelParametrosReportesTipoUnidad;
		//final JScrollPane jScrollPanelDatosTipoUnidad=this.jScrollPanelDatosTipoUnidad;
		final JTable jTableDatosTipoUnidad=this.jTableDatosTipoUnidad;		
		final JPanel jPanelPaginacionTipoUnidad=this.jPanelPaginacionTipoUnidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoUnidad=this.jScrollPanelDatosEdicionTipoUnidad;
		final JPanel jPanelAccionesTipoUnidad=this.jPanelAccionesTipoUnidad;
		
		JPanel jPanelCamposAuxiliarTipoUnidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoUnidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			jPanelCamposAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jPanelCamposTipoUnidad;
			jPanelAccionesFormularioAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jPanelAccionesFormularioTipoUnidad;
		}
		
		final JPanel jPanelCamposTipoUnidad=jPanelCamposAuxiliarTipoUnidad;
		final JPanel jPanelAccionesFormularioTipoUnidad=jPanelAccionesFormularioAuxiliarTipoUnidad;
		
		
		final JMenuBar jmenuBarTipoUnidad=this.jmenuBarTipoUnidad;
		final JToolBar jTtoolBarTipoUnidad=this.jTtoolBarTipoUnidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoUnidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			jmenuBarDetalleAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jmenuBarDetalleTipoUnidad;
			jTtoolBarDetalleAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jTtoolBarDetalleTipoUnidad;
		}
		
		final JMenuBar jmenuBarDetalleTipoUnidad=jmenuBarDetalleAuxiliarTipoUnidad;
		final JToolBar jTtoolBarDetalleTipoUnidad=jTtoolBarDetalleAuxiliarTipoUnidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoUnidad;
			processRunnable.jTableDatos=jTableDatosTipoUnidad;
			processRunnable.jPanelCampos=jPanelCamposTipoUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoUnidad;
			processRunnable.jTtoolBar=jTtoolBarTipoUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoUnidad ,jPanelParametrosReportesTipoUnidad,jTableDatosTipoUnidad, /*jScrollPanelDatosTipoUnidad,*/jPanelCamposTipoUnidad,jPanelPaginacionTipoUnidad, /*jScrollPanelDatosEdicionTipoUnidad,*/ jPanelAccionesTipoUnidad,jPanelAccionesFormularioTipoUnidad,jmenuBarTipoUnidad,jmenuBarDetalleTipoUnidad,jTtoolBarTipoUnidad,jTtoolBarDetalleTipoUnidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoUnidad ,jPanelParametrosReportesTipoUnidad, jScrollPanelDatosTipoUnidad,jPanelPaginacionTipoUnidad, jScrollPanelDatosEdicionTipoUnidad, jPanelAccionesTipoUnidad,jPanelAccionesFormularioTipoUnidad,jmenuBarTipoUnidad,jmenuBarDetalleTipoUnidad,jTtoolBarTipoUnidad,jTtoolBarDetalleTipoUnidad);
						
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
	
	public void finishProcessTipoUnidad() {// throws Exception 
		this.finishProcessTipoUnidad(true);
	}
	
	public void finishProcessTipoUnidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoUnidad ,this.jPanelParametrosReportesTipoUnidad, this.jScrollPanelDatosTipoUnidad,this.jPanelPaginacionTipoUnidad, this.jScrollPanelDatosEdicionTipoUnidad, this.jPanelAccionesTipoUnidad,this.jPanelAccionesFormularioTipoUnidad,this.jmenuBarTipoUnidad,this.jmenuBarDetalleTipoUnidad,this.jTtoolBarTipoUnidad,this.jTtoolBarDetalleTipoUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoUnidad=this.jTabbedPaneBusquedasTipoUnidad; 
		
		final JPanel jPanelParametrosReportesTipoUnidad=this.jPanelParametrosReportesTipoUnidad;
		//final JScrollPane jScrollPanelDatosTipoUnidad=this.jScrollPanelDatosTipoUnidad;
		final JTable jTableDatosTipoUnidad=this.jTableDatosTipoUnidad;		
		final JPanel jPanelPaginacionTipoUnidad=this.jPanelPaginacionTipoUnidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoUnidad=this.jScrollPanelDatosEdicionTipoUnidad;
		final JPanel jPanelAccionesTipoUnidad=this.jPanelAccionesTipoUnidad;
		
		JPanel jPanelCamposAuxiliarTipoUnidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoUnidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			jPanelCamposAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jPanelCamposTipoUnidad;
			jPanelAccionesFormularioAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jPanelAccionesFormularioTipoUnidad;
		}
		
		final JPanel jPanelCamposTipoUnidad=jPanelCamposAuxiliarTipoUnidad;
		final JPanel jPanelAccionesFormularioTipoUnidad=jPanelAccionesFormularioAuxiliarTipoUnidad;
		
		
		final JMenuBar jmenuBarTipoUnidad=this.jmenuBarTipoUnidad;		
		final JToolBar jTtoolBarTipoUnidad=this.jTtoolBarTipoUnidad;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoUnidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			jmenuBarDetalleAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jmenuBarDetalleTipoUnidad;
			jTtoolBarDetalleAuxiliarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jTtoolBarDetalleTipoUnidad;		
		}
		
		final JMenuBar jmenuBarDetalleTipoUnidad=jmenuBarDetalleAuxiliarTipoUnidad;
		final JToolBar jTtoolBarDetalleTipoUnidad=jTtoolBarDetalleAuxiliarTipoUnidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoUnidad;
			processRunnable.jTableDatos=jTableDatosTipoUnidad;
			processRunnable.jPanelCampos=jPanelCamposTipoUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoUnidad;
			processRunnable.jTtoolBar=jTtoolBarTipoUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoUnidad ,jPanelParametrosReportesTipoUnidad, jTableDatosTipoUnidad,/*jScrollPanelDatosTipoUnidad,*/jPanelCamposTipoUnidad,jPanelPaginacionTipoUnidad, /*jScrollPanelDatosEdicionTipoUnidad,*/ jPanelAccionesTipoUnidad,jPanelAccionesFormularioTipoUnidad,jmenuBarTipoUnidad,jmenuBarDetalleTipoUnidad,jTtoolBarTipoUnidad,jTtoolBarDetalleTipoUnidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoUnidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoUnidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoUnidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoUnidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipounidadConstantesFunciones.getsFinalQueryTipoUnidad();
		String  finalQueryPaginacionTodos=this.tipounidadConstantesFunciones.getsFinalQueryTipoUnidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoUnidadConstantesFunciones.getArrayColumnasGlobalesNoTipoUnidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoUnidadConstantesFunciones.getArrayColumnasGlobalesTipoUnidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoUnidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipounidadsEliminados= new ArrayList<TipoUnidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoUnidad();
		
				///*TipoUnidadSessionBean*/this.tipounidadSessionBean=new TipoUnidadSessionBean();
			
			if(this.tipounidadSessionBean==null) {
				this.tipounidadSessionBean=new TipoUnidadSessionBean();
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
					this.iNumeroPaginacion=TipoUnidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoUnidadConstantesFunciones.getClassesForeignKeysOfTipoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipounidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipounidadsAux= new ArrayList<TipoUnidad>();
			
				
			tipounidadLogic.setDatosCliente(this.datosCliente);
			tipounidadLogic.setDatosDeep(this.datosDeep);
			tipounidadLogic.setIsConDeep(true);
			
			
			tipounidadLogic.getTipoUnidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipounidadLogic.getTodosTipoUnidads(finalQueryGlobal,pagination);
					
					//tipounidadLogic.getTodosTipoUnidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipounidadLogic.getTipoUnidads()==null|| tipounidadLogic.getTipoUnidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipounidadsAux= new ArrayList<TipoUnidad>();
							tipounidadsAux.addAll(tipounidadLogic.getTipoUnidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidadsAux= new ArrayList<TipoUnidad>();
							tipounidadsAux.addAll(tipounidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipounidadLogic.getTodosTipoUnidads(finalQueryGlobal+"",this.pagination);												
							
							//tipounidadLogic.getTodosTipoUnidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoUnidads("Todos",tipounidadLogic.getTipoUnidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipounidadLogic.setTipoUnidads(new ArrayList<TipoUnidad>());					
							tipounidadLogic.getTipoUnidads().addAll(tipounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidads=new ArrayList<TipoUnidad>();
							tipounidads.addAll(tipounidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoUnidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoUnidad=this.idActual;
				
				} else if(this.idTipoUnidadActual!=null && this.idTipoUnidadActual!=0L) {
					idTipoUnidad=idTipoUnidadActual;
				}
				
					
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndicePorId(idTipoUnidad);
				
				this.tipounidads=new ArrayList<TipoUnidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipounidadLogic.getEntity(idTipoUnidad);
					
					//tipounidadLogic.getEntityWithConnection(idTipoUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLogic.setTipoUnidads(new ArrayList<TipoUnidad>());
					tipounidadLogic.getTipoUnidads().add(tipounidadLogic.getTipoUnidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipounidads=new ArrayList<TipoUnidad>();
					this.tipounidads.add(tipounidad);
				}
				
				if(tipounidadLogic.getTipoUnidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipounidadLogic.getTipoUnidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipounidadLogic.getTipoUnidads()==null||tipounidadLogic.getTipoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipounidads==null|| tipounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadsAux=new ArrayList<TipoUnidad>();
						tipounidadsAux.addAll(tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidadsAux=new ArrayList<TipoUnidad>();
							tipounidadsAux.addAll(tipounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipounidadLogic.getTipoUnidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoUnidads("BusquedaPorNombre",tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoUnidads("BusquedaPorNombre",tipounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadLogic.setTipoUnidads(new ArrayList<TipoUnidad>());
						tipounidadLogic.getTipoUnidads().addAll(tipounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidads=new ArrayList<TipoUnidad>();
							tipounidads.addAll(tipounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSiglas")) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipounidadLogic.getTipoUnidadsBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipounidadLogic.getTipoUnidads()==null||tipounidadLogic.getTipoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipounidads==null|| tipounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadsAux=new ArrayList<TipoUnidad>();
						tipounidadsAux.addAll(tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidadsAux=new ArrayList<TipoUnidad>();
							tipounidadsAux.addAll(tipounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipounidadLogic.getTipoUnidadsBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoUnidads("BusquedaPorSiglas",tipounidadLogic.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoUnidads("BusquedaPorSiglas",tipounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadLogic.setTipoUnidads(new ArrayList<TipoUnidad>());
						tipounidadLogic.getTipoUnidads().addAll(tipounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidads=new ArrayList<TipoUnidad>();
							tipounidads.addAll(tipounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoUnidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoUnidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipounidadLogic.getTipoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipounidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipounidadLogic.getTipoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipounidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoUnidad tipounidad) {
		Boolean permite=true;
		
		if(this.tipounidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoUnidadConstantesFunciones.getOrderByListaTipoUnidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoUnidadConstantesFunciones.getOrderByListaTipoUnidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUnidad tipounidad:tipounidadLogic.getTipoUnidads()) {
				if(tipounidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipounidadTotales=tipounidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUnidad tipounidad:this.tipounidads) {
				if(tipounidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipounidadTotales=tipounidad;
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
			this.tipounidadAux=new TipoUnidad();
			this.tipounidadAux.setsType(Constantes2.S_TOTALES);
			this.tipounidadAux.setIsNew(false);
			this.tipounidadAux.setIsChanged(false);
			this.tipounidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoUnidadConstantesFunciones.TotalizarValoresFilaTipoUnidad(this.tipounidadLogic.getTipoUnidads(),this.tipounidadAux);
				
				this.tipounidadLogic.getTipoUnidads().add(this.tipounidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoUnidadConstantesFunciones.TotalizarValoresFilaTipoUnidad(this.tipounidads,this.tipounidadAux);
				
				this.tipounidads.add(this.tipounidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipounidadTotales=new TipoUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipounidadLogic.getTipoUnidads().remove(tipounidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipounidads.remove(tipounidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipounidadTotales=new TipoUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUnidad tipounidad:tipounidadLogic.getTipoUnidads()) {
				if(tipounidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipounidadTotales=tipounidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoUnidadConstantesFunciones.TotalizarValoresFilaTipoUnidad(this.tipounidadLogic.getTipoUnidads(),tipounidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUnidad tipounidad:this.tipounidads) {
				if(tipounidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipounidadTotales=tipounidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoUnidadConstantesFunciones.TotalizarValoresFilaTipoUnidad(this.tipounidads,tipounidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoUnidadsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoUnidadsBusquedaPorSiglas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSiglas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoUnidadPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoUnidadsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLogic.getTipoUnidadsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoUnidadsBusquedaPorSiglas(String sFinalQuery,String siglas)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLogic.getTipoUnidadsBusquedaPorSiglas(sFinalQuery,this.pagination,siglas);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoUnidadPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLogic.getTipoUnidadPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoUnidad() {
		this.isPermisoTodoTipoUnidad=false;
		this.isPermisoNuevoTipoUnidad=false;
		this.isPermisoActualizarTipoUnidad=false;
		this.isPermisoActualizarOriginalTipoUnidad=false;
		this.isPermisoEliminarTipoUnidad=false;
		this.isPermisoGuardarCambiosTipoUnidad=false;
		this.isPermisoConsultaTipoUnidad=false;
		this.isPermisoBusquedaTipoUnidad=false;
		this.isPermisoReporteTipoUnidad=false;		
		this.isPermisoOrdenTipoUnidad=false;		
		this.isPermisoPaginacionMedioTipoUnidad=false;		
		this.isPermisoPaginacionAltoTipoUnidad=false;
		this.isPermisoPaginacionTodoTipoUnidad=false;
		this.isPermisoCopiarTipoUnidad=false;		
		this.isPermisoVerFormTipoUnidad=false;		
		this.isPermisoDuplicarTipoUnidad=false;		
		this.isPermisoOrdenTipoUnidad=false;		
	}
	
	public void setPermisosUsuarioTipoUnidad(Boolean isPermiso) {
		this.isPermisoTodoTipoUnidad=isPermiso;
		this.isPermisoNuevoTipoUnidad=isPermiso;
		this.isPermisoActualizarTipoUnidad=isPermiso;
		this.isPermisoActualizarOriginalTipoUnidad=isPermiso;
		this.isPermisoEliminarTipoUnidad=isPermiso;
		this.isPermisoGuardarCambiosTipoUnidad=isPermiso;
		this.isPermisoConsultaTipoUnidad=isPermiso;
		this.isPermisoBusquedaTipoUnidad=isPermiso;
		this.isPermisoReporteTipoUnidad=isPermiso;
		this.isPermisoOrdenTipoUnidad=isPermiso;		
		this.isPermisoPaginacionMedioTipoUnidad=isPermiso;		
		this.isPermisoPaginacionAltoTipoUnidad=isPermiso;		
		this.isPermisoPaginacionTodoTipoUnidad=isPermiso;		
		this.isPermisoCopiarTipoUnidad=isPermiso;		
		this.isPermisoVerFormTipoUnidad=isPermiso;		
		this.isPermisoDuplicarTipoUnidad=isPermiso;
		this.isPermisoOrdenTipoUnidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoUnidad(Boolean isPermiso) {
		//this.isPermisoTodoTipoUnidad=isPermiso;
		this.isPermisoNuevoTipoUnidad=isPermiso;
		this.isPermisoActualizarTipoUnidad=isPermiso;
		this.isPermisoActualizarOriginalTipoUnidad=isPermiso;
		this.isPermisoEliminarTipoUnidad=isPermiso;
		this.isPermisoGuardarCambiosTipoUnidad=isPermiso;
		//this.isPermisoConsultaTipoUnidad=isPermiso;
		//this.isPermisoBusquedaTipoUnidad=isPermiso;
		//this.isPermisoReporteTipoUnidad=isPermiso;
		//this.isPermisoOrdenTipoUnidad=isPermiso;		
		//this.isPermisoPaginacionMedioTipoUnidad=isPermiso;		
		//this.isPermisoPaginacionAltoTipoUnidad=isPermiso;		
		//this.isPermisoPaginacionTodoTipoUnidad=isPermiso;		
		//this.isPermisoCopiarTipoUnidad=isPermiso;		
		//this.isPermisoDuplicarTipoUnidad=isPermiso;
		//this.isPermisoOrdenTipoUnidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoUnidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(UnidadConstantesFunciones.SNOMBREOPCION);
		
		if(TipoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosUnidad=false;
		this.isTienePermisosUnidad=this.verificarGetPermisosUsuarioOpcionTipoUnidadClaseRelacionada(this.opcionsRelacionadas,UnidadConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoUnidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoUnidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosUnidad=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoUnidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoUnidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoUnidadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosUnidad && this.jInternalFrameDetalleFormTipoUnidad!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.remove(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoUnidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoUnidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoUnidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoUnidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoUnidad=this.isPermisoActualizarTipoUnidad;
			this.isPermisoEliminarTipoUnidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoUnidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoUnidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoUnidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoUnidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoUnidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoUnidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoUnidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoUnidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoUnidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoUnidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoUnidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoUnidad.setToolTipText(this.jTableDatosTipoUnidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoUnidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoUnidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoUnidad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUnidad && this.tipounidadConstantesFunciones.mostrarUnidadTipoUnidad && !TipoUnidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Unidad");
			reporte.setsDescripcion("Unidad");
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
	
		
	public void inicializarCombosForeignKeyTipoUnidadListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoUnidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoUnidadListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoUnidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoUnidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoUnidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUnidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoUnidad(TipoUnidad tipounidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoUnidad(TipoUnidad tipounidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoUnidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUnidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoUnidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoUnidad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoUnidad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoUnidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoUnidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoUnidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipounidadSessionBean=new TipoUnidadSessionBean(); 
		this.tipounidadConstantesFunciones=new TipoUnidadConstantesFunciones(); 
		this.tipounidadBean=new TipoUnidad();//(this.tipounidadConstantesFunciones); 		
		this.tipounidadReturnGeneral=new TipoUnidadParameterReturnGeneral(); 
		
		this.tipounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoUnidad(true);
			
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
			
			this.tipounidadConstantesFunciones=new TipoUnidadConstantesFunciones(); 
			this.tipounidadBean=new TipoUnidad();//this.tipounidadConstantesFunciones); 			
			this.tipounidadReturnGeneral=new TipoUnidadParameterReturnGeneral(); 
		
			TipoUnidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Unidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipounidad=new TipoUnidad();
			this.tipounidads = new ArrayList<TipoUnidad>();
			this.tipounidadsAux = new ArrayList<TipoUnidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic=new TipoUnidadLogic();
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			//this.tipounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoUnidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoUnidad);	
					}
					
					if(this.jInternalFrameImportacionTipoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoUnidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoUnidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoUnidad);
				this.jInternalFrameDetalleFormTipoUnidad.setVisible(false);
				this.jInternalFrameDetalleFormTipoUnidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoUnidad);
					this.jInternalFrameReporteDinamicoTipoUnidad.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoUnidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoUnidad);
					this.jInternalFrameImportacionTipoUnidad.setVisible(false);
					this.jInternalFrameImportacionTipoUnidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoUnidad);
					this.jInternalFrameOrderByTipoUnidad.setVisible(false);
					this.jInternalFrameOrderByTipoUnidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoUnidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoUnidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipounidadReturnGeneral=new TipoUnidadParameterReturnGeneral();
			
			this.tipounidadParameterGeneral=new TipoUnidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipounidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(UnidadConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipounidadSessionBean.getEsGuardarRelacionado(),this.tipounidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipounidadSessionBean.getEsGuardarRelacionado(),this.tipounidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaDuplicarTipoUnidad=true;
			this.isVisibilidadCeldaCopiarTipoUnidad=true;
			this.isVisibilidadCeldaVerFormTipoUnidad=true;
			this.isVisibilidadCeldaOrdenTipoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=false;
			this.isVisibilidadCeldaGuardarTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSiglas=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoUnidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoUnidad(false);
			
			this.setPermisosUsuarioTipoUnidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado() 
				|| (this.tipounidadSessionBean.getEsGuardarRelacionado() && this.tipounidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoUnidadClasesRelacionadas();
			}
			
			if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoUnidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoUnidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoUnidad();
			}
			
			if(!this.isPermisoBusquedaTipoUnidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoUnidad,this.isPermisoPaginacionMedioTipoUnidad,this.isPermisoPaginacionTodoTipoUnidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoUnidadConstantesFunciones.getTiposSeleccionarTipoUnidad());
				
				this.tiposColumnasSelect=TipoUnidadConstantesFunciones.getTiposSeleccionarTipoUnidad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoUnidad();				
				//this.tiposRelacionesSelect=TipoUnidadConstantesFunciones.getTiposRelacionesTipoUnidad(true);
				
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
			//if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoUnidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoUnidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoUnidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUnidad() ;
			
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
			
			
			this.unidadLogic=new UnidadLogic(); 
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
				tipounidadImplementable= (TipoUnidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipounidadImplementableHome= (TipoUnidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipounidads= new ArrayList<TipoUnidad>();
			this.tipounidadsEliminados= new ArrayList<TipoUnidad>();
						
			this.isEsNuevoTipoUnidad=false;
			this.esParaAccionDesdeFormularioTipoUnidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoUnidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoUnidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoUnidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoUnidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoUnidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoUnidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoUnidad();
			}
			
			TipoUnidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoUnidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoUnidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoUnidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoUnidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoUnidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoUnidad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(UnidadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UnidadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoUnidad")) {
				iIndex=this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();	
				
				

				if(sTitle.equals("Unidades")) {
					if(!UnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoUnidad();

						this.cargarParteTabPanelRelacionadaUnidad(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoUnidad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaUnidad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoUnidad.cargarSessionConBeanSwingJInternalFrameUnidad(false,true,iIndex);
		this.jButtonUnidadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUnidad();

		//this.jTabbedPaneRelacionesTipoUnidad.updateUI();
		//this.jTabbedPaneRelacionesTipoUnidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoUnidad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Unidad")) {
				int row=this.jTableDatosTipoUnidad.getSelectedRow();
				jButtonUnidadActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Unidad")) {

					if(this.isTienePermisosUnidad && this.tipounidadConstantesFunciones.mostrarUnidadTipoUnidad && !TipoUnidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Unidades"+"("+UnidadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Unidades");

						if(tipounidadConstantesFunciones.resaltarUnidadTipoUnidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipounidadConstantesFunciones.resaltarUnidadTipoUnidad);
						}

						jmenuItem.setEnabled(this.tipounidadConstantesFunciones.activarUnidadTipoUnidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Unidad"));

						

						this.jInternalFrameDetalleFormTipoUnidad.jmenuDetalleTipoUnidad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoUnidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoUnidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoUnidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoUnidad();
		
		this.cargarCombosFrameForeignKeyTipoUnidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoUnidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoUnidad();
		}
	}
	
	
	
	public void jButtonNuevoTipoUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			
			if(jTableDatosTipoUnidad.getRowCount()>=1) {
				jTableDatosTipoUnidad.removeRowSelectionInterval(0, jTableDatosTipoUnidad.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoUnidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoUnidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoUnidad(true);			
			//this.tipounidad=new TipoUnidad();
			//this.tipounidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUnidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUnidad() ;
			
			if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUnidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipounidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);				
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoUnidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoUnidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoUnidad.getSelectedRows().length;			
			}
			
			tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoUnidad--;			
				//TipoUnidad tipounidadAux= new TipoUnidad();			
				//tipounidadAux.setId(this.iIdNuevoTipoUnidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoUnidad tipounidadOrigen=new TipoUnidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoUnidad tipounidadOrigen : tipounidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipounidadOrigen =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipounidadOrigen =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoUnidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipounidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoUnidad(tipounidadOrigen,this.tipounidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipounidadLogic.getTipoUnidads().add(this.tipounidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipounidads.add(this.tipounidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoUnidad(false);
				
				this.jTableDatosTipoUnidad.setRowSelectionInterval(this.getIndiceNuevoTipoUnidad(), this.getIndiceNuevoTipoUnidad());
				
				int iLastRow =  this.jTableDatosTipoUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUnidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();									
		
			TipoUnidad tipounidadOrigen=new TipoUnidad();
			TipoUnidad tipounidadDestino=new TipoUnidad();
				
			tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoUnidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipounidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoUnidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadOrigen =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipounidadOrigen =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipounidadDestino =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipounidadDestino =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipounidadOrigen =tipounidadsSeleccionados.get(0);
				tipounidadDestino =tipounidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoUnidad(tipounidadOrigen,tipounidadDestino,true,false);
				
				tipounidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipounidadDestino,tipounidadLogic.getTipoUnidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipounidadDestino,tipounidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoUnidad(false);
				
				//this.jTableDatosTipoUnidad.setRowSelectionInterval(this.getIndiceNuevoTipoUnidad(), this.getIndiceNuevoTipoUnidad());
				
				int iLastRow =  this.jTableDatosTipoUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUnidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoUnidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoUnidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoUnidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoUnidad.setVisible(!isVisible);
			this.jPanelPaginacionTipoUnidad.setVisible(!isVisible);
			this.jPanelAccionesTipoUnidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoUnidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoUnidad();
			
			this.abrirFrameOrderByTipoUnidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoUnidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoUnidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoUnidad.isMaximum()) {
					this.jInternalFrameDetalleFormTipoUnidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoUnidad.setSize(this.jInternalFrameDetalleFormTipoUnidad.iWidthFormulario,this.jInternalFrameDetalleFormTipoUnidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoUnidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoUnidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoUnidad.isMaximum()) {
						this.jInternalFrameDetalleFormTipoUnidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoUnidad.jContentPaneDetalleTipoUnidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoUnidad.jContentPaneDetalleTipoUnidad.getWidth(),TipoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoUnidad.jContentPaneDetalleTipoUnidad.getWidth(),TipoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoUnidad.jContentPaneDetalleTipoUnidad.getWidth(),TipoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(UnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUnidad();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoUnidad.setVisible(true);
	        this.jInternalFrameDetalleFormTipoUnidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoUnidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUnidad,false,this);
				} else {
					this.jInternalFrameOrderByTipoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUnidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoUnidad);
				this.jInternalFrameOrderByTipoUnidad.setVisible(false);
				this.jInternalFrameOrderByTipoUnidad.setSelected(false);
				
				this.jInternalFrameOrderByTipoUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoUnidad"));
				
				this.inicializarActualizarBindingTablaOrderByTipoUnidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoUnidad==null) {
				
				this.jInternalFrameImportacionTipoUnidad=new ImportacionJInternalFrame(TipoUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoUnidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoUnidad);
				this.jInternalFrameImportacionTipoUnidad.setVisible(false);
				this.jInternalFrameImportacionTipoUnidad.setSelected(false);


				this.jInternalFrameImportacionTipoUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoUnidad"));
				this.jInternalFrameImportacionTipoUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoUnidad"));
				this.jInternalFrameImportacionTipoUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoUnidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoUnidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoUnidad==null) {
				this.jInternalFrameReporteDinamicoTipoUnidad=new ReporteDinamicoJInternalFrame(TipoUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoUnidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoUnidad);
				this.jInternalFrameReporteDinamicoTipoUnidad.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoUnidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUnidad"));
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUnidad"));
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUnidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUnidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaUnidad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoUnidad.jContentPaneDetalleTipoUnidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoUnidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoUnidad);
			
	       	this.jInternalFrameDetalleFormTipoUnidad.setVisible(false);
	        this.jInternalFrameDetalleFormTipoUnidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoUnidad.dispose();
			//this.jInternalFrameDetalleFormTipoUnidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoUnidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoUnidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoUnidad.setVisible(true);
	        this.jInternalFrameImportacionTipoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoUnidad.setVisible(true);
	        this.jInternalFrameOrderByTipoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoUnidad.setVisible(false);
	        this.jInternalFrameOrderByTipoUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoUnidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoUnidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoUnidad.setVisible(false);
	        this.jInternalFrameImportacionTipoUnidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoUnidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoUnidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoUnidad(true);
			//this.isEsNuevoTipoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUnidad(false) ;
			
			if(tipounidadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadSessionBean.getEsGuardarRelacionado() && UnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUnidadActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUnidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoUnidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoUnidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoUnidad(true);
			//this.isEsNuevoTipoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipounidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoUnidad(false) ;
			
			if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUnidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoUnidad(false);
			
			//if(!this.isEsNuevoTipoUnidad) {								
				int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
				
			}
			
			if(this.permiteMantenimiento(this.tipounidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoUnidad=true;
					this.inicializarActualizarBindingTablaTipoUnidad(false);
					this.isEsNuevoTipoUnidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoUnidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoUnidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUnidad(false);
				
				this.habilitarDeshabilitarControlesTipoUnidad(false);
			
												
				
				if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoUnidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoUnidadActionPerformed(evt,tipounidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoUnidad(this.tipounidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoUnidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipounidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipounidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				this.tipounidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				this.tipounidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipounidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoUnidadModel) this.jTableDatosTipoUnidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoUnidad=true;
				this.inicializarActualizarBindingTablaTipoUnidad(false);
				this.isEsNuevoTipoUnidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUnidad(false);
				
				this.habilitarDeshabilitarControlesTipoUnidad(false);
				
				
				
				if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoUnidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoUnidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoUnidad.getRowCount()>=1) {
				jTableDatosTipoUnidad.removeRowSelectionInterval(0, jTableDatosTipoUnidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoUnidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoUnidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUnidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUnidad(false) ;
			
			this.isEsNuevoTipoUnidad=false;
			
			if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoUnidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoUnidad(false);
				
				//SI ES MANUAL
				if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoUnidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoUnidad--;			
			//TipoUnidad tipounidadAux= new TipoUnidad();			
			//tipounidadAux.setId(this.iIdNuevoTipoUnidad);
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoUnidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
			
			this.tipounidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipounidadLogic.getTipoUnidads().add(this.tipounidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipounidads.add(this.tipounidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoUnidad(false);
			
			this.jTableDatosTipoUnidad.setRowSelectionInterval(this.getIndiceNuevoTipoUnidad(), this.getIndiceNuevoTipoUnidad());
			
			int iLastRow =  this.jTableDatosTipoUnidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoUnidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoUnidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoUnidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUnidad(false);
			
			//SI ES MANUAL
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUnidad();
			}
			
			//this.abrirFrameTreeTipoUnidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo UnidadES ?", "MANTENIMIENTO DE Tipo Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoUnidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoUnidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipounidadReturnGeneral=tipounidadLogic.procesarImportacionTipoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipounidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoUnidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoUnidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoUnidad.setFileImportacion(this.jInternalFrameImportacionTipoUnidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoUnidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoUnidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoUnidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoUnidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		

		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoUnidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoUnidadBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoUnidadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoUnidadConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoUnidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoUnidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoUnidadConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoUnidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoUnidadConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoUnidadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoUnidadConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoUnidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoUnidadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoUnidad tipounidad:tipounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipounidad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoUnidadConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(TipoUnidad tipounidad:tipounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipounidad.getsiglas());
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
			//	this.getFilaCabeceraExportarExcelTipoUnidad(row);				
			//	iRow++;
			//}				
			
			//for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoUnidad(tipounidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUnidad(false);
			
			//SI ES MANUAL
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUnidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUnidad(false);
			
			//SI ES MANUAL
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoUnidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUnidad(false);
			
			//SI ES MANUAL
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoUnidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoUnidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoUnidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoUnidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoUnidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoUnidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoUnidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoUnidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoUnidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoUnidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoUnidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoUnidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoUnidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoUnidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoUnidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUnidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoUnidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoUnidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoUnidad();
		
		this.inicializarActualizarBindingBotonesManualTipoUnidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoUnidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUnidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUnidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUnidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoUnidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoUnidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoUnidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionNuevoTipoUnidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionSinCerrarTipoUnidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionSinMensajeTipoUnidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoUnidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoUnidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoUnidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
				this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionNuevoTipoUnidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionSinCerrarTipoUnidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoUnidad.jCheckBoxPostAccionSinMensajeTipoUnidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoUnidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoUnidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoUnidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoUnidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoUnidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoUnidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoUnidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoUnidad(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUnidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoUnidad() throws Exception {
		try	{
			if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoUnidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoUnidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoUnidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoUnidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoUnidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoUnidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoUnidad.addItem(reporte);
			}
			
			
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoUnidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoUnidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUnidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUnidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
				this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
				this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoUnidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoUnidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoUnidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoUnidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoUnidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoUnidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoUnidad.getText();
		this.siglasBusquedaPorSiglas=this.jTextFieldsiglasBusquedaPorSiglasTipoUnidad.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoUnidad(Boolean esInicializar) throws Exception {				
		if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoUnidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoUnidad() throws Exception {
		this.inicializarActualizarBindingTablaTipoUnidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoUnidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoUnidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoUnidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipounidadLogic.getTipoUnidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipounidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoUnidad.setModel(new TipoUnidadModel(this.tipounidadLogic.getTipoUnidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoUnidad.setModel(new TipoUnidadModel(this.tipounidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoUnidad!=null && this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoUnidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO,tipounidadConstantesFunciones.resaltarSeleccionarTipoUnidad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO,tipounidadConstantesFunciones.resaltarSeleccionarTipoUnidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,TipoUnidadConstantesFunciones.LABEL_ID));

		if(this.tipounidadConstantesFunciones.mostraridTipoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUnidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipounidadConstantesFunciones.resaltaridTipoUnidad,this.tipounidadConstantesFunciones.activaridTipoUnidad,this,true,"idTipoUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipounidadConstantesFunciones.resaltaridTipoUnidad,this.tipounidadConstantesFunciones.activaridTipoUnidad,this,true,"idTipoUnidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,TipoUnidadConstantesFunciones.LABEL_NOMBRE));

		if(this.tipounidadConstantesFunciones.mostrarnombreTipoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUnidadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipounidadConstantesFunciones.resaltarnombreTipoUnidad,this.tipounidadConstantesFunciones.activarnombreTipoUnidad,this,true,"nombreTipoUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipounidadConstantesFunciones.resaltarnombreTipoUnidad,this.tipounidadConstantesFunciones.activarnombreTipoUnidad,this,true,"nombreTipoUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,TipoUnidadConstantesFunciones.LABEL_SIGLAS));

		if(this.tipounidadConstantesFunciones.mostrarsiglasTipoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUnidadConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipounidadConstantesFunciones.resaltarsiglasTipoUnidad,this.tipounidadConstantesFunciones.activarsiglasTipoUnidad,this,true,"siglasTipoUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipounidadConstantesFunciones.resaltarsiglasTipoUnidad,this.tipounidadConstantesFunciones.activarsiglasTipoUnidad,this,true,"siglasTipoUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUnidad && this.tipounidadConstantesFunciones.mostrarUnidadTipoUnidad && !TipoUnidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Unidades");
				tableColumn.setHeaderValue("Unidades");
				tableColumn.setCellRenderer(new UnidadTableCell(tipounidadConstantesFunciones.resaltarUnidadTipoUnidad,this,this.tipounidadConstantesFunciones.activarUnidadTipoUnidad));
				tableColumn.setCellEditor(new UnidadTableCell(tipounidadConstantesFunciones.resaltarUnidadTipoUnidad,this,this.tipounidadConstantesFunciones.activarUnidadTipoUnidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoUnidad.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipounidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipounidadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoUnidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipounidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipounidadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoUnidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipounidadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipounidadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoUnidad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipounidadSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoUnidad.addColumn(tableColumn);
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
			
			this.jTableDatosTipoUnidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipounidadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoUnidad.moveColumn(this.jTableDatosTipoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoUnidad.moveColumn(this.jTableDatosTipoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipounidadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoUnidad.moveColumn(this.jTableDatosTipoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoUnidad.moveColumn(this.jTableDatosTipoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoUnidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoUnidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoUnidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoUnidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoUnidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoUnidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoUnidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoUnidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipounidadLogic.getTipoUnidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipounidads.size()-1;
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
		//this.jTableDatosTipoUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoUnidad();
			
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
				
				//this.isEsNuevoTipoUnidad=false;
					
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
				if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoUnidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoUnidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipounidad.getsType().equals("DUPLICADO")
				   || this.tipounidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoUnidad=true;
				
				} else {
					this.isEsNuevoTipoUnidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					if(this.tipounidad.getId()>=0 && !this.tipounidad.getIsNew()) {						
						this.isEsNuevoTipoUnidad=false;
						
					} else {
						this.isEsNuevoTipoUnidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoUnidad(esRelaciones);						
				
				this.seleccionarTipoUnidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipounidad.getId()<0) {
					this.isEsNuevoTipoUnidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoUnidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoUnidad(evt,rowIndex);
				}	
				
				if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoUnidad: " + this.dDif); 
					}
				}								
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoUnidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipounidad)) {
					if(this.tipounidad.getId()>0) {
						this.tipounidad.setIsDeleted(true);
						
						this.tipounidadsEliminados.add(this.tipounidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipounidadLogic.getTipoUnidads().remove(this.tipounidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipounidads.remove(this.tipounidad);				
					}
					
					
					((TipoUnidadModel) this.jTableDatosTipoUnidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUnidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoUnidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoUnidad) {
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoUnidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoUnidad(this.tipounidad);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoUnidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoUnidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUnidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoUnidad(TipoUnidad tipounidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoUnidad(tipounidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoUnidad(TipoUnidad tipounidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoUnidad(tipounidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoUnidad(tipounidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoUnidad(tipounidad);
	}
	
	public void setVariablesObjetoActualToFormularioTipoUnidad(TipoUnidad tipounidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setText(tipounidad.getId().toString());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setText(tipounidad.getnombre());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setText(tipounidad.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoUnidad tipounidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipounidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoUnidad tipounidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipounidadLocal=this.tipounidad;
			} else {
				tipounidadLocal=this.tipounidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipounidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoUnidad(tipounidadLocal,true);
					
					if(tipounidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipounidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipounidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoUnidad(TipoUnidad tipounidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoUnidad(tipounidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(tipounidad);
	}
	
	public void setVariablesFormularioToObjetoActualTipoUnidad(TipoUnidad tipounidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoUnidad(tipounidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoUnidad(TipoUnidad tipounidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.getText()==null || this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.getText()=="" || this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setText("0");
			}

			if(conColumnasBase) {tipounidad.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUnidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUnidad.jLabelIdTipoUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipounidad.setnombre(this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUnidadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUnidad.jLabelnombreTipoUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipounidad.setsiglas(this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUnidadConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUnidad.jLabelsiglasTipoUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoUnidad(TipoUnidad tipounidadBean,TipoUnidad tipounidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoUnidad(TipoUnidad tipounidadOrigen,TipoUnidad tipounidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipounidadOrigen.getId()!=null && !tipounidadOrigen.getId().equals(0L))) {tipounidad.setId(tipounidadOrigen.getId());}}
			if(conDefault || (!conDefault && tipounidadOrigen.getnombre()!=null && !tipounidadOrigen.getnombre().equals(""))) {tipounidad.setnombre(tipounidadOrigen.getnombre());}
			if(conDefault || (!conDefault && tipounidadOrigen.getsiglas()!=null && !tipounidadOrigen.getsiglas().equals(""))) {tipounidad.setsiglas(tipounidadOrigen.getsiglas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoUnidad(TipoUnidad tipounidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setText(tipounidad.getId().toString());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setText(tipounidad.getnombre());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setText(tipounidad.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoUnidad(TipoUnidadBean tipounidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setText(tipounidadBean.getId().toString());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setText(tipounidadBean.getnombre());
			this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setText(tipounidadBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoUnidad(TipoUnidadParameterReturnGeneral tipounidadReturnGeneral,TipoUnidadBean tipounidadBean,Boolean conDefault) throws Exception { 
		try {
			TipoUnidad tipounidadLocal=new TipoUnidad();
			
			tipounidadLocal=tipounidadReturnGeneral.getTipoUnidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipounidadLocal.getId()!=null && !tipounidadLocal.getId().equals(0L))) {tipounidadBean.setId(tipounidadLocal.getId());}}
			if(conDefault || (!conDefault && tipounidadLocal.getnombre()!=null && !tipounidadLocal.getnombre().equals(""))) {tipounidadBean.setnombre(tipounidadLocal.getnombre());}
			if(conDefault || (!conDefault && tipounidadLocal.getsiglas()!=null && !tipounidadLocal.getsiglas().equals(""))) {tipounidadBean.setsiglas(tipounidadLocal.getsiglas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoUnidadGenerico(Long idTipoUnidadSeleccionado,JComboBox jComboBoxTipoUnidad,List<TipoUnidad> tipounidadsLocal)throws Exception {
		try {
			TipoUnidad  tipounidadTemp=null;

			for(TipoUnidad tipounidadAux:tipounidadsLocal) {
				if(tipounidadAux.getId()!=null && tipounidadAux.getId().equals(idTipoUnidadSeleccionado)) {
					tipounidadTemp=tipounidadAux;
					break;
				}
			}

			jComboBoxTipoUnidad.setSelectedItem(tipounidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoUnidadGenerico(JComboBox jComboBoxTipoUnidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoUnidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoUnidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Unidad")) {
			jButtonUnidadActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipounidad=(TipoUnidad) tipounidadLogic.getTipoUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipounidad =(TipoUnidad) tipounidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoUnidad tipounidadRow=new TipoUnidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipounidadRow=(TipoUnidad) tipounidadLogic.getTipoUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipounidadRow=(TipoUnidad) tipounidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonUnidadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoUnidad tipounidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoUnidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidad = (TipoUnidad)this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipounidad = (TipoUnidad)this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipounidad!=null) {
						this.tipounidad = tipounidad;
					} else {
						this.tipounidad = new TipoUnidad();
					}
				}

				if(this.isTienePermisosUnidad && this.permiteMantenimiento(this.tipounidad)) {
					UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup=new UnidadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						unidadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup;
					} else {
						unidadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame;
					}

					List<TipoUnidad> tipounidads=new ArrayList<TipoUnidad>();
					tipounidads.add(this.tipounidad);
					if(!esRelacionado) {
						//unidadBeanSwingJInternalFrame.unidadSessionBean.setConGuardarRelaciones(false);
						//unidadBeanSwingJInternalFrame.unidadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					unidadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoUnidad.cargarUnidadBeanSwingJInternalFrame(tipounidads,this.tipounidad,unidadBeanSwingJInternalFrame,/*conInicializar,*/unidadBeanSwingJInternalFrame.unidadSessionBean.getConGuardarRelaciones(),unidadBeanSwingJInternalFrame.unidadSessionBean.getEsGuardarRelacionado());
					unidadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						unidadBeanSwingJInternalFrame.actualizarEstadoPanelsUnidad("no_relacionado");

						unidadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UnidadConstantesFunciones.ITAMANIOFILATABLA + (UnidadConstantesFunciones.ITAMANIOFILATABLA/2));

						unidadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoUnidad=(TitledBorder)this.jScrollPanelDatosTipoUnidad.getBorder();
						TitledBorder titledBorderUnidad=(TitledBorder)unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

						titledBorderUnidad.setTitle(titledBorderTipoUnidad.getTitle() + " -> Unidad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,unidadBeanSwingJInternalFrame);
						}

						unidadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(unidadBeanSwingJInternalFrame);

						unidadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipounidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Unidad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoUnidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad));			
			this.jButtonDuplicarTipoUnidad.setVisible((this.isVisibilidadCeldaDuplicarTipoUnidad && this.isPermisoDuplicarTipoUnidad));			
			this.jButtonCopiarTipoUnidad.setVisible((this.isVisibilidadCeldaCopiarTipoUnidad && this.isPermisoCopiarTipoUnidad));
			this.jButtonVerFormTipoUnidad.setVisible((this.isVisibilidadCeldaVerFormTipoUnidad && this.isPermisoVerFormTipoUnidad));
			
			this.jButtonAbrirOrderByTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));			
			
			this.jButtonNuevoRelacionesTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUnidad && this.isPermisoNuevoTipoUnidad));			
			this.jButtonNuevoGuardarCambiosTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarTipoUnidad.setVisible((this.isVisibilidadCeldaModificarTipoUnidad && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.setVisible((this.isVisibilidadCeldaActualizarTipoUnidad && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.setVisible((this.isVisibilidadCeldaEliminarTipoUnidad && this.isPermisoEliminarTipoUnidad));
			this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.setVisible(this.isVisibilidadCeldaCancelarTipoUnidad);							
			this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad));						
			this.jButtonDuplicarToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaDuplicarTipoUnidad && this.isPermisoDuplicarTipoUnidad));						
			this.jButtonCopiarToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaCopiarTipoUnidad && this.isPermisoCopiarTipoUnidad));			
			this.jButtonVerFormToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaVerFormTipoUnidad && this.isPermisoVerFormTipoUnidad));			
			this.jButtonAbrirOrderByToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));
			this.jButtonNuevoRelacionesToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUnidad && this.isPermisoNuevoTipoUnidad));			
			this.jButtonNuevoGuardarCambiosToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));			
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaModificarTipoUnidad && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaActualizarTipoUnidad  && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaEliminarTipoUnidad && this.isPermisoEliminarTipoUnidad));
			this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarToolBarTipoUnidad.setVisible(this.isVisibilidadCeldaCancelarTipoUnidad);				
			this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad));			
			this.jMenuItemDuplicarTipoUnidad.setVisible((this.isVisibilidadCeldaDuplicarTipoUnidad && this.isPermisoDuplicarTipoUnidad));			
			this.jMenuItemCopiarTipoUnidad.setVisible((this.isVisibilidadCeldaCopiarTipoUnidad && this.isPermisoCopiarTipoUnidad));			
			this.jMenuItemVerFormTipoUnidad.setVisible((this.isVisibilidadCeldaVerFormTipoUnidad && this.isPermisoVerFormTipoUnidad));			
			this.jMenuItemAbrirOrderByTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));			
			//this.jMenuItemMostrarOcultarTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));
			this.jMenuItemDetalleAbrirOrderByTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));			
			//this.jMenuItemDetalleMostrarOcultarTipoUnidad.setVisible((this.isVisibilidadCeldaOrdenTipoUnidad && this.isPermisoOrdenTipoUnidad));			
			this.jMenuItemNuevoRelacionesTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUnidad && this.isPermisoNuevoTipoUnidad));			
			this.jMenuItemNuevoGuardarCambiosTipoUnidad.setVisible((this.isVisibilidadCeldaNuevoTipoUnidad && this.isPermisoNuevoTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));									
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemModificarTipoUnidad.setVisible((this.isVisibilidadCeldaModificarTipoUnidad && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemActualizarTipoUnidad.setVisible((this.isVisibilidadCeldaActualizarTipoUnidad && this.isPermisoActualizarTipoUnidad));	
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemEliminarTipoUnidad.setVisible((this.isVisibilidadCeldaEliminarTipoUnidad && this.isPermisoEliminarTipoUnidad));
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemCancelarTipoUnidad.setVisible(this.isVisibilidadCeldaCancelarTipoUnidad);				
			}
			
			this.jMenuItemGuardarCambiosTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));						
			this.jMenuItemGuardarCambiosTablaTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoUnidad=this.jButtonNuevoTipoUnidad.isVisible();
			this.isVisibilidadCeldaDuplicarTipoUnidad=this.jButtonDuplicarTipoUnidad.isVisible();
			this.isVisibilidadCeldaCopiarTipoUnidad=this.jButtonCopiarTipoUnidad.isVisible();
			this.isVisibilidadCeldaVerFormTipoUnidad=this.jButtonVerFormTipoUnidad.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoUnidad=this.jButtonAbrirOrderByTipoUnidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=this.jButtonNuevoRelacionesTipoUnidad.isVisible();
			this.isVisibilidadCeldaModificarTipoUnidad=this.jButtonModificarTipoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.isVisibilidadCeldaActualizarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=this.jButtonGuardarCambiosTablaTipoUnidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoUnidad=this.jButtonNuevoToolBarTipoUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=this.jButtonNuevoRelacionesToolBarTipoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.isVisibilidadCeldaModificarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarToolBarTipoUnidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarToolBarTipoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarToolBarTipoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarToolBarTipoUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoUnidad=this.jButtonGuardarCambiosToolBarTipoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=this.jButtonGuardarCambiosTablaToolBarTipoUnidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoUnidad=this.jMenuItemNuevoTipoUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=this.jMenuItemNuevoRelacionesTipoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.isVisibilidadCeldaModificarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jMenuItemModificarTipoUnidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jMenuItemActualizarTipoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jMenuItemEliminarTipoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoUnidad=this.jInternalFrameDetalleFormTipoUnidad.jMenuItemCancelarTipoUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoUnidad=this.jMenuItemGuardarCambiosTipoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=this.jMenuItemGuardarCambiosTablaTipoUnidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoUnidad(Boolean esInicializar) {
		if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
				//if(this.tipounidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoUnidad();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoUnidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoUnidad() {
		this.jButtonNuevoTipoUnidad.setVisible(this.isPermisoNuevoTipoUnidad);			
		this.jButtonDuplicarTipoUnidad.setVisible(this.isPermisoDuplicarTipoUnidad);			
		this.jButtonCopiarTipoUnidad.setVisible(this.isPermisoCopiarTipoUnidad);			
		this.jButtonVerFormTipoUnidad.setVisible(this.isPermisoVerFormTipoUnidad);			
		
		this.jButtonAbrirOrderByTipoUnidad.setVisible(this.isPermisoOrdenTipoUnidad);					
		
		this.jButtonNuevoRelacionesTipoUnidad.setVisible(this.isPermisoNuevoTipoUnidad);			
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarTipoUnidad.setVisible(this.isPermisoActualizarTipoUnidad);	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.setVisible(this.isPermisoActualizarTipoUnidad);	
			this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.setVisible(this.isPermisoEliminarTipoUnidad);
			this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.setVisible(this.isVisibilidadCeldaCancelarTipoUnidad);						
			this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.setVisible(this.isPermisoGuardarCambiosTipoUnidad);							
		}
		
		this.jButtonGuardarCambiosTablaTipoUnidad.setVisible(this.isPermisoActualizarTipoUnidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoUnidad() {
		this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarTipoUnidad.setVisible(this.isPermisoActualizarTipoUnidad);	
		this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.setVisible(this.isPermisoActualizarTipoUnidad);	
		this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.setVisible(this.isPermisoEliminarTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.setVisible(this.isVisibilidadCeldaCancelarTipoUnidad);							
		this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.setVisible((this.isVisibilidadCeldaGuardarTipoUnidad && this.isPermisoGuardarCambiosTipoUnidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoUnidad() {
		if(TipoUnidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoUnidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoUnidad() {
	}
	
	public void jTableDatosTipoUnidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoUnidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUnidad(this.gettipounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipounidad==null) {
						this.tipounidad = new TipoUnidad();
					}

					this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
				}

				if(this.tipounidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipounidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUnidad(this.gettipounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipounidad==null) {
						this.tipounidad = new TipoUnidad();
					}

					this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
				}

				if(this.tipounidad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipounidad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasTipoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUnidad(this.gettipounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipounidad==null) {
						this.tipounidad = new TipoUnidad();
					}

					this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);
				}

				if(this.tipounidad.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.tipounidad.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoUnidad(false,false);

			this.getTipoUnidadsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoUnidad(false);

			//if(TipoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglasTipoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoUnidad(false,false);

			this.getTipoUnidadsBusquedaPorSiglas();

			this.inicializarActualizarBindingTipoUnidad(false);

			//if(TipoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoUnidad() {
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
		

		if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
			this.jInternalFrameDetalleFormTipoUnidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoUnidad.dispose();
			this.jInternalFrameDetalleFormTipoUnidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
			this.jInternalFrameReporteDinamicoTipoUnidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoUnidad.dispose();
			this.jInternalFrameReporteDinamicoTipoUnidad=null;
		}
		
		if(this.jInternalFrameImportacionTipoUnidad!=null) {
			this.jInternalFrameImportacionTipoUnidad.setVisible(false);	    			
			this.jInternalFrameImportacionTipoUnidad.dispose();
			this.jInternalFrameImportacionTipoUnidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoUnidad();
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoUnidad")) {
				jButtonDuplicarTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoUnidad")) {
				jButtonCopiarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoUnidad")) {
				jButtonVerFormTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoUnidad")) {
				jButtonDuplicarTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoUnidad")) {
				jButtonDuplicarTipoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoUnidad")) {
				jButtonModificarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoUnidad")) {
				jButtonModificarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoUnidad")) {
				jButtonModificarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoUnidad")) {
				jButtonActualizarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoUnidad")) {
				jButtonActualizarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoUnidad")) {
				jButtonActualizarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoUnidad")) {
				jButtonEliminarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoUnidad")) {
				jButtonEliminarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoUnidad")) {
				jButtonEliminarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoUnidad")) {
				jButtonCancelarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoUnidad")) {
				jButtonCancelarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoUnidad")) {
				jButtonCancelarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoUnidad")) {
				jButtonCerrarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoUnidad")) {
				jButtonCerrarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoUnidad")) {
				jButtonCerrarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoUnidad")) {
				jButtonMostrarOcultarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoUnidad")) {
				jButtonCancelarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoUnidad")) {
				jButtonCopiarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoUnidad")) {
				jButtonVerFormTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoUnidad")) {
				jButtonCopiarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoUnidad")) {
				jButtonVerFormTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoUnidad")) {
				jButtonRecargarInformacionTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoUnidad")) {
				jButtonRecargarInformacionTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoUnidad")) {
				jButtonRecargarInformacionTipoUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoUnidad")) {
				jButtonAnterioresTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoUnidad")) {
				jButtonAnterioresTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoUnidad")) {
				jButtonAnterioresTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoUnidad")) {
				jButtonSiguientesTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoUnidad")) {
				jButtonSiguientesTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoUnidad")) {
				jButtonSiguientesTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoUnidad") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoUnidad")) {
				jButtonAbrirOrderByTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoUnidad") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoUnidad")) {
				jButtonMostrarOcultarTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoUnidad")) {
				jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoUnidad")) {
				jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoUnidad")) {
				jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoUnidad")) {
				jButtonCerrarReporteDinamicoTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoUnidad")) {
				jButtonGenerarReporteDinamicoTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoUnidad")) {
				
				jButtonGenerarExcelReporteDinamicoTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoUnidad")) {
				jButtonCerrarImportacionTipoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoUnidad")) {
				
				jButtonGenerarImportacionTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoUnidad")) {
				
				jButtonAbrirImportacionTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoUnidad")) {
				jComboBoxTiposAccionesTipoUnidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoUnidad")) {
				jComboBoxTiposRelacionesTipoUnidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoUnidad")) {
				jComboBoxTiposAccionesTipoUnidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoUnidad")) {
				
				jComboBoxTiposSeleccionarTipoUnidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoUnidad")) {
				jTextFieldValorCampoGeneralTipoUnidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoUnidad")) {
				jButtonAbrirOrderByTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoUnidad")) {
				jButtonAbrirOrderByTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoUnidad")) {
				jButtonCerrarOrderByTipoUnidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoUnidadBusqueda")) {
				this.jButtonidTipoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoUnidadBusqueda")) {
				this.jButtonnombreTipoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoUnidadBusqueda")) {
				this.jButtonsiglasTipoUnidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoUnidad")) {
				this.jButtonBusquedaPorNombreTipoUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglasTipoUnidad")) {
				this.jButtonBusquedaPorSiglasTipoUnidadActionPerformed(evt);
			}
			
			;
			
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoUnidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoUnidad tipounidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipounidadLocal=this.tipounidad;
			} else {
				tipounidadLocal=this.tipounidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
							
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
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
			
			


			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
								
						
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
								
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
							
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
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
			
			


			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
								
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoUnidad")) {
					jCheckBoxSeleccionarTodosTipoUnidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoUnidad")) {
					jCheckBoxSeleccionadosTipoUnidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoUnidad")) {
					
				}
				
				


				
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
												
				
				


				
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
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
			
			


			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipounidad);
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
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
				
				


				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUnidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipounidadAnterior =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoUnidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoUnidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipounidad =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipounidad =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipounidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoUnidad")) {
				
				}
				
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoUnidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoUnidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoUnidad")) {
			
			}
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoUnidad();
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			if(sTipo.equals("NuevoTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoUnidad")) {
				jButtonDuplicarTipoUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoUnidad")) {
				jButtonCopiarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoUnidad")) {
				jButtonVerFormTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoUnidad")) {
				jButtonNuevoTipoUnidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoUnidad")) {
				jButtonModificarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoUnidad")) {
				jButtonActualizarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoUnidad")) {
				jButtonEliminarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoUnidad")) {
				jButtonCancelarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoUnidad")) {
				jButtonCerrarTipoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoUnidad")) {
				jButtonGuardarCambiosTipoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoUnidad")) {
				jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoUnidad")) {
				jButtonAbrirOrderByTipoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoUnidad")) {
				jButtonRecargarInformacionTipoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoUnidad")) {
				jButtonAnterioresTipoUnidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoUnidad")) {
				jButtonSiguientesTipoUnidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoUnidadBusqueda")) {
				this.jButtonidTipoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoUnidadBusqueda")) {
				this.jButtonnombreTipoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoUnidadBusqueda")) {
				this.jButtonsiglasTipoUnidadBusquedaActionPerformed(evt);
			}
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoUnidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoUnidad")) {
				closingInternalFrameTipoUnidad();
				
			} else if(sTipo.equals("jButtonCancelarTipoUnidad")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoUnidad = (JInternalFrameBase)evt.getSource();
	            	
	            TipoUnidadBeanSwingJInternalFrame jInternalFrameParent=(TipoUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoUnidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoUnidadActionPerformed(null);
			}
			
			TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipounidad,new Object(),this.tipounidadParameterGeneral,this.tipounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipounidad)) {
			if(!esControlTabla) {
				if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);			
				}
				
				if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoUnidad(this.tipounidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipounidadReturnGeneral=tipounidadLogic.procesarEventosTipoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipounidadLogic.getTipoUnidads(),this.tipounidad,this.tipounidadParameterGeneral,this.isEsNuevoTipoUnidad,classes);//this.tipounidadLogic.getTipoUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoUnidad(this.tipounidadReturnGeneral,this.tipounidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoUnidad(classes,this.tipounidadReturnGeneral,this.tipounidadBean,false);
					}
						
					if(this.tipounidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad());	
					}
						
					if(this.tipounidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad(),classes);//this.tipounidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoUnidad(this.tipounidad,classes);//this.tipounidadBean);									
				}
			
				if(TipoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoUnidad(this.tipounidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUnidad(this.tipounidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipounidadAnterior!=null) {
						this.tipounidad=this.tipounidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipounidadReturnGeneral=tipounidadLogic.procesarEventosTipoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipounidadLogic.getTipoUnidads(),this.tipounidad,this.tipounidadParameterGeneral,this.isEsNuevoTipoUnidad,classes);//this.tipounidadLogic.getTipoUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipounidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipounidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipounidadReturnGeneral.getTipoUnidad(),tipounidadLogic.getTipoUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipounidadReturnGeneral.getTipoUnidad(),this.tipounidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoUnidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoUnidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoUnidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoUnidad() throws Exception {
		
		TipoUnidadModel tipounidadModel=(TipoUnidadModel)this.jTableDatosTipoUnidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipounidadModel.tipounidads=this.tipounidadLogic.getTipoUnidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipounidadModel.tipounidads=this.tipounidads;
		}
		
		
		((TipoUnidadModel) this.jTableDatosTipoUnidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoUnidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipounidadAnterior(),this.tipounidadLogic.getTipoUnidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipounidadAnterior(),this.tipounidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoUnidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoUnidad(TipoUnidad tipounidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Unidad.class)) {
					this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.setUnidads(tipounidad.getUnidads());
					this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
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
										
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipounidad,new Object(),generalEntityParameterGeneral,this.tipounidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipounidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoUnidadConstantesFunciones.getClassesRelationshipsOfTipoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoUnidadConstantesFunciones.getClassesRelationshipsFromStringsOfTipoUnidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipounidad,new Object(),generalEntityParameterGeneral,this.tipounidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoUnidad(TipoUnidadBean tipounidadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Unidad.class)) {
					this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.setUnidads(tipounidad.getUnidads());
					this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoUnidad(ArrayList<Classe> classes,TipoUnidadReturnGeneral tipounidadReturnGeneral,TipoUnidadBean tipounidadBean,Boolean conDefault) throws Exception {
		
			this.tipounidadBean.setUnidads(tipounidadReturnGeneral.getTipoUnidad().getUnidads());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoUnidad(TipoUnidad tipounidad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Unidad.class)) {
					tipounidad.setUnidads(this.jInternalFrameDetalleFormTipoUnidad.unidadBeanSwingJInternalFrame.unidadLogic.getUnidads());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipounidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoUnidad = new TipoUnidadDetalleFormJInternalFrame(jDesktopPane,this.tipounidadSessionBean.getConGuardarRelaciones(),this.tipounidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.setVisible(false);
		this.jInternalFrameDetalleFormTipoUnidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoUnidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoUnidad.tipounidadLogic=this.tipounidadLogic;
		
		this.cargarCombosFrameForeignKeyTipoUnidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoUnidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoUnidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoUnidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoUnidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoUnidad"));
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarTipoUnidad.addActionListener(new ButtonActionListener(this,"ModificarTipoUnidad"));

		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoUnidad"));
					
		this.jInternalFrameDetalleFormTipoUnidad.jMenuItemModificarTipoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoUnidad"));
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoUnidad"));
						
		this.jInternalFrameDetalleFormTipoUnidad.jMenuItemActualizarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.addActionListener (new ButtonActionListener(this,"EliminarTipoUnidad"));
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoUnidad"));
								
		this.jInternalFrameDetalleFormTipoUnidad.jMenuItemEliminarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.addActionListener (new ButtonActionListener(this,"CancelarTipoUnidad"));
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoUnidad"));
					
		this.jInternalFrameDetalleFormTipoUnidad.jMenuItemCancelarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoUnidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jMenuItemDetalleCerrarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUnidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUnidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoUnidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonidTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonnombreTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonsiglasTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoUnidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoUnidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoUnidad"));
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoUnidad"));
		}
		
		this.jTableDatosTipoUnidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoUnidad"));
		
		this.jTableDatosTipoUnidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoUnidad"));
		
		this.jButtonNuevoTipoUnidad.addActionListener(new ButtonActionListener(this,"NuevoTipoUnidad"));
		
		this.jButtonDuplicarTipoUnidad.addActionListener(new ButtonActionListener(this,"DuplicarTipoUnidad"));
		
		this.jButtonCopiarTipoUnidad.addActionListener(new ButtonActionListener(this,"CopiarTipoUnidad"));
		
		this.jButtonVerFormTipoUnidad.addActionListener(new ButtonActionListener(this,"VerFormTipoUnidad"));
		
		
		this.jButtonNuevoToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoUnidad"));
			
		this.jButtonDuplicarToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoUnidad"));
			
		this.jMenuItemNuevoTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoUnidad"));
			
		this.jMenuItemDuplicarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoUnidad"));		
		
		
		this.jButtonNuevoRelacionesTipoUnidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoUnidad"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoUnidad"));
			
		this.jMenuItemNuevoRelacionesTipoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarTipoUnidad.addActionListener(new ButtonActionListener(this,"ModificarTipoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonModificarToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoUnidad"));
			
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemModificarTipoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarTipoUnidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonActualizarToolBarTipoUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoUnidad"));
				
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemActualizarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarTipoUnidad.addActionListener (new ButtonActionListener(this,"EliminarTipoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonEliminarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoUnidad"));
						
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemEliminarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarTipoUnidad.addActionListener (new ButtonActionListener(this,"CancelarTipoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonCancelarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoUnidad"));
			
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemCancelarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoUnidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoUnidad"));		
		
		
		this.jButtonCerrarTipoUnidad.addActionListener (new ButtonActionListener(this,"CerrarTipoUnidad"));
		
		
		this.jButtonCerrarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoUnidad"));
			
		this.jMenuItemCerrarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoUnidad"));
			
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jMenuItemDetalleCerrarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUnidad"));
		}
		
		this.jButtonCopiarToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoUnidad"));
			
		this.jButtonVerFormToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoUnidad"));
		
		this.jMenuItemGuardarCambiosTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoUnidad"));
			
		this.jMenuItemCopiarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoUnidad"));		
		
		this.jMenuItemVerFormTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoUnidad"));		
		
		
		this.jButtonGuardarCambiosTablaTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoUnidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoUnidad"));
			
		this.jMenuItemGuardarCambiosTablaTipoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoUnidad"));		
		
		
		
		this.jButtonRecargarInformacionTipoUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoUnidad"));
					
		this.jButtonRecargarInformacionToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoUnidad"));
		
		this.jMenuItemRecargarInformacionTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoUnidad"));		
		
		
		
		this.jButtonAnterioresTipoUnidad.addActionListener (new ButtonActionListener(this,"AnterioresTipoUnidad"));
		
		
		this.jButtonAnterioresToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoUnidad"));
		
		this.jMenuItemAnterioresTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoUnidad"));		
		
		
		this.jButtonSiguientesTipoUnidad.addActionListener (new ButtonActionListener(this,"SiguientesTipoUnidad"));
		
		
		this.jButtonSiguientesToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoUnidad"));
			
		this.jMenuItemSiguientesTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoUnidad"));
			
		this.jMenuItemAbrirOrderByTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoUnidad"));
			
		this.jMenuItemMostrarOcultarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoUnidad"));
			
		this.jMenuItemDetalleAbrirOrderByTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoUnidad"));
			
		this.jMenuItemDetalleMostarOcultarTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoUnidad"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoUnidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoUnidad"));
			
		this.jMenuItemNuevoGuardarCambiosTipoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoUnidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoUnidad"));

		this.jCheckBoxSeleccionadosTipoUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoUnidad"));
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoUnidad"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoUnidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoUnidad"));
			
		this.jComboBoxTiposAccionesTipoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoUnidad"));
					
		this.jComboBoxTiposSeleccionarTipoUnidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoUnidad"));
			
		this.jTextFieldValorCampoGeneralTipoUnidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonidTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonnombreTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonsiglasTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoUnidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoUnidad"));

			this.jButtonBusquedaPorSiglasTipoUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTipoUnidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoUnidad!=null) {
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUnidad"));
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUnidad"));
				this.jInternalFrameReporteDinamicoTipoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUnidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoUnidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUnidad"));				
			//this.jButtonGenerarReporteDinamicoTipoUnidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUnidad"));
			//this.jButtonGenerarExcelReporteDinamicoTipoUnidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUnidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoUnidad!=null) {
				this.jInternalFrameImportacionTipoUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoUnidad"));
				this.jInternalFrameImportacionTipoUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoUnidad"));
				this.jInternalFrameImportacionTipoUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoUnidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoUnidad"));
			
			this.jButtonAbrirOrderByToolBarTipoUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoUnidad"));			
			
			if(this.jInternalFrameOrderByTipoUnidad!=null) {
				this.jInternalFrameOrderByTipoUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoUnidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUnidad.jTabbedPaneRelacionesTipoUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoUnidad"));
		
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
            		closingInternalFrameTipoUnidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoUnidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoUnidad = (JInternalFrameBase)event.getSource();
	            	
	            TipoUnidadBeanSwingJInternalFrame jInternalFrameParent=(TipoUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoUnidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoUnidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoUnidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoUnidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoUnidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoUnidad";
		inputMap = this.jButtonNuevoTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoUnidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoUnidad";
		inputMap = this.jButtonNuevoRelacionesTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoUnidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoUnidad";
		inputMap = this.jButtonModificarTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoUnidad";
		inputMap = this.jButtonActualizarTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoUnidad";
		inputMap = this.jButtonEliminarTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoUnidad";
		inputMap = this.jButtonCancelarTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoUnidad";
		inputMap = this.jButtonCerrarTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoUnidad";
		inputMap = this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoUnidad.jButtonGuardarCambiosTipoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoUnidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoUnidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonidTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonnombreTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUnidad.jButtonsiglasTipoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoUnidadBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoUnidad"));

		this.jButtonBusquedaPorSiglasTipoUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTipoUnidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoUnidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoUnidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
					tipounidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUnidad tipounidadAux:tipounidads) {
					tipounidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
						tipounidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUnidad tipounidadAux:tipounidads) {
						tipounidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUnidad tipounidadAux:tipounidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoUnidad.getSelectedRows();
			
			TipoUnidad tipounidadLocal=new TipoUnidad();
			
			//this.seleccionarTodosTipoUnidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLocal =(TipoUnidad) this.tipounidadLogic.getTipoUnidads().toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipounidadLocal =(TipoUnidad) this.tipounidads.toArray()[this.jTableDatosTipoUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipounidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
						tipounidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUnidad tipounidadAux:tipounidads) {
						tipounidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoUnidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoUnidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoUnidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoUnidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoUnidad tipounidadAux:this.tipounidadLogic.getTipoUnidads()) {
				
						if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipounidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipounidadAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUnidad tipounidadAux:tipounidads) {
					
						if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipounidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipounidadAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoUnidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoUnidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoUnidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoUnidad) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoUnidad(conSplash);
				
					this.generarReporteTipoUnidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoUnidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoUnidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoUnidad();
				
				this.exportarTipoUnidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoUnidads();
				//this.importarTipoUnidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoUnidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoUnidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoUnidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoUnidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoUnidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoUnidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoUnidad(conSplash);
					
						//this.actualizarParametrosGeneralTipoUnidad();
						
						this.generarReporteProcesoAccionTipoUnidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoUnidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo UnidadES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoUnidad();
				
						this.actualizarParametrosGeneralTipoUnidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipounidadReturnGeneral=tipounidadLogic.procesarAccionTipoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipounidadLogic.getTipoUnidads(),this.tipounidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoUnidad();
					
					TipoUnidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoUnidad.jComboBoxTiposAccionesFormularioTipoUnidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoUnidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoUnidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoUnidad();
			
			if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
			TipoUnidad tipounidad=new TipoUnidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoUnidad.getSelectedItem();
			
			
			
			
			tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipounidadsSeleccionados.size()==1) {
				for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
					tipounidad=tipounidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Unidad")) {
					jButtonUnidadActionPerformed(null,rowIndex,true,false,tipounidad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoUnidad();
			
      		//this.finishProcessTipoUnidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoUnidadReturnGeneral() throws Exception {
		if(this.tipounidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipounidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipounidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipounidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipounidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipounidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoUnidad(false);
		}
		
		if(this.tipounidadReturnGeneral.getConRetornoLista() || this.tipounidadReturnGeneral.getConRetornoObjeto()) {
			if(this.tipounidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipounidadLogic.setTipoUnidads(this.tipounidadReturnGeneral.getTipoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipounidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipounidadLogic.setTipoUnidad(this.tipounidadReturnGeneral.getTipoUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoUnidad(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoUnidad() throws Exception {
		
		
	}
	
	public ArrayList<TipoUnidad> getTipoUnidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoUnidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoUnidad tipounidadAux:tipounidadLogic.getTipoUnidads()) {
					if(tipounidadAux.getIsSelected()) {
						tipounidadsSeleccionados.add(tipounidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUnidad tipounidadAux:this.tipounidads) {
					if(tipounidadAux.getIsSelected()) {
						tipounidadsSeleccionados.add(tipounidadAux);				
					}
				}
			}
			
			if(tipounidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipounidadsSeleccionados.addAll(this.tipounidadLogic.getTipoUnidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipounidadsSeleccionados.addAll(this.tipounidads);				
					}
				}
			}
		} else {
			tipounidadsSeleccionados.add(this.tipounidad);
		}
		
		return tipounidadsSeleccionados;
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
	
	public void generarReporteTipoUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoUnidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoUnidadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoUnidadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoUnidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoUnidad();
		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoUnidad();
		
		
		//this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados ,tipounidadImplementable,tipounidadImplementableHome);
	}
	
	public void mostrarImportacionTipoUnidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoUnidad();
		
		this.abrirFrameImportacionTipoUnidad();		
		
			
		//this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados ,tipounidadImplementable,tipounidadImplementableHome);
	}
	
	public void importarTipoUnidads() throws Exception {		
	
	}
	
	public void exportarTipoUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoUnidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoUnidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoUnidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoUnidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoUnidad(tipounidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipounidadAux.setsDetalleGeneralEntityReporte(tipounidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoUnidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoUnidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUnidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUnidadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUnidadConstantesFunciones.LABEL_SIGLAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoUnidad(TipoUnidad tipounidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipounidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipounidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipounidad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipounidad.getsiglas();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoUnidad(row);				
				iRow++;
			}				
			
			for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoUnidad(tipounidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoUnidadsSeleccionados() throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();		
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipounidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipounidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipounidad");
			//elementRoot.appendChild(element);
		
			for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
				element = document.createElement("tipounidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoUnidad(tipounidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoUnidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUnidadConstantesFunciones.LABEL_SIGLAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoUnidad(TipoUnidad tipounidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipounidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipounidad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipounidad.getsiglas());				
	}
	
	public void setFilaDatosExportarXmlTipoUnidad(TipoUnidad tipounidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoUnidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipounidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoUnidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipounidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoUnidadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipounidad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(TipoUnidadConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(tipounidad.getsiglas().trim()));
		element.appendChild(elementsiglas);
	}
	
	public void generarReporteGroupGenericoTipoUnidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoUnidad> tipounidadsSeleccionados=new ArrayList<TipoUnidad>();
		
		tipounidadsSeleccionados=this.getTipoUnidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoUnidad(tipounidadsSeleccionados);
		
		this.generarReporteTipoUnidads("Todos",tipounidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoUnidad(ArrayList<TipoUnidad> tipounidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoUnidad tipounidadAux:tipounidadsSeleccionados) {
				tipounidadAux.setsDetalleGeneralEntityReporte(tipounidadAux.toString());
			
				if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipounidadAux.setsDescripcionGeneralEntityReporte1(tipounidadAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoUnidadConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					tipounidadAux.setsDescripcionGeneralEntityReporte1(tipounidadAux.getsiglas());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoUnidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoUnidad=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=true;
				this.isVisibilidadCeldaGuardarCambiosTipoUnidad=true;
			}
			
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=true;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=true;
			this.isVisibilidadCeldaEliminarTipoUnidad=true;
			this.isVisibilidadCeldaCancelarTipoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=true;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=true;
			this.isVisibilidadCeldaModificarTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
			this.isVisibilidadCeldaModificarTipoUnidad=true;
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
			this.isVisibilidadCeldaCancelarTipoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUnidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoUnidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=true;
		} else {
			this.actualizarEstadoPanelsTipoUnidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoUnidad=false;
			//this.isVisibilidadCeldaVerFormTipoUnidad=false;
			this.isVisibilidadCeldaDuplicarTipoUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipounidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipounidadSessionBean.getEsGuardarRelacionado()) {
			if(!tipounidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;												
			}
			
			this.jButtonCerrarTipoUnidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoUnidad=false;
		}
		
		if(!this.permiteMantenimiento(this.tipounidad)) {
			this.isVisibilidadCeldaActualizarTipoUnidad=false;
			this.isVisibilidadCeldaEliminarTipoUnidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoUnidad() {
		this.isVisibilidadCeldaNuevoTipoUnidad=false;
		this.isVisibilidadCeldaGuardarCambiosTipoUnidad=false;
	}
	
	public void actualizarEstadoPanelsTipoUnidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoUnidad!=null) {
				this.jScrollPanelDatosEdicionTipoUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUnidad!=null) {
				this.jScrollPanelDatosTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUnidad!=null) {
				this.jPanelPaginacionTipoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
					this.jTabbedPaneBusquedasTipoUnidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUnidad!=null) {
				this.jTabbedPaneBusquedasTipoUnidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoUnidad!=null) {
				this.jPanelParametrosReportesTipoUnidad.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoUnidadParaUnidades() throws Exception {
		Boolean isPaginaPopupUnidad=false;

		try {

			if(this.tipounidadSessionBean==null) {
				this.tipounidadSessionBean=new TipoUnidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean==null) {
				this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean=new UnidadSessionBean();
			}

			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setsPathNavegacionActual(tipounidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UnidadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUnidad=this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUnidad(true);
			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUnidad(TipoUnidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setisBusquedaDesdeForeignKeySesionTipoUnidad(true);
			this.jInternalFrameDetalleFormTipoUnidad.unidadSessionBean.setlidTipoUnidadActual(this.idTipoUnidadActual);

			tipounidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoUnidad(true);
			tipounidadSessionBean.setlIdTipoUnidadActualForeignKey(this.idTipoUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoUnidadSessionBean tipounidadSessionBean=new TipoUnidadSessionBean();
		
		if(this.tipounidadSessionBean==null) {
			this.tipounidadSessionBean=new TipoUnidadSessionBean();
		}
		
		this.tipounidadSessionBean.setsUltimaBusquedaTipoUnidad(this.getsAccionBusqueda());
		this.tipounidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipounidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipounidadSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
			tipounidadSessionBean.setsiglas(this.getsiglasBusquedaPorSiglas());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoUnidadSessionBean tipounidadSessionBean=new TipoUnidadSessionBean();
		
		if(this.tipounidadSessionBean==null) {
			this.tipounidadSessionBean=new TipoUnidadSessionBean();
		}
		
		if(this.tipounidadSessionBean.getsUltimaBusquedaTipoUnidad()!=null&&!this.tipounidadSessionBean.getsUltimaBusquedaTipoUnidad().equals("")) {
			this.setsAccionBusqueda(tipounidadSessionBean.getsUltimaBusquedaTipoUnidad());
			this.setiNumeroPaginacion(tipounidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipounidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipounidadSessionBean.getnombre());
				tipounidadSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
				this.setsiglasBusquedaPorSiglas(tipounidadSessionBean.getsiglas());
				tipounidadSessionBean.setsiglas("");
			}
		}
		
		this.tipounidadSessionBean.setsUltimaBusquedaTipoUnidad("");
		this.tipounidadSessionBean.setiNumeroPaginacion(TipoUnidadConstantesFunciones.INUMEROPAGINACION);
		this.tipounidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoUnidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoUnidad() {
		this.updateBorderResaltarBusquedasFormularioTipoUnidad();
		this.updateVisibilidadBusquedasFormularioTipoUnidad();
		this.updateHabilitarBusquedasFormularioTipoUnidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoUnidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoUnidad.getComponents().length>0) {
	

		if(this.tipounidadConstantesFunciones.resaltarBusquedaPorNombreTipoUnidad!=null) {
			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorNombreTipoUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
				jPanel.setBorder(this.tipounidadConstantesFunciones.resaltarBusquedaPorNombreTipoUnidad);
			}
		}

		if(this.tipounidadConstantesFunciones.resaltarBusquedaPorSiglasTipoUnidad!=null) {
			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasTipoUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
				jPanel.setBorder(this.tipounidadConstantesFunciones.resaltarBusquedaPorSiglasTipoUnidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoUnidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorNombreTipoUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipounidadConstantesFunciones.mostrarBusquedaPorNombreTipoUnidad);
			if(!this.tipounidadConstantesFunciones.mostrarBusquedaPorNombreTipoUnidad && index>-1) {
				this.jTabbedPaneBusquedasTipoUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasTipoUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipounidadConstantesFunciones.mostrarBusquedaPorSiglasTipoUnidad);
			if(!this.tipounidadConstantesFunciones.mostrarBusquedaPorSiglasTipoUnidad && index>-1) {
				this.jTabbedPaneBusquedasTipoUnidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoUnidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorNombreTipoUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipounidadConstantesFunciones.activarBusquedaPorNombreTipoUnidad);
				this.jTabbedPaneBusquedasTipoUnidad.setEnabledAt(index,this.tipounidadConstantesFunciones.activarBusquedaPorNombreTipoUnidad);
			}

			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasTipoUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipounidadConstantesFunciones.activarBusquedaPorSiglasTipoUnidad);
				this.jTabbedPaneBusquedasTipoUnidad.setEnabledAt(index,this.tipounidadConstantesFunciones.activarBusquedaPorSiglasTipoUnidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoUnidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorNombreTipoUnidad);

			this.jTabbedPaneBusquedasTipoUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);

			this.tipounidadConstantesFunciones.setResaltarBusquedaPorNombreTipoUnidad(resaltar);

			jPanel.setBorder(this.tipounidadConstantesFunciones.resaltarBusquedaPorNombreTipoUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSiglas")) {
			index= this.jTabbedPaneBusquedasTipoUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasTipoUnidad);

			this.jTabbedPaneBusquedasTipoUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoUnidad.getComponent(index);

			this.tipounidadConstantesFunciones.setResaltarBusquedaPorSiglasTipoUnidad(resaltar);

			jPanel.setBorder(this.tipounidadConstantesFunciones.resaltarBusquedaPorSiglasTipoUnidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoUnidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoUnidad() throws Exception {

		if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoUnidad();
		this.updateVisibilidadResaltarControlesFormularioTipoUnidad();
		this.updateHabilitarResaltarControlesFormularioTipoUnidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipounidadConstantesFunciones.resaltaridTipoUnidad!=null && this.jInternalFrameDetalleFormTipoUnidad!=null) {this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setBorder(this.tipounidadConstantesFunciones.resaltaridTipoUnidad);}
		if(this.tipounidadConstantesFunciones.resaltarnombreTipoUnidad!=null && this.jInternalFrameDetalleFormTipoUnidad!=null) {this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setBorder(this.tipounidadConstantesFunciones.resaltarnombreTipoUnidad);}
		if(this.tipounidadConstantesFunciones.resaltarsiglasTipoUnidad!=null && this.jInternalFrameDetalleFormTipoUnidad!=null) {this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setBorder(this.tipounidadConstantesFunciones.resaltarsiglasTipoUnidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoUnidad() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
	
		//this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostraridTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jPanelidTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostraridTipoUnidad);
		//this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostrarnombreTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jPanelnombreTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostrarnombreTipoUnidad);
		//this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostrarsiglasTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jPanelsiglasTipoUnidad.setVisible(this.tipounidadConstantesFunciones.mostrarsiglasTipoUnidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoUnidad!=null) {
	
		this.jInternalFrameDetalleFormTipoUnidad.jTextFieldidTipoUnidad.setEnabled(this.tipounidadConstantesFunciones.activaridTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jTextFieldnombreTipoUnidad.setEnabled(this.tipounidadConstantesFunciones.activarnombreTipoUnidad);
		this.jInternalFrameDetalleFormTipoUnidad.jTextFieldsiglasTipoUnidad.setEnabled(this.tipounidadConstantesFunciones.activarsiglasTipoUnidad);
		}
	}
	
		
}