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

import com.bydan.erp.inventario.util.TipoDetalleMovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.TipoDetalleMovimientoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoDetalleMovimientoInventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoDetalleMovimientoInventarioBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDetalleMovimientoInventarioBeanSwingJInternalFrame extends TipoDetalleMovimientoInventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDetalleMovimientoInventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarioValidator = new ClassValidator<TipoDetalleMovimientoInventario>(TipoDetalleMovimientoInventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDetalleMovimientoInventario tipodetallemovimientoinventario;	
	public TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux;
	public TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDetalleMovimientoInventario tipodetallemovimientoinventarioTotales;
	public Long idTipoDetalleMovimientoInventarioActual;
	public Long iIdNuevoTipoDetalleMovimientoInventario=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleMovimientoInventario=false;

	public Boolean getIsTienePermisosDetalleMovimientoInventario() {
		return isTienePermisosDetalleMovimientoInventario;
	}

	public void setIsTienePermisosDetalleMovimientoInventario(Boolean isTienePermisosDetalleMovimientoInventario) {
		this.isTienePermisosDetalleMovimientoInventario= isTienePermisosDetalleMovimientoInventario;
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
	
	public Boolean isPermisoTodoTipoDetalleMovimientoInventario;
	public Boolean isPermisoNuevoTipoDetalleMovimientoInventario;
	public Boolean isPermisoActualizarTipoDetalleMovimientoInventario;
	public Boolean isPermisoActualizarOriginalTipoDetalleMovimientoInventario;
	public Boolean isPermisoEliminarTipoDetalleMovimientoInventario;
	public Boolean isPermisoGuardarCambiosTipoDetalleMovimientoInventario;
	public Boolean isPermisoConsultaTipoDetalleMovimientoInventario;
	public Boolean isPermisoBusquedaTipoDetalleMovimientoInventario;
	public Boolean isPermisoReporteTipoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionMedioTipoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionAltoTipoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionTodoTipoDetalleMovimientoInventario;
	public Boolean isPermisoCopiarTipoDetalleMovimientoInventario;
	public Boolean isPermisoVerFormTipoDetalleMovimientoInventario;
	public Boolean isPermisoDuplicarTipoDetalleMovimientoInventario;
	public Boolean isPermisoOrdenTipoDetalleMovimientoInventario;
	
	
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
	
	public TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioReturnGeneral;
	public TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioParameterGeneral;
	
	

	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic=null;

	public DetalleMovimientoInventarioLogic getDetalleMovimientoInventarioLogic() {
		return detallemovimientoinventarioLogic;
	}

	public void setDetalleMovimientoInventarioLogic(DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic) {
		this.detallemovimientoinventarioLogic = detallemovimientoinventarioLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDetalleMovimientoInventario=false;
	public Boolean esParaAccionDesdeFormularioTipoDetalleMovimientoInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDetalleMovimientoInventarioLogic tipodetallemovimientoinventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDetalleMovimientoInventario tipodetallemovimientoinventarioBean;
	public TipoDetalleMovimientoInventarioConstantesFunciones tipodetallemovimientoinventarioConstantesFunciones;
	//public TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios;	
	//public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosEliminados;
	//public List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;	
	
	
	
	public Long getiIdNuevoTipoDetalleMovimientoInventario() {
		return this.iIdNuevoTipoDetalleMovimientoInventario;
	}

	public void setiIdNuevoTipoDetalleMovimientoInventario(Long iIdNuevoTipoDetalleMovimientoInventario) {
		this.iIdNuevoTipoDetalleMovimientoInventario = iIdNuevoTipoDetalleMovimientoInventario;
	}
	
	public Long getidTipoDetalleMovimientoInventarioActual() {
		return this.idTipoDetalleMovimientoInventarioActual;
	}

	public void setidTipoDetalleMovimientoInventarioActual(Long idTipoDetalleMovimientoInventarioActual) {
		this.idTipoDetalleMovimientoInventarioActual = idTipoDetalleMovimientoInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDetalleMovimientoInventario gettipodetallemovimientoinventario() {
		return this.tipodetallemovimientoinventario;
	}

	public void settipodetallemovimientoinventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) {
		this.tipodetallemovimientoinventario = tipodetallemovimientoinventario;
	}
	
	public TipoDetalleMovimientoInventario gettipodetallemovimientoinventarioAux() {
		return this.tipodetallemovimientoinventarioAux;
	}

	public void settipodetallemovimientoinventarioAux(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux) {
		this.tipodetallemovimientoinventarioAux = tipodetallemovimientoinventarioAux;
	}				
	
	public TipoDetalleMovimientoInventario gettipodetallemovimientoinventarioAnterior() {
		return this.tipodetallemovimientoinventarioAnterior;
	}

	public void settipodetallemovimientoinventarioAnterior(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAnterior) {
		this.tipodetallemovimientoinventarioAnterior = tipodetallemovimientoinventarioAnterior;
	}	
	
	public TipoDetalleMovimientoInventario gettipodetallemovimientoinventarioTotales() {
		return this.tipodetallemovimientoinventarioTotales;
	}

	public void settipodetallemovimientoinventarioTotales(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioTotales) {
		this.tipodetallemovimientoinventarioTotales = tipodetallemovimientoinventarioTotales;
	}	
	
	public TipoDetalleMovimientoInventario gettipodetallemovimientoinventarioBean() {
		return this.tipodetallemovimientoinventarioBean;
	}

	public void settipodetallemovimientoinventarioBean(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioBean) {
		this.tipodetallemovimientoinventarioBean = tipodetallemovimientoinventarioBean;
	}	
	
	public TipoDetalleMovimientoInventarioParameterReturnGeneral gettipodetallemovimientoinventarioReturnGeneral() {
		return this.tipodetallemovimientoinventarioReturnGeneral;
	}

	public void settipodetallemovimientoinventarioReturnGeneral(TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioReturnGeneral) {
		this.tipodetallemovimientoinventarioReturnGeneral = tipodetallemovimientoinventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDetalleMovimientoInventarioLogic getTipoDetalleMovimientoInventarioLogic()	{		
		return tipodetallemovimientoinventarioLogic;
	}

	public void setTipoDetalleMovimientoInventarioLogic(TipoDetalleMovimientoInventarioLogic tipodetallemovimientoinventarioLogic) {
		this.tipodetallemovimientoinventarioLogic = tipodetallemovimientoinventarioLogic;
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
	
	public Boolean getIsEsNuevoTipoDetalleMovimientoInventario() {
		return isEsNuevoTipoDetalleMovimientoInventario;
	}

	public void setIsEsNuevoTipoDetalleMovimientoInventario(Boolean isEsNuevoTipoDetalleMovimientoInventario) {
		this.isEsNuevoTipoDetalleMovimientoInventario = isEsNuevoTipoDetalleMovimientoInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDetalleMovimientoInventario() {
		return esParaAccionDesdeFormularioTipoDetalleMovimientoInventario;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDetalleMovimientoInventario(Boolean esParaAccionDesdeFormularioTipoDetalleMovimientoInventario) {
		this.esParaAccionDesdeFormularioTipoDetalleMovimientoInventario = esParaAccionDesdeFormularioTipoDetalleMovimientoInventario;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoDetalleMovimientoInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDetalleMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDetalleMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(this.tipodetallemovimientoinventarios);
			tipodetallemovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDetalleMovimientoInventarioParameterReturnGeneral getTipoDetalleMovimientoInventarioParameterGeneral() {
		return this.tipodetallemovimientoinventarioParameterGeneral;
	}
	
	public void setTipoDetalleMovimientoInventarioParameterGeneral(TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioParameterGeneral) {
		this.tipodetallemovimientoinventarioParameterGeneral = tipodetallemovimientoinventarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDetalleMovimientoInventario() {
		return isPermisoTodoTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoTodoTipoDetalleMovimientoInventario(Boolean isPermisoTodoTipoDetalleMovimientoInventario) {
		this.isPermisoTodoTipoDetalleMovimientoInventario = isPermisoTodoTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoNuevoTipoDetalleMovimientoInventario() {
		return isPermisoNuevoTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoNuevoTipoDetalleMovimientoInventario(Boolean isPermisoNuevoTipoDetalleMovimientoInventario) {
		this.isPermisoNuevoTipoDetalleMovimientoInventario = isPermisoNuevoTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoActualizarTipoDetalleMovimientoInventario() {
		return isPermisoActualizarTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoActualizarTipoDetalleMovimientoInventario(Boolean isPermisoActualizarTipoDetalleMovimientoInventario) {
		this.isPermisoActualizarTipoDetalleMovimientoInventario = isPermisoActualizarTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoEliminarTipoDetalleMovimientoInventario() {
		return isPermisoEliminarTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoEliminarTipoDetalleMovimientoInventario(Boolean isPermisoEliminarTipoDetalleMovimientoInventario) {
		this.isPermisoEliminarTipoDetalleMovimientoInventario = isPermisoEliminarTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDetalleMovimientoInventario() {
		return isPermisoGuardarCambiosTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoGuardarCambiosTipoDetalleMovimientoInventario(Boolean isPermisoGuardarCambiosTipoDetalleMovimientoInventario) {
		this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario = isPermisoGuardarCambiosTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoConsultaTipoDetalleMovimientoInventario() {
		return isPermisoConsultaTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoConsultaTipoDetalleMovimientoInventario(Boolean isPermisoConsultaTipoDetalleMovimientoInventario) {
		this.isPermisoConsultaTipoDetalleMovimientoInventario = isPermisoConsultaTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoBusquedaTipoDetalleMovimientoInventario() {
		return isPermisoBusquedaTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoBusquedaTipoDetalleMovimientoInventario(Boolean isPermisoBusquedaTipoDetalleMovimientoInventario) {
		this.isPermisoBusquedaTipoDetalleMovimientoInventario = isPermisoBusquedaTipoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoReporteTipoDetalleMovimientoInventario() {
		return isPermisoReporteTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoReporteTipoDetalleMovimientoInventario(Boolean isPermisoReporteTipoDetalleMovimientoInventario) {
		this.isPermisoReporteTipoDetalleMovimientoInventario = isPermisoReporteTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDetalleMovimientoInventario() {
		return isPermisoPaginacionMedioTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionMedioTipoDetalleMovimientoInventario(Boolean isPermisoPaginacionMedioTipoDetalleMovimientoInventario) {
		this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario = isPermisoPaginacionMedioTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDetalleMovimientoInventario() {
		return isPermisoPaginacionTodoTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionTodoTipoDetalleMovimientoInventario(Boolean isPermisoPaginacionTodoTipoDetalleMovimientoInventario) {
		this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario = isPermisoPaginacionTodoTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDetalleMovimientoInventario() {
		return isPermisoPaginacionAltoTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionAltoTipoDetalleMovimientoInventario(Boolean isPermisoPaginacionAltoTipoDetalleMovimientoInventario) {
		this.isPermisoPaginacionAltoTipoDetalleMovimientoInventario = isPermisoPaginacionAltoTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoCopiarTipoDetalleMovimientoInventario() {
		return isPermisoCopiarTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoCopiarTipoDetalleMovimientoInventario(Boolean isPermisoCopiarTipoDetalleMovimientoInventario) {
		this.isPermisoCopiarTipoDetalleMovimientoInventario = isPermisoCopiarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoVerFormTipoDetalleMovimientoInventario() {
		return isPermisoVerFormTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoVerFormTipoDetalleMovimientoInventario(Boolean isPermisoVerFormTipoDetalleMovimientoInventario) {
		this.isPermisoVerFormTipoDetalleMovimientoInventario = isPermisoVerFormTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoDuplicarTipoDetalleMovimientoInventario() {
		return isPermisoDuplicarTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoDuplicarTipoDetalleMovimientoInventario(Boolean isPermisoDuplicarTipoDetalleMovimientoInventario) {
		this.isPermisoDuplicarTipoDetalleMovimientoInventario = isPermisoDuplicarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoOrdenTipoDetalleMovimientoInventario() {
		return isPermisoOrdenTipoDetalleMovimientoInventario;
	}

	public void setIsPermisoOrdenTipoDetalleMovimientoInventario(Boolean isPermisoOrdenTipoDetalleMovimientoInventario) {
		this.isPermisoOrdenTipoDetalleMovimientoInventario = isPermisoOrdenTipoDetalleMovimientoInventario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario = isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario = isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCopiarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario = isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaVerFormTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario = isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaOrdenTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario = isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario = isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaModificarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaModificarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaModificarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario = isVisibilidadCeldaModificarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaActualizarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario = isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaEliminarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario = isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCancelarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario = isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario = isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario() {
		return isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario(Boolean isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario = isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario;
	}
		
	public TipoDetalleMovimientoInventarioSessionBean gettipodetallemovimientoinventarioSessionBean() {
		return this.tipodetallemovimientoinventarioSessionBean;
	}
	
	public void settipodetallemovimientoinventarioSessionBean(TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean) {
		this.tipodetallemovimientoinventarioSessionBean=tipodetallemovimientoinventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDetalleMovimientoInventario(tipodetallemovimientoinventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodetallemovimientoinventarioAux.setId(tipodetallemovimientoinventario.getId());
		tipodetallemovimientoinventarioAux.setVersionRow(tipodetallemovimientoinventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDetalleMovimientoInventario();
		
			int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodetallemovimientoinventarioValidator.getInvalidValues(this.tipodetallemovimientoinventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodetallemovimientoinventarioLogic.setDatosCliente(datosCliente);
			tipodetallemovimientoinventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodetallemovimientoinventarioAux=new  TipoDetalleMovimientoInventario();
				
				tipodetallemovimientoinventarioAux.setIsNew(true);
				tipodetallemovimientoinventarioAux.setIsChanged(true);
				
				tipodetallemovimientoinventarioAux.setTipoDetalleMovimientoInventarioOriginal(this.tipodetallemovimientoinventario);
				
				tipodetallemovimientoinventarioAux.setId(this.tipodetallemovimientoinventario.getId());	
				tipodetallemovimientoinventarioAux.setVersionRow(this.tipodetallemovimientoinventario.getVersionRow());	
				tipodetallemovimientoinventarioAux.setcodigo(this.tipodetallemovimientoinventario.getcodigo());	
				tipodetallemovimientoinventarioAux.setnombre(this.tipodetallemovimientoinventario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetallemovimientoinventarioLogic.saveTipoDetalleMovimientoInventarios();//WithConnection
						//tipodetallemovimientoinventarioLogic.getSetVersionRowTipoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetallemovimientoinventario,tipodetallemovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodetallemovimientoinventarioAux=new  TipoDetalleMovimientoInventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.tipodetallemovimientoinventario.getId()>=0)) {
						
					tipodetallemovimientoinventarioAux.setIsNew(false);
				}
				
				tipodetallemovimientoinventarioAux.setIsDeleted(false);
			
				tipodetallemovimientoinventarioAux.setId(this.tipodetallemovimientoinventario.getId());	
				tipodetallemovimientoinventarioAux.setVersionRow(this.tipodetallemovimientoinventario.getVersionRow());	
				tipodetallemovimientoinventarioAux.setcodigo(this.tipodetallemovimientoinventario.getcodigo());	
				tipodetallemovimientoinventarioAux.setnombre(this.tipodetallemovimientoinventario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetallemovimientoinventarioLogic.saveTipoDetalleMovimientoInventarios();//WithConnection
						//tipodetallemovimientoinventarioLogic.getSetVersionRowTipoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetallemovimientoinventario,tipodetallemovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodetallemovimientoinventarioAux=new  TipoDetalleMovimientoInventario();
				
				tipodetallemovimientoinventarioAux.setIsNew(false);
				tipodetallemovimientoinventarioAux.setIsChanged(false);
				
				tipodetallemovimientoinventarioAux.setIsDeleted(true);
				
				tipodetallemovimientoinventarioAux.setId(this.tipodetallemovimientoinventario.getId());	
				tipodetallemovimientoinventarioAux.setVersionRow(this.tipodetallemovimientoinventario.getVersionRow());	
				tipodetallemovimientoinventarioAux.setcodigo(this.tipodetallemovimientoinventario.getcodigo());	
				tipodetallemovimientoinventarioAux.setnombre(this.tipodetallemovimientoinventario.getnombre());	
				
				if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodetallemovimientoinventarioAux.getId()>=0) {	
						this.tipodetallemovimientoinventariosEliminados.add(tipodetallemovimientoinventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetallemovimientoinventarioLogic.saveTipoDetalleMovimientoInventarios();//WithConnection
						//tipodetallemovimientoinventarioLogic.getSetVersionRowTipoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodetallemovimientoinventarioAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodetallemovimientoinventarioAux,tipodetallemovimientoinventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().addAll(this.tipodetallemovimientoinventariosEliminados);
					
					tipodetallemovimientoinventarioLogic.saveTipoDetalleMovimientoInventarios();//WithConnection
					//tipodetallemovimientoinventarioLogic.getSetVersionRowTipoDetalleMovimientoInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipodetallemovimientoinventariosEliminados= new ArrayList<TipoDetalleMovimientoInventario>();		
			}
			
			if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodetallemovimientoinventario=tipodetallemovimientoinventarioAux;
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
      		//this.finishProcessTipoDetalleMovimientoInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal) throws Exception {
		
		if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodetallemovimientoinventarioLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
			
			} else {
			
				tipodetallemovimientoinventarioLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal) throws Exception {	
		if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoDetalleMovimientoInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodetallemovimientoinventarioValidator.getInvalidValues(this.tipodetallemovimientoinventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios) throws Exception {
		try	{		
			TipoDetalleMovimientoInventarioConstantesFunciones.actualizarLista(tipodetallemovimientoinventario,tipodetallemovimientoinventarios,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios) throws Exception {
		try	{			
			TipoDetalleMovimientoInventarioConstantesFunciones.actualizarSelectedLista(tipodetallemovimientoinventario,tipodetallemovimientoinventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodetallemovimientoinventariosLocal=this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodetallemovimientoinventariosLocal=this.tipodetallemovimientoinventarios;
			}
			//ARCHITECTURE
		
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal:tipodetallemovimientoinventariosLocal) {
				if(this.permiteMantenimiento(tipodetallemovimientoinventarioLocal) && tipodetallemovimientoinventarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDetalleMovimientoInventarioConstantesFunciones.getTipoDetalleMovimientoInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDetalleMovimientoInventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelcodigoTipoDetalleMovimientoInventario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetalleMovimientoInventarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelnombreTipoDetalleMovimientoInventario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelcodigoTipoDetalleMovimientoInventario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelnombreTipoDetalleMovimientoInventario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleMovimientoInventario")) {
			if(this.tipodetallemovimientoinventario==null) {
				this.tipodetallemovimientoinventario= new TipoDetalleMovimientoInventario();
			}

			if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDetalleMovimientoInventario
				this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);

				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getdetallemovimientoinventario().setTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDetalleMovimientoInventario--;	
		
		
		this.tipodetallemovimientoinventarioAux=new TipoDetalleMovimientoInventario();
		
		this.tipodetallemovimientoinventarioAux.setId(this.iIdNuevoTipoDetalleMovimientoInventario);
		this.tipodetallemovimientoinventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().add(this.tipodetallemovimientoinventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodetallemovimientoinventarios.add(this.tipodetallemovimientoinventarioAux);
		}
		//ARCHITECTURE
		
		this.tipodetallemovimientoinventario=this.tipodetallemovimientoinventarioAux;
		
		if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
		}
				
		//this.setDefaultControlesTipoDetalleMovimientoInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDetalleMovimientoInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDetalleMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleMovimientoInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioBean,this.tipodetallemovimientoinventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			classes=TipoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfTipoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodetallemovimientoinventarioReturnGeneral=tipodetallemovimientoinventarioLogic.procesarEventosTipoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),this.tipodetallemovimientoinventario,this.tipodetallemovimientoinventarioParameterGeneral,this.isEsNuevoTipoDetalleMovimientoInventario,classes);//this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral,this.tipodetallemovimientoinventarioBean,false);
		
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario());
		}
		
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario(),classes);//this.tipodetallemovimientoinventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDetalleMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDetalleMovimientoInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
						
			if(tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();
			}
			
			this.actualizarVisualTableDatosTipoDetalleMovimientoInventario();
			
			this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleMovimientoInventario(), this.getIndiceNuevoTipoDetalleMovimientoInventario());
			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
						
			this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setEnabled(isHabilitar && this.tipodetallemovimientoinventarioConstantesFunciones.activarcodigoTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setEnabled(isHabilitar && this.tipodetallemovimientoinventarioConstantesFunciones.activarnombreTipoDetalleMovimientoInventario);	
		
	};
	
	public void setDefaultControlesTipoDetalleMovimientoInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDetalleMovimientoInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(true);			
			this.tipodetallemovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);			
			this.tipodetallemovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDetalleMovimientoInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				if(tipodetallemovimientoinventarioAux.getId().equals(this.iIdNuevoTipoDetalleMovimientoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarios) {
				if(tipodetallemovimientoinventarioAux.getId().equals(this.iIdNuevoTipoDetalleMovimientoInventario)) {
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
	
	public int getIndiceActualTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				if(tipodetallemovimientoinventarioAux.getId().equals(tipodetallemovimientoinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarios) {
				if(tipodetallemovimientoinventarioAux.getId().equals(tipodetallemovimientoinventario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				if(tipodetallemovimientoinventarioAux.getTipoDetalleMovimientoInventarioOriginal().getId().equals(tipodetallemovimientoinventarioOriginal.getId())) {
					existe=true;
					tipodetallemovimientoinventarioOriginal.setId(tipodetallemovimientoinventarioAux.getId());
					tipodetallemovimientoinventarioOriginal.setVersionRow(tipodetallemovimientoinventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarios) {
				if(tipodetallemovimientoinventarioAux.getTipoDetalleMovimientoInventarioOriginal().getId().equals(tipodetallemovimientoinventarioOriginal.getId())) {
					existe=true;
					tipodetallemovimientoinventarioOriginal.setId(tipodetallemovimientoinventarioAux.getId());
					tipodetallemovimientoinventarioOriginal.setVersionRow(tipodetallemovimientoinventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDetalleMovimientoInventario(Boolean esParaCancelar) throws Exception {
		tipodetallemovimientoinventariosAux=new ArrayList<TipoDetalleMovimientoInventario>();
		tipodetallemovimientoinventarioAux=new TipoDetalleMovimientoInventario();
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
					if(tipodetallemovimientoinventarioAux.getId()<0) {
						tipodetallemovimientoinventariosAux.add(tipodetallemovimientoinventarioAux);
					}		
				}
				this.iIdNuevoTipoDetalleMovimientoInventario=0L;
				this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().removeAll(tipodetallemovimientoinventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarios) {
					if(tipodetallemovimientoinventarioAux.getId()<0) {
						tipodetallemovimientoinventariosAux.add(tipodetallemovimientoinventarioAux);
					}		
				}
				this.iIdNuevoTipoDetalleMovimientoInventario=0L;
				this.tipodetallemovimientoinventarios.removeAll(tipodetallemovimientoinventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDetalleMovimientoInventario 
					&& this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size()>0
					) {
					tipodetallemovimientoinventarioAux=this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().get(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size() - 1);
				
					if(tipodetallemovimientoinventarioAux.getId()<0) {
						this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().remove(tipodetallemovimientoinventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDetalleMovimientoInventario && this.tipodetallemovimientoinventarios.size()>0) {
					tipodetallemovimientoinventarioAux=this.tipodetallemovimientoinventarios.get(this.tipodetallemovimientoinventarios.size() - 1);
				
					if(tipodetallemovimientoinventarioAux.getId()<0) {
						this.tipodetallemovimientoinventarios.remove(tipodetallemovimientoinventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDetalleMovimientoInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodetallemovimientoinventario.getId()<0) {
				this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().remove(this.tipodetallemovimientoinventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodetallemovimientoinventario.getId()<0) {
				this.tipodetallemovimientoinventarios.remove(this.tipodetallemovimientoinventario);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDetalleMovimientoInventario(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosAux) throws Exception {
		TipoDetalleMovimientoInventarioConstantesFunciones.setEstadosInicialesTipoDetalleMovimientoInventario(tipodetallemovimientoinventariosAux);
	}
	
	public void setEstadosInicialesTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux) throws Exception {
		TipoDetalleMovimientoInventarioConstantesFunciones.setEstadosInicialesTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDetalleMovimientoInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDetalleMovimientoInventarioActual()) {
				if(!this.isEsNuevoTipoDetalleMovimientoInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDetalleMovimientoInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDetalleMovimientoInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costo ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) throws Exception {
		TipoDetalleMovimientoInventarioConstantesFunciones.seleccionarAsignar(this.tipodetallemovimientoinventario,tipodetallemovimientoinventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDetalleMovimientoInventario=this.isPermisoActualizarOriginalTipoDetalleMovimientoInventario;
			
			
			this.seleccionarAsignar(tipodetallemovimientoinventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetalleMovimientoInventarioConstantesFunciones.quitarEspaciosTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodetallemovimientoinventarioSessionBean.setsFuncionBusquedaRapida(this.tipodetallemovimientoinventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDetalleMovimientoInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDetalleMovimientoInventario(esParaCancelar);				
				this.cancelarNuevoTipoDetalleMovimientoInventario(esParaCancelar);								
			}
			
			this.tipodetallemovimientoinventario=new TipoDetalleMovimientoInventario();
			
			this.inicializarTipoDetalleMovimientoInventario();
			
			this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDetalleMovimientoInventario() throws Exception {
		try {
			TipoDetalleMovimientoInventarioConstantesFunciones.inicializarTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDetalleMovimientoInventarios(String sAccionBusqueda,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDetalleMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDetalleMovimientoInventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDetalleMovimientoInventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDetalleMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costos");		
		parameters.put("busquedapor", TipoDetalleMovimientoInventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleMovimientoInventario.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDetalleMovimientoInventarioLogic tipodetallemovimientoinventarioLogicAuxiliar=new TipoDetalleMovimientoInventarioLogic();
					tipodetallemovimientoinventarioLogicAuxiliar.setDatosCliente(tipodetallemovimientoinventarioLogic.getDatosCliente());				
					tipodetallemovimientoinventarioLogicAuxiliar.setTipoDetalleMovimientoInventarios(tipodetallemovimientoinventariosParaReportes);
					
					tipodetallemovimientoinventarioLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDetalleMovimientoInventarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodetallemovimientoinventariosParaReportes=tipodetallemovimientoinventarioLogicAuxiliar.getTipoDetalleMovimientoInventarios();
					
					//tipodetallemovimientoinventarioLogic.getNewConnexionToDeep();
					
					//for (TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventariosParaReportes) {
					//	tipodetallemovimientoinventarioLogic.deepLoad(tipodetallemovimientoinventario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleMovimientoInventario = AuxiliarReportes.class.getResourceAsStream("DetalleMovimientoInventarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallemovimientoinventario", reportFileDetalleMovimientoInventario);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDetalleMovimientoInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDetalleMovimientoInventario=new JRBeanArrayDataSource(TipoDetalleMovimientoInventarioJInternalFrame.TraerTipoDetalleMovimientoInventarioBeans(tipodetallemovimientoinventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDetalleMovimientoInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDetalleMovimientoInventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDetalleMovimientoInventarioBean.TraerTipoDetalleMovimientoInventarioBeans(tipodetallemovimientoinventariosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(null);
					//this.generarExcelReporteTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,tipodetallemovimientoinventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetalleMovimientoInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario : tipodetallemovimientoinventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataTipoDetalleMovimientoInventario("NORMAL",row,workbook,tipodetallemovimientoinventario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDetalleMovimientoInventario(String sTipo,Row row,Workbook workbook) {
		
		TipoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderTipoDetalleMovimientoInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario : tipodetallemovimientoinventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.getTipoDetalleMovimientoInventarioDescripcion(tipodetallemovimientoinventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetallemovimientoinventario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetallemovimientoinventario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosRespaldo=null;
		
		classes=TipoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfTipoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodetallemovimientoinventarioLogic.setDatosCliente(this.datosCliente);
		this.tipodetallemovimientoinventarioLogic.setDatosDeep(this.datosDeep);
		this.tipodetallemovimientoinventarioLogic.setIsConDeep(true);
		
		tipodetallemovimientoinventariosRespaldo=this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios();
		
		this.tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(tipodetallemovimientoinventariosParaReportes);	
		this.tipodetallemovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodetallemovimientoinventariosParaReportes=this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios();
		this.tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(tipodetallemovimientoinventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetalleMovimientoInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario : tipodetallemovimientoinventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDetalleMovimientoInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataTipoDetalleMovimientoInventario("NORMAL",row,workbook,tipodetallemovimientoinventario,cellStyleDataAux);
		
			
			


				//DetalleMovimientoInventario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null && tipodetallemovimientoinventario.getDetalleMovimientoInventarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderDetalleMovimientoInventario("RELACIONADO",row,workbook);
				}

				if(tipodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null) {
					i2=0;
					for(DetalleMovimientoInventario detallemovimientoinventario : tipodetallemovimientoinventario.getDetalleMovimientoInventarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataDetalleMovimientoInventario("RELACIONADO",row,workbook,detallemovimientoinventario,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.getTipoDetalleMovimientoInventarioDescripcion(tipodetallemovimientoinventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDetalleMovimientoInventario() throws Exception {		
		this.startProcessTipoDetalleMovimientoInventario(true);
	}
	
	public void startProcessTipoDetalleMovimientoInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoDetalleMovimientoInventario, this.jScrollPanelDatosTipoDetalleMovimientoInventario,this.jPanelPaginacionTipoDetalleMovimientoInventario, this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario, this.jPanelAccionesTipoDetalleMovimientoInventario,this.jPanelAccionesFormularioTipoDetalleMovimientoInventario,this.jmenuBarTipoDetalleMovimientoInventario,this.jmenuBarDetalleTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetalleMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesTipoDetalleMovimientoInventario=this.jPanelParametrosReportesTipoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosTipoDetalleMovimientoInventario=this.jScrollPanelDatosTipoDetalleMovimientoInventario;
		final JTable jTableDatosTipoDetalleMovimientoInventario=this.jTableDatosTipoDetalleMovimientoInventario;		
		final JPanel jPanelPaginacionTipoDetalleMovimientoInventario=this.jPanelPaginacionTipoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetalleMovimientoInventario=this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario;
		final JPanel jPanelAccionesTipoDetalleMovimientoInventario=this.jPanelAccionesTipoDetalleMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarTipoDetalleMovimientoInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			jPanelCamposAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelCamposTipoDetalleMovimientoInventario;
			jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelAccionesFormularioTipoDetalleMovimientoInventario;
		}
		
		final JPanel jPanelCamposTipoDetalleMovimientoInventario=jPanelCamposAuxiliarTipoDetalleMovimientoInventario;
		final JPanel jPanelAccionesFormularioTipoDetalleMovimientoInventario=jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario;
		
		
		final JMenuBar jmenuBarTipoDetalleMovimientoInventario=this.jmenuBarTipoDetalleMovimientoInventario;
		final JToolBar jTtoolBarTipoDetalleMovimientoInventario=this.jTtoolBarTipoDetalleMovimientoInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jmenuBarDetalleTipoDetalleMovimientoInventario;
			jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTtoolBarDetalleTipoDetalleMovimientoInventario;
		}
		
		final JMenuBar jmenuBarDetalleTipoDetalleMovimientoInventario=jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario;
		final JToolBar jTtoolBarDetalleTipoDetalleMovimientoInventario=jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetalleMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetalleMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosTipoDetalleMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposTipoDetalleMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetalleMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetalleMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetalleMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetalleMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetalleMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarTipoDetalleMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetalleMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetalleMovimientoInventario ,jPanelParametrosReportesTipoDetalleMovimientoInventario,jTableDatosTipoDetalleMovimientoInventario, /*jScrollPanelDatosTipoDetalleMovimientoInventario,*/jPanelCamposTipoDetalleMovimientoInventario,jPanelPaginacionTipoDetalleMovimientoInventario, /*jScrollPanelDatosEdicionTipoDetalleMovimientoInventario,*/ jPanelAccionesTipoDetalleMovimientoInventario,jPanelAccionesFormularioTipoDetalleMovimientoInventario,jmenuBarTipoDetalleMovimientoInventario,jmenuBarDetalleTipoDetalleMovimientoInventario,jTtoolBarTipoDetalleMovimientoInventario,jTtoolBarDetalleTipoDetalleMovimientoInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoDetalleMovimientoInventario, jScrollPanelDatosTipoDetalleMovimientoInventario,jPanelPaginacionTipoDetalleMovimientoInventario, jScrollPanelDatosEdicionTipoDetalleMovimientoInventario, jPanelAccionesTipoDetalleMovimientoInventario,jPanelAccionesFormularioTipoDetalleMovimientoInventario,jmenuBarTipoDetalleMovimientoInventario,jmenuBarDetalleTipoDetalleMovimientoInventario,jTtoolBarTipoDetalleMovimientoInventario,jTtoolBarDetalleTipoDetalleMovimientoInventario);
						
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
	
	public void finishProcessTipoDetalleMovimientoInventario() {// throws Exception 
		this.finishProcessTipoDetalleMovimientoInventario(true);
	}
	
	public void finishProcessTipoDetalleMovimientoInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoDetalleMovimientoInventario, this.jScrollPanelDatosTipoDetalleMovimientoInventario,this.jPanelPaginacionTipoDetalleMovimientoInventario, this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario, this.jPanelAccionesTipoDetalleMovimientoInventario,this.jPanelAccionesFormularioTipoDetalleMovimientoInventario,this.jmenuBarTipoDetalleMovimientoInventario,this.jmenuBarDetalleTipoDetalleMovimientoInventario,this.jTtoolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetalleMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesTipoDetalleMovimientoInventario=this.jPanelParametrosReportesTipoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosTipoDetalleMovimientoInventario=this.jScrollPanelDatosTipoDetalleMovimientoInventario;
		final JTable jTableDatosTipoDetalleMovimientoInventario=this.jTableDatosTipoDetalleMovimientoInventario;		
		final JPanel jPanelPaginacionTipoDetalleMovimientoInventario=this.jPanelPaginacionTipoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetalleMovimientoInventario=this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario;
		final JPanel jPanelAccionesTipoDetalleMovimientoInventario=this.jPanelAccionesTipoDetalleMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarTipoDetalleMovimientoInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			jPanelCamposAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelCamposTipoDetalleMovimientoInventario;
			jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelAccionesFormularioTipoDetalleMovimientoInventario;
		}
		
		final JPanel jPanelCamposTipoDetalleMovimientoInventario=jPanelCamposAuxiliarTipoDetalleMovimientoInventario;
		final JPanel jPanelAccionesFormularioTipoDetalleMovimientoInventario=jPanelAccionesFormularioAuxiliarTipoDetalleMovimientoInventario;
		
		
		final JMenuBar jmenuBarTipoDetalleMovimientoInventario=this.jmenuBarTipoDetalleMovimientoInventario;		
		final JToolBar jTtoolBarTipoDetalleMovimientoInventario=this.jTtoolBarTipoDetalleMovimientoInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jmenuBarDetalleTipoDetalleMovimientoInventario;
			jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTtoolBarDetalleTipoDetalleMovimientoInventario;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDetalleMovimientoInventario=jmenuBarDetalleAuxiliarTipoDetalleMovimientoInventario;
		final JToolBar jTtoolBarDetalleTipoDetalleMovimientoInventario=jTtoolBarDetalleAuxiliarTipoDetalleMovimientoInventario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetalleMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetalleMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosTipoDetalleMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposTipoDetalleMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetalleMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetalleMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetalleMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetalleMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetalleMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarTipoDetalleMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetalleMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDetalleMovimientoInventario ,jPanelParametrosReportesTipoDetalleMovimientoInventario, jTableDatosTipoDetalleMovimientoInventario,/*jScrollPanelDatosTipoDetalleMovimientoInventario,*/jPanelCamposTipoDetalleMovimientoInventario,jPanelPaginacionTipoDetalleMovimientoInventario, /*jScrollPanelDatosEdicionTipoDetalleMovimientoInventario,*/ jPanelAccionesTipoDetalleMovimientoInventario,jPanelAccionesFormularioTipoDetalleMovimientoInventario,jmenuBarTipoDetalleMovimientoInventario,jmenuBarDetalleTipoDetalleMovimientoInventario,jTtoolBarTipoDetalleMovimientoInventario,jTtoolBarDetalleTipoDetalleMovimientoInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDetalleMovimientoInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDetalleMovimientoInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDetalleMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDetalleMovimientoInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDetalleMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDetalleMovimientoInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodetallemovimientoinventarioConstantesFunciones.getsFinalQueryTipoDetalleMovimientoInventario();
		String  finalQueryPaginacionTodos=this.tipodetallemovimientoinventarioConstantesFunciones.getsFinalQueryTipoDetalleMovimientoInventario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesNoTipoDetalleMovimientoInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesTipoDetalleMovimientoInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDetalleMovimientoInventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodetallemovimientoinventariosEliminados= new ArrayList<TipoDetalleMovimientoInventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDetalleMovimientoInventario();
		
				///*TipoDetalleMovimientoInventarioSessionBean*/this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
			
			if(this.tipodetallemovimientoinventarioSessionBean==null) {
				this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
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
					this.iNumeroPaginacion=TipoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDetalleMovimientoInventarioConstantesFunciones.getClassesForeignKeysOfTipoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodetallemovimientoinventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodetallemovimientoinventariosAux= new ArrayList<TipoDetalleMovimientoInventario>();
			
				
			tipodetallemovimientoinventarioLogic.setDatosCliente(this.datosCliente);
			tipodetallemovimientoinventarioLogic.setDatosDeep(this.datosDeep);
			tipodetallemovimientoinventarioLogic.setIsConDeep(true);
			
			
			tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodetallemovimientoinventarioLogic.getTodosTipoDetalleMovimientoInventarios(finalQueryGlobal,pagination);
					
					//tipodetallemovimientoinventarioLogic.getTodosTipoDetalleMovimientoInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()==null|| tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetallemovimientoinventariosAux= new ArrayList<TipoDetalleMovimientoInventario>();
							tipodetallemovimientoinventariosAux.addAll(tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetallemovimientoinventariosAux= new ArrayList<TipoDetalleMovimientoInventario>();
							tipodetallemovimientoinventariosAux.addAll(tipodetallemovimientoinventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetallemovimientoinventarioLogic.getTodosTipoDetalleMovimientoInventarios(finalQueryGlobal+"",this.pagination);												
							
							//tipodetallemovimientoinventarioLogic.getTodosTipoDetalleMovimientoInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(new ArrayList<TipoDetalleMovimientoInventario>());					
							tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().addAll(tipodetallemovimientoinventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetallemovimientoinventarios=new ArrayList<TipoDetalleMovimientoInventario>();
							tipodetallemovimientoinventarios.addAll(tipodetallemovimientoinventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDetalleMovimientoInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDetalleMovimientoInventario=this.idActual;
				
				} else if(this.idTipoDetalleMovimientoInventarioActual!=null && this.idTipoDetalleMovimientoInventarioActual!=0L) {
					idTipoDetalleMovimientoInventario=idTipoDetalleMovimientoInventarioActual;
				}
				
					
				this.sDetalleReporte=TipoDetalleMovimientoInventarioConstantesFunciones.getDetalleIndicePorId(idTipoDetalleMovimientoInventario);
				
				this.tipodetallemovimientoinventarios=new ArrayList<TipoDetalleMovimientoInventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodetallemovimientoinventarioLogic.getEntity(idTipoDetalleMovimientoInventario);
					
					//tipodetallemovimientoinventarioLogic.getEntityWithConnection(idTipoDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(new ArrayList<TipoDetalleMovimientoInventario>());
					tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().add(tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetallemovimientoinventarios=new ArrayList<TipoDetalleMovimientoInventario>();
					this.tipodetallemovimientoinventarios.add(tipodetallemovimientoinventario);
				}
				
				if(tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDetalleMovimientoInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDetalleMovimientoInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetallemovimientoinventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetallemovimientoinventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) {
		Boolean permite=true;
		
		if(this.tipodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDetalleMovimientoInventarioConstantesFunciones.getOrderByListaTipoDetalleMovimientoInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDetalleMovimientoInventarioConstantesFunciones.getOrderByListaTipoDetalleMovimientoInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				if(tipodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetallemovimientoinventarioTotales=tipodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:this.tipodetallemovimientoinventarios) {
				if(tipodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetallemovimientoinventarioTotales=tipodetallemovimientoinventario;
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
			this.tipodetallemovimientoinventarioAux=new TipoDetalleMovimientoInventario();
			this.tipodetallemovimientoinventarioAux.setsType(Constantes2.S_TOTALES);
			this.tipodetallemovimientoinventarioAux.setIsNew(false);
			this.tipodetallemovimientoinventarioAux.setIsChanged(false);
			this.tipodetallemovimientoinventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),this.tipodetallemovimientoinventarioAux);
				
				this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().add(this.tipodetallemovimientoinventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarios,this.tipodetallemovimientoinventarioAux);
				
				this.tipodetallemovimientoinventarios.add(this.tipodetallemovimientoinventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodetallemovimientoinventarioTotales=new TipoDetalleMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().remove(tipodetallemovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetallemovimientoinventarios.remove(tipodetallemovimientoinventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodetallemovimientoinventarioTotales=new TipoDetalleMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				if(tipodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetallemovimientoinventarioTotales=tipodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),tipodetallemovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:this.tipodetallemovimientoinventarios) {
				if(tipodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetallemovimientoinventarioTotales=tipodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarios,tipodetallemovimientoinventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoDetalleMovimientoInventario() {
		this.isPermisoTodoTipoDetalleMovimientoInventario=false;
		this.isPermisoNuevoTipoDetalleMovimientoInventario=false;
		this.isPermisoActualizarTipoDetalleMovimientoInventario=false;
		this.isPermisoActualizarOriginalTipoDetalleMovimientoInventario=false;
		this.isPermisoEliminarTipoDetalleMovimientoInventario=false;
		this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario=false;
		this.isPermisoConsultaTipoDetalleMovimientoInventario=false;
		this.isPermisoBusquedaTipoDetalleMovimientoInventario=false;
		this.isPermisoReporteTipoDetalleMovimientoInventario=false;		
		this.isPermisoOrdenTipoDetalleMovimientoInventario=false;		
		this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario=false;		
		this.isPermisoPaginacionAltoTipoDetalleMovimientoInventario=false;
		this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario=false;
		this.isPermisoCopiarTipoDetalleMovimientoInventario=false;		
		this.isPermisoVerFormTipoDetalleMovimientoInventario=false;		
		this.isPermisoDuplicarTipoDetalleMovimientoInventario=false;		
		this.isPermisoOrdenTipoDetalleMovimientoInventario=false;		
	}
	
	public void setPermisosUsuarioTipoDetalleMovimientoInventario(Boolean isPermiso) {
		this.isPermisoTodoTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoNuevoTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoEliminarTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoConsultaTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoBusquedaTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoReporteTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoOrdenTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionAltoTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoCopiarTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoVerFormTipoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoDuplicarTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoOrdenTipoDetalleMovimientoInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDetalleMovimientoInventario(Boolean isPermiso) {
		//this.isPermisoTodoTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoNuevoTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoEliminarTipoDetalleMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoConsultaTipoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoBusquedaTipoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoReporteTipoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoOrdenTipoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoCopiarTipoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoDuplicarTipoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoOrdenTipoDetalleMovimientoInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetalleMovimientoInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleMovimientoInventario=false;
		this.isTienePermisosDetalleMovimientoInventario=this.verificarGetPermisosUsuarioOpcionTipoDetalleMovimientoInventarioClaseRelacionada(this.opcionsRelacionadas,DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDetalleMovimientoInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetalleMovimientoInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleMovimientoInventario=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDetalleMovimientoInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDetalleMovimientoInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDetalleMovimientoInventarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleMovimientoInventario && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.remove(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDetalleMovimientoInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDetalleMovimientoInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDetalleMovimientoInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDetalleMovimientoInventario=this.isPermisoActualizarTipoDetalleMovimientoInventario;
			this.isPermisoEliminarTipoDetalleMovimientoInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDetalleMovimientoInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDetalleMovimientoInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDetalleMovimientoInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDetalleMovimientoInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetalleMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDetalleMovimientoInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDetalleMovimientoInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDetalleMovimientoInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetalleMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDetalleMovimientoInventario.setToolTipText(this.jTableDatosTipoDetalleMovimientoInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDetalleMovimientoInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDetalleMovimientoInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDetalleMovimientoInventario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleMovimientoInventario && this.tipodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioTipoDetalleMovimientoInventario && !TipoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Movimiento Inventario");
			reporte.setsDescripcion("Detalle Movimiento Inventario");
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
	
		
	public void inicializarCombosForeignKeyTipoDetalleMovimientoInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDetalleMovimientoInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDetalleMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoDetalleMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDetalleMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDetalleMovimientoInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleMovimientoInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDetalleMovimientoInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleMovimientoInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDetalleMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDetalleMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDetalleMovimientoInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDetalleMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDetalleMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDetalleMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean(); 
		this.tipodetallemovimientoinventarioConstantesFunciones=new TipoDetalleMovimientoInventarioConstantesFunciones(); 
		this.tipodetallemovimientoinventarioBean=new TipoDetalleMovimientoInventario();//(this.tipodetallemovimientoinventarioConstantesFunciones); 		
		this.tipodetallemovimientoinventarioReturnGeneral=new TipoDetalleMovimientoInventarioParameterReturnGeneral(); 
		
		this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDetalleMovimientoInventario(true);
			
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
			
			this.tipodetallemovimientoinventarioConstantesFunciones=new TipoDetalleMovimientoInventarioConstantesFunciones(); 
			this.tipodetallemovimientoinventarioBean=new TipoDetalleMovimientoInventario();//this.tipodetallemovimientoinventarioConstantesFunciones); 			
			this.tipodetallemovimientoinventarioReturnGeneral=new TipoDetalleMovimientoInventarioParameterReturnGeneral(); 
		
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodetallemovimientoinventario=new TipoDetalleMovimientoInventario();
			this.tipodetallemovimientoinventarios = new ArrayList<TipoDetalleMovimientoInventario>();
			this.tipodetallemovimientoinventariosAux = new ArrayList<TipoDetalleMovimientoInventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic=new TipoDetalleMovimientoInventarioLogic();
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario);	
					}
					
					if(this.jInternalFrameImportacionTipoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetalleMovimientoInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDetalleMovimientoInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario);
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario);
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetalleMovimientoInventario);
					this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetalleMovimientoInventario);
					this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDetalleMovimientoInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodetallemovimientoinventarioReturnGeneral=new TipoDetalleMovimientoInventarioParameterReturnGeneral();
			
			this.tipodetallemovimientoinventarioParameterGeneral=new TipoDetalleMovimientoInventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodetallemovimientoinventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDetalleMovimientoInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDetalleMovimientoInventario(false);
			
			this.setPermisosUsuarioTipoDetalleMovimientoInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDetalleMovimientoInventarioClasesRelacionadas();
			}
			
			if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDetalleMovimientoInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDetalleMovimientoInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDetalleMovimientoInventario();
			}
			
			if(!this.isPermisoBusquedaTipoDetalleMovimientoInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario,this.isPermisoPaginacionMedioTipoDetalleMovimientoInventario,this.isPermisoPaginacionTodoTipoDetalleMovimientoInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDetalleMovimientoInventarioConstantesFunciones.getTiposSeleccionarTipoDetalleMovimientoInventario());
				
				this.tiposColumnasSelect=TipoDetalleMovimientoInventarioConstantesFunciones.getTiposSeleccionarTipoDetalleMovimientoInventario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDetalleMovimientoInventario();				
				//this.tiposRelacionesSelect=TipoDetalleMovimientoInventarioConstantesFunciones.getTiposRelacionesTipoDetalleMovimientoInventario(true);
				
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
			//if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDetalleMovimientoInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoDetalleMovimientoInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoDetalleMovimientoInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleMovimientoInventario() ;
			
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
			
			
			this.detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic(); 
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
				tipodetallemovimientoinventarioImplementable= (TipoDetalleMovimientoInventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetalleMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodetallemovimientoinventarioImplementableHome= (TipoDetalleMovimientoInventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetalleMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodetallemovimientoinventarios= new ArrayList<TipoDetalleMovimientoInventario>();
			this.tipodetallemovimientoinventariosEliminados= new ArrayList<TipoDetalleMovimientoInventario>();
						
			this.isEsNuevoTipoDetalleMovimientoInventario=false;
			this.esParaAccionDesdeFormularioTipoDetalleMovimientoInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDetalleMovimientoInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDetalleMovimientoInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDetalleMovimientoInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDetalleMovimientoInventario();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDetalleMovimientoInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDetalleMovimientoInventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDetalleMovimientoInventario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDetalleMovimientoInventario")) {
				iIndex=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Movimiento Inventarios")) {
					if(!DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDetalleMovimientoInventario();

						this.cargarParteTabPanelRelacionadaDetalleMovimientoInventario(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDetalleMovimientoInventario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleMovimientoInventario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(false,true,iIndex);
		this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();

		//this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.updateUI();
		//this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleMovimientoInventario")) {
				int row=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
				jButtonDetalleMovimientoInventarioActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Movimiento Inventario")) {

					if(this.isTienePermisosDetalleMovimientoInventario && this.tipodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioTipoDetalleMovimientoInventario && !TipoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Movimiento Inventarios"+"("+DetalleMovimientoInventarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Movimiento Inventarios");

						if(tipodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioTipoDetalleMovimientoInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioTipoDetalleMovimientoInventario);
						}

						jmenuItem.setEnabled(this.tipodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioTipoDetalleMovimientoInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleMovimientoInventario"));

						

						this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jmenuDetalleTipoDetalleMovimientoInventario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDetalleMovimientoInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDetalleMovimientoInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDetalleMovimientoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDetalleMovimientoInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDetalleMovimientoInventario();
		
		this.cargarCombosFrameForeignKeyTipoDetalleMovimientoInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDetalleMovimientoInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDetalleMovimientoInventario();
		}
	}
	
	
	
	public void jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			
			if(jTableDatosTipoDetalleMovimientoInventario.getRowCount()>=1) {
				jTableDatosTipoDetalleMovimientoInventario.removeRowSelectionInterval(0, jTableDatosTipoDetalleMovimientoInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDetalleMovimientoInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDetalleMovimientoInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(true);			
			//this.tipodetallemovimientoinventario=new TipoDetalleMovimientoInventario();
			//this.tipodetallemovimientoinventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario() ;
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleMovimientoInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodetallemovimientoinventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);				
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDetalleMovimientoInventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRows().length;			
			}
			
			tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDetalleMovimientoInventario--;			
				//TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux= new TipoDetalleMovimientoInventario();			
				//tipodetallemovimientoinventarioAux.setId(this.iIdNuevoTipoDetalleMovimientoInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDetalleMovimientoInventario tipodetallemovimientoinventarioOrigen=new TipoDetalleMovimientoInventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioOrigen : tipodetallemovimientoinventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodetallemovimientoinventarioOrigen =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetallemovimientoinventarioOrigen =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDetalleMovimientoInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodetallemovimientoinventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioOrigen,this.tipodetallemovimientoinventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().add(this.tipodetallemovimientoinventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetallemovimientoinventarios.add(this.tipodetallemovimientoinventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
				
				this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleMovimientoInventario(), this.getIndiceNuevoTipoDetalleMovimientoInventario());
				
				int iLastRow =  this.jTableDatosTipoDetalleMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();									
		
			TipoDetalleMovimientoInventario tipodetallemovimientoinventarioOrigen=new TipoDetalleMovimientoInventario();
			TipoDetalleMovimientoInventario tipodetallemovimientoinventarioDestino=new TipoDetalleMovimientoInventario();
				
			tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodetallemovimientoinventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetallemovimientoinventarioOrigen =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetallemovimientoinventarioOrigen =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetallemovimientoinventarioDestino =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetallemovimientoinventarioDestino =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodetallemovimientoinventarioOrigen =tipodetallemovimientoinventariosSeleccionados.get(0);
				tipodetallemovimientoinventarioDestino =tipodetallemovimientoinventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioOrigen,tipodetallemovimientoinventarioDestino,true,false);
				
				tipodetallemovimientoinventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetallemovimientoinventarioDestino,tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetallemovimientoinventarioDestino,tipodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
				
				//this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleMovimientoInventario(), this.getIndiceNuevoTipoDetalleMovimientoInventario());
				
				int iLastRow =  this.jTableDatosTipoDetalleMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDetalleMovimientoInventario.isVisible();
			
			
			this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(!isVisible);
			this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(!isVisible);
			this.jPanelAccionesTipoDetalleMovimientoInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDetalleMovimientoInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDetalleMovimientoInventario();
			
			this.abrirFrameOrderByTipoDetalleMovimientoInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDetalleMovimientoInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetalleMovimientoInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSize(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.iWidthFormulario,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jContentPaneDetalleTipoDetalleMovimientoInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jContentPaneDetalleTipoDetalleMovimientoInventario.getWidth(),TipoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jContentPaneDetalleTipoDetalleMovimientoInventario.getWidth(),TipoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jContentPaneDetalleTipoDetalleMovimientoInventario.getWidth(),TipoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,false,this);
				} else {
					this.jInternalFrameOrderByTipoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleMovimientoInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetalleMovimientoInventario);
				this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setSelected(false);
				
				this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetalleMovimientoInventario"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDetalleMovimientoInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDetalleMovimientoInventario==null) {
				
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario=new ImportacionJInternalFrame(TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetalleMovimientoInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetalleMovimientoInventario);
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSelected(false);


				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetalleMovimientoInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario==null) {
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario=new ReporteDinamicoJInternalFrame(TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario);
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleMovimientoInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleMovimientoInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleMovimientoInventario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jContentPaneDetalleTipoDetalleMovimientoInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetalleMovimientoInventario);
			
	       	this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.dispose();
			//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameOrderByTipoDetalleMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDetalleMovimientoInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDetalleMovimientoInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDetalleMovimientoInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(true);
			//this.isEsNuevoTipoDetalleMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false) ;
			
			if(tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleMovimientoInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDetalleMovimientoInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDetalleMovimientoInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(true);
			//this.isEsNuevoTipoDetalleMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodetallemovimientoinventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false) ;
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleMovimientoInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDetalleMovimientoInventario(false);
			
			//if(!this.isEsNuevoTipoDetalleMovimientoInventario) {								
				int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				
			}
			
			if(this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDetalleMovimientoInventario=true;
					this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
					this.isEsNuevoTipoDetalleMovimientoInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDetalleMovimientoInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDetalleMovimientoInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(false);
			
												
				
				if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDetalleMovimientoInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodetallemovimientoinventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.tipodetallemovimientoinventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.tipodetallemovimientoinventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDetalleMovimientoInventarioModel) this.jTableDatosTipoDetalleMovimientoInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDetalleMovimientoInventario=true;
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
				this.isEsNuevoTipoDetalleMovimientoInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(false);
				
				
				
				if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDetalleMovimientoInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDetalleMovimientoInventario.getRowCount()>=1) {
				jTableDatosTipoDetalleMovimientoInventario.removeRowSelectionInterval(0, jTableDatosTipoDetalleMovimientoInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDetalleMovimientoInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(false) ;
			
			this.isEsNuevoTipoDetalleMovimientoInventario=false;
			
			if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDetalleMovimientoInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDetalleMovimientoInventario--;			
			//TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux= new TipoDetalleMovimientoInventario();			
			//tipodetallemovimientoinventarioAux.setId(this.iIdNuevoTipoDetalleMovimientoInventario);
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDetalleMovimientoInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
			
			this.tipodetallemovimientoinventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().add(this.tipodetallemovimientoinventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodetallemovimientoinventarios.add(this.tipodetallemovimientoinventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			
			this.jTableDatosTipoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleMovimientoInventario(), this.getIndiceNuevoTipoDetalleMovimientoInventario());
			
			int iLastRow =  this.jTableDatosTipoDetalleMovimientoInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();
			}
			
			//this.abrirFrameTreeTipoDetalleMovimientoInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CostoS ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDetalleMovimientoInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodetallemovimientoinventarioReturnGeneral=tipodetallemovimientoinventarioLogic.procesarImportacionTipoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodetallemovimientoinventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDetalleMovimientoInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setFileImportacion(this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDetalleMovimientoInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		

		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDetalleMovimientoInventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDetalleMovimientoInventarioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDetalleMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetallemovimientoinventario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventario:tipodetallemovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetallemovimientoinventario.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDetalleMovimientoInventario(row);				
			//	iRow++;
			//}				
			
			//for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetalleMovimientoInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDetalleMovimientoInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDetalleMovimientoInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDetalleMovimientoInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDetalleMovimientoInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDetalleMovimientoInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDetalleMovimientoInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDetalleMovimientoInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDetalleMovimientoInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDetalleMovimientoInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDetalleMovimientoInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDetalleMovimientoInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleMovimientoInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDetalleMovimientoInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDetalleMovimientoInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario();
		
		this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetalleMovimientoInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleMovimientoInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleMovimientoInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleMovimientoInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDetalleMovimientoInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleMovimientoInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleMovimientoInventario() throws Exception {
		try	{
			if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetalleMovimientoInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetalleMovimientoInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetalleMovimientoInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDetalleMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleMovimientoInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleMovimientoInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDetalleMovimientoInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {				
		if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetalleMovimientoInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDetalleMovimientoInventario() throws Exception {
		this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDetalleMovimientoInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDetalleMovimientoInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodetallemovimientoinventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDetalleMovimientoInventario.setModel(new TipoDetalleMovimientoInventarioModel(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDetalleMovimientoInventario.setModel(new TipoDetalleMovimientoInventarioModel(this.tipodetallemovimientoinventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario!=null && this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDetalleMovimientoInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,tipodetallemovimientoinventarioConstantesFunciones.resaltarSeleccionarTipoDetalleMovimientoInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,tipodetallemovimientoinventarioConstantesFunciones.resaltarSeleccionarTipoDetalleMovimientoInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID));

		if(this.tipodetallemovimientoinventarioConstantesFunciones.mostraridTipoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltaridTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activaridTipoDetalleMovimientoInventario,this,true,"idTipoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltaridTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activaridTipoDetalleMovimientoInventario,this,true,"idTipoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO));

		if(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarcodigoTipoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarcodigoTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activarcodigoTipoDetalleMovimientoInventario,this,true,"codigoTipoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarcodigoTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activarcodigoTipoDetalleMovimientoInventario,this,true,"codigoTipoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarnombreTipoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarnombreTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activarnombreTipoDetalleMovimientoInventario,this,true,"nombreTipoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarnombreTipoDetalleMovimientoInventario,this.tipodetallemovimientoinventarioConstantesFunciones.activarnombreTipoDetalleMovimientoInventario,this,true,"nombreTipoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetalleMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleMovimientoInventario && this.tipodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioTipoDetalleMovimientoInventario && !TipoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Movimiento Inventarios");
				tableColumn.setHeaderValue("Detalle Movimiento Inventarios");
				tableColumn.setCellRenderer(new DetalleMovimientoInventarioTableCell(tipodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioTipoDetalleMovimientoInventario,this,this.tipodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioTipoDetalleMovimientoInventario));
				tableColumn.setCellEditor(new DetalleMovimientoInventarioTableCell(tipodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioTipoDetalleMovimientoInventario,this,this.tipodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioTipoDetalleMovimientoInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDetalleMovimientoInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDetalleMovimientoInventario.moveColumn(this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDetalleMovimientoInventario.moveColumn(this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDetalleMovimientoInventario.moveColumn(this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDetalleMovimientoInventario.moveColumn(this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDetalleMovimientoInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDetalleMovimientoInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDetalleMovimientoInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDetalleMovimientoInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDetalleMovimientoInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDetalleMovimientoInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodetallemovimientoinventarios.size()-1;
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
		//this.jTableDatosTipoDetalleMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDetalleMovimientoInventario();
			
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
				
				//this.isEsNuevoTipoDetalleMovimientoInventario=false;
					
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
				if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetalleMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodetallemovimientoinventario.getsType().equals("DUPLICADO")
				   || this.tipodetallemovimientoinventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDetalleMovimientoInventario=true;
				
				} else {
					this.isEsNuevoTipoDetalleMovimientoInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodetallemovimientoinventario.getId()>=0 && !this.tipodetallemovimientoinventario.getIsNew()) {						
						this.isEsNuevoTipoDetalleMovimientoInventario=false;
						
					} else {
						this.isEsNuevoTipoDetalleMovimientoInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDetalleMovimientoInventario(esRelaciones);						
				
				this.seleccionarTipoDetalleMovimientoInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodetallemovimientoinventario.getId()<0) {
					this.isEsNuevoTipoDetalleMovimientoInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDetalleMovimientoInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDetalleMovimientoInventario(evt,rowIndex);
				}	
				
				if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDetalleMovimientoInventario: " + this.dDif); 
					}
				}								
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDetalleMovimientoInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
					if(this.tipodetallemovimientoinventario.getId()>0) {
						this.tipodetallemovimientoinventario.setIsDeleted(true);
						
						this.tipodetallemovimientoinventariosEliminados.add(this.tipodetallemovimientoinventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().remove(this.tipodetallemovimientoinventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetallemovimientoinventarios.remove(this.tipodetallemovimientoinventario);				
					}
					
					
					((TipoDetalleMovimientoInventarioModel) this.jTableDatosTipoDetalleMovimientoInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDetalleMovimientoInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDetalleMovimientoInventario) {
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetalleMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDetalleMovimientoInventario(tipodetallemovimientoinventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(tipodetallemovimientoinventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDetalleMovimientoInventario(tipodetallemovimientoinventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleMovimientoInventario(tipodetallemovimientoinventario);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodetallemovimientoinventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodetallemovimientoinventarioLocal=this.tipodetallemovimientoinventario;
			} else {
				tipodetallemovimientoinventarioLocal=this.tipodetallemovimientoinventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodetallemovimientoinventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioLocal,true);
					
					if(tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodetallemovimientoinventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodetallemovimientoinventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(tipodetallemovimientoinventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(tipodetallemovimientoinventario);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(tipodetallemovimientoinventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.getText()==null || this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.getText()=="" || this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setText("0");
			}

			if(conColumnasBase) {tipodetallemovimientoinventario.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelIdTipoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetallemovimientoinventario.setcodigo(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelcodigoTipoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetallemovimientoinventario.setnombre(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jLabelnombreTipoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioBean,TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioOrigen,TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetallemovimientoinventarioOrigen.getId()!=null && !tipodetallemovimientoinventarioOrigen.getId().equals(0L))) {tipodetallemovimientoinventario.setId(tipodetallemovimientoinventarioOrigen.getId());}}
			if(conDefault || (!conDefault && tipodetallemovimientoinventarioOrigen.getcodigo()!=null && !tipodetallemovimientoinventarioOrigen.getcodigo().equals(""))) {tipodetallemovimientoinventario.setcodigo(tipodetallemovimientoinventarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodetallemovimientoinventarioOrigen.getnombre()!=null && !tipodetallemovimientoinventarioOrigen.getnombre().equals(""))) {tipodetallemovimientoinventario.setnombre(tipodetallemovimientoinventarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventarioBean tipodetallemovimientoinventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventarioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventarioBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setText(tipodetallemovimientoinventarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventarioParameterReturnGeneral tipodetallemovimientoinventarioReturnGeneral,TipoDetalleMovimientoInventarioBean tipodetallemovimientoinventarioBean,Boolean conDefault) throws Exception { 
		try {
			TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal=new TipoDetalleMovimientoInventario();
			
			tipodetallemovimientoinventarioLocal=tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetallemovimientoinventarioLocal.getId()!=null && !tipodetallemovimientoinventarioLocal.getId().equals(0L))) {tipodetallemovimientoinventarioBean.setId(tipodetallemovimientoinventarioLocal.getId());}}
			if(conDefault || (!conDefault && tipodetallemovimientoinventarioLocal.getcodigo()!=null && !tipodetallemovimientoinventarioLocal.getcodigo().equals(""))) {tipodetallemovimientoinventarioBean.setcodigo(tipodetallemovimientoinventarioLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodetallemovimientoinventarioLocal.getnombre()!=null && !tipodetallemovimientoinventarioLocal.getnombre().equals(""))) {tipodetallemovimientoinventarioBean.setnombre(tipodetallemovimientoinventarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDetalleMovimientoInventarioGenerico(Long idTipoDetalleMovimientoInventarioSeleccionado,JComboBox jComboBoxTipoDetalleMovimientoInventario,List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosLocal)throws Exception {
		try {
			TipoDetalleMovimientoInventario  tipodetallemovimientoinventarioTemp=null;

			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosLocal) {
				if(tipodetallemovimientoinventarioAux.getId()!=null && tipodetallemovimientoinventarioAux.getId().equals(idTipoDetalleMovimientoInventarioSeleccionado)) {
					tipodetallemovimientoinventarioTemp=tipodetallemovimientoinventarioAux;
					break;
				}
			}

			jComboBoxTipoDetalleMovimientoInventario.setSelectedItem(tipodetallemovimientoinventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDetalleMovimientoInventarioGenerico(JComboBox jComboBoxTipoDetalleMovimientoInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetalleMovimientoInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDetalleMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetalleMovimientoInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDetalleMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleMovimientoInventario")) {
			jButtonDetalleMovimientoInventarioActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetallemovimientoinventario=(TipoDetalleMovimientoInventario) tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) tipodetallemovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDetalleMovimientoInventario tipodetallemovimientoinventarioRow=new TipoDetalleMovimientoInventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetallemovimientoinventarioRow=(TipoDetalleMovimientoInventario) tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetallemovimientoinventarioRow=(TipoDetalleMovimientoInventario) tipodetallemovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleMovimientoInventarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDetalleMovimientoInventario tipodetallemovimientoinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventario = (TipoDetalleMovimientoInventario)this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodetallemovimientoinventario = (TipoDetalleMovimientoInventario)this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodetallemovimientoinventario!=null) {
						this.tipodetallemovimientoinventario = tipodetallemovimientoinventario;
					} else {
						this.tipodetallemovimientoinventario = new TipoDetalleMovimientoInventario();
					}
				}

				if(this.isTienePermisosDetalleMovimientoInventario && this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
					DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup;
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame;
					}

					List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios=new ArrayList<TipoDetalleMovimientoInventario>();
					tipodetallemovimientoinventarios.add(this.tipodetallemovimientoinventario);
					if(!esRelacionado) {
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(tipodetallemovimientoinventarios,this.tipodetallemovimientoinventario,detallemovimientoinventarioBeanSwingJInternalFrame,/*conInicializar,*/detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getConGuardarRelaciones(),detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");

						detallemovimientoinventarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA + (DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA/2));

						detallemovimientoinventarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDetalleMovimientoInventario=(TitledBorder)this.jScrollPanelDatosTipoDetalleMovimientoInventario.getBorder();
						TitledBorder titledBorderDetalleMovimientoInventario=(TitledBorder)detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getBorder();

						titledBorderDetalleMovimientoInventario.setTitle(titledBorderTipoDetalleMovimientoInventario.getTitle() + " -> Detalle Movimiento Inventario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallemovimientoinventarioBeanSwingJInternalFrame);
						}

						detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallemovimientoinventarioBeanSwingJInternalFrame);

						detallemovimientoinventarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Movimiento Inventario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));			
			this.jButtonDuplicarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario && this.isPermisoDuplicarTipoDetalleMovimientoInventario));			
			this.jButtonCopiarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario && this.isPermisoCopiarTipoDetalleMovimientoInventario));
			this.jButtonVerFormTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario && this.isPermisoVerFormTipoDetalleMovimientoInventario));
			
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));			
			
			this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario && this.isPermisoEliminarTipoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario);							
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));						
			this.jButtonDuplicarToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario && this.isPermisoDuplicarTipoDetalleMovimientoInventario));						
			this.jButtonCopiarToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario && this.isPermisoCopiarTipoDetalleMovimientoInventario));			
			this.jButtonVerFormToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario && this.isPermisoVerFormTipoDetalleMovimientoInventario));			
			this.jButtonAbrirOrderByToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));
			this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));			
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario  && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario && this.isPermisoEliminarTipoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarToolBarTipoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario);				
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));			
			this.jMenuItemDuplicarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario && this.isPermisoDuplicarTipoDetalleMovimientoInventario));			
			this.jMenuItemCopiarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario && this.isPermisoCopiarTipoDetalleMovimientoInventario));			
			this.jMenuItemVerFormTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario && this.isPermisoVerFormTipoDetalleMovimientoInventario));			
			this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));			
			//this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));
			this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));			
			//this.jMenuItemDetalleMostrarOcultarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario && this.isPermisoOrdenTipoDetalleMovimientoInventario));			
			this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario));			
			this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario && this.isPermisoNuevoTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));									
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemModificarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemActualizarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario && this.isPermisoActualizarTipoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemEliminarTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario && this.isPermisoEliminarTipoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemCancelarTipoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario);				
			}
			
			this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));						
			this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=this.jButtonNuevoTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario=this.jButtonDuplicarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario=this.jButtonCopiarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario=this.jButtonVerFormTipoDetalleMovimientoInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDetalleMovimientoInventario=this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=this.jButtonModificarTipoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=this.jButtonNuevoToolBarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarToolBarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarToolBarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarToolBarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarToolBarTipoDetalleMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=this.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=this.jMenuItemNuevoTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemModificarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemActualizarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemEliminarTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemCancelarTipoDetalleMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDetalleMovimientoInventario(Boolean esInicializar) {
		if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetalleMovimientoInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDetalleMovimientoInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDetalleMovimientoInventario() {
		this.jButtonNuevoTipoDetalleMovimientoInventario.setVisible(this.isPermisoNuevoTipoDetalleMovimientoInventario);			
		this.jButtonDuplicarTipoDetalleMovimientoInventario.setVisible(this.isPermisoDuplicarTipoDetalleMovimientoInventario);			
		this.jButtonCopiarTipoDetalleMovimientoInventario.setVisible(this.isPermisoCopiarTipoDetalleMovimientoInventario);			
		this.jButtonVerFormTipoDetalleMovimientoInventario.setVisible(this.isPermisoVerFormTipoDetalleMovimientoInventario);			
		
		this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.setVisible(this.isPermisoOrdenTipoDetalleMovimientoInventario);					
		
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.setVisible(this.isPermisoNuevoTipoDetalleMovimientoInventario);			
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarTipoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarTipoDetalleMovimientoInventario);	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarTipoDetalleMovimientoInventario);	
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.setVisible(this.isPermisoEliminarTipoDetalleMovimientoInventario);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario);						
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.setVisible(this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarTipoDetalleMovimientoInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetalleMovimientoInventario() {
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarTipoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarTipoDetalleMovimientoInventario);	
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarTipoDetalleMovimientoInventario);	
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.setVisible(this.isPermisoEliminarTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario);							
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario && this.isPermisoGuardarCambiosTipoDetalleMovimientoInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDetalleMovimientoInventario() {
		if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDetalleMovimientoInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDetalleMovimientoInventario() {
	}
	
	public void jTableDatosTipoDetalleMovimientoInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDetalleMovimientoInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.gettipodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetallemovimientoinventario==null) {
						this.tipodetallemovimientoinventario = new TipoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				}

				if(this.tipodetallemovimientoinventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodetallemovimientoinventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.gettipodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetallemovimientoinventario==null) {
						this.tipodetallemovimientoinventario = new TipoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				}

				if(this.tipodetallemovimientoinventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodetallemovimientoinventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.gettipodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetallemovimientoinventario==null) {
						this.tipodetallemovimientoinventario = new TipoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);
				}

				if(this.tipodetallemovimientoinventario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodetallemovimientoinventario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoDetalleMovimientoInventario() {
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.dispose();
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.dispose();
			this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario=null;
		}
		
		if(this.jInternalFrameImportacionTipoDetalleMovimientoInventario!=null) {
			this.jInternalFrameImportacionTipoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDetalleMovimientoInventario.dispose();
			this.jInternalFrameImportacionTipoDetalleMovimientoInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDetalleMovimientoInventario();
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDetalleMovimientoInventario")) {
				jButtonDuplicarTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDetalleMovimientoInventario")) {
				jButtonCopiarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDetalleMovimientoInventario")) {
				jButtonVerFormTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDetalleMovimientoInventario")) {
				jButtonDuplicarTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDetalleMovimientoInventario")) {
				jButtonDuplicarTipoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDetalleMovimientoInventario")) {
				jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDetalleMovimientoInventario")) {
				jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDetalleMovimientoInventario")) {
				jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDetalleMovimientoInventario")) {
				jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDetalleMovimientoInventario")) {
				jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDetalleMovimientoInventario")) {
				jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDetalleMovimientoInventario")) {
				jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDetalleMovimientoInventario")) {
				jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDetalleMovimientoInventario")) {
				jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDetalleMovimientoInventario")) {
				jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDetalleMovimientoInventario")) {
				jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDetalleMovimientoInventario")) {
				jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDetalleMovimientoInventario")) {
				jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDetalleMovimientoInventario")) {
				jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDetalleMovimientoInventario")) {
				jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDetalleMovimientoInventario")) {
				jButtonMostrarOcultarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDetalleMovimientoInventario")) {
				jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDetalleMovimientoInventario")) {
				jButtonCopiarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDetalleMovimientoInventario")) {
				jButtonVerFormTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDetalleMovimientoInventario")) {
				jButtonCopiarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDetalleMovimientoInventario")) {
				jButtonVerFormTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDetalleMovimientoInventario")) {
				jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDetalleMovimientoInventario")) {
				jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDetalleMovimientoInventario")) {
				jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDetalleMovimientoInventario")) {
				jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDetalleMovimientoInventario")) {
				jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDetalleMovimientoInventario")) {
				jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDetalleMovimientoInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDetalleMovimientoInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDetalleMovimientoInventario")) {
				jButtonMostrarOcultarTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDetalleMovimientoInventario")) {
				jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDetalleMovimientoInventario")) {
				jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDetalleMovimientoInventario")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDetalleMovimientoInventario")) {
				jButtonCerrarImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDetalleMovimientoInventario")) {
				
				jButtonGenerarImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDetalleMovimientoInventario")) {
				
				jButtonAbrirImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDetalleMovimientoInventario")) {
				jComboBoxTiposAccionesTipoDetalleMovimientoInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDetalleMovimientoInventario")) {
				jComboBoxTiposRelacionesTipoDetalleMovimientoInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDetalleMovimientoInventario")) {
				jComboBoxTiposAccionesTipoDetalleMovimientoInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDetalleMovimientoInventario")) {
				
				jComboBoxTiposSeleccionarTipoDetalleMovimientoInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDetalleMovimientoInventario")) {
				jTextFieldValorCampoGeneralTipoDetalleMovimientoInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDetalleMovimientoInventario")) {
				jButtonCerrarOrderByTipoDetalleMovimientoInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonidTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtoncodigoTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonnombreTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDetalleMovimientoInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodetallemovimientoinventarioLocal=this.tipodetallemovimientoinventario;
			} else {
				tipodetallemovimientoinventarioLocal=this.tipodetallemovimientoinventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
							
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
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
			
			


			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
								
						
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
								
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
							
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
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
			
			


			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
								
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDetalleMovimientoInventario")) {
					jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDetalleMovimientoInventario")) {
					jCheckBoxSeleccionadosTipoDetalleMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDetalleMovimientoInventario")) {
					
				}
				
				


				
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
												
				
				


				
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
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
			
			


			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetallemovimientoinventario);
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
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
				
				


				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleMovimientoInventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetallemovimientoinventarioAnterior =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDetalleMovimientoInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDetalleMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodetallemovimientoinventario =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodetallemovimientoinventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDetalleMovimientoInventario")) {
				
				}
				
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDetalleMovimientoInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDetalleMovimientoInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDetalleMovimientoInventario")) {
			
			}
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDetalleMovimientoInventario();
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDetalleMovimientoInventario")) {
				jButtonDuplicarTipoDetalleMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDetalleMovimientoInventario")) {
				jButtonCopiarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDetalleMovimientoInventario")) {
				jButtonVerFormTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDetalleMovimientoInventario")) {
				jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDetalleMovimientoInventario")) {
				jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDetalleMovimientoInventario")) {
				jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDetalleMovimientoInventario")) {
				jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDetalleMovimientoInventario")) {
				jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDetalleMovimientoInventario")) {
				jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByTipoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDetalleMovimientoInventario")) {
				jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDetalleMovimientoInventario")) {
				jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonidTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtoncodigoTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonnombreTipoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDetalleMovimientoInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDetalleMovimientoInventario")) {
				closingInternalFrameTipoDetalleMovimientoInventario();
				
			} else if(sTipo.equals("jButtonCancelarTipoDetalleMovimientoInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDetalleMovimientoInventario = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDetalleMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(TipoDetalleMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetalleMovimientoInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(null);
			}
			
			TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetallemovimientoinventario,new Object(),this.tipodetallemovimientoinventarioParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDetalleMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDetalleMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDetalleMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
			if(!esControlTabla) {
				if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);			
				}
				
				if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetallemovimientoinventarioReturnGeneral=tipodetallemovimientoinventarioLogic.procesarEventosTipoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),this.tipodetallemovimientoinventario,this.tipodetallemovimientoinventarioParameterGeneral,this.isEsNuevoTipoDetalleMovimientoInventario,classes);//this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral,this.tipodetallemovimientoinventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetalleMovimientoInventario(classes,this.tipodetallemovimientoinventarioReturnGeneral,this.tipodetallemovimientoinventarioBean,false);
					}
						
					if(this.tipodetallemovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario());	
					}
						
					if(this.tipodetallemovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario(),classes);//this.tipodetallemovimientoinventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,classes);//this.tipodetallemovimientoinventarioBean);									
				}
			
				if(TipoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodetallemovimientoinventarioAnterior!=null) {
						this.tipodetallemovimientoinventario=this.tipodetallemovimientoinventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetallemovimientoinventarioReturnGeneral=tipodetallemovimientoinventarioLogic.procesarEventosTipoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios(),this.tipodetallemovimientoinventario,this.tipodetallemovimientoinventarioParameterGeneral,this.isEsNuevoTipoDetalleMovimientoInventario,classes);//this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario(),tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario(),this.tipodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDetalleMovimientoInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDetalleMovimientoInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDetalleMovimientoInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDetalleMovimientoInventario() throws Exception {
		
		TipoDetalleMovimientoInventarioModel tipodetallemovimientoinventarioModel=(TipoDetalleMovimientoInventarioModel)this.jTableDatosTipoDetalleMovimientoInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetallemovimientoinventarioModel.tipodetallemovimientoinventarios=this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodetallemovimientoinventarioModel.tipodetallemovimientoinventarios=this.tipodetallemovimientoinventarios;
		}
		
		
		((TipoDetalleMovimientoInventarioModel) this.jTableDatosTipoDetalleMovimientoInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDetalleMovimientoInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodetallemovimientoinventarioAnterior(),this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodetallemovimientoinventarioAnterior(),this.tipodetallemovimientoinventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDetalleMovimientoInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(tipodetallemovimientoinventario.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
										
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetallemovimientoinventario,new Object(),generalEntityParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfTipoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDetalleMovimientoInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDetalleMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetallemovimientoinventario,new Object(),generalEntityParameterGeneral,this.tipodetallemovimientoinventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventarioBean tipodetallemovimientoinventarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(tipodetallemovimientoinventario.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetalleMovimientoInventario(ArrayList<Classe> classes,TipoDetalleMovimientoInventarioReturnGeneral tipodetallemovimientoinventarioReturnGeneral,TipoDetalleMovimientoInventarioBean tipodetallemovimientoinventarioBean,Boolean conDefault) throws Exception {
		
			this.tipodetallemovimientoinventarioBean.setDetalleMovimientoInventarios(tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario().getDetalleMovimientoInventarios());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					tipodetallemovimientoinventario.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario = new TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setVisible(false);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.tipodetallemovimientoinventarioLogic=this.tipodetallemovimientoinventarioLogic;
		
		this.cargarCombosFrameForeignKeyTipoDetalleMovimientoInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetalleMovimientoInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetalleMovimientoInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDetalleMovimientoInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDetalleMovimientoInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetalleMovimientoInventario"));
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarTipoDetalleMovimientoInventario"));

		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetalleMovimientoInventario"));
					
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemModificarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetalleMovimientoInventario"));
						
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemActualizarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarTipoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetalleMovimientoInventario"));
								
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemEliminarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarTipoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetalleMovimientoInventario"));
					
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemCancelarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetalleMovimientoInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetalleMovimientoInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonidTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleMovimientoInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetalleMovimientoInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDetalleMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetalleMovimientoInventario"));
		}
		
		this.jTableDatosTipoDetalleMovimientoInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDetalleMovimientoInventario"));
		
		this.jTableDatosTipoDetalleMovimientoInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDetalleMovimientoInventario"));
		
		this.jButtonNuevoTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoTipoDetalleMovimientoInventario"));
		
		this.jButtonDuplicarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarTipoDetalleMovimientoInventario"));
		
		this.jButtonCopiarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"CopiarTipoDetalleMovimientoInventario"));
		
		this.jButtonVerFormTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"VerFormTipoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDetalleMovimientoInventario"));
			
		this.jButtonDuplicarToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDetalleMovimientoInventario"));
			
		this.jMenuItemDuplicarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDetalleMovimientoInventario"));		
		
		
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDetalleMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarTipoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonModificarToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetalleMovimientoInventario"));
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemModificarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonActualizarToolBarTipoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetalleMovimientoInventario"));
				
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemActualizarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarTipoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonEliminarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetalleMovimientoInventario"));
						
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemEliminarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarTipoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonCancelarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetalleMovimientoInventario"));
			
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemCancelarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetalleMovimientoInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDetalleMovimientoInventario"));		
		
		
		this.jButtonCerrarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarTipoDetalleMovimientoInventario"));
		
		
		this.jButtonCerrarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemCerrarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDetalleMovimientoInventario"));
			
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleMovimientoInventario"));
		}
		
		this.jButtonCopiarToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDetalleMovimientoInventario"));
			
		this.jButtonVerFormToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDetalleMovimientoInventario"));
		
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDetalleMovimientoInventario"));
			
		this.jMenuItemCopiarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDetalleMovimientoInventario"));		
		
		this.jMenuItemVerFormTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDetalleMovimientoInventario"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetalleMovimientoInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetalleMovimientoInventario"));		
		
		
		
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDetalleMovimientoInventario"));
					
		this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDetalleMovimientoInventario"));
		
		this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDetalleMovimientoInventario"));		
		
		
		
		this.jButtonAnterioresTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresTipoDetalleMovimientoInventario"));
		
		
		this.jButtonAnterioresToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDetalleMovimientoInventario"));
		
		this.jMenuItemAnterioresTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDetalleMovimientoInventario"));		
		
		
		this.jButtonSiguientesTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesTipoDetalleMovimientoInventario"));
		
		
		this.jButtonSiguientesToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemSiguientesTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDetalleMovimientoInventario"));
			
		this.jMenuItemAbrirOrderByTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDetalleMovimientoInventario"));
			
		this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario"));
			
		this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDetalleMovimientoInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDetalleMovimientoInventario"));

		this.jCheckBoxSeleccionadosTipoDetalleMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDetalleMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetalleMovimientoInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDetalleMovimientoInventario"));
			
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDetalleMovimientoInventario"));
					
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDetalleMovimientoInventario"));
			
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDetalleMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonidTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleMovimientoInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoTipoDetalleMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleMovimientoInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleMovimientoInventario"));				
			//this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleMovimientoInventario"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleMovimientoInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionTipoDetalleMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetalleMovimientoInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDetalleMovimientoInventario"));
			
			this.jButtonAbrirOrderByToolBarTipoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDetalleMovimientoInventario"));			
			
			if(this.jInternalFrameOrderByTipoDetalleMovimientoInventario!=null) {
				this.jInternalFrameOrderByTipoDetalleMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetalleMovimientoInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetalleMovimientoInventario"));
		
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
            		closingInternalFrameTipoDetalleMovimientoInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDetalleMovimientoInventario = (JInternalFrameBase)event.getSource();
	            	
	            TipoDetalleMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(TipoDetalleMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetalleMovimientoInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDetalleMovimientoInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDetalleMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDetalleMovimientoInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDetalleMovimientoInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetalleMovimientoInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonModificarTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonActualizarTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonEliminarTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCancelarTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDetalleMovimientoInventario";
		inputMap = this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonGuardarCambiosTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonidTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleMovimientoInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDetalleMovimientoInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDetalleMovimientoInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
					tipodetallemovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarios) {
					tipodetallemovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDetalleMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
						tipodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarios) {
						tipodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetalleMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetalleMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDetalleMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDetalleMovimientoInventario.getSelectedRows();
			
			TipoDetalleMovimientoInventario tipodetallemovimientoinventarioLocal=new TipoDetalleMovimientoInventario();
			
			//this.seleccionarTodosTipoDetalleMovimientoInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetallemovimientoinventarioLocal =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios().toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodetallemovimientoinventarioLocal =(TipoDetalleMovimientoInventario) this.tipodetallemovimientoinventarios.toArray()[this.jTableDatosTipoDetalleMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodetallemovimientoinventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
						tipodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarios) {
						tipodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetalleMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetalleMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDetalleMovimientoInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDetalleMovimientoInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDetalleMovimientoInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
				
						if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetallemovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetallemovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarios) {
					
						if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetallemovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetallemovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDetalleMovimientoInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDetalleMovimientoInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDetalleMovimientoInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDetalleMovimientoInventario(conSplash);
				
					this.generarReporteTipoDetalleMovimientoInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDetalleMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetalleMovimientoInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetalleMovimientoInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetalleMovimientoInventario();
				
				this.exportarTipoDetalleMovimientoInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDetalleMovimientoInventarios();
				//this.importarTipoDetalleMovimientoInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetalleMovimientoInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDetalleMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDetalleMovimientoInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDetalleMovimientoInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDetalleMovimientoInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDetalleMovimientoInventario();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDetalleMovimientoInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDetalleMovimientoInventario();
			
			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
			TipoDetalleMovimientoInventario tipodetallemovimientoinventario=new TipoDetalleMovimientoInventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario.getSelectedItem();
			
			
			
			
			tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodetallemovimientoinventariosSeleccionados.size()==1) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
					tipodetallemovimientoinventario=tipodetallemovimientoinventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Movimiento Inventario")) {
					jButtonDetalleMovimientoInventarioActionPerformed(null,rowIndex,true,false,tipodetallemovimientoinventario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDetalleMovimientoInventario();
			
      		//this.finishProcessTipoDetalleMovimientoInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDetalleMovimientoInventarioReturnGeneral() throws Exception {
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodetallemovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodetallemovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodetallemovimientoinventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
		}
		
		if(this.tipodetallemovimientoinventarioReturnGeneral.getConRetornoLista() || this.tipodetallemovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodetallemovimientoinventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventarios(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodetallemovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetallemovimientoinventarioLogic.setTipoDetalleMovimientoInventario(this.tipodetallemovimientoinventarioReturnGeneral.getTipoDetalleMovimientoInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDetalleMovimientoInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDetalleMovimientoInventario() throws Exception {
		
		
	}
	
	public ArrayList<TipoDetalleMovimientoInventario> getTipoDetalleMovimientoInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDetalleMovimientoInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios()) {
					if(tipodetallemovimientoinventarioAux.getIsSelected()) {
						tipodetallemovimientoinventariosSeleccionados.add(tipodetallemovimientoinventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:this.tipodetallemovimientoinventarios) {
					if(tipodetallemovimientoinventarioAux.getIsSelected()) {
						tipodetallemovimientoinventariosSeleccionados.add(tipodetallemovimientoinventarioAux);				
					}
				}
			}
			
			if(tipodetallemovimientoinventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodetallemovimientoinventariosSeleccionados.addAll(this.tipodetallemovimientoinventarioLogic.getTipoDetalleMovimientoInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodetallemovimientoinventariosSeleccionados.addAll(this.tipodetallemovimientoinventarios);				
					}
				}
			}
		} else {
			tipodetallemovimientoinventariosSeleccionados.add(this.tipodetallemovimientoinventario);
		}
		
		return tipodetallemovimientoinventariosSeleccionados;
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
	
	public void generarReporteTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetalleMovimientoInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetalleMovimientoInventariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDetalleMovimientoInventariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDetalleMovimientoInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDetalleMovimientoInventario();
		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDetalleMovimientoInventario();
		
		
		//this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados ,tipodetallemovimientoinventarioImplementable,tipodetallemovimientoinventarioImplementableHome);
	}
	
	public void mostrarImportacionTipoDetalleMovimientoInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDetalleMovimientoInventario();
		
		this.abrirFrameImportacionTipoDetalleMovimientoInventario();		
		
			
		//this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados ,tipodetallemovimientoinventarioImplementable,tipodetallemovimientoinventarioImplementableHome);
	}
	
	public void importarTipoDetalleMovimientoInventarios() throws Exception {		
	
	}
	
	public void exportarTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDetalleMovimientoInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDetalleMovimientoInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDetalleMovimientoInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodetallemovimientoinventarioAux.setsDetalleGeneralEntityReporte(tipodetallemovimientoinventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDetalleMovimientoInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodetallemovimientoinventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetallemovimientoinventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetallemovimientoinventario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetallemovimientoinventario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDetalleMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDetalleMovimientoInventario(row);				
				iRow++;
			}				
			
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();		
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetallemovimientoinventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodetallemovimientoinventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodetallemovimientoinventario");
			//elementRoot.appendChild(element);
		
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
				element = document.createElement("tipodetallemovimientoinventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDetalleMovimientoInventario(tipodetallemovimientoinventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDetalleMovimientoInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetallemovimientoinventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetallemovimientoinventario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetallemovimientoinventario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDetalleMovimientoInventario(TipoDetalleMovimientoInventario tipodetallemovimientoinventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDetalleMovimientoInventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodetallemovimientoinventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDetalleMovimientoInventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodetallemovimientoinventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoDetalleMovimientoInventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodetallemovimientoinventario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDetalleMovimientoInventarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodetallemovimientoinventario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDetalleMovimientoInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados=new ArrayList<TipoDetalleMovimientoInventario>();
		
		tipodetallemovimientoinventariosSeleccionados=this.getTipoDetalleMovimientoInventariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDetalleMovimientoInventario(tipodetallemovimientoinventariosSeleccionados);
		
		this.generarReporteTipoDetalleMovimientoInventarios("Todos",tipodetallemovimientoinventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDetalleMovimientoInventario(ArrayList<TipoDetalleMovimientoInventario> tipodetallemovimientoinventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDetalleMovimientoInventario tipodetallemovimientoinventarioAux:tipodetallemovimientoinventariosSeleccionados) {
				tipodetallemovimientoinventarioAux.setsDetalleGeneralEntityReporte(tipodetallemovimientoinventarioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodetallemovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(tipodetallemovimientoinventarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodetallemovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(tipodetallemovimientoinventarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDetalleMovimientoInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarTipoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleMovimientoInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=true;
		} else {
			this.actualizarEstadoPanelsTipoDetalleMovimientoInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDetalleMovimientoInventario=false;
			//this.isVisibilidadCeldaVerFormTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarTipoDetalleMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(!tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;												
			}
			
			this.jButtonCerrarTipoDetalleMovimientoInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleMovimientoInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodetallemovimientoinventario)) {
			this.isVisibilidadCeldaActualizarTipoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarTipoDetalleMovimientoInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetalleMovimientoInventario() {
		this.isVisibilidadCeldaNuevoTipoDetalleMovimientoInventario=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDetalleMovimientoInventario=false;
	}
	
	public void actualizarEstadoPanelsTipoDetalleMovimientoInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionTipoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesTipoDetalleMovimientoInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoDetalleMovimientoInventarioParaDetalleMovimientoInventarios() throws Exception {
		Boolean isPaginaPopupDetalleMovimientoInventario=false;

		try {

			if(this.tipodetallemovimientoinventarioSessionBean==null) {
				this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setsPathNavegacionActual(tipodetallemovimientoinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleMovimientoInventario=this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(true);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(TipoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionTipoDetalleMovimientoInventario(true);
			this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setlidTipoDetalleMovimientoInventarioActual(this.idTipoDetalleMovimientoInventarioActual);

			tipodetallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDetalleMovimientoInventario(true);
			tipodetallemovimientoinventarioSessionBean.setlIdTipoDetalleMovimientoInventarioActualForeignKey(this.idTipoDetalleMovimientoInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		
		if(this.tipodetallemovimientoinventarioSessionBean==null) {
			this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		}
		
		this.tipodetallemovimientoinventarioSessionBean.setsUltimaBusquedaTipoDetalleMovimientoInventario(this.getsAccionBusqueda());
		this.tipodetallemovimientoinventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodetallemovimientoinventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		
		if(this.tipodetallemovimientoinventarioSessionBean==null) {
			this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		}
		
		if(this.tipodetallemovimientoinventarioSessionBean.getsUltimaBusquedaTipoDetalleMovimientoInventario()!=null&&!this.tipodetallemovimientoinventarioSessionBean.getsUltimaBusquedaTipoDetalleMovimientoInventario().equals("")) {
			this.setsAccionBusqueda(tipodetallemovimientoinventarioSessionBean.getsUltimaBusquedaTipoDetalleMovimientoInventario());
			this.setiNumeroPaginacion(tipodetallemovimientoinventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodetallemovimientoinventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipodetallemovimientoinventarioSessionBean.setsUltimaBusquedaTipoDetalleMovimientoInventario("");
		this.tipodetallemovimientoinventarioSessionBean.setiNumeroPaginacion(TipoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION);
		this.tipodetallemovimientoinventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDetalleMovimientoInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDetalleMovimientoInventario() {
		this.updateBorderResaltarBusquedasFormularioTipoDetalleMovimientoInventario();
		this.updateVisibilidadBusquedasFormularioTipoDetalleMovimientoInventario();
		this.updateHabilitarBusquedasFormularioTipoDetalleMovimientoInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDetalleMovimientoInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDetalleMovimientoInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoDetalleMovimientoInventario() {
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
	
	public void updateControlesFormularioTipoDetalleMovimientoInventario() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDetalleMovimientoInventario();
		this.updateVisibilidadResaltarControlesFormularioTipoDetalleMovimientoInventario();
		this.updateHabilitarResaltarControlesFormularioTipoDetalleMovimientoInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDetalleMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodetallemovimientoinventarioConstantesFunciones.resaltaridTipoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setBorder(this.tipodetallemovimientoinventarioConstantesFunciones.resaltaridTipoDetalleMovimientoInventario);}
		if(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarcodigoTipoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setBorder(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarcodigoTipoDetalleMovimientoInventario);}
		if(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarnombreTipoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setBorder(this.tipodetallemovimientoinventarioConstantesFunciones.resaltarnombreTipoDetalleMovimientoInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDetalleMovimientoInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
	
		//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostraridTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelidTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostraridTipoDetalleMovimientoInventario);
		//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarcodigoTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelcodigoTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarcodigoTipoDetalleMovimientoInventario);
		//this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarnombreTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jPanelnombreTipoDetalleMovimientoInventario.setVisible(this.tipodetallemovimientoinventarioConstantesFunciones.mostrarnombreTipoDetalleMovimientoInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDetalleMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario!=null) {
	
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldidTipoDetalleMovimientoInventario.setEnabled(this.tipodetallemovimientoinventarioConstantesFunciones.activaridTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldcodigoTipoDetalleMovimientoInventario.setEnabled(this.tipodetallemovimientoinventarioConstantesFunciones.activarcodigoTipoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormTipoDetalleMovimientoInventario.jTextFieldnombreTipoDetalleMovimientoInventario.setEnabled(this.tipodetallemovimientoinventarioConstantesFunciones.activarnombreTipoDetalleMovimientoInventario);
		}
	}
	
		
}